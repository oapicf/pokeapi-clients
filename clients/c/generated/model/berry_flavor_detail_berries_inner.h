/*
 * berry_flavor_detail_berries_inner.h
 *
 * 
 */

#ifndef _berry_flavor_detail_berries_inner_H_
#define _berry_flavor_detail_berries_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct berry_flavor_detail_berries_inner_t berry_flavor_detail_berries_inner_t;

#include "berry_flavor_detail_berries_inner_berry.h"



typedef struct berry_flavor_detail_berries_inner_t {
    int potency; //numeric
    struct berry_flavor_detail_berries_inner_berry_t *berry; //model

    int _library_owned; // Is the library responsible for freeing this object?
} berry_flavor_detail_berries_inner_t;

__attribute__((deprecated)) berry_flavor_detail_berries_inner_t *berry_flavor_detail_berries_inner_create(
    int potency,
    berry_flavor_detail_berries_inner_berry_t *berry
);

void berry_flavor_detail_berries_inner_free(berry_flavor_detail_berries_inner_t *berry_flavor_detail_berries_inner);

berry_flavor_detail_berries_inner_t *berry_flavor_detail_berries_inner_parseFromJSON(cJSON *berry_flavor_detail_berries_innerJSON);

cJSON *berry_flavor_detail_berries_inner_convertToJSON(berry_flavor_detail_berries_inner_t *berry_flavor_detail_berries_inner);

#endif /* _berry_flavor_detail_berries_inner_H_ */

