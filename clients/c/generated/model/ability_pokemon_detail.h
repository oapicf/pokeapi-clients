/*
 * ability_pokemon_detail.h
 *
 * 
 */

#ifndef _ability_pokemon_detail_H_
#define _ability_pokemon_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ability_pokemon_detail_t ability_pokemon_detail_t;

#include "pokemon_summary.h"



typedef struct ability_pokemon_detail_t {
    int *is_hidden; //boolean
    int *slot; //numeric
    struct pokemon_summary_t *pokemon; //model

    int _library_owned; // Is the library responsible for freeing this object?
} ability_pokemon_detail_t;

__attribute__((deprecated)) ability_pokemon_detail_t *ability_pokemon_detail_create(
    int *is_hidden,
    int *slot,
    pokemon_summary_t *pokemon
);

void ability_pokemon_detail_free(ability_pokemon_detail_t *ability_pokemon_detail);

ability_pokemon_detail_t *ability_pokemon_detail_parseFromJSON(cJSON *ability_pokemon_detailJSON);

cJSON *ability_pokemon_detail_convertToJSON(ability_pokemon_detail_t *ability_pokemon_detail);

#endif /* _ability_pokemon_detail_H_ */

