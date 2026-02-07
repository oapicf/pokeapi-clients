/*
 * nature_detail_pokeathlon_stat_changes_inner.h
 *
 * 
 */

#ifndef _nature_detail_pokeathlon_stat_changes_inner_H_
#define _nature_detail_pokeathlon_stat_changes_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct nature_detail_pokeathlon_stat_changes_inner_t nature_detail_pokeathlon_stat_changes_inner_t;

#include "ability_detail_pokemon_inner_pokemon.h"



typedef struct nature_detail_pokeathlon_stat_changes_inner_t {
    int max_change; //numeric
    struct ability_detail_pokemon_inner_pokemon_t *pokeathlon_stat; //model

    int _library_owned; // Is the library responsible for freeing this object?
} nature_detail_pokeathlon_stat_changes_inner_t;

__attribute__((deprecated)) nature_detail_pokeathlon_stat_changes_inner_t *nature_detail_pokeathlon_stat_changes_inner_create(
    int max_change,
    ability_detail_pokemon_inner_pokemon_t *pokeathlon_stat
);

void nature_detail_pokeathlon_stat_changes_inner_free(nature_detail_pokeathlon_stat_changes_inner_t *nature_detail_pokeathlon_stat_changes_inner);

nature_detail_pokeathlon_stat_changes_inner_t *nature_detail_pokeathlon_stat_changes_inner_parseFromJSON(cJSON *nature_detail_pokeathlon_stat_changes_innerJSON);

cJSON *nature_detail_pokeathlon_stat_changes_inner_convertToJSON(nature_detail_pokeathlon_stat_changes_inner_t *nature_detail_pokeathlon_stat_changes_inner);

#endif /* _nature_detail_pokeathlon_stat_changes_inner_H_ */

