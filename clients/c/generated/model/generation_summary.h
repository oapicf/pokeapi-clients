/*
 * generation_summary.h
 *
 * 
 */

#ifndef _generation_summary_H_
#define _generation_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct generation_summary_t generation_summary_t;




typedef struct generation_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} generation_summary_t;

__attribute__((deprecated)) generation_summary_t *generation_summary_create(
    char *name,
    char *url
);

void generation_summary_free(generation_summary_t *generation_summary);

generation_summary_t *generation_summary_parseFromJSON(cJSON *generation_summaryJSON);

cJSON *generation_summary_convertToJSON(generation_summary_t *generation_summary);

#endif /* _generation_summary_H_ */

