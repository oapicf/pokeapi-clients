/*
 * pokemon_form_flavor_text.h
 *
 * 
 */

#ifndef _pokemon_form_flavor_text_H_
#define _pokemon_form_flavor_text_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_form_flavor_text_t pokemon_form_flavor_text_t;

#include "language_summary.h"
#include "version_summary.h"



typedef struct pokemon_form_flavor_text_t {
    char *flavor_text; // string
    struct language_summary_t *language; //model
    struct version_summary_t *version; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_form_flavor_text_t;

__attribute__((deprecated)) pokemon_form_flavor_text_t *pokemon_form_flavor_text_create(
    char *flavor_text,
    language_summary_t *language,
    version_summary_t *version
);

void pokemon_form_flavor_text_free(pokemon_form_flavor_text_t *pokemon_form_flavor_text);

pokemon_form_flavor_text_t *pokemon_form_flavor_text_parseFromJSON(cJSON *pokemon_form_flavor_textJSON);

cJSON *pokemon_form_flavor_text_convertToJSON(pokemon_form_flavor_text_t *pokemon_form_flavor_text);

#endif /* _pokemon_form_flavor_text_H_ */

