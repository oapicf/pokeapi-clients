/*
 * pokemon_detail_abilities_inner.h
 *
 * 
 */

#ifndef _pokemon_detail_abilities_inner_H_
#define _pokemon_detail_abilities_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_detail_abilities_inner_t pokemon_detail_abilities_inner_t;

#include "ability_detail_pokemon_inner_pokemon.h"



typedef struct pokemon_detail_abilities_inner_t {
    struct ability_detail_pokemon_inner_pokemon_t *ability; //model
    int is_hidden; //boolean
    int slot; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_detail_abilities_inner_t;

__attribute__((deprecated)) pokemon_detail_abilities_inner_t *pokemon_detail_abilities_inner_create(
    ability_detail_pokemon_inner_pokemon_t *ability,
    int is_hidden,
    int slot
);

void pokemon_detail_abilities_inner_free(pokemon_detail_abilities_inner_t *pokemon_detail_abilities_inner);

pokemon_detail_abilities_inner_t *pokemon_detail_abilities_inner_parseFromJSON(cJSON *pokemon_detail_abilities_innerJSON);

cJSON *pokemon_detail_abilities_inner_convertToJSON(pokemon_detail_abilities_inner_t *pokemon_detail_abilities_inner);

#endif /* _pokemon_detail_abilities_inner_H_ */

