/*
 * characteristic_description.h
 *
 * 
 */

#ifndef _characteristic_description_H_
#define _characteristic_description_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct characteristic_description_t characteristic_description_t;

#include "language_summary.h"



typedef struct characteristic_description_t {
    char *description; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} characteristic_description_t;

__attribute__((deprecated)) characteristic_description_t *characteristic_description_create(
    char *description,
    language_summary_t *language
);

void characteristic_description_free(characteristic_description_t *characteristic_description);

characteristic_description_t *characteristic_description_parseFromJSON(cJSON *characteristic_descriptionJSON);

cJSON *characteristic_description_convertToJSON(characteristic_description_t *characteristic_description);

#endif /* _characteristic_description_H_ */

