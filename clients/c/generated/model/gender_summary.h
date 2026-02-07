/*
 * gender_summary.h
 *
 * 
 */

#ifndef _gender_summary_H_
#define _gender_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct gender_summary_t gender_summary_t;




typedef struct gender_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} gender_summary_t;

__attribute__((deprecated)) gender_summary_t *gender_summary_create(
    char *name,
    char *url
);

void gender_summary_free(gender_summary_t *gender_summary);

gender_summary_t *gender_summary_parseFromJSON(cJSON *gender_summaryJSON);

cJSON *gender_summary_convertToJSON(gender_summary_t *gender_summary);

#endif /* _gender_summary_H_ */

