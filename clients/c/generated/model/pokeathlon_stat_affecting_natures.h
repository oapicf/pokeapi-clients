/*
 * pokeathlon_stat_affecting_natures.h
 *
 * 
 */

#ifndef _pokeathlon_stat_affecting_natures_H_
#define _pokeathlon_stat_affecting_natures_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokeathlon_stat_affecting_natures_t pokeathlon_stat_affecting_natures_t;

#include "pokeathlon_stat_affecting_nature.h"



typedef struct pokeathlon_stat_affecting_natures_t {
    list_t *increase; //nonprimitive container
    list_t *decrease; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} pokeathlon_stat_affecting_natures_t;

__attribute__((deprecated)) pokeathlon_stat_affecting_natures_t *pokeathlon_stat_affecting_natures_create(
    list_t *increase,
    list_t *decrease
);

void pokeathlon_stat_affecting_natures_free(pokeathlon_stat_affecting_natures_t *pokeathlon_stat_affecting_natures);

pokeathlon_stat_affecting_natures_t *pokeathlon_stat_affecting_natures_parseFromJSON(cJSON *pokeathlon_stat_affecting_naturesJSON);

cJSON *pokeathlon_stat_affecting_natures_convertToJSON(pokeathlon_stat_affecting_natures_t *pokeathlon_stat_affecting_natures);

#endif /* _pokeathlon_stat_affecting_natures_H_ */

