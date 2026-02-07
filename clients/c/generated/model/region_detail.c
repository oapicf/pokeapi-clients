#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "region_detail.h"



static region_detail_t *region_detail_create_internal(
    int id,
    char *name,
    list_t *locations,
    generation_summary_t *main_generation,
    list_t *names,
    list_t *pokedexes,
    list_t *version_groups
    ) {
    region_detail_t *region_detail_local_var = malloc(sizeof(region_detail_t));
    if (!region_detail_local_var) {
        return NULL;
    }
    region_detail_local_var->id = id;
    region_detail_local_var->name = name;
    region_detail_local_var->locations = locations;
    region_detail_local_var->main_generation = main_generation;
    region_detail_local_var->names = names;
    region_detail_local_var->pokedexes = pokedexes;
    region_detail_local_var->version_groups = version_groups;

    region_detail_local_var->_library_owned = 1;
    return region_detail_local_var;
}

__attribute__((deprecated)) region_detail_t *region_detail_create(
    int id,
    char *name,
    list_t *locations,
    generation_summary_t *main_generation,
    list_t *names,
    list_t *pokedexes,
    list_t *version_groups
    ) {
    return region_detail_create_internal (
        id,
        name,
        locations,
        main_generation,
        names,
        pokedexes,
        version_groups
        );
}

void region_detail_free(region_detail_t *region_detail) {
    if(NULL == region_detail){
        return ;
    }
    if(region_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "region_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (region_detail->name) {
        free(region_detail->name);
        region_detail->name = NULL;
    }
    if (region_detail->locations) {
        list_ForEach(listEntry, region_detail->locations) {
            location_summary_free(listEntry->data);
        }
        list_freeList(region_detail->locations);
        region_detail->locations = NULL;
    }
    if (region_detail->main_generation) {
        generation_summary_free(region_detail->main_generation);
        region_detail->main_generation = NULL;
    }
    if (region_detail->names) {
        list_ForEach(listEntry, region_detail->names) {
            region_name_free(listEntry->data);
        }
        list_freeList(region_detail->names);
        region_detail->names = NULL;
    }
    if (region_detail->pokedexes) {
        list_ForEach(listEntry, region_detail->pokedexes) {
            pokedex_summary_free(listEntry->data);
        }
        list_freeList(region_detail->pokedexes);
        region_detail->pokedexes = NULL;
    }
    if (region_detail->version_groups) {
        list_ForEach(listEntry, region_detail->version_groups) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
        }
        list_freeList(region_detail->version_groups);
        region_detail->version_groups = NULL;
    }
    free(region_detail);
}

cJSON *region_detail_convertToJSON(region_detail_t *region_detail) {
    cJSON *item = cJSON_CreateObject();

    // region_detail->id
    if (!region_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", region_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // region_detail->name
    if (!region_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", region_detail->name) == NULL) {
    goto fail; //String
    }


    // region_detail->locations
    if (!region_detail->locations) {
        goto fail;
    }
    cJSON *locations = cJSON_AddArrayToObject(item, "locations");
    if(locations == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *locationsListEntry;
    if (region_detail->locations) {
    list_ForEach(locationsListEntry, region_detail->locations) {
    cJSON *itemLocal = location_summary_convertToJSON(locationsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(locations, itemLocal);
    }
    }


    // region_detail->main_generation
    if (!region_detail->main_generation) {
        goto fail;
    }
    cJSON *main_generation_local_JSON = generation_summary_convertToJSON(region_detail->main_generation);
    if(main_generation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "main_generation", main_generation_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // region_detail->names
    if (!region_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (region_detail->names) {
    list_ForEach(namesListEntry, region_detail->names) {
    cJSON *itemLocal = region_name_convertToJSON(namesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(names, itemLocal);
    }
    }


    // region_detail->pokedexes
    if (!region_detail->pokedexes) {
        goto fail;
    }
    cJSON *pokedexes = cJSON_AddArrayToObject(item, "pokedexes");
    if(pokedexes == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *pokedexesListEntry;
    if (region_detail->pokedexes) {
    list_ForEach(pokedexesListEntry, region_detail->pokedexes) {
    cJSON *itemLocal = pokedex_summary_convertToJSON(pokedexesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(pokedexes, itemLocal);
    }
    }


    // region_detail->version_groups
    if (!region_detail->version_groups) {
        goto fail;
    }
    cJSON *version_groups = cJSON_AddArrayToObject(item, "version_groups");
    if(version_groups == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *version_groupsListEntry;
    if (region_detail->version_groups) {
    list_ForEach(version_groupsListEntry, region_detail->version_groups) {
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

region_detail_t *region_detail_parseFromJSON(cJSON *region_detailJSON){

    region_detail_t *region_detail_local_var = NULL;

    // define the local list for region_detail->locations
    list_t *locationsList = NULL;

    // define the local variable for region_detail->main_generation
    generation_summary_t *main_generation_local_nonprim = NULL;

    // define the local list for region_detail->names
    list_t *namesList = NULL;

    // define the local list for region_detail->pokedexes
    list_t *pokedexesList = NULL;

    // define the local list for region_detail->version_groups
    list_t *version_groupsList = NULL;

    // region_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(region_detailJSON, "id");
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

    // region_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(region_detailJSON, "name");
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

    // region_detail->locations
    cJSON *locations = cJSON_GetObjectItemCaseSensitive(region_detailJSON, "locations");
    if (cJSON_IsNull(locations)) {
        locations = NULL;
    }
    if (!locations) {
        goto end;
    }

    
    cJSON *locations_local_nonprimitive = NULL;
    if(!cJSON_IsArray(locations)){
        goto end; //nonprimitive container
    }

    locationsList = list_createList();

    cJSON_ArrayForEach(locations_local_nonprimitive,locations )
    {
        if(!cJSON_IsObject(locations_local_nonprimitive)){
            goto end;
        }
        location_summary_t *locationsItem = location_summary_parseFromJSON(locations_local_nonprimitive);

        list_addElement(locationsList, locationsItem);
    }

    // region_detail->main_generation
    cJSON *main_generation = cJSON_GetObjectItemCaseSensitive(region_detailJSON, "main_generation");
    if (cJSON_IsNull(main_generation)) {
        main_generation = NULL;
    }
    if (!main_generation) {
        goto end;
    }

    
    main_generation_local_nonprim = generation_summary_parseFromJSON(main_generation); //nonprimitive

    // region_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(region_detailJSON, "names");
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
        region_name_t *namesItem = region_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }

    // region_detail->pokedexes
    cJSON *pokedexes = cJSON_GetObjectItemCaseSensitive(region_detailJSON, "pokedexes");
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
        pokedex_summary_t *pokedexesItem = pokedex_summary_parseFromJSON(pokedexes_local_nonprimitive);

        list_addElement(pokedexesList, pokedexesItem);
    }

    // region_detail->version_groups
    cJSON *version_groups = cJSON_GetObjectItemCaseSensitive(region_detailJSON, "version_groups");
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


    region_detail_local_var = region_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        locationsList,
        main_generation_local_nonprim,
        namesList,
        pokedexesList,
        version_groupsList
        );

    return region_detail_local_var;
end:
    if (locationsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, locationsList) {
            location_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(locationsList);
        locationsList = NULL;
    }
    if (main_generation_local_nonprim) {
        generation_summary_free(main_generation_local_nonprim);
        main_generation_local_nonprim = NULL;
    }
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            region_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    if (pokedexesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, pokedexesList) {
            pokedex_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(pokedexesList);
        pokedexesList = NULL;
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
