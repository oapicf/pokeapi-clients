/*
 * item_name.h
 *
 * 
 */

#ifndef _item_name_H_
#define _item_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_name_t item_name_t;

#include "language_summary.h"



typedef struct item_name_t {
    char *name; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} item_name_t;

__attribute__((deprecated)) item_name_t *item_name_create(
    char *name,
    language_summary_t *language
);

void item_name_free(item_name_t *item_name);

item_name_t *item_name_parseFromJSON(cJSON *item_nameJSON);

cJSON *item_name_convertToJSON(item_name_t *item_name);

#endif /* _item_name_H_ */

