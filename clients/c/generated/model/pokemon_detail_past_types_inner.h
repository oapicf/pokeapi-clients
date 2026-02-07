/*
 * pokemon_detail_past_types_inner.h
 *
 * 
 */

#ifndef _pokemon_detail_past_types_inner_H_
#define _pokemon_detail_past_types_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_detail_past_types_inner_t pokemon_detail_past_types_inner_t;

#include "ability_detail_pokemon_inner_pokemon.h"
#include "pokemon_detail_types_inner.h"



typedef struct pokemon_detail_past_types_inner_t {
    struct ability_detail_pokemon_inner_pokemon_t *generation; //model
    list_t *types; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_detail_past_types_inner_t;

__attribute__((deprecated)) pokemon_detail_past_types_inner_t *pokemon_detail_past_types_inner_create(
    ability_detail_pokemon_inner_pokemon_t *generation,
    list_t *types
);

void pokemon_detail_past_types_inner_free(pokemon_detail_past_types_inner_t *pokemon_detail_past_types_inner);

pokemon_detail_past_types_inner_t *pokemon_detail_past_types_inner_parseFromJSON(cJSON *pokemon_detail_past_types_innerJSON);

cJSON *pokemon_detail_past_types_inner_convertToJSON(pokemon_detail_past_types_inner_t *pokemon_detail_past_types_inner);

#endif /* _pokemon_detail_past_types_inner_H_ */

