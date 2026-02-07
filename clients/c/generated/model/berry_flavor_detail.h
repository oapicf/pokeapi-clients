/*
 * berry_flavor_detail.h
 *
 * 
 */

#ifndef _berry_flavor_detail_H_
#define _berry_flavor_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct berry_flavor_detail_t berry_flavor_detail_t;

#include "berry_flavor_detail_berries_inner.h"
#include "berry_flavor_name.h"
#include "contest_type_summary.h"



typedef struct berry_flavor_detail_t {
    int id; //numeric
    char *name; // string
    list_t *berries; //nonprimitive container
    struct contest_type_summary_t *contest_type; //model
    list_t *names; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} berry_flavor_detail_t;

__attribute__((deprecated)) berry_flavor_detail_t *berry_flavor_detail_create(
    int id,
    char *name,
    list_t *berries,
    contest_type_summary_t *contest_type,
    list_t *names
);

void berry_flavor_detail_free(berry_flavor_detail_t *berry_flavor_detail);

berry_flavor_detail_t *berry_flavor_detail_parseFromJSON(cJSON *berry_flavor_detailJSON);

cJSON *berry_flavor_detail_convertToJSON(berry_flavor_detail_t *berry_flavor_detail);

#endif /* _berry_flavor_detail_H_ */

