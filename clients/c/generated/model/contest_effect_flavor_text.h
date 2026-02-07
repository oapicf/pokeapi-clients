/*
 * contest_effect_flavor_text.h
 *
 * 
 */

#ifndef _contest_effect_flavor_text_H_
#define _contest_effect_flavor_text_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct contest_effect_flavor_text_t contest_effect_flavor_text_t;

#include "language_summary.h"



typedef struct contest_effect_flavor_text_t {
    char *flavor_text; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} contest_effect_flavor_text_t;

__attribute__((deprecated)) contest_effect_flavor_text_t *contest_effect_flavor_text_create(
    char *flavor_text,
    language_summary_t *language
);

void contest_effect_flavor_text_free(contest_effect_flavor_text_t *contest_effect_flavor_text);

contest_effect_flavor_text_t *contest_effect_flavor_text_parseFromJSON(cJSON *contest_effect_flavor_textJSON);

cJSON *contest_effect_flavor_text_convertToJSON(contest_effect_flavor_text_t *contest_effect_flavor_text);

#endif /* _contest_effect_flavor_text_H_ */

