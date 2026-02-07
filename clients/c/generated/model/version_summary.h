/*
 * version_summary.h
 *
 * 
 */

#ifndef _version_summary_H_
#define _version_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct version_summary_t version_summary_t;




typedef struct version_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} version_summary_t;

__attribute__((deprecated)) version_summary_t *version_summary_create(
    char *name,
    char *url
);

void version_summary_free(version_summary_t *version_summary);

version_summary_t *version_summary_parseFromJSON(cJSON *version_summaryJSON);

cJSON *version_summary_convertToJSON(version_summary_t *version_summary);

#endif /* _version_summary_H_ */

