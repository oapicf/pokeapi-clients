/*
 * pokedex_summary.h
 *
 * 
 */

#ifndef _pokedex_summary_H_
#define _pokedex_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokedex_summary_t pokedex_summary_t;




typedef struct pokedex_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} pokedex_summary_t;

__attribute__((deprecated)) pokedex_summary_t *pokedex_summary_create(
    char *name,
    char *url
);

void pokedex_summary_free(pokedex_summary_t *pokedex_summary);

pokedex_summary_t *pokedex_summary_parseFromJSON(cJSON *pokedex_summaryJSON);

cJSON *pokedex_summary_convertToJSON(pokedex_summary_t *pokedex_summary);

#endif /* _pokedex_summary_H_ */

