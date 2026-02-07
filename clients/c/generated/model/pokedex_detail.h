/*
 * pokedex_detail.h
 *
 * 
 */

#ifndef _pokedex_detail_H_
#define _pokedex_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokedex_detail_t pokedex_detail_t;

#include "ability_detail_pokemon_inner_pokemon.h"
#include "pokedex_description.h"
#include "pokedex_detail_pokemon_entries_inner.h"
#include "pokedex_name.h"
#include "region_summary.h"



typedef struct pokedex_detail_t {
    int id; //numeric
    char *name; // string
    int is_main_series; //boolean
    list_t *descriptions; //nonprimitive container
    list_t *names; //nonprimitive container
    list_t *pokemon_entries; //nonprimitive container
    struct region_summary_t *region; //model
    list_t *version_groups; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} pokedex_detail_t;

__attribute__((deprecated)) pokedex_detail_t *pokedex_detail_create(
    int id,
    char *name,
    int is_main_series,
    list_t *descriptions,
    list_t *names,
    list_t *pokemon_entries,
    region_summary_t *region,
    list_t *version_groups
);

void pokedex_detail_free(pokedex_detail_t *pokedex_detail);

pokedex_detail_t *pokedex_detail_parseFromJSON(cJSON *pokedex_detailJSON);

cJSON *pokedex_detail_convertToJSON(pokedex_detail_t *pokedex_detail);

#endif /* _pokedex_detail_H_ */

