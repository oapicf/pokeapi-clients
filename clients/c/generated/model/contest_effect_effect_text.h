/*
 * contest_effect_effect_text.h
 *
 * 
 */

#ifndef _contest_effect_effect_text_H_
#define _contest_effect_effect_text_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct contest_effect_effect_text_t contest_effect_effect_text_t;

#include "language_summary.h"



typedef struct contest_effect_effect_text_t {
    char *effect; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} contest_effect_effect_text_t;

__attribute__((deprecated)) contest_effect_effect_text_t *contest_effect_effect_text_create(
    char *effect,
    language_summary_t *language
);

void contest_effect_effect_text_free(contest_effect_effect_text_t *contest_effect_effect_text);

contest_effect_effect_text_t *contest_effect_effect_text_parseFromJSON(cJSON *contest_effect_effect_textJSON);

cJSON *contest_effect_effect_text_convertToJSON(contest_effect_effect_text_t *contest_effect_effect_text);

#endif /* _contest_effect_effect_text_H_ */

