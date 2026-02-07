/*
 * location_summary.h
 *
 * 
 */

#ifndef _location_summary_H_
#define _location_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct location_summary_t location_summary_t;




typedef struct location_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} location_summary_t;

__attribute__((deprecated)) location_summary_t *location_summary_create(
    char *name,
    char *url
);

void location_summary_free(location_summary_t *location_summary);

location_summary_t *location_summary_parseFromJSON(cJSON *location_summaryJSON);

cJSON *location_summary_convertToJSON(location_summary_t *location_summary);

#endif /* _location_summary_H_ */

