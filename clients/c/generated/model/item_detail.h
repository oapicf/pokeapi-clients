/*
 * item_detail.h
 *
 * 
 */

#ifndef _item_detail_H_
#define _item_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_detail_t item_detail_t;

#include "ability_detail_pokemon_inner_pokemon.h"
#include "item_category_summary.h"
#include "item_detail_baby_trigger_for.h"
#include "item_detail_held_by_pokemon_inner.h"
#include "item_detail_machines_inner.h"
#include "item_detail_sprites.h"
#include "item_effect_text.h"
#include "item_flavor_text.h"
#include "item_fling_effect_summary.h"
#include "item_game_index.h"
#include "item_name.h"



typedef struct item_detail_t {
    int id; //numeric
    char *name; // string
    int cost; //numeric
    int fling_power; //numeric
    struct item_fling_effect_summary_t *fling_effect; //model
    list_t *attributes; //nonprimitive container
    struct item_category_summary_t *category; //model
    list_t *effect_entries; //nonprimitive container
    list_t *flavor_text_entries; //nonprimitive container
    list_t *game_indices; //nonprimitive container
    list_t *names; //nonprimitive container
    list_t *held_by_pokemon; //nonprimitive container
    struct item_detail_sprites_t *sprites; //model
    struct item_detail_baby_trigger_for_t *baby_trigger_for; //model
    list_t *machines; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} item_detail_t;

__attribute__((deprecated)) item_detail_t *item_detail_create(
    int id,
    char *name,
    int cost,
    int fling_power,
    item_fling_effect_summary_t *fling_effect,
    list_t *attributes,
    item_category_summary_t *category,
    list_t *effect_entries,
    list_t *flavor_text_entries,
    list_t *game_indices,
    list_t *names,
    list_t *held_by_pokemon,
    item_detail_sprites_t *sprites,
    item_detail_baby_trigger_for_t *baby_trigger_for,
    list_t *machines
);

void item_detail_free(item_detail_t *item_detail);

item_detail_t *item_detail_parseFromJSON(cJSON *item_detailJSON);

cJSON *item_detail_convertToJSON(item_detail_t *item_detail);

#endif /* _item_detail_H_ */

