/*
 * pokemon_species_genus.h
 *
 * 
 */

#ifndef _pokemon_species_genus_H_
#define _pokemon_species_genus_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_species_genus_t pokemon_species_genus_t;

#include "language_summary.h"



typedef struct pokemon_species_genus_t {
    char *genus; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_species_genus_t;

__attribute__((deprecated)) pokemon_species_genus_t *pokemon_species_genus_create(
    char *genus,
    language_summary_t *language
);

void pokemon_species_genus_free(pokemon_species_genus_t *pokemon_species_genus);

pokemon_species_genus_t *pokemon_species_genus_parseFromJSON(cJSON *pokemon_species_genusJSON);

cJSON *pokemon_species_genus_convertToJSON(pokemon_species_genus_t *pokemon_species_genus);

#endif /* _pokemon_species_genus_H_ */

