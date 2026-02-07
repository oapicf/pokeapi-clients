/*
 * stat_summary.h
 *
 * 
 */

#ifndef _stat_summary_H_
#define _stat_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct stat_summary_t stat_summary_t;




typedef struct stat_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} stat_summary_t;

__attribute__((deprecated)) stat_summary_t *stat_summary_create(
    char *name,
    char *url
);

void stat_summary_free(stat_summary_t *stat_summary);

stat_summary_t *stat_summary_parseFromJSON(cJSON *stat_summaryJSON);

cJSON *stat_summary_convertToJSON(stat_summary_t *stat_summary);

#endif /* _stat_summary_H_ */

