/*
 * pokemon_sprites_other_official_artwork.h
 *
 * 
 */

#ifndef _pokemon_sprites_other_official_artwork_H_
#define _pokemon_sprites_other_official_artwork_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_sprites_other_official_artwork_t pokemon_sprites_other_official_artwork_t;

#include "any_type.h"



typedef struct pokemon_sprites_other_official_artwork_t {
    char *front_default; // string
    char *front_shiny; // string
    list_t* versions; //map

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_sprites_other_official_artwork_t;

__attribute__((deprecated)) pokemon_sprites_other_official_artwork_t *pokemon_sprites_other_official_artwork_create(
    char *front_default,
    char *front_shiny,
    list_t* versions
);

void pokemon_sprites_other_official_artwork_free(pokemon_sprites_other_official_artwork_t *pokemon_sprites_other_official_artwork);

pokemon_sprites_other_official_artwork_t *pokemon_sprites_other_official_artwork_parseFromJSON(cJSON *pokemon_sprites_other_official_artworkJSON);

cJSON *pokemon_sprites_other_official_artwork_convertToJSON(pokemon_sprites_other_official_artwork_t *pokemon_sprites_other_official_artwork);

#endif /* _pokemon_sprites_other_official_artwork_H_ */

