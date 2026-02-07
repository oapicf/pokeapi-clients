/*
 * berry_firmness_name.h
 *
 * 
 */

#ifndef _berry_firmness_name_H_
#define _berry_firmness_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct berry_firmness_name_t berry_firmness_name_t;

#include "language_summary.h"



typedef struct berry_firmness_name_t {
    char *name; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} berry_firmness_name_t;

__attribute__((deprecated)) berry_firmness_name_t *berry_firmness_name_create(
    char *name,
    language_summary_t *language
);

void berry_firmness_name_free(berry_firmness_name_t *berry_firmness_name);

berry_firmness_name_t *berry_firmness_name_parseFromJSON(cJSON *berry_firmness_nameJSON);

cJSON *berry_firmness_name_convertToJSON(berry_firmness_name_t *berry_firmness_name);

#endif /* _berry_firmness_name_H_ */

