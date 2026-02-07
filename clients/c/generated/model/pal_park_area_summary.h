/*
 * pal_park_area_summary.h
 *
 * 
 */

#ifndef _pal_park_area_summary_H_
#define _pal_park_area_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pal_park_area_summary_t pal_park_area_summary_t;




typedef struct pal_park_area_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} pal_park_area_summary_t;

__attribute__((deprecated)) pal_park_area_summary_t *pal_park_area_summary_create(
    char *name,
    char *url
);

void pal_park_area_summary_free(pal_park_area_summary_t *pal_park_area_summary);

pal_park_area_summary_t *pal_park_area_summary_parseFromJSON(cJSON *pal_park_area_summaryJSON);

cJSON *pal_park_area_summary_convertToJSON(pal_park_area_summary_t *pal_park_area_summary);

#endif /* _pal_park_area_summary_H_ */

