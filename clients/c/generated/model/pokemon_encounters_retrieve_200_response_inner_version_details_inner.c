#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_encounters_retrieve_200_response_inner_version_details_inner.h"



static pokemon_encounters_retrieve_200_response_inner_version_details_inner_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_create_internal(
    list_t *encounter_details,
    double max_chance,
    pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_t *version
    ) {
    pokemon_encounters_retrieve_200_response_inner_version_details_inner_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_local_var = malloc(sizeof(pokemon_encounters_retrieve_200_response_inner_version_details_inner_t));
    if (!pokemon_encounters_retrieve_200_response_inner_version_details_inner_local_var) {
        return NULL;
    }
    pokemon_encounters_retrieve_200_response_inner_version_details_inner_local_var->encounter_details = encounter_details;
    pokemon_encounters_retrieve_200_response_inner_version_details_inner_local_var->max_chance = max_chance;
    pokemon_encounters_retrieve_200_response_inner_version_details_inner_local_var->version = version;

    pokemon_encounters_retrieve_200_response_inner_version_details_inner_local_var->_library_owned = 1;
    return pokemon_encounters_retrieve_200_response_inner_version_details_inner_local_var;
}

__attribute__((deprecated)) pokemon_encounters_retrieve_200_response_inner_version_details_inner_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_create(
    list_t *encounter_details,
    double max_chance,
    pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_t *version
    ) {
    return pokemon_encounters_retrieve_200_response_inner_version_details_inner_create_internal (
        encounter_details,
        max_chance,
        version
        );
}

void pokemon_encounters_retrieve_200_response_inner_version_details_inner_free(pokemon_encounters_retrieve_200_response_inner_version_details_inner_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner) {
    if(NULL == pokemon_encounters_retrieve_200_response_inner_version_details_inner){
        return ;
    }
    if(pokemon_encounters_retrieve_200_response_inner_version_details_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_encounters_retrieve_200_response_inner_version_details_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_encounters_retrieve_200_response_inner_version_details_inner->encounter_details) {
        list_ForEach(listEntry, pokemon_encounters_retrieve_200_response_inner_version_details_inner->encounter_details) {
            pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_free(listEntry->data);
        }
        list_freeList(pokemon_encounters_retrieve_200_response_inner_version_details_inner->encounter_details);
        pokemon_encounters_retrieve_200_response_inner_version_details_inner->encounter_details = NULL;
    }
    if (pokemon_encounters_retrieve_200_response_inner_version_details_inner->version) {
        pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_free(pokemon_encounters_retrieve_200_response_inner_version_details_inner->version);
        pokemon_encounters_retrieve_200_response_inner_version_details_inner->version = NULL;
    }
    free(pokemon_encounters_retrieve_200_response_inner_version_details_inner);
}

cJSON *pokemon_encounters_retrieve_200_response_inner_version_details_inner_convertToJSON(pokemon_encounters_retrieve_200_response_inner_version_details_inner_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_encounters_retrieve_200_response_inner_version_details_inner->encounter_details
    if (!pokemon_encounters_retrieve_200_response_inner_version_details_inner->encounter_details) {
        goto fail;
    }
    cJSON *encounter_details = cJSON_AddArrayToObject(item, "encounter_details");
    if(encounter_details == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *encounter_detailsListEntry;
    if (pokemon_encounters_retrieve_200_response_inner_version_details_inner->encounter_details) {
    list_ForEach(encounter_detailsListEntry, pokemon_encounters_retrieve_200_response_inner_version_details_inner->encounter_details) {
    cJSON *itemLocal = pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_convertToJSON(encounter_detailsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(encounter_details, itemLocal);
    }
    }


    // pokemon_encounters_retrieve_200_response_inner_version_details_inner->max_chance
    if (!pokemon_encounters_retrieve_200_response_inner_version_details_inner->max_chance) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "max_chance", pokemon_encounters_retrieve_200_response_inner_version_details_inner->max_chance) == NULL) {
    goto fail; //Numeric
    }


    // pokemon_encounters_retrieve_200_response_inner_version_details_inner->version
    if (!pokemon_encounters_retrieve_200_response_inner_version_details_inner->version) {
        goto fail;
    }
    cJSON *version_local_JSON = pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_convertToJSON(pokemon_encounters_retrieve_200_response_inner_version_details_inner->version);
    if(version_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "version", version_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_encounters_retrieve_200_response_inner_version_details_inner_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_parseFromJSON(cJSON *pokemon_encounters_retrieve_200_response_inner_version_details_innerJSON){

    pokemon_encounters_retrieve_200_response_inner_version_details_inner_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_local_var = NULL;

    // define the local list for pokemon_encounters_retrieve_200_response_inner_version_details_inner->encounter_details
    list_t *encounter_detailsList = NULL;

    // define the local variable for pokemon_encounters_retrieve_200_response_inner_version_details_inner->version
    pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_t *version_local_nonprim = NULL;

    // pokemon_encounters_retrieve_200_response_inner_version_details_inner->encounter_details
    cJSON *encounter_details = cJSON_GetObjectItemCaseSensitive(pokemon_encounters_retrieve_200_response_inner_version_details_innerJSON, "encounter_details");
    if (cJSON_IsNull(encounter_details)) {
        encounter_details = NULL;
    }
    if (!encounter_details) {
        goto end;
    }

    
    cJSON *encounter_details_local_nonprimitive = NULL;
    if(!cJSON_IsArray(encounter_details)){
        goto end; //nonprimitive container
    }

    encounter_detailsList = list_createList();

    cJSON_ArrayForEach(encounter_details_local_nonprimitive,encounter_details )
    {
        if(!cJSON_IsObject(encounter_details_local_nonprimitive)){
            goto end;
        }
        pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_t *encounter_detailsItem = pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_parseFromJSON(encounter_details_local_nonprimitive);

        list_addElement(encounter_detailsList, encounter_detailsItem);
    }

    // pokemon_encounters_retrieve_200_response_inner_version_details_inner->max_chance
    cJSON *max_chance = cJSON_GetObjectItemCaseSensitive(pokemon_encounters_retrieve_200_response_inner_version_details_innerJSON, "max_chance");
    if (cJSON_IsNull(max_chance)) {
        max_chance = NULL;
    }
    if (!max_chance) {
        goto end;
    }

    
    if(!cJSON_IsNumber(max_chance))
    {
    goto end; //Numeric
    }

    // pokemon_encounters_retrieve_200_response_inner_version_details_inner->version
    cJSON *version = cJSON_GetObjectItemCaseSensitive(pokemon_encounters_retrieve_200_response_inner_version_details_innerJSON, "version");
    if (cJSON_IsNull(version)) {
        version = NULL;
    }
    if (!version) {
        goto end;
    }

    
    version_local_nonprim = pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_parseFromJSON(version); //nonprimitive


    pokemon_encounters_retrieve_200_response_inner_version_details_inner_local_var = pokemon_encounters_retrieve_200_response_inner_version_details_inner_create_internal (
        encounter_detailsList,
        max_chance->valuedouble,
        version_local_nonprim
        );

    return pokemon_encounters_retrieve_200_response_inner_version_details_inner_local_var;
end:
    if (encounter_detailsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, encounter_detailsList) {
            pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(encounter_detailsList);
        encounter_detailsList = NULL;
    }
    if (version_local_nonprim) {
        pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_free(version_local_nonprim);
        version_local_nonprim = NULL;
    }
    return NULL;

}
