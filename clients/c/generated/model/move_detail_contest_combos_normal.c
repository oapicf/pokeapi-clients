#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_detail_contest_combos_normal.h"



static move_detail_contest_combos_normal_t *move_detail_contest_combos_normal_create_internal(
    list_t *use_before,
    list_t *use_after
    ) {
    move_detail_contest_combos_normal_t *move_detail_contest_combos_normal_local_var = malloc(sizeof(move_detail_contest_combos_normal_t));
    if (!move_detail_contest_combos_normal_local_var) {
        return NULL;
    }
    move_detail_contest_combos_normal_local_var->use_before = use_before;
    move_detail_contest_combos_normal_local_var->use_after = use_after;

    move_detail_contest_combos_normal_local_var->_library_owned = 1;
    return move_detail_contest_combos_normal_local_var;
}

__attribute__((deprecated)) move_detail_contest_combos_normal_t *move_detail_contest_combos_normal_create(
    list_t *use_before,
    list_t *use_after
    ) {
    return move_detail_contest_combos_normal_create_internal (
        use_before,
        use_after
        );
}

void move_detail_contest_combos_normal_free(move_detail_contest_combos_normal_t *move_detail_contest_combos_normal) {
    if(NULL == move_detail_contest_combos_normal){
        return ;
    }
    if(move_detail_contest_combos_normal->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_detail_contest_combos_normal_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_detail_contest_combos_normal->use_before) {
        list_ForEach(listEntry, move_detail_contest_combos_normal->use_before) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
        }
        list_freeList(move_detail_contest_combos_normal->use_before);
        move_detail_contest_combos_normal->use_before = NULL;
    }
    if (move_detail_contest_combos_normal->use_after) {
        list_ForEach(listEntry, move_detail_contest_combos_normal->use_after) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
        }
        list_freeList(move_detail_contest_combos_normal->use_after);
        move_detail_contest_combos_normal->use_after = NULL;
    }
    free(move_detail_contest_combos_normal);
}

cJSON *move_detail_contest_combos_normal_convertToJSON(move_detail_contest_combos_normal_t *move_detail_contest_combos_normal) {
    cJSON *item = cJSON_CreateObject();

    // move_detail_contest_combos_normal->use_before
    if (!move_detail_contest_combos_normal->use_before) {
        goto fail;
    }
    cJSON *use_before = cJSON_AddArrayToObject(item, "use_before");
    if(use_before == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *use_beforeListEntry;
    if (move_detail_contest_combos_normal->use_before) {
    list_ForEach(use_beforeListEntry, move_detail_contest_combos_normal->use_before) {
    cJSON *itemLocal = ability_detail_pokemon_inner_pokemon_convertToJSON(use_beforeListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(use_before, itemLocal);
    }
    }


    // move_detail_contest_combos_normal->use_after
    if (!move_detail_contest_combos_normal->use_after) {
        goto fail;
    }
    cJSON *use_after = cJSON_AddArrayToObject(item, "use_after");
    if(use_after == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *use_afterListEntry;
    if (move_detail_contest_combos_normal->use_after) {
    list_ForEach(use_afterListEntry, move_detail_contest_combos_normal->use_after) {
    cJSON *itemLocal = ability_detail_pokemon_inner_pokemon_convertToJSON(use_afterListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(use_after, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

move_detail_contest_combos_normal_t *move_detail_contest_combos_normal_parseFromJSON(cJSON *move_detail_contest_combos_normalJSON){

    move_detail_contest_combos_normal_t *move_detail_contest_combos_normal_local_var = NULL;

    // define the local list for move_detail_contest_combos_normal->use_before
    list_t *use_beforeList = NULL;

    // define the local list for move_detail_contest_combos_normal->use_after
    list_t *use_afterList = NULL;

    // move_detail_contest_combos_normal->use_before
    cJSON *use_before = cJSON_GetObjectItemCaseSensitive(move_detail_contest_combos_normalJSON, "use_before");
    if (cJSON_IsNull(use_before)) {
        use_before = NULL;
    }
    if (!use_before) {
        goto end;
    }

    
    cJSON *use_before_local_nonprimitive = NULL;
    if(!cJSON_IsArray(use_before)){
        goto end; //nonprimitive container
    }

    use_beforeList = list_createList();

    cJSON_ArrayForEach(use_before_local_nonprimitive,use_before )
    {
        if(!cJSON_IsObject(use_before_local_nonprimitive)){
            goto end;
        }
        ability_detail_pokemon_inner_pokemon_t *use_beforeItem = ability_detail_pokemon_inner_pokemon_parseFromJSON(use_before_local_nonprimitive);

        list_addElement(use_beforeList, use_beforeItem);
    }

    // move_detail_contest_combos_normal->use_after
    cJSON *use_after = cJSON_GetObjectItemCaseSensitive(move_detail_contest_combos_normalJSON, "use_after");
    if (cJSON_IsNull(use_after)) {
        use_after = NULL;
    }
    if (!use_after) {
        goto end;
    }

    
    cJSON *use_after_local_nonprimitive = NULL;
    if(!cJSON_IsArray(use_after)){
        goto end; //nonprimitive container
    }

    use_afterList = list_createList();

    cJSON_ArrayForEach(use_after_local_nonprimitive,use_after )
    {
        if(!cJSON_IsObject(use_after_local_nonprimitive)){
            goto end;
        }
        ability_detail_pokemon_inner_pokemon_t *use_afterItem = ability_detail_pokemon_inner_pokemon_parseFromJSON(use_after_local_nonprimitive);

        list_addElement(use_afterList, use_afterItem);
    }


    move_detail_contest_combos_normal_local_var = move_detail_contest_combos_normal_create_internal (
        use_beforeList,
        use_afterList
        );

    return move_detail_contest_combos_normal_local_var;
end:
    if (use_beforeList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, use_beforeList) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(use_beforeList);
        use_beforeList = NULL;
    }
    if (use_afterList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, use_afterList) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(use_afterList);
        use_afterList = NULL;
    }
    return NULL;

}
