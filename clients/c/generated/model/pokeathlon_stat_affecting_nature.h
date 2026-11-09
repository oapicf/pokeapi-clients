/*
 * pokeathlon_stat_affecting_nature.h
 *
 * 
 */

#ifndef _pokeathlon_stat_affecting_nature_H_
#define _pokeathlon_stat_affecting_nature_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokeathlon_stat_affecting_nature_t pokeathlon_stat_affecting_nature_t;

#include "nature_summary.h"



typedef struct pokeathlon_stat_affecting_nature_t {
    int *max_change; //numeric
    struct nature_summary_t *nature; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pokeathlon_stat_affecting_nature_t;

__attribute__((deprecated)) pokeathlon_stat_affecting_nature_t *pokeathlon_stat_affecting_nature_create(
    int *max_change,
    nature_summary_t *nature
);

void pokeathlon_stat_affecting_nature_free(pokeathlon_stat_affecting_nature_t *pokeathlon_stat_affecting_nature);

pokeathlon_stat_affecting_nature_t *pokeathlon_stat_affecting_nature_parseFromJSON(cJSON *pokeathlon_stat_affecting_natureJSON);

cJSON *pokeathlon_stat_affecting_nature_convertToJSON(pokeathlon_stat_affecting_nature_t *pokeathlon_stat_affecting_nature);

#endif /* _pokeathlon_stat_affecting_nature_H_ */

