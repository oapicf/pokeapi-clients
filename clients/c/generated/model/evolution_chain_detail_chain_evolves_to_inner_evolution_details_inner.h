/*
 * evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner.h
 *
 * 
 */

#ifndef _evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_H_
#define _evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_t evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_t;

#include "ability_detail_pokemon_inner_pokemon.h"
#include "evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender.h"
#include "object.h"



typedef struct evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_t {
    struct evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *gender; //model
    struct evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *held_item; //model
    struct evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *item; //model
    object_t *known_move; // custom
    object_t *known_move_type; // custom
    struct evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *location; //model
    int min_affection; //numeric
    int min_beauty; //numeric
    int min_happiness; //numeric
    int min_level; //numeric
    int needs_overworld_rain; //boolean
    char *party_species; // string
    char *party_type; // string
    char *relative_physical_stats; // string
    char *time_of_day; // string
    char *trade_species; // string
    struct ability_detail_pokemon_inner_pokemon_t *trigger; //model
    int turn_upside_down; //boolean

    int _library_owned; // Is the library responsible for freeing this object?
} evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_t;

__attribute__((deprecated)) evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_t *evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_create(
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *gender,
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *held_item,
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *item,
    object_t *known_move,
    object_t *known_move_type,
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *location,
    int min_affection,
    int min_beauty,
    int min_happiness,
    int min_level,
    int needs_overworld_rain,
    char *party_species,
    char *party_type,
    char *relative_physical_stats,
    char *time_of_day,
    char *trade_species,
    ability_detail_pokemon_inner_pokemon_t *trigger,
    int turn_upside_down
);

void evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_free(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_t *evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner);

evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_t *evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_parseFromJSON(cJSON *evolution_chain_detail_chain_evolves_to_inner_evolution_details_innerJSON);

cJSON *evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_convertToJSON(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_t *evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner);

#endif /* _evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_H_ */

