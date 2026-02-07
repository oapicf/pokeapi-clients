/*
 * stat_detail_affecting_natures.h
 *
 * 
 */

#ifndef _stat_detail_affecting_natures_H_
#define _stat_detail_affecting_natures_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct stat_detail_affecting_natures_t stat_detail_affecting_natures_t;

#include "ability_detail_pokemon_inner_pokemon.h"



typedef struct stat_detail_affecting_natures_t {
    list_t *increase; //nonprimitive container
    list_t *decrease; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} stat_detail_affecting_natures_t;

__attribute__((deprecated)) stat_detail_affecting_natures_t *stat_detail_affecting_natures_create(
    list_t *increase,
    list_t *decrease
);

void stat_detail_affecting_natures_free(stat_detail_affecting_natures_t *stat_detail_affecting_natures);

stat_detail_affecting_natures_t *stat_detail_affecting_natures_parseFromJSON(cJSON *stat_detail_affecting_naturesJSON);

cJSON *stat_detail_affecting_natures_convertToJSON(stat_detail_affecting_natures_t *stat_detail_affecting_natures);

#endif /* _stat_detail_affecting_natures_H_ */

