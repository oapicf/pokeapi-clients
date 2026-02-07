/*
 * pokemon_detail_held_items.h
 *
 * 
 */

#ifndef _pokemon_detail_held_items_H_
#define _pokemon_detail_held_items_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_detail_held_items_t pokemon_detail_held_items_t;

#include "ability_detail_pokemon_inner_pokemon.h"
#include "item_detail_held_by_pokemon_inner_version_details_inner.h"



typedef struct pokemon_detail_held_items_t {
    struct ability_detail_pokemon_inner_pokemon_t *item; //model
    list_t *version_details; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_detail_held_items_t;

__attribute__((deprecated)) pokemon_detail_held_items_t *pokemon_detail_held_items_create(
    ability_detail_pokemon_inner_pokemon_t *item,
    list_t *version_details
);

void pokemon_detail_held_items_free(pokemon_detail_held_items_t *pokemon_detail_held_items);

pokemon_detail_held_items_t *pokemon_detail_held_items_parseFromJSON(cJSON *pokemon_detail_held_itemsJSON);

cJSON *pokemon_detail_held_items_convertToJSON(pokemon_detail_held_items_t *pokemon_detail_held_items);

#endif /* _pokemon_detail_held_items_H_ */

