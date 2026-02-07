/*
 * nature_detail.h
 *
 * 
 */

#ifndef _nature_detail_H_
#define _nature_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct nature_detail_t nature_detail_t;

#include "berry_flavor_summary.h"
#include "berry_summary.h"
#include "nature_battle_style_preference.h"
#include "nature_detail_pokeathlon_stat_changes_inner.h"
#include "nature_name.h"
#include "stat_summary.h"



typedef struct nature_detail_t {
    int id; //numeric
    char *name; // string
    struct stat_summary_t *decreased_stat; //model
    struct stat_summary_t *increased_stat; //model
    struct berry_flavor_summary_t *likes_flavor; //model
    struct berry_flavor_summary_t *hates_flavor; //model
    list_t *berries; //nonprimitive container
    list_t *pokeathlon_stat_changes; //nonprimitive container
    list_t *move_battle_style_preferences; //nonprimitive container
    list_t *names; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} nature_detail_t;

__attribute__((deprecated)) nature_detail_t *nature_detail_create(
    int id,
    char *name,
    stat_summary_t *decreased_stat,
    stat_summary_t *increased_stat,
    berry_flavor_summary_t *likes_flavor,
    berry_flavor_summary_t *hates_flavor,
    list_t *berries,
    list_t *pokeathlon_stat_changes,
    list_t *move_battle_style_preferences,
    list_t *names
);

void nature_detail_free(nature_detail_t *nature_detail);

nature_detail_t *nature_detail_parseFromJSON(cJSON *nature_detailJSON);

cJSON *nature_detail_convertToJSON(nature_detail_t *nature_detail);

#endif /* _nature_detail_H_ */

