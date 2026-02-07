/*
 * pokedex_description.h
 *
 * 
 */

#ifndef _pokedex_description_H_
#define _pokedex_description_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokedex_description_t pokedex_description_t;

#include "language_summary.h"



typedef struct pokedex_description_t {
    char *description; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pokedex_description_t;

__attribute__((deprecated)) pokedex_description_t *pokedex_description_create(
    char *description,
    language_summary_t *language
);

void pokedex_description_free(pokedex_description_t *pokedex_description);

pokedex_description_t *pokedex_description_parseFromJSON(cJSON *pokedex_descriptionJSON);

cJSON *pokedex_description_convertToJSON(pokedex_description_t *pokedex_description);

#endif /* _pokedex_description_H_ */

