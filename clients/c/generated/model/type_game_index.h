/*
 * type_game_index.h
 *
 * 
 */

#ifndef _type_game_index_H_
#define _type_game_index_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct type_game_index_t type_game_index_t;

#include "generation_summary.h"



typedef struct type_game_index_t {
    int game_index; //numeric
    struct generation_summary_t *generation; //model

    int _library_owned; // Is the library responsible for freeing this object?
} type_game_index_t;

__attribute__((deprecated)) type_game_index_t *type_game_index_create(
    int game_index,
    generation_summary_t *generation
);

void type_game_index_free(type_game_index_t *type_game_index);

type_game_index_t *type_game_index_parseFromJSON(cJSON *type_game_indexJSON);

cJSON *type_game_index_convertToJSON(type_game_index_t *type_game_index);

#endif /* _type_game_index_H_ */

