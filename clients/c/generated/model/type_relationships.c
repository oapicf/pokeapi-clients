#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "type_relationships.h"



static type_relationships_t *type_relationships_create_internal(
    list_t *no_damage_to,
    list_t *half_damage_to,
    list_t *double_damage_to,
    list_t *no_damage_from,
    list_t *half_damage_from,
    list_t *double_damage_from
    ) {
    type_relationships_t *type_relationships_local_var = malloc(sizeof(type_relationships_t));
    if (!type_relationships_local_var) {
        return NULL;
    }
    memset(type_relationships_local_var, 0, sizeof(type_relationships_t));
    type_relationships_local_var->_library_owned = 1;
    type_relationships_local_var->no_damage_to = no_damage_to;
    type_relationships_local_var->half_damage_to = half_damage_to;
    type_relationships_local_var->double_damage_to = double_damage_to;
    type_relationships_local_var->no_damage_from = no_damage_from;
    type_relationships_local_var->half_damage_from = half_damage_from;
    type_relationships_local_var->double_damage_from = double_damage_from;
    return type_relationships_local_var;
}

__attribute__((deprecated)) type_relationships_t *type_relationships_create(
    list_t *no_damage_to,
    list_t *half_damage_to,
    list_t *double_damage_to,
    list_t *no_damage_from,
    list_t *half_damage_from,
    list_t *double_damage_from
    ) {
    type_relationships_t *result = type_relationships_create_internal (
        no_damage_to,
        half_damage_to,
        double_damage_to,
        no_damage_from,
        half_damage_from,
        double_damage_from
        );
    if (!result) {
    }
    return result;
}

void type_relationships_free(type_relationships_t *type_relationships) {
    if(NULL == type_relationships){
        return ;
    }
    if(type_relationships->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "type_relationships_free");
        return ;
    }
    listEntry_t *listEntry;
    if (type_relationships->no_damage_to) {
        list_ForEach(listEntry, type_relationships->no_damage_to) {
            type_summary_free(listEntry->data);
        }
        list_freeList(type_relationships->no_damage_to);
        type_relationships->no_damage_to = NULL;
    }
    if (type_relationships->half_damage_to) {
        list_ForEach(listEntry, type_relationships->half_damage_to) {
            type_summary_free(listEntry->data);
        }
        list_freeList(type_relationships->half_damage_to);
        type_relationships->half_damage_to = NULL;
    }
    if (type_relationships->double_damage_to) {
        list_ForEach(listEntry, type_relationships->double_damage_to) {
            type_summary_free(listEntry->data);
        }
        list_freeList(type_relationships->double_damage_to);
        type_relationships->double_damage_to = NULL;
    }
    if (type_relationships->no_damage_from) {
        list_ForEach(listEntry, type_relationships->no_damage_from) {
            type_summary_free(listEntry->data);
        }
        list_freeList(type_relationships->no_damage_from);
        type_relationships->no_damage_from = NULL;
    }
    if (type_relationships->half_damage_from) {
        list_ForEach(listEntry, type_relationships->half_damage_from) {
            type_summary_free(listEntry->data);
        }
        list_freeList(type_relationships->half_damage_from);
        type_relationships->half_damage_from = NULL;
    }
    if (type_relationships->double_damage_from) {
        list_ForEach(listEntry, type_relationships->double_damage_from) {
            type_summary_free(listEntry->data);
        }
        list_freeList(type_relationships->double_damage_from);
        type_relationships->double_damage_from = NULL;
    }
    free(type_relationships);
}

cJSON *type_relationships_convertToJSON(type_relationships_t *type_relationships) {
    cJSON *item = cJSON_CreateObject();

    // type_relationships->no_damage_to
    if (!type_relationships->no_damage_to) {
        goto fail;
    }
    cJSON *no_damage_to = cJSON_AddArrayToObject(item, "no_damage_to");
    if(no_damage_to == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *no_damage_toListEntry;
    if (type_relationships->no_damage_to) {
    list_ForEach(no_damage_toListEntry, type_relationships->no_damage_to) {
    cJSON *itemLocal = type_summary_convertToJSON(no_damage_toListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(no_damage_to, itemLocal);
    }
    }


    // type_relationships->half_damage_to
    if (!type_relationships->half_damage_to) {
        goto fail;
    }
    cJSON *half_damage_to = cJSON_AddArrayToObject(item, "half_damage_to");
    if(half_damage_to == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *half_damage_toListEntry;
    if (type_relationships->half_damage_to) {
    list_ForEach(half_damage_toListEntry, type_relationships->half_damage_to) {
    cJSON *itemLocal = type_summary_convertToJSON(half_damage_toListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(half_damage_to, itemLocal);
    }
    }


    // type_relationships->double_damage_to
    if (!type_relationships->double_damage_to) {
        goto fail;
    }
    cJSON *double_damage_to = cJSON_AddArrayToObject(item, "double_damage_to");
    if(double_damage_to == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *double_damage_toListEntry;
    if (type_relationships->double_damage_to) {
    list_ForEach(double_damage_toListEntry, type_relationships->double_damage_to) {
    cJSON *itemLocal = type_summary_convertToJSON(double_damage_toListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(double_damage_to, itemLocal);
    }
    }


    // type_relationships->no_damage_from
    if (!type_relationships->no_damage_from) {
        goto fail;
    }
    cJSON *no_damage_from = cJSON_AddArrayToObject(item, "no_damage_from");
    if(no_damage_from == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *no_damage_fromListEntry;
    if (type_relationships->no_damage_from) {
    list_ForEach(no_damage_fromListEntry, type_relationships->no_damage_from) {
    cJSON *itemLocal = type_summary_convertToJSON(no_damage_fromListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(no_damage_from, itemLocal);
    }
    }


    // type_relationships->half_damage_from
    if (!type_relationships->half_damage_from) {
        goto fail;
    }
    cJSON *half_damage_from = cJSON_AddArrayToObject(item, "half_damage_from");
    if(half_damage_from == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *half_damage_fromListEntry;
    if (type_relationships->half_damage_from) {
    list_ForEach(half_damage_fromListEntry, type_relationships->half_damage_from) {
    cJSON *itemLocal = type_summary_convertToJSON(half_damage_fromListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(half_damage_from, itemLocal);
    }
    }


    // type_relationships->double_damage_from
    if (!type_relationships->double_damage_from) {
        goto fail;
    }
    cJSON *double_damage_from = cJSON_AddArrayToObject(item, "double_damage_from");
    if(double_damage_from == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *double_damage_fromListEntry;
    if (type_relationships->double_damage_from) {
    list_ForEach(double_damage_fromListEntry, type_relationships->double_damage_from) {
    cJSON *itemLocal = type_summary_convertToJSON(double_damage_fromListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(double_damage_from, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

type_relationships_t *type_relationships_parseFromJSON(cJSON *type_relationshipsJSON){

    type_relationships_t *type_relationships_local_var = NULL;

    // define the local list for type_relationships->no_damage_to
    list_t *no_damage_toList = NULL;

    // define the local list for type_relationships->half_damage_to
    list_t *half_damage_toList = NULL;

    // define the local list for type_relationships->double_damage_to
    list_t *double_damage_toList = NULL;

    // define the local list for type_relationships->no_damage_from
    list_t *no_damage_fromList = NULL;

    // define the local list for type_relationships->half_damage_from
    list_t *half_damage_fromList = NULL;

    // define the local list for type_relationships->double_damage_from
    list_t *double_damage_fromList = NULL;

    // type_relationships->no_damage_to
    cJSON *no_damage_to = cJSON_GetObjectItemCaseSensitive(type_relationshipsJSON, "no_damage_to");
    if (cJSON_IsNull(no_damage_to)) {
        no_damage_to = NULL;
    }
    if (!no_damage_to) {
        goto end;
    }

    
    cJSON *no_damage_to_local_nonprimitive = NULL;
    if(!cJSON_IsArray(no_damage_to)){
        goto end; //nonprimitive container
    }

    no_damage_toList = list_createList();

    cJSON_ArrayForEach(no_damage_to_local_nonprimitive,no_damage_to )
    {
        if(!cJSON_IsObject(no_damage_to_local_nonprimitive)){
            goto end;
        }
        type_summary_t *no_damage_toItem = type_summary_parseFromJSON(no_damage_to_local_nonprimitive);

        list_addElement(no_damage_toList, no_damage_toItem);
    }

    // type_relationships->half_damage_to
    cJSON *half_damage_to = cJSON_GetObjectItemCaseSensitive(type_relationshipsJSON, "half_damage_to");
    if (cJSON_IsNull(half_damage_to)) {
        half_damage_to = NULL;
    }
    if (!half_damage_to) {
        goto end;
    }

    
    cJSON *half_damage_to_local_nonprimitive = NULL;
    if(!cJSON_IsArray(half_damage_to)){
        goto end; //nonprimitive container
    }

    half_damage_toList = list_createList();

    cJSON_ArrayForEach(half_damage_to_local_nonprimitive,half_damage_to )
    {
        if(!cJSON_IsObject(half_damage_to_local_nonprimitive)){
            goto end;
        }
        type_summary_t *half_damage_toItem = type_summary_parseFromJSON(half_damage_to_local_nonprimitive);

        list_addElement(half_damage_toList, half_damage_toItem);
    }

    // type_relationships->double_damage_to
    cJSON *double_damage_to = cJSON_GetObjectItemCaseSensitive(type_relationshipsJSON, "double_damage_to");
    if (cJSON_IsNull(double_damage_to)) {
        double_damage_to = NULL;
    }
    if (!double_damage_to) {
        goto end;
    }

    
    cJSON *double_damage_to_local_nonprimitive = NULL;
    if(!cJSON_IsArray(double_damage_to)){
        goto end; //nonprimitive container
    }

    double_damage_toList = list_createList();

    cJSON_ArrayForEach(double_damage_to_local_nonprimitive,double_damage_to )
    {
        if(!cJSON_IsObject(double_damage_to_local_nonprimitive)){
            goto end;
        }
        type_summary_t *double_damage_toItem = type_summary_parseFromJSON(double_damage_to_local_nonprimitive);

        list_addElement(double_damage_toList, double_damage_toItem);
    }

    // type_relationships->no_damage_from
    cJSON *no_damage_from = cJSON_GetObjectItemCaseSensitive(type_relationshipsJSON, "no_damage_from");
    if (cJSON_IsNull(no_damage_from)) {
        no_damage_from = NULL;
    }
    if (!no_damage_from) {
        goto end;
    }

    
    cJSON *no_damage_from_local_nonprimitive = NULL;
    if(!cJSON_IsArray(no_damage_from)){
        goto end; //nonprimitive container
    }

    no_damage_fromList = list_createList();

    cJSON_ArrayForEach(no_damage_from_local_nonprimitive,no_damage_from )
    {
        if(!cJSON_IsObject(no_damage_from_local_nonprimitive)){
            goto end;
        }
        type_summary_t *no_damage_fromItem = type_summary_parseFromJSON(no_damage_from_local_nonprimitive);

        list_addElement(no_damage_fromList, no_damage_fromItem);
    }

    // type_relationships->half_damage_from
    cJSON *half_damage_from = cJSON_GetObjectItemCaseSensitive(type_relationshipsJSON, "half_damage_from");
    if (cJSON_IsNull(half_damage_from)) {
        half_damage_from = NULL;
    }
    if (!half_damage_from) {
        goto end;
    }

    
    cJSON *half_damage_from_local_nonprimitive = NULL;
    if(!cJSON_IsArray(half_damage_from)){
        goto end; //nonprimitive container
    }

    half_damage_fromList = list_createList();

    cJSON_ArrayForEach(half_damage_from_local_nonprimitive,half_damage_from )
    {
        if(!cJSON_IsObject(half_damage_from_local_nonprimitive)){
            goto end;
        }
        type_summary_t *half_damage_fromItem = type_summary_parseFromJSON(half_damage_from_local_nonprimitive);

        list_addElement(half_damage_fromList, half_damage_fromItem);
    }

    // type_relationships->double_damage_from
    cJSON *double_damage_from = cJSON_GetObjectItemCaseSensitive(type_relationshipsJSON, "double_damage_from");
    if (cJSON_IsNull(double_damage_from)) {
        double_damage_from = NULL;
    }
    if (!double_damage_from) {
        goto end;
    }

    
    cJSON *double_damage_from_local_nonprimitive = NULL;
    if(!cJSON_IsArray(double_damage_from)){
        goto end; //nonprimitive container
    }

    double_damage_fromList = list_createList();

    cJSON_ArrayForEach(double_damage_from_local_nonprimitive,double_damage_from )
    {
        if(!cJSON_IsObject(double_damage_from_local_nonprimitive)){
            goto end;
        }
        type_summary_t *double_damage_fromItem = type_summary_parseFromJSON(double_damage_from_local_nonprimitive);

        list_addElement(double_damage_fromList, double_damage_fromItem);
    }



    type_relationships_local_var = type_relationships_create_internal (
        no_damage_toList,
        half_damage_toList,
        double_damage_toList,
        no_damage_fromList,
        half_damage_fromList,
        double_damage_fromList
        );

    if (!type_relationships_local_var) {
        goto end;
    }

    return type_relationships_local_var;
end:
    if (no_damage_toList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, no_damage_toList) {
            type_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(no_damage_toList);
        no_damage_toList = NULL;
    }
    if (half_damage_toList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, half_damage_toList) {
            type_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(half_damage_toList);
        half_damage_toList = NULL;
    }
    if (double_damage_toList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, double_damage_toList) {
            type_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(double_damage_toList);
        double_damage_toList = NULL;
    }
    if (no_damage_fromList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, no_damage_fromList) {
            type_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(no_damage_fromList);
        no_damage_fromList = NULL;
    }
    if (half_damage_fromList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, half_damage_fromList) {
            type_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(half_damage_fromList);
        half_damage_fromList = NULL;
    }
    if (double_damage_fromList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, double_damage_fromList) {
            type_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(double_damage_fromList);
        double_damage_fromList = NULL;
    }
    return NULL;

}
