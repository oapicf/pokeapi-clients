/*
 * item_detail_held_by_pokemon_inner.h
 *
 * 
 */

#ifndef _item_detail_held_by_pokemon_inner_H_
#define _item_detail_held_by_pokemon_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_detail_held_by_pokemon_inner_t item_detail_held_by_pokemon_inner_t;

#include "ability_detail_pokemon_inner_pokemon.h"
#include "item_detail_held_by_pokemon_inner_version_details_inner.h"



typedef struct item_detail_held_by_pokemon_inner_t {
    struct ability_detail_pokemon_inner_pokemon_t *pokemon; //model
    list_t *version_details; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} item_detail_held_by_pokemon_inner_t;

__attribute__((deprecated)) item_detail_held_by_pokemon_inner_t *item_detail_held_by_pokemon_inner_create(
    ability_detail_pokemon_inner_pokemon_t *pokemon,
    list_t *version_details
);

void item_detail_held_by_pokemon_inner_free(item_detail_held_by_pokemon_inner_t *item_detail_held_by_pokemon_inner);

item_detail_held_by_pokemon_inner_t *item_detail_held_by_pokemon_inner_parseFromJSON(cJSON *item_detail_held_by_pokemon_innerJSON);

cJSON *item_detail_held_by_pokemon_inner_convertToJSON(item_detail_held_by_pokemon_inner_t *item_detail_held_by_pokemon_inner);

#endif /* _item_detail_held_by_pokemon_inner_H_ */

