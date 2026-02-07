/*
 * item_summary.h
 *
 * 
 */

#ifndef _item_summary_H_
#define _item_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_summary_t item_summary_t;




typedef struct item_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} item_summary_t;

__attribute__((deprecated)) item_summary_t *item_summary_create(
    char *name,
    char *url
);

void item_summary_free(item_summary_t *item_summary);

item_summary_t *item_summary_parseFromJSON(cJSON *item_summaryJSON);

cJSON *item_summary_convertToJSON(item_summary_t *item_summary);

#endif /* _item_summary_H_ */

