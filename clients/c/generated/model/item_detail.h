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

#include "evolution_chain_summary.h"
#include "item_attribute_summary.h"
#include "item_category_summary.h"
#include "item_effect_text.h"
#include "item_flavor_text.h"
#include "item_fling_effect_summary.h"
#include "item_game_index.h"
#include "item_machine.h"
#include "item_name.h"
#include "item_price.h"
#include "item_sprites.h"
#include "pokemon_held_item.h"



typedef struct item_detail_t {
    int *id; //numeric
    char *name; // string
    int *fling_power; //numeric
    struct item_fling_effect_summary_t *fling_effect; //model
    list_t *attributes; //nonprimitive container
    struct item_category_summary_t *category; //model
    list_t *effect_entries; //nonprimitive container
    list_t *flavor_text_entries; //nonprimitive container
    list_t *game_indices; //nonprimitive container
    list_t *prices; //nonprimitive container
    list_t *names; //nonprimitive container
    list_t *held_by_pokemon; //nonprimitive container
    struct item_sprites_t *sprites; //model
    struct evolution_chain_summary_t *baby_trigger_for; //model
    list_t *machines; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} item_detail_t;

__attribute__((deprecated)) item_detail_t *item_detail_create(
    int *id,
    char *name,
    int *fling_power,
    item_fling_effect_summary_t *fling_effect,
    list_t *attributes,
    item_category_summary_t *category,
    list_t *effect_entries,
    list_t *flavor_text_entries,
    list_t *game_indices,
    list_t *prices,
    list_t *names,
    list_t *held_by_pokemon,
    item_sprites_t *sprites,
    evolution_chain_summary_t *baby_trigger_for,
    list_t *machines
);

void item_detail_free(item_detail_t *item_detail);

item_detail_t *item_detail_parseFromJSON(cJSON *item_detailJSON);

cJSON *item_detail_convertToJSON(item_detail_t *item_detail);

#endif /* _item_detail_H_ */

