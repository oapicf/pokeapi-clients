/*
 * evolution_chain_detail_chain.h
 *
 * 
 */

#ifndef _evolution_chain_detail_chain_H_
#define _evolution_chain_detail_chain_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct evolution_chain_detail_chain_t evolution_chain_detail_chain_t;

#include "ability_detail_pokemon_inner_pokemon.h"
#include "any_type.h"
#include "evolution_chain_detail_chain_evolves_to_inner.h"



typedef struct evolution_chain_detail_chain_t {
    list_t *evolution_details; //nonprimitive container
    list_t *evolves_to; //nonprimitive container
    int is_baby; //boolean
    struct ability_detail_pokemon_inner_pokemon_t *species; //model

    int _library_owned; // Is the library responsible for freeing this object?
} evolution_chain_detail_chain_t;

__attribute__((deprecated)) evolution_chain_detail_chain_t *evolution_chain_detail_chain_create(
    list_t *evolution_details,
    list_t *evolves_to,
    int is_baby,
    ability_detail_pokemon_inner_pokemon_t *species
);

void evolution_chain_detail_chain_free(evolution_chain_detail_chain_t *evolution_chain_detail_chain);

evolution_chain_detail_chain_t *evolution_chain_detail_chain_parseFromJSON(cJSON *evolution_chain_detail_chainJSON);

cJSON *evolution_chain_detail_chain_convertToJSON(evolution_chain_detail_chain_t *evolution_chain_detail_chain);

#endif /* _evolution_chain_detail_chain_H_ */

