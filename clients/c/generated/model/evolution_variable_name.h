/*
 * evolution_variable_name.h
 *
 * 
 */

#ifndef _evolution_variable_name_H_
#define _evolution_variable_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct evolution_variable_name_t evolution_variable_name_t;

#include "language_summary.h"



typedef struct evolution_variable_name_t {
    char *name; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} evolution_variable_name_t;

__attribute__((deprecated)) evolution_variable_name_t *evolution_variable_name_create(
    char *name,
    language_summary_t *language
);

void evolution_variable_name_free(evolution_variable_name_t *evolution_variable_name);

evolution_variable_name_t *evolution_variable_name_parseFromJSON(cJSON *evolution_variable_nameJSON);

cJSON *evolution_variable_name_convertToJSON(evolution_variable_name_t *evolution_variable_name);

#endif /* _evolution_variable_name_H_ */

