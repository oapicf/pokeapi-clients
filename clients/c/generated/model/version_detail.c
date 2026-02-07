#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "version_detail.h"



static version_detail_t *version_detail_create_internal(
    int id,
    char *name,
    list_t *names,
    version_group_summary_t *version_group
    ) {
    version_detail_t *version_detail_local_var = malloc(sizeof(version_detail_t));
    if (!version_detail_local_var) {
        return NULL;
    }
    version_detail_local_var->id = id;
    version_detail_local_var->name = name;
    version_detail_local_var->names = names;
    version_detail_local_var->version_group = version_group;

    version_detail_local_var->_library_owned = 1;
    return version_detail_local_var;
}

__attribute__((deprecated)) version_detail_t *version_detail_create(
    int id,
    char *name,
    list_t *names,
    version_group_summary_t *version_group
    ) {
    return version_detail_create_internal (
        id,
        name,
        names,
        version_group
        );
}

void version_detail_free(version_detail_t *version_detail) {
    if(NULL == version_detail){
        return ;
    }
    if(version_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "version_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (version_detail->name) {
        free(version_detail->name);
        version_detail->name = NULL;
    }
    if (version_detail->names) {
        list_ForEach(listEntry, version_detail->names) {
            version_name_free(listEntry->data);
        }
        list_freeList(version_detail->names);
        version_detail->names = NULL;
    }
    if (version_detail->version_group) {
        version_group_summary_free(version_detail->version_group);
        version_detail->version_group = NULL;
    }
    free(version_detail);
}

cJSON *version_detail_convertToJSON(version_detail_t *version_detail) {
    cJSON *item = cJSON_CreateObject();

    // version_detail->id
    if (!version_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", version_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // version_detail->name
    if (!version_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", version_detail->name) == NULL) {
    goto fail; //String
    }


    // version_detail->names
    if (!version_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (version_detail->names) {
    list_ForEach(namesListEntry, version_detail->names) {
    cJSON *itemLocal = version_name_convertToJSON(namesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(names, itemLocal);
    }
    }


    // version_detail->version_group
    if (!version_detail->version_group) {
        goto fail;
    }
    cJSON *version_group_local_JSON = version_group_summary_convertToJSON(version_detail->version_group);
    if(version_group_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "version_group", version_group_local_JSON);
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

version_detail_t *version_detail_parseFromJSON(cJSON *version_detailJSON){

    version_detail_t *version_detail_local_var = NULL;

    // define the local list for version_detail->names
    list_t *namesList = NULL;

    // define the local variable for version_detail->version_group
    version_group_summary_t *version_group_local_nonprim = NULL;

    // version_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(version_detailJSON, "id");
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

    // version_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(version_detailJSON, "name");
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

    // version_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(version_detailJSON, "names");
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
        version_name_t *namesItem = version_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }

    // version_detail->version_group
    cJSON *version_group = cJSON_GetObjectItemCaseSensitive(version_detailJSON, "version_group");
    if (cJSON_IsNull(version_group)) {
        version_group = NULL;
    }
    if (!version_group) {
        goto end;
    }

    
    version_group_local_nonprim = version_group_summary_parseFromJSON(version_group); //nonprimitive


    version_detail_local_var = version_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        namesList,
        version_group_local_nonprim
        );

    return version_detail_local_var;
end:
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            version_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    if (version_group_local_nonprim) {
        version_group_summary_free(version_group_local_nonprim);
        version_group_local_nonprim = NULL;
    }
    return NULL;

}
