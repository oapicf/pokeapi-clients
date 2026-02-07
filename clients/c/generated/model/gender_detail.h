/*
 * gender_detail.h
 *
 * 
 */

#ifndef _gender_detail_H_
#define _gender_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct gender_detail_t gender_detail_t;

#include "ability_detail_pokemon_inner_pokemon.h"
#include "gender_detail_pokemon_species_details_inner.h"



typedef struct gender_detail_t {
    int id; //numeric
    char *name; // string
    list_t *pokemon_species_details; //nonprimitive container
    list_t *required_for_evolution; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} gender_detail_t;

__attribute__((deprecated)) gender_detail_t *gender_detail_create(
    int id,
    char *name,
    list_t *pokemon_species_details,
    list_t *required_for_evolution
);

void gender_detail_free(gender_detail_t *gender_detail);

gender_detail_t *gender_detail_parseFromJSON(cJSON *gender_detailJSON);

cJSON *gender_detail_convertToJSON(gender_detail_t *gender_detail);

#endif /* _gender_detail_H_ */

