/*
 * move_combo_usage.h
 *
 * 
 */

#ifndef _move_combo_usage_H_
#define _move_combo_usage_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct move_combo_usage_t move_combo_usage_t;

#include "move_summary.h"



typedef struct move_combo_usage_t {
    list_t *use_before; //nonprimitive container
    list_t *use_after; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} move_combo_usage_t;

__attribute__((deprecated)) move_combo_usage_t *move_combo_usage_create(
    list_t *use_before,
    list_t *use_after
);

void move_combo_usage_free(move_combo_usage_t *move_combo_usage);

move_combo_usage_t *move_combo_usage_parseFromJSON(cJSON *move_combo_usageJSON);

cJSON *move_combo_usage_convertToJSON(move_combo_usage_t *move_combo_usage);

#endif /* _move_combo_usage_H_ */

