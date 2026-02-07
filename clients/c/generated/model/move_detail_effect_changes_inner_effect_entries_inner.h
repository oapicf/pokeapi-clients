/*
 * move_detail_effect_changes_inner_effect_entries_inner.h
 *
 * 
 */

#ifndef _move_detail_effect_changes_inner_effect_entries_inner_H_
#define _move_detail_effect_changes_inner_effect_entries_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct move_detail_effect_changes_inner_effect_entries_inner_t move_detail_effect_changes_inner_effect_entries_inner_t;

#include "ability_detail_pokemon_inner_pokemon.h"



typedef struct move_detail_effect_changes_inner_effect_entries_inner_t {
    char *effect; // string
    struct ability_detail_pokemon_inner_pokemon_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} move_detail_effect_changes_inner_effect_entries_inner_t;

__attribute__((deprecated)) move_detail_effect_changes_inner_effect_entries_inner_t *move_detail_effect_changes_inner_effect_entries_inner_create(
    char *effect,
    ability_detail_pokemon_inner_pokemon_t *language
);

void move_detail_effect_changes_inner_effect_entries_inner_free(move_detail_effect_changes_inner_effect_entries_inner_t *move_detail_effect_changes_inner_effect_entries_inner);

move_detail_effect_changes_inner_effect_entries_inner_t *move_detail_effect_changes_inner_effect_entries_inner_parseFromJSON(cJSON *move_detail_effect_changes_inner_effect_entries_innerJSON);

cJSON *move_detail_effect_changes_inner_effect_entries_inner_convertToJSON(move_detail_effect_changes_inner_effect_entries_inner_t *move_detail_effect_changes_inner_effect_entries_inner);

#endif /* _move_detail_effect_changes_inner_effect_entries_inner_H_ */

