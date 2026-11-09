/*
 * pokemon_encounter_response.h
 *
 * 
 */

#ifndef _pokemon_encounter_response_H_
#define _pokemon_encounter_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_encounter_response_t pokemon_encounter_response_t;

#include "location_area_summary.h"
#include "pokemon_encounter_version_detail_response.h"



typedef struct pokemon_encounter_response_t {
    struct location_area_summary_t *location_area; //model
    list_t *version_details; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_encounter_response_t;

__attribute__((deprecated)) pokemon_encounter_response_t *pokemon_encounter_response_create(
    location_area_summary_t *location_area,
    list_t *version_details
);

void pokemon_encounter_response_free(pokemon_encounter_response_t *pokemon_encounter_response);

pokemon_encounter_response_t *pokemon_encounter_response_parseFromJSON(cJSON *pokemon_encounter_responseJSON);

cJSON *pokemon_encounter_response_convertToJSON(pokemon_encounter_response_t *pokemon_encounter_response);

#endif /* _pokemon_encounter_response_H_ */

