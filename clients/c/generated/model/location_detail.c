#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "location_detail.h"



static location_detail_t *location_detail_create_internal(
    int id,
    char *name,
    region_summary_t *region,
    list_t *names,
    list_t *game_indices,
    list_t *areas
    ) {
    location_detail_t *location_detail_local_var = malloc(sizeof(location_detail_t));
    if (!location_detail_local_var) {
        return NULL;
    }
    location_detail_local_var->id = id;
    location_detail_local_var->name = name;
    location_detail_local_var->region = region;
    location_detail_local_var->names = names;
    location_detail_local_var->game_indices = game_indices;
    location_detail_local_var->areas = areas;

    location_detail_local_var->_library_owned = 1;
    return location_detail_local_var;
}

__attribute__((deprecated)) location_detail_t *location_detail_create(
    int id,
    char *name,
    region_summary_t *region,
    list_t *names,
    list_t *game_indices,
    list_t *areas
    ) {
    return location_detail_create_internal (
        id,
        name,
        region,
        names,
        game_indices,
        areas
        );
}

void location_detail_free(location_detail_t *location_detail) {
    if(NULL == location_detail){
        return ;
    }
    if(location_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "location_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (location_detail->name) {
        free(location_detail->name);
        location_detail->name = NULL;
    }
    if (location_detail->region) {
        region_summary_free(location_detail->region);
        location_detail->region = NULL;
    }
    if (location_detail->names) {
        list_ForEach(listEntry, location_detail->names) {
            location_name_free(listEntry->data);
        }
        list_freeList(location_detail->names);
        location_detail->names = NULL;
    }
    if (location_detail->game_indices) {
        list_ForEach(listEntry, location_detail->game_indices) {
            location_game_index_free(listEntry->data);
        }
        list_freeList(location_detail->game_indices);
        location_detail->game_indices = NULL;
    }
    if (location_detail->areas) {
        list_ForEach(listEntry, location_detail->areas) {
            location_area_summary_free(listEntry->data);
        }
        list_freeList(location_detail->areas);
        location_detail->areas = NULL;
    }
    free(location_detail);
}

cJSON *location_detail_convertToJSON(location_detail_t *location_detail) {
    cJSON *item = cJSON_CreateObject();

    // location_detail->id
    if (!location_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", location_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // location_detail->name
    if (!location_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", location_detail->name) == NULL) {
    goto fail; //String
    }


    // location_detail->region
    if (!location_detail->region) {
        goto fail;
    }
    cJSON *region_local_JSON = region_summary_convertToJSON(location_detail->region);
    if(region_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "region", region_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // location_detail->names
    if (!location_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (location_detail->names) {
    list_ForEach(namesListEntry, location_detail->names) {
    cJSON *itemLocal = location_name_convertToJSON(namesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(names, itemLocal);
    }
    }


    // location_detail->game_indices
    if (!location_detail->game_indices) {
        goto fail;
    }
    cJSON *game_indices = cJSON_AddArrayToObject(item, "game_indices");
    if(game_indices == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *game_indicesListEntry;
    if (location_detail->game_indices) {
    list_ForEach(game_indicesListEntry, location_detail->game_indices) {
    cJSON *itemLocal = location_game_index_convertToJSON(game_indicesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(game_indices, itemLocal);
    }
    }


    // location_detail->areas
    if (!location_detail->areas) {
        goto fail;
    }
    cJSON *areas = cJSON_AddArrayToObject(item, "areas");
    if(areas == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *areasListEntry;
    if (location_detail->areas) {
    list_ForEach(areasListEntry, location_detail->areas) {
    cJSON *itemLocal = location_area_summary_convertToJSON(areasListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(areas, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

location_detail_t *location_detail_parseFromJSON(cJSON *location_detailJSON){

    location_detail_t *location_detail_local_var = NULL;

    // define the local variable for location_detail->region
    region_summary_t *region_local_nonprim = NULL;

    // define the local list for location_detail->names
    list_t *namesList = NULL;

    // define the local list for location_detail->game_indices
    list_t *game_indicesList = NULL;

    // define the local list for location_detail->areas
    list_t *areasList = NULL;

    // location_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(location_detailJSON, "id");
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

    // location_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(location_detailJSON, "name");
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

    // location_detail->region
    cJSON *region = cJSON_GetObjectItemCaseSensitive(location_detailJSON, "region");
    if (cJSON_IsNull(region)) {
        region = NULL;
    }
    if (!region) {
        goto end;
    }

    
    region_local_nonprim = region_summary_parseFromJSON(region); //nonprimitive

    // location_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(location_detailJSON, "names");
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
        location_name_t *namesItem = location_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }

    // location_detail->game_indices
    cJSON *game_indices = cJSON_GetObjectItemCaseSensitive(location_detailJSON, "game_indices");
    if (cJSON_IsNull(game_indices)) {
        game_indices = NULL;
    }
    if (!game_indices) {
        goto end;
    }

    
    cJSON *game_indices_local_nonprimitive = NULL;
    if(!cJSON_IsArray(game_indices)){
        goto end; //nonprimitive container
    }

    game_indicesList = list_createList();

    cJSON_ArrayForEach(game_indices_local_nonprimitive,game_indices )
    {
        if(!cJSON_IsObject(game_indices_local_nonprimitive)){
            goto end;
        }
        location_game_index_t *game_indicesItem = location_game_index_parseFromJSON(game_indices_local_nonprimitive);

        list_addElement(game_indicesList, game_indicesItem);
    }

    // location_detail->areas
    cJSON *areas = cJSON_GetObjectItemCaseSensitive(location_detailJSON, "areas");
    if (cJSON_IsNull(areas)) {
        areas = NULL;
    }
    if (!areas) {
        goto end;
    }

    
    cJSON *areas_local_nonprimitive = NULL;
    if(!cJSON_IsArray(areas)){
        goto end; //nonprimitive container
    }

    areasList = list_createList();

    cJSON_ArrayForEach(areas_local_nonprimitive,areas )
    {
        if(!cJSON_IsObject(areas_local_nonprimitive)){
            goto end;
        }
        location_area_summary_t *areasItem = location_area_summary_parseFromJSON(areas_local_nonprimitive);

        list_addElement(areasList, areasItem);
    }


    location_detail_local_var = location_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        region_local_nonprim,
        namesList,
        game_indicesList,
        areasList
        );

    return location_detail_local_var;
end:
    if (region_local_nonprim) {
        region_summary_free(region_local_nonprim);
        region_local_nonprim = NULL;
    }
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            location_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    if (game_indicesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, game_indicesList) {
            location_game_index_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(game_indicesList);
        game_indicesList = NULL;
    }
    if (areasList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, areasList) {
            location_area_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(areasList);
        areasList = NULL;
    }
    return NULL;

}
