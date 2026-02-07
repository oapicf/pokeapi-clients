#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "stat_detail_affecting_natures.h"



static stat_detail_affecting_natures_t *stat_detail_affecting_natures_create_internal(
    list_t *increase,
    list_t *decrease
    ) {
    stat_detail_affecting_natures_t *stat_detail_affecting_natures_local_var = malloc(sizeof(stat_detail_affecting_natures_t));
    if (!stat_detail_affecting_natures_local_var) {
        return NULL;
    }
    stat_detail_affecting_natures_local_var->increase = increase;
    stat_detail_affecting_natures_local_var->decrease = decrease;

    stat_detail_affecting_natures_local_var->_library_owned = 1;
    return stat_detail_affecting_natures_local_var;
}

__attribute__((deprecated)) stat_detail_affecting_natures_t *stat_detail_affecting_natures_create(
    list_t *increase,
    list_t *decrease
    ) {
    return stat_detail_affecting_natures_create_internal (
        increase,
        decrease
        );
}

void stat_detail_affecting_natures_free(stat_detail_affecting_natures_t *stat_detail_affecting_natures) {
    if(NULL == stat_detail_affecting_natures){
        return ;
    }
    if(stat_detail_affecting_natures->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "stat_detail_affecting_natures_free");
        return ;
    }
    listEntry_t *listEntry;
    if (stat_detail_affecting_natures->increase) {
        list_ForEach(listEntry, stat_detail_affecting_natures->increase) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
        }
        list_freeList(stat_detail_affecting_natures->increase);
        stat_detail_affecting_natures->increase = NULL;
    }
    if (stat_detail_affecting_natures->decrease) {
        list_ForEach(listEntry, stat_detail_affecting_natures->decrease) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
        }
        list_freeList(stat_detail_affecting_natures->decrease);
        stat_detail_affecting_natures->decrease = NULL;
    }
    free(stat_detail_affecting_natures);
}

cJSON *stat_detail_affecting_natures_convertToJSON(stat_detail_affecting_natures_t *stat_detail_affecting_natures) {
    cJSON *item = cJSON_CreateObject();

    // stat_detail_affecting_natures->increase
    if (!stat_detail_affecting_natures->increase) {
        goto fail;
    }
    cJSON *increase = cJSON_AddArrayToObject(item, "increase");
    if(increase == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *increaseListEntry;
    if (stat_detail_affecting_natures->increase) {
    list_ForEach(increaseListEntry, stat_detail_affecting_natures->increase) {
    cJSON *itemLocal = ability_detail_pokemon_inner_pokemon_convertToJSON(increaseListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(increase, itemLocal);
    }
    }


    // stat_detail_affecting_natures->decrease
    if (!stat_detail_affecting_natures->decrease) {
        goto fail;
    }
    cJSON *decrease = cJSON_AddArrayToObject(item, "decrease");
    if(decrease == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *decreaseListEntry;
    if (stat_detail_affecting_natures->decrease) {
    list_ForEach(decreaseListEntry, stat_detail_affecting_natures->decrease) {
    cJSON *itemLocal = ability_detail_pokemon_inner_pokemon_convertToJSON(decreaseListEntry->data);
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

stat_detail_affecting_natures_t *stat_detail_affecting_natures_parseFromJSON(cJSON *stat_detail_affecting_naturesJSON){

    stat_detail_affecting_natures_t *stat_detail_affecting_natures_local_var = NULL;

    // define the local list for stat_detail_affecting_natures->increase
    list_t *increaseList = NULL;

    // define the local list for stat_detail_affecting_natures->decrease
    list_t *decreaseList = NULL;

    // stat_detail_affecting_natures->increase
    cJSON *increase = cJSON_GetObjectItemCaseSensitive(stat_detail_affecting_naturesJSON, "increase");
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
        ability_detail_pokemon_inner_pokemon_t *increaseItem = ability_detail_pokemon_inner_pokemon_parseFromJSON(increase_local_nonprimitive);

        list_addElement(increaseList, increaseItem);
    }

    // stat_detail_affecting_natures->decrease
    cJSON *decrease = cJSON_GetObjectItemCaseSensitive(stat_detail_affecting_naturesJSON, "decrease");
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
        ability_detail_pokemon_inner_pokemon_t *decreaseItem = ability_detail_pokemon_inner_pokemon_parseFromJSON(decrease_local_nonprimitive);

        list_addElement(decreaseList, decreaseItem);
    }


    stat_detail_affecting_natures_local_var = stat_detail_affecting_natures_create_internal (
        increaseList,
        decreaseList
        );

    return stat_detail_affecting_natures_local_var;
end:
    if (increaseList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, increaseList) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(increaseList);
        increaseList = NULL;
    }
    if (decreaseList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, decreaseList) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(decreaseList);
        decreaseList = NULL;
    }
    return NULL;

}
