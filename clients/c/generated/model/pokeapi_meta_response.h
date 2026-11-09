/*
 * pokeapi_meta_response.h
 *
 * 
 */

#ifndef _pokeapi_meta_response_H_
#define _pokeapi_meta_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokeapi_meta_response_t pokeapi_meta_response_t;




typedef struct pokeapi_meta_response_t {
    char *deploy_date; // string
    char *hash; // string
    char *tag; // string

    int _library_owned; // Is the library responsible for freeing this object?
} pokeapi_meta_response_t;

__attribute__((deprecated)) pokeapi_meta_response_t *pokeapi_meta_response_create(
    char *deploy_date,
    char *hash,
    char *tag
);

void pokeapi_meta_response_free(pokeapi_meta_response_t *pokeapi_meta_response);

pokeapi_meta_response_t *pokeapi_meta_response_parseFromJSON(cJSON *pokeapi_meta_responseJSON);

cJSON *pokeapi_meta_response_convertToJSON(pokeapi_meta_response_t *pokeapi_meta_response);

#endif /* _pokeapi_meta_response_H_ */

