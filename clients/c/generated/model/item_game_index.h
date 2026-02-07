/*
 * item_game_index.h
 *
 * 
 */

#ifndef _item_game_index_H_
#define _item_game_index_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_game_index_t item_game_index_t;

#include "generation_summary.h"



typedef struct item_game_index_t {
    int game_index; //numeric
    struct generation_summary_t *generation; //model

    int _library_owned; // Is the library responsible for freeing this object?
} item_game_index_t;

__attribute__((deprecated)) item_game_index_t *item_game_index_create(
    int game_index,
    generation_summary_t *generation
);

void item_game_index_free(item_game_index_t *item_game_index);

item_game_index_t *item_game_index_parseFromJSON(cJSON *item_game_indexJSON);

cJSON *item_game_index_convertToJSON(item_game_index_t *item_game_index);

#endif /* _item_game_index_H_ */

