/*
 * currency_summary.h
 *
 * 
 */

#ifndef _currency_summary_H_
#define _currency_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct currency_summary_t currency_summary_t;




typedef struct currency_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} currency_summary_t;

__attribute__((deprecated)) currency_summary_t *currency_summary_create(
    char *name,
    char *url
);

void currency_summary_free(currency_summary_t *currency_summary);

currency_summary_t *currency_summary_parseFromJSON(cJSON *currency_summaryJSON);

cJSON *currency_summary_convertToJSON(currency_summary_t *currency_summary);

#endif /* _currency_summary_H_ */

