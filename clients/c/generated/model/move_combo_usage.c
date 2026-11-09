#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_combo_usage.h"



static move_combo_usage_t *move_combo_usage_create_internal(
    list_t *use_before,
    list_t *use_after
    ) {
    move_combo_usage_t *move_combo_usage_local_var = malloc(sizeof(move_combo_usage_t));
    if (!move_combo_usage_local_var) {
        return NULL;
    }
    memset(move_combo_usage_local_var, 0, sizeof(move_combo_usage_t));
    move_combo_usage_local_var->_library_owned = 1;
    move_combo_usage_local_var->use_before = use_before;
    move_combo_usage_local_var->use_after = use_after;
    return move_combo_usage_local_var;
}

__attribute__((deprecated)) move_combo_usage_t *move_combo_usage_create(
    list_t *use_before,
    list_t *use_after
    ) {
    move_combo_usage_t *result = move_combo_usage_create_internal (
        use_before,
        use_after
        );
    if (!result) {
    }
    return result;
}

void move_combo_usage_free(move_combo_usage_t *move_combo_usage) {
    if(NULL == move_combo_usage){
        return ;
    }
    if(move_combo_usage->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_combo_usage_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_combo_usage->use_before) {
        list_ForEach(listEntry, move_combo_usage->use_before) {
            move_summary_free(listEntry->data);
        }
        list_freeList(move_combo_usage->use_before);
        move_combo_usage->use_before = NULL;
    }
    if (move_combo_usage->use_after) {
        list_ForEach(listEntry, move_combo_usage->use_after) {
            move_summary_free(listEntry->data);
        }
        list_freeList(move_combo_usage->use_after);
        move_combo_usage->use_after = NULL;
    }
    free(move_combo_usage);
}

cJSON *move_combo_usage_convertToJSON(move_combo_usage_t *move_combo_usage) {
    cJSON *item = cJSON_CreateObject();

    // move_combo_usage->use_before
    if (!move_combo_usage->use_before) {
        goto fail;
    }
    cJSON *use_before = cJSON_AddArrayToObject(item, "use_before");
    if(use_before == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *use_beforeListEntry;
    if (move_combo_usage->use_before) {
    list_ForEach(use_beforeListEntry, move_combo_usage->use_before) {
    cJSON *itemLocal = move_summary_convertToJSON(use_beforeListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(use_before, itemLocal);
    }
    }


    // move_combo_usage->use_after
    if (!move_combo_usage->use_after) {
        goto fail;
    }
    cJSON *use_after = cJSON_AddArrayToObject(item, "use_after");
    if(use_after == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *use_afterListEntry;
    if (move_combo_usage->use_after) {
    list_ForEach(use_afterListEntry, move_combo_usage->use_after) {
    cJSON *itemLocal = move_summary_convertToJSON(use_afterListEntry->data);
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

move_combo_usage_t *move_combo_usage_parseFromJSON(cJSON *move_combo_usageJSON){

    move_combo_usage_t *move_combo_usage_local_var = NULL;

    // define the local list for move_combo_usage->use_before
    list_t *use_beforeList = NULL;

    // define the local list for move_combo_usage->use_after
    list_t *use_afterList = NULL;

    // move_combo_usage->use_before
    cJSON *use_before = cJSON_GetObjectItemCaseSensitive(move_combo_usageJSON, "use_before");
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
        move_summary_t *use_beforeItem = move_summary_parseFromJSON(use_before_local_nonprimitive);

        list_addElement(use_beforeList, use_beforeItem);
    }

    // move_combo_usage->use_after
    cJSON *use_after = cJSON_GetObjectItemCaseSensitive(move_combo_usageJSON, "use_after");
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
        move_summary_t *use_afterItem = move_summary_parseFromJSON(use_after_local_nonprimitive);

        list_addElement(use_afterList, use_afterItem);
    }



    move_combo_usage_local_var = move_combo_usage_create_internal (
        use_beforeList,
        use_afterList
        );

    if (!move_combo_usage_local_var) {
        goto end;
    }

    return move_combo_usage_local_var;
end:
    if (use_beforeList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, use_beforeList) {
            move_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(use_beforeList);
        use_beforeList = NULL;
    }
    if (use_afterList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, use_afterList) {
            move_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(use_afterList);
        use_afterList = NULL;
    }
    return NULL;

}
