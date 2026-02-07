/*
 * move_target_detail.h
 *
 * 
 */

#ifndef _move_target_detail_H_
#define _move_target_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct move_target_detail_t move_target_detail_t;

#include "move_summary.h"
#include "move_target_description.h"
#include "move_target_name.h"



typedef struct move_target_detail_t {
    int id; //numeric
    char *name; // string
    list_t *descriptions; //nonprimitive container
    list_t *moves; //nonprimitive container
    list_t *names; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} move_target_detail_t;

__attribute__((deprecated)) move_target_detail_t *move_target_detail_create(
    int id,
    char *name,
    list_t *descriptions,
    list_t *moves,
    list_t *names
);

void move_target_detail_free(move_target_detail_t *move_target_detail);

move_target_detail_t *move_target_detail_parseFromJSON(cJSON *move_target_detailJSON);

cJSON *move_target_detail_convertToJSON(move_target_detail_t *move_target_detail);

#endif /* _move_target_detail_H_ */

