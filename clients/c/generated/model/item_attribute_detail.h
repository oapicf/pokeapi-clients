/*
 * item_attribute_detail.h
 *
 * 
 */

#ifndef _item_attribute_detail_H_
#define _item_attribute_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_attribute_detail_t item_attribute_detail_t;

#include "ability_detail_pokemon_inner_pokemon.h"
#include "item_attribute_description.h"
#include "item_attribute_name.h"



typedef struct item_attribute_detail_t {
    int id; //numeric
    char *name; // string
    list_t *descriptions; //nonprimitive container
    list_t *items; //nonprimitive container
    list_t *names; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} item_attribute_detail_t;

__attribute__((deprecated)) item_attribute_detail_t *item_attribute_detail_create(
    int id,
    char *name,
    list_t *descriptions,
    list_t *items,
    list_t *names
);

void item_attribute_detail_free(item_attribute_detail_t *item_attribute_detail);

item_attribute_detail_t *item_attribute_detail_parseFromJSON(cJSON *item_attribute_detailJSON);

cJSON *item_attribute_detail_convertToJSON(item_attribute_detail_t *item_attribute_detail);

#endif /* _item_attribute_detail_H_ */

