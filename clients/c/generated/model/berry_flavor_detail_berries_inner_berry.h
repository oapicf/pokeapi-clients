/*
 * berry_flavor_detail_berries_inner_berry.h
 *
 * 
 */

#ifndef _berry_flavor_detail_berries_inner_berry_H_
#define _berry_flavor_detail_berries_inner_berry_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct berry_flavor_detail_berries_inner_berry_t berry_flavor_detail_berries_inner_berry_t;




typedef struct berry_flavor_detail_berries_inner_berry_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} berry_flavor_detail_berries_inner_berry_t;

__attribute__((deprecated)) berry_flavor_detail_berries_inner_berry_t *berry_flavor_detail_berries_inner_berry_create(
    char *name,
    char *url
);

void berry_flavor_detail_berries_inner_berry_free(berry_flavor_detail_berries_inner_berry_t *berry_flavor_detail_berries_inner_berry);

berry_flavor_detail_berries_inner_berry_t *berry_flavor_detail_berries_inner_berry_parseFromJSON(cJSON *berry_flavor_detail_berries_inner_berryJSON);

cJSON *berry_flavor_detail_berries_inner_berry_convertToJSON(berry_flavor_detail_berries_inner_berry_t *berry_flavor_detail_berries_inner_berry);

#endif /* _berry_flavor_detail_berries_inner_berry_H_ */

