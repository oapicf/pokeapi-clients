/*
 * characteristic_summary.h
 *
 * 
 */

#ifndef _characteristic_summary_H_
#define _characteristic_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct characteristic_summary_t characteristic_summary_t;




typedef struct characteristic_summary_t {
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} characteristic_summary_t;

__attribute__((deprecated)) characteristic_summary_t *characteristic_summary_create(
    char *url
);

void characteristic_summary_free(characteristic_summary_t *characteristic_summary);

characteristic_summary_t *characteristic_summary_parseFromJSON(cJSON *characteristic_summaryJSON);

cJSON *characteristic_summary_convertToJSON(characteristic_summary_t *characteristic_summary);

#endif /* _characteristic_summary_H_ */

