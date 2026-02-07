/*
 * language_detail.h
 *
 * 
 */

#ifndef _language_detail_H_
#define _language_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct language_detail_t language_detail_t;

#include "language_name.h"



typedef struct language_detail_t {
    int id; //numeric
    char *name; // string
    int official; //boolean
    char *iso639; // string
    char *iso3166; // string
    list_t *names; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} language_detail_t;

__attribute__((deprecated)) language_detail_t *language_detail_create(
    int id,
    char *name,
    int official,
    char *iso639,
    char *iso3166,
    list_t *names
);

void language_detail_free(language_detail_t *language_detail);

language_detail_t *language_detail_parseFromJSON(cJSON *language_detailJSON);

cJSON *language_detail_convertToJSON(language_detail_t *language_detail);

#endif /* _language_detail_H_ */

