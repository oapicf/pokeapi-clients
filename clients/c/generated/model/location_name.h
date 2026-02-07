/*
 * location_name.h
 *
 * 
 */

#ifndef _location_name_H_
#define _location_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct location_name_t location_name_t;

#include "language_summary.h"



typedef struct location_name_t {
    char *name; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} location_name_t;

__attribute__((deprecated)) location_name_t *location_name_create(
    char *name,
    language_summary_t *language
);

void location_name_free(location_name_t *location_name);

location_name_t *location_name_parseFromJSON(cJSON *location_nameJSON);

cJSON *location_name_convertToJSON(location_name_t *location_name);

#endif /* _location_name_H_ */

