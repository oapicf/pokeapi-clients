/*
 * pokemon_stat.h
 *
 * 
 */

#ifndef _pokemon_stat_H_
#define _pokemon_stat_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_stat_t pokemon_stat_t;

#include "stat_summary.h"



typedef struct pokemon_stat_t {
    int base_stat; //numeric
    int effort; //numeric
    struct stat_summary_t *stat; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_stat_t;

__attribute__((deprecated)) pokemon_stat_t *pokemon_stat_create(
    int base_stat,
    int effort,
    stat_summary_t *stat
);

void pokemon_stat_free(pokemon_stat_t *pokemon_stat);

pokemon_stat_t *pokemon_stat_parseFromJSON(cJSON *pokemon_statJSON);

cJSON *pokemon_stat_convertToJSON(pokemon_stat_t *pokemon_stat);

#endif /* _pokemon_stat_H_ */

