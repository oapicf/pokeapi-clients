/*
 * item_effect_text.h
 *
 * 
 */

#ifndef _item_effect_text_H_
#define _item_effect_text_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_effect_text_t item_effect_text_t;

#include "language_summary.h"



typedef struct item_effect_text_t {
    char *effect; // string
    char *short_effect; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} item_effect_text_t;

__attribute__((deprecated)) item_effect_text_t *item_effect_text_create(
    char *effect,
    char *short_effect,
    language_summary_t *language
);

void item_effect_text_free(item_effect_text_t *item_effect_text);

item_effect_text_t *item_effect_text_parseFromJSON(cJSON *item_effect_textJSON);

cJSON *item_effect_text_convertToJSON(item_effect_text_t *item_effect_text);

#endif /* _item_effect_text_H_ */

