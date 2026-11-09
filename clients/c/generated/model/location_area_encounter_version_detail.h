/*
 * location_area_encounter_version_detail.h
 *
 * 
 */

#ifndef _location_area_encounter_version_detail_H_
#define _location_area_encounter_version_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct location_area_encounter_version_detail_t location_area_encounter_version_detail_t;

#include "version_summary.h"



typedef struct location_area_encounter_version_detail_t {
    int *rate; //numeric
    struct version_summary_t *version; //model

    int _library_owned; // Is the library responsible for freeing this object?
} location_area_encounter_version_detail_t;

__attribute__((deprecated)) location_area_encounter_version_detail_t *location_area_encounter_version_detail_create(
    int *rate,
    version_summary_t *version
);

void location_area_encounter_version_detail_free(location_area_encounter_version_detail_t *location_area_encounter_version_detail);

location_area_encounter_version_detail_t *location_area_encounter_version_detail_parseFromJSON(cJSON *location_area_encounter_version_detailJSON);

cJSON *location_area_encounter_version_detail_convertToJSON(location_area_encounter_version_detail_t *location_area_encounter_version_detail);

#endif /* _location_area_encounter_version_detail_H_ */

