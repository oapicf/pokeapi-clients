/*
 * move_detail.h
 *
 * 
 */

#ifndef _move_detail_H_
#define _move_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct move_detail_t move_detail_t;

#include "ability_detail_pokemon_inner_pokemon.h"
#include "contest_effect_summary.h"
#include "contest_type_summary.h"
#include "generation_summary.h"
#include "move_change.h"
#include "move_change_effect_entries_inner.h"
#include "move_damage_class_summary.h"
#include "move_detail_contest_combos.h"
#include "move_detail_effect_changes_inner.h"
#include "move_detail_machines_inner.h"
#include "move_detail_stat_changes_inner.h"
#include "move_flavor_text.h"
#include "move_meta.h"
#include "move_name.h"
#include "move_target_summary.h"
#include "super_contest_effect_summary.h"
#include "type_summary.h"



typedef struct move_detail_t {
    int id; //numeric
    char *name; // string
    int accuracy; //numeric
    int effect_chance; //numeric
    int pp; //numeric
    int priority; //numeric
    int power; //numeric
    struct move_detail_contest_combos_t *contest_combos; //model
    struct contest_type_summary_t *contest_type; //model
    struct contest_effect_summary_t *contest_effect; //model
    struct move_damage_class_summary_t *damage_class; //model
    list_t *effect_entries; //nonprimitive container
    list_t *effect_changes; //nonprimitive container
    struct generation_summary_t *generation; //model
    struct move_meta_t *meta; //model
    list_t *names; //nonprimitive container
    list_t *past_values; //nonprimitive container
    list_t *stat_changes; //nonprimitive container
    struct super_contest_effect_summary_t *super_contest_effect; //model
    struct move_target_summary_t *target; //model
    struct type_summary_t *type; //model
    list_t *machines; //nonprimitive container
    list_t *flavor_text_entries; //nonprimitive container
    list_t *learned_by_pokemon; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} move_detail_t;

__attribute__((deprecated)) move_detail_t *move_detail_create(
    int id,
    char *name,
    int accuracy,
    int effect_chance,
    int pp,
    int priority,
    int power,
    move_detail_contest_combos_t *contest_combos,
    contest_type_summary_t *contest_type,
    contest_effect_summary_t *contest_effect,
    move_damage_class_summary_t *damage_class,
    list_t *effect_entries,
    list_t *effect_changes,
    generation_summary_t *generation,
    move_meta_t *meta,
    list_t *names,
    list_t *past_values,
    list_t *stat_changes,
    super_contest_effect_summary_t *super_contest_effect,
    move_target_summary_t *target,
    type_summary_t *type,
    list_t *machines,
    list_t *flavor_text_entries,
    list_t *learned_by_pokemon
);

void move_detail_free(move_detail_t *move_detail);

move_detail_t *move_detail_parseFromJSON(cJSON *move_detailJSON);

cJSON *move_detail_convertToJSON(move_detail_t *move_detail);

#endif /* _move_detail_H_ */

