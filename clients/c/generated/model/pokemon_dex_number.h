/*
 * pokemon_dex_number.h
 *
 * 
 */

#ifndef _pokemon_dex_number_H_
#define _pokemon_dex_number_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_dex_number_t pokemon_dex_number_t;

#include "pokemon_species_summary.h"



typedef struct pokemon_dex_number_t {
    int *entry_number; //numeric
    struct pokemon_species_summary_t *pokemon_species; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_dex_number_t;

__attribute__((deprecated)) pokemon_dex_number_t *pokemon_dex_number_create(
    int *entry_number,
    pokemon_species_summary_t *pokemon_species
);

void pokemon_dex_number_free(pokemon_dex_number_t *pokemon_dex_number);

pokemon_dex_number_t *pokemon_dex_number_parseFromJSON(cJSON *pokemon_dex_numberJSON);

cJSON *pokemon_dex_number_convertToJSON(pokemon_dex_number_t *pokemon_dex_number);

#endif /* _pokemon_dex_number_H_ */

