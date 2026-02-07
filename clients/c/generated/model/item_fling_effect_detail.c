#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_fling_effect_detail.h"



static item_fling_effect_detail_t *item_fling_effect_detail_create_internal(
    int id,
    char *name,
    list_t *effect_entries,
    list_t *items
    ) {
    item_fling_effect_detail_t *item_fling_effect_detail_local_var = malloc(sizeof(item_fling_effect_detail_t));
    if (!item_fling_effect_detail_local_var) {
        return NULL;
    }
    item_fling_effect_detail_local_var->id = id;
    item_fling_effect_detail_local_var->name = name;
    item_fling_effect_detail_local_var->effect_entries = effect_entries;
    item_fling_effect_detail_local_var->items = items;

    item_fling_effect_detail_local_var->_library_owned = 1;
    return item_fling_effect_detail_local_var;
}

__attribute__((deprecated)) item_fling_effect_detail_t *item_fling_effect_detail_create(
    int id,
    char *name,
    list_t *effect_entries,
    list_t *items
    ) {
    return item_fling_effect_detail_create_internal (
        id,
        name,
        effect_entries,
        items
        );
}

void item_fling_effect_detail_free(item_fling_effect_detail_t *item_fling_effect_detail) {
    if(NULL == item_fling_effect_detail){
        return ;
    }
    if(item_fling_effect_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_fling_effect_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (item_fling_effect_detail->name) {
        free(item_fling_effect_detail->name);
        item_fling_effect_detail->name = NULL;
    }
    if (item_fling_effect_detail->effect_entries) {
        list_ForEach(listEntry, item_fling_effect_detail->effect_entries) {
            item_fling_effect_effect_text_free(listEntry->data);
        }
        list_freeList(item_fling_effect_detail->effect_entries);
        item_fling_effect_detail->effect_entries = NULL;
    }
    if (item_fling_effect_detail->items) {
        list_ForEach(listEntry, item_fling_effect_detail->items) {
            item_summary_free(listEntry->data);
        }
        list_freeList(item_fling_effect_detail->items);
        item_fling_effect_detail->items = NULL;
    }
    free(item_fling_effect_detail);
}

cJSON *item_fling_effect_detail_convertToJSON(item_fling_effect_detail_t *item_fling_effect_detail) {
    cJSON *item = cJSON_CreateObject();

    // item_fling_effect_detail->id
    if (!item_fling_effect_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", item_fling_effect_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // item_fling_effect_detail->name
    if (!item_fling_effect_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", item_fling_effect_detail->name) == NULL) {
    goto fail; //String
    }


    // item_fling_effect_detail->effect_entries
    if (!item_fling_effect_detail->effect_entries) {
        goto fail;
    }
    cJSON *effect_entries = cJSON_AddArrayToObject(item, "effect_entries");
    if(effect_entries == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *effect_entriesListEntry;
    if (item_fling_effect_detail->effect_entries) {
    list_ForEach(effect_entriesListEntry, item_fling_effect_detail->effect_entries) {
    cJSON *itemLocal = item_fling_effect_effect_text_convertToJSON(effect_entriesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(effect_entries, itemLocal);
    }
    }


    // item_fling_effect_detail->items
    if (!item_fling_effect_detail->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (item_fling_effect_detail->items) {
    list_ForEach(itemsListEntry, item_fling_effect_detail->items) {
    cJSON *itemLocal = item_summary_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

item_fling_effect_detail_t *item_fling_effect_detail_parseFromJSON(cJSON *item_fling_effect_detailJSON){

    item_fling_effect_detail_t *item_fling_effect_detail_local_var = NULL;

    // define the local list for item_fling_effect_detail->effect_entries
    list_t *effect_entriesList = NULL;

    // define the local list for item_fling_effect_detail->items
    list_t *itemsList = NULL;

    // item_fling_effect_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(item_fling_effect_detailJSON, "id");
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

    // item_fling_effect_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(item_fling_effect_detailJSON, "name");
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

    // item_fling_effect_detail->effect_entries
    cJSON *effect_entries = cJSON_GetObjectItemCaseSensitive(item_fling_effect_detailJSON, "effect_entries");
    if (cJSON_IsNull(effect_entries)) {
        effect_entries = NULL;
    }
    if (!effect_entries) {
        goto end;
    }

    
    cJSON *effect_entries_local_nonprimitive = NULL;
    if(!cJSON_IsArray(effect_entries)){
        goto end; //nonprimitive container
    }

    effect_entriesList = list_createList();

    cJSON_ArrayForEach(effect_entries_local_nonprimitive,effect_entries )
    {
        if(!cJSON_IsObject(effect_entries_local_nonprimitive)){
            goto end;
        }
        item_fling_effect_effect_text_t *effect_entriesItem = item_fling_effect_effect_text_parseFromJSON(effect_entries_local_nonprimitive);

        list_addElement(effect_entriesList, effect_entriesItem);
    }

    // item_fling_effect_detail->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(item_fling_effect_detailJSON, "items");
    if (cJSON_IsNull(items)) {
        items = NULL;
    }
    if (!items) {
        goto end;
    }

    
    cJSON *items_local_nonprimitive = NULL;
    if(!cJSON_IsArray(items)){
        goto end; //nonprimitive container
    }

    itemsList = list_createList();

    cJSON_ArrayForEach(items_local_nonprimitive,items )
    {
        if(!cJSON_IsObject(items_local_nonprimitive)){
            goto end;
        }
        item_summary_t *itemsItem = item_summary_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }


    item_fling_effect_detail_local_var = item_fling_effect_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        effect_entriesList,
        itemsList
        );

    return item_fling_effect_detail_local_var;
end:
    if (effect_entriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, effect_entriesList) {
            item_fling_effect_effect_text_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(effect_entriesList);
        effect_entriesList = NULL;
    }
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            item_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    return NULL;

}
