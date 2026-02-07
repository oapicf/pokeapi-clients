/*
 * item_pocket_name.h
 *
 * 
 */

#ifndef _item_pocket_name_H_
#define _item_pocket_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_pocket_name_t item_pocket_name_t;

#include "language_summary.h"



typedef struct item_pocket_name_t {
    char *name; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} item_pocket_name_t;

__attribute__((deprecated)) item_pocket_name_t *item_pocket_name_create(
    char *name,
    language_summary_t *language
);

void item_pocket_name_free(item_pocket_name_t *item_pocket_name);

item_pocket_name_t *item_pocket_name_parseFromJSON(cJSON *item_pocket_nameJSON);

cJSON *item_pocket_name_convertToJSON(item_pocket_name_t *item_pocket_name);

#endif /* _item_pocket_name_H_ */

