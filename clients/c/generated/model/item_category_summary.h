/*
 * item_category_summary.h
 *
 * 
 */

#ifndef _item_category_summary_H_
#define _item_category_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_category_summary_t item_category_summary_t;




typedef struct item_category_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} item_category_summary_t;

__attribute__((deprecated)) item_category_summary_t *item_category_summary_create(
    char *name,
    char *url
);

void item_category_summary_free(item_category_summary_t *item_category_summary);

item_category_summary_t *item_category_summary_parseFromJSON(cJSON *item_category_summaryJSON);

cJSON *item_category_summary_convertToJSON(item_category_summary_t *item_category_summary);

#endif /* _item_category_summary_H_ */

