/*
 * pokemon_color_detail.h
 *
 * 
 */

#ifndef _pokemon_color_detail_H_
#define _pokemon_color_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_color_detail_t pokemon_color_detail_t;

#include "pokemon_color_name.h"
#include "pokemon_species_summary.h"



typedef struct pokemon_color_detail_t {
    int id; //numeric
    char *name; // string
    list_t *names; //nonprimitive container
    list_t *pokemon_species; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_color_detail_t;

__attribute__((deprecated)) pokemon_color_detail_t *pokemon_color_detail_create(
    int id,
    char *name,
    list_t *names,
    list_t *pokemon_species
);

void pokemon_color_detail_free(pokemon_color_detail_t *pokemon_color_detail);

pokemon_color_detail_t *pokemon_color_detail_parseFromJSON(cJSON *pokemon_color_detailJSON);

cJSON *pokemon_color_detail_convertToJSON(pokemon_color_detail_t *pokemon_color_detail);

#endif /* _pokemon_color_detail_H_ */

