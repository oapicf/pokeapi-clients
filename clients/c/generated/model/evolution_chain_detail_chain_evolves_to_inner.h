/*
 * evolution_chain_detail_chain_evolves_to_inner.h
 *
 * 
 */

#ifndef _evolution_chain_detail_chain_evolves_to_inner_H_
#define _evolution_chain_detail_chain_evolves_to_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct evolution_chain_detail_chain_evolves_to_inner_t evolution_chain_detail_chain_evolves_to_inner_t;

#include "ability_detail_pokemon_inner_pokemon.h"
#include "evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner.h"



typedef struct evolution_chain_detail_chain_evolves_to_inner_t {
    list_t *evolution_details; //nonprimitive container
    int is_baby; //boolean
    struct ability_detail_pokemon_inner_pokemon_t *species; //model

    int _library_owned; // Is the library responsible for freeing this object?
} evolution_chain_detail_chain_evolves_to_inner_t;

__attribute__((deprecated)) evolution_chain_detail_chain_evolves_to_inner_t *evolution_chain_detail_chain_evolves_to_inner_create(
    list_t *evolution_details,
    int is_baby,
    ability_detail_pokemon_inner_pokemon_t *species
);

void evolution_chain_detail_chain_evolves_to_inner_free(evolution_chain_detail_chain_evolves_to_inner_t *evolution_chain_detail_chain_evolves_to_inner);

evolution_chain_detail_chain_evolves_to_inner_t *evolution_chain_detail_chain_evolves_to_inner_parseFromJSON(cJSON *evolution_chain_detail_chain_evolves_to_innerJSON);

cJSON *evolution_chain_detail_chain_evolves_to_inner_convertToJSON(evolution_chain_detail_chain_evolves_to_inner_t *evolution_chain_detail_chain_evolves_to_inner);

#endif /* _evolution_chain_detail_chain_evolves_to_inner_H_ */

