/*
 * generation_detail.h
 *
 * 
 */

#ifndef _generation_detail_H_
#define _generation_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct generation_detail_t generation_detail_t;

#include "ability_summary.h"
#include "generation_name.h"
#include "move_summary.h"
#include "pokemon_species_summary.h"
#include "region_summary.h"
#include "type_summary.h"
#include "version_group_summary.h"



typedef struct generation_detail_t {
    int id; //numeric
    char *name; // string
    list_t *abilities; //nonprimitive container
    struct region_summary_t *main_region; //model
    list_t *moves; //nonprimitive container
    list_t *names; //nonprimitive container
    list_t *pokemon_species; //nonprimitive container
    list_t *types; //nonprimitive container
    list_t *version_groups; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} generation_detail_t;

__attribute__((deprecated)) generation_detail_t *generation_detail_create(
    int id,
    char *name,
    list_t *abilities,
    region_summary_t *main_region,
    list_t *moves,
    list_t *names,
    list_t *pokemon_species,
    list_t *types,
    list_t *version_groups
);

void generation_detail_free(generation_detail_t *generation_detail);

generation_detail_t *generation_detail_parseFromJSON(cJSON *generation_detailJSON);

cJSON *generation_detail_convertToJSON(generation_detail_t *generation_detail);

#endif /* _generation_detail_H_ */

