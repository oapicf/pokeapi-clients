/*
 * pokedex_detail_pokemon_entries_inner.h
 *
 * 
 */

#ifndef _pokedex_detail_pokemon_entries_inner_H_
#define _pokedex_detail_pokemon_entries_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokedex_detail_pokemon_entries_inner_t pokedex_detail_pokemon_entries_inner_t;

#include "ability_detail_pokemon_inner_pokemon.h"



typedef struct pokedex_detail_pokemon_entries_inner_t {
    int entry_number; //numeric
    struct ability_detail_pokemon_inner_pokemon_t *pokemon_species; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pokedex_detail_pokemon_entries_inner_t;

__attribute__((deprecated)) pokedex_detail_pokemon_entries_inner_t *pokedex_detail_pokemon_entries_inner_create(
    int entry_number,
    ability_detail_pokemon_inner_pokemon_t *pokemon_species
);

void pokedex_detail_pokemon_entries_inner_free(pokedex_detail_pokemon_entries_inner_t *pokedex_detail_pokemon_entries_inner);

pokedex_detail_pokemon_entries_inner_t *pokedex_detail_pokemon_entries_inner_parseFromJSON(cJSON *pokedex_detail_pokemon_entries_innerJSON);

cJSON *pokedex_detail_pokemon_entries_inner_convertToJSON(pokedex_detail_pokemon_entries_inner_t *pokedex_detail_pokemon_entries_inner);

#endif /* _pokedex_detail_pokemon_entries_inner_H_ */

