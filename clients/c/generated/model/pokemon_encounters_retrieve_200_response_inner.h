/*
 * pokemon_encounters_retrieve_200_response_inner.h
 *
 * 
 */

#ifndef _pokemon_encounters_retrieve_200_response_inner_H_
#define _pokemon_encounters_retrieve_200_response_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_encounters_retrieve_200_response_inner_t pokemon_encounters_retrieve_200_response_inner_t;

#include "pokemon_encounters_retrieve_200_response_inner_location_area.h"
#include "pokemon_encounters_retrieve_200_response_inner_version_details_inner.h"



typedef struct pokemon_encounters_retrieve_200_response_inner_t {
    struct pokemon_encounters_retrieve_200_response_inner_location_area_t *location_area; //model
    list_t *version_details; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_encounters_retrieve_200_response_inner_t;

__attribute__((deprecated)) pokemon_encounters_retrieve_200_response_inner_t *pokemon_encounters_retrieve_200_response_inner_create(
    pokemon_encounters_retrieve_200_response_inner_location_area_t *location_area,
    list_t *version_details
);

void pokemon_encounters_retrieve_200_response_inner_free(pokemon_encounters_retrieve_200_response_inner_t *pokemon_encounters_retrieve_200_response_inner);

pokemon_encounters_retrieve_200_response_inner_t *pokemon_encounters_retrieve_200_response_inner_parseFromJSON(cJSON *pokemon_encounters_retrieve_200_response_innerJSON);

cJSON *pokemon_encounters_retrieve_200_response_inner_convertToJSON(pokemon_encounters_retrieve_200_response_inner_t *pokemon_encounters_retrieve_200_response_inner);

#endif /* _pokemon_encounters_retrieve_200_response_inner_H_ */

