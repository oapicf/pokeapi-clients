#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_color_detail.h"



static pokemon_color_detail_t *pokemon_color_detail_create_internal(
    int id,
    char *name,
    list_t *names,
    list_t *pokemon_species
    ) {
    pokemon_color_detail_t *pokemon_color_detail_local_var = malloc(sizeof(pokemon_color_detail_t));
    if (!pokemon_color_detail_local_var) {
        return NULL;
    }
    pokemon_color_detail_local_var->id = id;
    pokemon_color_detail_local_var->name = name;
    pokemon_color_detail_local_var->names = names;
    pokemon_color_detail_local_var->pokemon_species = pokemon_species;

    pokemon_color_detail_local_var->_library_owned = 1;
    return pokemon_color_detail_local_var;
}

__attribute__((deprecated)) pokemon_color_detail_t *pokemon_color_detail_create(
    int id,
    char *name,
    list_t *names,
    list_t *pokemon_species
    ) {
    return pokemon_color_detail_create_internal (
        id,
        name,
        names,
        pokemon_species
        );
}

void pokemon_color_detail_free(pokemon_color_detail_t *pokemon_color_detail) {
    if(NULL == pokemon_color_detail){
        return ;
    }
    if(pokemon_color_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_color_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_color_detail->name) {
        free(pokemon_color_detail->name);
        pokemon_color_detail->name = NULL;
    }
    if (pokemon_color_detail->names) {
        list_ForEach(listEntry, pokemon_color_detail->names) {
            pokemon_color_name_free(listEntry->data);
        }
        list_freeList(pokemon_color_detail->names);
        pokemon_color_detail->names = NULL;
    }
    if (pokemon_color_detail->pokemon_species) {
        list_ForEach(listEntry, pokemon_color_detail->pokemon_species) {
            pokemon_species_summary_free(listEntry->data);
        }
        list_freeList(pokemon_color_detail->pokemon_species);
        pokemon_color_detail->pokemon_species = NULL;
    }
    free(pokemon_color_detail);
}

cJSON *pokemon_color_detail_convertToJSON(pokemon_color_detail_t *pokemon_color_detail) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_color_detail->id
    if (!pokemon_color_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", pokemon_color_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // pokemon_color_detail->name
    if (!pokemon_color_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", pokemon_color_detail->name) == NULL) {
    goto fail; //String
    }


    // pokemon_color_detail->names
    if (!pokemon_color_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (pokemon_color_detail->names) {
    list_ForEach(namesListEntry, pokemon_color_detail->names) {
    cJSON *itemLocal = pokemon_color_name_convertToJSON(namesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(names, itemLocal);
    }
    }


    // pokemon_color_detail->pokemon_species
    if (!pokemon_color_detail->pokemon_species) {
        goto fail;
    }
    cJSON *pokemon_species = cJSON_AddArrayToObject(item, "pokemon_species");
    if(pokemon_species == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *pokemon_speciesListEntry;
    if (pokemon_color_detail->pokemon_species) {
    list_ForEach(pokemon_speciesListEntry, pokemon_color_detail->pokemon_species) {
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

pokemon_color_detail_t *pokemon_color_detail_parseFromJSON(cJSON *pokemon_color_detailJSON){

    pokemon_color_detail_t *pokemon_color_detail_local_var = NULL;

    // define the local list for pokemon_color_detail->names
    list_t *namesList = NULL;

    // define the local list for pokemon_color_detail->pokemon_species
    list_t *pokemon_speciesList = NULL;

    // pokemon_color_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(pokemon_color_detailJSON, "id");
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

    // pokemon_color_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(pokemon_color_detailJSON, "name");
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

    // pokemon_color_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(pokemon_color_detailJSON, "names");
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
        pokemon_color_name_t *namesItem = pokemon_color_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }

    // pokemon_color_detail->pokemon_species
    cJSON *pokemon_species = cJSON_GetObjectItemCaseSensitive(pokemon_color_detailJSON, "pokemon_species");
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


    pokemon_color_detail_local_var = pokemon_color_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        namesList,
        pokemon_speciesList
        );

    return pokemon_color_detail_local_var;
end:
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            pokemon_color_name_free(listEntry->data);
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
