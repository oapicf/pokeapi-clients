#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_habitat_detail.h"



static pokemon_habitat_detail_t *pokemon_habitat_detail_create_internal(
    int id,
    char *name,
    list_t *names,
    list_t *pokemon_species
    ) {
    pokemon_habitat_detail_t *pokemon_habitat_detail_local_var = malloc(sizeof(pokemon_habitat_detail_t));
    if (!pokemon_habitat_detail_local_var) {
        return NULL;
    }
    pokemon_habitat_detail_local_var->id = id;
    pokemon_habitat_detail_local_var->name = name;
    pokemon_habitat_detail_local_var->names = names;
    pokemon_habitat_detail_local_var->pokemon_species = pokemon_species;

    pokemon_habitat_detail_local_var->_library_owned = 1;
    return pokemon_habitat_detail_local_var;
}

__attribute__((deprecated)) pokemon_habitat_detail_t *pokemon_habitat_detail_create(
    int id,
    char *name,
    list_t *names,
    list_t *pokemon_species
    ) {
    return pokemon_habitat_detail_create_internal (
        id,
        name,
        names,
        pokemon_species
        );
}

void pokemon_habitat_detail_free(pokemon_habitat_detail_t *pokemon_habitat_detail) {
    if(NULL == pokemon_habitat_detail){
        return ;
    }
    if(pokemon_habitat_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_habitat_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_habitat_detail->name) {
        free(pokemon_habitat_detail->name);
        pokemon_habitat_detail->name = NULL;
    }
    if (pokemon_habitat_detail->names) {
        list_ForEach(listEntry, pokemon_habitat_detail->names) {
            pokemon_habitat_name_free(listEntry->data);
        }
        list_freeList(pokemon_habitat_detail->names);
        pokemon_habitat_detail->names = NULL;
    }
    if (pokemon_habitat_detail->pokemon_species) {
        list_ForEach(listEntry, pokemon_habitat_detail->pokemon_species) {
            pokemon_species_summary_free(listEntry->data);
        }
        list_freeList(pokemon_habitat_detail->pokemon_species);
        pokemon_habitat_detail->pokemon_species = NULL;
    }
    free(pokemon_habitat_detail);
}

cJSON *pokemon_habitat_detail_convertToJSON(pokemon_habitat_detail_t *pokemon_habitat_detail) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_habitat_detail->id
    if (!pokemon_habitat_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", pokemon_habitat_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // pokemon_habitat_detail->name
    if (!pokemon_habitat_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", pokemon_habitat_detail->name) == NULL) {
    goto fail; //String
    }


    // pokemon_habitat_detail->names
    if (!pokemon_habitat_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (pokemon_habitat_detail->names) {
    list_ForEach(namesListEntry, pokemon_habitat_detail->names) {
    cJSON *itemLocal = pokemon_habitat_name_convertToJSON(namesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(names, itemLocal);
    }
    }


    // pokemon_habitat_detail->pokemon_species
    if (!pokemon_habitat_detail->pokemon_species) {
        goto fail;
    }
    cJSON *pokemon_species = cJSON_AddArrayToObject(item, "pokemon_species");
    if(pokemon_species == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *pokemon_speciesListEntry;
    if (pokemon_habitat_detail->pokemon_species) {
    list_ForEach(pokemon_speciesListEntry, pokemon_habitat_detail->pokemon_species) {
    cJSON *itemLocal = pokemon_species_summary_convertToJSON(pokemon_speciesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(pokemon_species, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_habitat_detail_t *pokemon_habitat_detail_parseFromJSON(cJSON *pokemon_habitat_detailJSON){

    pokemon_habitat_detail_t *pokemon_habitat_detail_local_var = NULL;

    // define the local list for pokemon_habitat_detail->names
    list_t *namesList = NULL;

    // define the local list for pokemon_habitat_detail->pokemon_species
    list_t *pokemon_speciesList = NULL;

    // pokemon_habitat_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(pokemon_habitat_detailJSON, "id");
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

    // pokemon_habitat_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(pokemon_habitat_detailJSON, "name");
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

    // pokemon_habitat_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(pokemon_habitat_detailJSON, "names");
    if (cJSON_IsNull(names)) {
        names = NULL;
    }
    if (!names) {
        goto end;
    }

    
    cJSON *names_local_nonprimitive = NULL;
    if(!cJSON_IsArray(names)){
        goto end; //nonprimitive container
    }

    namesList = list_createList();

    cJSON_ArrayForEach(names_local_nonprimitive,names )
    {
        if(!cJSON_IsObject(names_local_nonprimitive)){
            goto end;
        }
        pokemon_habitat_name_t *namesItem = pokemon_habitat_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }

    // pokemon_habitat_detail->pokemon_species
    cJSON *pokemon_species = cJSON_GetObjectItemCaseSensitive(pokemon_habitat_detailJSON, "pokemon_species");
    if (cJSON_IsNull(pokemon_species)) {
        pokemon_species = NULL;
    }
    if (!pokemon_species) {
        goto end;
    }

    
    cJSON *pokemon_species_local_nonprimitive = NULL;
    if(!cJSON_IsArray(pokemon_species)){
        goto end; //nonprimitive container
    }

    pokemon_speciesList = list_createList();

    cJSON_ArrayForEach(pokemon_species_local_nonprimitive,pokemon_species )
    {
        if(!cJSON_IsObject(pokemon_species_local_nonprimitive)){
            goto end;
        }
        pokemon_species_summary_t *pokemon_speciesItem = pokemon_species_summary_parseFromJSON(pokemon_species_local_nonprimitive);

        list_addElement(pokemon_speciesList, pokemon_speciesItem);
    }


    pokemon_habitat_detail_local_var = pokemon_habitat_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        namesList,
        pokemon_speciesList
        );

    return pokemon_habitat_detail_local_var;
end:
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            pokemon_habitat_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    if (pokemon_speciesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, pokemon_speciesList) {
            pokemon_species_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(pokemon_speciesList);
        pokemon_speciesList = NULL;
    }
    return NULL;

}
