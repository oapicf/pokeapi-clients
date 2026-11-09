#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "stat_affecting_moves.h"



static stat_affecting_moves_t *stat_affecting_moves_create_internal(
    list_t *increase,
    list_t *decrease
    ) {
    stat_affecting_moves_t *stat_affecting_moves_local_var = malloc(sizeof(stat_affecting_moves_t));
    if (!stat_affecting_moves_local_var) {
        return NULL;
    }
    memset(stat_affecting_moves_local_var, 0, sizeof(stat_affecting_moves_t));
    stat_affecting_moves_local_var->_library_owned = 1;
    stat_affecting_moves_local_var->increase = increase;
    stat_affecting_moves_local_var->decrease = decrease;
    return stat_affecting_moves_local_var;
}

__attribute__((deprecated)) stat_affecting_moves_t *stat_affecting_moves_create(
    list_t *increase,
    list_t *decrease
    ) {
    stat_affecting_moves_t *result = stat_affecting_moves_create_internal (
        increase,
        decrease
        );
    if (!result) {
    }
    return result;
}

void stat_affecting_moves_free(stat_affecting_moves_t *stat_affecting_moves) {
    if(NULL == stat_affecting_moves){
        return ;
    }
    if(stat_affecting_moves->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "stat_affecting_moves_free");
        return ;
    }
    listEntry_t *listEntry;
    if (stat_affecting_moves->increase) {
        list_ForEach(listEntry, stat_affecting_moves->increase) {
            move_stat_change_free(listEntry->data);
        }
        list_freeList(stat_affecting_moves->increase);
        stat_affecting_moves->increase = NULL;
    }
    if (stat_affecting_moves->decrease) {
        list_ForEach(listEntry, stat_affecting_moves->decrease) {
            move_stat_change_free(listEntry->data);
        }
        list_freeList(stat_affecting_moves->decrease);
        stat_affecting_moves->decrease = NULL;
    }
    free(stat_affecting_moves);
}

cJSON *stat_affecting_moves_convertToJSON(stat_affecting_moves_t *stat_affecting_moves) {
    cJSON *item = cJSON_CreateObject();

    // stat_affecting_moves->increase
    if (!stat_affecting_moves->increase) {
        goto fail;
    }
    cJSON *increase = cJSON_AddArrayToObject(item, "increase");
    if(increase == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *increaseListEntry;
    if (stat_affecting_moves->increase) {
    list_ForEach(increaseListEntry, stat_affecting_moves->increase) {
    cJSON *itemLocal = move_stat_change_convertToJSON(increaseListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(increase, itemLocal);
    }
    }


    // stat_affecting_moves->decrease
    if (!stat_affecting_moves->decrease) {
        goto fail;
    }
    cJSON *decrease = cJSON_AddArrayToObject(item, "decrease");
    if(decrease == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *decreaseListEntry;
    if (stat_affecting_moves->decrease) {
    list_ForEach(decreaseListEntry, stat_affecting_moves->decrease) {
    cJSON *itemLocal = move_stat_change_convertToJSON(decreaseListEntry->data);
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

stat_affecting_moves_t *stat_affecting_moves_parseFromJSON(cJSON *stat_affecting_movesJSON){

    stat_affecting_moves_t *stat_affecting_moves_local_var = NULL;

    // define the local list for stat_affecting_moves->increase
    list_t *increaseList = NULL;

    // define the local list for stat_affecting_moves->decrease
    list_t *decreaseList = NULL;

    // stat_affecting_moves->increase
    cJSON *increase = cJSON_GetObjectItemCaseSensitive(stat_affecting_movesJSON, "increase");
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
        move_stat_change_t *increaseItem = move_stat_change_parseFromJSON(increase_local_nonprimitive);

        list_addElement(increaseList, increaseItem);
    }

    // stat_affecting_moves->decrease
    cJSON *decrease = cJSON_GetObjectItemCaseSensitive(stat_affecting_movesJSON, "decrease");
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
        move_stat_change_t *decreaseItem = move_stat_change_parseFromJSON(decrease_local_nonprimitive);

        list_addElement(decreaseList, decreaseItem);
    }



    stat_affecting_moves_local_var = stat_affecting_moves_create_internal (
        increaseList,
        decreaseList
        );

    if (!stat_affecting_moves_local_var) {
        goto end;
    }

    return stat_affecting_moves_local_var;
end:
    if (increaseList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, increaseList) {
            move_stat_change_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(increaseList);
        increaseList = NULL;
    }
    if (decreaseList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, decreaseList) {
            move_stat_change_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(decreaseList);
        decreaseList = NULL;
    }
    return NULL;

}
