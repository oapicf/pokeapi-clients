/*
 * encounter_method_detail.h
 *
 * 
 */

#ifndef _encounter_method_detail_H_
#define _encounter_method_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct encounter_method_detail_t encounter_method_detail_t;

#include "encounter_method_name.h"



typedef struct encounter_method_detail_t {
    int id; //numeric
    char *name; // string
    int order; //numeric
    list_t *names; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} encounter_method_detail_t;

__attribute__((deprecated)) encounter_method_detail_t *encounter_method_detail_create(
    int id,
    char *name,
    int order,
    list_t *names
);

void encounter_method_detail_free(encounter_method_detail_t *encounter_method_detail);

encounter_method_detail_t *encounter_method_detail_parseFromJSON(cJSON *encounter_method_detailJSON);

cJSON *encounter_method_detail_convertToJSON(encounter_method_detail_t *encounter_method_detail);

#endif /* _encounter_method_detail_H_ */

