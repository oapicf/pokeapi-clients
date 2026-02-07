/*
 * type_detail_pokemon_inner_pokemon.h
 *
 * 
 */

#ifndef _type_detail_pokemon_inner_pokemon_H_
#define _type_detail_pokemon_inner_pokemon_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct type_detail_pokemon_inner_pokemon_t type_detail_pokemon_inner_pokemon_t;




typedef struct type_detail_pokemon_inner_pokemon_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} type_detail_pokemon_inner_pokemon_t;

__attribute__((deprecated)) type_detail_pokemon_inner_pokemon_t *type_detail_pokemon_inner_pokemon_create(
    char *name,
    char *url
);

void type_detail_pokemon_inner_pokemon_free(type_detail_pokemon_inner_pokemon_t *type_detail_pokemon_inner_pokemon);

type_detail_pokemon_inner_pokemon_t *type_detail_pokemon_inner_pokemon_parseFromJSON(cJSON *type_detail_pokemon_inner_pokemonJSON);

cJSON *type_detail_pokemon_inner_pokemon_convertToJSON(type_detail_pokemon_inner_pokemon_t *type_detail_pokemon_inner_pokemon);

#endif /* _type_detail_pokemon_inner_pokemon_H_ */

