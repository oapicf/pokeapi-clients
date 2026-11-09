/*
 * nature_pokeathlon_stat.h
 *
 * 
 */

#ifndef _nature_pokeathlon_stat_H_
#define _nature_pokeathlon_stat_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct nature_pokeathlon_stat_t nature_pokeathlon_stat_t;

#include "pokeathlon_stat_summary.h"



typedef struct nature_pokeathlon_stat_t {
    int *max_change; //numeric
    struct pokeathlon_stat_summary_t *pokeathlon_stat; //model

    int _library_owned; // Is the library responsible for freeing this object?
} nature_pokeathlon_stat_t;

__attribute__((deprecated)) nature_pokeathlon_stat_t *nature_pokeathlon_stat_create(
    int *max_change,
    pokeathlon_stat_summary_t *pokeathlon_stat
);

void nature_pokeathlon_stat_free(nature_pokeathlon_stat_t *nature_pokeathlon_stat);

nature_pokeathlon_stat_t *nature_pokeathlon_stat_parseFromJSON(cJSON *nature_pokeathlon_statJSON);

cJSON *nature_pokeathlon_stat_convertToJSON(nature_pokeathlon_stat_t *nature_pokeathlon_stat);

#endif /* _nature_pokeathlon_stat_H_ */

