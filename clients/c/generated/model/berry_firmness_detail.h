/*
 * berry_firmness_detail.h
 *
 * 
 */

#ifndef _berry_firmness_detail_H_
#define _berry_firmness_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct berry_firmness_detail_t berry_firmness_detail_t;

#include "berry_firmness_name.h"
#include "berry_summary.h"



typedef struct berry_firmness_detail_t {
    int id; //numeric
    char *name; // string
    list_t *berries; //nonprimitive container
    list_t *names; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} berry_firmness_detail_t;

__attribute__((deprecated)) berry_firmness_detail_t *berry_firmness_detail_create(
    int id,
    char *name,
    list_t *berries,
    list_t *names
);

void berry_firmness_detail_free(berry_firmness_detail_t *berry_firmness_detail);

berry_firmness_detail_t *berry_firmness_detail_parseFromJSON(cJSON *berry_firmness_detailJSON);

cJSON *berry_firmness_detail_convertToJSON(berry_firmness_detail_t *berry_firmness_detail);

#endif /* _berry_firmness_detail_H_ */

