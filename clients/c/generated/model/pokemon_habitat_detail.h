/*
 * pokemon_habitat_detail.h
 *
 * 
 */

#ifndef _pokemon_habitat_detail_H_
#define _pokemon_habitat_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_habitat_detail_t pokemon_habitat_detail_t;

#include "pokemon_habitat_name.h"
#include "pokemon_species_summary.h"



typedef struct pokemon_habitat_detail_t {
    int id; //numeric
    char *name; // string
    list_t *names; //nonprimitive container
    list_t *pokemon_species; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_habitat_detail_t;

__attribute__((deprecated)) pokemon_habitat_detail_t *pokemon_habitat_detail_create(
    int id,
    char *name,
    list_t *names,
    list_t *pokemon_species
);

void pokemon_habitat_detail_free(pokemon_habitat_detail_t *pokemon_habitat_detail);

pokemon_habitat_detail_t *pokemon_habitat_detail_parseFromJSON(cJSON *pokemon_habitat_detailJSON);

cJSON *pokemon_habitat_detail_convertToJSON(pokemon_habitat_detail_t *pokemon_habitat_detail);

#endif /* _pokemon_habitat_detail_H_ */

