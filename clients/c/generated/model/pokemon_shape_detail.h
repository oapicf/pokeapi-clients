/*
 * pokemon_shape_detail.h
 *
 * 
 */

#ifndef _pokemon_shape_detail_H_
#define _pokemon_shape_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_shape_detail_t pokemon_shape_detail_t;

#include "pokemon_shape_detail_awesome_names_inner.h"
#include "pokemon_shape_detail_names_inner.h"
#include "pokemon_species_summary.h"



typedef struct pokemon_shape_detail_t {
    int id; //numeric
    char *name; // string
    list_t *awesome_names; //nonprimitive container
    list_t *names; //nonprimitive container
    list_t *pokemon_species; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_shape_detail_t;

__attribute__((deprecated)) pokemon_shape_detail_t *pokemon_shape_detail_create(
    int id,
    char *name,
    list_t *awesome_names,
    list_t *names,
    list_t *pokemon_species
);

void pokemon_shape_detail_free(pokemon_shape_detail_t *pokemon_shape_detail);

pokemon_shape_detail_t *pokemon_shape_detail_parseFromJSON(cJSON *pokemon_shape_detailJSON);

cJSON *pokemon_shape_detail_convertToJSON(pokemon_shape_detail_t *pokemon_shape_detail);

#endif /* _pokemon_shape_detail_H_ */

