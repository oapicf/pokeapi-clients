/*
 * region_detail.h
 *
 * 
 */

#ifndef _region_detail_H_
#define _region_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct region_detail_t region_detail_t;

#include "ability_detail_pokemon_inner_pokemon.h"
#include "generation_summary.h"
#include "location_summary.h"
#include "pokedex_summary.h"
#include "region_name.h"



typedef struct region_detail_t {
    int id; //numeric
    char *name; // string
    list_t *locations; //nonprimitive container
    struct generation_summary_t *main_generation; //model
    list_t *names; //nonprimitive container
    list_t *pokedexes; //nonprimitive container
    list_t *version_groups; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} region_detail_t;

__attribute__((deprecated)) region_detail_t *region_detail_create(
    int id,
    char *name,
    list_t *locations,
    generation_summary_t *main_generation,
    list_t *names,
    list_t *pokedexes,
    list_t *version_groups
);

void region_detail_free(region_detail_t *region_detail);

region_detail_t *region_detail_parseFromJSON(cJSON *region_detailJSON);

cJSON *region_detail_convertToJSON(region_detail_t *region_detail);

#endif /* _region_detail_H_ */

