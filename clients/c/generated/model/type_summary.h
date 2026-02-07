/*
 * type_summary.h
 *
 * 
 */

#ifndef _type_summary_H_
#define _type_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct type_summary_t type_summary_t;




typedef struct type_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} type_summary_t;

__attribute__((deprecated)) type_summary_t *type_summary_create(
    char *name,
    char *url
);

void type_summary_free(type_summary_t *type_summary);

type_summary_t *type_summary_parseFromJSON(cJSON *type_summaryJSON);

cJSON *type_summary_convertToJSON(type_summary_t *type_summary);

#endif /* _type_summary_H_ */

