/*
 * pokemon_dex_entry.h
 *
 * 
 */

#ifndef _pokemon_dex_entry_H_
#define _pokemon_dex_entry_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_dex_entry_t pokemon_dex_entry_t;

#include "pokedex_summary.h"



typedef struct pokemon_dex_entry_t {
    int entry_number; //numeric
    struct pokedex_summary_t *pokedex; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_dex_entry_t;

__attribute__((deprecated)) pokemon_dex_entry_t *pokemon_dex_entry_create(
    int entry_number,
    pokedex_summary_t *pokedex
);

void pokemon_dex_entry_free(pokemon_dex_entry_t *pokemon_dex_entry);

pokemon_dex_entry_t *pokemon_dex_entry_parseFromJSON(cJSON *pokemon_dex_entryJSON);

cJSON *pokemon_dex_entry_convertToJSON(pokemon_dex_entry_t *pokemon_dex_entry);

#endif /* _pokemon_dex_entry_H_ */

