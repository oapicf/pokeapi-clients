/*
 * pokemon_held_item.h
 *
 * 
 */

#ifndef _pokemon_held_item_H_
#define _pokemon_held_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_held_item_t pokemon_held_item_t;

#include "pokemon_held_item_version.h"
#include "pokemon_summary.h"



typedef struct pokemon_held_item_t {
    struct pokemon_summary_t *pokemon; //model
    list_t *version_details; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_held_item_t;

__attribute__((deprecated)) pokemon_held_item_t *pokemon_held_item_create(
    pokemon_summary_t *pokemon,
    list_t *version_details
);

void pokemon_held_item_free(pokemon_held_item_t *pokemon_held_item);

pokemon_held_item_t *pokemon_held_item_parseFromJSON(cJSON *pokemon_held_itemJSON);

cJSON *pokemon_held_item_convertToJSON(pokemon_held_item_t *pokemon_held_item);

#endif /* _pokemon_held_item_H_ */

