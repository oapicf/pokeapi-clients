/*
 * location_area_detail_encounter_method_rates_inner_version_details_inner.h
 *
 * 
 */

#ifndef _location_area_detail_encounter_method_rates_inner_version_details_inner_H_
#define _location_area_detail_encounter_method_rates_inner_version_details_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct location_area_detail_encounter_method_rates_inner_version_details_inner_t location_area_detail_encounter_method_rates_inner_version_details_inner_t;

#include "ability_detail_pokemon_inner_pokemon.h"



typedef struct location_area_detail_encounter_method_rates_inner_version_details_inner_t {
    int rate; //numeric
    struct ability_detail_pokemon_inner_pokemon_t *version; //model

    int _library_owned; // Is the library responsible for freeing this object?
} location_area_detail_encounter_method_rates_inner_version_details_inner_t;

__attribute__((deprecated)) location_area_detail_encounter_method_rates_inner_version_details_inner_t *location_area_detail_encounter_method_rates_inner_version_details_inner_create(
    int rate,
    ability_detail_pokemon_inner_pokemon_t *version
);

void location_area_detail_encounter_method_rates_inner_version_details_inner_free(location_area_detail_encounter_method_rates_inner_version_details_inner_t *location_area_detail_encounter_method_rates_inner_version_details_inner);

location_area_detail_encounter_method_rates_inner_version_details_inner_t *location_area_detail_encounter_method_rates_inner_version_details_inner_parseFromJSON(cJSON *location_area_detail_encounter_method_rates_inner_version_details_innerJSON);

cJSON *location_area_detail_encounter_method_rates_inner_version_details_inner_convertToJSON(location_area_detail_encounter_method_rates_inner_version_details_inner_t *location_area_detail_encounter_method_rates_inner_version_details_inner);

#endif /* _location_area_detail_encounter_method_rates_inner_version_details_inner_H_ */

