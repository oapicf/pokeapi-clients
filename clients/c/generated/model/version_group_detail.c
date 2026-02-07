#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "version_group_detail.h"



static version_group_detail_t *version_group_detail_create_internal(
    int id,
    char *name,
    int order,
    generation_summary_t *generation,
    list_t *move_learn_methods,
    list_t *pokedexes,
    list_t *regions,
    list_t *versions
    ) {
    version_group_detail_t *version_group_detail_local_var = malloc(sizeof(version_group_detail_t));
    if (!version_group_detail_local_var) {
        return NULL;
    }
    version_group_detail_local_var->id = id;
    version_group_detail_local_var->name = name;
    version_group_detail_local_var->order = order;
    version_group_detail_local_var->generation = generation;
    version_group_detail_local_var->move_learn_methods = move_learn_methods;
    version_group_detail_local_var->pokedexes = pokedexes;
    version_group_detail_local_var->regions = regions;
    version_group_detail_local_var->versions = versions;

    version_group_detail_local_var->_library_owned = 1;
    return version_group_detail_local_var;
}

__attribute__((deprecated)) version_group_detail_t *version_group_detail_create(
    int id,
    char *name,
    int order,
    generation_summary_t *generation,
    list_t *move_learn_methods,
    list_t *pokedexes,
    list_t *regions,
    list_t *versions
    ) {
    return version_group_detail_create_internal (
        id,
        name,
        order,
        generation,
        move_learn_methods,
        pokedexes,
        regions,
        versions
        );
}

void version_group_detail_free(version_group_detail_t *version_group_detail) {
    if(NULL == version_group_detail){
        return ;
    }
    if(version_group_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "version_group_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (version_group_detail->name) {
        free(version_group_detail->name);
        version_group_detail->name = NULL;
    }
    if (version_group_detail->generation) {
        generation_summary_free(version_group_detail->generation);
        version_group_detail->generation = NULL;
    }
    if (version_group_detail->move_learn_methods) {
        list_ForEach(listEntry, version_group_detail->move_learn_methods) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
        }
        list_freeList(version_group_detail->move_learn_methods);
        version_group_detail->move_learn_methods = NULL;
    }
    if (version_group_detail->pokedexes) {
        list_ForEach(listEntry, version_group_detail->pokedexes) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
        }
        list_freeList(version_group_detail->pokedexes);
        version_group_detail->pokedexes = NULL;
    }
    if (version_group_detail->regions) {
        list_ForEach(listEntry, version_group_detail->regions) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
        }
        list_freeList(version_group_detail->regions);
        version_group_detail->regions = NULL;
    }
    if (version_group_detail->versions) {
        list_ForEach(listEntry, version_group_detail->versions) {
            version_summary_free(listEntry->data);
        }
        list_freeList(version_group_detail->versions);
        version_group_detail->versions = NULL;
    }
    free(version_group_detail);
}

cJSON *version_group_detail_convertToJSON(version_group_detail_t *version_group_detail) {
    cJSON *item = cJSON_CreateObject();

    // version_group_detail->id
    if (!version_group_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", version_group_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // version_group_detail->name
    if (!version_group_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", version_group_detail->name) == NULL) {
    goto fail; //String
    }


    // version_group_detail->order
    if(version_group_detail->order) {
    if(cJSON_AddNumberToObject(item, "order", version_group_detail->order) == NULL) {
    goto fail; //Numeric
    }
    }


    // version_group_detail->generation
    if (!version_group_detail->generation) {
        goto fail;
    }
    cJSON *generation_local_JSON = generation_summary_convertToJSON(version_group_detail->generation);
    if(generation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "generation", generation_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // version_group_detail->move_learn_methods
    if (!version_group_detail->move_learn_methods) {
        goto fail;
    }
    cJSON *move_learn_methods = cJSON_AddArrayToObject(item, "move_learn_methods");
    if(move_learn_methods == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *move_learn_methodsListEntry;
    if (version_group_detail->move_learn_methods) {
    list_ForEach(move_learn_methodsListEntry, version_group_detail->move_learn_methods) {
    cJSON *itemLocal = ability_detail_pokemon_inner_pokemon_convertToJSON(move_learn_methodsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(move_learn_methods, itemLocal);
    }
    }


    // version_group_detail->pokedexes
    if (!version_group_detail->pokedexes) {
        goto fail;
    }
    cJSON *pokedexes = cJSON_AddArrayToObject(item, "pokedexes");
    if(pokedexes == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *pokedexesListEntry;
    if (version_group_detail->pokedexes) {
    list_ForEach(pokedexesListEntry, version_group_detail->pokedexes) {
    cJSON *itemLocal = ability_detail_pokemon_inner_pokemon_convertToJSON(pokedexesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(pokedexes, itemLocal);
    }
    }


    // version_group_detail->regions
    if (!version_group_detail->regions) {
        goto fail;
    }
    cJSON *regions = cJSON_AddArrayToObject(item, "regions");
    if(regions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *regionsListEntry;
    if (version_group_detail->regions) {
    list_ForEach(regionsListEntry, version_group_detail->regions) {
    cJSON *itemLocal = ability_detail_pokemon_inner_pokemon_convertToJSON(regionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(regions, itemLocal);
    }
    }


    // version_group_detail->versions
    if (!version_group_detail->versions) {
        goto fail;
    }
    cJSON *versions = cJSON_AddArrayToObject(item, "versions");
    if(versions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *versionsListEntry;
    if (version_group_detail->versions) {
    list_ForEach(versionsListEntry, version_group_detail->versions) {
    cJSON *itemLocal = version_summary_convertToJSON(versionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(versions, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

version_group_detail_t *version_group_detail_parseFromJSON(cJSON *version_group_detailJSON){

    version_group_detail_t *version_group_detail_local_var = NULL;

    // define the local variable for version_group_detail->generation
    generation_summary_t *generation_local_nonprim = NULL;

    // define the local list for version_group_detail->move_learn_methods
    list_t *move_learn_methodsList = NULL;

    // define the local list for version_group_detail->pokedexes
    list_t *pokedexesList = NULL;

    // define the local list for version_group_detail->regions
    list_t *regionsList = NULL;

    // define the local list for version_group_detail->versions
    list_t *versionsList = NULL;

    // version_group_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(version_group_detailJSON, "id");
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

    // version_group_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(version_group_detailJSON, "name");
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

    // version_group_detail->order
    cJSON *order = cJSON_GetObjectItemCaseSensitive(version_group_detailJSON, "order");
    if (cJSON_IsNull(order)) {
        order = NULL;
    }
    if (order) { 
    if(!cJSON_IsNumber(order))
    {
    goto end; //Numeric
    }
    }

    // version_group_detail->generation
    cJSON *generation = cJSON_GetObjectItemCaseSensitive(version_group_detailJSON, "generation");
    if (cJSON_IsNull(generation)) {
        generation = NULL;
    }
    if (!generation) {
        goto end;
    }

    
    generation_local_nonprim = generation_summary_parseFromJSON(generation); //nonprimitive

    // version_group_detail->move_learn_methods
    cJSON *move_learn_methods = cJSON_GetObjectItemCaseSensitive(version_group_detailJSON, "move_learn_methods");
    if (cJSON_IsNull(move_learn_methods)) {
        move_learn_methods = NULL;
    }
    if (!move_learn_methods) {
        goto end;
    }

    
    cJSON *move_learn_methods_local_nonprimitive = NULL;
    if(!cJSON_IsArray(move_learn_methods)){
        goto end; //nonprimitive container
    }

    move_learn_methodsList = list_createList();

    cJSON_ArrayForEach(move_learn_methods_local_nonprimitive,move_learn_methods )
    {
        if(!cJSON_IsObject(move_learn_methods_local_nonprimitive)){
            goto end;
        }
        ability_detail_pokemon_inner_pokemon_t *move_learn_methodsItem = ability_detail_pokemon_inner_pokemon_parseFromJSON(move_learn_methods_local_nonprimitive);

        list_addElement(move_learn_methodsList, move_learn_methodsItem);
    }

    // version_group_detail->pokedexes
    cJSON *pokedexes = cJSON_GetObjectItemCaseSensitive(version_group_detailJSON, "pokedexes");
    if (cJSON_IsNull(pokedexes)) {
        pokedexes = NULL;
    }
    if (!pokedexes) {
        goto end;
    }

    
    cJSON *pokedexes_local_nonprimitive = NULL;
    if(!cJSON_IsArray(pokedexes)){
        goto end; //nonprimitive container
    }

    pokedexesList = list_createList();

    cJSON_ArrayForEach(pokedexes_local_nonprimitive,pokedexes )
    {
        if(!cJSON_IsObject(pokedexes_local_nonprimitive)){
            goto end;
        }
        ability_detail_pokemon_inner_pokemon_t *pokedexesItem = ability_detail_pokemon_inner_pokemon_parseFromJSON(pokedexes_local_nonprimitive);

        list_addElement(pokedexesList, pokedexesItem);
    }

    // version_group_detail->regions
    cJSON *regions = cJSON_GetObjectItemCaseSensitive(version_group_detailJSON, "regions");
    if (cJSON_IsNull(regions)) {
        regions = NULL;
    }
    if (!regions) {
        goto end;
    }

    
    cJSON *regions_local_nonprimitive = NULL;
    if(!cJSON_IsArray(regions)){
        goto end; //nonprimitive container
    }

    regionsList = list_createList();

    cJSON_ArrayForEach(regions_local_nonprimitive,regions )
    {
        if(!cJSON_IsObject(regions_local_nonprimitive)){
            goto end;
        }
        ability_detail_pokemon_inner_pokemon_t *regionsItem = ability_detail_pokemon_inner_pokemon_parseFromJSON(regions_local_nonprimitive);

        list_addElement(regionsList, regionsItem);
    }

    // version_group_detail->versions
    cJSON *versions = cJSON_GetObjectItemCaseSensitive(version_group_detailJSON, "versions");
    if (cJSON_IsNull(versions)) {
        versions = NULL;
    }
    if (!versions) {
        goto end;
    }

    
    cJSON *versions_local_nonprimitive = NULL;
    if(!cJSON_IsArray(versions)){
        goto end; //nonprimitive container
    }

    versionsList = list_createList();

    cJSON_ArrayForEach(versions_local_nonprimitive,versions )
    {
        if(!cJSON_IsObject(versions_local_nonprimitive)){
            goto end;
        }
        version_summary_t *versionsItem = version_summary_parseFromJSON(versions_local_nonprimitive);

        list_addElement(versionsList, versionsItem);
    }


    version_group_detail_local_var = version_group_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        order ? order->valuedouble : 0,
        generation_local_nonprim,
        move_learn_methodsList,
        pokedexesList,
        regionsList,
        versionsList
        );

    return version_group_detail_local_var;
end:
    if (generation_local_nonprim) {
        generation_summary_free(generation_local_nonprim);
        generation_local_nonprim = NULL;
    }
    if (move_learn_methodsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, move_learn_methodsList) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(move_learn_methodsList);
        move_learn_methodsList = NULL;
    }
    if (pokedexesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, pokedexesList) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(pokedexesList);
        pokedexesList = NULL;
    }
    if (regionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, regionsList) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(regionsList);
        regionsList = NULL;
    }
    if (versionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, versionsList) {
            version_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(versionsList);
        versionsList = NULL;
    }
    return NULL;

}
