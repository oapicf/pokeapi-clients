/*
 * move_detail_contest_combos.h
 *
 * 
 */

#ifndef _move_detail_contest_combos_H_
#define _move_detail_contest_combos_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct move_detail_contest_combos_t move_detail_contest_combos_t;

#include "move_detail_contest_combos_normal.h"



typedef struct move_detail_contest_combos_t {
    struct move_detail_contest_combos_normal_t *normal; //model
    struct move_detail_contest_combos_normal_t *super; //model

    int _library_owned; // Is the library responsible for freeing this object?
} move_detail_contest_combos_t;

__attribute__((deprecated)) move_detail_contest_combos_t *move_detail_contest_combos_create(
    move_detail_contest_combos_normal_t *normal,
    move_detail_contest_combos_normal_t *super
);

void move_detail_contest_combos_free(move_detail_contest_combos_t *move_detail_contest_combos);

move_detail_contest_combos_t *move_detail_contest_combos_parseFromJSON(cJSON *move_detail_contest_combosJSON);

cJSON *move_detail_contest_combos_convertToJSON(move_detail_contest_combos_t *move_detail_contest_combos);

#endif /* _move_detail_contest_combos_H_ */

