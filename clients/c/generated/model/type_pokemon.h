/*
 * type_pokemon.h
 *
 * 
 */

#ifndef _type_pokemon_H_
#define _type_pokemon_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct type_pokemon_t type_pokemon_t;

#include "pokemon_summary.h"



typedef struct type_pokemon_t {
    int *slot; //numeric
    struct pokemon_summary_t *pokemon; //model

    int _library_owned; // Is the library responsible for freeing this object?
} type_pokemon_t;

__attribute__((deprecated)) type_pokemon_t *type_pokemon_create(
    int *slot,
    pokemon_summary_t *pokemon
);

void type_pokemon_free(type_pokemon_t *type_pokemon);

type_pokemon_t *type_pokemon_parseFromJSON(cJSON *type_pokemonJSON);

cJSON *type_pokemon_convertToJSON(type_pokemon_t *type_pokemon);

#endif /* _type_pokemon_H_ */

