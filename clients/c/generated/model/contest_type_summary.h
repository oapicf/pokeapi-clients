/*
 * contest_type_summary.h
 *
 * 
 */

#ifndef _contest_type_summary_H_
#define _contest_type_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct contest_type_summary_t contest_type_summary_t;




typedef struct contest_type_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} contest_type_summary_t;

__attribute__((deprecated)) contest_type_summary_t *contest_type_summary_create(
    char *name,
    char *url
);

void contest_type_summary_free(contest_type_summary_t *contest_type_summary);

contest_type_summary_t *contest_type_summary_parseFromJSON(cJSON *contest_type_summaryJSON);

cJSON *contest_type_summary_convertToJSON(contest_type_summary_t *contest_type_summary);

#endif /* _contest_type_summary_H_ */

