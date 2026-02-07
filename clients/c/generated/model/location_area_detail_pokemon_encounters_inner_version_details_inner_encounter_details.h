/*
 * location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details.h
 *
 * 
 */

#ifndef _location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_H_
#define _location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_t location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_t;

#include "ability_detail_pokemon_inner_pokemon.h"



typedef struct location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_t {
    int min_level; //numeric
    int max_level; //numeric
    struct ability_detail_pokemon_inner_pokemon_t *condition_values; //model
    int chance; //numeric
    struct ability_detail_pokemon_inner_pokemon_t *method; //model

    int _library_owned; // Is the library responsible for freeing this object?
} location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_t;

__attribute__((deprecated)) location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_t *location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_create(
    int min_level,
    int max_level,
    ability_detail_pokemon_inner_pokemon_t *condition_values,
    int chance,
    ability_detail_pokemon_inner_pokemon_t *method
);

void location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_free(location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_t *location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details);

location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_t *location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_parseFromJSON(cJSON *location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_detailsJSON);

cJSON *location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_convertToJSON(location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_t *location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details);

#endif /* _location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_H_ */

