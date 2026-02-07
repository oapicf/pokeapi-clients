/*
 * berry_flavor_summary.h
 *
 * 
 */

#ifndef _berry_flavor_summary_H_
#define _berry_flavor_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct berry_flavor_summary_t berry_flavor_summary_t;




typedef struct berry_flavor_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} berry_flavor_summary_t;

__attribute__((deprecated)) berry_flavor_summary_t *berry_flavor_summary_create(
    char *name,
    char *url
);

void berry_flavor_summary_free(berry_flavor_summary_t *berry_flavor_summary);

berry_flavor_summary_t *berry_flavor_summary_parseFromJSON(cJSON *berry_flavor_summaryJSON);

cJSON *berry_flavor_summary_convertToJSON(berry_flavor_summary_t *berry_flavor_summary);

#endif /* _berry_flavor_summary_H_ */

