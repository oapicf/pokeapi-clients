/*
 * growth_rate_detail.h
 *
 * 
 */

#ifndef _growth_rate_detail_H_
#define _growth_rate_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct growth_rate_detail_t growth_rate_detail_t;

#include "experience.h"
#include "growth_rate_description.h"
#include "pokemon_species_summary.h"



typedef struct growth_rate_detail_t {
    int id; //numeric
    char *name; // string
    char *formula; // string
    list_t *descriptions; //nonprimitive container
    list_t *levels; //nonprimitive container
    list_t *pokemon_species; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} growth_rate_detail_t;

__attribute__((deprecated)) growth_rate_detail_t *growth_rate_detail_create(
    int id,
    char *name,
    char *formula,
    list_t *descriptions,
    list_t *levels,
    list_t *pokemon_species
);

void growth_rate_detail_free(growth_rate_detail_t *growth_rate_detail);

growth_rate_detail_t *growth_rate_detail_parseFromJSON(cJSON *growth_rate_detailJSON);

cJSON *growth_rate_detail_convertToJSON(growth_rate_detail_t *growth_rate_detail);

#endif /* _growth_rate_detail_H_ */

