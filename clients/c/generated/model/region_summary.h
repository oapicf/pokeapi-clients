/*
 * region_summary.h
 *
 * 
 */

#ifndef _region_summary_H_
#define _region_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct region_summary_t region_summary_t;




typedef struct region_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} region_summary_t;

__attribute__((deprecated)) region_summary_t *region_summary_create(
    char *name,
    char *url
);

void region_summary_free(region_summary_t *region_summary);

region_summary_t *region_summary_parseFromJSON(cJSON *region_summaryJSON);

cJSON *region_summary_convertToJSON(region_summary_t *region_summary);

#endif /* _region_summary_H_ */

