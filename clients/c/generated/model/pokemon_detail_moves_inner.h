/*
 * pokemon_detail_moves_inner.h
 *
 * 
 */

#ifndef _pokemon_detail_moves_inner_H_
#define _pokemon_detail_moves_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_detail_moves_inner_t pokemon_detail_moves_inner_t;

#include "ability_detail_pokemon_inner_pokemon.h"
#include "pokemon_detail_moves_inner_version_group_details_inner.h"



typedef struct pokemon_detail_moves_inner_t {
    struct ability_detail_pokemon_inner_pokemon_t *move; //model
    list_t *version_group_details; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_detail_moves_inner_t;

__attribute__((deprecated)) pokemon_detail_moves_inner_t *pokemon_detail_moves_inner_create(
    ability_detail_pokemon_inner_pokemon_t *move,
    list_t *version_group_details
);

void pokemon_detail_moves_inner_free(pokemon_detail_moves_inner_t *pokemon_detail_moves_inner);

pokemon_detail_moves_inner_t *pokemon_detail_moves_inner_parseFromJSON(cJSON *pokemon_detail_moves_innerJSON);

cJSON *pokemon_detail_moves_inner_convertToJSON(pokemon_detail_moves_inner_t *pokemon_detail_moves_inner);

#endif /* _pokemon_detail_moves_inner_H_ */

