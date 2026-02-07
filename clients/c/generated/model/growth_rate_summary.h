/*
 * growth_rate_summary.h
 *
 * 
 */

#ifndef _growth_rate_summary_H_
#define _growth_rate_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct growth_rate_summary_t growth_rate_summary_t;




typedef struct growth_rate_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} growth_rate_summary_t;

__attribute__((deprecated)) growth_rate_summary_t *growth_rate_summary_create(
    char *name,
    char *url
);

void growth_rate_summary_free(growth_rate_summary_t *growth_rate_summary);

growth_rate_summary_t *growth_rate_summary_parseFromJSON(cJSON *growth_rate_summaryJSON);

cJSON *growth_rate_summary_convertToJSON(growth_rate_summary_t *growth_rate_summary);

#endif /* _growth_rate_summary_H_ */

