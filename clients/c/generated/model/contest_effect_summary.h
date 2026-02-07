/*
 * contest_effect_summary.h
 *
 * 
 */

#ifndef _contest_effect_summary_H_
#define _contest_effect_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct contest_effect_summary_t contest_effect_summary_t;




typedef struct contest_effect_summary_t {
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} contest_effect_summary_t;

__attribute__((deprecated)) contest_effect_summary_t *contest_effect_summary_create(
    char *url
);

void contest_effect_summary_free(contest_effect_summary_t *contest_effect_summary);

contest_effect_summary_t *contest_effect_summary_parseFromJSON(cJSON *contest_effect_summaryJSON);

cJSON *contest_effect_summary_convertToJSON(contest_effect_summary_t *contest_effect_summary);

#endif /* _contest_effect_summary_H_ */

