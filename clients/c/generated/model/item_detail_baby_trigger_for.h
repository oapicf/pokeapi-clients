/*
 * item_detail_baby_trigger_for.h
 *
 * 
 */

#ifndef _item_detail_baby_trigger_for_H_
#define _item_detail_baby_trigger_for_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_detail_baby_trigger_for_t item_detail_baby_trigger_for_t;




typedef struct item_detail_baby_trigger_for_t {
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} item_detail_baby_trigger_for_t;

__attribute__((deprecated)) item_detail_baby_trigger_for_t *item_detail_baby_trigger_for_create(
    char *url
);

void item_detail_baby_trigger_for_free(item_detail_baby_trigger_for_t *item_detail_baby_trigger_for);

item_detail_baby_trigger_for_t *item_detail_baby_trigger_for_parseFromJSON(cJSON *item_detail_baby_trigger_forJSON);

cJSON *item_detail_baby_trigger_for_convertToJSON(item_detail_baby_trigger_for_t *item_detail_baby_trigger_for);

#endif /* _item_detail_baby_trigger_for_H_ */

