/*
 * gender_detail_pokemon_species_details_inner.h
 *
 * 
 */

#ifndef _gender_detail_pokemon_species_details_inner_H_
#define _gender_detail_pokemon_species_details_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct gender_detail_pokemon_species_details_inner_t gender_detail_pokemon_species_details_inner_t;

#include "ability_detail_pokemon_inner_pokemon.h"



typedef struct gender_detail_pokemon_species_details_inner_t {
    int rate; //numeric
    struct ability_detail_pokemon_inner_pokemon_t *pokemon_species; //model

    int _library_owned; // Is the library responsible for freeing this object?
} gender_detail_pokemon_species_details_inner_t;

__attribute__((deprecated)) gender_detail_pokemon_species_details_inner_t *gender_detail_pokemon_species_details_inner_create(
    int rate,
    ability_detail_pokemon_inner_pokemon_t *pokemon_species
);

void gender_detail_pokemon_species_details_inner_free(gender_detail_pokemon_species_details_inner_t *gender_detail_pokemon_species_details_inner);

gender_detail_pokemon_species_details_inner_t *gender_detail_pokemon_species_details_inner_parseFromJSON(cJSON *gender_detail_pokemon_species_details_innerJSON);

cJSON *gender_detail_pokemon_species_details_inner_convertToJSON(gender_detail_pokemon_species_details_inner_t *gender_detail_pokemon_species_details_inner);

#endif /* _gender_detail_pokemon_species_details_inner_H_ */

