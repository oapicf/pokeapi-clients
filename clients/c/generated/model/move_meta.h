/*
 * move_meta.h
 *
 * 
 */

#ifndef _move_meta_H_
#define _move_meta_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct move_meta_t move_meta_t;

#include "move_meta_ailment_summary.h"
#include "move_meta_category_summary.h"



typedef struct move_meta_t {
    struct move_meta_ailment_summary_t *ailment; //model
    struct move_meta_category_summary_t *category; //model
    int min_hits; //numeric
    int max_hits; //numeric
    int min_turns; //numeric
    int max_turns; //numeric
    int drain; //numeric
    int healing; //numeric
    int crit_rate; //numeric
    int ailment_chance; //numeric
    int flinch_chance; //numeric
    int stat_chance; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} move_meta_t;

__attribute__((deprecated)) move_meta_t *move_meta_create(
    move_meta_ailment_summary_t *ailment,
    move_meta_category_summary_t *category,
    int min_hits,
    int max_hits,
    int min_turns,
    int max_turns,
    int drain,
    int healing,
    int crit_rate,
    int ailment_chance,
    int flinch_chance,
    int stat_chance
);

void move_meta_free(move_meta_t *move_meta);

move_meta_t *move_meta_parseFromJSON(cJSON *move_metaJSON);

cJSON *move_meta_convertToJSON(move_meta_t *move_meta);

#endif /* _move_meta_H_ */

