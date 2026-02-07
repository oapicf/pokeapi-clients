#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "berry_flavor_detail.h"



static berry_flavor_detail_t *berry_flavor_detail_create_internal(
    int id,
    char *name,
    list_t *berries,
    contest_type_summary_t *contest_type,
    list_t *names
    ) {
    berry_flavor_detail_t *berry_flavor_detail_local_var = malloc(sizeof(berry_flavor_detail_t));
    if (!berry_flavor_detail_local_var) {
        return NULL;
    }
    berry_flavor_detail_local_var->id = id;
    berry_flavor_detail_local_var->name = name;
    berry_flavor_detail_local_var->berries = berries;
    berry_flavor_detail_local_var->contest_type = contest_type;
    berry_flavor_detail_local_var->names = names;

    berry_flavor_detail_local_var->_library_owned = 1;
    return berry_flavor_detail_local_var;
}

__attribute__((deprecated)) berry_flavor_detail_t *berry_flavor_detail_create(
    int id,
    char *name,
    list_t *berries,
    contest_type_summary_t *contest_type,
    list_t *names
    ) {
    return berry_flavor_detail_create_internal (
        id,
        name,
        berries,
        contest_type,
        names
        );
}

void berry_flavor_detail_free(berry_flavor_detail_t *berry_flavor_detail) {
    if(NULL == berry_flavor_detail){
        return ;
    }
    if(berry_flavor_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "berry_flavor_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (berry_flavor_detail->name) {
        free(berry_flavor_detail->name);
        berry_flavor_detail->name = NULL;
    }
    if (berry_flavor_detail->berries) {
        list_ForEach(listEntry, berry_flavor_detail->berries) {
            berry_flavor_detail_berries_inner_free(listEntry->data);
        }
        list_freeList(berry_flavor_detail->berries);
        berry_flavor_detail->berries = NULL;
    }
    if (berry_flavor_detail->contest_type) {
        contest_type_summary_free(berry_flavor_detail->contest_type);
        berry_flavor_detail->contest_type = NULL;
    }
    if (berry_flavor_detail->names) {
        list_ForEach(listEntry, berry_flavor_detail->names) {
            berry_flavor_name_free(listEntry->data);
        }
        list_freeList(berry_flavor_detail->names);
        berry_flavor_detail->names = NULL;
    }
    free(berry_flavor_detail);
}

cJSON *berry_flavor_detail_convertToJSON(berry_flavor_detail_t *berry_flavor_detail) {
    cJSON *item = cJSON_CreateObject();

    // berry_flavor_detail->id
    if (!berry_flavor_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", berry_flavor_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // berry_flavor_detail->name
    if (!berry_flavor_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", berry_flavor_detail->name) == NULL) {
    goto fail; //String
    }


    // berry_flavor_detail->berries
    if (!berry_flavor_detail->berries) {
        goto fail;
    }
    cJSON *berries = cJSON_AddArrayToObject(item, "berries");
    if(berries == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *berriesListEntry;
    if (berry_flavor_detail->berries) {
    list_ForEach(berriesListEntry, berry_flavor_detail->berries) {
    cJSON *itemLocal = berry_flavor_detail_berries_inner_convertToJSON(berriesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(berries, itemLocal);
    }
    }


    // berry_flavor_detail->contest_type
    if (!berry_flavor_detail->contest_type) {
        goto fail;
    }
    cJSON *contest_type_local_JSON = contest_type_summary_convertToJSON(berry_flavor_detail->contest_type);
    if(contest_type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "contest_type", contest_type_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // berry_flavor_detail->names
    if (!berry_flavor_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (berry_flavor_detail->names) {
    list_ForEach(namesListEntry, berry_flavor_detail->names) {
    cJSON *itemLocal = berry_flavor_name_convertToJSON(namesListEntry->data);
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

berry_flavor_detail_t *berry_flavor_detail_parseFromJSON(cJSON *berry_flavor_detailJSON){

    berry_flavor_detail_t *berry_flavor_detail_local_var = NULL;

    // define the local list for berry_flavor_detail->berries
    list_t *berriesList = NULL;

    // define the local variable for berry_flavor_detail->contest_type
    contest_type_summary_t *contest_type_local_nonprim = NULL;

    // define the local list for berry_flavor_detail->names
    list_t *namesList = NULL;

    // berry_flavor_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(berry_flavor_detailJSON, "id");
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

    // berry_flavor_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(berry_flavor_detailJSON, "name");
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

    // berry_flavor_detail->berries
    cJSON *berries = cJSON_GetObjectItemCaseSensitive(berry_flavor_detailJSON, "berries");
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
        berry_flavor_detail_berries_inner_t *berriesItem = berry_flavor_detail_berries_inner_parseFromJSON(berries_local_nonprimitive);

        list_addElement(berriesList, berriesItem);
    }

    // berry_flavor_detail->contest_type
    cJSON *contest_type = cJSON_GetObjectItemCaseSensitive(berry_flavor_detailJSON, "contest_type");
    if (cJSON_IsNull(contest_type)) {
        contest_type = NULL;
    }
    if (!contest_type) {
        goto end;
    }

    
    contest_type_local_nonprim = contest_type_summary_parseFromJSON(contest_type); //nonprimitive

    // berry_flavor_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(berry_flavor_detailJSON, "names");
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
        berry_flavor_name_t *namesItem = berry_flavor_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }


    berry_flavor_detail_local_var = berry_flavor_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        berriesList,
        contest_type_local_nonprim,
        namesList
        );

    return berry_flavor_detail_local_var;
end:
    if (berriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, berriesList) {
            berry_flavor_detail_berries_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(berriesList);
        berriesList = NULL;
    }
    if (contest_type_local_nonprim) {
        contest_type_summary_free(contest_type_local_nonprim);
        contest_type_local_nonprim = NULL;
    }
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            berry_flavor_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    return NULL;

}
