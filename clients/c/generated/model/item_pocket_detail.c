#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_pocket_detail.h"



static item_pocket_detail_t *item_pocket_detail_create_internal(
    int id,
    char *name,
    list_t *categories,
    list_t *names
    ) {
    item_pocket_detail_t *item_pocket_detail_local_var = malloc(sizeof(item_pocket_detail_t));
    if (!item_pocket_detail_local_var) {
        return NULL;
    }
    item_pocket_detail_local_var->id = id;
    item_pocket_detail_local_var->name = name;
    item_pocket_detail_local_var->categories = categories;
    item_pocket_detail_local_var->names = names;

    item_pocket_detail_local_var->_library_owned = 1;
    return item_pocket_detail_local_var;
}

__attribute__((deprecated)) item_pocket_detail_t *item_pocket_detail_create(
    int id,
    char *name,
    list_t *categories,
    list_t *names
    ) {
    return item_pocket_detail_create_internal (
        id,
        name,
        categories,
        names
        );
}

void item_pocket_detail_free(item_pocket_detail_t *item_pocket_detail) {
    if(NULL == item_pocket_detail){
        return ;
    }
    if(item_pocket_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_pocket_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (item_pocket_detail->name) {
        free(item_pocket_detail->name);
        item_pocket_detail->name = NULL;
    }
    if (item_pocket_detail->categories) {
        list_ForEach(listEntry, item_pocket_detail->categories) {
            item_category_summary_free(listEntry->data);
        }
        list_freeList(item_pocket_detail->categories);
        item_pocket_detail->categories = NULL;
    }
    if (item_pocket_detail->names) {
        list_ForEach(listEntry, item_pocket_detail->names) {
            item_pocket_name_free(listEntry->data);
        }
        list_freeList(item_pocket_detail->names);
        item_pocket_detail->names = NULL;
    }
    free(item_pocket_detail);
}

cJSON *item_pocket_detail_convertToJSON(item_pocket_detail_t *item_pocket_detail) {
    cJSON *item = cJSON_CreateObject();

    // item_pocket_detail->id
    if (!item_pocket_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", item_pocket_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // item_pocket_detail->name
    if (!item_pocket_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", item_pocket_detail->name) == NULL) {
    goto fail; //String
    }


    // item_pocket_detail->categories
    if (!item_pocket_detail->categories) {
        goto fail;
    }
    cJSON *categories = cJSON_AddArrayToObject(item, "categories");
    if(categories == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *categoriesListEntry;
    if (item_pocket_detail->categories) {
    list_ForEach(categoriesListEntry, item_pocket_detail->categories) {
    cJSON *itemLocal = item_category_summary_convertToJSON(categoriesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(categories, itemLocal);
    }
    }


    // item_pocket_detail->names
    if (!item_pocket_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (item_pocket_detail->names) {
    list_ForEach(namesListEntry, item_pocket_detail->names) {
    cJSON *itemLocal = item_pocket_name_convertToJSON(namesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(names, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

item_pocket_detail_t *item_pocket_detail_parseFromJSON(cJSON *item_pocket_detailJSON){

    item_pocket_detail_t *item_pocket_detail_local_var = NULL;

    // define the local list for item_pocket_detail->categories
    list_t *categoriesList = NULL;

    // define the local list for item_pocket_detail->names
    list_t *namesList = NULL;

    // item_pocket_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(item_pocket_detailJSON, "id");
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

    // item_pocket_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(item_pocket_detailJSON, "name");
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

    // item_pocket_detail->categories
    cJSON *categories = cJSON_GetObjectItemCaseSensitive(item_pocket_detailJSON, "categories");
    if (cJSON_IsNull(categories)) {
        categories = NULL;
    }
    if (!categories) {
        goto end;
    }

    
    cJSON *categories_local_nonprimitive = NULL;
    if(!cJSON_IsArray(categories)){
        goto end; //nonprimitive container
    }

    categoriesList = list_createList();

    cJSON_ArrayForEach(categories_local_nonprimitive,categories )
    {
        if(!cJSON_IsObject(categories_local_nonprimitive)){
            goto end;
        }
        item_category_summary_t *categoriesItem = item_category_summary_parseFromJSON(categories_local_nonprimitive);

        list_addElement(categoriesList, categoriesItem);
    }

    // item_pocket_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(item_pocket_detailJSON, "names");
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
        item_pocket_name_t *namesItem = item_pocket_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }


    item_pocket_detail_local_var = item_pocket_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        categoriesList,
        namesList
        );

    return item_pocket_detail_local_var;
end:
    if (categoriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, categoriesList) {
            item_category_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(categoriesList);
        categoriesList = NULL;
    }
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            item_pocket_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    return NULL;

}
