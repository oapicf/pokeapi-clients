/*
 * nature_name.h
 *
 * 
 */

#ifndef _nature_name_H_
#define _nature_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct nature_name_t nature_name_t;

#include "language_summary.h"



typedef struct nature_name_t {
    char *name; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} nature_name_t;

__attribute__((deprecated)) nature_name_t *nature_name_create(
    char *name,
    language_summary_t *language
);

void nature_name_free(nature_name_t *nature_name);

nature_name_t *nature_name_parseFromJSON(cJSON *nature_nameJSON);

cJSON *nature_name_convertToJSON(nature_name_t *nature_name);

#endif /* _nature_name_H_ */

