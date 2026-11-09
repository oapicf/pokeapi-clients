/*
 * gender_pokemon_species.h
 *
 * 
 */

#ifndef _gender_pokemon_species_H_
#define _gender_pokemon_species_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct gender_pokemon_species_t gender_pokemon_species_t;

#include "pokemon_species_summary.h"



typedef struct gender_pokemon_species_t {
    int *rate; //numeric
    struct pokemon_species_summary_t *pokemon_species; //model

    int _library_owned; // Is the library responsible for freeing this object?
} gender_pokemon_species_t;

__attribute__((deprecated)) gender_pokemon_species_t *gender_pokemon_species_create(
    int *rate,
    pokemon_species_summary_t *pokemon_species
);

void gender_pokemon_species_free(gender_pokemon_species_t *gender_pokemon_species);

gender_pokemon_species_t *gender_pokemon_species_parseFromJSON(cJSON *gender_pokemon_speciesJSON);

cJSON *gender_pokemon_species_convertToJSON(gender_pokemon_species_t *gender_pokemon_species);

#endif /* _gender_pokemon_species_H_ */

