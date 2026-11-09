/*
 * pokemon_detail.h
 *
 * 
 */

#ifndef _pokemon_detail_H_
#define _pokemon_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_detail_t pokemon_detail_t;

#include "pokemon_ability.h"
#include "pokemon_cries.h"
#include "pokemon_form_summary.h"
#include "pokemon_game_index.h"
#include "pokemon_held_item_summary.h"
#include "pokemon_move.h"
#include "pokemon_past_ability.h"
#include "pokemon_past_stat.h"
#include "pokemon_past_type.h"
#include "pokemon_species_summary.h"
#include "pokemon_sprites.h"
#include "pokemon_stat.h"
#include "pokemon_type.h"



typedef struct pokemon_detail_t {
    int *id; //numeric
    char *name; // string
    int *base_experience; //numeric
    int *height; //numeric
    int *is_default; //boolean
    int *order; //numeric
    int *weight; //numeric
    list_t *abilities; //nonprimitive container
    list_t *past_abilities; //nonprimitive container
    list_t *forms; //nonprimitive container
    list_t *game_indices; //nonprimitive container
    list_t *held_items; //nonprimitive container
    char *location_area_encounters; // string
    list_t *moves; //nonprimitive container
    struct pokemon_species_summary_t *species; //model
    struct pokemon_sprites_t *sprites; //model
    struct pokemon_cries_t *cries; //model
    list_t *stats; //nonprimitive container
    list_t *past_stats; //nonprimitive container
    list_t *types; //nonprimitive container
    list_t *past_types; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_detail_t;

__attribute__((deprecated)) pokemon_detail_t *pokemon_detail_create(
    int *id,
    char *name,
    int *base_experience,
    int *height,
    int *is_default,
    int *order,
    int *weight,
    list_t *abilities,
    list_t *past_abilities,
    list_t *forms,
    list_t *game_indices,
    list_t *held_items,
    char *location_area_encounters,
    list_t *moves,
    pokemon_species_summary_t *species,
    pokemon_sprites_t *sprites,
    pokemon_cries_t *cries,
    list_t *stats,
    list_t *past_stats,
    list_t *types,
    list_t *past_types
);

void pokemon_detail_free(pokemon_detail_t *pokemon_detail);

pokemon_detail_t *pokemon_detail_parseFromJSON(cJSON *pokemon_detailJSON);

cJSON *pokemon_detail_convertToJSON(pokemon_detail_t *pokemon_detail);

#endif /* _pokemon_detail_H_ */

