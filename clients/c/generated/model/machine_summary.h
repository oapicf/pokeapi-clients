/*
 * machine_summary.h
 *
 * 
 */

#ifndef _machine_summary_H_
#define _machine_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct machine_summary_t machine_summary_t;




typedef struct machine_summary_t {
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} machine_summary_t;

__attribute__((deprecated)) machine_summary_t *machine_summary_create(
    char *url
);

void machine_summary_free(machine_summary_t *machine_summary);

machine_summary_t *machine_summary_parseFromJSON(cJSON *machine_summaryJSON);

cJSON *machine_summary_convertToJSON(machine_summary_t *machine_summary);

#endif /* _machine_summary_H_ */

