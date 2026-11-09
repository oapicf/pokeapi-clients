#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_evolution.h"



static pokemon_evolution_t *pokemon_evolution_create_internal(
    version_group_summary_t *version_group,
    int *is_default,
    item_summary_t *item,
    evolution_trigger_summary_t *trigger,
    int *gender,
    item_summary_t *held_item,
    pokemon_evolution_known_move_t *known_move,
    pokemon_evolution_known_move_t *known_move_type,
    location_summary_t *location,
    int *min_level,
    int *min_happiness,
    int *min_beauty,
    int *min_affection,
    int *near_special_rock,
    int *needs_multiplayer,
    int *needs_overworld_rain,
    pokemon_species_summary_t *party_species,
    type_summary_t *party_type,
    int *relative_physical_stats,
    char *time_of_day,
    pokemon_species_summary_t *trade_species,
    int *turn_upside_down,
    region_summary_t *region,
    pokemon_form_summary_t *required_pokemon_form,
    pokemon_form_summary_t *evolved_pokemon_form,
    move_summary_t *used_move,
    int *min_move_count,
    int *min_steps,
    int *min_damage_taken,
    list_t *allowed_natures,
    evolution_condition_expression_t *condition_expression
    ) {
    pokemon_evolution_t *pokemon_evolution_local_var = malloc(sizeof(pokemon_evolution_t));
    if (!pokemon_evolution_local_var) {
        return NULL;
    }
    memset(pokemon_evolution_local_var, 0, sizeof(pokemon_evolution_t));
    pokemon_evolution_local_var->_library_owned = 1;
    pokemon_evolution_local_var->version_group = version_group;
    pokemon_evolution_local_var->is_default = is_default;
    pokemon_evolution_local_var->item = item;
    pokemon_evolution_local_var->trigger = trigger;
    pokemon_evolution_local_var->gender = gender;
    pokemon_evolution_local_var->held_item = held_item;
    pokemon_evolution_local_var->known_move = known_move;
    pokemon_evolution_local_var->known_move_type = known_move_type;
    pokemon_evolution_local_var->location = location;
    pokemon_evolution_local_var->min_level = min_level;
    pokemon_evolution_local_var->min_happiness = min_happiness;
    pokemon_evolution_local_var->min_beauty = min_beauty;
    pokemon_evolution_local_var->min_affection = min_affection;
    pokemon_evolution_local_var->near_special_rock = near_special_rock;
    pokemon_evolution_local_var->needs_multiplayer = needs_multiplayer;
    pokemon_evolution_local_var->needs_overworld_rain = needs_overworld_rain;
    pokemon_evolution_local_var->party_species = party_species;
    pokemon_evolution_local_var->party_type = party_type;
    pokemon_evolution_local_var->relative_physical_stats = relative_physical_stats;
    pokemon_evolution_local_var->time_of_day = time_of_day;
    pokemon_evolution_local_var->trade_species = trade_species;
    pokemon_evolution_local_var->turn_upside_down = turn_upside_down;
    pokemon_evolution_local_var->region = region;
    pokemon_evolution_local_var->required_pokemon_form = required_pokemon_form;
    pokemon_evolution_local_var->evolved_pokemon_form = evolved_pokemon_form;
    pokemon_evolution_local_var->used_move = used_move;
    pokemon_evolution_local_var->min_move_count = min_move_count;
    pokemon_evolution_local_var->min_steps = min_steps;
    pokemon_evolution_local_var->min_damage_taken = min_damage_taken;
    pokemon_evolution_local_var->allowed_natures = allowed_natures;
    pokemon_evolution_local_var->condition_expression = condition_expression;
    return pokemon_evolution_local_var;
}

__attribute__((deprecated)) pokemon_evolution_t *pokemon_evolution_create(
    version_group_summary_t *version_group,
    int *is_default,
    item_summary_t *item,
    evolution_trigger_summary_t *trigger,
    int *gender,
    item_summary_t *held_item,
    pokemon_evolution_known_move_t *known_move,
    pokemon_evolution_known_move_t *known_move_type,
    location_summary_t *location,
    int *min_level,
    int *min_happiness,
    int *min_beauty,
    int *min_affection,
    int *near_special_rock,
    int *needs_multiplayer,
    int *needs_overworld_rain,
    pokemon_species_summary_t *party_species,
    type_summary_t *party_type,
    int *relative_physical_stats,
    char *time_of_day,
    pokemon_species_summary_t *trade_species,
    int *turn_upside_down,
    region_summary_t *region,
    pokemon_form_summary_t *required_pokemon_form,
    pokemon_form_summary_t *evolved_pokemon_form,
    move_summary_t *used_move,
    int *min_move_count,
    int *min_steps,
    int *min_damage_taken,
    list_t *allowed_natures,
    evolution_condition_expression_t *condition_expression
    ) {
    int *is_default_copy = NULL;
    if (is_default) {
        is_default_copy = malloc(sizeof(int));
        if (is_default_copy) *is_default_copy = *is_default;
    }
    int *gender_copy = NULL;
    if (gender) {
        gender_copy = malloc(sizeof(int));
        if (gender_copy) *gender_copy = *gender;
    }
    int *min_level_copy = NULL;
    if (min_level) {
        min_level_copy = malloc(sizeof(int));
        if (min_level_copy) *min_level_copy = *min_level;
    }
    int *min_happiness_copy = NULL;
    if (min_happiness) {
        min_happiness_copy = malloc(sizeof(int));
        if (min_happiness_copy) *min_happiness_copy = *min_happiness;
    }
    int *min_beauty_copy = NULL;
    if (min_beauty) {
        min_beauty_copy = malloc(sizeof(int));
        if (min_beauty_copy) *min_beauty_copy = *min_beauty;
    }
    int *min_affection_copy = NULL;
    if (min_affection) {
        min_affection_copy = malloc(sizeof(int));
        if (min_affection_copy) *min_affection_copy = *min_affection;
    }
    int *near_special_rock_copy = NULL;
    if (near_special_rock) {
        near_special_rock_copy = malloc(sizeof(int));
        if (near_special_rock_copy) *near_special_rock_copy = *near_special_rock;
    }
    int *needs_multiplayer_copy = NULL;
    if (needs_multiplayer) {
        needs_multiplayer_copy = malloc(sizeof(int));
        if (needs_multiplayer_copy) *needs_multiplayer_copy = *needs_multiplayer;
    }
    int *needs_overworld_rain_copy = NULL;
    if (needs_overworld_rain) {
        needs_overworld_rain_copy = malloc(sizeof(int));
        if (needs_overworld_rain_copy) *needs_overworld_rain_copy = *needs_overworld_rain;
    }
    int *relative_physical_stats_copy = NULL;
    if (relative_physical_stats) {
        relative_physical_stats_copy = malloc(sizeof(int));
        if (relative_physical_stats_copy) *relative_physical_stats_copy = *relative_physical_stats;
    }
    int *turn_upside_down_copy = NULL;
    if (turn_upside_down) {
        turn_upside_down_copy = malloc(sizeof(int));
        if (turn_upside_down_copy) *turn_upside_down_copy = *turn_upside_down;
    }
    int *min_move_count_copy = NULL;
    if (min_move_count) {
        min_move_count_copy = malloc(sizeof(int));
        if (min_move_count_copy) *min_move_count_copy = *min_move_count;
    }
    int *min_steps_copy = NULL;
    if (min_steps) {
        min_steps_copy = malloc(sizeof(int));
        if (min_steps_copy) *min_steps_copy = *min_steps;
    }
    int *min_damage_taken_copy = NULL;
    if (min_damage_taken) {
        min_damage_taken_copy = malloc(sizeof(int));
        if (min_damage_taken_copy) *min_damage_taken_copy = *min_damage_taken;
    }
    pokemon_evolution_t *result = pokemon_evolution_create_internal (
        version_group,
        is_default_copy,
        item,
        trigger,
        gender_copy,
        held_item,
        known_move,
        known_move_type,
        location,
        min_level_copy,
        min_happiness_copy,
        min_beauty_copy,
        min_affection_copy,
        near_special_rock_copy,
        needs_multiplayer_copy,
        needs_overworld_rain_copy,
        party_species,
        party_type,
        relative_physical_stats_copy,
        time_of_day,
        trade_species,
        turn_upside_down_copy,
        region,
        required_pokemon_form,
        evolved_pokemon_form,
        used_move,
        min_move_count_copy,
        min_steps_copy,
        min_damage_taken_copy,
        allowed_natures,
        condition_expression
        );
    if (!result) {
        free(is_default_copy);
        free(gender_copy);
        free(min_level_copy);
        free(min_happiness_copy);
        free(min_beauty_copy);
        free(min_affection_copy);
        free(near_special_rock_copy);
        free(needs_multiplayer_copy);
        free(needs_overworld_rain_copy);
        free(relative_physical_stats_copy);
        free(turn_upside_down_copy);
        free(min_move_count_copy);
        free(min_steps_copy);
        free(min_damage_taken_copy);
    }
    return result;
}

void pokemon_evolution_free(pokemon_evolution_t *pokemon_evolution) {
    if(NULL == pokemon_evolution){
        return ;
    }
    if(pokemon_evolution->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_evolution_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_evolution->version_group) {
        version_group_summary_free(pokemon_evolution->version_group);
        pokemon_evolution->version_group = NULL;
    }
    if (pokemon_evolution->is_default) {
        free(pokemon_evolution->is_default);
        pokemon_evolution->is_default = NULL;
    }
    if (pokemon_evolution->item) {
        item_summary_free(pokemon_evolution->item);
        pokemon_evolution->item = NULL;
    }
    if (pokemon_evolution->trigger) {
        evolution_trigger_summary_free(pokemon_evolution->trigger);
        pokemon_evolution->trigger = NULL;
    }
    if (pokemon_evolution->gender) {
        free(pokemon_evolution->gender);
        pokemon_evolution->gender = NULL;
    }
    if (pokemon_evolution->held_item) {
        item_summary_free(pokemon_evolution->held_item);
        pokemon_evolution->held_item = NULL;
    }
    if (pokemon_evolution->known_move) {
        pokemon_evolution_known_move_free(pokemon_evolution->known_move);
        pokemon_evolution->known_move = NULL;
    }
    if (pokemon_evolution->known_move_type) {
        pokemon_evolution_known_move_free(pokemon_evolution->known_move_type);
        pokemon_evolution->known_move_type = NULL;
    }
    if (pokemon_evolution->location) {
        location_summary_free(pokemon_evolution->location);
        pokemon_evolution->location = NULL;
    }
    if (pokemon_evolution->min_level) {
        free(pokemon_evolution->min_level);
        pokemon_evolution->min_level = NULL;
    }
    if (pokemon_evolution->min_happiness) {
        free(pokemon_evolution->min_happiness);
        pokemon_evolution->min_happiness = NULL;
    }
    if (pokemon_evolution->min_beauty) {
        free(pokemon_evolution->min_beauty);
        pokemon_evolution->min_beauty = NULL;
    }
    if (pokemon_evolution->min_affection) {
        free(pokemon_evolution->min_affection);
        pokemon_evolution->min_affection = NULL;
    }
    if (pokemon_evolution->near_special_rock) {
        free(pokemon_evolution->near_special_rock);
        pokemon_evolution->near_special_rock = NULL;
    }
    if (pokemon_evolution->needs_multiplayer) {
        free(pokemon_evolution->needs_multiplayer);
        pokemon_evolution->needs_multiplayer = NULL;
    }
    if (pokemon_evolution->needs_overworld_rain) {
        free(pokemon_evolution->needs_overworld_rain);
        pokemon_evolution->needs_overworld_rain = NULL;
    }
    if (pokemon_evolution->party_species) {
        pokemon_species_summary_free(pokemon_evolution->party_species);
        pokemon_evolution->party_species = NULL;
    }
    if (pokemon_evolution->party_type) {
        type_summary_free(pokemon_evolution->party_type);
        pokemon_evolution->party_type = NULL;
    }
    if (pokemon_evolution->relative_physical_stats) {
        free(pokemon_evolution->relative_physical_stats);
        pokemon_evolution->relative_physical_stats = NULL;
    }
    if (pokemon_evolution->time_of_day) {
        free(pokemon_evolution->time_of_day);
        pokemon_evolution->time_of_day = NULL;
    }
    if (pokemon_evolution->trade_species) {
        pokemon_species_summary_free(pokemon_evolution->trade_species);
        pokemon_evolution->trade_species = NULL;
    }
    if (pokemon_evolution->turn_upside_down) {
        free(pokemon_evolution->turn_upside_down);
        pokemon_evolution->turn_upside_down = NULL;
    }
    if (pokemon_evolution->region) {
        region_summary_free(pokemon_evolution->region);
        pokemon_evolution->region = NULL;
    }
    if (pokemon_evolution->required_pokemon_form) {
        pokemon_form_summary_free(pokemon_evolution->required_pokemon_form);
        pokemon_evolution->required_pokemon_form = NULL;
    }
    if (pokemon_evolution->evolved_pokemon_form) {
        pokemon_form_summary_free(pokemon_evolution->evolved_pokemon_form);
        pokemon_evolution->evolved_pokemon_form = NULL;
    }
    if (pokemon_evolution->used_move) {
        move_summary_free(pokemon_evolution->used_move);
        pokemon_evolution->used_move = NULL;
    }
    if (pokemon_evolution->min_move_count) {
        free(pokemon_evolution->min_move_count);
        pokemon_evolution->min_move_count = NULL;
    }
    if (pokemon_evolution->min_steps) {
        free(pokemon_evolution->min_steps);
        pokemon_evolution->min_steps = NULL;
    }
    if (pokemon_evolution->min_damage_taken) {
        free(pokemon_evolution->min_damage_taken);
        pokemon_evolution->min_damage_taken = NULL;
    }
    if (pokemon_evolution->allowed_natures) {
        list_ForEach(listEntry, pokemon_evolution->allowed_natures) {
            nature_summary_free(listEntry->data);
        }
        list_freeList(pokemon_evolution->allowed_natures);
        pokemon_evolution->allowed_natures = NULL;
    }
    if (pokemon_evolution->condition_expression) {
        evolution_condition_expression_free(pokemon_evolution->condition_expression);
        pokemon_evolution->condition_expression = NULL;
    }
    free(pokemon_evolution);
}

cJSON *pokemon_evolution_convertToJSON(pokemon_evolution_t *pokemon_evolution) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_evolution->version_group
    if (!pokemon_evolution->version_group) {
        goto fail;
    }
    cJSON *version_group_local_JSON = version_group_summary_convertToJSON(pokemon_evolution->version_group);
    if(version_group_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "version_group", version_group_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_evolution->is_default
    if(pokemon_evolution->is_default) {
    if(cJSON_AddBoolToObject(item, "is_default", *pokemon_evolution->is_default) == NULL) {
    goto fail; //Bool
    }
    }


    // pokemon_evolution->item
    if (!pokemon_evolution->item) {
        goto fail;
    }
    cJSON *item_local_JSON = item_summary_convertToJSON(pokemon_evolution->item);
    if(item_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "item", item_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_evolution->trigger
    if (!pokemon_evolution->trigger) {
        goto fail;
    }
    cJSON *trigger_local_JSON = evolution_trigger_summary_convertToJSON(pokemon_evolution->trigger);
    if(trigger_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "trigger", trigger_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_evolution->gender
    if(pokemon_evolution->gender) {
    if(cJSON_AddNumberToObject(item, "gender", *pokemon_evolution->gender) == NULL) {
    goto fail; //Numeric
    }
    }


    // pokemon_evolution->held_item
    if (!pokemon_evolution->held_item) {
        goto fail;
    }
    cJSON *held_item_local_JSON = item_summary_convertToJSON(pokemon_evolution->held_item);
    if(held_item_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "held_item", held_item_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_evolution->known_move
    if (!pokemon_evolution->known_move) {
        goto fail;
    }
    cJSON *known_move_local_JSON = pokemon_evolution_known_move_convertToJSON(pokemon_evolution->known_move);
    if(known_move_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "known_move", known_move_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_evolution->known_move_type
    if (!pokemon_evolution->known_move_type) {
        goto fail;
    }
    cJSON *known_move_type_local_JSON = pokemon_evolution_known_move_convertToJSON(pokemon_evolution->known_move_type);
    if(known_move_type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "known_move_type", known_move_type_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_evolution->location
    if (!pokemon_evolution->location) {
        goto fail;
    }
    cJSON *location_local_JSON = location_summary_convertToJSON(pokemon_evolution->location);
    if(location_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "location", location_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_evolution->min_level
    if(pokemon_evolution->min_level) {
    if(cJSON_AddNumberToObject(item, "min_level", *pokemon_evolution->min_level) == NULL) {
    goto fail; //Numeric
    }
    }


    // pokemon_evolution->min_happiness
    if(pokemon_evolution->min_happiness) {
    if(cJSON_AddNumberToObject(item, "min_happiness", *pokemon_evolution->min_happiness) == NULL) {
    goto fail; //Numeric
    }
    }


    // pokemon_evolution->min_beauty
    if(pokemon_evolution->min_beauty) {
    if(cJSON_AddNumberToObject(item, "min_beauty", *pokemon_evolution->min_beauty) == NULL) {
    goto fail; //Numeric
    }
    }


    // pokemon_evolution->min_affection
    if(pokemon_evolution->min_affection) {
    if(cJSON_AddNumberToObject(item, "min_affection", *pokemon_evolution->min_affection) == NULL) {
    goto fail; //Numeric
    }
    }


    // pokemon_evolution->near_special_rock
    if(pokemon_evolution->near_special_rock) {
    if(cJSON_AddBoolToObject(item, "near_special_rock", *pokemon_evolution->near_special_rock) == NULL) {
    goto fail; //Bool
    }
    }


    // pokemon_evolution->needs_multiplayer
    if(pokemon_evolution->needs_multiplayer) {
    if(cJSON_AddBoolToObject(item, "needs_multiplayer", *pokemon_evolution->needs_multiplayer) == NULL) {
    goto fail; //Bool
    }
    }


    // pokemon_evolution->needs_overworld_rain
    if(pokemon_evolution->needs_overworld_rain) {
    if(cJSON_AddBoolToObject(item, "needs_overworld_rain", *pokemon_evolution->needs_overworld_rain) == NULL) {
    goto fail; //Bool
    }
    }


    // pokemon_evolution->party_species
    if (!pokemon_evolution->party_species) {
        goto fail;
    }
    cJSON *party_species_local_JSON = pokemon_species_summary_convertToJSON(pokemon_evolution->party_species);
    if(party_species_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "party_species", party_species_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_evolution->party_type
    if (!pokemon_evolution->party_type) {
        goto fail;
    }
    cJSON *party_type_local_JSON = type_summary_convertToJSON(pokemon_evolution->party_type);
    if(party_type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "party_type", party_type_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_evolution->relative_physical_stats
    if(pokemon_evolution->relative_physical_stats) {
    if(cJSON_AddNumberToObject(item, "relative_physical_stats", *pokemon_evolution->relative_physical_stats) == NULL) {
    goto fail; //Numeric
    }
    }


    // pokemon_evolution->time_of_day
    if(pokemon_evolution->time_of_day) {
    if(cJSON_AddStringToObject(item, "time_of_day", pokemon_evolution->time_of_day) == NULL) {
    goto fail; //String
    }
    }


    // pokemon_evolution->trade_species
    if (!pokemon_evolution->trade_species) {
        goto fail;
    }
    cJSON *trade_species_local_JSON = pokemon_species_summary_convertToJSON(pokemon_evolution->trade_species);
    if(trade_species_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "trade_species", trade_species_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_evolution->turn_upside_down
    if(pokemon_evolution->turn_upside_down) {
    if(cJSON_AddBoolToObject(item, "turn_upside_down", *pokemon_evolution->turn_upside_down) == NULL) {
    goto fail; //Bool
    }
    }


    // pokemon_evolution->region
    if (!pokemon_evolution->region) {
        goto fail;
    }
    cJSON *region_local_JSON = region_summary_convertToJSON(pokemon_evolution->region);
    if(region_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "region", region_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_evolution->required_pokemon_form
    if (!pokemon_evolution->required_pokemon_form) {
        goto fail;
    }
    cJSON *required_pokemon_form_local_JSON = pokemon_form_summary_convertToJSON(pokemon_evolution->required_pokemon_form);
    if(required_pokemon_form_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "required_pokemon_form", required_pokemon_form_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_evolution->evolved_pokemon_form
    if (!pokemon_evolution->evolved_pokemon_form) {
        goto fail;
    }
    cJSON *evolved_pokemon_form_local_JSON = pokemon_form_summary_convertToJSON(pokemon_evolution->evolved_pokemon_form);
    if(evolved_pokemon_form_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "evolved_pokemon_form", evolved_pokemon_form_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_evolution->used_move
    if (!pokemon_evolution->used_move) {
        goto fail;
    }
    cJSON *used_move_local_JSON = move_summary_convertToJSON(pokemon_evolution->used_move);
    if(used_move_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "used_move", used_move_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_evolution->min_move_count
    if(pokemon_evolution->min_move_count) {
    if(cJSON_AddNumberToObject(item, "min_move_count", *pokemon_evolution->min_move_count) == NULL) {
    goto fail; //Numeric
    }
    }


    // pokemon_evolution->min_steps
    if(pokemon_evolution->min_steps) {
    if(cJSON_AddNumberToObject(item, "min_steps", *pokemon_evolution->min_steps) == NULL) {
    goto fail; //Numeric
    }
    }


    // pokemon_evolution->min_damage_taken
    if(pokemon_evolution->min_damage_taken) {
    if(cJSON_AddNumberToObject(item, "min_damage_taken", *pokemon_evolution->min_damage_taken) == NULL) {
    goto fail; //Numeric
    }
    }


    // pokemon_evolution->allowed_natures
    if (!pokemon_evolution->allowed_natures) {
        goto fail;
    }
    cJSON *allowed_natures = cJSON_AddArrayToObject(item, "allowed_natures");
    if(allowed_natures == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *allowed_naturesListEntry;
    if (pokemon_evolution->allowed_natures) {
    list_ForEach(allowed_naturesListEntry, pokemon_evolution->allowed_natures) {
    cJSON *itemLocal = nature_summary_convertToJSON(allowed_naturesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(allowed_natures, itemLocal);
    }
    }


    // pokemon_evolution->condition_expression
    if (!pokemon_evolution->condition_expression) {
        goto fail;
    }
    cJSON *condition_expression_local_JSON = evolution_condition_expression_convertToJSON(pokemon_evolution->condition_expression);
    if(condition_expression_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "condition_expression", condition_expression_local_JSON);
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

pokemon_evolution_t *pokemon_evolution_parseFromJSON(cJSON *pokemon_evolutionJSON){

    pokemon_evolution_t *pokemon_evolution_local_var = NULL;

    // define the local variable for pokemon_evolution->version_group
    version_group_summary_t *version_group_local_nonprim = NULL;

    // define the local variable for pokemon_evolution->is_default
    int *is_default_local_var = NULL;

    // define the local variable for pokemon_evolution->item
    item_summary_t *item_local_nonprim = NULL;

    // define the local variable for pokemon_evolution->trigger
    evolution_trigger_summary_t *trigger_local_nonprim = NULL;

    // define the local variable for pokemon_evolution->gender
    int *gender_local_var = NULL;

    // define the local variable for pokemon_evolution->held_item
    item_summary_t *held_item_local_nonprim = NULL;

    // define the local variable for pokemon_evolution->known_move
    pokemon_evolution_known_move_t *known_move_local_nonprim = NULL;

    // define the local variable for pokemon_evolution->known_move_type
    pokemon_evolution_known_move_t *known_move_type_local_nonprim = NULL;

    // define the local variable for pokemon_evolution->location
    location_summary_t *location_local_nonprim = NULL;

    // define the local variable for pokemon_evolution->min_level
    int *min_level_local_var = NULL;

    // define the local variable for pokemon_evolution->min_happiness
    int *min_happiness_local_var = NULL;

    // define the local variable for pokemon_evolution->min_beauty
    int *min_beauty_local_var = NULL;

    // define the local variable for pokemon_evolution->min_affection
    int *min_affection_local_var = NULL;

    // define the local variable for pokemon_evolution->near_special_rock
    int *near_special_rock_local_var = NULL;

    // define the local variable for pokemon_evolution->needs_multiplayer
    int *needs_multiplayer_local_var = NULL;

    // define the local variable for pokemon_evolution->needs_overworld_rain
    int *needs_overworld_rain_local_var = NULL;

    // define the local variable for pokemon_evolution->party_species
    pokemon_species_summary_t *party_species_local_nonprim = NULL;

    // define the local variable for pokemon_evolution->party_type
    type_summary_t *party_type_local_nonprim = NULL;

    // define the local variable for pokemon_evolution->relative_physical_stats
    int *relative_physical_stats_local_var = NULL;

    char *time_of_day_local_str = NULL;

    // define the local variable for pokemon_evolution->trade_species
    pokemon_species_summary_t *trade_species_local_nonprim = NULL;

    // define the local variable for pokemon_evolution->turn_upside_down
    int *turn_upside_down_local_var = NULL;

    // define the local variable for pokemon_evolution->region
    region_summary_t *region_local_nonprim = NULL;

    // define the local variable for pokemon_evolution->required_pokemon_form
    pokemon_form_summary_t *required_pokemon_form_local_nonprim = NULL;

    // define the local variable for pokemon_evolution->evolved_pokemon_form
    pokemon_form_summary_t *evolved_pokemon_form_local_nonprim = NULL;

    // define the local variable for pokemon_evolution->used_move
    move_summary_t *used_move_local_nonprim = NULL;

    // define the local variable for pokemon_evolution->min_move_count
    int *min_move_count_local_var = NULL;

    // define the local variable for pokemon_evolution->min_steps
    int *min_steps_local_var = NULL;

    // define the local variable for pokemon_evolution->min_damage_taken
    int *min_damage_taken_local_var = NULL;

    // define the local list for pokemon_evolution->allowed_natures
    list_t *allowed_naturesList = NULL;

    // define the local variable for pokemon_evolution->condition_expression
    evolution_condition_expression_t *condition_expression_local_nonprim = NULL;

    // pokemon_evolution->version_group
    cJSON *version_group = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "version_group");
    if (cJSON_IsNull(version_group)) {
        version_group = NULL;
    }
    if (!version_group) {
        goto end;
    }

    
    version_group_local_nonprim = version_group_summary_parseFromJSON(version_group); //nonprimitive

    // pokemon_evolution->is_default
    cJSON *is_default = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "is_default");
    if (cJSON_IsNull(is_default)) {
        is_default = NULL;
    }
    if (is_default) { 
    if(!cJSON_IsBool(is_default))
    {
    goto end; //Bool
    }
    is_default_local_var = malloc(sizeof(int));
    if(!is_default_local_var)
    {
        goto end;
    }
    *is_default_local_var = is_default->valueint;
    }

    // pokemon_evolution->item
    cJSON *item = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "item");
    if (cJSON_IsNull(item)) {
        item = NULL;
    }
    if (!item) {
        goto end;
    }

    
    item_local_nonprim = item_summary_parseFromJSON(item); //nonprimitive

    // pokemon_evolution->trigger
    cJSON *trigger = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "trigger");
    if (cJSON_IsNull(trigger)) {
        trigger = NULL;
    }
    if (!trigger) {
        goto end;
    }

    
    trigger_local_nonprim = evolution_trigger_summary_parseFromJSON(trigger); //nonprimitive

    // pokemon_evolution->gender
    cJSON *gender = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "gender");
    if (cJSON_IsNull(gender)) {
        gender = NULL;
    }
    if (gender) { 
    if(!cJSON_IsNumber(gender))
    {
    goto end; //Numeric
    }
    gender_local_var = malloc(sizeof(int));
    if(!gender_local_var)
    {
        goto end;
    }
    *gender_local_var = gender->valuedouble;
    }

    // pokemon_evolution->held_item
    cJSON *held_item = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "held_item");
    if (cJSON_IsNull(held_item)) {
        held_item = NULL;
    }
    if (!held_item) {
        goto end;
    }

    
    held_item_local_nonprim = item_summary_parseFromJSON(held_item); //nonprimitive

    // pokemon_evolution->known_move
    cJSON *known_move = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "known_move");
    if (cJSON_IsNull(known_move)) {
        known_move = NULL;
    }
    if (!known_move) {
        goto end;
    }

    
    known_move_local_nonprim = pokemon_evolution_known_move_parseFromJSON(known_move); //nonprimitive

    // pokemon_evolution->known_move_type
    cJSON *known_move_type = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "known_move_type");
    if (cJSON_IsNull(known_move_type)) {
        known_move_type = NULL;
    }
    if (!known_move_type) {
        goto end;
    }

    
    known_move_type_local_nonprim = pokemon_evolution_known_move_parseFromJSON(known_move_type); //nonprimitive

    // pokemon_evolution->location
    cJSON *location = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "location");
    if (cJSON_IsNull(location)) {
        location = NULL;
    }
    if (!location) {
        goto end;
    }

    
    location_local_nonprim = location_summary_parseFromJSON(location); //nonprimitive

    // pokemon_evolution->min_level
    cJSON *min_level = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "min_level");
    if (cJSON_IsNull(min_level)) {
        min_level = NULL;
    }
    if (min_level) { 
    if(!cJSON_IsNumber(min_level))
    {
    goto end; //Numeric
    }
    min_level_local_var = malloc(sizeof(int));
    if(!min_level_local_var)
    {
        goto end;
    }
    *min_level_local_var = min_level->valuedouble;
    }

    // pokemon_evolution->min_happiness
    cJSON *min_happiness = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "min_happiness");
    if (cJSON_IsNull(min_happiness)) {
        min_happiness = NULL;
    }
    if (min_happiness) { 
    if(!cJSON_IsNumber(min_happiness))
    {
    goto end; //Numeric
    }
    min_happiness_local_var = malloc(sizeof(int));
    if(!min_happiness_local_var)
    {
        goto end;
    }
    *min_happiness_local_var = min_happiness->valuedouble;
    }

    // pokemon_evolution->min_beauty
    cJSON *min_beauty = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "min_beauty");
    if (cJSON_IsNull(min_beauty)) {
        min_beauty = NULL;
    }
    if (min_beauty) { 
    if(!cJSON_IsNumber(min_beauty))
    {
    goto end; //Numeric
    }
    min_beauty_local_var = malloc(sizeof(int));
    if(!min_beauty_local_var)
    {
        goto end;
    }
    *min_beauty_local_var = min_beauty->valuedouble;
    }

    // pokemon_evolution->min_affection
    cJSON *min_affection = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "min_affection");
    if (cJSON_IsNull(min_affection)) {
        min_affection = NULL;
    }
    if (min_affection) { 
    if(!cJSON_IsNumber(min_affection))
    {
    goto end; //Numeric
    }
    min_affection_local_var = malloc(sizeof(int));
    if(!min_affection_local_var)
    {
        goto end;
    }
    *min_affection_local_var = min_affection->valuedouble;
    }

    // pokemon_evolution->near_special_rock
    cJSON *near_special_rock = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "near_special_rock");
    if (cJSON_IsNull(near_special_rock)) {
        near_special_rock = NULL;
    }
    if (near_special_rock) { 
    if(!cJSON_IsBool(near_special_rock))
    {
    goto end; //Bool
    }
    near_special_rock_local_var = malloc(sizeof(int));
    if(!near_special_rock_local_var)
    {
        goto end;
    }
    *near_special_rock_local_var = near_special_rock->valueint;
    }

    // pokemon_evolution->needs_multiplayer
    cJSON *needs_multiplayer = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "needs_multiplayer");
    if (cJSON_IsNull(needs_multiplayer)) {
        needs_multiplayer = NULL;
    }
    if (needs_multiplayer) { 
    if(!cJSON_IsBool(needs_multiplayer))
    {
    goto end; //Bool
    }
    needs_multiplayer_local_var = malloc(sizeof(int));
    if(!needs_multiplayer_local_var)
    {
        goto end;
    }
    *needs_multiplayer_local_var = needs_multiplayer->valueint;
    }

    // pokemon_evolution->needs_overworld_rain
    cJSON *needs_overworld_rain = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "needs_overworld_rain");
    if (cJSON_IsNull(needs_overworld_rain)) {
        needs_overworld_rain = NULL;
    }
    if (needs_overworld_rain) { 
    if(!cJSON_IsBool(needs_overworld_rain))
    {
    goto end; //Bool
    }
    needs_overworld_rain_local_var = malloc(sizeof(int));
    if(!needs_overworld_rain_local_var)
    {
        goto end;
    }
    *needs_overworld_rain_local_var = needs_overworld_rain->valueint;
    }

    // pokemon_evolution->party_species
    cJSON *party_species = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "party_species");
    if (cJSON_IsNull(party_species)) {
        party_species = NULL;
    }
    if (!party_species) {
        goto end;
    }

    
    party_species_local_nonprim = pokemon_species_summary_parseFromJSON(party_species); //nonprimitive

    // pokemon_evolution->party_type
    cJSON *party_type = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "party_type");
    if (cJSON_IsNull(party_type)) {
        party_type = NULL;
    }
    if (!party_type) {
        goto end;
    }

    
    party_type_local_nonprim = type_summary_parseFromJSON(party_type); //nonprimitive

    // pokemon_evolution->relative_physical_stats
    cJSON *relative_physical_stats = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "relative_physical_stats");
    if (cJSON_IsNull(relative_physical_stats)) {
        relative_physical_stats = NULL;
    }
    if (relative_physical_stats) { 
    if(!cJSON_IsNumber(relative_physical_stats))
    {
    goto end; //Numeric
    }
    relative_physical_stats_local_var = malloc(sizeof(int));
    if(!relative_physical_stats_local_var)
    {
        goto end;
    }
    *relative_physical_stats_local_var = relative_physical_stats->valuedouble;
    }

    // pokemon_evolution->time_of_day
    cJSON *time_of_day = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "time_of_day");
    if (cJSON_IsNull(time_of_day)) {
        time_of_day = NULL;
    }
    if (time_of_day) { 
    if(!cJSON_IsString(time_of_day) && !cJSON_IsNull(time_of_day))
    {
    goto end; //String
    }
    }

    // pokemon_evolution->trade_species
    cJSON *trade_species = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "trade_species");
    if (cJSON_IsNull(trade_species)) {
        trade_species = NULL;
    }
    if (!trade_species) {
        goto end;
    }

    
    trade_species_local_nonprim = pokemon_species_summary_parseFromJSON(trade_species); //nonprimitive

    // pokemon_evolution->turn_upside_down
    cJSON *turn_upside_down = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "turn_upside_down");
    if (cJSON_IsNull(turn_upside_down)) {
        turn_upside_down = NULL;
    }
    if (turn_upside_down) { 
    if(!cJSON_IsBool(turn_upside_down))
    {
    goto end; //Bool
    }
    turn_upside_down_local_var = malloc(sizeof(int));
    if(!turn_upside_down_local_var)
    {
        goto end;
    }
    *turn_upside_down_local_var = turn_upside_down->valueint;
    }

    // pokemon_evolution->region
    cJSON *region = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "region");
    if (cJSON_IsNull(region)) {
        region = NULL;
    }
    if (!region) {
        goto end;
    }

    
    region_local_nonprim = region_summary_parseFromJSON(region); //nonprimitive

    // pokemon_evolution->required_pokemon_form
    cJSON *required_pokemon_form = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "required_pokemon_form");
    if (cJSON_IsNull(required_pokemon_form)) {
        required_pokemon_form = NULL;
    }
    if (!required_pokemon_form) {
        goto end;
    }

    
    required_pokemon_form_local_nonprim = pokemon_form_summary_parseFromJSON(required_pokemon_form); //nonprimitive

    // pokemon_evolution->evolved_pokemon_form
    cJSON *evolved_pokemon_form = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "evolved_pokemon_form");
    if (cJSON_IsNull(evolved_pokemon_form)) {
        evolved_pokemon_form = NULL;
    }
    if (!evolved_pokemon_form) {
        goto end;
    }

    
    evolved_pokemon_form_local_nonprim = pokemon_form_summary_parseFromJSON(evolved_pokemon_form); //nonprimitive

    // pokemon_evolution->used_move
    cJSON *used_move = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "used_move");
    if (cJSON_IsNull(used_move)) {
        used_move = NULL;
    }
    if (!used_move) {
        goto end;
    }

    
    used_move_local_nonprim = move_summary_parseFromJSON(used_move); //nonprimitive

    // pokemon_evolution->min_move_count
    cJSON *min_move_count = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "min_move_count");
    if (cJSON_IsNull(min_move_count)) {
        min_move_count = NULL;
    }
    if (min_move_count) { 
    if(!cJSON_IsNumber(min_move_count))
    {
    goto end; //Numeric
    }
    min_move_count_local_var = malloc(sizeof(int));
    if(!min_move_count_local_var)
    {
        goto end;
    }
    *min_move_count_local_var = min_move_count->valuedouble;
    }

    // pokemon_evolution->min_steps
    cJSON *min_steps = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "min_steps");
    if (cJSON_IsNull(min_steps)) {
        min_steps = NULL;
    }
    if (min_steps) { 
    if(!cJSON_IsNumber(min_steps))
    {
    goto end; //Numeric
    }
    min_steps_local_var = malloc(sizeof(int));
    if(!min_steps_local_var)
    {
        goto end;
    }
    *min_steps_local_var = min_steps->valuedouble;
    }

    // pokemon_evolution->min_damage_taken
    cJSON *min_damage_taken = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "min_damage_taken");
    if (cJSON_IsNull(min_damage_taken)) {
        min_damage_taken = NULL;
    }
    if (min_damage_taken) { 
    if(!cJSON_IsNumber(min_damage_taken))
    {
    goto end; //Numeric
    }
    min_damage_taken_local_var = malloc(sizeof(int));
    if(!min_damage_taken_local_var)
    {
        goto end;
    }
    *min_damage_taken_local_var = min_damage_taken->valuedouble;
    }

    // pokemon_evolution->allowed_natures
    cJSON *allowed_natures = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "allowed_natures");
    if (cJSON_IsNull(allowed_natures)) {
        allowed_natures = NULL;
    }
    if (!allowed_natures) {
        goto end;
    }

    
    cJSON *allowed_natures_local_nonprimitive = NULL;
    if(!cJSON_IsArray(allowed_natures)){
        goto end; //nonprimitive container
    }

    allowed_naturesList = list_createList();

    cJSON_ArrayForEach(allowed_natures_local_nonprimitive,allowed_natures )
    {
        if(!cJSON_IsObject(allowed_natures_local_nonprimitive)){
            goto end;
        }
        nature_summary_t *allowed_naturesItem = nature_summary_parseFromJSON(allowed_natures_local_nonprimitive);

        list_addElement(allowed_naturesList, allowed_naturesItem);
    }

    // pokemon_evolution->condition_expression
    cJSON *condition_expression = cJSON_GetObjectItemCaseSensitive(pokemon_evolutionJSON, "condition_expression");
    if (cJSON_IsNull(condition_expression)) {
        condition_expression = NULL;
    }
    if (!condition_expression) {
        goto end;
    }

    
    condition_expression_local_nonprim = evolution_condition_expression_parseFromJSON(condition_expression); //nonprimitive


    if (time_of_day && !cJSON_IsNull(time_of_day)) time_of_day_local_str = strdup(time_of_day->valuestring);

    pokemon_evolution_local_var = pokemon_evolution_create_internal (
        version_group_local_nonprim,
        is_default_local_var,
        item_local_nonprim,
        trigger_local_nonprim,
        gender_local_var,
        held_item_local_nonprim,
        known_move_local_nonprim,
        known_move_type_local_nonprim,
        location_local_nonprim,
        min_level_local_var,
        min_happiness_local_var,
        min_beauty_local_var,
        min_affection_local_var,
        near_special_rock_local_var,
        needs_multiplayer_local_var,
        needs_overworld_rain_local_var,
        party_species_local_nonprim,
        party_type_local_nonprim,
        relative_physical_stats_local_var,
        time_of_day_local_str,
        trade_species_local_nonprim,
        turn_upside_down_local_var,
        region_local_nonprim,
        required_pokemon_form_local_nonprim,
        evolved_pokemon_form_local_nonprim,
        used_move_local_nonprim,
        min_move_count_local_var,
        min_steps_local_var,
        min_damage_taken_local_var,
        allowed_naturesList,
        condition_expression_local_nonprim
        );

    if (!pokemon_evolution_local_var) {
        goto end;
    }

    return pokemon_evolution_local_var;
end:
    if (version_group_local_nonprim) {
        version_group_summary_free(version_group_local_nonprim);
        version_group_local_nonprim = NULL;
    }
    if (is_default_local_var) {
        free(is_default_local_var);
        is_default_local_var = NULL;
    }
    if (item_local_nonprim) {
        item_summary_free(item_local_nonprim);
        item_local_nonprim = NULL;
    }
    if (trigger_local_nonprim) {
        evolution_trigger_summary_free(trigger_local_nonprim);
        trigger_local_nonprim = NULL;
    }
    if (gender_local_var) {
        free(gender_local_var);
        gender_local_var = NULL;
    }
    if (held_item_local_nonprim) {
        item_summary_free(held_item_local_nonprim);
        held_item_local_nonprim = NULL;
    }
    if (known_move_local_nonprim) {
        pokemon_evolution_known_move_free(known_move_local_nonprim);
        known_move_local_nonprim = NULL;
    }
    if (known_move_type_local_nonprim) {
        pokemon_evolution_known_move_free(known_move_type_local_nonprim);
        known_move_type_local_nonprim = NULL;
    }
    if (location_local_nonprim) {
        location_summary_free(location_local_nonprim);
        location_local_nonprim = NULL;
    }
    if (min_level_local_var) {
        free(min_level_local_var);
        min_level_local_var = NULL;
    }
    if (min_happiness_local_var) {
        free(min_happiness_local_var);
        min_happiness_local_var = NULL;
    }
    if (min_beauty_local_var) {
        free(min_beauty_local_var);
        min_beauty_local_var = NULL;
    }
    if (min_affection_local_var) {
        free(min_affection_local_var);
        min_affection_local_var = NULL;
    }
    if (near_special_rock_local_var) {
        free(near_special_rock_local_var);
        near_special_rock_local_var = NULL;
    }
    if (needs_multiplayer_local_var) {
        free(needs_multiplayer_local_var);
        needs_multiplayer_local_var = NULL;
    }
    if (needs_overworld_rain_local_var) {
        free(needs_overworld_rain_local_var);
        needs_overworld_rain_local_var = NULL;
    }
    if (party_species_local_nonprim) {
        pokemon_species_summary_free(party_species_local_nonprim);
        party_species_local_nonprim = NULL;
    }
    if (party_type_local_nonprim) {
        type_summary_free(party_type_local_nonprim);
        party_type_local_nonprim = NULL;
    }
    if (relative_physical_stats_local_var) {
        free(relative_physical_stats_local_var);
        relative_physical_stats_local_var = NULL;
    }
    if (time_of_day_local_str) {
        free(time_of_day_local_str);
        time_of_day_local_str = NULL;
    }
    if (trade_species_local_nonprim) {
        pokemon_species_summary_free(trade_species_local_nonprim);
        trade_species_local_nonprim = NULL;
    }
    if (turn_upside_down_local_var) {
        free(turn_upside_down_local_var);
        turn_upside_down_local_var = NULL;
    }
    if (region_local_nonprim) {
        region_summary_free(region_local_nonprim);
        region_local_nonprim = NULL;
    }
    if (required_pokemon_form_local_nonprim) {
        pokemon_form_summary_free(required_pokemon_form_local_nonprim);
        required_pokemon_form_local_nonprim = NULL;
    }
    if (evolved_pokemon_form_local_nonprim) {
        pokemon_form_summary_free(evolved_pokemon_form_local_nonprim);
        evolved_pokemon_form_local_nonprim = NULL;
    }
    if (used_move_local_nonprim) {
        move_summary_free(used_move_local_nonprim);
        used_move_local_nonprim = NULL;
    }
    if (min_move_count_local_var) {
        free(min_move_count_local_var);
        min_move_count_local_var = NULL;
    }
    if (min_steps_local_var) {
        free(min_steps_local_var);
        min_steps_local_var = NULL;
    }
    if (min_damage_taken_local_var) {
        free(min_damage_taken_local_var);
        min_damage_taken_local_var = NULL;
    }
    if (allowed_naturesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, allowed_naturesList) {
            nature_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(allowed_naturesList);
        allowed_naturesList = NULL;
    }
    if (condition_expression_local_nonprim) {
        evolution_condition_expression_free(condition_expression_local_nonprim);
        condition_expression_local_nonprim = NULL;
    }
    return NULL;

}
