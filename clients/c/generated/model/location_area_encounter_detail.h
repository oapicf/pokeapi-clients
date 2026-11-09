/*
 * location_area_encounter_detail.h
 *
 * 
 */

#ifndef _location_area_encounter_detail_H_
#define _location_area_encounter_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct location_area_encounter_detail_t location_area_encounter_detail_t;

#include "encounter_condition_value_summary.h"
#include "encounter_method_summary.h"
#include "encounter_pokemon_detail.h"



typedef struct location_area_encounter_detail_t {
    int *min_level; //numeric
    int *max_level; //numeric
    int *chance; //numeric
    struct encounter_method_summary_t *method; //model
    list_t *condition_values; //nonprimitive container
    struct encounter_pokemon_detail_t *pokemon_details; //model

    int _library_owned; // Is the library responsible for freeing this object?
} location_area_encounter_detail_t;

__attribute__((deprecated)) location_area_encounter_detail_t *location_area_encounter_detail_create(
    int *min_level,
    int *max_level,
    int *chance,
    encounter_method_summary_t *method,
    list_t *condition_values,
    encounter_pokemon_detail_t *pokemon_details
);

void location_area_encounter_detail_free(location_area_encounter_detail_t *location_area_encounter_detail);

location_area_encounter_detail_t *location_area_encounter_detail_parseFromJSON(cJSON *location_area_encounter_detailJSON);

cJSON *location_area_encounter_detail_convertToJSON(location_area_encounter_detail_t *location_area_encounter_detail);

#endif /* _location_area_encounter_detail_H_ */

