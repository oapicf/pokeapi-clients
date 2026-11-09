/*
 * move_combos.h
 *
 * 
 */

#ifndef _move_combos_H_
#define _move_combos_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct move_combos_t move_combos_t;

#include "move_combo_usage.h"



typedef struct move_combos_t {
    struct move_combo_usage_t *normal; //model
    struct move_combo_usage_t *super; //model

    int _library_owned; // Is the library responsible for freeing this object?
} move_combos_t;

__attribute__((deprecated)) move_combos_t *move_combos_create(
    move_combo_usage_t *normal,
    move_combo_usage_t *super
);

void move_combos_free(move_combos_t *move_combos);

move_combos_t *move_combos_parseFromJSON(cJSON *move_combosJSON);

cJSON *move_combos_convertToJSON(move_combos_t *move_combos);

#endif /* _move_combos_H_ */

