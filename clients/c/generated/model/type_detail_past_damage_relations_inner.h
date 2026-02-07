/*
 * type_detail_past_damage_relations_inner.h
 *
 * 
 */

#ifndef _type_detail_past_damage_relations_inner_H_
#define _type_detail_past_damage_relations_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct type_detail_past_damage_relations_inner_t type_detail_past_damage_relations_inner_t;

#include "ability_detail_pokemon_inner_pokemon.h"
#include "type_detail_past_damage_relations_inner_damage_relations.h"



typedef struct type_detail_past_damage_relations_inner_t {
    struct ability_detail_pokemon_inner_pokemon_t *generation; //model
    struct type_detail_past_damage_relations_inner_damage_relations_t *damage_relations; //model

    int _library_owned; // Is the library responsible for freeing this object?
} type_detail_past_damage_relations_inner_t;

__attribute__((deprecated)) type_detail_past_damage_relations_inner_t *type_detail_past_damage_relations_inner_create(
    ability_detail_pokemon_inner_pokemon_t *generation,
    type_detail_past_damage_relations_inner_damage_relations_t *damage_relations
);

void type_detail_past_damage_relations_inner_free(type_detail_past_damage_relations_inner_t *type_detail_past_damage_relations_inner);

type_detail_past_damage_relations_inner_t *type_detail_past_damage_relations_inner_parseFromJSON(cJSON *type_detail_past_damage_relations_innerJSON);

cJSON *type_detail_past_damage_relations_inner_convertToJSON(type_detail_past_damage_relations_inner_t *type_detail_past_damage_relations_inner);

#endif /* _type_detail_past_damage_relations_inner_H_ */

