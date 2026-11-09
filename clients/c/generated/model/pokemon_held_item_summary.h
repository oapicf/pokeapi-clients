/*
 * pokemon_held_item_summary.h
 *
 * 
 */

#ifndef _pokemon_held_item_summary_H_
#define _pokemon_held_item_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_held_item_summary_t pokemon_held_item_summary_t;

#include "item_summary.h"
#include "pokemon_held_item_version.h"



typedef struct pokemon_held_item_summary_t {
    struct item_summary_t *item; //model
    list_t *version_details; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_held_item_summary_t;

__attribute__((deprecated)) pokemon_held_item_summary_t *pokemon_held_item_summary_create(
    item_summary_t *item,
    list_t *version_details
);

void pokemon_held_item_summary_free(pokemon_held_item_summary_t *pokemon_held_item_summary);

pokemon_held_item_summary_t *pokemon_held_item_summary_parseFromJSON(cJSON *pokemon_held_item_summaryJSON);

cJSON *pokemon_held_item_summary_convertToJSON(pokemon_held_item_summary_t *pokemon_held_item_summary);

#endif /* _pokemon_held_item_summary_H_ */

