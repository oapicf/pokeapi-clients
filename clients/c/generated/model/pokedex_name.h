/*
 * pokedex_name.h
 *
 * 
 */

#ifndef _pokedex_name_H_
#define _pokedex_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokedex_name_t pokedex_name_t;

#include "language_summary.h"



typedef struct pokedex_name_t {
    char *name; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pokedex_name_t;

__attribute__((deprecated)) pokedex_name_t *pokedex_name_create(
    char *name,
    language_summary_t *language
);

void pokedex_name_free(pokedex_name_t *pokedex_name);

pokedex_name_t *pokedex_name_parseFromJSON(cJSON *pokedex_nameJSON);

cJSON *pokedex_name_convertToJSON(pokedex_name_t *pokedex_name);

#endif /* _pokedex_name_H_ */

