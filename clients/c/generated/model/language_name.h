/*
 * language_name.h
 *
 * 
 */

#ifndef _language_name_H_
#define _language_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct language_name_t language_name_t;

#include "language_summary.h"



typedef struct language_name_t {
    char *name; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} language_name_t;

__attribute__((deprecated)) language_name_t *language_name_create(
    char *name,
    language_summary_t *language
);

void language_name_free(language_name_t *language_name);

language_name_t *language_name_parseFromJSON(cJSON *language_nameJSON);

cJSON *language_name_convertToJSON(language_name_t *language_name);

#endif /* _language_name_H_ */

