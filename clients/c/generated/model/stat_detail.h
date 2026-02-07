/*
 * stat_detail.h
 *
 * 
 */

#ifndef _stat_detail_H_
#define _stat_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct stat_detail_t stat_detail_t;

#include "characteristic_summary.h"
#include "move_damage_class_summary.h"
#include "stat_detail_affecting_moves.h"
#include "stat_detail_affecting_natures.h"
#include "stat_name.h"



typedef struct stat_detail_t {
    int id; //numeric
    char *name; // string
    int game_index; //numeric
    int is_battle_only; //boolean
    struct stat_detail_affecting_moves_t *affecting_moves; //model
    struct stat_detail_affecting_natures_t *affecting_natures; //model
    list_t *characteristics; //nonprimitive container
    struct move_damage_class_summary_t *move_damage_class; //model
    list_t *names; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} stat_detail_t;

__attribute__((deprecated)) stat_detail_t *stat_detail_create(
    int id,
    char *name,
    int game_index,
    int is_battle_only,
    stat_detail_affecting_moves_t *affecting_moves,
    stat_detail_affecting_natures_t *affecting_natures,
    list_t *characteristics,
    move_damage_class_summary_t *move_damage_class,
    list_t *names
);

void stat_detail_free(stat_detail_t *stat_detail);

stat_detail_t *stat_detail_parseFromJSON(cJSON *stat_detailJSON);

cJSON *stat_detail_convertToJSON(stat_detail_t *stat_detail);

#endif /* _stat_detail_H_ */

