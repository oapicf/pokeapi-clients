/*
 * move_meta_stat_change.h
 *
 * 
 */

#ifndef _move_meta_stat_change_H_
#define _move_meta_stat_change_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct move_meta_stat_change_t move_meta_stat_change_t;

#include "stat_summary.h"



typedef struct move_meta_stat_change_t {
    int *change; //numeric
    struct stat_summary_t *stat; //model

    int _library_owned; // Is the library responsible for freeing this object?
} move_meta_stat_change_t;

__attribute__((deprecated)) move_meta_stat_change_t *move_meta_stat_change_create(
    int *change,
    stat_summary_t *stat
);

void move_meta_stat_change_free(move_meta_stat_change_t *move_meta_stat_change);

move_meta_stat_change_t *move_meta_stat_change_parseFromJSON(cJSON *move_meta_stat_changeJSON);

cJSON *move_meta_stat_change_convertToJSON(move_meta_stat_change_t *move_meta_stat_change);

#endif /* _move_meta_stat_change_H_ */

