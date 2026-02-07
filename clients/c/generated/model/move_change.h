/*
 * move_change.h
 *
 * 
 */

#ifndef _move_change_H_
#define _move_change_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct move_change_t move_change_t;

#include "move_change_effect_entries_inner.h"
#include "type_summary.h"
#include "version_group_summary.h"



typedef struct move_change_t {
    int accuracy; //numeric
    int power; //numeric
    int pp; //numeric
    int effect_chance; //numeric
    list_t *effect_entries; //nonprimitive container
    struct type_summary_t *type; //model
    struct version_group_summary_t *version_group; //model

    int _library_owned; // Is the library responsible for freeing this object?
} move_change_t;

__attribute__((deprecated)) move_change_t *move_change_create(
    int accuracy,
    int power,
    int pp,
    int effect_chance,
    list_t *effect_entries,
    type_summary_t *type,
    version_group_summary_t *version_group
);

void move_change_free(move_change_t *move_change);

move_change_t *move_change_parseFromJSON(cJSON *move_changeJSON);

cJSON *move_change_convertToJSON(move_change_t *move_change);

#endif /* _move_change_H_ */

