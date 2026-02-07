/*
 * ability_change.h
 *
 * 
 */

#ifndef _ability_change_H_
#define _ability_change_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ability_change_t ability_change_t;

#include "ability_change_effect_text.h"
#include "version_group_summary.h"



typedef struct ability_change_t {
    struct version_group_summary_t *version_group; //model
    list_t *effect_entries; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} ability_change_t;

__attribute__((deprecated)) ability_change_t *ability_change_create(
    version_group_summary_t *version_group,
    list_t *effect_entries
);

void ability_change_free(ability_change_t *ability_change);

ability_change_t *ability_change_parseFromJSON(cJSON *ability_changeJSON);

cJSON *ability_change_convertToJSON(ability_change_t *ability_change);

#endif /* _ability_change_H_ */

