/*
 * pokemon_type.h
 *
 * 
 */

#ifndef _pokemon_type_H_
#define _pokemon_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_type_t pokemon_type_t;

#include "type_summary.h"



typedef struct pokemon_type_t {
    int *slot; //numeric
    struct type_summary_t *type; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_type_t;

__attribute__((deprecated)) pokemon_type_t *pokemon_type_create(
    int *slot,
    type_summary_t *type
);

void pokemon_type_free(pokemon_type_t *pokemon_type);

pokemon_type_t *pokemon_type_parseFromJSON(cJSON *pokemon_typeJSON);

cJSON *pokemon_type_convertToJSON(pokemon_type_t *pokemon_type);

#endif /* _pokemon_type_H_ */

