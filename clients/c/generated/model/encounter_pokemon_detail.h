/*
 * encounter_pokemon_detail.h
 *
 * 
 */

#ifndef _encounter_pokemon_detail_H_
#define _encounter_pokemon_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct encounter_pokemon_detail_t encounter_pokemon_detail_t;




typedef struct encounter_pokemon_detail_t {
    int *min_perfect_ivs; //numeric
    int *always_shiny; //boolean
    int *never_shiny; //boolean
    int *is_alpha; //boolean

    int _library_owned; // Is the library responsible for freeing this object?
} encounter_pokemon_detail_t;

__attribute__((deprecated)) encounter_pokemon_detail_t *encounter_pokemon_detail_create(
    int *min_perfect_ivs,
    int *always_shiny,
    int *never_shiny,
    int *is_alpha
);

void encounter_pokemon_detail_free(encounter_pokemon_detail_t *encounter_pokemon_detail);

encounter_pokemon_detail_t *encounter_pokemon_detail_parseFromJSON(cJSON *encounter_pokemon_detailJSON);

cJSON *encounter_pokemon_detail_convertToJSON(encounter_pokemon_detail_t *encounter_pokemon_detail);

#endif /* _encounter_pokemon_detail_H_ */

