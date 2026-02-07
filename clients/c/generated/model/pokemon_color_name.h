/*
 * pokemon_color_name.h
 *
 * 
 */

#ifndef _pokemon_color_name_H_
#define _pokemon_color_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_color_name_t pokemon_color_name_t;

#include "language_summary.h"



typedef struct pokemon_color_name_t {
    char *name; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_color_name_t;

__attribute__((deprecated)) pokemon_color_name_t *pokemon_color_name_create(
    char *name,
    language_summary_t *language
);

void pokemon_color_name_free(pokemon_color_name_t *pokemon_color_name);

pokemon_color_name_t *pokemon_color_name_parseFromJSON(cJSON *pokemon_color_nameJSON);

cJSON *pokemon_color_name_convertToJSON(pokemon_color_name_t *pokemon_color_name);

#endif /* _pokemon_color_name_H_ */

