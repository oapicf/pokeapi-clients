/*
 * stat_affecting_natures.h
 *
 * 
 */

#ifndef _stat_affecting_natures_H_
#define _stat_affecting_natures_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct stat_affecting_natures_t stat_affecting_natures_t;

#include "nature_summary.h"



typedef struct stat_affecting_natures_t {
    list_t *increase; //nonprimitive container
    list_t *decrease; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} stat_affecting_natures_t;

__attribute__((deprecated)) stat_affecting_natures_t *stat_affecting_natures_create(
    list_t *increase,
    list_t *decrease
);

void stat_affecting_natures_free(stat_affecting_natures_t *stat_affecting_natures);

stat_affecting_natures_t *stat_affecting_natures_parseFromJSON(cJSON *stat_affecting_naturesJSON);

cJSON *stat_affecting_natures_convertToJSON(stat_affecting_natures_t *stat_affecting_natures);

#endif /* _stat_affecting_natures_H_ */

