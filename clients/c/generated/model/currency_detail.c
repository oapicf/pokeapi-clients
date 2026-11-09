#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "currency_detail.h"



static currency_detail_t *currency_detail_create_internal(
    int *id,
    char *name,
    list_t *names
    ) {
    currency_detail_t *currency_detail_local_var = malloc(sizeof(currency_detail_t));
    if (!currency_detail_local_var) {
        return NULL;
    }
    memset(currency_detail_local_var, 0, sizeof(currency_detail_t));
    currency_detail_local_var->_library_owned = 1;
    currency_detail_local_var->id = id;
    currency_detail_local_var->name = name;
    currency_detail_local_var->names = names;
    return currency_detail_local_var;
}

__attribute__((deprecated)) currency_detail_t *currency_detail_create(
    int *id,
    char *name,
    list_t *names
    ) {
    int *id_copy = NULL;
    if (id) {
        id_copy = malloc(sizeof(int));
        if (id_copy) *id_copy = *id;
    }
    currency_detail_t *result = currency_detail_create_internal (
        id_copy,
        name,
        names
        );
    if (!result) {
        free(id_copy);
    }
    return result;
}

void currency_detail_free(currency_detail_t *currency_detail) {
    if(NULL == currency_detail){
        return ;
    }
    if(currency_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "currency_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (currency_detail->id) {
        free(currency_detail->id);
        currency_detail->id = NULL;
    }
    if (currency_detail->name) {
        free(currency_detail->name);
        currency_detail->name = NULL;
    }
    if (currency_detail->names) {
        list_ForEach(listEntry, currency_detail->names) {
            currency_name_free(listEntry->data);
        }
        list_freeList(currency_detail->names);
        currency_detail->names = NULL;
    }
    free(currency_detail);
}

cJSON *currency_detail_convertToJSON(currency_detail_t *currency_detail) {
    cJSON *item = cJSON_CreateObject();

    // currency_detail->id
    if (!currency_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", *currency_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // currency_detail->name
    if (!currency_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", currency_detail->name) == NULL) {
    goto fail; //String
    }


    // currency_detail->names
    if (!currency_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (currency_detail->names) {
    list_ForEach(namesListEntry, currency_detail->names) {
    cJSON *itemLocal = currency_name_convertToJSON(namesListEntry->data);
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

currency_detail_t *currency_detail_parseFromJSON(cJSON *currency_detailJSON){

    currency_detail_t *currency_detail_local_var = NULL;

    // define the local variable for currency_detail->id
    int *id_local_var = NULL;

    char *name_local_str = NULL;

    // define the local list for currency_detail->names
    list_t *namesList = NULL;

    // currency_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(currency_detailJSON, "id");
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
    id_local_var = malloc(sizeof(int));
    if(!id_local_var)
    {
        goto end;
    }
    *id_local_var = id->valuedouble;

    // currency_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(currency_detailJSON, "name");
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

    // currency_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(currency_detailJSON, "names");
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
        currency_name_t *namesItem = currency_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    currency_detail_local_var = currency_detail_create_internal (
        id_local_var,
        name_local_str,
        namesList
        );

    if (!currency_detail_local_var) {
        goto end;
    }

    return currency_detail_local_var;
end:
    if (id_local_var) {
        free(id_local_var);
        id_local_var = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            currency_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    return NULL;

}
