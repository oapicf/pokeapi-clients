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

#include "pokemon_detail_abilities_inner.h"
#include "pokemon_detail_cries.h"
#include "pokemon_detail_held_items.h"
#include "pokemon_detail_moves_inner.h"
#include "pokemon_detail_past_abilities_inner.h"
#include "pokemon_detail_past_types_inner.h"
#include "pokemon_detail_sprites.h"
#include "pokemon_detail_types_inner.h"
#include "pokemon_form_summary.h"
#include "pokemon_game_index.h"
#include "pokemon_species_summary.h"
#include "pokemon_stat.h"



typedef struct pokemon_detail_t {
    int id; //numeric
    char *name; // string
    int base_experience; //numeric
    int height; //numeric
    int is_default; //boolean
    int order; //numeric
    int weight; //numeric
    list_t *abilities; //nonprimitive container
    list_t *past_abilities; //nonprimitive container
    list_t *forms; //nonprimitive container
    list_t *game_indices; //nonprimitive container
    struct pokemon_detail_held_items_t *held_items; //model
    char *location_area_encounters; // string
    list_t *moves; //nonprimitive container
    struct pokemon_species_summary_t *species; //model
    pokemon_detail_sprites_t *sprites; // custom
    struct pokemon_detail_cries_t *cries; //model
    list_t *stats; //nonprimitive container
    list_t *types; //nonprimitive container
    list_t *past_types; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_detail_t;

__attribute__((deprecated)) pokemon_detail_t *pokemon_detail_create(
    int id,
    char *name,
    int base_experience,
    int height,
    int is_default,
    int order,
    int weight,
    list_t *abilities,
    list_t *past_abilities,
    list_t *forms,
    list_t *game_indices,
    pokemon_detail_held_items_t *held_items,
    char *location_area_encounters,
    list_t *moves,
    pokemon_species_summary_t *species,
    pokemon_detail_sprites_t *sprites,
    pokemon_detail_cries_t *cries,
    list_t *stats,
    list_t *types,
    list_t *past_types
);

void pokemon_detail_free(pokemon_detail_t *pokemon_detail);

pokemon_detail_t *pokemon_detail_parseFromJSON(cJSON *pokemon_detailJSON);

cJSON *pokemon_detail_convertToJSON(pokemon_detail_t *pokemon_detail);

#endif /* _pokemon_detail_H_ */

