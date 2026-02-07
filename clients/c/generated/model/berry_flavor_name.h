/*
 * berry_flavor_name.h
 *
 * 
 */

#ifndef _berry_flavor_name_H_
#define _berry_flavor_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct berry_flavor_name_t berry_flavor_name_t;

#include "language_summary.h"



typedef struct berry_flavor_name_t {
    char *name; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} berry_flavor_name_t;

__attribute__((deprecated)) berry_flavor_name_t *berry_flavor_name_create(
    char *name,
    language_summary_t *language
);

void berry_flavor_name_free(berry_flavor_name_t *berry_flavor_name);

berry_flavor_name_t *berry_flavor_name_parseFromJSON(cJSON *berry_flavor_nameJSON);

cJSON *berry_flavor_name_convertToJSON(berry_flavor_name_t *berry_flavor_name);

#endif /* _berry_flavor_name_H_ */

