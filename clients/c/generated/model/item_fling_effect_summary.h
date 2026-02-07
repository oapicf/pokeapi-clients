/*
 * item_fling_effect_summary.h
 *
 * 
 */

#ifndef _item_fling_effect_summary_H_
#define _item_fling_effect_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_fling_effect_summary_t item_fling_effect_summary_t;




typedef struct item_fling_effect_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} item_fling_effect_summary_t;

__attribute__((deprecated)) item_fling_effect_summary_t *item_fling_effect_summary_create(
    char *name,
    char *url
);

void item_fling_effect_summary_free(item_fling_effect_summary_t *item_fling_effect_summary);

item_fling_effect_summary_t *item_fling_effect_summary_parseFromJSON(cJSON *item_fling_effect_summaryJSON);

cJSON *item_fling_effect_summary_convertToJSON(item_fling_effect_summary_t *item_fling_effect_summary);

#endif /* _item_fling_effect_summary_H_ */

