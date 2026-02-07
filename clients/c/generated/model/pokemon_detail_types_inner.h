/*
 * pokemon_detail_types_inner.h
 *
 * 
 */

#ifndef _pokemon_detail_types_inner_H_
#define _pokemon_detail_types_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_detail_types_inner_t pokemon_detail_types_inner_t;

#include "ability_detail_pokemon_inner_pokemon.h"



typedef struct pokemon_detail_types_inner_t {
    int slot; //numeric
    struct ability_detail_pokemon_inner_pokemon_t *type; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_detail_types_inner_t;

__attribute__((deprecated)) pokemon_detail_types_inner_t *pokemon_detail_types_inner_create(
    int slot,
    ability_detail_pokemon_inner_pokemon_t *type
);

void pokemon_detail_types_inner_free(pokemon_detail_types_inner_t *pokemon_detail_types_inner);

pokemon_detail_types_inner_t *pokemon_detail_types_inner_parseFromJSON(cJSON *pokemon_detail_types_innerJSON);

cJSON *pokemon_detail_types_inner_convertToJSON(pokemon_detail_types_inner_t *pokemon_detail_types_inner);

#endif /* _pokemon_detail_types_inner_H_ */

