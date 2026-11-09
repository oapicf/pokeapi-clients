/*
 * pokemon_past_ability.h
 *
 * 
 */

#ifndef _pokemon_past_ability_H_
#define _pokemon_past_ability_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_past_ability_t pokemon_past_ability_t;

#include "generation_summary.h"
#include "pokemon_ability_past.h"



typedef struct pokemon_past_ability_t {
    list_t *abilities; //nonprimitive container
    struct generation_summary_t *generation; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_past_ability_t;

__attribute__((deprecated)) pokemon_past_ability_t *pokemon_past_ability_create(
    list_t *abilities,
    generation_summary_t *generation
);

void pokemon_past_ability_free(pokemon_past_ability_t *pokemon_past_ability);

pokemon_past_ability_t *pokemon_past_ability_parseFromJSON(cJSON *pokemon_past_abilityJSON);

cJSON *pokemon_past_ability_convertToJSON(pokemon_past_ability_t *pokemon_past_ability);

#endif /* _pokemon_past_ability_H_ */

