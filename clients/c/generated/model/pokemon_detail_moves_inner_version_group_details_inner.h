/*
 * pokemon_detail_moves_inner_version_group_details_inner.h
 *
 * 
 */

#ifndef _pokemon_detail_moves_inner_version_group_details_inner_H_
#define _pokemon_detail_moves_inner_version_group_details_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_detail_moves_inner_version_group_details_inner_t pokemon_detail_moves_inner_version_group_details_inner_t;

#include "ability_detail_pokemon_inner_pokemon.h"



typedef struct pokemon_detail_moves_inner_version_group_details_inner_t {
    int level_learned_at; //numeric
    struct ability_detail_pokemon_inner_pokemon_t *move_learn_method; //model
    struct ability_detail_pokemon_inner_pokemon_t *version_group; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_detail_moves_inner_version_group_details_inner_t;

__attribute__((deprecated)) pokemon_detail_moves_inner_version_group_details_inner_t *pokemon_detail_moves_inner_version_group_details_inner_create(
    int level_learned_at,
    ability_detail_pokemon_inner_pokemon_t *move_learn_method,
    ability_detail_pokemon_inner_pokemon_t *version_group
);

void pokemon_detail_moves_inner_version_group_details_inner_free(pokemon_detail_moves_inner_version_group_details_inner_t *pokemon_detail_moves_inner_version_group_details_inner);

pokemon_detail_moves_inner_version_group_details_inner_t *pokemon_detail_moves_inner_version_group_details_inner_parseFromJSON(cJSON *pokemon_detail_moves_inner_version_group_details_innerJSON);

cJSON *pokemon_detail_moves_inner_version_group_details_inner_convertToJSON(pokemon_detail_moves_inner_version_group_details_inner_t *pokemon_detail_moves_inner_version_group_details_inner);

#endif /* _pokemon_detail_moves_inner_version_group_details_inner_H_ */

