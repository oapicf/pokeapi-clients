/*
 * berry_summary.h
 *
 * 
 */

#ifndef _berry_summary_H_
#define _berry_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct berry_summary_t berry_summary_t;




typedef struct berry_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} berry_summary_t;

__attribute__((deprecated)) berry_summary_t *berry_summary_create(
    char *name,
    char *url
);

void berry_summary_free(berry_summary_t *berry_summary);

berry_summary_t *berry_summary_parseFromJSON(cJSON *berry_summaryJSON);

cJSON *berry_summary_convertToJSON(berry_summary_t *berry_summary);

#endif /* _berry_summary_H_ */

