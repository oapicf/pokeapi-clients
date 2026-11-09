/*
 * currency_name.h
 *
 * 
 */

#ifndef _currency_name_H_
#define _currency_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct currency_name_t currency_name_t;

#include "language_summary.h"



typedef struct currency_name_t {
    char *name; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} currency_name_t;

__attribute__((deprecated)) currency_name_t *currency_name_create(
    char *name,
    language_summary_t *language
);

void currency_name_free(currency_name_t *currency_name);

currency_name_t *currency_name_parseFromJSON(cJSON *currency_nameJSON);

cJSON *currency_name_convertToJSON(currency_name_t *currency_name);

#endif /* _currency_name_H_ */

