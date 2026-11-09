/*
 * pokemon_past_type.h
 *
 * 
 */

#ifndef _pokemon_past_type_H_
#define _pokemon_past_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_past_type_t pokemon_past_type_t;

#include "generation_summary.h"
#include "pokemon_type.h"



typedef struct pokemon_past_type_t {
    struct generation_summary_t *generation; //model
    list_t *types; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_past_type_t;

__attribute__((deprecated)) pokemon_past_type_t *pokemon_past_type_create(
    generation_summary_t *generation,
    list_t *types
);

void pokemon_past_type_free(pokemon_past_type_t *pokemon_past_type);

pokemon_past_type_t *pokemon_past_type_parseFromJSON(cJSON *pokemon_past_typeJSON);

cJSON *pokemon_past_type_convertToJSON(pokemon_past_type_t *pokemon_past_type);

#endif /* _pokemon_past_type_H_ */

