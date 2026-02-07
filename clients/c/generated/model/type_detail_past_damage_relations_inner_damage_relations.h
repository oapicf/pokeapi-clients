/*
 * type_detail_past_damage_relations_inner_damage_relations.h
 *
 * 
 */

#ifndef _type_detail_past_damage_relations_inner_damage_relations_H_
#define _type_detail_past_damage_relations_inner_damage_relations_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct type_detail_past_damage_relations_inner_damage_relations_t type_detail_past_damage_relations_inner_damage_relations_t;

#include "ability_detail_pokemon_inner_pokemon.h"



typedef struct type_detail_past_damage_relations_inner_damage_relations_t {
    list_t *no_damage_to; //nonprimitive container
    list_t *half_damage_to; //nonprimitive container
    list_t *double_damage_to; //nonprimitive container
    list_t *no_damage_from; //nonprimitive container
    list_t *half_damage_from; //nonprimitive container
    list_t *double_damage_from; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} type_detail_past_damage_relations_inner_damage_relations_t;

__attribute__((deprecated)) type_detail_past_damage_relations_inner_damage_relations_t *type_detail_past_damage_relations_inner_damage_relations_create(
    list_t *no_damage_to,
    list_t *half_damage_to,
    list_t *double_damage_to,
    list_t *no_damage_from,
    list_t *half_damage_from,
    list_t *double_damage_from
);

void type_detail_past_damage_relations_inner_damage_relations_free(type_detail_past_damage_relations_inner_damage_relations_t *type_detail_past_damage_relations_inner_damage_relations);

type_detail_past_damage_relations_inner_damage_relations_t *type_detail_past_damage_relations_inner_damage_relations_parseFromJSON(cJSON *type_detail_past_damage_relations_inner_damage_relationsJSON);

cJSON *type_detail_past_damage_relations_inner_damage_relations_convertToJSON(type_detail_past_damage_relations_inner_damage_relations_t *type_detail_past_damage_relations_inner_damage_relations);

#endif /* _type_detail_past_damage_relations_inner_damage_relations_H_ */

