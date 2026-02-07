/*
 * egg_group_name.h
 *
 * 
 */

#ifndef _egg_group_name_H_
#define _egg_group_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct egg_group_name_t egg_group_name_t;

#include "language_summary.h"



typedef struct egg_group_name_t {
    char *name; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} egg_group_name_t;

__attribute__((deprecated)) egg_group_name_t *egg_group_name_create(
    char *name,
    language_summary_t *language
);

void egg_group_name_free(egg_group_name_t *egg_group_name);

egg_group_name_t *egg_group_name_parseFromJSON(cJSON *egg_group_nameJSON);

cJSON *egg_group_name_convertToJSON(egg_group_name_t *egg_group_name);

#endif /* _egg_group_name_H_ */

