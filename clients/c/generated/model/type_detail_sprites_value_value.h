/*
 * type_detail_sprites_value_value.h
 *
 * 
 */

#ifndef _type_detail_sprites_value_value_H_
#define _type_detail_sprites_value_value_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct type_detail_sprites_value_value_t type_detail_sprites_value_value_t;




typedef struct type_detail_sprites_value_value_t {
    char *name_icon; // string

    int _library_owned; // Is the library responsible for freeing this object?
} type_detail_sprites_value_value_t;

__attribute__((deprecated)) type_detail_sprites_value_value_t *type_detail_sprites_value_value_create(
    char *name_icon
);

void type_detail_sprites_value_value_free(type_detail_sprites_value_value_t *type_detail_sprites_value_value);

type_detail_sprites_value_value_t *type_detail_sprites_value_value_parseFromJSON(cJSON *type_detail_sprites_value_valueJSON);

cJSON *type_detail_sprites_value_value_convertToJSON(type_detail_sprites_value_value_t *type_detail_sprites_value_value);

#endif /* _type_detail_sprites_value_value_H_ */

