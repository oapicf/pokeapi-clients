/*
 * pokeathlon_stat_summary.h
 *
 * 
 */

#ifndef _pokeathlon_stat_summary_H_
#define _pokeathlon_stat_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokeathlon_stat_summary_t pokeathlon_stat_summary_t;




typedef struct pokeathlon_stat_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} pokeathlon_stat_summary_t;

__attribute__((deprecated)) pokeathlon_stat_summary_t *pokeathlon_stat_summary_create(
    char *name,
    char *url
);

void pokeathlon_stat_summary_free(pokeathlon_stat_summary_t *pokeathlon_stat_summary);

pokeathlon_stat_summary_t *pokeathlon_stat_summary_parseFromJSON(cJSON *pokeathlon_stat_summaryJSON);

cJSON *pokeathlon_stat_summary_convertToJSON(pokeathlon_stat_summary_t *pokeathlon_stat_summary);

#endif /* _pokeathlon_stat_summary_H_ */

