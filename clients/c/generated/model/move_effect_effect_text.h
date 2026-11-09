/*
 * move_effect_effect_text.h
 *
 * 
 */

#ifndef _move_effect_effect_text_H_
#define _move_effect_effect_text_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct move_effect_effect_text_t move_effect_effect_text_t;

#include "language_summary.h"



typedef struct move_effect_effect_text_t {
    char *effect; // string
    char *short_effect; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} move_effect_effect_text_t;

__attribute__((deprecated)) move_effect_effect_text_t *move_effect_effect_text_create(
    char *effect,
    char *short_effect,
    language_summary_t *language
);

void move_effect_effect_text_free(move_effect_effect_text_t *move_effect_effect_text);

move_effect_effect_text_t *move_effect_effect_text_parseFromJSON(cJSON *move_effect_effect_textJSON);

cJSON *move_effect_effect_text_convertToJSON(move_effect_effect_text_t *move_effect_effect_text);

#endif /* _move_effect_effect_text_H_ */

