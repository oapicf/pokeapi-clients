#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_effect_change.h"



static move_effect_change_t *move_effect_change_create_internal(
    version_group_summary_t *version_group,
    list_t *effect_entries
    ) {
    move_effect_change_t *move_effect_change_local_var = malloc(sizeof(move_effect_change_t));
    if (!move_effect_change_local_var) {
        return NULL;
    }
    memset(move_effect_change_local_var, 0, sizeof(move_effect_change_t));
    move_effect_change_local_var->_library_owned = 1;
    move_effect_change_local_var->version_group = version_group;
    move_effect_change_local_var->effect_entries = effect_entries;
    return move_effect_change_local_var;
}

__attribute__((deprecated)) move_effect_change_t *move_effect_change_create(
    version_group_summary_t *version_group,
    list_t *effect_entries
    ) {
    move_effect_change_t *result = move_effect_change_create_internal (
        version_group,
        effect_entries
        );
    if (!result) {
    }
    return result;
}

void move_effect_change_free(move_effect_change_t *move_effect_change) {
    if(NULL == move_effect_change){
        return ;
    }
    if(move_effect_change->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_effect_change_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_effect_change->version_group) {
        version_group_summary_free(move_effect_change->version_group);
        move_effect_change->version_group = NULL;
    }
    if (move_effect_change->effect_entries) {
        list_ForEach(listEntry, move_effect_change->effect_entries) {
            move_effect_change_effect_text_free(listEntry->data);
        }
        list_freeList(move_effect_change->effect_entries);
        move_effect_change->effect_entries = NULL;
    }
    free(move_effect_change);
}

cJSON *move_effect_change_convertToJSON(move_effect_change_t *move_effect_change) {
    cJSON *item = cJSON_CreateObject();

    // move_effect_change->version_group
    if (!move_effect_change->version_group) {
        goto fail;
    }
    cJSON *version_group_local_JSON = version_group_summary_convertToJSON(move_effect_change->version_group);
    if(version_group_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "version_group", version_group_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // move_effect_change->effect_entries
    if (!move_effect_change->effect_entries) {
        goto fail;
    }
    cJSON *effect_entries = cJSON_AddArrayToObject(item, "effect_entries");
    if(effect_entries == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *effect_entriesListEntry;
    if (move_effect_change->effect_entries) {
    list_ForEach(effect_entriesListEntry, move_effect_change->effect_entries) {
    cJSON *itemLocal = move_effect_change_effect_text_convertToJSON(effect_entriesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(effect_entries, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

move_effect_change_t *move_effect_change_parseFromJSON(cJSON *move_effect_changeJSON){

    move_effect_change_t *move_effect_change_local_var = NULL;

    // define the local variable for move_effect_change->version_group
    version_group_summary_t *version_group_local_nonprim = NULL;

    // define the local list for move_effect_change->effect_entries
    list_t *effect_entriesList = NULL;

    // move_effect_change->version_group
    cJSON *version_group = cJSON_GetObjectItemCaseSensitive(move_effect_changeJSON, "version_group");
    if (cJSON_IsNull(version_group)) {
        version_group = NULL;
    }
    if (!version_group) {
        goto end;
    }

    
    version_group_local_nonprim = version_group_summary_parseFromJSON(version_group); //nonprimitive

    // move_effect_change->effect_entries
    cJSON *effect_entries = cJSON_GetObjectItemCaseSensitive(move_effect_changeJSON, "effect_entries");
    if (cJSON_IsNull(effect_entries)) {
        effect_entries = NULL;
    }
    if (!effect_entries) {
        goto end;
    }

    
    cJSON *effect_entries_local_nonprimitive = NULL;
    if(!cJSON_IsArray(effect_entries)){
        goto end; //nonprimitive container
    }

    effect_entriesList = list_createList();

    cJSON_ArrayForEach(effect_entries_local_nonprimitive,effect_entries )
    {
        if(!cJSON_IsObject(effect_entries_local_nonprimitive)){
            goto end;
        }
        move_effect_change_effect_text_t *effect_entriesItem = move_effect_change_effect_text_parseFromJSON(effect_entries_local_nonprimitive);

        list_addElement(effect_entriesList, effect_entriesItem);
    }



    move_effect_change_local_var = move_effect_change_create_internal (
        version_group_local_nonprim,
        effect_entriesList
        );

    if (!move_effect_change_local_var) {
        goto end;
    }

    return move_effect_change_local_var;
end:
    if (version_group_local_nonprim) {
        version_group_summary_free(version_group_local_nonprim);
        version_group_local_nonprim = NULL;
    }
    if (effect_entriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, effect_entriesList) {
            move_effect_change_effect_text_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(effect_entriesList);
        effect_entriesList = NULL;
    }
    return NULL;

}
