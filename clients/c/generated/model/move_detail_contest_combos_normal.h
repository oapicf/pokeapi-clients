/*
 * move_detail_contest_combos_normal.h
 *
 * 
 */

#ifndef _move_detail_contest_combos_normal_H_
#define _move_detail_contest_combos_normal_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct move_detail_contest_combos_normal_t move_detail_contest_combos_normal_t;

#include "ability_detail_pokemon_inner_pokemon.h"



typedef struct move_detail_contest_combos_normal_t {
    list_t *use_before; //nonprimitive container
    list_t *use_after; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} move_detail_contest_combos_normal_t;

__attribute__((deprecated)) move_detail_contest_combos_normal_t *move_detail_contest_combos_normal_create(
    list_t *use_before,
    list_t *use_after
);

void move_detail_contest_combos_normal_free(move_detail_contest_combos_normal_t *move_detail_contest_combos_normal);

move_detail_contest_combos_normal_t *move_detail_contest_combos_normal_parseFromJSON(cJSON *move_detail_contest_combos_normalJSON);

cJSON *move_detail_contest_combos_normal_convertToJSON(move_detail_contest_combos_normal_t *move_detail_contest_combos_normal);

#endif /* _move_detail_contest_combos_normal_H_ */

