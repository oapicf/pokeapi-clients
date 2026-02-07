/*
 * item_detail_machines_inner.h
 *
 * 
 */

#ifndef _item_detail_machines_inner_H_
#define _item_detail_machines_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_detail_machines_inner_t item_detail_machines_inner_t;

#include "ability_detail_pokemon_inner_pokemon.h"



typedef struct item_detail_machines_inner_t {
    char *machine; // string
    struct ability_detail_pokemon_inner_pokemon_t *version_group; //model

    int _library_owned; // Is the library responsible for freeing this object?
} item_detail_machines_inner_t;

__attribute__((deprecated)) item_detail_machines_inner_t *item_detail_machines_inner_create(
    char *machine,
    ability_detail_pokemon_inner_pokemon_t *version_group
);

void item_detail_machines_inner_free(item_detail_machines_inner_t *item_detail_machines_inner);

item_detail_machines_inner_t *item_detail_machines_inner_parseFromJSON(cJSON *item_detail_machines_innerJSON);

cJSON *item_detail_machines_inner_convertToJSON(item_detail_machines_inner_t *item_detail_machines_inner);

#endif /* _item_detail_machines_inner_H_ */

