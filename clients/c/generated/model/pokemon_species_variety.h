/*
 * pokemon_species_variety.h
 *
 * 
 */

#ifndef _pokemon_species_variety_H_
#define _pokemon_species_variety_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_species_variety_t pokemon_species_variety_t;

#include "pokemon_summary.h"



typedef struct pokemon_species_variety_t {
    int *is_default; //boolean
    struct pokemon_summary_t *pokemon; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_species_variety_t;

__attribute__((deprecated)) pokemon_species_variety_t *pokemon_species_variety_create(
    int *is_default,
    pokemon_summary_t *pokemon
);

void pokemon_species_variety_free(pokemon_species_variety_t *pokemon_species_variety);

pokemon_species_variety_t *pokemon_species_variety_parseFromJSON(cJSON *pokemon_species_varietyJSON);

cJSON *pokemon_species_variety_convertToJSON(pokemon_species_variety_t *pokemon_species_variety);

#endif /* _pokemon_species_variety_H_ */

