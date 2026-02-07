/*
 * generation_name.h
 *
 * 
 */

#ifndef _generation_name_H_
#define _generation_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct generation_name_t generation_name_t;

#include "language_summary.h"



typedef struct generation_name_t {
    char *name; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} generation_name_t;

__attribute__((deprecated)) generation_name_t *generation_name_create(
    char *name,
    language_summary_t *language
);

void generation_name_free(generation_name_t *generation_name);

generation_name_t *generation_name_parseFromJSON(cJSON *generation_nameJSON);

cJSON *generation_name_convertToJSON(generation_name_t *generation_name);

#endif /* _generation_name_H_ */

