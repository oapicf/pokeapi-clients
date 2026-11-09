/*
 * stat_affecting_moves.h
 *
 * 
 */

#ifndef _stat_affecting_moves_H_
#define _stat_affecting_moves_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct stat_affecting_moves_t stat_affecting_moves_t;

#include "move_stat_change.h"



typedef struct stat_affecting_moves_t {
    list_t *increase; //nonprimitive container
    list_t *decrease; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} stat_affecting_moves_t;

__attribute__((deprecated)) stat_affecting_moves_t *stat_affecting_moves_create(
    list_t *increase,
    list_t *decrease
);

void stat_affecting_moves_free(stat_affecting_moves_t *stat_affecting_moves);

stat_affecting_moves_t *stat_affecting_moves_parseFromJSON(cJSON *stat_affecting_movesJSON);

cJSON *stat_affecting_moves_convertToJSON(stat_affecting_moves_t *stat_affecting_moves);

#endif /* _stat_affecting_moves_H_ */

