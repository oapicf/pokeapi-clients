/*
 * region_name.h
 *
 * 
 */

#ifndef _region_name_H_
#define _region_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct region_name_t region_name_t;

#include "language_summary.h"



typedef struct region_name_t {
    char *name; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} region_name_t;

__attribute__((deprecated)) region_name_t *region_name_create(
    char *name,
    language_summary_t *language
);

void region_name_free(region_name_t *region_name);

region_name_t *region_name_parseFromJSON(cJSON *region_nameJSON);

cJSON *region_name_convertToJSON(region_name_t *region_name);

#endif /* _region_name_H_ */

