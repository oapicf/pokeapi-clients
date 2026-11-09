/*
 * type_game_sprite.h
 *
 * 
 */

#ifndef _type_game_sprite_H_
#define _type_game_sprite_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct type_game_sprite_t type_game_sprite_t;




typedef struct type_game_sprite_t {
    char *name_icon; // string
    char *symbol_icon; // string

    int _library_owned; // Is the library responsible for freeing this object?
} type_game_sprite_t;

__attribute__((deprecated)) type_game_sprite_t *type_game_sprite_create(
    char *name_icon,
    char *symbol_icon
);

void type_game_sprite_free(type_game_sprite_t *type_game_sprite);

type_game_sprite_t *type_game_sprite_parseFromJSON(cJSON *type_game_spriteJSON);

cJSON *type_game_sprite_convertToJSON(type_game_sprite_t *type_game_sprite);

#endif /* _type_game_sprite_H_ */

