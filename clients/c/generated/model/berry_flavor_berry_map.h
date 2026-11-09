/*
 * berry_flavor_berry_map.h
 *
 * 
 */

#ifndef _berry_flavor_berry_map_H_
#define _berry_flavor_berry_map_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct berry_flavor_berry_map_t berry_flavor_berry_map_t;

#include "berry_summary.h"



typedef struct berry_flavor_berry_map_t {
    int *potency; //numeric
    struct berry_summary_t *berry; //model

    int _library_owned; // Is the library responsible for freeing this object?
} berry_flavor_berry_map_t;

__attribute__((deprecated)) berry_flavor_berry_map_t *berry_flavor_berry_map_create(
    int *potency,
    berry_summary_t *berry
);

void berry_flavor_berry_map_free(berry_flavor_berry_map_t *berry_flavor_berry_map);

berry_flavor_berry_map_t *berry_flavor_berry_map_parseFromJSON(cJSON *berry_flavor_berry_mapJSON);

cJSON *berry_flavor_berry_map_convertToJSON(berry_flavor_berry_map_t *berry_flavor_berry_map);

#endif /* _berry_flavor_berry_map_H_ */

