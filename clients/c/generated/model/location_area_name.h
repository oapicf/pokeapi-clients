/*
 * location_area_name.h
 *
 * 
 */

#ifndef _location_area_name_H_
#define _location_area_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct location_area_name_t location_area_name_t;

#include "language_summary.h"



typedef struct location_area_name_t {
    char *name; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} location_area_name_t;

__attribute__((deprecated)) location_area_name_t *location_area_name_create(
    char *name,
    language_summary_t *language
);

void location_area_name_free(location_area_name_t *location_area_name);

location_area_name_t *location_area_name_parseFromJSON(cJSON *location_area_nameJSON);

cJSON *location_area_name_convertToJSON(location_area_name_t *location_area_name);

#endif /* _location_area_name_H_ */

