/*
 * pokemon_form_detail_sprites.h
 *
 * 
 */

#ifndef _pokemon_form_detail_sprites_H_
#define _pokemon_form_detail_sprites_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_form_detail_sprites_t pokemon_form_detail_sprites_t;




typedef struct pokemon_form_detail_sprites_t {
    char *_default; // string

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_form_detail_sprites_t;

__attribute__((deprecated)) pokemon_form_detail_sprites_t *pokemon_form_detail_sprites_create(
    char *_default
);

void pokemon_form_detail_sprites_free(pokemon_form_detail_sprites_t *pokemon_form_detail_sprites);

pokemon_form_detail_sprites_t *pokemon_form_detail_sprites_parseFromJSON(cJSON *pokemon_form_detail_spritesJSON);

cJSON *pokemon_form_detail_sprites_convertToJSON(pokemon_form_detail_sprites_t *pokemon_form_detail_sprites);

#endif /* _pokemon_form_detail_sprites_H_ */

