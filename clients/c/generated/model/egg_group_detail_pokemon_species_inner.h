/*
 * egg_group_detail_pokemon_species_inner.h
 *
 * 
 */

#ifndef _egg_group_detail_pokemon_species_inner_H_
#define _egg_group_detail_pokemon_species_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct egg_group_detail_pokemon_species_inner_t egg_group_detail_pokemon_species_inner_t;




typedef struct egg_group_detail_pokemon_species_inner_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} egg_group_detail_pokemon_species_inner_t;

__attribute__((deprecated)) egg_group_detail_pokemon_species_inner_t *egg_group_detail_pokemon_species_inner_create(
    char *name,
    char *url
);

void egg_group_detail_pokemon_species_inner_free(egg_group_detail_pokemon_species_inner_t *egg_group_detail_pokemon_species_inner);

egg_group_detail_pokemon_species_inner_t *egg_group_detail_pokemon_species_inner_parseFromJSON(cJSON *egg_group_detail_pokemon_species_innerJSON);

cJSON *egg_group_detail_pokemon_species_inner_convertToJSON(egg_group_detail_pokemon_species_inner_t *egg_group_detail_pokemon_species_inner);

#endif /* _egg_group_detail_pokemon_species_inner_H_ */

