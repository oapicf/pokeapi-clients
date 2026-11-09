/*
 * pokemon_sprites_other_dream_world.h
 *
 * 
 */

#ifndef _pokemon_sprites_other_dream_world_H_
#define _pokemon_sprites_other_dream_world_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_sprites_other_dream_world_t pokemon_sprites_other_dream_world_t;




typedef struct pokemon_sprites_other_dream_world_t {
    char *front_default; // string
    char *front_female; // string

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_sprites_other_dream_world_t;

__attribute__((deprecated)) pokemon_sprites_other_dream_world_t *pokemon_sprites_other_dream_world_create(
    char *front_default,
    char *front_female
);

void pokemon_sprites_other_dream_world_free(pokemon_sprites_other_dream_world_t *pokemon_sprites_other_dream_world);

pokemon_sprites_other_dream_world_t *pokemon_sprites_other_dream_world_parseFromJSON(cJSON *pokemon_sprites_other_dream_worldJSON);

cJSON *pokemon_sprites_other_dream_world_convertToJSON(pokemon_sprites_other_dream_world_t *pokemon_sprites_other_dream_world);

#endif /* _pokemon_sprites_other_dream_world_H_ */

