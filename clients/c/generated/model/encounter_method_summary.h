/*
 * encounter_method_summary.h
 *
 * 
 */

#ifndef _encounter_method_summary_H_
#define _encounter_method_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct encounter_method_summary_t encounter_method_summary_t;




typedef struct encounter_method_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} encounter_method_summary_t;

__attribute__((deprecated)) encounter_method_summary_t *encounter_method_summary_create(
    char *name,
    char *url
);

void encounter_method_summary_free(encounter_method_summary_t *encounter_method_summary);

encounter_method_summary_t *encounter_method_summary_parseFromJSON(cJSON *encounter_method_summaryJSON);

cJSON *encounter_method_summary_convertToJSON(encounter_method_summary_t *encounter_method_summary);

#endif /* _encounter_method_summary_H_ */

