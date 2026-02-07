/*
 * pokemon_game_index.h
 *
 * 
 */

#ifndef _pokemon_game_index_H_
#define _pokemon_game_index_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_game_index_t pokemon_game_index_t;

#include "version_summary.h"



typedef struct pokemon_game_index_t {
    int game_index; //numeric
    struct version_summary_t *version; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_game_index_t;

__attribute__((deprecated)) pokemon_game_index_t *pokemon_game_index_create(
    int game_index,
    version_summary_t *version
);

void pokemon_game_index_free(pokemon_game_index_t *pokemon_game_index);

pokemon_game_index_t *pokemon_game_index_parseFromJSON(cJSON *pokemon_game_indexJSON);

cJSON *pokemon_game_index_convertToJSON(pokemon_game_index_t *pokemon_game_index);

#endif /* _pokemon_game_index_H_ */

