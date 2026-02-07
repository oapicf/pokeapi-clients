/*
 * berry_detail.h
 *
 * 
 */

#ifndef _berry_detail_H_
#define _berry_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct berry_detail_t berry_detail_t;

#include "berry_detail_flavors_inner.h"
#include "berry_firmness_summary.h"
#include "item_summary.h"
#include "type_summary.h"



typedef struct berry_detail_t {
    int id; //numeric
    char *name; // string
    int growth_time; //numeric
    int max_harvest; //numeric
    int natural_gift_power; //numeric
    int size; //numeric
    int smoothness; //numeric
    int soil_dryness; //numeric
    struct berry_firmness_summary_t *firmness; //model
    list_t *flavors; //nonprimitive container
    struct item_summary_t *item; //model
    struct type_summary_t *natural_gift_type; //model

    int _library_owned; // Is the library responsible for freeing this object?
} berry_detail_t;

__attribute__((deprecated)) berry_detail_t *berry_detail_create(
    int id,
    char *name,
    int growth_time,
    int max_harvest,
    int natural_gift_power,
    int size,
    int smoothness,
    int soil_dryness,
    berry_firmness_summary_t *firmness,
    list_t *flavors,
    item_summary_t *item,
    type_summary_t *natural_gift_type
);

void berry_detail_free(berry_detail_t *berry_detail);

berry_detail_t *berry_detail_parseFromJSON(cJSON *berry_detailJSON);

cJSON *berry_detail_convertToJSON(berry_detail_t *berry_detail);

#endif /* _berry_detail_H_ */

