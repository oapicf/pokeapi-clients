/*
 * evolution_trigger_summary.h
 *
 * 
 */

#ifndef _evolution_trigger_summary_H_
#define _evolution_trigger_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct evolution_trigger_summary_t evolution_trigger_summary_t;




typedef struct evolution_trigger_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} evolution_trigger_summary_t;

__attribute__((deprecated)) evolution_trigger_summary_t *evolution_trigger_summary_create(
    char *name,
    char *url
);

void evolution_trigger_summary_free(evolution_trigger_summary_t *evolution_trigger_summary);

evolution_trigger_summary_t *evolution_trigger_summary_parseFromJSON(cJSON *evolution_trigger_summaryJSON);

cJSON *evolution_trigger_summary_convertToJSON(evolution_trigger_summary_t *evolution_trigger_summary);

#endif /* _evolution_trigger_summary_H_ */

