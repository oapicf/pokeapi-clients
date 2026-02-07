/*
 * move_detail_machines_inner.h
 *
 * 
 */

#ifndef _move_detail_machines_inner_H_
#define _move_detail_machines_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct move_detail_machines_inner_t move_detail_machines_inner_t;

#include "ability_detail_pokemon_inner_pokemon.h"
#include "move_detail_machines_inner_machine.h"



typedef struct move_detail_machines_inner_t {
    struct move_detail_machines_inner_machine_t *machine; //model
    struct ability_detail_pokemon_inner_pokemon_t *version_group; //model

    int _library_owned; // Is the library responsible for freeing this object?
} move_detail_machines_inner_t;

__attribute__((deprecated)) move_detail_machines_inner_t *move_detail_machines_inner_create(
    move_detail_machines_inner_machine_t *machine,
    ability_detail_pokemon_inner_pokemon_t *version_group
);

void move_detail_machines_inner_free(move_detail_machines_inner_t *move_detail_machines_inner);

move_detail_machines_inner_t *move_detail_machines_inner_parseFromJSON(cJSON *move_detail_machines_innerJSON);

cJSON *move_detail_machines_inner_convertToJSON(move_detail_machines_inner_t *move_detail_machines_inner);

#endif /* _move_detail_machines_inner_H_ */

