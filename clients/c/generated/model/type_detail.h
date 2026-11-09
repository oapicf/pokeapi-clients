/*
 * type_detail.h
 *
 * Serializer for the Type resource
 */

#ifndef _type_detail_H_
#define _type_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct type_detail_t type_detail_t;

#include "ModelTypeName.h"
#include "generation_summary.h"
#include "move_damage_class_summary.h"
#include "move_summary.h"
#include "type_game_index.h"
#include "type_game_sprite.h"
#include "type_past_relationships.h"
#include "type_pokemon.h"
#include "type_relationships.h"



typedef struct type_detail_t {
    int *id; //numeric
    char *name; // string
    struct type_relationships_t *damage_relations; //model
    list_t *past_damage_relations; //nonprimitive container
    list_t *game_indices; //nonprimitive container
    struct generation_summary_t *generation; //model
    struct move_damage_class_summary_t *move_damage_class; //model
    list_t *names; //nonprimitive container
    list_t *pokemon; //nonprimitive container
    list_t *moves; //nonprimitive container
    list_t* sprites; //map

    int _library_owned; // Is the library responsible for freeing this object?
} type_detail_t;

__attribute__((deprecated)) type_detail_t *type_detail_create(
    int *id,
    char *name,
    type_relationships_t *damage_relations,
    list_t *past_damage_relations,
    list_t *game_indices,
    generation_summary_t *generation,
    move_damage_class_summary_t *move_damage_class,
    list_t *names,
    list_t *pokemon,
    list_t *moves,
    list_t* sprites
);

void type_detail_free(type_detail_t *type_detail);

type_detail_t *type_detail_parseFromJSON(cJSON *type_detailJSON);

cJSON *type_detail_convertToJSON(type_detail_t *type_detail);

#endif /* _type_detail_H_ */

