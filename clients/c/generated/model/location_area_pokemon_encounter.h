/*
 * location_area_pokemon_encounter.h
 *
 * 
 */

#ifndef _location_area_pokemon_encounter_H_
#define _location_area_pokemon_encounter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct location_area_pokemon_encounter_t location_area_pokemon_encounter_t;

#include "location_area_pokemon_encounter_version.h"
#include "pokemon_summary.h"



typedef struct location_area_pokemon_encounter_t {
    struct pokemon_summary_t *pokemon; //model
    list_t *version_details; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} location_area_pokemon_encounter_t;

__attribute__((deprecated)) location_area_pokemon_encounter_t *location_area_pokemon_encounter_create(
    pokemon_summary_t *pokemon,
    list_t *version_details
);

void location_area_pokemon_encounter_free(location_area_pokemon_encounter_t *location_area_pokemon_encounter);

location_area_pokemon_encounter_t *location_area_pokemon_encounter_parseFromJSON(cJSON *location_area_pokemon_encounterJSON);

cJSON *location_area_pokemon_encounter_convertToJSON(location_area_pokemon_encounter_t *location_area_pokemon_encounter);

#endif /* _location_area_pokemon_encounter_H_ */

