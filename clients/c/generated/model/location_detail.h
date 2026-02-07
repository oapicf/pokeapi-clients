/*
 * location_detail.h
 *
 * 
 */

#ifndef _location_detail_H_
#define _location_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct location_detail_t location_detail_t;

#include "location_area_summary.h"
#include "location_game_index.h"
#include "location_name.h"
#include "region_summary.h"



typedef struct location_detail_t {
    int id; //numeric
    char *name; // string
    struct region_summary_t *region; //model
    list_t *names; //nonprimitive container
    list_t *game_indices; //nonprimitive container
    list_t *areas; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} location_detail_t;

__attribute__((deprecated)) location_detail_t *location_detail_create(
    int id,
    char *name,
    region_summary_t *region,
    list_t *names,
    list_t *game_indices,
    list_t *areas
);

void location_detail_free(location_detail_t *location_detail);

location_detail_t *location_detail_parseFromJSON(cJSON *location_detailJSON);

cJSON *location_detail_convertToJSON(location_detail_t *location_detail);

#endif /* _location_detail_H_ */

