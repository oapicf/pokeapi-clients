/*
 * pokemon_summary.h
 *
 * 
 */

#ifndef _pokemon_summary_H_
#define _pokemon_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_summary_t pokemon_summary_t;




typedef struct pokemon_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_summary_t;

__attribute__((deprecated)) pokemon_summary_t *pokemon_summary_create(
    char *name,
    char *url
);

void pokemon_summary_free(pokemon_summary_t *pokemon_summary);

pokemon_summary_t *pokemon_summary_parseFromJSON(cJSON *pokemon_summaryJSON);

cJSON *pokemon_summary_convertToJSON(pokemon_summary_t *pokemon_summary);

#endif /* _pokemon_summary_H_ */

