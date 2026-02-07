/*
 * pokemon_form_detail_form_names_inner.h
 *
 * 
 */

#ifndef _pokemon_form_detail_form_names_inner_H_
#define _pokemon_form_detail_form_names_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_form_detail_form_names_inner_t pokemon_form_detail_form_names_inner_t;

#include "ability_detail_pokemon_inner_pokemon.h"



typedef struct pokemon_form_detail_form_names_inner_t {
    struct ability_detail_pokemon_inner_pokemon_t *language; //model
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_form_detail_form_names_inner_t;

__attribute__((deprecated)) pokemon_form_detail_form_names_inner_t *pokemon_form_detail_form_names_inner_create(
    ability_detail_pokemon_inner_pokemon_t *language,
    char *name
);

void pokemon_form_detail_form_names_inner_free(pokemon_form_detail_form_names_inner_t *pokemon_form_detail_form_names_inner);

pokemon_form_detail_form_names_inner_t *pokemon_form_detail_form_names_inner_parseFromJSON(cJSON *pokemon_form_detail_form_names_innerJSON);

cJSON *pokemon_form_detail_form_names_inner_convertToJSON(pokemon_form_detail_form_names_inner_t *pokemon_form_detail_form_names_inner);

#endif /* _pokemon_form_detail_form_names_inner_H_ */

