/*
 * pokemon_color_summary.h
 *
 * 
 */

#ifndef _pokemon_color_summary_H_
#define _pokemon_color_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_color_summary_t pokemon_color_summary_t;




typedef struct pokemon_color_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_color_summary_t;

__attribute__((deprecated)) pokemon_color_summary_t *pokemon_color_summary_create(
    char *name,
    char *url
);

void pokemon_color_summary_free(pokemon_color_summary_t *pokemon_color_summary);

pokemon_color_summary_t *pokemon_color_summary_parseFromJSON(cJSON *pokemon_color_summaryJSON);

cJSON *pokemon_color_summary_convertToJSON(pokemon_color_summary_t *pokemon_color_summary);

#endif /* _pokemon_color_summary_H_ */

