/*
 * move_target_summary.h
 *
 * 
 */

#ifndef _move_target_summary_H_
#define _move_target_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct move_target_summary_t move_target_summary_t;




typedef struct move_target_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} move_target_summary_t;

__attribute__((deprecated)) move_target_summary_t *move_target_summary_create(
    char *name,
    char *url
);

void move_target_summary_free(move_target_summary_t *move_target_summary);

move_target_summary_t *move_target_summary_parseFromJSON(cJSON *move_target_summaryJSON);

cJSON *move_target_summary_convertToJSON(move_target_summary_t *move_target_summary);

#endif /* _move_target_summary_H_ */

