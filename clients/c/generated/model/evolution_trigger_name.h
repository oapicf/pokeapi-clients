/*
 * evolution_trigger_name.h
 *
 * 
 */

#ifndef _evolution_trigger_name_H_
#define _evolution_trigger_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct evolution_trigger_name_t evolution_trigger_name_t;

#include "language_summary.h"



typedef struct evolution_trigger_name_t {
    char *name; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} evolution_trigger_name_t;

__attribute__((deprecated)) evolution_trigger_name_t *evolution_trigger_name_create(
    char *name,
    language_summary_t *language
);

void evolution_trigger_name_free(evolution_trigger_name_t *evolution_trigger_name);

evolution_trigger_name_t *evolution_trigger_name_parseFromJSON(cJSON *evolution_trigger_nameJSON);

cJSON *evolution_trigger_name_convertToJSON(evolution_trigger_name_t *evolution_trigger_name);

#endif /* _evolution_trigger_name_H_ */

