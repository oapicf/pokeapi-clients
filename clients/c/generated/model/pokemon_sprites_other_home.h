/*
 * pokemon_sprites_other_home.h
 *
 * 
 */

#ifndef _pokemon_sprites_other_home_H_
#define _pokemon_sprites_other_home_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_sprites_other_home_t pokemon_sprites_other_home_t;




typedef struct pokemon_sprites_other_home_t {
    char *front_default; // string
    char *front_female; // string
    char *front_shiny; // string
    char *front_shiny_female; // string

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_sprites_other_home_t;

__attribute__((deprecated)) pokemon_sprites_other_home_t *pokemon_sprites_other_home_create(
    char *front_default,
    char *front_female,
    char *front_shiny,
    char *front_shiny_female
);

void pokemon_sprites_other_home_free(pokemon_sprites_other_home_t *pokemon_sprites_other_home);

pokemon_sprites_other_home_t *pokemon_sprites_other_home_parseFromJSON(cJSON *pokemon_sprites_other_homeJSON);

cJSON *pokemon_sprites_other_home_convertToJSON(pokemon_sprites_other_home_t *pokemon_sprites_other_home);

#endif /* _pokemon_sprites_other_home_H_ */

