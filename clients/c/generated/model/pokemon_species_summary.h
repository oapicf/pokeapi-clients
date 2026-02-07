/*
 * pokemon_species_summary.h
 *
 * 
 */

#ifndef _pokemon_species_summary_H_
#define _pokemon_species_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_species_summary_t pokemon_species_summary_t;




typedef struct pokemon_species_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_species_summary_t;

__attribute__((deprecated)) pokemon_species_summary_t *pokemon_species_summary_create(
    char *name,
    char *url
);

void pokemon_species_summary_free(pokemon_species_summary_t *pokemon_species_summary);

pokemon_species_summary_t *pokemon_species_summary_parseFromJSON(cJSON *pokemon_species_summaryJSON);

cJSON *pokemon_species_summary_convertToJSON(pokemon_species_summary_t *pokemon_species_summary);

#endif /* _pokemon_species_summary_H_ */

