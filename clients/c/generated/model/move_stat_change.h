/*
 * move_stat_change.h
 *
 * 
 */

#ifndef _move_stat_change_H_
#define _move_stat_change_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct move_stat_change_t move_stat_change_t;

#include "move_summary.h"



typedef struct move_stat_change_t {
    int *change; //numeric
    struct move_summary_t *move; //model

    int _library_owned; // Is the library responsible for freeing this object?
} move_stat_change_t;

__attribute__((deprecated)) move_stat_change_t *move_stat_change_create(
    int *change,
    move_summary_t *move
);

void move_stat_change_free(move_stat_change_t *move_stat_change);

move_stat_change_t *move_stat_change_parseFromJSON(cJSON *move_stat_changeJSON);

cJSON *move_stat_change_convertToJSON(move_stat_change_t *move_stat_change);

#endif /* _move_stat_change_H_ */

