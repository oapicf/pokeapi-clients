#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ability_change.h"



static ability_change_t *ability_change_create_internal(
    version_group_summary_t *version_group,
    list_t *effect_entries
    ) {
    ability_change_t *ability_change_local_var = malloc(sizeof(ability_change_t));
    if (!ability_change_local_var) {
        return NULL;
    }
    ability_change_local_var->version_group = version_group;
    ability_change_local_var->effect_entries = effect_entries;

    ability_change_local_var->_library_owned = 1;
    return ability_change_local_var;
}

__attribute__((deprecated)) ability_change_t *ability_change_create(
    version_group_summary_t *version_group,
    list_t *effect_entries
    ) {
    return ability_change_create_internal (
        version_group,
        effect_entries
        );
}

void ability_change_free(ability_change_t *ability_change) {
    if(NULL == ability_change){
        return ;
    }
    if(ability_change->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ability_change_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ability_change->version_group) {
        version_group_summary_free(ability_change->version_group);
        ability_change->version_group = NULL;
    }
    if (ability_change->effect_entries) {
        list_ForEach(listEntry, ability_change->effect_entries) {
            ability_change_effect_text_free(listEntry->data);
        }
        list_freeList(ability_change->effect_entries);
        ability_change->effect_entries = NULL;
    }
    free(ability_change);
}

cJSON *ability_change_convertToJSON(ability_change_t *ability_change) {
    cJSON *item = cJSON_CreateObject();

    // ability_change->version_group
    if (!ability_change->version_group) {
        goto fail;
    }
    cJSON *version_group_local_JSON = version_group_summary_convertToJSON(ability_change->version_group);
    if(version_group_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "version_group", version_group_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // ability_change->effect_entries
    if (!ability_change->effect_entries) {
        goto fail;
    }
    cJSON *effect_entries = cJSON_AddArrayToObject(item, "effect_entries");
    if(effect_entries == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *effect_entriesListEntry;
    if (ability_change->effect_entries) {
    list_ForEach(effect_entriesListEntry, ability_change->effect_entries) {
    cJSON *itemLocal = ability_change_effect_text_convertToJSON(effect_entriesListEntry->data);
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

ability_change_t *ability_change_parseFromJSON(cJSON *ability_changeJSON){

    ability_change_t *ability_change_local_var = NULL;

    // define the local variable for ability_change->version_group
    version_group_summary_t *version_group_local_nonprim = NULL;

    // define the local list for ability_change->effect_entries
    list_t *effect_entriesList = NULL;

    // ability_change->version_group
    cJSON *version_group = cJSON_GetObjectItemCaseSensitive(ability_changeJSON, "version_group");
    if (cJSON_IsNull(version_group)) {
        version_group = NULL;
    }
    if (!version_group) {
        goto end;
    }

    
    version_group_local_nonprim = version_group_summary_parseFromJSON(version_group); //nonprimitive

    // ability_change->effect_entries
    cJSON *effect_entries = cJSON_GetObjectItemCaseSensitive(ability_changeJSON, "effect_entries");
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
        ability_change_effect_text_t *effect_entriesItem = ability_change_effect_text_parseFromJSON(effect_entries_local_nonprimitive);

        list_addElement(effect_entriesList, effect_entriesItem);
    }


    ability_change_local_var = ability_change_create_internal (
        version_group_local_nonprim,
        effect_entriesList
        );

    return ability_change_local_var;
end:
    if (version_group_local_nonprim) {
        version_group_summary_free(version_group_local_nonprim);
        version_group_local_nonprim = NULL;
    }
    if (effect_entriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, effect_entriesList) {
            ability_change_effect_text_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(effect_entriesList);
        effect_entriesList = NULL;
    }
    return NULL;

}
