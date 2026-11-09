/*
 * pokemon_species_pal_park_encounter.h
 *
 * 
 */

#ifndef _pokemon_species_pal_park_encounter_H_
#define _pokemon_species_pal_park_encounter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_species_pal_park_encounter_t pokemon_species_pal_park_encounter_t;

#include "pal_park_area_summary.h"



typedef struct pokemon_species_pal_park_encounter_t {
    int *base_score; //numeric
    int *rate; //numeric
    struct pal_park_area_summary_t *area; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_species_pal_park_encounter_t;

__attribute__((deprecated)) pokemon_species_pal_park_encounter_t *pokemon_species_pal_park_encounter_create(
    int *base_score,
    int *rate,
    pal_park_area_summary_t *area
);

void pokemon_species_pal_park_encounter_free(pokemon_species_pal_park_encounter_t *pokemon_species_pal_park_encounter);

pokemon_species_pal_park_encounter_t *pokemon_species_pal_park_encounter_parseFromJSON(cJSON *pokemon_species_pal_park_encounterJSON);

cJSON *pokemon_species_pal_park_encounter_convertToJSON(pokemon_species_pal_park_encounter_t *pokemon_species_pal_park_encounter);

#endif /* _pokemon_species_pal_park_encounter_H_ */

