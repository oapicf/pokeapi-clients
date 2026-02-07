#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_category_detail.h"



static item_category_detail_t *item_category_detail_create_internal(
    int id,
    char *name,
    list_t *items,
    list_t *names,
    item_pocket_summary_t *pocket
    ) {
    item_category_detail_t *item_category_detail_local_var = malloc(sizeof(item_category_detail_t));
    if (!item_category_detail_local_var) {
        return NULL;
    }
    item_category_detail_local_var->id = id;
    item_category_detail_local_var->name = name;
    item_category_detail_local_var->items = items;
    item_category_detail_local_var->names = names;
    item_category_detail_local_var->pocket = pocket;

    item_category_detail_local_var->_library_owned = 1;
    return item_category_detail_local_var;
}

__attribute__((deprecated)) item_category_detail_t *item_category_detail_create(
    int id,
    char *name,
    list_t *items,
    list_t *names,
    item_pocket_summary_t *pocket
    ) {
    return item_category_detail_create_internal (
        id,
        name,
        items,
        names,
        pocket
        );
}

void item_category_detail_free(item_category_detail_t *item_category_detail) {
    if(NULL == item_category_detail){
        return ;
    }
    if(item_category_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_category_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (item_category_detail->name) {
        free(item_category_detail->name);
        item_category_detail->name = NULL;
    }
    if (item_category_detail->items) {
        list_ForEach(listEntry, item_category_detail->items) {
            item_summary_free(listEntry->data);
        }
        list_freeList(item_category_detail->items);
        item_category_detail->items = NULL;
    }
    if (item_category_detail->names) {
        list_ForEach(listEntry, item_category_detail->names) {
            item_category_name_free(listEntry->data);
        }
        list_freeList(item_category_detail->names);
        item_category_detail->names = NULL;
    }
    if (item_category_detail->pocket) {
        item_pocket_summary_free(item_category_detail->pocket);
        item_category_detail->pocket = NULL;
    }
    free(item_category_detail);
}

cJSON *item_category_detail_convertToJSON(item_category_detail_t *item_category_detail) {
    cJSON *item = cJSON_CreateObject();

    // item_category_detail->id
    if (!item_category_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", item_category_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // item_category_detail->name
    if (!item_category_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", item_category_detail->name) == NULL) {
    goto fail; //String
    }


    // item_category_detail->items
    if (!item_category_detail->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (item_category_detail->items) {
    list_ForEach(itemsListEntry, item_category_detail->items) {
    cJSON *itemLocal = item_summary_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // item_category_detail->names
    if (!item_category_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (item_category_detail->names) {
    list_ForEach(namesListEntry, item_category_detail->names) {
    cJSON *itemLocal = item_category_name_convertToJSON(namesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(names, itemLocal);
    }
    }


    // item_category_detail->pocket
    if (!item_category_detail->pocket) {
        goto fail;
    }
    cJSON *pocket_local_JSON = item_pocket_summary_convertToJSON(item_category_detail->pocket);
    if(pocket_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pocket", pocket_local_JSON);
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

item_category_detail_t *item_category_detail_parseFromJSON(cJSON *item_category_detailJSON){

    item_category_detail_t *item_category_detail_local_var = NULL;

    // define the local list for item_category_detail->items
    list_t *itemsList = NULL;

    // define the local list for item_category_detail->names
    list_t *namesList = NULL;

    // define the local variable for item_category_detail->pocket
    item_pocket_summary_t *pocket_local_nonprim = NULL;

    // item_category_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(item_category_detailJSON, "id");
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

    // item_category_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(item_category_detailJSON, "name");
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

    // item_category_detail->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(item_category_detailJSON, "items");
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

    // item_category_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(item_category_detailJSON, "names");
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
        item_category_name_t *namesItem = item_category_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }

    // item_category_detail->pocket
    cJSON *pocket = cJSON_GetObjectItemCaseSensitive(item_category_detailJSON, "pocket");
    if (cJSON_IsNull(pocket)) {
        pocket = NULL;
    }
    if (!pocket) {
        goto end;
    }

    
    pocket_local_nonprim = item_pocket_summary_parseFromJSON(pocket); //nonprimitive


    item_category_detail_local_var = item_category_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        itemsList,
        namesList,
        pocket_local_nonprim
        );

    return item_category_detail_local_var;
end:
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            item_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            item_category_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    if (pocket_local_nonprim) {
        item_pocket_summary_free(pocket_local_nonprim);
        pocket_local_nonprim = NULL;
    }
    return NULL;

}
