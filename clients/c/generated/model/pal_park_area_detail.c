#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pal_park_area_detail.h"



static pal_park_area_detail_t *pal_park_area_detail_create_internal(
    int id,
    char *name,
    list_t *names,
    list_t *pokemon_encounters
    ) {
    pal_park_area_detail_t *pal_park_area_detail_local_var = malloc(sizeof(pal_park_area_detail_t));
    if (!pal_park_area_detail_local_var) {
        return NULL;
    }
    pal_park_area_detail_local_var->id = id;
    pal_park_area_detail_local_var->name = name;
    pal_park_area_detail_local_var->names = names;
    pal_park_area_detail_local_var->pokemon_encounters = pokemon_encounters;

    pal_park_area_detail_local_var->_library_owned = 1;
    return pal_park_area_detail_local_var;
}

__attribute__((deprecated)) pal_park_area_detail_t *pal_park_area_detail_create(
    int id,
    char *name,
    list_t *names,
    list_t *pokemon_encounters
    ) {
    return pal_park_area_detail_create_internal (
        id,
        name,
        names,
        pokemon_encounters
        );
}

void pal_park_area_detail_free(pal_park_area_detail_t *pal_park_area_detail) {
    if(NULL == pal_park_area_detail){
        return ;
    }
    if(pal_park_area_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pal_park_area_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pal_park_area_detail->name) {
        free(pal_park_area_detail->name);
        pal_park_area_detail->name = NULL;
    }
    if (pal_park_area_detail->names) {
        list_ForEach(listEntry, pal_park_area_detail->names) {
            pal_park_area_name_free(listEntry->data);
        }
        list_freeList(pal_park_area_detail->names);
        pal_park_area_detail->names = NULL;
    }
    if (pal_park_area_detail->pokemon_encounters) {
        list_ForEach(listEntry, pal_park_area_detail->pokemon_encounters) {
            pal_park_area_detail_pokemon_encounters_inner_free(listEntry->data);
        }
        list_freeList(pal_park_area_detail->pokemon_encounters);
        pal_park_area_detail->pokemon_encounters = NULL;
    }
    free(pal_park_area_detail);
}

cJSON *pal_park_area_detail_convertToJSON(pal_park_area_detail_t *pal_park_area_detail) {
    cJSON *item = cJSON_CreateObject();

    // pal_park_area_detail->id
    if (!pal_park_area_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", pal_park_area_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // pal_park_area_detail->name
    if (!pal_park_area_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", pal_park_area_detail->name) == NULL) {
    goto fail; //String
    }


    // pal_park_area_detail->names
    if (!pal_park_area_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (pal_park_area_detail->names) {
    list_ForEach(namesListEntry, pal_park_area_detail->names) {
    cJSON *itemLocal = pal_park_area_name_convertToJSON(namesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(names, itemLocal);
    }
    }


    // pal_park_area_detail->pokemon_encounters
    if (!pal_park_area_detail->pokemon_encounters) {
        goto fail;
    }
    cJSON *pokemon_encounters = cJSON_AddArrayToObject(item, "pokemon_encounters");
    if(pokemon_encounters == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *pokemon_encountersListEntry;
    if (pal_park_area_detail->pokemon_encounters) {
    list_ForEach(pokemon_encountersListEntry, pal_park_area_detail->pokemon_encounters) {
    cJSON *itemLocal = pal_park_area_detail_pokemon_encounters_inner_convertToJSON(pokemon_encountersListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(pokemon_encounters, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pal_park_area_detail_t *pal_park_area_detail_parseFromJSON(cJSON *pal_park_area_detailJSON){

    pal_park_area_detail_t *pal_park_area_detail_local_var = NULL;

    // define the local list for pal_park_area_detail->names
    list_t *namesList = NULL;

    // define the local list for pal_park_area_detail->pokemon_encounters
    list_t *pokemon_encountersList = NULL;

    // pal_park_area_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(pal_park_area_detailJSON, "id");
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

    // pal_park_area_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(pal_park_area_detailJSON, "name");
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

    // pal_park_area_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(pal_park_area_detailJSON, "names");
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
        pal_park_area_name_t *namesItem = pal_park_area_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }

    // pal_park_area_detail->pokemon_encounters
    cJSON *pokemon_encounters = cJSON_GetObjectItemCaseSensitive(pal_park_area_detailJSON, "pokemon_encounters");
    if (cJSON_IsNull(pokemon_encounters)) {
        pokemon_encounters = NULL;
    }
    if (!pokemon_encounters) {
        goto end;
    }

    
    cJSON *pokemon_encounters_local_nonprimitive = NULL;
    if(!cJSON_IsArray(pokemon_encounters)){
        goto end; //nonprimitive container
    }

    pokemon_encountersList = list_createList();

    cJSON_ArrayForEach(pokemon_encounters_local_nonprimitive,pokemon_encounters )
    {
        if(!cJSON_IsObject(pokemon_encounters_local_nonprimitive)){
            goto end;
        }
        pal_park_area_detail_pokemon_encounters_inner_t *pokemon_encountersItem = pal_park_area_detail_pokemon_encounters_inner_parseFromJSON(pokemon_encounters_local_nonprimitive);

        list_addElement(pokemon_encountersList, pokemon_encountersItem);
    }


    pal_park_area_detail_local_var = pal_park_area_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        namesList,
        pokemon_encountersList
        );

    return pal_park_area_detail_local_var;
end:
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            pal_park_area_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    if (pokemon_encountersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, pokemon_encountersList) {
            pal_park_area_detail_pokemon_encounters_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(pokemon_encountersList);
        pokemon_encountersList = NULL;
    }
    return NULL;

}
