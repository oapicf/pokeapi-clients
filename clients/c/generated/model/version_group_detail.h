/*
 * version_group_detail.h
 *
 * 
 */

#ifndef _version_group_detail_H_
#define _version_group_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct version_group_detail_t version_group_detail_t;

#include "ability_detail_pokemon_inner_pokemon.h"
#include "generation_summary.h"
#include "version_summary.h"



typedef struct version_group_detail_t {
    int id; //numeric
    char *name; // string
    int order; //numeric
    struct generation_summary_t *generation; //model
    list_t *move_learn_methods; //nonprimitive container
    list_t *pokedexes; //nonprimitive container
    list_t *regions; //nonprimitive container
    list_t *versions; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} version_group_detail_t;

__attribute__((deprecated)) version_group_detail_t *version_group_detail_create(
    int id,
    char *name,
    int order,
    generation_summary_t *generation,
    list_t *move_learn_methods,
    list_t *pokedexes,
    list_t *regions,
    list_t *versions
);

void version_group_detail_free(version_group_detail_t *version_group_detail);

version_group_detail_t *version_group_detail_parseFromJSON(cJSON *version_group_detailJSON);

cJSON *version_group_detail_convertToJSON(version_group_detail_t *version_group_detail);

#endif /* _version_group_detail_H_ */

