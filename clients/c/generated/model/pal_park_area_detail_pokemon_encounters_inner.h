/*
 * pal_park_area_detail_pokemon_encounters_inner.h
 *
 * 
 */

#ifndef _pal_park_area_detail_pokemon_encounters_inner_H_
#define _pal_park_area_detail_pokemon_encounters_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pal_park_area_detail_pokemon_encounters_inner_t pal_park_area_detail_pokemon_encounters_inner_t;

#include "ability_detail_pokemon_inner_pokemon.h"



typedef struct pal_park_area_detail_pokemon_encounters_inner_t {
    int base_score; //numeric
    struct ability_detail_pokemon_inner_pokemon_t *pokemon_species; //model
    int rate; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} pal_park_area_detail_pokemon_encounters_inner_t;

__attribute__((deprecated)) pal_park_area_detail_pokemon_encounters_inner_t *pal_park_area_detail_pokemon_encounters_inner_create(
    int base_score,
    ability_detail_pokemon_inner_pokemon_t *pokemon_species,
    int rate
);

void pal_park_area_detail_pokemon_encounters_inner_free(pal_park_area_detail_pokemon_encounters_inner_t *pal_park_area_detail_pokemon_encounters_inner);

pal_park_area_detail_pokemon_encounters_inner_t *pal_park_area_detail_pokemon_encounters_inner_parseFromJSON(cJSON *pal_park_area_detail_pokemon_encounters_innerJSON);

cJSON *pal_park_area_detail_pokemon_encounters_inner_convertToJSON(pal_park_area_detail_pokemon_encounters_inner_t *pal_park_area_detail_pokemon_encounters_inner);

#endif /* _pal_park_area_detail_pokemon_encounters_inner_H_ */

