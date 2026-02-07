/*
 * encounter_condition_detail.h
 *
 * 
 */

#ifndef _encounter_condition_detail_H_
#define _encounter_condition_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct encounter_condition_detail_t encounter_condition_detail_t;

#include "encounter_condition_name.h"
#include "encounter_condition_value_summary.h"



typedef struct encounter_condition_detail_t {
    int id; //numeric
    char *name; // string
    list_t *values; //nonprimitive container
    list_t *names; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} encounter_condition_detail_t;

__attribute__((deprecated)) encounter_condition_detail_t *encounter_condition_detail_create(
    int id,
    char *name,
    list_t *values,
    list_t *names
);

void encounter_condition_detail_free(encounter_condition_detail_t *encounter_condition_detail);

encounter_condition_detail_t *encounter_condition_detail_parseFromJSON(cJSON *encounter_condition_detailJSON);

cJSON *encounter_condition_detail_convertToJSON(encounter_condition_detail_t *encounter_condition_detail);

#endif /* _encounter_condition_detail_H_ */

