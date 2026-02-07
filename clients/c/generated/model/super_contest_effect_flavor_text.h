/*
 * super_contest_effect_flavor_text.h
 *
 * 
 */

#ifndef _super_contest_effect_flavor_text_H_
#define _super_contest_effect_flavor_text_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct super_contest_effect_flavor_text_t super_contest_effect_flavor_text_t;

#include "language_summary.h"



typedef struct super_contest_effect_flavor_text_t {
    char *flavor_text; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} super_contest_effect_flavor_text_t;

__attribute__((deprecated)) super_contest_effect_flavor_text_t *super_contest_effect_flavor_text_create(
    char *flavor_text,
    language_summary_t *language
);

void super_contest_effect_flavor_text_free(super_contest_effect_flavor_text_t *super_contest_effect_flavor_text);

super_contest_effect_flavor_text_t *super_contest_effect_flavor_text_parseFromJSON(cJSON *super_contest_effect_flavor_textJSON);

cJSON *super_contest_effect_flavor_text_convertToJSON(super_contest_effect_flavor_text_t *super_contest_effect_flavor_text);

#endif /* _super_contest_effect_flavor_text_H_ */

