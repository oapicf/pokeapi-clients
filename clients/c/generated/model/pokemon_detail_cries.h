/*
 * pokemon_detail_cries.h
 *
 * 
 */

#ifndef _pokemon_detail_cries_H_
#define _pokemon_detail_cries_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_detail_cries_t pokemon_detail_cries_t;




typedef struct pokemon_detail_cries_t {
    char *latest; // string
    char *legacy; // string

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_detail_cries_t;

__attribute__((deprecated)) pokemon_detail_cries_t *pokemon_detail_cries_create(
    char *latest,
    char *legacy
);

void pokemon_detail_cries_free(pokemon_detail_cries_t *pokemon_detail_cries);

pokemon_detail_cries_t *pokemon_detail_cries_parseFromJSON(cJSON *pokemon_detail_criesJSON);

cJSON *pokemon_detail_cries_convertToJSON(pokemon_detail_cries_t *pokemon_detail_cries);

#endif /* _pokemon_detail_cries_H_ */

