/*
 * pokeathlon_stat_name.h
 *
 * 
 */

#ifndef _pokeathlon_stat_name_H_
#define _pokeathlon_stat_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokeathlon_stat_name_t pokeathlon_stat_name_t;

#include "language_summary.h"



typedef struct pokeathlon_stat_name_t {
    char *name; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pokeathlon_stat_name_t;

__attribute__((deprecated)) pokeathlon_stat_name_t *pokeathlon_stat_name_create(
    char *name,
    language_summary_t *language
);

void pokeathlon_stat_name_free(pokeathlon_stat_name_t *pokeathlon_stat_name);

pokeathlon_stat_name_t *pokeathlon_stat_name_parseFromJSON(cJSON *pokeathlon_stat_nameJSON);

cJSON *pokeathlon_stat_name_convertToJSON(pokeathlon_stat_name_t *pokeathlon_stat_name);

#endif /* _pokeathlon_stat_name_H_ */

