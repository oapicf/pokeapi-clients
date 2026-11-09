/*
 * currency_detail.h
 *
 * 
 */

#ifndef _currency_detail_H_
#define _currency_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct currency_detail_t currency_detail_t;

#include "currency_name.h"



typedef struct currency_detail_t {
    int *id; //numeric
    char *name; // string
    list_t *names; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} currency_detail_t;

__attribute__((deprecated)) currency_detail_t *currency_detail_create(
    int *id,
    char *name,
    list_t *names
);

void currency_detail_free(currency_detail_t *currency_detail);

currency_detail_t *currency_detail_parseFromJSON(cJSON *currency_detailJSON);

cJSON *currency_detail_convertToJSON(currency_detail_t *currency_detail);

#endif /* _currency_detail_H_ */

