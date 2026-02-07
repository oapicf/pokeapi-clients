/*
 * location_area_detail.h
 *
 * 
 */

#ifndef _location_area_detail_H_
#define _location_area_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct location_area_detail_t location_area_detail_t;

#include "location_area_detail_encounter_method_rates_inner.h"
#include "location_area_detail_pokemon_encounters_inner.h"
#include "location_area_name.h"
#include "location_summary.h"



typedef struct location_area_detail_t {
    int id; //numeric
    char *name; // string
    int game_index; //numeric
    list_t *encounter_method_rates; //nonprimitive container
    struct location_summary_t *location; //model
    list_t *names; //nonprimitive container
    list_t *pokemon_encounters; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} location_area_detail_t;

__attribute__((deprecated)) location_area_detail_t *location_area_detail_create(
    int id,
    char *name,
    int game_index,
    list_t *encounter_method_rates,
    location_summary_t *location,
    list_t *names,
    list_t *pokemon_encounters
);

void location_area_detail_free(location_area_detail_t *location_area_detail);

location_area_detail_t *location_area_detail_parseFromJSON(cJSON *location_area_detailJSON);

cJSON *location_area_detail_convertToJSON(location_area_detail_t *location_area_detail);

#endif /* _location_area_detail_H_ */

