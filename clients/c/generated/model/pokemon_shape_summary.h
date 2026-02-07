/*
 * pokemon_shape_summary.h
 *
 * 
 */

#ifndef _pokemon_shape_summary_H_
#define _pokemon_shape_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_shape_summary_t pokemon_shape_summary_t;




typedef struct pokemon_shape_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_shape_summary_t;

__attribute__((deprecated)) pokemon_shape_summary_t *pokemon_shape_summary_create(
    char *name,
    char *url
);

void pokemon_shape_summary_free(pokemon_shape_summary_t *pokemon_shape_summary);

pokemon_shape_summary_t *pokemon_shape_summary_parseFromJSON(cJSON *pokemon_shape_summaryJSON);

cJSON *pokemon_shape_summary_convertToJSON(pokemon_shape_summary_t *pokemon_shape_summary);

#endif /* _pokemon_shape_summary_H_ */

