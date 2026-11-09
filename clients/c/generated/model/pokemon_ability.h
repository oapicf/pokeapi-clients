/*
 * pokemon_ability.h
 *
 * 
 */

#ifndef _pokemon_ability_H_
#define _pokemon_ability_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_ability_t pokemon_ability_t;

#include "ability_summary.h"



typedef struct pokemon_ability_t {
    int *is_hidden; //boolean
    int *slot; //numeric
    struct ability_summary_t *ability; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_ability_t;

__attribute__((deprecated)) pokemon_ability_t *pokemon_ability_create(
    int *is_hidden,
    int *slot,
    ability_summary_t *ability
);

void pokemon_ability_free(pokemon_ability_t *pokemon_ability);

pokemon_ability_t *pokemon_ability_parseFromJSON(cJSON *pokemon_abilityJSON);

cJSON *pokemon_ability_convertToJSON(pokemon_ability_t *pokemon_ability);

#endif /* _pokemon_ability_H_ */

