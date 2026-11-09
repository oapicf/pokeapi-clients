/*
 * pokemon_sprites_other_showdown.h
 *
 * 
 */

#ifndef _pokemon_sprites_other_showdown_H_
#define _pokemon_sprites_other_showdown_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_sprites_other_showdown_t pokemon_sprites_other_showdown_t;




typedef struct pokemon_sprites_other_showdown_t {
    char *front_default; // string
    char *front_female; // string
    char *front_shiny; // string
    char *front_shiny_female; // string
    char *back_default; // string
    char *back_female; // string
    char *back_shiny; // string
    char *back_shiny_female; // string

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_sprites_other_showdown_t;

__attribute__((deprecated)) pokemon_sprites_other_showdown_t *pokemon_sprites_other_showdown_create(
    char *front_default,
    char *front_female,
    char *front_shiny,
    char *front_shiny_female,
    char *back_default,
    char *back_female,
    char *back_shiny,
    char *back_shiny_female
);

void pokemon_sprites_other_showdown_free(pokemon_sprites_other_showdown_t *pokemon_sprites_other_showdown);

pokemon_sprites_other_showdown_t *pokemon_sprites_other_showdown_parseFromJSON(cJSON *pokemon_sprites_other_showdownJSON);

cJSON *pokemon_sprites_other_showdown_convertToJSON(pokemon_sprites_other_showdown_t *pokemon_sprites_other_showdown);

#endif /* _pokemon_sprites_other_showdown_H_ */

