/*
 * super_contest_effect_detail.h
 *
 * 
 */

#ifndef _super_contest_effect_detail_H_
#define _super_contest_effect_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct super_contest_effect_detail_t super_contest_effect_detail_t;

#include "move_summary.h"
#include "super_contest_effect_flavor_text.h"



typedef struct super_contest_effect_detail_t {
    int id; //numeric
    int appeal; //numeric
    list_t *flavor_text_entries; //nonprimitive container
    list_t *moves; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} super_contest_effect_detail_t;

__attribute__((deprecated)) super_contest_effect_detail_t *super_contest_effect_detail_create(
    int id,
    int appeal,
    list_t *flavor_text_entries,
    list_t *moves
);

void super_contest_effect_detail_free(super_contest_effect_detail_t *super_contest_effect_detail);

super_contest_effect_detail_t *super_contest_effect_detail_parseFromJSON(cJSON *super_contest_effect_detailJSON);

cJSON *super_contest_effect_detail_convertToJSON(super_contest_effect_detail_t *super_contest_effect_detail);

#endif /* _super_contest_effect_detail_H_ */

