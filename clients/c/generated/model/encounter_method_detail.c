#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "encounter_method_detail.h"



static encounter_method_detail_t *encounter_method_detail_create_internal(
    int id,
    char *name,
    int order,
    list_t *names
    ) {
    encounter_method_detail_t *encounter_method_detail_local_var = malloc(sizeof(encounter_method_detail_t));
    if (!encounter_method_detail_local_var) {
        return NULL;
    }
    encounter_method_detail_local_var->id = id;
    encounter_method_detail_local_var->name = name;
    encounter_method_detail_local_var->order = order;
    encounter_method_detail_local_var->names = names;

    encounter_method_detail_local_var->_library_owned = 1;
    return encounter_method_detail_local_var;
}

__attribute__((deprecated)) encounter_method_detail_t *encounter_method_detail_create(
    int id,
    char *name,
    int order,
    list_t *names
    ) {
    return encounter_method_detail_create_internal (
        id,
        name,
        order,
        names
        );
}

void encounter_method_detail_free(encounter_method_detail_t *encounter_method_detail) {
    if(NULL == encounter_method_detail){
        return ;
    }
    if(encounter_method_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "encounter_method_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (encounter_method_detail->name) {
        free(encounter_method_detail->name);
        encounter_method_detail->name = NULL;
    }
    if (encounter_method_detail->names) {
        list_ForEach(listEntry, encounter_method_detail->names) {
            encounter_method_name_free(listEntry->data);
        }
        list_freeList(encounter_method_detail->names);
        encounter_method_detail->names = NULL;
    }
    free(encounter_method_detail);
}

cJSON *encounter_method_detail_convertToJSON(encounter_method_detail_t *encounter_method_detail) {
    cJSON *item = cJSON_CreateObject();

    // encounter_method_detail->id
    if (!encounter_method_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", encounter_method_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // encounter_method_detail->name
    if (!encounter_method_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", encounter_method_detail->name) == NULL) {
    goto fail; //String
    }


    // encounter_method_detail->order
    if(encounter_method_detail->order) {
    if(cJSON_AddNumberToObject(item, "order", encounter_method_detail->order) == NULL) {
    goto fail; //Numeric
    }
    }


    // encounter_method_detail->names
    if (!encounter_method_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (encounter_method_detail->names) {
    list_ForEach(namesListEntry, encounter_method_detail->names) {
    cJSON *itemLocal = encounter_method_name_convertToJSON(namesListEntry->data);
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

encounter_method_detail_t *encounter_method_detail_parseFromJSON(cJSON *encounter_method_detailJSON){

    encounter_method_detail_t *encounter_method_detail_local_var = NULL;

    // define the local list for encounter_method_detail->names
    list_t *namesList = NULL;

    // encounter_method_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(encounter_method_detailJSON, "id");
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

    // encounter_method_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(encounter_method_detailJSON, "name");
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

    // encounter_method_detail->order
    cJSON *order = cJSON_GetObjectItemCaseSensitive(encounter_method_detailJSON, "order");
    if (cJSON_IsNull(order)) {
        order = NULL;
    }
    if (order) { 
    if(!cJSON_IsNumber(order))
    {
    goto end; //Numeric
    }
    }

    // encounter_method_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(encounter_method_detailJSON, "names");
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
        encounter_method_name_t *namesItem = encounter_method_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }


    encounter_method_detail_local_var = encounter_method_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        order ? order->valuedouble : 0,
        namesList
        );

    return encounter_method_detail_local_var;
end:
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            encounter_method_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    return NULL;

}
