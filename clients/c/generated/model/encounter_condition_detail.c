#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "encounter_condition_detail.h"



static encounter_condition_detail_t *encounter_condition_detail_create_internal(
    int id,
    char *name,
    list_t *values,
    list_t *names
    ) {
    encounter_condition_detail_t *encounter_condition_detail_local_var = malloc(sizeof(encounter_condition_detail_t));
    if (!encounter_condition_detail_local_var) {
        return NULL;
    }
    encounter_condition_detail_local_var->id = id;
    encounter_condition_detail_local_var->name = name;
    encounter_condition_detail_local_var->values = values;
    encounter_condition_detail_local_var->names = names;

    encounter_condition_detail_local_var->_library_owned = 1;
    return encounter_condition_detail_local_var;
}

__attribute__((deprecated)) encounter_condition_detail_t *encounter_condition_detail_create(
    int id,
    char *name,
    list_t *values,
    list_t *names
    ) {
    return encounter_condition_detail_create_internal (
        id,
        name,
        values,
        names
        );
}

void encounter_condition_detail_free(encounter_condition_detail_t *encounter_condition_detail) {
    if(NULL == encounter_condition_detail){
        return ;
    }
    if(encounter_condition_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "encounter_condition_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (encounter_condition_detail->name) {
        free(encounter_condition_detail->name);
        encounter_condition_detail->name = NULL;
    }
    if (encounter_condition_detail->values) {
        list_ForEach(listEntry, encounter_condition_detail->values) {
            encounter_condition_value_summary_free(listEntry->data);
        }
        list_freeList(encounter_condition_detail->values);
        encounter_condition_detail->values = NULL;
    }
    if (encounter_condition_detail->names) {
        list_ForEach(listEntry, encounter_condition_detail->names) {
            encounter_condition_name_free(listEntry->data);
        }
        list_freeList(encounter_condition_detail->names);
        encounter_condition_detail->names = NULL;
    }
    free(encounter_condition_detail);
}

cJSON *encounter_condition_detail_convertToJSON(encounter_condition_detail_t *encounter_condition_detail) {
    cJSON *item = cJSON_CreateObject();

    // encounter_condition_detail->id
    if (!encounter_condition_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", encounter_condition_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // encounter_condition_detail->name
    if (!encounter_condition_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", encounter_condition_detail->name) == NULL) {
    goto fail; //String
    }


    // encounter_condition_detail->values
    if (!encounter_condition_detail->values) {
        goto fail;
    }
    cJSON *values = cJSON_AddArrayToObject(item, "values");
    if(values == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *valuesListEntry;
    if (encounter_condition_detail->values) {
    list_ForEach(valuesListEntry, encounter_condition_detail->values) {
    cJSON *itemLocal = encounter_condition_value_summary_convertToJSON(valuesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(values, itemLocal);
    }
    }


    // encounter_condition_detail->names
    if (!encounter_condition_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (encounter_condition_detail->names) {
    list_ForEach(namesListEntry, encounter_condition_detail->names) {
    cJSON *itemLocal = encounter_condition_name_convertToJSON(namesListEntry->data);
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

encounter_condition_detail_t *encounter_condition_detail_parseFromJSON(cJSON *encounter_condition_detailJSON){

    encounter_condition_detail_t *encounter_condition_detail_local_var = NULL;

    // define the local list for encounter_condition_detail->values
    list_t *valuesList = NULL;

    // define the local list for encounter_condition_detail->names
    list_t *namesList = NULL;

    // encounter_condition_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(encounter_condition_detailJSON, "id");
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

    // encounter_condition_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(encounter_condition_detailJSON, "name");
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

    // encounter_condition_detail->values
    cJSON *values = cJSON_GetObjectItemCaseSensitive(encounter_condition_detailJSON, "values");
    if (cJSON_IsNull(values)) {
        values = NULL;
    }
    if (!values) {
        goto end;
    }

    
    cJSON *values_local_nonprimitive = NULL;
    if(!cJSON_IsArray(values)){
        goto end; //nonprimitive container
    }

    valuesList = list_createList();

    cJSON_ArrayForEach(values_local_nonprimitive,values )
    {
        if(!cJSON_IsObject(values_local_nonprimitive)){
            goto end;
        }
        encounter_condition_value_summary_t *valuesItem = encounter_condition_value_summary_parseFromJSON(values_local_nonprimitive);

        list_addElement(valuesList, valuesItem);
    }

    // encounter_condition_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(encounter_condition_detailJSON, "names");
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
        encounter_condition_name_t *namesItem = encounter_condition_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }


    encounter_condition_detail_local_var = encounter_condition_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        valuesList,
        namesList
        );

    return encounter_condition_detail_local_var;
end:
    if (valuesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, valuesList) {
            encounter_condition_value_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(valuesList);
        valuesList = NULL;
    }
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            encounter_condition_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    return NULL;

}
