#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokedex_detail.h"



static pokedex_detail_t *pokedex_detail_create_internal(
    int id,
    char *name,
    int is_main_series,
    list_t *descriptions,
    list_t *names,
    list_t *pokemon_entries,
    region_summary_t *region,
    list_t *version_groups
    ) {
    pokedex_detail_t *pokedex_detail_local_var = malloc(sizeof(pokedex_detail_t));
    if (!pokedex_detail_local_var) {
        return NULL;
    }
    pokedex_detail_local_var->id = id;
    pokedex_detail_local_var->name = name;
    pokedex_detail_local_var->is_main_series = is_main_series;
    pokedex_detail_local_var->descriptions = descriptions;
    pokedex_detail_local_var->names = names;
    pokedex_detail_local_var->pokemon_entries = pokemon_entries;
    pokedex_detail_local_var->region = region;
    pokedex_detail_local_var->version_groups = version_groups;

    pokedex_detail_local_var->_library_owned = 1;
    return pokedex_detail_local_var;
}

__attribute__((deprecated)) pokedex_detail_t *pokedex_detail_create(
    int id,
    char *name,
    int is_main_series,
    list_t *descriptions,
    list_t *names,
    list_t *pokemon_entries,
    region_summary_t *region,
    list_t *version_groups
    ) {
    return pokedex_detail_create_internal (
        id,
        name,
        is_main_series,
        descriptions,
        names,
        pokemon_entries,
        region,
        version_groups
        );
}

void pokedex_detail_free(pokedex_detail_t *pokedex_detail) {
    if(NULL == pokedex_detail){
        return ;
    }
    if(pokedex_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokedex_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokedex_detail->name) {
        free(pokedex_detail->name);
        pokedex_detail->name = NULL;
    }
    if (pokedex_detail->descriptions) {
        list_ForEach(listEntry, pokedex_detail->descriptions) {
            pokedex_description_free(listEntry->data);
        }
        list_freeList(pokedex_detail->descriptions);
        pokedex_detail->descriptions = NULL;
    }
    if (pokedex_detail->names) {
        list_ForEach(listEntry, pokedex_detail->names) {
            pokedex_name_free(listEntry->data);
        }
        list_freeList(pokedex_detail->names);
        pokedex_detail->names = NULL;
    }
    if (pokedex_detail->pokemon_entries) {
        list_ForEach(listEntry, pokedex_detail->pokemon_entries) {
            pokedex_detail_pokemon_entries_inner_free(listEntry->data);
        }
        list_freeList(pokedex_detail->pokemon_entries);
        pokedex_detail->pokemon_entries = NULL;
    }
    if (pokedex_detail->region) {
        region_summary_free(pokedex_detail->region);
        pokedex_detail->region = NULL;
    }
    if (pokedex_detail->version_groups) {
        list_ForEach(listEntry, pokedex_detail->version_groups) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
        }
        list_freeList(pokedex_detail->version_groups);
        pokedex_detail->version_groups = NULL;
    }
    free(pokedex_detail);
}

cJSON *pokedex_detail_convertToJSON(pokedex_detail_t *pokedex_detail) {
    cJSON *item = cJSON_CreateObject();

    // pokedex_detail->id
    if (!pokedex_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", pokedex_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // pokedex_detail->name
    if (!pokedex_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", pokedex_detail->name) == NULL) {
    goto fail; //String
    }


    // pokedex_detail->is_main_series
    if(pokedex_detail->is_main_series) {
    if(cJSON_AddBoolToObject(item, "is_main_series", pokedex_detail->is_main_series) == NULL) {
    goto fail; //Bool
    }
    }


    // pokedex_detail->descriptions
    if (!pokedex_detail->descriptions) {
        goto fail;
    }
    cJSON *descriptions = cJSON_AddArrayToObject(item, "descriptions");
    if(descriptions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *descriptionsListEntry;
    if (pokedex_detail->descriptions) {
    list_ForEach(descriptionsListEntry, pokedex_detail->descriptions) {
    cJSON *itemLocal = pokedex_description_convertToJSON(descriptionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(descriptions, itemLocal);
    }
    }


    // pokedex_detail->names
    if (!pokedex_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (pokedex_detail->names) {
    list_ForEach(namesListEntry, pokedex_detail->names) {
    cJSON *itemLocal = pokedex_name_convertToJSON(namesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(names, itemLocal);
    }
    }


    // pokedex_detail->pokemon_entries
    if (!pokedex_detail->pokemon_entries) {
        goto fail;
    }
    cJSON *pokemon_entries = cJSON_AddArrayToObject(item, "pokemon_entries");
    if(pokemon_entries == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *pokemon_entriesListEntry;
    if (pokedex_detail->pokemon_entries) {
    list_ForEach(pokemon_entriesListEntry, pokedex_detail->pokemon_entries) {
    cJSON *itemLocal = pokedex_detail_pokemon_entries_inner_convertToJSON(pokemon_entriesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(pokemon_entries, itemLocal);
    }
    }


    // pokedex_detail->region
    if (!pokedex_detail->region) {
        goto fail;
    }
    cJSON *region_local_JSON = region_summary_convertToJSON(pokedex_detail->region);
    if(region_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "region", region_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokedex_detail->version_groups
    if (!pokedex_detail->version_groups) {
        goto fail;
    }
    cJSON *version_groups = cJSON_AddArrayToObject(item, "version_groups");
    if(version_groups == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *version_groupsListEntry;
    if (pokedex_detail->version_groups) {
    list_ForEach(version_groupsListEntry, pokedex_detail->version_groups) {
    cJSON *itemLocal = ability_detail_pokemon_inner_pokemon_convertToJSON(version_groupsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(version_groups, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokedex_detail_t *pokedex_detail_parseFromJSON(cJSON *pokedex_detailJSON){

    pokedex_detail_t *pokedex_detail_local_var = NULL;

    // define the local list for pokedex_detail->descriptions
    list_t *descriptionsList = NULL;

    // define the local list for pokedex_detail->names
    list_t *namesList = NULL;

    // define the local list for pokedex_detail->pokemon_entries
    list_t *pokemon_entriesList = NULL;

    // define the local variable for pokedex_detail->region
    region_summary_t *region_local_nonprim = NULL;

    // define the local list for pokedex_detail->version_groups
    list_t *version_groupsList = NULL;

    // pokedex_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(pokedex_detailJSON, "id");
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

    // pokedex_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(pokedex_detailJSON, "name");
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

    // pokedex_detail->is_main_series
    cJSON *is_main_series = cJSON_GetObjectItemCaseSensitive(pokedex_detailJSON, "is_main_series");
    if (cJSON_IsNull(is_main_series)) {
        is_main_series = NULL;
    }
    if (is_main_series) { 
    if(!cJSON_IsBool(is_main_series))
    {
    goto end; //Bool
    }
    }

    // pokedex_detail->descriptions
    cJSON *descriptions = cJSON_GetObjectItemCaseSensitive(pokedex_detailJSON, "descriptions");
    if (cJSON_IsNull(descriptions)) {
        descriptions = NULL;
    }
    if (!descriptions) {
        goto end;
    }

    
    cJSON *descriptions_local_nonprimitive = NULL;
    if(!cJSON_IsArray(descriptions)){
        goto end; //nonprimitive container
    }

    descriptionsList = list_createList();

    cJSON_ArrayForEach(descriptions_local_nonprimitive,descriptions )
    {
        if(!cJSON_IsObject(descriptions_local_nonprimitive)){
            goto end;
        }
        pokedex_description_t *descriptionsItem = pokedex_description_parseFromJSON(descriptions_local_nonprimitive);

        list_addElement(descriptionsList, descriptionsItem);
    }

    // pokedex_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(pokedex_detailJSON, "names");
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
        pokedex_name_t *namesItem = pokedex_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }

    // pokedex_detail->pokemon_entries
    cJSON *pokemon_entries = cJSON_GetObjectItemCaseSensitive(pokedex_detailJSON, "pokemon_entries");
    if (cJSON_IsNull(pokemon_entries)) {
        pokemon_entries = NULL;
    }
    if (!pokemon_entries) {
        goto end;
    }

    
    cJSON *pokemon_entries_local_nonprimitive = NULL;
    if(!cJSON_IsArray(pokemon_entries)){
        goto end; //nonprimitive container
    }

    pokemon_entriesList = list_createList();

    cJSON_ArrayForEach(pokemon_entries_local_nonprimitive,pokemon_entries )
    {
        if(!cJSON_IsObject(pokemon_entries_local_nonprimitive)){
            goto end;
        }
        pokedex_detail_pokemon_entries_inner_t *pokemon_entriesItem = pokedex_detail_pokemon_entries_inner_parseFromJSON(pokemon_entries_local_nonprimitive);

        list_addElement(pokemon_entriesList, pokemon_entriesItem);
    }

    // pokedex_detail->region
    cJSON *region = cJSON_GetObjectItemCaseSensitive(pokedex_detailJSON, "region");
    if (cJSON_IsNull(region)) {
        region = NULL;
    }
    if (!region) {
        goto end;
    }

    
    region_local_nonprim = region_summary_parseFromJSON(region); //nonprimitive

    // pokedex_detail->version_groups
    cJSON *version_groups = cJSON_GetObjectItemCaseSensitive(pokedex_detailJSON, "version_groups");
    if (cJSON_IsNull(version_groups)) {
        version_groups = NULL;
    }
    if (!version_groups) {
        goto end;
    }

    
    cJSON *version_groups_local_nonprimitive = NULL;
    if(!cJSON_IsArray(version_groups)){
        goto end; //nonprimitive container
    }

    version_groupsList = list_createList();

    cJSON_ArrayForEach(version_groups_local_nonprimitive,version_groups )
    {
        if(!cJSON_IsObject(version_groups_local_nonprimitive)){
            goto end;
        }
        ability_detail_pokemon_inner_pokemon_t *version_groupsItem = ability_detail_pokemon_inner_pokemon_parseFromJSON(version_groups_local_nonprimitive);

        list_addElement(version_groupsList, version_groupsItem);
    }


    pokedex_detail_local_var = pokedex_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        is_main_series ? is_main_series->valueint : 0,
        descriptionsList,
        namesList,
        pokemon_entriesList,
        region_local_nonprim,
        version_groupsList
        );

    return pokedex_detail_local_var;
end:
    if (descriptionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, descriptionsList) {
            pokedex_description_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(descriptionsList);
        descriptionsList = NULL;
    }
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            pokedex_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    if (pokemon_entriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, pokemon_entriesList) {
            pokedex_detail_pokemon_entries_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(pokemon_entriesList);
        pokemon_entriesList = NULL;
    }
    if (region_local_nonprim) {
        region_summary_free(region_local_nonprim);
        region_local_nonprim = NULL;
    }
    if (version_groupsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, version_groupsList) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(version_groupsList);
        version_groupsList = NULL;
    }
    return NULL;

}
