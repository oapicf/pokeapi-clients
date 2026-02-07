/*
 * ability_detail_pokemon_inner_pokemon.h
 *
 * 
 */

#ifndef _ability_detail_pokemon_inner_pokemon_H_
#define _ability_detail_pokemon_inner_pokemon_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ability_detail_pokemon_inner_pokemon_t ability_detail_pokemon_inner_pokemon_t;




typedef struct ability_detail_pokemon_inner_pokemon_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ability_detail_pokemon_inner_pokemon_t;

__attribute__((deprecated)) ability_detail_pokemon_inner_pokemon_t *ability_detail_pokemon_inner_pokemon_create(
    char *name,
    char *url
);

void ability_detail_pokemon_inner_pokemon_free(ability_detail_pokemon_inner_pokemon_t *ability_detail_pokemon_inner_pokemon);

ability_detail_pokemon_inner_pokemon_t *ability_detail_pokemon_inner_pokemon_parseFromJSON(cJSON *ability_detail_pokemon_inner_pokemonJSON);

cJSON *ability_detail_pokemon_inner_pokemon_convertToJSON(ability_detail_pokemon_inner_pokemon_t *ability_detail_pokemon_inner_pokemon);

#endif /* _ability_detail_pokemon_inner_pokemon_H_ */

