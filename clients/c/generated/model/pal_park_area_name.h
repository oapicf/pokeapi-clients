/*
 * pal_park_area_name.h
 *
 * 
 */

#ifndef _pal_park_area_name_H_
#define _pal_park_area_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pal_park_area_name_t pal_park_area_name_t;

#include "language_summary.h"



typedef struct pal_park_area_name_t {
    char *name; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pal_park_area_name_t;

__attribute__((deprecated)) pal_park_area_name_t *pal_park_area_name_create(
    char *name,
    language_summary_t *language
);

void pal_park_area_name_free(pal_park_area_name_t *pal_park_area_name);

pal_park_area_name_t *pal_park_area_name_parseFromJSON(cJSON *pal_park_area_nameJSON);

cJSON *pal_park_area_name_convertToJSON(pal_park_area_name_t *pal_park_area_name);

#endif /* _pal_park_area_name_H_ */

