/*
 * pokemon_past_stat.h
 *
 * 
 */

#ifndef _pokemon_past_stat_H_
#define _pokemon_past_stat_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_past_stat_t pokemon_past_stat_t;

#include "generation_summary.h"
#include "pokemon_stat.h"



typedef struct pokemon_past_stat_t {
    struct generation_summary_t *generation; //model
    list_t *stats; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_past_stat_t;

__attribute__((deprecated)) pokemon_past_stat_t *pokemon_past_stat_create(
    generation_summary_t *generation,
    list_t *stats
);

void pokemon_past_stat_free(pokemon_past_stat_t *pokemon_past_stat);

pokemon_past_stat_t *pokemon_past_stat_parseFromJSON(cJSON *pokemon_past_statJSON);

cJSON *pokemon_past_stat_convertToJSON(pokemon_past_stat_t *pokemon_past_stat);

#endif /* _pokemon_past_stat_H_ */

