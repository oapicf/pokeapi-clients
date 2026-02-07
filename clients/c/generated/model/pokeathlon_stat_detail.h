/*
 * pokeathlon_stat_detail.h
 *
 * 
 */

#ifndef _pokeathlon_stat_detail_H_
#define _pokeathlon_stat_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokeathlon_stat_detail_t pokeathlon_stat_detail_t;

#include "pokeathlon_stat_detail_affecting_natures.h"
#include "pokeathlon_stat_name.h"



typedef struct pokeathlon_stat_detail_t {
    int id; //numeric
    char *name; // string
    struct pokeathlon_stat_detail_affecting_natures_t *affecting_natures; //model
    list_t *names; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} pokeathlon_stat_detail_t;

__attribute__((deprecated)) pokeathlon_stat_detail_t *pokeathlon_stat_detail_create(
    int id,
    char *name,
    pokeathlon_stat_detail_affecting_natures_t *affecting_natures,
    list_t *names
);

void pokeathlon_stat_detail_free(pokeathlon_stat_detail_t *pokeathlon_stat_detail);

pokeathlon_stat_detail_t *pokeathlon_stat_detail_parseFromJSON(cJSON *pokeathlon_stat_detailJSON);

cJSON *pokeathlon_stat_detail_convertToJSON(pokeathlon_stat_detail_t *pokeathlon_stat_detail);

#endif /* _pokeathlon_stat_detail_H_ */

