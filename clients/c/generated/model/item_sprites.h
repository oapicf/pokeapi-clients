/*
 * item_sprites.h
 *
 * 
 */

#ifndef _item_sprites_H_
#define _item_sprites_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_sprites_t item_sprites_t;




typedef struct item_sprites_t {
    char *_default; // string

    int _library_owned; // Is the library responsible for freeing this object?
} item_sprites_t;

__attribute__((deprecated)) item_sprites_t *item_sprites_create(
    char *_default
);

void item_sprites_free(item_sprites_t *item_sprites);

item_sprites_t *item_sprites_parseFromJSON(cJSON *item_spritesJSON);

cJSON *item_sprites_convertToJSON(item_sprites_t *item_sprites);

#endif /* _item_sprites_H_ */

