/*
 * pal_park_area_detail.h
 *
 * 
 */

#ifndef _pal_park_area_detail_H_
#define _pal_park_area_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pal_park_area_detail_t pal_park_area_detail_t;

#include "pal_park_area_detail_pokemon_encounters_inner.h"
#include "pal_park_area_name.h"



typedef struct pal_park_area_detail_t {
    int id; //numeric
    char *name; // string
    list_t *names; //nonprimitive container
    list_t *pokemon_encounters; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} pal_park_area_detail_t;

__attribute__((deprecated)) pal_park_area_detail_t *pal_park_area_detail_create(
    int id,
    char *name,
    list_t *names,
    list_t *pokemon_encounters
);

void pal_park_area_detail_free(pal_park_area_detail_t *pal_park_area_detail);

pal_park_area_detail_t *pal_park_area_detail_parseFromJSON(cJSON *pal_park_area_detailJSON);

cJSON *pal_park_area_detail_convertToJSON(pal_park_area_detail_t *pal_park_area_detail);

#endif /* _pal_park_area_detail_H_ */

