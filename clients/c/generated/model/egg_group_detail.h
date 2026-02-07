/*
 * egg_group_detail.h
 *
 * 
 */

#ifndef _egg_group_detail_H_
#define _egg_group_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct egg_group_detail_t egg_group_detail_t;

#include "egg_group_detail_pokemon_species_inner.h"
#include "egg_group_name.h"



typedef struct egg_group_detail_t {
    int id; //numeric
    char *name; // string
    list_t *names; //nonprimitive container
    list_t *pokemon_species; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} egg_group_detail_t;

__attribute__((deprecated)) egg_group_detail_t *egg_group_detail_create(
    int id,
    char *name,
    list_t *names,
    list_t *pokemon_species
);

void egg_group_detail_free(egg_group_detail_t *egg_group_detail);

egg_group_detail_t *egg_group_detail_parseFromJSON(cJSON *egg_group_detailJSON);

cJSON *egg_group_detail_convertToJSON(egg_group_detail_t *egg_group_detail);

#endif /* _egg_group_detail_H_ */

