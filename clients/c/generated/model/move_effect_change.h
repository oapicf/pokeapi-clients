/*
 * move_effect_change.h
 *
 * 
 */

#ifndef _move_effect_change_H_
#define _move_effect_change_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct move_effect_change_t move_effect_change_t;

#include "move_effect_change_effect_text.h"
#include "version_group_summary.h"



typedef struct move_effect_change_t {
    struct version_group_summary_t *version_group; //model
    list_t *effect_entries; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} move_effect_change_t;

__attribute__((deprecated)) move_effect_change_t *move_effect_change_create(
    version_group_summary_t *version_group,
    list_t *effect_entries
);

void move_effect_change_free(move_effect_change_t *move_effect_change);

move_effect_change_t *move_effect_change_parseFromJSON(cJSON *move_effect_changeJSON);

cJSON *move_effect_change_convertToJSON(move_effect_change_t *move_effect_change);

#endif /* _move_effect_change_H_ */

