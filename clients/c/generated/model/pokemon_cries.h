/*
 * pokemon_cries.h
 *
 * 
 */

#ifndef _pokemon_cries_H_
#define _pokemon_cries_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_cries_t pokemon_cries_t;




typedef struct pokemon_cries_t {
    char *latest; // string
    char *legacy; // string

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_cries_t;

__attribute__((deprecated)) pokemon_cries_t *pokemon_cries_create(
    char *latest,
    char *legacy
);

void pokemon_cries_free(pokemon_cries_t *pokemon_cries);

pokemon_cries_t *pokemon_cries_parseFromJSON(cJSON *pokemon_criesJSON);

cJSON *pokemon_cries_convertToJSON(pokemon_cries_t *pokemon_cries);

#endif /* _pokemon_cries_H_ */

