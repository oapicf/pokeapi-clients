#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "stat_affecting_natures.h"



static stat_affecting_natures_t *stat_affecting_natures_create_internal(
    list_t *increase,
    list_t *decrease
    ) {
    stat_affecting_natures_t *stat_affecting_natures_local_var = malloc(sizeof(stat_affecting_natures_t));
    if (!stat_affecting_natures_local_var) {
        return NULL;
    }
    memset(stat_affecting_natures_local_var, 0, sizeof(stat_affecting_natures_t));
    stat_affecting_natures_local_var->_library_owned = 1;
    stat_affecting_natures_local_var->increase = increase;
    stat_affecting_natures_local_var->decrease = decrease;
    return stat_affecting_natures_local_var;
}

__attribute__((deprecated)) stat_affecting_natures_t *stat_affecting_natures_create(
    list_t *increase,
    list_t *decrease
    ) {
    stat_affecting_natures_t *result = stat_affecting_natures_create_internal (
        increase,
        decrease
        );
    if (!result) {
    }
    return result;
}

void stat_affecting_natures_free(stat_affecting_natures_t *stat_affecting_natures) {
    if(NULL == stat_affecting_natures){
        return ;
    }
    if(stat_affecting_natures->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "stat_affecting_natures_free");
        return ;
    }
    listEntry_t *listEntry;
    if (stat_affecting_natures->increase) {
        list_ForEach(listEntry, stat_affecting_natures->increase) {
            nature_summary_free(listEntry->data);
        }
        list_freeList(stat_affecting_natures->increase);
        stat_affecting_natures->increase = NULL;
    }
    if (stat_affecting_natures->decrease) {
        list_ForEach(listEntry, stat_affecting_natures->decrease) {
            nature_summary_free(listEntry->data);
        }
        list_freeList(stat_affecting_natures->decrease);
        stat_affecting_natures->decrease = NULL;
    }
    free(stat_affecting_natures);
}

cJSON *stat_affecting_natures_convertToJSON(stat_affecting_natures_t *stat_affecting_natures) {
    cJSON *item = cJSON_CreateObject();

    // stat_affecting_natures->increase
    if (!stat_affecting_natures->increase) {
        goto fail;
    }
    cJSON *increase = cJSON_AddArrayToObject(item, "increase");
    if(increase == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *increaseListEntry;
    if (stat_affecting_natures->increase) {
    list_ForEach(increaseListEntry, stat_affecting_natures->increase) {
    cJSON *itemLocal = nature_summary_convertToJSON(increaseListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(increase, itemLocal);
    }
    }


    // stat_affecting_natures->decrease
    if (!stat_affecting_natures->decrease) {
        goto fail;
    }
    cJSON *decrease = cJSON_AddArrayToObject(item, "decrease");
    if(decrease == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *decreaseListEntry;
    if (stat_affecting_natures->decrease) {
    list_ForEach(decreaseListEntry, stat_affecting_natures->decrease) {
    cJSON *itemLocal = nature_summary_convertToJSON(decreaseListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(decrease, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

stat_affecting_natures_t *stat_affecting_natures_parseFromJSON(cJSON *stat_affecting_naturesJSON){

    stat_affecting_natures_t *stat_affecting_natures_local_var = NULL;

    // define the local list for stat_affecting_natures->increase
    list_t *increaseList = NULL;

    // define the local list for stat_affecting_natures->decrease
    list_t *decreaseList = NULL;

    // stat_affecting_natures->increase
    cJSON *increase = cJSON_GetObjectItemCaseSensitive(stat_affecting_naturesJSON, "increase");
    if (cJSON_IsNull(increase)) {
        increase = NULL;
    }
    if (!increase) {
        goto end;
    }

    
    cJSON *increase_local_nonprimitive = NULL;
    if(!cJSON_IsArray(increase)){
        goto end; //nonprimitive container
    }

    increaseList = list_createList();

    cJSON_ArrayForEach(increase_local_nonprimitive,increase )
    {
        if(!cJSON_IsObject(increase_local_nonprimitive)){
            goto end;
        }
        nature_summary_t *increaseItem = nature_summary_parseFromJSON(increase_local_nonprimitive);

        list_addElement(increaseList, increaseItem);
    }

    // stat_affecting_natures->decrease
    cJSON *decrease = cJSON_GetObjectItemCaseSensitive(stat_affecting_naturesJSON, "decrease");
    if (cJSON_IsNull(decrease)) {
        decrease = NULL;
    }
    if (!decrease) {
        goto end;
    }

    
    cJSON *decrease_local_nonprimitive = NULL;
    if(!cJSON_IsArray(decrease)){
        goto end; //nonprimitive container
    }

    decreaseList = list_createList();

    cJSON_ArrayForEach(decrease_local_nonprimitive,decrease )
    {
        if(!cJSON_IsObject(decrease_local_nonprimitive)){
            goto end;
        }
        nature_summary_t *decreaseItem = nature_summary_parseFromJSON(decrease_local_nonprimitive);

        list_addElement(decreaseList, decreaseItem);
    }



    stat_affecting_natures_local_var = stat_affecting_natures_create_internal (
        increaseList,
        decreaseList
        );

    if (!stat_affecting_natures_local_var) {
        goto end;
    }

    return stat_affecting_natures_local_var;
end:
    if (increaseList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, increaseList) {
            nature_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(increaseList);
        increaseList = NULL;
    }
    if (decreaseList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, decreaseList) {
            nature_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(decreaseList);
        decreaseList = NULL;
    }
    return NULL;

}
