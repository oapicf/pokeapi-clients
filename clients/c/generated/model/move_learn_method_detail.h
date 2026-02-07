/*
 * move_learn_method_detail.h
 *
 * 
 */

#ifndef _move_learn_method_detail_H_
#define _move_learn_method_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct move_learn_method_detail_t move_learn_method_detail_t;

#include "ability_detail_pokemon_inner_pokemon.h"
#include "move_learn_method_description.h"
#include "move_learn_method_name.h"



typedef struct move_learn_method_detail_t {
    int id; //numeric
    char *name; // string
    list_t *names; //nonprimitive container
    list_t *descriptions; //nonprimitive container
    list_t *version_groups; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} move_learn_method_detail_t;

__attribute__((deprecated)) move_learn_method_detail_t *move_learn_method_detail_create(
    int id,
    char *name,
    list_t *names,
    list_t *descriptions,
    list_t *version_groups
);

void move_learn_method_detail_free(move_learn_method_detail_t *move_learn_method_detail);

move_learn_method_detail_t *move_learn_method_detail_parseFromJSON(cJSON *move_learn_method_detailJSON);

cJSON *move_learn_method_detail_convertToJSON(move_learn_method_detail_t *move_learn_method_detail);

#endif /* _move_learn_method_detail_H_ */

