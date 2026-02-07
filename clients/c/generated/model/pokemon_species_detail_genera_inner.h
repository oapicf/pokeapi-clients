/*
 * pokemon_species_detail_genera_inner.h
 *
 * 
 */

#ifndef _pokemon_species_detail_genera_inner_H_
#define _pokemon_species_detail_genera_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_species_detail_genera_inner_t pokemon_species_detail_genera_inner_t;

#include "ability_detail_pokemon_inner_pokemon.h"



typedef struct pokemon_species_detail_genera_inner_t {
    char *genus; // string
    struct ability_detail_pokemon_inner_pokemon_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_species_detail_genera_inner_t;

__attribute__((deprecated)) pokemon_species_detail_genera_inner_t *pokemon_species_detail_genera_inner_create(
    char *genus,
    ability_detail_pokemon_inner_pokemon_t *language
);

void pokemon_species_detail_genera_inner_free(pokemon_species_detail_genera_inner_t *pokemon_species_detail_genera_inner);

pokemon_species_detail_genera_inner_t *pokemon_species_detail_genera_inner_parseFromJSON(cJSON *pokemon_species_detail_genera_innerJSON);

cJSON *pokemon_species_detail_genera_inner_convertToJSON(pokemon_species_detail_genera_inner_t *pokemon_species_detail_genera_inner);

#endif /* _pokemon_species_detail_genera_inner_H_ */

