/*
 * location_area_summary.h
 *
 * 
 */

#ifndef _location_area_summary_H_
#define _location_area_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct location_area_summary_t location_area_summary_t;




typedef struct location_area_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} location_area_summary_t;

__attribute__((deprecated)) location_area_summary_t *location_area_summary_create(
    char *name,
    char *url
);

void location_area_summary_free(location_area_summary_t *location_area_summary);

location_area_summary_t *location_area_summary_parseFromJSON(cJSON *location_area_summaryJSON);

cJSON *location_area_summary_convertToJSON(location_area_summary_t *location_area_summary);

#endif /* _location_area_summary_H_ */

