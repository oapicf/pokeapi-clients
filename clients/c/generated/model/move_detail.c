#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_detail.h"



static move_detail_t *move_detail_create_internal(
    int id,
    char *name,
    int accuracy,
    int effect_chance,
    int pp,
    int priority,
    int power,
    move_detail_contest_combos_t *contest_combos,
    contest_type_summary_t *contest_type,
    contest_effect_summary_t *contest_effect,
    move_damage_class_summary_t *damage_class,
    list_t *effect_entries,
    list_t *effect_changes,
    generation_summary_t *generation,
    move_meta_t *meta,
    list_t *names,
    list_t *past_values,
    list_t *stat_changes,
    super_contest_effect_summary_t *super_contest_effect,
    move_target_summary_t *target,
    type_summary_t *type,
    list_t *machines,
    list_t *flavor_text_entries,
    list_t *learned_by_pokemon
    ) {
    move_detail_t *move_detail_local_var = malloc(sizeof(move_detail_t));
    if (!move_detail_local_var) {
        return NULL;
    }
    move_detail_local_var->id = id;
    move_detail_local_var->name = name;
    move_detail_local_var->accuracy = accuracy;
    move_detail_local_var->effect_chance = effect_chance;
    move_detail_local_var->pp = pp;
    move_detail_local_var->priority = priority;
    move_detail_local_var->power = power;
    move_detail_local_var->contest_combos = contest_combos;
    move_detail_local_var->contest_type = contest_type;
    move_detail_local_var->contest_effect = contest_effect;
    move_detail_local_var->damage_class = damage_class;
    move_detail_local_var->effect_entries = effect_entries;
    move_detail_local_var->effect_changes = effect_changes;
    move_detail_local_var->generation = generation;
    move_detail_local_var->meta = meta;
    move_detail_local_var->names = names;
    move_detail_local_var->past_values = past_values;
    move_detail_local_var->stat_changes = stat_changes;
    move_detail_local_var->super_contest_effect = super_contest_effect;
    move_detail_local_var->target = target;
    move_detail_local_var->type = type;
    move_detail_local_var->machines = machines;
    move_detail_local_var->flavor_text_entries = flavor_text_entries;
    move_detail_local_var->learned_by_pokemon = learned_by_pokemon;

    move_detail_local_var->_library_owned = 1;
    return move_detail_local_var;
}

__attribute__((deprecated)) move_detail_t *move_detail_create(
    int id,
    char *name,
    int accuracy,
    int effect_chance,
    int pp,
    int priority,
    int power,
    move_detail_contest_combos_t *contest_combos,
    contest_type_summary_t *contest_type,
    contest_effect_summary_t *contest_effect,
    move_damage_class_summary_t *damage_class,
    list_t *effect_entries,
    list_t *effect_changes,
    generation_summary_t *generation,
    move_meta_t *meta,
    list_t *names,
    list_t *past_values,
    list_t *stat_changes,
    super_contest_effect_summary_t *super_contest_effect,
    move_target_summary_t *target,
    type_summary_t *type,
    list_t *machines,
    list_t *flavor_text_entries,
    list_t *learned_by_pokemon
    ) {
    return move_detail_create_internal (
        id,
        name,
        accuracy,
        effect_chance,
        pp,
        priority,
        power,
        contest_combos,
        contest_type,
        contest_effect,
        damage_class,
        effect_entries,
        effect_changes,
        generation,
        meta,
        names,
        past_values,
        stat_changes,
        super_contest_effect,
        target,
        type,
        machines,
        flavor_text_entries,
        learned_by_pokemon
        );
}

void move_detail_free(move_detail_t *move_detail) {
    if(NULL == move_detail){
        return ;
    }
    if(move_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_detail->name) {
        free(move_detail->name);
        move_detail->name = NULL;
    }
    if (move_detail->contest_combos) {
        move_detail_contest_combos_free(move_detail->contest_combos);
        move_detail->contest_combos = NULL;
    }
    if (move_detail->contest_type) {
        contest_type_summary_free(move_detail->contest_type);
        move_detail->contest_type = NULL;
    }
    if (move_detail->contest_effect) {
        contest_effect_summary_free(move_detail->contest_effect);
        move_detail->contest_effect = NULL;
    }
    if (move_detail->damage_class) {
        move_damage_class_summary_free(move_detail->damage_class);
        move_detail->damage_class = NULL;
    }
    if (move_detail->effect_entries) {
        list_ForEach(listEntry, move_detail->effect_entries) {
            move_change_effect_entries_inner_free(listEntry->data);
        }
        list_freeList(move_detail->effect_entries);
        move_detail->effect_entries = NULL;
    }
    if (move_detail->effect_changes) {
        list_ForEach(listEntry, move_detail->effect_changes) {
            move_detail_effect_changes_inner_free(listEntry->data);
        }
        list_freeList(move_detail->effect_changes);
        move_detail->effect_changes = NULL;
    }
    if (move_detail->generation) {
        generation_summary_free(move_detail->generation);
        move_detail->generation = NULL;
    }
    if (move_detail->meta) {
        move_meta_free(move_detail->meta);
        move_detail->meta = NULL;
    }
    if (move_detail->names) {
        list_ForEach(listEntry, move_detail->names) {
            move_name_free(listEntry->data);
        }
        list_freeList(move_detail->names);
        move_detail->names = NULL;
    }
    if (move_detail->past_values) {
        list_ForEach(listEntry, move_detail->past_values) {
            move_change_free(listEntry->data);
        }
        list_freeList(move_detail->past_values);
        move_detail->past_values = NULL;
    }
    if (move_detail->stat_changes) {
        list_ForEach(listEntry, move_detail->stat_changes) {
            move_detail_stat_changes_inner_free(listEntry->data);
        }
        list_freeList(move_detail->stat_changes);
        move_detail->stat_changes = NULL;
    }
    if (move_detail->super_contest_effect) {
        super_contest_effect_summary_free(move_detail->super_contest_effect);
        move_detail->super_contest_effect = NULL;
    }
    if (move_detail->target) {
        move_target_summary_free(move_detail->target);
        move_detail->target = NULL;
    }
    if (move_detail->type) {
        type_summary_free(move_detail->type);
        move_detail->type = NULL;
    }
    if (move_detail->machines) {
        list_ForEach(listEntry, move_detail->machines) {
            move_detail_machines_inner_free(listEntry->data);
        }
        list_freeList(move_detail->machines);
        move_detail->machines = NULL;
    }
    if (move_detail->flavor_text_entries) {
        list_ForEach(listEntry, move_detail->flavor_text_entries) {
            move_flavor_text_free(listEntry->data);
        }
        list_freeList(move_detail->flavor_text_entries);
        move_detail->flavor_text_entries = NULL;
    }
    if (move_detail->learned_by_pokemon) {
        list_ForEach(listEntry, move_detail->learned_by_pokemon) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
        }
        list_freeList(move_detail->learned_by_pokemon);
        move_detail->learned_by_pokemon = NULL;
    }
    free(move_detail);
}

cJSON *move_detail_convertToJSON(move_detail_t *move_detail) {
    cJSON *item = cJSON_CreateObject();

    // move_detail->id
    if (!move_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", move_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // move_detail->name
    if (!move_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", move_detail->name) == NULL) {
    goto fail; //String
    }


    // move_detail->accuracy
    if(move_detail->accuracy) {
    if(cJSON_AddNumberToObject(item, "accuracy", move_detail->accuracy) == NULL) {
    goto fail; //Numeric
    }
    }


    // move_detail->effect_chance
    if (!move_detail->effect_chance) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "effect_chance", move_detail->effect_chance) == NULL) {
    goto fail; //Numeric
    }


    // move_detail->pp
    if(move_detail->pp) {
    if(cJSON_AddNumberToObject(item, "pp", move_detail->pp) == NULL) {
    goto fail; //Numeric
    }
    }


    // move_detail->priority
    if(move_detail->priority) {
    if(cJSON_AddNumberToObject(item, "priority", move_detail->priority) == NULL) {
    goto fail; //Numeric
    }
    }


    // move_detail->power
    if(move_detail->power) {
    if(cJSON_AddNumberToObject(item, "power", move_detail->power) == NULL) {
    goto fail; //Numeric
    }
    }


    // move_detail->contest_combos
    if (!move_detail->contest_combos) {
        goto fail;
    }
    cJSON *contest_combos_local_JSON = move_detail_contest_combos_convertToJSON(move_detail->contest_combos);
    if(contest_combos_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "contest_combos", contest_combos_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // move_detail->contest_type
    if (!move_detail->contest_type) {
        goto fail;
    }
    cJSON *contest_type_local_JSON = contest_type_summary_convertToJSON(move_detail->contest_type);
    if(contest_type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "contest_type", contest_type_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // move_detail->contest_effect
    if (!move_detail->contest_effect) {
        goto fail;
    }
    cJSON *contest_effect_local_JSON = contest_effect_summary_convertToJSON(move_detail->contest_effect);
    if(contest_effect_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "contest_effect", contest_effect_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // move_detail->damage_class
    if (!move_detail->damage_class) {
        goto fail;
    }
    cJSON *damage_class_local_JSON = move_damage_class_summary_convertToJSON(move_detail->damage_class);
    if(damage_class_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "damage_class", damage_class_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // move_detail->effect_entries
    if (!move_detail->effect_entries) {
        goto fail;
    }
    cJSON *effect_entries = cJSON_AddArrayToObject(item, "effect_entries");
    if(effect_entries == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *effect_entriesListEntry;
    if (move_detail->effect_entries) {
    list_ForEach(effect_entriesListEntry, move_detail->effect_entries) {
    cJSON *itemLocal = move_change_effect_entries_inner_convertToJSON(effect_entriesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(effect_entries, itemLocal);
    }
    }


    // move_detail->effect_changes
    if (!move_detail->effect_changes) {
        goto fail;
    }
    cJSON *effect_changes = cJSON_AddArrayToObject(item, "effect_changes");
    if(effect_changes == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *effect_changesListEntry;
    if (move_detail->effect_changes) {
    list_ForEach(effect_changesListEntry, move_detail->effect_changes) {
    cJSON *itemLocal = move_detail_effect_changes_inner_convertToJSON(effect_changesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(effect_changes, itemLocal);
    }
    }


    // move_detail->generation
    if (!move_detail->generation) {
        goto fail;
    }
    cJSON *generation_local_JSON = generation_summary_convertToJSON(move_detail->generation);
    if(generation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "generation", generation_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // move_detail->meta
    if (!move_detail->meta) {
        goto fail;
    }
    cJSON *meta_local_JSON = move_meta_convertToJSON(move_detail->meta);
    if(meta_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "meta", meta_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // move_detail->names
    if (!move_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (move_detail->names) {
    list_ForEach(namesListEntry, move_detail->names) {
    cJSON *itemLocal = move_name_convertToJSON(namesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(names, itemLocal);
    }
    }


    // move_detail->past_values
    if (!move_detail->past_values) {
        goto fail;
    }
    cJSON *past_values = cJSON_AddArrayToObject(item, "past_values");
    if(past_values == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *past_valuesListEntry;
    if (move_detail->past_values) {
    list_ForEach(past_valuesListEntry, move_detail->past_values) {
    cJSON *itemLocal = move_change_convertToJSON(past_valuesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(past_values, itemLocal);
    }
    }


    // move_detail->stat_changes
    if (!move_detail->stat_changes) {
        goto fail;
    }
    cJSON *stat_changes = cJSON_AddArrayToObject(item, "stat_changes");
    if(stat_changes == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *stat_changesListEntry;
    if (move_detail->stat_changes) {
    list_ForEach(stat_changesListEntry, move_detail->stat_changes) {
    cJSON *itemLocal = move_detail_stat_changes_inner_convertToJSON(stat_changesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(stat_changes, itemLocal);
    }
    }


    // move_detail->super_contest_effect
    if (!move_detail->super_contest_effect) {
        goto fail;
    }
    cJSON *super_contest_effect_local_JSON = super_contest_effect_summary_convertToJSON(move_detail->super_contest_effect);
    if(super_contest_effect_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "super_contest_effect", super_contest_effect_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // move_detail->target
    if (!move_detail->target) {
        goto fail;
    }
    cJSON *target_local_JSON = move_target_summary_convertToJSON(move_detail->target);
    if(target_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "target", target_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // move_detail->type
    if (!move_detail->type) {
        goto fail;
    }
    cJSON *type_local_JSON = type_summary_convertToJSON(move_detail->type);
    if(type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // move_detail->machines
    if (!move_detail->machines) {
        goto fail;
    }
    cJSON *machines = cJSON_AddArrayToObject(item, "machines");
    if(machines == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *machinesListEntry;
    if (move_detail->machines) {
    list_ForEach(machinesListEntry, move_detail->machines) {
    cJSON *itemLocal = move_detail_machines_inner_convertToJSON(machinesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(machines, itemLocal);
    }
    }


    // move_detail->flavor_text_entries
    if (!move_detail->flavor_text_entries) {
        goto fail;
    }
    cJSON *flavor_text_entries = cJSON_AddArrayToObject(item, "flavor_text_entries");
    if(flavor_text_entries == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *flavor_text_entriesListEntry;
    if (move_detail->flavor_text_entries) {
    list_ForEach(flavor_text_entriesListEntry, move_detail->flavor_text_entries) {
    cJSON *itemLocal = move_flavor_text_convertToJSON(flavor_text_entriesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(flavor_text_entries, itemLocal);
    }
    }


    // move_detail->learned_by_pokemon
    if (!move_detail->learned_by_pokemon) {
        goto fail;
    }
    cJSON *learned_by_pokemon = cJSON_AddArrayToObject(item, "learned_by_pokemon");
    if(learned_by_pokemon == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *learned_by_pokemonListEntry;
    if (move_detail->learned_by_pokemon) {
    list_ForEach(learned_by_pokemonListEntry, move_detail->learned_by_pokemon) {
    cJSON *itemLocal = ability_detail_pokemon_inner_pokemon_convertToJSON(learned_by_pokemonListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(learned_by_pokemon, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

move_detail_t *move_detail_parseFromJSON(cJSON *move_detailJSON){

    move_detail_t *move_detail_local_var = NULL;

    // define the local variable for move_detail->contest_combos
    move_detail_contest_combos_t *contest_combos_local_nonprim = NULL;

    // define the local variable for move_detail->contest_type
    contest_type_summary_t *contest_type_local_nonprim = NULL;

    // define the local variable for move_detail->contest_effect
    contest_effect_summary_t *contest_effect_local_nonprim = NULL;

    // define the local variable for move_detail->damage_class
    move_damage_class_summary_t *damage_class_local_nonprim = NULL;

    // define the local list for move_detail->effect_entries
    list_t *effect_entriesList = NULL;

    // define the local list for move_detail->effect_changes
    list_t *effect_changesList = NULL;

    // define the local variable for move_detail->generation
    generation_summary_t *generation_local_nonprim = NULL;

    // define the local variable for move_detail->meta
    move_meta_t *meta_local_nonprim = NULL;

    // define the local list for move_detail->names
    list_t *namesList = NULL;

    // define the local list for move_detail->past_values
    list_t *past_valuesList = NULL;

    // define the local list for move_detail->stat_changes
    list_t *stat_changesList = NULL;

    // define the local variable for move_detail->super_contest_effect
    super_contest_effect_summary_t *super_contest_effect_local_nonprim = NULL;

    // define the local variable for move_detail->target
    move_target_summary_t *target_local_nonprim = NULL;

    // define the local variable for move_detail->type
    type_summary_t *type_local_nonprim = NULL;

    // define the local list for move_detail->machines
    list_t *machinesList = NULL;

    // define the local list for move_detail->flavor_text_entries
    list_t *flavor_text_entriesList = NULL;

    // define the local list for move_detail->learned_by_pokemon
    list_t *learned_by_pokemonList = NULL;

    // move_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(move_detailJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // move_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(move_detailJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // move_detail->accuracy
    cJSON *accuracy = cJSON_GetObjectItemCaseSensitive(move_detailJSON, "accuracy");
    if (cJSON_IsNull(accuracy)) {
        accuracy = NULL;
    }
    if (accuracy) { 
    if(!cJSON_IsNumber(accuracy))
    {
    goto end; //Numeric
    }
    }

    // move_detail->effect_chance
    cJSON *effect_chance = cJSON_GetObjectItemCaseSensitive(move_detailJSON, "effect_chance");
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

    // move_detail->pp
    cJSON *pp = cJSON_GetObjectItemCaseSensitive(move_detailJSON, "pp");
    if (cJSON_IsNull(pp)) {
        pp = NULL;
    }
    if (pp) { 
    if(!cJSON_IsNumber(pp))
    {
    goto end; //Numeric
    }
    }

    // move_detail->priority
    cJSON *priority = cJSON_GetObjectItemCaseSensitive(move_detailJSON, "priority");
    if (cJSON_IsNull(priority)) {
        priority = NULL;
    }
    if (priority) { 
    if(!cJSON_IsNumber(priority))
    {
    goto end; //Numeric
    }
    }

    // move_detail->power
    cJSON *power = cJSON_GetObjectItemCaseSensitive(move_detailJSON, "power");
    if (cJSON_IsNull(power)) {
        power = NULL;
    }
    if (power) { 
    if(!cJSON_IsNumber(power))
    {
    goto end; //Numeric
    }
    }

    // move_detail->contest_combos
    cJSON *contest_combos = cJSON_GetObjectItemCaseSensitive(move_detailJSON, "contest_combos");
    if (cJSON_IsNull(contest_combos)) {
        contest_combos = NULL;
    }
    if (!contest_combos) {
        goto end;
    }

    
    contest_combos_local_nonprim = move_detail_contest_combos_parseFromJSON(contest_combos); //nonprimitive

    // move_detail->contest_type
    cJSON *contest_type = cJSON_GetObjectItemCaseSensitive(move_detailJSON, "contest_type");
    if (cJSON_IsNull(contest_type)) {
        contest_type = NULL;
    }
    if (!contest_type) {
        goto end;
    }

    
    contest_type_local_nonprim = contest_type_summary_parseFromJSON(contest_type); //nonprimitive

    // move_detail->contest_effect
    cJSON *contest_effect = cJSON_GetObjectItemCaseSensitive(move_detailJSON, "contest_effect");
    if (cJSON_IsNull(contest_effect)) {
        contest_effect = NULL;
    }
    if (!contest_effect) {
        goto end;
    }

    
    contest_effect_local_nonprim = contest_effect_summary_parseFromJSON(contest_effect); //nonprimitive

    // move_detail->damage_class
    cJSON *damage_class = cJSON_GetObjectItemCaseSensitive(move_detailJSON, "damage_class");
    if (cJSON_IsNull(damage_class)) {
        damage_class = NULL;
    }
    if (!damage_class) {
        goto end;
    }

    
    damage_class_local_nonprim = move_damage_class_summary_parseFromJSON(damage_class); //nonprimitive

    // move_detail->effect_entries
    cJSON *effect_entries = cJSON_GetObjectItemCaseSensitive(move_detailJSON, "effect_entries");
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

    // move_detail->effect_changes
    cJSON *effect_changes = cJSON_GetObjectItemCaseSensitive(move_detailJSON, "effect_changes");
    if (cJSON_IsNull(effect_changes)) {
        effect_changes = NULL;
    }
    if (!effect_changes) {
        goto end;
    }

    
    cJSON *effect_changes_local_nonprimitive = NULL;
    if(!cJSON_IsArray(effect_changes)){
        goto end; //nonprimitive container
    }

    effect_changesList = list_createList();

    cJSON_ArrayForEach(effect_changes_local_nonprimitive,effect_changes )
    {
        if(!cJSON_IsObject(effect_changes_local_nonprimitive)){
            goto end;
        }
        move_detail_effect_changes_inner_t *effect_changesItem = move_detail_effect_changes_inner_parseFromJSON(effect_changes_local_nonprimitive);

        list_addElement(effect_changesList, effect_changesItem);
    }

    // move_detail->generation
    cJSON *generation = cJSON_GetObjectItemCaseSensitive(move_detailJSON, "generation");
    if (cJSON_IsNull(generation)) {
        generation = NULL;
    }
    if (!generation) {
        goto end;
    }

    
    generation_local_nonprim = generation_summary_parseFromJSON(generation); //nonprimitive

    // move_detail->meta
    cJSON *meta = cJSON_GetObjectItemCaseSensitive(move_detailJSON, "meta");
    if (cJSON_IsNull(meta)) {
        meta = NULL;
    }
    if (!meta) {
        goto end;
    }

    
    meta_local_nonprim = move_meta_parseFromJSON(meta); //nonprimitive

    // move_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(move_detailJSON, "names");
    if (cJSON_IsNull(names)) {
        names = NULL;
    }
    if (!names) {
        goto end;
    }

    
    cJSON *names_local_nonprimitive = NULL;
    if(!cJSON_IsArray(names)){
        goto end; //nonprimitive container
    }

    namesList = list_createList();

    cJSON_ArrayForEach(names_local_nonprimitive,names )
    {
        if(!cJSON_IsObject(names_local_nonprimitive)){
            goto end;
        }
        move_name_t *namesItem = move_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }

    // move_detail->past_values
    cJSON *past_values = cJSON_GetObjectItemCaseSensitive(move_detailJSON, "past_values");
    if (cJSON_IsNull(past_values)) {
        past_values = NULL;
    }
    if (!past_values) {
        goto end;
    }

    
    cJSON *past_values_local_nonprimitive = NULL;
    if(!cJSON_IsArray(past_values)){
        goto end; //nonprimitive container
    }

    past_valuesList = list_createList();

    cJSON_ArrayForEach(past_values_local_nonprimitive,past_values )
    {
        if(!cJSON_IsObject(past_values_local_nonprimitive)){
            goto end;
        }
        move_change_t *past_valuesItem = move_change_parseFromJSON(past_values_local_nonprimitive);

        list_addElement(past_valuesList, past_valuesItem);
    }

    // move_detail->stat_changes
    cJSON *stat_changes = cJSON_GetObjectItemCaseSensitive(move_detailJSON, "stat_changes");
    if (cJSON_IsNull(stat_changes)) {
        stat_changes = NULL;
    }
    if (!stat_changes) {
        goto end;
    }

    
    cJSON *stat_changes_local_nonprimitive = NULL;
    if(!cJSON_IsArray(stat_changes)){
        goto end; //nonprimitive container
    }

    stat_changesList = list_createList();

    cJSON_ArrayForEach(stat_changes_local_nonprimitive,stat_changes )
    {
        if(!cJSON_IsObject(stat_changes_local_nonprimitive)){
            goto end;
        }
        move_detail_stat_changes_inner_t *stat_changesItem = move_detail_stat_changes_inner_parseFromJSON(stat_changes_local_nonprimitive);

        list_addElement(stat_changesList, stat_changesItem);
    }

    // move_detail->super_contest_effect
    cJSON *super_contest_effect = cJSON_GetObjectItemCaseSensitive(move_detailJSON, "super_contest_effect");
    if (cJSON_IsNull(super_contest_effect)) {
        super_contest_effect = NULL;
    }
    if (!super_contest_effect) {
        goto end;
    }

    
    super_contest_effect_local_nonprim = super_contest_effect_summary_parseFromJSON(super_contest_effect); //nonprimitive

    // move_detail->target
    cJSON *target = cJSON_GetObjectItemCaseSensitive(move_detailJSON, "target");
    if (cJSON_IsNull(target)) {
        target = NULL;
    }
    if (!target) {
        goto end;
    }

    
    target_local_nonprim = move_target_summary_parseFromJSON(target); //nonprimitive

    // move_detail->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(move_detailJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    
    type_local_nonprim = type_summary_parseFromJSON(type); //nonprimitive

    // move_detail->machines
    cJSON *machines = cJSON_GetObjectItemCaseSensitive(move_detailJSON, "machines");
    if (cJSON_IsNull(machines)) {
        machines = NULL;
    }
    if (!machines) {
        goto end;
    }

    
    cJSON *machines_local_nonprimitive = NULL;
    if(!cJSON_IsArray(machines)){
        goto end; //nonprimitive container
    }

    machinesList = list_createList();

    cJSON_ArrayForEach(machines_local_nonprimitive,machines )
    {
        if(!cJSON_IsObject(machines_local_nonprimitive)){
            goto end;
        }
        move_detail_machines_inner_t *machinesItem = move_detail_machines_inner_parseFromJSON(machines_local_nonprimitive);

        list_addElement(machinesList, machinesItem);
    }

    // move_detail->flavor_text_entries
    cJSON *flavor_text_entries = cJSON_GetObjectItemCaseSensitive(move_detailJSON, "flavor_text_entries");
    if (cJSON_IsNull(flavor_text_entries)) {
        flavor_text_entries = NULL;
    }
    if (!flavor_text_entries) {
        goto end;
    }

    
    cJSON *flavor_text_entries_local_nonprimitive = NULL;
    if(!cJSON_IsArray(flavor_text_entries)){
        goto end; //nonprimitive container
    }

    flavor_text_entriesList = list_createList();

    cJSON_ArrayForEach(flavor_text_entries_local_nonprimitive,flavor_text_entries )
    {
        if(!cJSON_IsObject(flavor_text_entries_local_nonprimitive)){
            goto end;
        }
        move_flavor_text_t *flavor_text_entriesItem = move_flavor_text_parseFromJSON(flavor_text_entries_local_nonprimitive);

        list_addElement(flavor_text_entriesList, flavor_text_entriesItem);
    }

    // move_detail->learned_by_pokemon
    cJSON *learned_by_pokemon = cJSON_GetObjectItemCaseSensitive(move_detailJSON, "learned_by_pokemon");
    if (cJSON_IsNull(learned_by_pokemon)) {
        learned_by_pokemon = NULL;
    }
    if (!learned_by_pokemon) {
        goto end;
    }

    
    cJSON *learned_by_pokemon_local_nonprimitive = NULL;
    if(!cJSON_IsArray(learned_by_pokemon)){
        goto end; //nonprimitive container
    }

    learned_by_pokemonList = list_createList();

    cJSON_ArrayForEach(learned_by_pokemon_local_nonprimitive,learned_by_pokemon )
    {
        if(!cJSON_IsObject(learned_by_pokemon_local_nonprimitive)){
            goto end;
        }
        ability_detail_pokemon_inner_pokemon_t *learned_by_pokemonItem = ability_detail_pokemon_inner_pokemon_parseFromJSON(learned_by_pokemon_local_nonprimitive);

        list_addElement(learned_by_pokemonList, learned_by_pokemonItem);
    }


    move_detail_local_var = move_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        accuracy ? accuracy->valuedouble : 0,
        effect_chance->valuedouble,
        pp ? pp->valuedouble : 0,
        priority ? priority->valuedouble : 0,
        power ? power->valuedouble : 0,
        contest_combos_local_nonprim,
        contest_type_local_nonprim,
        contest_effect_local_nonprim,
        damage_class_local_nonprim,
        effect_entriesList,
        effect_changesList,
        generation_local_nonprim,
        meta_local_nonprim,
        namesList,
        past_valuesList,
        stat_changesList,
        super_contest_effect_local_nonprim,
        target_local_nonprim,
        type_local_nonprim,
        machinesList,
        flavor_text_entriesList,
        learned_by_pokemonList
        );

    return move_detail_local_var;
end:
    if (contest_combos_local_nonprim) {
        move_detail_contest_combos_free(contest_combos_local_nonprim);
        contest_combos_local_nonprim = NULL;
    }
    if (contest_type_local_nonprim) {
        contest_type_summary_free(contest_type_local_nonprim);
        contest_type_local_nonprim = NULL;
    }
    if (contest_effect_local_nonprim) {
        contest_effect_summary_free(contest_effect_local_nonprim);
        contest_effect_local_nonprim = NULL;
    }
    if (damage_class_local_nonprim) {
        move_damage_class_summary_free(damage_class_local_nonprim);
        damage_class_local_nonprim = NULL;
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
    if (effect_changesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, effect_changesList) {
            move_detail_effect_changes_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(effect_changesList);
        effect_changesList = NULL;
    }
    if (generation_local_nonprim) {
        generation_summary_free(generation_local_nonprim);
        generation_local_nonprim = NULL;
    }
    if (meta_local_nonprim) {
        move_meta_free(meta_local_nonprim);
        meta_local_nonprim = NULL;
    }
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            move_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    if (past_valuesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, past_valuesList) {
            move_change_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(past_valuesList);
        past_valuesList = NULL;
    }
    if (stat_changesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, stat_changesList) {
            move_detail_stat_changes_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(stat_changesList);
        stat_changesList = NULL;
    }
    if (super_contest_effect_local_nonprim) {
        super_contest_effect_summary_free(super_contest_effect_local_nonprim);
        super_contest_effect_local_nonprim = NULL;
    }
    if (target_local_nonprim) {
        move_target_summary_free(target_local_nonprim);
        target_local_nonprim = NULL;
    }
    if (type_local_nonprim) {
        type_summary_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    if (machinesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, machinesList) {
            move_detail_machines_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(machinesList);
        machinesList = NULL;
    }
    if (flavor_text_entriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, flavor_text_entriesList) {
            move_flavor_text_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(flavor_text_entriesList);
        flavor_text_entriesList = NULL;
    }
    if (learned_by_pokemonList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, learned_by_pokemonList) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(learned_by_pokemonList);
        learned_by_pokemonList = NULL;
    }
    return NULL;

}
