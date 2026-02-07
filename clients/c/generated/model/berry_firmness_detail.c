#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "berry_firmness_detail.h"



static berry_firmness_detail_t *berry_firmness_detail_create_internal(
    int id,
    char *name,
    list_t *berries,
    list_t *names
    ) {
    berry_firmness_detail_t *berry_firmness_detail_local_var = malloc(sizeof(berry_firmness_detail_t));
    if (!berry_firmness_detail_local_var) {
        return NULL;
    }
    berry_firmness_detail_local_var->id = id;
    berry_firmness_detail_local_var->name = name;
    berry_firmness_detail_local_var->berries = berries;
    berry_firmness_detail_local_var->names = names;

    berry_firmness_detail_local_var->_library_owned = 1;
    return berry_firmness_detail_local_var;
}

__attribute__((deprecated)) berry_firmness_detail_t *berry_firmness_detail_create(
    int id,
    char *name,
    list_t *berries,
    list_t *names
    ) {
    return berry_firmness_detail_create_internal (
        id,
        name,
        berries,
        names
        );
}

void berry_firmness_detail_free(berry_firmness_detail_t *berry_firmness_detail) {
    if(NULL == berry_firmness_detail){
        return ;
    }
    if(berry_firmness_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "berry_firmness_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (berry_firmness_detail->name) {
        free(berry_firmness_detail->name);
        berry_firmness_detail->name = NULL;
    }
    if (berry_firmness_detail->berries) {
        list_ForEach(listEntry, berry_firmness_detail->berries) {
            berry_summary_free(listEntry->data);
        }
        list_freeList(berry_firmness_detail->berries);
        berry_firmness_detail->berries = NULL;
    }
    if (berry_firmness_detail->names) {
        list_ForEach(listEntry, berry_firmness_detail->names) {
            berry_firmness_name_free(listEntry->data);
        }
        list_freeList(berry_firmness_detail->names);
        berry_firmness_detail->names = NULL;
    }
    free(berry_firmness_detail);
}

cJSON *berry_firmness_detail_convertToJSON(berry_firmness_detail_t *berry_firmness_detail) {
    cJSON *item = cJSON_CreateObject();

    // berry_firmness_detail->id
    if (!berry_firmness_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", berry_firmness_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // berry_firmness_detail->name
    if (!berry_firmness_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", berry_firmness_detail->name) == NULL) {
    goto fail; //String
    }


    // berry_firmness_detail->berries
    if (!berry_firmness_detail->berries) {
        goto fail;
    }
    cJSON *berries = cJSON_AddArrayToObject(item, "berries");
    if(berries == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *berriesListEntry;
    if (berry_firmness_detail->berries) {
    list_ForEach(berriesListEntry, berry_firmness_detail->berries) {
    cJSON *itemLocal = berry_summary_convertToJSON(berriesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(berries, itemLocal);
    }
    }


    // berry_firmness_detail->names
    if (!berry_firmness_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (berry_firmness_detail->names) {
    list_ForEach(namesListEntry, berry_firmness_detail->names) {
    cJSON *itemLocal = berry_firmness_name_convertToJSON(namesListEntry->data);
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

berry_firmness_detail_t *berry_firmness_detail_parseFromJSON(cJSON *berry_firmness_detailJSON){

    berry_firmness_detail_t *berry_firmness_detail_local_var = NULL;

    // define the local list for berry_firmness_detail->berries
    list_t *berriesList = NULL;

    // define the local list for berry_firmness_detail->names
    list_t *namesList = NULL;

    // berry_firmness_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(berry_firmness_detailJSON, "id");
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

    // berry_firmness_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(berry_firmness_detailJSON, "name");
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

    // berry_firmness_detail->berries
    cJSON *berries = cJSON_GetObjectItemCaseSensitive(berry_firmness_detailJSON, "berries");
    if (cJSON_IsNull(berries)) {
        berries = NULL;
    }
    if (!berries) {
        goto end;
    }

    
    cJSON *berries_local_nonprimitive = NULL;
    if(!cJSON_IsArray(berries)){
        goto end; //nonprimitive container
    }

    berriesList = list_createList();

    cJSON_ArrayForEach(berries_local_nonprimitive,berries )
    {
        if(!cJSON_IsObject(berries_local_nonprimitive)){
            goto end;
        }
        berry_summary_t *berriesItem = berry_summary_parseFromJSON(berries_local_nonprimitive);

        list_addElement(berriesList, berriesItem);
    }

    // berry_firmness_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(berry_firmness_detailJSON, "names");
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
        berry_firmness_name_t *namesItem = berry_firmness_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }


    berry_firmness_detail_local_var = berry_firmness_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        berriesList,
        namesList
        );

    return berry_firmness_detail_local_var;
end:
    if (berriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, berriesList) {
            berry_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(berriesList);
        berriesList = NULL;
    }
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            berry_firmness_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    return NULL;

}
