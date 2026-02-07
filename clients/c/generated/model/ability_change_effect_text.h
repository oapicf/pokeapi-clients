/*
 * ability_change_effect_text.h
 *
 * 
 */

#ifndef _ability_change_effect_text_H_
#define _ability_change_effect_text_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ability_change_effect_text_t ability_change_effect_text_t;

#include "language_summary.h"



typedef struct ability_change_effect_text_t {
    char *effect; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} ability_change_effect_text_t;

__attribute__((deprecated)) ability_change_effect_text_t *ability_change_effect_text_create(
    char *effect,
    language_summary_t *language
);

void ability_change_effect_text_free(ability_change_effect_text_t *ability_change_effect_text);

ability_change_effect_text_t *ability_change_effect_text_parseFromJSON(cJSON *ability_change_effect_textJSON);

cJSON *ability_change_effect_text_convertToJSON(ability_change_effect_text_t *ability_change_effect_text);

#endif /* _ability_change_effect_text_H_ */

