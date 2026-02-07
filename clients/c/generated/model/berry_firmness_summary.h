/*
 * berry_firmness_summary.h
 *
 * 
 */

#ifndef _berry_firmness_summary_H_
#define _berry_firmness_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct berry_firmness_summary_t berry_firmness_summary_t;




typedef struct berry_firmness_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} berry_firmness_summary_t;

__attribute__((deprecated)) berry_firmness_summary_t *berry_firmness_summary_create(
    char *name,
    char *url
);

void berry_firmness_summary_free(berry_firmness_summary_t *berry_firmness_summary);

berry_firmness_summary_t *berry_firmness_summary_parseFromJSON(cJSON *berry_firmness_summaryJSON);

cJSON *berry_firmness_summary_convertToJSON(berry_firmness_summary_t *berry_firmness_summary);

#endif /* _berry_firmness_summary_H_ */

