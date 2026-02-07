/*
 * location_game_index.h
 *
 * 
 */

#ifndef _location_game_index_H_
#define _location_game_index_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct location_game_index_t location_game_index_t;

#include "generation_summary.h"



typedef struct location_game_index_t {
    int game_index; //numeric
    struct generation_summary_t *generation; //model

    int _library_owned; // Is the library responsible for freeing this object?
} location_game_index_t;

__attribute__((deprecated)) location_game_index_t *location_game_index_create(
    int game_index,
    generation_summary_t *generation
);

void location_game_index_free(location_game_index_t *location_game_index);

location_game_index_t *location_game_index_parseFromJSON(cJSON *location_game_indexJSON);

cJSON *location_game_index_convertToJSON(location_game_index_t *location_game_index);

#endif /* _location_game_index_H_ */

