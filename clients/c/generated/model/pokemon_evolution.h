/*
 * pokemon_evolution.h
 *
 * 
 */

#ifndef _pokemon_evolution_H_
#define _pokemon_evolution_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_evolution_t pokemon_evolution_t;

#include "evolution_condition_expression.h"
#include "evolution_trigger_summary.h"
#include "item_summary.h"
#include "location_summary.h"
#include "move_summary.h"
#include "nature_summary.h"
#include "pokemon_evolution_known_move.h"
#include "pokemon_form_summary.h"
#include "pokemon_species_summary.h"
#include "region_summary.h"
#include "type_summary.h"
#include "version_group_summary.h"



typedef struct pokemon_evolution_t {
    struct version_group_summary_t *version_group; //model
    int *is_default; //boolean
    struct item_summary_t *item; //model
    struct evolution_trigger_summary_t *trigger; //model
    int *gender; //numeric
    struct item_summary_t *held_item; //model
    struct pokemon_evolution_known_move_t *known_move; //model
    struct pokemon_evolution_known_move_t *known_move_type; //model
    struct location_summary_t *location; //model
    int *min_level; //numeric
    int *min_happiness; //numeric
    int *min_beauty; //numeric
    int *min_affection; //numeric
    int *near_special_rock; //boolean
    int *needs_multiplayer; //boolean
    int *needs_overworld_rain; //boolean
    struct pokemon_species_summary_t *party_species; //model
    struct type_summary_t *party_type; //model
    int *relative_physical_stats; //numeric
    char *time_of_day; // string
    struct pokemon_species_summary_t *trade_species; //model
    int *turn_upside_down; //boolean
    struct region_summary_t *region; //model
    struct pokemon_form_summary_t *required_pokemon_form; //model
    struct pokemon_form_summary_t *evolved_pokemon_form; //model
    struct move_summary_t *used_move; //model
    int *min_move_count; //numeric
    int *min_steps; //numeric
    int *min_damage_taken; //numeric
    list_t *allowed_natures; //nonprimitive container
    struct evolution_condition_expression_t *condition_expression; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_evolution_t;

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
);

void pokemon_evolution_free(pokemon_evolution_t *pokemon_evolution);

pokemon_evolution_t *pokemon_evolution_parseFromJSON(cJSON *pokemon_evolutionJSON);

cJSON *pokemon_evolution_convertToJSON(pokemon_evolution_t *pokemon_evolution);

#endif /* _pokemon_evolution_H_ */

