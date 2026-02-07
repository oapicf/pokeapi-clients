/*
 * location_area_detail_encounter_method_rates_inner.h
 *
 * 
 */

#ifndef _location_area_detail_encounter_method_rates_inner_H_
#define _location_area_detail_encounter_method_rates_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct location_area_detail_encounter_method_rates_inner_t location_area_detail_encounter_method_rates_inner_t;

#include "ability_detail_pokemon_inner_pokemon.h"
#include "location_area_detail_encounter_method_rates_inner_version_details_inner.h"



typedef struct location_area_detail_encounter_method_rates_inner_t {
    struct ability_detail_pokemon_inner_pokemon_t *encounter_method; //model
    list_t *version_details; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} location_area_detail_encounter_method_rates_inner_t;

__attribute__((deprecated)) location_area_detail_encounter_method_rates_inner_t *location_area_detail_encounter_method_rates_inner_create(
    ability_detail_pokemon_inner_pokemon_t *encounter_method,
    list_t *version_details
);

void location_area_detail_encounter_method_rates_inner_free(location_area_detail_encounter_method_rates_inner_t *location_area_detail_encounter_method_rates_inner);

location_area_detail_encounter_method_rates_inner_t *location_area_detail_encounter_method_rates_inner_parseFromJSON(cJSON *location_area_detail_encounter_method_rates_innerJSON);

cJSON *location_area_detail_encounter_method_rates_inner_convertToJSON(location_area_detail_encounter_method_rates_inner_t *location_area_detail_encounter_method_rates_inner);

#endif /* _location_area_detail_encounter_method_rates_inner_H_ */

