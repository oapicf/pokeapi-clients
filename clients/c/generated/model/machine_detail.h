/*
 * machine_detail.h
 *
 * 
 */

#ifndef _machine_detail_H_
#define _machine_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct machine_detail_t machine_detail_t;

#include "item_summary.h"
#include "move_summary.h"
#include "version_group_summary.h"



typedef struct machine_detail_t {
    int id; //numeric
    struct item_summary_t *item; //model
    struct version_group_summary_t *version_group; //model
    struct move_summary_t *move; //model

    int _library_owned; // Is the library responsible for freeing this object?
} machine_detail_t;

__attribute__((deprecated)) machine_detail_t *machine_detail_create(
    int id,
    item_summary_t *item,
    version_group_summary_t *version_group,
    move_summary_t *move
);

void machine_detail_free(machine_detail_t *machine_detail);

machine_detail_t *machine_detail_parseFromJSON(cJSON *machine_detailJSON);

cJSON *machine_detail_convertToJSON(machine_detail_t *machine_detail);

#endif /* _machine_detail_H_ */

