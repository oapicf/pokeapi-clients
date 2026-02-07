/*
 * contest_type_name.h
 *
 * 
 */

#ifndef _contest_type_name_H_
#define _contest_type_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct contest_type_name_t contest_type_name_t;

#include "language_summary.h"



typedef struct contest_type_name_t {
    char *name; // string
    char *color; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} contest_type_name_t;

__attribute__((deprecated)) contest_type_name_t *contest_type_name_create(
    char *name,
    char *color,
    language_summary_t *language
);

void contest_type_name_free(contest_type_name_t *contest_type_name);

contest_type_name_t *contest_type_name_parseFromJSON(cJSON *contest_type_nameJSON);

cJSON *contest_type_name_convertToJSON(contest_type_name_t *contest_type_name);

#endif /* _contest_type_name_H_ */

