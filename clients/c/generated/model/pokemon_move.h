/*
 * pokemon_move.h
 *
 * 
 */

#ifndef _pokemon_move_H_
#define _pokemon_move_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_move_t pokemon_move_t;

#include "move_summary.h"
#include "pokemon_move_version_group.h"



typedef struct pokemon_move_t {
    struct move_summary_t *move; //model
    list_t *version_group_details; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_move_t;

__attribute__((deprecated)) pokemon_move_t *pokemon_move_create(
    move_summary_t *move,
    list_t *version_group_details
);

void pokemon_move_free(pokemon_move_t *pokemon_move);

pokemon_move_t *pokemon_move_parseFromJSON(cJSON *pokemon_moveJSON);

cJSON *pokemon_move_convertToJSON(pokemon_move_t *pokemon_move);

#endif /* _pokemon_move_H_ */

