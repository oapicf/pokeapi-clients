/*
 * item_machine.h
 *
 * 
 */

#ifndef _item_machine_H_
#define _item_machine_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_machine_t item_machine_t;

#include "machine_summary.h"
#include "version_group_summary.h"



typedef struct item_machine_t {
    struct machine_summary_t *machine; //model
    struct version_group_summary_t *version_group; //model

    int _library_owned; // Is the library responsible for freeing this object?
} item_machine_t;

__attribute__((deprecated)) item_machine_t *item_machine_create(
    machine_summary_t *machine,
    version_group_summary_t *version_group
);

void item_machine_free(item_machine_t *item_machine);

item_machine_t *item_machine_parseFromJSON(cJSON *item_machineJSON);

cJSON *item_machine_convertToJSON(item_machine_t *item_machine);

#endif /* _item_machine_H_ */

