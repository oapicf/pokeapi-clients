/*
 * type_detail_pokemon_inner.h
 *
 * 
 */

#ifndef _type_detail_pokemon_inner_H_
#define _type_detail_pokemon_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct type_detail_pokemon_inner_t type_detail_pokemon_inner_t;

#include "type_detail_pokemon_inner_pokemon.h"



typedef struct type_detail_pokemon_inner_t {
    int slot; //numeric
    struct type_detail_pokemon_inner_pokemon_t *pokemon; //model

    int _library_owned; // Is the library responsible for freeing this object?
} type_detail_pokemon_inner_t;

__attribute__((deprecated)) type_detail_pokemon_inner_t *type_detail_pokemon_inner_create(
    int slot,
    type_detail_pokemon_inner_pokemon_t *pokemon
);

void type_detail_pokemon_inner_free(type_detail_pokemon_inner_t *type_detail_pokemon_inner);

type_detail_pokemon_inner_t *type_detail_pokemon_inner_parseFromJSON(cJSON *type_detail_pokemon_innerJSON);

cJSON *type_detail_pokemon_inner_convertToJSON(type_detail_pokemon_inner_t *type_detail_pokemon_inner);

#endif /* _type_detail_pokemon_inner_H_ */

