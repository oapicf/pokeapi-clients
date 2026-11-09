/*
 * pokemon_encounter_version_detail_response.h
 *
 * 
 */

#ifndef _pokemon_encounter_version_detail_response_H_
#define _pokemon_encounter_version_detail_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_encounter_version_detail_response_t pokemon_encounter_version_detail_response_t;

#include "pokemon_encounter_detail_response.h"
#include "version_summary.h"



typedef struct pokemon_encounter_version_detail_response_t {
    struct version_summary_t *version; //model
    int *max_chance; //numeric
    list_t *encounter_details; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_encounter_version_detail_response_t;

__attribute__((deprecated)) pokemon_encounter_version_detail_response_t *pokemon_encounter_version_detail_response_create(
    version_summary_t *version,
    int *max_chance,
    list_t *encounter_details
);

void pokemon_encounter_version_detail_response_free(pokemon_encounter_version_detail_response_t *pokemon_encounter_version_detail_response);

pokemon_encounter_version_detail_response_t *pokemon_encounter_version_detail_response_parseFromJSON(cJSON *pokemon_encounter_version_detail_responseJSON);

cJSON *pokemon_encounter_version_detail_response_convertToJSON(pokemon_encounter_version_detail_response_t *pokemon_encounter_version_detail_response);

#endif /* _pokemon_encounter_version_detail_response_H_ */

