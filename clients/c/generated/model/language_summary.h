/*
 * language_summary.h
 *
 * 
 */

#ifndef _language_summary_H_
#define _language_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct language_summary_t language_summary_t;




typedef struct language_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} language_summary_t;

__attribute__((deprecated)) language_summary_t *language_summary_create(
    char *name,
    char *url
);

void language_summary_free(language_summary_t *language_summary);

language_summary_t *language_summary_parseFromJSON(cJSON *language_summaryJSON);

cJSON *language_summary_convertToJSON(language_summary_t *language_summary);

#endif /* _language_summary_H_ */

