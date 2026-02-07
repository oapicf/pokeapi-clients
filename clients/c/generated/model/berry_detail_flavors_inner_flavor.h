/*
 * berry_detail_flavors_inner_flavor.h
 *
 * 
 */

#ifndef _berry_detail_flavors_inner_flavor_H_
#define _berry_detail_flavors_inner_flavor_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct berry_detail_flavors_inner_flavor_t berry_detail_flavors_inner_flavor_t;




typedef struct berry_detail_flavors_inner_flavor_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} berry_detail_flavors_inner_flavor_t;

__attribute__((deprecated)) berry_detail_flavors_inner_flavor_t *berry_detail_flavors_inner_flavor_create(
    char *name,
    char *url
);

void berry_detail_flavors_inner_flavor_free(berry_detail_flavors_inner_flavor_t *berry_detail_flavors_inner_flavor);

berry_detail_flavors_inner_flavor_t *berry_detail_flavors_inner_flavor_parseFromJSON(cJSON *berry_detail_flavors_inner_flavorJSON);

cJSON *berry_detail_flavors_inner_flavor_convertToJSON(berry_detail_flavors_inner_flavor_t *berry_detail_flavors_inner_flavor);

#endif /* _berry_detail_flavors_inner_flavor_H_ */

