/*
 * item_fling_effect_detail.h
 *
 * 
 */

#ifndef _item_fling_effect_detail_H_
#define _item_fling_effect_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_fling_effect_detail_t item_fling_effect_detail_t;

#include "item_fling_effect_effect_text.h"
#include "item_summary.h"



typedef struct item_fling_effect_detail_t {
    int id; //numeric
    char *name; // string
    list_t *effect_entries; //nonprimitive container
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} item_fling_effect_detail_t;

__attribute__((deprecated)) item_fling_effect_detail_t *item_fling_effect_detail_create(
    int id,
    char *name,
    list_t *effect_entries,
    list_t *items
);

void item_fling_effect_detail_free(item_fling_effect_detail_t *item_fling_effect_detail);

item_fling_effect_detail_t *item_fling_effect_detail_parseFromJSON(cJSON *item_fling_effect_detailJSON);

cJSON *item_fling_effect_detail_convertToJSON(item_fling_effect_detail_t *item_fling_effect_detail);

#endif /* _item_fling_effect_detail_H_ */

