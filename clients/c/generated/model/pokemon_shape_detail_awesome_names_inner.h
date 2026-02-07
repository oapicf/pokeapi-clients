/*
 * pokemon_shape_detail_awesome_names_inner.h
 *
 * 
 */

#ifndef _pokemon_shape_detail_awesome_names_inner_H_
#define _pokemon_shape_detail_awesome_names_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_shape_detail_awesome_names_inner_t pokemon_shape_detail_awesome_names_inner_t;

#include "ability_detail_pokemon_inner_pokemon.h"



typedef struct pokemon_shape_detail_awesome_names_inner_t {
    char *awesome_name; // string
    struct ability_detail_pokemon_inner_pokemon_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_shape_detail_awesome_names_inner_t;

__attribute__((deprecated)) pokemon_shape_detail_awesome_names_inner_t *pokemon_shape_detail_awesome_names_inner_create(
    char *awesome_name,
    ability_detail_pokemon_inner_pokemon_t *language
);

void pokemon_shape_detail_awesome_names_inner_free(pokemon_shape_detail_awesome_names_inner_t *pokemon_shape_detail_awesome_names_inner);

pokemon_shape_detail_awesome_names_inner_t *pokemon_shape_detail_awesome_names_inner_parseFromJSON(cJSON *pokemon_shape_detail_awesome_names_innerJSON);

cJSON *pokemon_shape_detail_awesome_names_inner_convertToJSON(pokemon_shape_detail_awesome_names_inner_t *pokemon_shape_detail_awesome_names_inner);

#endif /* _pokemon_shape_detail_awesome_names_inner_H_ */

