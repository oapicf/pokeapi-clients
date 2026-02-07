/*
 * super_contest_effect_summary.h
 *
 * 
 */

#ifndef _super_contest_effect_summary_H_
#define _super_contest_effect_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct super_contest_effect_summary_t super_contest_effect_summary_t;




typedef struct super_contest_effect_summary_t {
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} super_contest_effect_summary_t;

__attribute__((deprecated)) super_contest_effect_summary_t *super_contest_effect_summary_create(
    char *url
);

void super_contest_effect_summary_free(super_contest_effect_summary_t *super_contest_effect_summary);

super_contest_effect_summary_t *super_contest_effect_summary_parseFromJSON(cJSON *super_contest_effect_summaryJSON);

cJSON *super_contest_effect_summary_convertToJSON(super_contest_effect_summary_t *super_contest_effect_summary);

#endif /* _super_contest_effect_summary_H_ */

