/*
 * encounter_condition_name.h
 *
 * 
 */

#ifndef _encounter_condition_name_H_
#define _encounter_condition_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct encounter_condition_name_t encounter_condition_name_t;

#include "language_summary.h"



typedef struct encounter_condition_name_t {
    char *name; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} encounter_condition_name_t;

__attribute__((deprecated)) encounter_condition_name_t *encounter_condition_name_create(
    char *name,
    language_summary_t *language
);

void encounter_condition_name_free(encounter_condition_name_t *encounter_condition_name);

encounter_condition_name_t *encounter_condition_name_parseFromJSON(cJSON *encounter_condition_nameJSON);

cJSON *encounter_condition_name_convertToJSON(encounter_condition_name_t *encounter_condition_name);

#endif /* _encounter_condition_name_H_ */

