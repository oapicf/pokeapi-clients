/*
 * item_category_detail.h
 *
 * 
 */

#ifndef _item_category_detail_H_
#define _item_category_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_category_detail_t item_category_detail_t;

#include "item_category_name.h"
#include "item_pocket_summary.h"
#include "item_summary.h"



typedef struct item_category_detail_t {
    int id; //numeric
    char *name; // string
    list_t *items; //nonprimitive container
    list_t *names; //nonprimitive container
    struct item_pocket_summary_t *pocket; //model

    int _library_owned; // Is the library responsible for freeing this object?
} item_category_detail_t;

__attribute__((deprecated)) item_category_detail_t *item_category_detail_create(
    int id,
    char *name,
    list_t *items,
    list_t *names,
    item_pocket_summary_t *pocket
);

void item_category_detail_free(item_category_detail_t *item_category_detail);

item_category_detail_t *item_category_detail_parseFromJSON(cJSON *item_category_detailJSON);

cJSON *item_category_detail_convertToJSON(item_category_detail_t *item_category_detail);

#endif /* _item_category_detail_H_ */

