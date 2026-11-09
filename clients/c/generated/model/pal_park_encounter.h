/*
 * pal_park_encounter.h
 *
 * 
 */

#ifndef _pal_park_encounter_H_
#define _pal_park_encounter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pal_park_encounter_t pal_park_encounter_t;

#include "pokemon_species_summary.h"



typedef struct pal_park_encounter_t {
    int *base_score; //numeric
    int *rate; //numeric
    struct pokemon_species_summary_t *pokemon_species; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pal_park_encounter_t;

__attribute__((deprecated)) pal_park_encounter_t *pal_park_encounter_create(
    int *base_score,
    int *rate,
    pokemon_species_summary_t *pokemon_species
);

void pal_park_encounter_free(pal_park_encounter_t *pal_park_encounter);

pal_park_encounter_t *pal_park_encounter_parseFromJSON(cJSON *pal_park_encounterJSON);

cJSON *pal_park_encounter_convertToJSON(pal_park_encounter_t *pal_park_encounter);

#endif /* _pal_park_encounter_H_ */

