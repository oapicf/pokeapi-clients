/*
 * item_category_name.h
 *
 * 
 */

#ifndef _item_category_name_H_
#define _item_category_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_category_name_t item_category_name_t;

#include "language_summary.h"



typedef struct item_category_name_t {
    char *name; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} item_category_name_t;

__attribute__((deprecated)) item_category_name_t *item_category_name_create(
    char *name,
    language_summary_t *language
);

void item_category_name_free(item_category_name_t *item_category_name);

item_category_name_t *item_category_name_parseFromJSON(cJSON *item_category_nameJSON);

cJSON *item_category_name_convertToJSON(item_category_name_t *item_category_name);

#endif /* _item_category_name_H_ */

