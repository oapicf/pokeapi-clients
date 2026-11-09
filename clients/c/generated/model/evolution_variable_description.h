/*
 * evolution_variable_description.h
 *
 * 
 */

#ifndef _evolution_variable_description_H_
#define _evolution_variable_description_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct evolution_variable_description_t evolution_variable_description_t;

#include "language_summary.h"



typedef struct evolution_variable_description_t {
    char *description; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} evolution_variable_description_t;

__attribute__((deprecated)) evolution_variable_description_t *evolution_variable_description_create(
    char *description,
    language_summary_t *language
);

void evolution_variable_description_free(evolution_variable_description_t *evolution_variable_description);

evolution_variable_description_t *evolution_variable_description_parseFromJSON(cJSON *evolution_variable_descriptionJSON);

cJSON *evolution_variable_description_convertToJSON(evolution_variable_description_t *evolution_variable_description);

#endif /* _evolution_variable_description_H_ */

