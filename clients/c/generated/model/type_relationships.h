/*
 * type_relationships.h
 *
 * 
 */

#ifndef _type_relationships_H_
#define _type_relationships_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct type_relationships_t type_relationships_t;

#include "type_summary.h"



typedef struct type_relationships_t {
    list_t *no_damage_to; //nonprimitive container
    list_t *half_damage_to; //nonprimitive container
    list_t *double_damage_to; //nonprimitive container
    list_t *no_damage_from; //nonprimitive container
    list_t *half_damage_from; //nonprimitive container
    list_t *double_damage_from; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} type_relationships_t;

__attribute__((deprecated)) type_relationships_t *type_relationships_create(
    list_t *no_damage_to,
    list_t *half_damage_to,
    list_t *double_damage_to,
    list_t *no_damage_from,
    list_t *half_damage_from,
    list_t *double_damage_from
);

void type_relationships_free(type_relationships_t *type_relationships);

type_relationships_t *type_relationships_parseFromJSON(cJSON *type_relationshipsJSON);

cJSON *type_relationships_convertToJSON(type_relationships_t *type_relationships);

#endif /* _type_relationships_H_ */

