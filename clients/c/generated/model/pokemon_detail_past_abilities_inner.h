/*
 * pokemon_detail_past_abilities_inner.h
 *
 * 
 */

#ifndef _pokemon_detail_past_abilities_inner_H_
#define _pokemon_detail_past_abilities_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_detail_past_abilities_inner_t pokemon_detail_past_abilities_inner_t;

#include "ability_detail_pokemon_inner_pokemon.h"
#include "pokemon_detail_abilities_inner.h"



typedef struct pokemon_detail_past_abilities_inner_t {
    list_t *abilities; //nonprimitive container
    struct ability_detail_pokemon_inner_pokemon_t *generation; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_detail_past_abilities_inner_t;

__attribute__((deprecated)) pokemon_detail_past_abilities_inner_t *pokemon_detail_past_abilities_inner_create(
    list_t *abilities,
    ability_detail_pokemon_inner_pokemon_t *generation
);

void pokemon_detail_past_abilities_inner_free(pokemon_detail_past_abilities_inner_t *pokemon_detail_past_abilities_inner);

pokemon_detail_past_abilities_inner_t *pokemon_detail_past_abilities_inner_parseFromJSON(cJSON *pokemon_detail_past_abilities_innerJSON);

cJSON *pokemon_detail_past_abilities_inner_convertToJSON(pokemon_detail_past_abilities_inner_t *pokemon_detail_past_abilities_inner);

#endif /* _pokemon_detail_past_abilities_inner_H_ */

