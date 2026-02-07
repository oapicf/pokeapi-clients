/*
 * item_detail_sprites.h
 *
 * 
 */

#ifndef _item_detail_sprites_H_
#define _item_detail_sprites_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_detail_sprites_t item_detail_sprites_t;




typedef struct item_detail_sprites_t {
    char *_default; // string

    int _library_owned; // Is the library responsible for freeing this object?
} item_detail_sprites_t;

__attribute__((deprecated)) item_detail_sprites_t *item_detail_sprites_create(
    char *_default
);

void item_detail_sprites_free(item_detail_sprites_t *item_detail_sprites);

item_detail_sprites_t *item_detail_sprites_parseFromJSON(cJSON *item_detail_spritesJSON);

cJSON *item_detail_sprites_convertToJSON(item_detail_sprites_t *item_detail_sprites);

#endif /* _item_detail_sprites_H_ */

