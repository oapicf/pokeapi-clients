/*
 * pokeathlon_stat_detail_affecting_natures_increase_inner.h
 *
 * 
 */

#ifndef _pokeathlon_stat_detail_affecting_natures_increase_inner_H_
#define _pokeathlon_stat_detail_affecting_natures_increase_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokeathlon_stat_detail_affecting_natures_increase_inner_t pokeathlon_stat_detail_affecting_natures_increase_inner_t;

#include "ability_detail_pokemon_inner_pokemon.h"



typedef struct pokeathlon_stat_detail_affecting_natures_increase_inner_t {
    int max_change; //numeric
    struct ability_detail_pokemon_inner_pokemon_t *nature; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pokeathlon_stat_detail_affecting_natures_increase_inner_t;

__attribute__((deprecated)) pokeathlon_stat_detail_affecting_natures_increase_inner_t *pokeathlon_stat_detail_affecting_natures_increase_inner_create(
    int max_change,
    ability_detail_pokemon_inner_pokemon_t *nature
);

void pokeathlon_stat_detail_affecting_natures_increase_inner_free(pokeathlon_stat_detail_affecting_natures_increase_inner_t *pokeathlon_stat_detail_affecting_natures_increase_inner);

pokeathlon_stat_detail_affecting_natures_increase_inner_t *pokeathlon_stat_detail_affecting_natures_increase_inner_parseFromJSON(cJSON *pokeathlon_stat_detail_affecting_natures_increase_innerJSON);

cJSON *pokeathlon_stat_detail_affecting_natures_increase_inner_convertToJSON(pokeathlon_stat_detail_affecting_natures_increase_inner_t *pokeathlon_stat_detail_affecting_natures_increase_inner);

#endif /* _pokeathlon_stat_detail_affecting_natures_increase_inner_H_ */

