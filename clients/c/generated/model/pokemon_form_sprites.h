/*
 * pokemon_form_sprites.h
 *
 * 
 */

#ifndef _pokemon_form_sprites_H_
#define _pokemon_form_sprites_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_form_sprites_t pokemon_form_sprites_t;

#include "any_type.h"
#include "pokemon_sprites_other.h"



typedef struct pokemon_form_sprites_t {
    char *front_default; // string
    char *front_shiny; // string
    char *front_female; // string
    char *front_shiny_female; // string
    char *back_default; // string
    char *back_shiny; // string
    char *back_female; // string
    char *back_shiny_female; // string
    struct pokemon_sprites_other_t *other; //model
    list_t* versions; //map

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_form_sprites_t;

__attribute__((deprecated)) pokemon_form_sprites_t *pokemon_form_sprites_create(
    char *front_default,
    char *front_shiny,
    char *front_female,
    char *front_shiny_female,
    char *back_default,
    char *back_shiny,
    char *back_female,
    char *back_shiny_female,
    pokemon_sprites_other_t *other,
    list_t* versions
);

void pokemon_form_sprites_free(pokemon_form_sprites_t *pokemon_form_sprites);

pokemon_form_sprites_t *pokemon_form_sprites_parseFromJSON(cJSON *pokemon_form_spritesJSON);

cJSON *pokemon_form_sprites_convertToJSON(pokemon_form_sprites_t *pokemon_form_sprites);

#endif /* _pokemon_form_sprites_H_ */

