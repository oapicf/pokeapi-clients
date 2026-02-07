/*
 * pokemon_shape_detail_names_inner.h
 *
 * 
 */

#ifndef _pokemon_shape_detail_names_inner_H_
#define _pokemon_shape_detail_names_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_shape_detail_names_inner_t pokemon_shape_detail_names_inner_t;




typedef struct pokemon_shape_detail_names_inner_t {
    char *url; // string
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_shape_detail_names_inner_t;

__attribute__((deprecated)) pokemon_shape_detail_names_inner_t *pokemon_shape_detail_names_inner_create(
    char *url,
    char *name
);

void pokemon_shape_detail_names_inner_free(pokemon_shape_detail_names_inner_t *pokemon_shape_detail_names_inner);

pokemon_shape_detail_names_inner_t *pokemon_shape_detail_names_inner_parseFromJSON(cJSON *pokemon_shape_detail_names_innerJSON);

cJSON *pokemon_shape_detail_names_inner_convertToJSON(pokemon_shape_detail_names_inner_t *pokemon_shape_detail_names_inner);

#endif /* _pokemon_shape_detail_names_inner_H_ */

