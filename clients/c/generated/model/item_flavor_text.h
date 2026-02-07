/*
 * item_flavor_text.h
 *
 * 
 */

#ifndef _item_flavor_text_H_
#define _item_flavor_text_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_flavor_text_t item_flavor_text_t;

#include "language_summary.h"
#include "version_group_summary.h"



typedef struct item_flavor_text_t {
    char *text; // string
    struct version_group_summary_t *version_group; //model
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} item_flavor_text_t;

__attribute__((deprecated)) item_flavor_text_t *item_flavor_text_create(
    char *text,
    version_group_summary_t *version_group,
    language_summary_t *language
);

void item_flavor_text_free(item_flavor_text_t *item_flavor_text);

item_flavor_text_t *item_flavor_text_parseFromJSON(cJSON *item_flavor_textJSON);

cJSON *item_flavor_text_convertToJSON(item_flavor_text_t *item_flavor_text);

#endif /* _item_flavor_text_H_ */

