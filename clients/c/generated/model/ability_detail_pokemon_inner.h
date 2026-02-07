/*
 * ability_detail_pokemon_inner.h
 *
 * 
 */

#ifndef _ability_detail_pokemon_inner_H_
#define _ability_detail_pokemon_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ability_detail_pokemon_inner_t ability_detail_pokemon_inner_t;

#include "ability_detail_pokemon_inner_pokemon.h"



typedef struct ability_detail_pokemon_inner_t {
    int is_hidden; //boolean
    int slot; //numeric
    struct ability_detail_pokemon_inner_pokemon_t *pokemon; //model

    int _library_owned; // Is the library responsible for freeing this object?
} ability_detail_pokemon_inner_t;

__attribute__((deprecated)) ability_detail_pokemon_inner_t *ability_detail_pokemon_inner_create(
    int is_hidden,
    int slot,
    ability_detail_pokemon_inner_pokemon_t *pokemon
);

void ability_detail_pokemon_inner_free(ability_detail_pokemon_inner_t *ability_detail_pokemon_inner);

ability_detail_pokemon_inner_t *ability_detail_pokemon_inner_parseFromJSON(cJSON *ability_detail_pokemon_innerJSON);

cJSON *ability_detail_pokemon_inner_convertToJSON(ability_detail_pokemon_inner_t *ability_detail_pokemon_inner);

#endif /* _ability_detail_pokemon_inner_H_ */

