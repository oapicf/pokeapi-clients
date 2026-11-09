/*
 * pokemon_sprites_other.h
 *
 * 
 */

#ifndef _pokemon_sprites_other_H_
#define _pokemon_sprites_other_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_sprites_other_t pokemon_sprites_other_t;

#include "pokemon_sprites_other_dream_world.h"
#include "pokemon_sprites_other_home.h"
#include "pokemon_sprites_other_official_artwork.h"
#include "pokemon_sprites_other_showdown.h"



typedef struct pokemon_sprites_other_t {
    struct pokemon_sprites_other_dream_world_t *dream_world; //model
    struct pokemon_sprites_other_home_t *home; //model
    struct pokemon_sprites_other_showdown_t *showdown; //model
    struct pokemon_sprites_other_official_artwork_t *official_artwork; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_sprites_other_t;

__attribute__((deprecated)) pokemon_sprites_other_t *pokemon_sprites_other_create(
    pokemon_sprites_other_dream_world_t *dream_world,
    pokemon_sprites_other_home_t *home,
    pokemon_sprites_other_showdown_t *showdown,
    pokemon_sprites_other_official_artwork_t *official_artwork
);

void pokemon_sprites_other_free(pokemon_sprites_other_t *pokemon_sprites_other);

pokemon_sprites_other_t *pokemon_sprites_other_parseFromJSON(cJSON *pokemon_sprites_otherJSON);

cJSON *pokemon_sprites_other_convertToJSON(pokemon_sprites_other_t *pokemon_sprites_other);

#endif /* _pokemon_sprites_other_H_ */

