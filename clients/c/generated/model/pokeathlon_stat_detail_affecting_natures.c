#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokeathlon_stat_detail_affecting_natures.h"



static pokeathlon_stat_detail_affecting_natures_t *pokeathlon_stat_detail_affecting_natures_create_internal(
    list_t *decrease,
    list_t *increase
    ) {
    pokeathlon_stat_detail_affecting_natures_t *pokeathlon_stat_detail_affecting_natures_local_var = malloc(sizeof(pokeathlon_stat_detail_affecting_natures_t));
    if (!pokeathlon_stat_detail_affecting_natures_local_var) {
        return NULL;
    }
    pokeathlon_stat_detail_affecting_natures_local_var->decrease = decrease;
    pokeathlon_stat_detail_affecting_natures_local_var->increase = increase;

    pokeathlon_stat_detail_affecting_natures_local_var->_library_owned = 1;
    return pokeathlon_stat_detail_affecting_natures_local_var;
}

__attribute__((deprecated)) pokeathlon_stat_detail_affecting_natures_t *pokeathlon_stat_detail_affecting_natures_create(
    list_t *decrease,
    list_t *increase
    ) {
    return pokeathlon_stat_detail_affecting_natures_create_internal (
        decrease,
        increase
        );
}

void pokeathlon_stat_detail_affecting_natures_free(pokeathlon_stat_detail_affecting_natures_t *pokeathlon_stat_detail_affecting_natures) {
    if(NULL == pokeathlon_stat_detail_affecting_natures){
        return ;
    }
    if(pokeathlon_stat_detail_affecting_natures->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokeathlon_stat_detail_affecting_natures_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokeathlon_stat_detail_affecting_natures->decrease) {
        list_ForEach(listEntry, pokeathlon_stat_detail_affecting_natures->decrease) {
            pokeathlon_stat_detail_affecting_natures_decrease_inner_free(listEntry->data);
        }
        list_freeList(pokeathlon_stat_detail_affecting_natures->decrease);
        pokeathlon_stat_detail_affecting_natures->decrease = NULL;
    }
    if (pokeathlon_stat_detail_affecting_natures->increase) {
        list_ForEach(listEntry, pokeathlon_stat_detail_affecting_natures->increase) {
            pokeathlon_stat_detail_affecting_natures_increase_inner_free(listEntry->data);
        }
        list_freeList(pokeathlon_stat_detail_affecting_natures->increase);
        pokeathlon_stat_detail_affecting_natures->increase = NULL;
    }
    free(pokeathlon_stat_detail_affecting_natures);
}

cJSON *pokeathlon_stat_detail_affecting_natures_convertToJSON(pokeathlon_stat_detail_affecting_natures_t *pokeathlon_stat_detail_affecting_natures) {
    cJSON *item = cJSON_CreateObject();

    // pokeathlon_stat_detail_affecting_natures->decrease
    if (!pokeathlon_stat_detail_affecting_natures->decrease) {
        goto fail;
    }
    cJSON *decrease = cJSON_AddArrayToObject(item, "decrease");
    if(decrease == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *decreaseListEntry;
    if (pokeathlon_stat_detail_affecting_natures->decrease) {
    list_ForEach(decreaseListEntry, pokeathlon_stat_detail_affecting_natures->decrease) {
    cJSON *itemLocal = pokeathlon_stat_detail_affecting_natures_decrease_inner_convertToJSON(decreaseListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(decrease, itemLocal);
    }
    }


    // pokeathlon_stat_detail_affecting_natures->increase
    if (!pokeathlon_stat_detail_affecting_natures->increase) {
        goto fail;
    }
    cJSON *increase = cJSON_AddArrayToObject(item, "increase");
    if(increase == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *increaseListEntry;
    if (pokeathlon_stat_detail_affecting_natures->increase) {
    list_ForEach(increaseListEntry, pokeathlon_stat_detail_affecting_natures->increase) {
    cJSON *itemLocal = pokeathlon_stat_detail_affecting_natures_increase_inner_convertToJSON(increaseListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(increase, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokeathlon_stat_detail_affecting_natures_t *pokeathlon_stat_detail_affecting_natures_parseFromJSON(cJSON *pokeathlon_stat_detail_affecting_naturesJSON){

    pokeathlon_stat_detail_affecting_natures_t *pokeathlon_stat_detail_affecting_natures_local_var = NULL;

    // define the local list for pokeathlon_stat_detail_affecting_natures->decrease
    list_t *decreaseList = NULL;

    // define the local list for pokeathlon_stat_detail_affecting_natures->increase
    list_t *increaseList = NULL;

    // pokeathlon_stat_detail_affecting_natures->decrease
    cJSON *decrease = cJSON_GetObjectItemCaseSensitive(pokeathlon_stat_detail_affecting_naturesJSON, "decrease");
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
        pokeathlon_stat_detail_affecting_natures_decrease_inner_t *decreaseItem = pokeathlon_stat_detail_affecting_natures_decrease_inner_parseFromJSON(decrease_local_nonprimitive);

        list_addElement(decreaseList, decreaseItem);
    }

    // pokeathlon_stat_detail_affecting_natures->increase
    cJSON *increase = cJSON_GetObjectItemCaseSensitive(pokeathlon_stat_detail_affecting_naturesJSON, "increase");
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
        pokeathlon_stat_detail_affecting_natures_increase_inner_t *increaseItem = pokeathlon_stat_detail_affecting_natures_increase_inner_parseFromJSON(increase_local_nonprimitive);

        list_addElement(increaseList, increaseItem);
    }


    pokeathlon_stat_detail_affecting_natures_local_var = pokeathlon_stat_detail_affecting_natures_create_internal (
        decreaseList,
        increaseList
        );

    return pokeathlon_stat_detail_affecting_natures_local_var;
end:
    if (decreaseList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, decreaseList) {
            pokeathlon_stat_detail_affecting_natures_decrease_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(decreaseList);
        decreaseList = NULL;
    }
    if (increaseList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, increaseList) {
            pokeathlon_stat_detail_affecting_natures_increase_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(increaseList);
        increaseList = NULL;
    }
    return NULL;

}
