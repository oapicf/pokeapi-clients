/*
 * item_pocket_detail.h
 *
 * 
 */

#ifndef _item_pocket_detail_H_
#define _item_pocket_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_pocket_detail_t item_pocket_detail_t;

#include "item_category_summary.h"
#include "item_pocket_name.h"



typedef struct item_pocket_detail_t {
    int id; //numeric
    char *name; // string
    list_t *categories; //nonprimitive container
    list_t *names; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} item_pocket_detail_t;

__attribute__((deprecated)) item_pocket_detail_t *item_pocket_detail_create(
    int id,
    char *name,
    list_t *categories,
    list_t *names
);

void item_pocket_detail_free(item_pocket_detail_t *item_pocket_detail);

item_pocket_detail_t *item_pocket_detail_parseFromJSON(cJSON *item_pocket_detailJSON);

cJSON *item_pocket_detail_convertToJSON(item_pocket_detail_t *item_pocket_detail);

#endif /* _item_pocket_detail_H_ */

