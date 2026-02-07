/*
 * encounter_method_name.h
 *
 * 
 */

#ifndef _encounter_method_name_H_
#define _encounter_method_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct encounter_method_name_t encounter_method_name_t;

#include "language_summary.h"



typedef struct encounter_method_name_t {
    char *name; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} encounter_method_name_t;

__attribute__((deprecated)) encounter_method_name_t *encounter_method_name_create(
    char *name,
    language_summary_t *language
);

void encounter_method_name_free(encounter_method_name_t *encounter_method_name);

encounter_method_name_t *encounter_method_name_parseFromJSON(cJSON *encounter_method_nameJSON);

cJSON *encounter_method_name_convertToJSON(encounter_method_name_t *encounter_method_name);

#endif /* _encounter_method_name_H_ */

