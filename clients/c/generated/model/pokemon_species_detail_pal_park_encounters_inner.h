/*
 * pokemon_species_detail_pal_park_encounters_inner.h
 *
 * 
 */

#ifndef _pokemon_species_detail_pal_park_encounters_inner_H_
#define _pokemon_species_detail_pal_park_encounters_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_species_detail_pal_park_encounters_inner_t pokemon_species_detail_pal_park_encounters_inner_t;

#include "ability_detail_pokemon_inner_pokemon.h"



typedef struct pokemon_species_detail_pal_park_encounters_inner_t {
    struct ability_detail_pokemon_inner_pokemon_t *area; //model
    int base_score; //numeric
    int rate; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_species_detail_pal_park_encounters_inner_t;

__attribute__((deprecated)) pokemon_species_detail_pal_park_encounters_inner_t *pokemon_species_detail_pal_park_encounters_inner_create(
    ability_detail_pokemon_inner_pokemon_t *area,
    int base_score,
    int rate
);

void pokemon_species_detail_pal_park_encounters_inner_free(pokemon_species_detail_pal_park_encounters_inner_t *pokemon_species_detail_pal_park_encounters_inner);

pokemon_species_detail_pal_park_encounters_inner_t *pokemon_species_detail_pal_park_encounters_inner_parseFromJSON(cJSON *pokemon_species_detail_pal_park_encounters_innerJSON);

cJSON *pokemon_species_detail_pal_park_encounters_inner_convertToJSON(pokemon_species_detail_pal_park_encounters_inner_t *pokemon_species_detail_pal_park_encounters_inner);

#endif /* _pokemon_species_detail_pal_park_encounters_inner_H_ */

