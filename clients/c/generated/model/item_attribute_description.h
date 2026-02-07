/*
 * item_attribute_description.h
 *
 * 
 */

#ifndef _item_attribute_description_H_
#define _item_attribute_description_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_attribute_description_t item_attribute_description_t;

#include "language_summary.h"



typedef struct item_attribute_description_t {
    char *description; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} item_attribute_description_t;

__attribute__((deprecated)) item_attribute_description_t *item_attribute_description_create(
    char *description,
    language_summary_t *language
);

void item_attribute_description_free(item_attribute_description_t *item_attribute_description);

item_attribute_description_t *item_attribute_description_parseFromJSON(cJSON *item_attribute_descriptionJSON);

cJSON *item_attribute_description_convertToJSON(item_attribute_description_t *item_attribute_description);

#endif /* _item_attribute_description_H_ */

