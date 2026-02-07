/*
 * growth_rate_description.h
 *
 * 
 */

#ifndef _growth_rate_description_H_
#define _growth_rate_description_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct growth_rate_description_t growth_rate_description_t;

#include "language_summary.h"



typedef struct growth_rate_description_t {
    char *description; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} growth_rate_description_t;

__attribute__((deprecated)) growth_rate_description_t *growth_rate_description_create(
    char *description,
    language_summary_t *language
);

void growth_rate_description_free(growth_rate_description_t *growth_rate_description);

growth_rate_description_t *growth_rate_description_parseFromJSON(cJSON *growth_rate_descriptionJSON);

cJSON *growth_rate_description_convertToJSON(growth_rate_description_t *growth_rate_description);

#endif /* _growth_rate_description_H_ */

