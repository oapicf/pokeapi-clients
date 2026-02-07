/*
 * move_battle_style_detail.h
 *
 * 
 */

#ifndef _move_battle_style_detail_H_
#define _move_battle_style_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct move_battle_style_detail_t move_battle_style_detail_t;

#include "move_battle_style_name.h"



typedef struct move_battle_style_detail_t {
    int id; //numeric
    char *name; // string
    list_t *names; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} move_battle_style_detail_t;

__attribute__((deprecated)) move_battle_style_detail_t *move_battle_style_detail_create(
    int id,
    char *name,
    list_t *names
);

void move_battle_style_detail_free(move_battle_style_detail_t *move_battle_style_detail);

move_battle_style_detail_t *move_battle_style_detail_parseFromJSON(cJSON *move_battle_style_detailJSON);

cJSON *move_battle_style_detail_convertToJSON(move_battle_style_detail_t *move_battle_style_detail);

#endif /* _move_battle_style_detail_H_ */

