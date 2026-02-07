/*
 * version_name.h
 *
 * 
 */

#ifndef _version_name_H_
#define _version_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct version_name_t version_name_t;

#include "language_summary.h"



typedef struct version_name_t {
    char *name; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} version_name_t;

__attribute__((deprecated)) version_name_t *version_name_create(
    char *name,
    language_summary_t *language
);

void version_name_free(version_name_t *version_name);

version_name_t *version_name_parseFromJSON(cJSON *version_nameJSON);

cJSON *version_name_convertToJSON(version_name_t *version_name);

#endif /* _version_name_H_ */

