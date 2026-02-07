/*
 * stat_name.h
 *
 * 
 */

#ifndef _stat_name_H_
#define _stat_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct stat_name_t stat_name_t;

#include "language_summary.h"



typedef struct stat_name_t {
    char *name; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} stat_name_t;

__attribute__((deprecated)) stat_name_t *stat_name_create(
    char *name,
    language_summary_t *language
);

void stat_name_free(stat_name_t *stat_name);

stat_name_t *stat_name_parseFromJSON(cJSON *stat_nameJSON);

cJSON *stat_name_convertToJSON(stat_name_t *stat_name);

#endif /* _stat_name_H_ */

