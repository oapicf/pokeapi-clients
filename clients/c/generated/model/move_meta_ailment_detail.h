/*
 * move_meta_ailment_detail.h
 *
 * 
 */

#ifndef _move_meta_ailment_detail_H_
#define _move_meta_ailment_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct move_meta_ailment_detail_t move_meta_ailment_detail_t;

#include "ability_detail_pokemon_inner_pokemon.h"
#include "move_meta_ailment_name.h"



typedef struct move_meta_ailment_detail_t {
    int id; //numeric
    char *name; // string
    list_t *moves; //nonprimitive container
    list_t *names; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} move_meta_ailment_detail_t;

__attribute__((deprecated)) move_meta_ailment_detail_t *move_meta_ailment_detail_create(
    int id,
    char *name,
    list_t *moves,
    list_t *names
);

void move_meta_ailment_detail_free(move_meta_ailment_detail_t *move_meta_ailment_detail);

move_meta_ailment_detail_t *move_meta_ailment_detail_parseFromJSON(cJSON *move_meta_ailment_detailJSON);

cJSON *move_meta_ailment_detail_convertToJSON(move_meta_ailment_detail_t *move_meta_ailment_detail);

#endif /* _move_meta_ailment_detail_H_ */

