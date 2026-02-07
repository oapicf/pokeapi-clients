/*
 * characteristic_detail.h
 *
 * 
 */

#ifndef _characteristic_detail_H_
#define _characteristic_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct characteristic_detail_t characteristic_detail_t;

#include "characteristic_description.h"
#include "stat_summary.h"



typedef struct characteristic_detail_t {
    int id; //numeric
    int gene_modulo; //numeric
    list_t *possible_values; //primitive container
    struct stat_summary_t *highest_stat; //model
    list_t *descriptions; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} characteristic_detail_t;

__attribute__((deprecated)) characteristic_detail_t *characteristic_detail_create(
    int id,
    int gene_modulo,
    list_t *possible_values,
    stat_summary_t *highest_stat,
    list_t *descriptions
);

void characteristic_detail_free(characteristic_detail_t *characteristic_detail);

characteristic_detail_t *characteristic_detail_parseFromJSON(cJSON *characteristic_detailJSON);

cJSON *characteristic_detail_convertToJSON(characteristic_detail_t *characteristic_detail);

#endif /* _characteristic_detail_H_ */

