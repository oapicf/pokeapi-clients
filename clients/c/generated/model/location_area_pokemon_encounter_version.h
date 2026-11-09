/*
 * location_area_pokemon_encounter_version.h
 *
 * 
 */

#ifndef _location_area_pokemon_encounter_version_H_
#define _location_area_pokemon_encounter_version_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct location_area_pokemon_encounter_version_t location_area_pokemon_encounter_version_t;

#include "location_area_encounter_detail.h"
#include "version_summary.h"



typedef struct location_area_pokemon_encounter_version_t {
    struct version_summary_t *version; //model
    int *max_chance; //numeric
    list_t *encounter_details; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} location_area_pokemon_encounter_version_t;

__attribute__((deprecated)) location_area_pokemon_encounter_version_t *location_area_pokemon_encounter_version_create(
    version_summary_t *version,
    int *max_chance,
    list_t *encounter_details
);

void location_area_pokemon_encounter_version_free(location_area_pokemon_encounter_version_t *location_area_pokemon_encounter_version);

location_area_pokemon_encounter_version_t *location_area_pokemon_encounter_version_parseFromJSON(cJSON *location_area_pokemon_encounter_versionJSON);

cJSON *location_area_pokemon_encounter_version_convertToJSON(location_area_pokemon_encounter_version_t *location_area_pokemon_encounter_version);

#endif /* _location_area_pokemon_encounter_version_H_ */

