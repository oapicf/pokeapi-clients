/*
 * stat_detail_affecting_moves_increase_inner.h
 *
 * 
 */

#ifndef _stat_detail_affecting_moves_increase_inner_H_
#define _stat_detail_affecting_moves_increase_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct stat_detail_affecting_moves_increase_inner_t stat_detail_affecting_moves_increase_inner_t;

#include "ability_detail_pokemon_inner_pokemon.h"



typedef struct stat_detail_affecting_moves_increase_inner_t {
    int change; //numeric
    struct ability_detail_pokemon_inner_pokemon_t *move; //model

    int _library_owned; // Is the library responsible for freeing this object?
} stat_detail_affecting_moves_increase_inner_t;

__attribute__((deprecated)) stat_detail_affecting_moves_increase_inner_t *stat_detail_affecting_moves_increase_inner_create(
    int change,
    ability_detail_pokemon_inner_pokemon_t *move
);

void stat_detail_affecting_moves_increase_inner_free(stat_detail_affecting_moves_increase_inner_t *stat_detail_affecting_moves_increase_inner);

stat_detail_affecting_moves_increase_inner_t *stat_detail_affecting_moves_increase_inner_parseFromJSON(cJSON *stat_detail_affecting_moves_increase_innerJSON);

cJSON *stat_detail_affecting_moves_increase_inner_convertToJSON(stat_detail_affecting_moves_increase_inner_t *stat_detail_affecting_moves_increase_inner);

#endif /* _stat_detail_affecting_moves_increase_inner_H_ */

