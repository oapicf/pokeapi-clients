/*
 * contest_effect_detail.h
 *
 * 
 */

#ifndef _contest_effect_detail_H_
#define _contest_effect_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct contest_effect_detail_t contest_effect_detail_t;

#include "contest_effect_effect_text.h"
#include "contest_effect_flavor_text.h"



typedef struct contest_effect_detail_t {
    int id; //numeric
    int appeal; //numeric
    int jam; //numeric
    list_t *effect_entries; //nonprimitive container
    list_t *flavor_text_entries; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} contest_effect_detail_t;

__attribute__((deprecated)) contest_effect_detail_t *contest_effect_detail_create(
    int id,
    int appeal,
    int jam,
    list_t *effect_entries,
    list_t *flavor_text_entries
);

void contest_effect_detail_free(contest_effect_detail_t *contest_effect_detail);

contest_effect_detail_t *contest_effect_detail_parseFromJSON(cJSON *contest_effect_detailJSON);

cJSON *contest_effect_detail_convertToJSON(contest_effect_detail_t *contest_effect_detail);

#endif /* _contest_effect_detail_H_ */

