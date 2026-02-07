/*
 * pokemon_encounters_retrieve_200_response_inner_location_area.h
 *
 * 
 */

#ifndef _pokemon_encounters_retrieve_200_response_inner_location_area_H_
#define _pokemon_encounters_retrieve_200_response_inner_location_area_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_encounters_retrieve_200_response_inner_location_area_t pokemon_encounters_retrieve_200_response_inner_location_area_t;




typedef struct pokemon_encounters_retrieve_200_response_inner_location_area_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_encounters_retrieve_200_response_inner_location_area_t;

__attribute__((deprecated)) pokemon_encounters_retrieve_200_response_inner_location_area_t *pokemon_encounters_retrieve_200_response_inner_location_area_create(
    char *name,
    char *url
);

void pokemon_encounters_retrieve_200_response_inner_location_area_free(pokemon_encounters_retrieve_200_response_inner_location_area_t *pokemon_encounters_retrieve_200_response_inner_location_area);

pokemon_encounters_retrieve_200_response_inner_location_area_t *pokemon_encounters_retrieve_200_response_inner_location_area_parseFromJSON(cJSON *pokemon_encounters_retrieve_200_response_inner_location_areaJSON);

cJSON *pokemon_encounters_retrieve_200_response_inner_location_area_convertToJSON(pokemon_encounters_retrieve_200_response_inner_location_area_t *pokemon_encounters_retrieve_200_response_inner_location_area);

#endif /* _pokemon_encounters_retrieve_200_response_inner_location_area_H_ */

