#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "gender_detail.h"



static gender_detail_t *gender_detail_create_internal(
    int id,
    char *name,
    list_t *pokemon_species_details,
    list_t *required_for_evolution
    ) {
    gender_detail_t *gender_detail_local_var = malloc(sizeof(gender_detail_t));
    if (!gender_detail_local_var) {
        return NULL;
    }
    gender_detail_local_var->id = id;
    gender_detail_local_var->name = name;
    gender_detail_local_var->pokemon_species_details = pokemon_species_details;
    gender_detail_local_var->required_for_evolution = required_for_evolution;

    gender_detail_local_var->_library_owned = 1;
    return gender_detail_local_var;
}

__attribute__((deprecated)) gender_detail_t *gender_detail_create(
    int id,
    char *name,
    list_t *pokemon_species_details,
    list_t *required_for_evolution
    ) {
    return gender_detail_create_internal (
        id,
        name,
        pokemon_species_details,
        required_for_evolution
        );
}

void gender_detail_free(gender_detail_t *gender_detail) {
    if(NULL == gender_detail){
        return ;
    }
    if(gender_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "gender_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (gender_detail->name) {
        free(gender_detail->name);
        gender_detail->name = NULL;
    }
    if (gender_detail->pokemon_species_details) {
        list_ForEach(listEntry, gender_detail->pokemon_species_details) {
            gender_detail_pokemon_species_details_inner_free(listEntry->data);
        }
        list_freeList(gender_detail->pokemon_species_details);
        gender_detail->pokemon_species_details = NULL;
    }
    if (gender_detail->required_for_evolution) {
        list_ForEach(listEntry, gender_detail->required_for_evolution) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
        }
        list_freeList(gender_detail->required_for_evolution);
        gender_detail->required_for_evolution = NULL;
    }
    free(gender_detail);
}

cJSON *gender_detail_convertToJSON(gender_detail_t *gender_detail) {
    cJSON *item = cJSON_CreateObject();

    // gender_detail->id
    if (!gender_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", gender_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // gender_detail->name
    if (!gender_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", gender_detail->name) == NULL) {
    goto fail; //String
    }


    // gender_detail->pokemon_species_details
    if (!gender_detail->pokemon_species_details) {
        goto fail;
    }
    cJSON *pokemon_species_details = cJSON_AddArrayToObject(item, "pokemon_species_details");
    if(pokemon_species_details == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *pokemon_species_detailsListEntry;
    if (gender_detail->pokemon_species_details) {
    list_ForEach(pokemon_species_detailsListEntry, gender_detail->pokemon_species_details) {
    cJSON *itemLocal = gender_detail_pokemon_species_details_inner_convertToJSON(pokemon_species_detailsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(pokemon_species_details, itemLocal);
    }
    }


    // gender_detail->required_for_evolution
    if (!gender_detail->required_for_evolution) {
        goto fail;
    }
    cJSON *required_for_evolution = cJSON_AddArrayToObject(item, "required_for_evolution");
    if(required_for_evolution == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *required_for_evolutionListEntry;
    if (gender_detail->required_for_evolution) {
    list_ForEach(required_for_evolutionListEntry, gender_detail->required_for_evolution) {
    cJSON *itemLocal = ability_detail_pokemon_inner_pokemon_convertToJSON(required_for_evolutionListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(required_for_evolution, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

gender_detail_t *gender_detail_parseFromJSON(cJSON *gender_detailJSON){

    gender_detail_t *gender_detail_local_var = NULL;

    // define the local list for gender_detail->pokemon_species_details
    list_t *pokemon_species_detailsList = NULL;

    // define the local list for gender_detail->required_for_evolution
    list_t *required_for_evolutionList = NULL;

    // gender_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(gender_detailJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // gender_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(gender_detailJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // gender_detail->pokemon_species_details
    cJSON *pokemon_species_details = cJSON_GetObjectItemCaseSensitive(gender_detailJSON, "pokemon_species_details");
    if (cJSON_IsNull(pokemon_species_details)) {
        pokemon_species_details = NULL;
    }
    if (!pokemon_species_details) {
        goto end;
    }

    
    cJSON *pokemon_species_details_local_nonprimitive = NULL;
    if(!cJSON_IsArray(pokemon_species_details)){
        goto end; //nonprimitive container
    }

    pokemon_species_detailsList = list_createList();

    cJSON_ArrayForEach(pokemon_species_details_local_nonprimitive,pokemon_species_details )
    {
        if(!cJSON_IsObject(pokemon_species_details_local_nonprimitive)){
            goto end;
        }
        gender_detail_pokemon_species_details_inner_t *pokemon_species_detailsItem = gender_detail_pokemon_species_details_inner_parseFromJSON(pokemon_species_details_local_nonprimitive);

        list_addElement(pokemon_species_detailsList, pokemon_species_detailsItem);
    }

    // gender_detail->required_for_evolution
    cJSON *required_for_evolution = cJSON_GetObjectItemCaseSensitive(gender_detailJSON, "required_for_evolution");
    if (cJSON_IsNull(required_for_evolution)) {
        required_for_evolution = NULL;
    }
    if (!required_for_evolution) {
        goto end;
    }

    
    cJSON *required_for_evolution_local_nonprimitive = NULL;
    if(!cJSON_IsArray(required_for_evolution)){
        goto end; //nonprimitive container
    }

    required_for_evolutionList = list_createList();

    cJSON_ArrayForEach(required_for_evolution_local_nonprimitive,required_for_evolution )
    {
        if(!cJSON_IsObject(required_for_evolution_local_nonprimitive)){
            goto end;
        }
        ability_detail_pokemon_inner_pokemon_t *required_for_evolutionItem = ability_detail_pokemon_inner_pokemon_parseFromJSON(required_for_evolution_local_nonprimitive);

        list_addElement(required_for_evolutionList, required_for_evolutionItem);
    }


    gender_detail_local_var = gender_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        pokemon_species_detailsList,
        required_for_evolutionList
        );

    return gender_detail_local_var;
end:
    if (pokemon_species_detailsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, pokemon_species_detailsList) {
            gender_detail_pokemon_species_details_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(pokemon_species_detailsList);
        pokemon_species_detailsList = NULL;
    }
    if (required_for_evolutionList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, required_for_evolutionList) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(required_for_evolutionList);
        required_for_evolutionList = NULL;
    }
    return NULL;

}
