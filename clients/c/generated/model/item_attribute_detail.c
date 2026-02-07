#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_attribute_detail.h"



static item_attribute_detail_t *item_attribute_detail_create_internal(
    int id,
    char *name,
    list_t *descriptions,
    list_t *items,
    list_t *names
    ) {
    item_attribute_detail_t *item_attribute_detail_local_var = malloc(sizeof(item_attribute_detail_t));
    if (!item_attribute_detail_local_var) {
        return NULL;
    }
    item_attribute_detail_local_var->id = id;
    item_attribute_detail_local_var->name = name;
    item_attribute_detail_local_var->descriptions = descriptions;
    item_attribute_detail_local_var->items = items;
    item_attribute_detail_local_var->names = names;

    item_attribute_detail_local_var->_library_owned = 1;
    return item_attribute_detail_local_var;
}

__attribute__((deprecated)) item_attribute_detail_t *item_attribute_detail_create(
    int id,
    char *name,
    list_t *descriptions,
    list_t *items,
    list_t *names
    ) {
    return item_attribute_detail_create_internal (
        id,
        name,
        descriptions,
        items,
        names
        );
}

void item_attribute_detail_free(item_attribute_detail_t *item_attribute_detail) {
    if(NULL == item_attribute_detail){
        return ;
    }
    if(item_attribute_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_attribute_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (item_attribute_detail->name) {
        free(item_attribute_detail->name);
        item_attribute_detail->name = NULL;
    }
    if (item_attribute_detail->descriptions) {
        list_ForEach(listEntry, item_attribute_detail->descriptions) {
            item_attribute_description_free(listEntry->data);
        }
        list_freeList(item_attribute_detail->descriptions);
        item_attribute_detail->descriptions = NULL;
    }
    if (item_attribute_detail->items) {
        list_ForEach(listEntry, item_attribute_detail->items) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
        }
        list_freeList(item_attribute_detail->items);
        item_attribute_detail->items = NULL;
    }
    if (item_attribute_detail->names) {
        list_ForEach(listEntry, item_attribute_detail->names) {
            item_attribute_name_free(listEntry->data);
        }
        list_freeList(item_attribute_detail->names);
        item_attribute_detail->names = NULL;
    }
    free(item_attribute_detail);
}

cJSON *item_attribute_detail_convertToJSON(item_attribute_detail_t *item_attribute_detail) {
    cJSON *item = cJSON_CreateObject();

    // item_attribute_detail->id
    if (!item_attribute_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", item_attribute_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // item_attribute_detail->name
    if (!item_attribute_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", item_attribute_detail->name) == NULL) {
    goto fail; //String
    }


    // item_attribute_detail->descriptions
    if (!item_attribute_detail->descriptions) {
        goto fail;
    }
    cJSON *descriptions = cJSON_AddArrayToObject(item, "descriptions");
    if(descriptions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *descriptionsListEntry;
    if (item_attribute_detail->descriptions) {
    list_ForEach(descriptionsListEntry, item_attribute_detail->descriptions) {
    cJSON *itemLocal = item_attribute_description_convertToJSON(descriptionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(descriptions, itemLocal);
    }
    }


    // item_attribute_detail->items
    if (!item_attribute_detail->items) {
        goto fail;
    }
    cJSON *items = cJSON_AddArrayToObject(item, "items");
    if(items == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *itemsListEntry;
    if (item_attribute_detail->items) {
    list_ForEach(itemsListEntry, item_attribute_detail->items) {
    cJSON *itemLocal = ability_detail_pokemon_inner_pokemon_convertToJSON(itemsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(items, itemLocal);
    }
    }


    // item_attribute_detail->names
    if (!item_attribute_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (item_attribute_detail->names) {
    list_ForEach(namesListEntry, item_attribute_detail->names) {
    cJSON *itemLocal = item_attribute_name_convertToJSON(namesListEntry->data);
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

item_attribute_detail_t *item_attribute_detail_parseFromJSON(cJSON *item_attribute_detailJSON){

    item_attribute_detail_t *item_attribute_detail_local_var = NULL;

    // define the local list for item_attribute_detail->descriptions
    list_t *descriptionsList = NULL;

    // define the local list for item_attribute_detail->items
    list_t *itemsList = NULL;

    // define the local list for item_attribute_detail->names
    list_t *namesList = NULL;

    // item_attribute_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(item_attribute_detailJSON, "id");
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

    // item_attribute_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(item_attribute_detailJSON, "name");
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

    // item_attribute_detail->descriptions
    cJSON *descriptions = cJSON_GetObjectItemCaseSensitive(item_attribute_detailJSON, "descriptions");
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
        item_attribute_description_t *descriptionsItem = item_attribute_description_parseFromJSON(descriptions_local_nonprimitive);

        list_addElement(descriptionsList, descriptionsItem);
    }

    // item_attribute_detail->items
    cJSON *items = cJSON_GetObjectItemCaseSensitive(item_attribute_detailJSON, "items");
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
        ability_detail_pokemon_inner_pokemon_t *itemsItem = ability_detail_pokemon_inner_pokemon_parseFromJSON(items_local_nonprimitive);

        list_addElement(itemsList, itemsItem);
    }

    // item_attribute_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(item_attribute_detailJSON, "names");
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
        item_attribute_name_t *namesItem = item_attribute_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }


    item_attribute_detail_local_var = item_attribute_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        descriptionsList,
        itemsList,
        namesList
        );

    return item_attribute_detail_local_var;
end:
    if (descriptionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, descriptionsList) {
            item_attribute_description_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(descriptionsList);
        descriptionsList = NULL;
    }
    if (itemsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, itemsList) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(itemsList);
        itemsList = NULL;
    }
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            item_attribute_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    return NULL;

}
