/*
 * move_damage_class_detail.h
 *
 * 
 */

#ifndef _move_damage_class_detail_H_
#define _move_damage_class_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct move_damage_class_detail_t move_damage_class_detail_t;

#include "move_damage_class_description.h"
#include "move_damage_class_name.h"
#include "move_summary.h"



typedef struct move_damage_class_detail_t {
    int id; //numeric
    char *name; // string
    list_t *descriptions; //nonprimitive container
    list_t *moves; //nonprimitive container
    list_t *names; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} move_damage_class_detail_t;

__attribute__((deprecated)) move_damage_class_detail_t *move_damage_class_detail_create(
    int id,
    char *name,
    list_t *descriptions,
    list_t *moves,
    list_t *names
);

void move_damage_class_detail_free(move_damage_class_detail_t *move_damage_class_detail);

move_damage_class_detail_t *move_damage_class_detail_parseFromJSON(cJSON *move_damage_class_detailJSON);

cJSON *move_damage_class_detail_convertToJSON(move_damage_class_detail_t *move_damage_class_detail);

#endif /* _move_damage_class_detail_H_ */

