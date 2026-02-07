/*
 * nature_battle_style_preference.h
 *
 * 
 */

#ifndef _nature_battle_style_preference_H_
#define _nature_battle_style_preference_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct nature_battle_style_preference_t nature_battle_style_preference_t;

#include "move_battle_style_summary.h"



typedef struct nature_battle_style_preference_t {
    int low_hp_preference; //numeric
    int high_hp_preference; //numeric
    struct move_battle_style_summary_t *move_battle_style; //model

    int _library_owned; // Is the library responsible for freeing this object?
} nature_battle_style_preference_t;

__attribute__((deprecated)) nature_battle_style_preference_t *nature_battle_style_preference_create(
    int low_hp_preference,
    int high_hp_preference,
    move_battle_style_summary_t *move_battle_style
);

void nature_battle_style_preference_free(nature_battle_style_preference_t *nature_battle_style_preference);

nature_battle_style_preference_t *nature_battle_style_preference_parseFromJSON(cJSON *nature_battle_style_preferenceJSON);

cJSON *nature_battle_style_preference_convertToJSON(nature_battle_style_preference_t *nature_battle_style_preference);

#endif /* _nature_battle_style_preference_H_ */

