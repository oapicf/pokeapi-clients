/*
 * pokemon_encounters_retrieve_200_response_inner_version_details_inner_version.h
 *
 * 
 */

#ifndef _pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_H_
#define _pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_t pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_t;




typedef struct pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_t;

__attribute__((deprecated)) pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_create(
    char *name,
    char *url
);

void pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_free(pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_version);

pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_parseFromJSON(cJSON *pokemon_encounters_retrieve_200_response_inner_version_details_inner_versionJSON);

cJSON *pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_convertToJSON(pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_version);

#endif /* _pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_H_ */

