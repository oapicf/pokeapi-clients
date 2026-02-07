/*
 * move_detail_machines_inner_machine.h
 *
 * 
 */

#ifndef _move_detail_machines_inner_machine_H_
#define _move_detail_machines_inner_machine_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct move_detail_machines_inner_machine_t move_detail_machines_inner_machine_t;




typedef struct move_detail_machines_inner_machine_t {
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} move_detail_machines_inner_machine_t;

__attribute__((deprecated)) move_detail_machines_inner_machine_t *move_detail_machines_inner_machine_create(
    char *url
);

void move_detail_machines_inner_machine_free(move_detail_machines_inner_machine_t *move_detail_machines_inner_machine);

move_detail_machines_inner_machine_t *move_detail_machines_inner_machine_parseFromJSON(cJSON *move_detail_machines_inner_machineJSON);

cJSON *move_detail_machines_inner_machine_convertToJSON(move_detail_machines_inner_machine_t *move_detail_machines_inner_machine);

#endif /* _move_detail_machines_inner_machine_H_ */

