/*
 * ability_flavor_text.h
 *
 * 
 */

#ifndef _ability_flavor_text_H_
#define _ability_flavor_text_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ability_flavor_text_t ability_flavor_text_t;

#include "language_summary.h"
#include "version_group_summary.h"



typedef struct ability_flavor_text_t {
    char *flavor_text; // string
    struct language_summary_t *language; //model
    struct version_group_summary_t *version_group; //model

    int _library_owned; // Is the library responsible for freeing this object?
} ability_flavor_text_t;

__attribute__((deprecated)) ability_flavor_text_t *ability_flavor_text_create(
    char *flavor_text,
    language_summary_t *language,
    version_group_summary_t *version_group
);

void ability_flavor_text_free(ability_flavor_text_t *ability_flavor_text);

ability_flavor_text_t *ability_flavor_text_parseFromJSON(cJSON *ability_flavor_textJSON);

cJSON *ability_flavor_text_convertToJSON(ability_flavor_text_t *ability_flavor_text);

#endif /* _ability_flavor_text_H_ */

