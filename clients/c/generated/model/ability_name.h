/*
 * ability_name.h
 *
 * 
 */

#ifndef _ability_name_H_
#define _ability_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ability_name_t ability_name_t;

#include "language_summary.h"



typedef struct ability_name_t {
    char *name; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} ability_name_t;

__attribute__((deprecated)) ability_name_t *ability_name_create(
    char *name,
    language_summary_t *language
);

void ability_name_free(ability_name_t *ability_name);

ability_name_t *ability_name_parseFromJSON(cJSON *ability_nameJSON);

cJSON *ability_name_convertToJSON(ability_name_t *ability_name);

#endif /* _ability_name_H_ */

