/*
 * move_detail_stat_changes_inner.h
 *
 * 
 */

#ifndef _move_detail_stat_changes_inner_H_
#define _move_detail_stat_changes_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct move_detail_stat_changes_inner_t move_detail_stat_changes_inner_t;

#include "ability_detail_pokemon_inner_pokemon.h"



typedef struct move_detail_stat_changes_inner_t {
    int change; //numeric
    struct ability_detail_pokemon_inner_pokemon_t *stat; //model

    int _library_owned; // Is the library responsible for freeing this object?
} move_detail_stat_changes_inner_t;

__attribute__((deprecated)) move_detail_stat_changes_inner_t *move_detail_stat_changes_inner_create(
    int change,
    ability_detail_pokemon_inner_pokemon_t *stat
);

void move_detail_stat_changes_inner_free(move_detail_stat_changes_inner_t *move_detail_stat_changes_inner);

move_detail_stat_changes_inner_t *move_detail_stat_changes_inner_parseFromJSON(cJSON *move_detail_stat_changes_innerJSON);

cJSON *move_detail_stat_changes_inner_convertToJSON(move_detail_stat_changes_inner_t *move_detail_stat_changes_inner);

#endif /* _move_detail_stat_changes_inner_H_ */

