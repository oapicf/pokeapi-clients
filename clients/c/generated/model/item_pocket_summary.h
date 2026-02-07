/*
 * item_pocket_summary.h
 *
 * 
 */

#ifndef _item_pocket_summary_H_
#define _item_pocket_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_pocket_summary_t item_pocket_summary_t;




typedef struct item_pocket_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} item_pocket_summary_t;

__attribute__((deprecated)) item_pocket_summary_t *item_pocket_summary_create(
    char *name,
    char *url
);

void item_pocket_summary_free(item_pocket_summary_t *item_pocket_summary);

item_pocket_summary_t *item_pocket_summary_parseFromJSON(cJSON *item_pocket_summaryJSON);

cJSON *item_pocket_summary_convertToJSON(item_pocket_summary_t *item_pocket_summary);

#endif /* _item_pocket_summary_H_ */

