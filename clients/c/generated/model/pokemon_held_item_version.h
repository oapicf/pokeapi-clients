/*
 * pokemon_held_item_version.h
 *
 * 
 */

#ifndef _pokemon_held_item_version_H_
#define _pokemon_held_item_version_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_held_item_version_t pokemon_held_item_version_t;

#include "version_summary.h"



typedef struct pokemon_held_item_version_t {
    int *rarity; //numeric
    struct version_summary_t *version; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_held_item_version_t;

__attribute__((deprecated)) pokemon_held_item_version_t *pokemon_held_item_version_create(
    int *rarity,
    version_summary_t *version
);

void pokemon_held_item_version_free(pokemon_held_item_version_t *pokemon_held_item_version);

pokemon_held_item_version_t *pokemon_held_item_version_parseFromJSON(cJSON *pokemon_held_item_versionJSON);

cJSON *pokemon_held_item_version_convertToJSON(pokemon_held_item_version_t *pokemon_held_item_version);

#endif /* _pokemon_held_item_version_H_ */

