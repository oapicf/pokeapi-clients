#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_change.h"



static move_change_t *move_change_create_internal(
    int *accuracy,
    int *power,
    int *pp,
    int *effect_chance,
    list_t *effect_entries,
    type_summary_t *type,
    version_group_summary_t *version_group
    ) {
    move_change_t *move_change_local_var = malloc(sizeof(move_change_t));
    if (!move_change_local_var) {
        return NULL;
    }
    memset(move_change_local_var, 0, sizeof(move_change_t));
    move_change_local_var->_library_owned = 1;
    move_change_local_var->accuracy = accuracy;
    move_change_local_var->power = power;
    move_change_local_var->pp = pp;
    move_change_local_var->effect_chance = effect_chance;
    move_change_local_var->effect_entries = effect_entries;
    move_change_local_var->type = type;
    move_change_local_var->version_group = version_group;
    return move_change_local_var;
}

__attribute__((deprecated)) move_change_t *move_change_create(
    int *accuracy,
    int *power,
    int *pp,
    int *effect_chance,
    list_t *effect_entries,
    type_summary_t *type,
    version_group_summary_t *version_group
    ) {
    int *accuracy_copy = NULL;
    if (accuracy) {
        accuracy_copy = malloc(sizeof(int));
        if (accuracy_copy) *accuracy_copy = *accuracy;
    }
    int *power_copy = NULL;
    if (power) {
        power_copy = malloc(sizeof(int));
        if (power_copy) *power_copy = *power;
    }
    int *pp_copy = NULL;
    if (pp) {
        pp_copy = malloc(sizeof(int));
        if (pp_copy) *pp_copy = *pp;
    }
    int *effect_chance_copy = NULL;
    if (effect_chance) {
        effect_chance_copy = malloc(sizeof(int));
        if (effect_chance_copy) *effect_chance_copy = *effect_chance;
    }
    move_change_t *result = move_change_create_internal (
        accuracy_copy,
        power_copy,
        pp_copy,
        effect_chance_copy,
        effect_entries,
        type,
        version_group
        );
    if (!result) {
        free(accuracy_copy);
        free(power_copy);
        free(pp_copy);
        free(effect_chance_copy);
    }
    return result;
}

void move_change_free(move_change_t *move_change) {
    if(NULL == move_change){
        return ;
    }
    if(move_change->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_change_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_change->accuracy) {
        free(move_change->accuracy);
        move_change->accuracy = NULL;
    }
    if (move_change->power) {
        free(move_change->power);
        move_change->power = NULL;
    }
    if (move_change->pp) {
        free(move_change->pp);
        move_change->pp = NULL;
    }
    if (move_change->effect_chance) {
        free(move_change->effect_chance);
        move_change->effect_chance = NULL;
    }
    if (move_change->effect_entries) {
        list_ForEach(listEntry, move_change->effect_entries) {
            move_change_effect_entries_inner_free(listEntry->data);
        }
        list_freeList(move_change->effect_entries);
        move_change->effect_entries = NULL;
    }
    if (move_change->type) {
        type_summary_free(move_change->type);
        move_change->type = NULL;
    }
    if (move_change->version_group) {
        version_group_summary_free(move_change->version_group);
        move_change->version_group = NULL;
    }
    free(move_change);
}

cJSON *move_change_convertToJSON(move_change_t *move_change) {
    cJSON *item = cJSON_CreateObject();

    // move_change->accuracy
    if(move_change->accuracy) {
    if(cJSON_AddNumberToObject(item, "accuracy", *move_change->accuracy) == NULL) {
    goto fail; //Numeric
    }
    }


    // move_change->power
    if(move_change->power) {
    if(cJSON_AddNumberToObject(item, "power", *move_change->power) == NULL) {
    goto fail; //Numeric
    }
    }


    // move_change->pp
    if(move_change->pp) {
    if(cJSON_AddNumberToObject(item, "pp", *move_change->pp) == NULL) {
    goto fail; //Numeric
    }
    }


    // move_change->effect_chance
    if (!move_change->effect_chance) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "effect_chance", *move_change->effect_chance) == NULL) {
    goto fail; //Numeric
    }


    // move_change->effect_entries
    if (!move_change->effect_entries) {
        goto fail;
    }
    cJSON *effect_entries = cJSON_AddArrayToObject(item, "effect_entries");
    if(effect_entries == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *effect_entriesListEntry;
    if (move_change->effect_entries) {
    list_ForEach(effect_entriesListEntry, move_change->effect_entries) {
    cJSON *itemLocal = move_change_effect_entries_inner_convertToJSON(effect_entriesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(effect_entries, itemLocal);
    }
    }


    // move_change->type
    if (!move_change->type) {
        goto fail;
    }
    cJSON *type_local_JSON = type_summary_convertToJSON(move_change->type);
    if(type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // move_change->version_group
    if (!move_change->version_group) {
        goto fail;
    }
    cJSON *version_group_local_JSON = version_group_summary_convertToJSON(move_change->version_group);
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

move_change_t *move_change_parseFromJSON(cJSON *move_changeJSON){

    move_change_t *move_change_local_var = NULL;

    // define the local variable for move_change->accuracy
    int *accuracy_local_var = NULL;

    // define the local variable for move_change->power
    int *power_local_var = NULL;

    // define the local variable for move_change->pp
    int *pp_local_var = NULL;

    // define the local variable for move_change->effect_chance
    int *effect_chance_local_var = NULL;

    // define the local list for move_change->effect_entries
    list_t *effect_entriesList = NULL;

    // define the local variable for move_change->type
    type_summary_t *type_local_nonprim = NULL;

    // define the local variable for move_change->version_group
    version_group_summary_t *version_group_local_nonprim = NULL;

    // move_change->accuracy
    cJSON *accuracy = cJSON_GetObjectItemCaseSensitive(move_changeJSON, "accuracy");
    if (cJSON_IsNull(accuracy)) {
        accuracy = NULL;
    }
    if (accuracy) { 
    if(!cJSON_IsNumber(accuracy))
    {
    goto end; //Numeric
    }
    accuracy_local_var = malloc(sizeof(int));
    if(!accuracy_local_var)
    {
        goto end;
    }
    *accuracy_local_var = accuracy->valuedouble;
    }

    // move_change->power
    cJSON *power = cJSON_GetObjectItemCaseSensitive(move_changeJSON, "power");
    if (cJSON_IsNull(power)) {
        power = NULL;
    }
    if (power) { 
    if(!cJSON_IsNumber(power))
    {
    goto end; //Numeric
    }
    power_local_var = malloc(sizeof(int));
    if(!power_local_var)
    {
        goto end;
    }
    *power_local_var = power->valuedouble;
    }

    // move_change->pp
    cJSON *pp = cJSON_GetObjectItemCaseSensitive(move_changeJSON, "pp");
    if (cJSON_IsNull(pp)) {
        pp = NULL;
    }
    if (pp) { 
    if(!cJSON_IsNumber(pp))
    {
    goto end; //Numeric
    }
    pp_local_var = malloc(sizeof(int));
    if(!pp_local_var)
    {
        goto end;
    }
    *pp_local_var = pp->valuedouble;
    }

    // move_change->effect_chance
    cJSON *effect_chance = cJSON_GetObjectItemCaseSensitive(move_changeJSON, "effect_chance");
    if (cJSON_IsNull(effect_chance)) {
        effect_chance = NULL;
    }
    if (!effect_chance) {
        goto end;
    }

    
    if(!cJSON_IsNumber(effect_chance))
    {
    goto end; //Numeric
    }
    effect_chance_local_var = malloc(sizeof(int));
    if(!effect_chance_local_var)
    {
        goto end;
    }
    *effect_chance_local_var = effect_chance->valuedouble;

    // move_change->effect_entries
    cJSON *effect_entries = cJSON_GetObjectItemCaseSensitive(move_changeJSON, "effect_entries");
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
        move_change_effect_entries_inner_t *effect_entriesItem = move_change_effect_entries_inner_parseFromJSON(effect_entries_local_nonprimitive);

        list_addElement(effect_entriesList, effect_entriesItem);
    }

    // move_change->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(move_changeJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    
    type_local_nonprim = type_summary_parseFromJSON(type); //nonprimitive

    // move_change->version_group
    cJSON *version_group = cJSON_GetObjectItemCaseSensitive(move_changeJSON, "version_group");
    if (cJSON_IsNull(version_group)) {
        version_group = NULL;
    }
    if (!version_group) {
        goto end;
    }

    
    version_group_local_nonprim = version_group_summary_parseFromJSON(version_group); //nonprimitive



    move_change_local_var = move_change_create_internal (
        accuracy_local_var,
        power_local_var,
        pp_local_var,
        effect_chance_local_var,
        effect_entriesList,
        type_local_nonprim,
        version_group_local_nonprim
        );

    if (!move_change_local_var) {
        goto end;
    }

    return move_change_local_var;
end:
    if (accuracy_local_var) {
        free(accuracy_local_var);
        accuracy_local_var = NULL;
    }
    if (power_local_var) {
        free(power_local_var);
        power_local_var = NULL;
    }
    if (pp_local_var) {
        free(pp_local_var);
        pp_local_var = NULL;
    }
    if (effect_chance_local_var) {
        free(effect_chance_local_var);
        effect_chance_local_var = NULL;
    }
    if (effect_entriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, effect_entriesList) {
            move_change_effect_entries_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(effect_entriesList);
        effect_entriesList = NULL;
    }
    if (type_local_nonprim) {
        type_summary_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    if (version_group_local_nonprim) {
        version_group_summary_free(version_group_local_nonprim);
        version_group_local_nonprim = NULL;
    }
    return NULL;

}
