/*
 * location_area_encounter_rate.h
 *
 * 
 */

#ifndef _location_area_encounter_rate_H_
#define _location_area_encounter_rate_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct location_area_encounter_rate_t location_area_encounter_rate_t;

#include "encounter_method_summary.h"
#include "location_area_encounter_version_detail.h"



typedef struct location_area_encounter_rate_t {
    struct encounter_method_summary_t *encounter_method; //model
    list_t *version_details; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} location_area_encounter_rate_t;

__attribute__((deprecated)) location_area_encounter_rate_t *location_area_encounter_rate_create(
    encounter_method_summary_t *encounter_method,
    list_t *version_details
);

void location_area_encounter_rate_free(location_area_encounter_rate_t *location_area_encounter_rate);

location_area_encounter_rate_t *location_area_encounter_rate_parseFromJSON(cJSON *location_area_encounter_rateJSON);

cJSON *location_area_encounter_rate_convertToJSON(location_area_encounter_rate_t *location_area_encounter_rate);

#endif /* _location_area_encounter_rate_H_ */

