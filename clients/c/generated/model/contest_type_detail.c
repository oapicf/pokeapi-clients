#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "contest_type_detail.h"



static contest_type_detail_t *contest_type_detail_create_internal(
    int id,
    char *name,
    berry_flavor_summary_t *berry_flavor,
    list_t *names
    ) {
    contest_type_detail_t *contest_type_detail_local_var = malloc(sizeof(contest_type_detail_t));
    if (!contest_type_detail_local_var) {
        return NULL;
    }
    contest_type_detail_local_var->id = id;
    contest_type_detail_local_var->name = name;
    contest_type_detail_local_var->berry_flavor = berry_flavor;
    contest_type_detail_local_var->names = names;

    contest_type_detail_local_var->_library_owned = 1;
    return contest_type_detail_local_var;
}

__attribute__((deprecated)) contest_type_detail_t *contest_type_detail_create(
    int id,
    char *name,
    berry_flavor_summary_t *berry_flavor,
    list_t *names
    ) {
    return contest_type_detail_create_internal (
        id,
        name,
        berry_flavor,
        names
        );
}

void contest_type_detail_free(contest_type_detail_t *contest_type_detail) {
    if(NULL == contest_type_detail){
        return ;
    }
    if(contest_type_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "contest_type_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (contest_type_detail->name) {
        free(contest_type_detail->name);
        contest_type_detail->name = NULL;
    }
    if (contest_type_detail->berry_flavor) {
        berry_flavor_summary_free(contest_type_detail->berry_flavor);
        contest_type_detail->berry_flavor = NULL;
    }
    if (contest_type_detail->names) {
        list_ForEach(listEntry, contest_type_detail->names) {
            contest_type_name_free(listEntry->data);
        }
        list_freeList(contest_type_detail->names);
        contest_type_detail->names = NULL;
    }
    free(contest_type_detail);
}

cJSON *contest_type_detail_convertToJSON(contest_type_detail_t *contest_type_detail) {
    cJSON *item = cJSON_CreateObject();

    // contest_type_detail->id
    if (!contest_type_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", contest_type_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // contest_type_detail->name
    if (!contest_type_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", contest_type_detail->name) == NULL) {
    goto fail; //String
    }


    // contest_type_detail->berry_flavor
    if (!contest_type_detail->berry_flavor) {
        goto fail;
    }
    cJSON *berry_flavor_local_JSON = berry_flavor_summary_convertToJSON(contest_type_detail->berry_flavor);
    if(berry_flavor_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "berry_flavor", berry_flavor_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // contest_type_detail->names
    if (!contest_type_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (contest_type_detail->names) {
    list_ForEach(namesListEntry, contest_type_detail->names) {
    cJSON *itemLocal = contest_type_name_convertToJSON(namesListEntry->data);
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

contest_type_detail_t *contest_type_detail_parseFromJSON(cJSON *contest_type_detailJSON){

    contest_type_detail_t *contest_type_detail_local_var = NULL;

    // define the local variable for contest_type_detail->berry_flavor
    berry_flavor_summary_t *berry_flavor_local_nonprim = NULL;

    // define the local list for contest_type_detail->names
    list_t *namesList = NULL;

    // contest_type_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(contest_type_detailJSON, "id");
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

    // contest_type_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(contest_type_detailJSON, "name");
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

    // contest_type_detail->berry_flavor
    cJSON *berry_flavor = cJSON_GetObjectItemCaseSensitive(contest_type_detailJSON, "berry_flavor");
    if (cJSON_IsNull(berry_flavor)) {
        berry_flavor = NULL;
    }
    if (!berry_flavor) {
        goto end;
    }

    
    berry_flavor_local_nonprim = berry_flavor_summary_parseFromJSON(berry_flavor); //nonprimitive

    // contest_type_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(contest_type_detailJSON, "names");
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
        contest_type_name_t *namesItem = contest_type_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }


    contest_type_detail_local_var = contest_type_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        berry_flavor_local_nonprim,
        namesList
        );

    return contest_type_detail_local_var;
end:
    if (berry_flavor_local_nonprim) {
        berry_flavor_summary_free(berry_flavor_local_nonprim);
        berry_flavor_local_nonprim = NULL;
    }
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            contest_type_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    return NULL;

}
