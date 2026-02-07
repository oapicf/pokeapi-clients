/*
 * ability_summary.h
 *
 * 
 */

#ifndef _ability_summary_H_
#define _ability_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ability_summary_t ability_summary_t;




typedef struct ability_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ability_summary_t;

__attribute__((deprecated)) ability_summary_t *ability_summary_create(
    char *name,
    char *url
);

void ability_summary_free(ability_summary_t *ability_summary);

ability_summary_t *ability_summary_parseFromJSON(cJSON *ability_summaryJSON);

cJSON *ability_summary_convertToJSON(ability_summary_t *ability_summary);

#endif /* _ability_summary_H_ */

