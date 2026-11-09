/*
 * pokemon_shape_name.h
 *
 * 
 */

#ifndef _pokemon_shape_name_H_
#define _pokemon_shape_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_shape_name_t pokemon_shape_name_t;

#include "language_summary.h"



typedef struct pokemon_shape_name_t {
    char *name; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_shape_name_t;

__attribute__((deprecated)) pokemon_shape_name_t *pokemon_shape_name_create(
    char *name,
    language_summary_t *language
);

void pokemon_shape_name_free(pokemon_shape_name_t *pokemon_shape_name);

pokemon_shape_name_t *pokemon_shape_name_parseFromJSON(cJSON *pokemon_shape_nameJSON);

cJSON *pokemon_shape_name_convertToJSON(pokemon_shape_name_t *pokemon_shape_name);

#endif /* _pokemon_shape_name_H_ */

