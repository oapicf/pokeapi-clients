/*
 * ability_detail.h
 *
 * 
 */

#ifndef _ability_detail_H_
#define _ability_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ability_detail_t ability_detail_t;

#include "ability_change.h"
#include "ability_detail_pokemon_inner.h"
#include "ability_effect_text.h"
#include "ability_flavor_text.h"
#include "ability_name.h"
#include "generation_summary.h"



typedef struct ability_detail_t {
    int id; //numeric
    char *name; // string
    int is_main_series; //boolean
    struct generation_summary_t *generation; //model
    list_t *names; //nonprimitive container
    list_t *effect_entries; //nonprimitive container
    list_t *effect_changes; //nonprimitive container
    list_t *flavor_text_entries; //nonprimitive container
    list_t *pokemon; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} ability_detail_t;

__attribute__((deprecated)) ability_detail_t *ability_detail_create(
    int id,
    char *name,
    int is_main_series,
    generation_summary_t *generation,
    list_t *names,
    list_t *effect_entries,
    list_t *effect_changes,
    list_t *flavor_text_entries,
    list_t *pokemon
);

void ability_detail_free(ability_detail_t *ability_detail);

ability_detail_t *ability_detail_parseFromJSON(cJSON *ability_detailJSON);

cJSON *ability_detail_convertToJSON(ability_detail_t *ability_detail);

#endif /* _ability_detail_H_ */

