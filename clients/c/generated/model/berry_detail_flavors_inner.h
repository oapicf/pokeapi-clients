/*
 * berry_detail_flavors_inner.h
 *
 * 
 */

#ifndef _berry_detail_flavors_inner_H_
#define _berry_detail_flavors_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct berry_detail_flavors_inner_t berry_detail_flavors_inner_t;

#include "berry_detail_flavors_inner_flavor.h"



typedef struct berry_detail_flavors_inner_t {
    int potency; //numeric
    struct berry_detail_flavors_inner_flavor_t *flavor; //model

    int _library_owned; // Is the library responsible for freeing this object?
} berry_detail_flavors_inner_t;

__attribute__((deprecated)) berry_detail_flavors_inner_t *berry_detail_flavors_inner_create(
    int potency,
    berry_detail_flavors_inner_flavor_t *flavor
);

void berry_detail_flavors_inner_free(berry_detail_flavors_inner_t *berry_detail_flavors_inner);

berry_detail_flavors_inner_t *berry_detail_flavors_inner_parseFromJSON(cJSON *berry_detail_flavors_innerJSON);

cJSON *berry_detail_flavors_inner_convertToJSON(berry_detail_flavors_inner_t *berry_detail_flavors_inner);

#endif /* _berry_detail_flavors_inner_H_ */

