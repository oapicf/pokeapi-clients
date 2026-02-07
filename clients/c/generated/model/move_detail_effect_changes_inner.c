#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_detail_effect_changes_inner.h"



static move_detail_effect_changes_inner_t *move_detail_effect_changes_inner_create_internal(
    list_t *effect_entries,
    ability_detail_pokemon_inner_pokemon_t *version_group
    ) {
    move_detail_effect_changes_inner_t *move_detail_effect_changes_inner_local_var = malloc(sizeof(move_detail_effect_changes_inner_t));
    if (!move_detail_effect_changes_inner_local_var) {
        return NULL;
    }
    move_detail_effect_changes_inner_local_var->effect_entries = effect_entries;
    move_detail_effect_changes_inner_local_var->version_group = version_group;

    move_detail_effect_changes_inner_local_var->_library_owned = 1;
    return move_detail_effect_changes_inner_local_var;
}

__attribute__((deprecated)) move_detail_effect_changes_inner_t *move_detail_effect_changes_inner_create(
    list_t *effect_entries,
    ability_detail_pokemon_inner_pokemon_t *version_group
    ) {
    return move_detail_effect_changes_inner_create_internal (
        effect_entries,
        version_group
        );
}

void move_detail_effect_changes_inner_free(move_detail_effect_changes_inner_t *move_detail_effect_changes_inner) {
    if(NULL == move_detail_effect_changes_inner){
        return ;
    }
    if(move_detail_effect_changes_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_detail_effect_changes_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_detail_effect_changes_inner->effect_entries) {
        list_ForEach(listEntry, move_detail_effect_changes_inner->effect_entries) {
            move_detail_effect_changes_inner_effect_entries_inner_free(listEntry->data);
        }
        list_freeList(move_detail_effect_changes_inner->effect_entries);
        move_detail_effect_changes_inner->effect_entries = NULL;
    }
    if (move_detail_effect_changes_inner->version_group) {
        ability_detail_pokemon_inner_pokemon_free(move_detail_effect_changes_inner->version_group);
        move_detail_effect_changes_inner->version_group = NULL;
    }
    free(move_detail_effect_changes_inner);
}

cJSON *move_detail_effect_changes_inner_convertToJSON(move_detail_effect_changes_inner_t *move_detail_effect_changes_inner) {
    cJSON *item = cJSON_CreateObject();

    // move_detail_effect_changes_inner->effect_entries
    if (!move_detail_effect_changes_inner->effect_entries) {
        goto fail;
    }
    cJSON *effect_entries = cJSON_AddArrayToObject(item, "effect_entries");
    if(effect_entries == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *effect_entriesListEntry;
    if (move_detail_effect_changes_inner->effect_entries) {
    list_ForEach(effect_entriesListEntry, move_detail_effect_changes_inner->effect_entries) {
    cJSON *itemLocal = move_detail_effect_changes_inner_effect_entries_inner_convertToJSON(effect_entriesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(effect_entries, itemLocal);
    }
    }


    // move_detail_effect_changes_inner->version_group
    if (!move_detail_effect_changes_inner->version_group) {
        goto fail;
    }
    cJSON *version_group_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(move_detail_effect_changes_inner->version_group);
    if(version_group_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "version_group", version_group_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

move_detail_effect_changes_inner_t *move_detail_effect_changes_inner_parseFromJSON(cJSON *move_detail_effect_changes_innerJSON){

    move_detail_effect_changes_inner_t *move_detail_effect_changes_inner_local_var = NULL;

    // define the local list for move_detail_effect_changes_inner->effect_entries
    list_t *effect_entriesList = NULL;

    // define the local variable for move_detail_effect_changes_inner->version_group
    ability_detail_pokemon_inner_pokemon_t *version_group_local_nonprim = NULL;

    // move_detail_effect_changes_inner->effect_entries
    cJSON *effect_entries = cJSON_GetObjectItemCaseSensitive(move_detail_effect_changes_innerJSON, "effect_entries");
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
        move_detail_effect_changes_inner_effect_entries_inner_t *effect_entriesItem = move_detail_effect_changes_inner_effect_entries_inner_parseFromJSON(effect_entries_local_nonprimitive);

        list_addElement(effect_entriesList, effect_entriesItem);
    }

    // move_detail_effect_changes_inner->version_group
    cJSON *version_group = cJSON_GetObjectItemCaseSensitive(move_detail_effect_changes_innerJSON, "version_group");
    if (cJSON_IsNull(version_group)) {
        version_group = NULL;
    }
    if (!version_group) {
        goto end;
    }

    
    version_group_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(version_group); //nonprimitive


    move_detail_effect_changes_inner_local_var = move_detail_effect_changes_inner_create_internal (
        effect_entriesList,
        version_group_local_nonprim
        );

    return move_detail_effect_changes_inner_local_var;
end:
    if (effect_entriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, effect_entriesList) {
            move_detail_effect_changes_inner_effect_entries_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(effect_entriesList);
        effect_entriesList = NULL;
    }
    if (version_group_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(version_group_local_nonprim);
        version_group_local_nonprim = NULL;
    }
    return NULL;

}
