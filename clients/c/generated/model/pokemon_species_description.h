/*
 * pokemon_species_description.h
 *
 * 
 */

#ifndef _pokemon_species_description_H_
#define _pokemon_species_description_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_species_description_t pokemon_species_description_t;

#include "language_summary.h"



typedef struct pokemon_species_description_t {
    char *description; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_species_description_t;

__attribute__((deprecated)) pokemon_species_description_t *pokemon_species_description_create(
    char *description,
    language_summary_t *language
);

void pokemon_species_description_free(pokemon_species_description_t *pokemon_species_description);

pokemon_species_description_t *pokemon_species_description_parseFromJSON(cJSON *pokemon_species_descriptionJSON);

cJSON *pokemon_species_description_convertToJSON(pokemon_species_description_t *pokemon_species_description);

#endif /* _pokemon_species_description_H_ */

