/*
 * pokemon_form_trigger_condition.h
 *
 * 
 */

#ifndef _pokemon_form_trigger_condition_H_
#define _pokemon_form_trigger_condition_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_form_trigger_condition_t pokemon_form_trigger_condition_t;

#include "pokemon_form_summary.h"



typedef struct pokemon_form_trigger_condition_t {
    char *trigger; // string
    char *name; // string
    char *url; // string
    struct pokemon_form_summary_t *base_form; //model

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_form_trigger_condition_t;

__attribute__((deprecated)) pokemon_form_trigger_condition_t *pokemon_form_trigger_condition_create(
    char *trigger,
    char *name,
    char *url,
    pokemon_form_summary_t *base_form
);

void pokemon_form_trigger_condition_free(pokemon_form_trigger_condition_t *pokemon_form_trigger_condition);

pokemon_form_trigger_condition_t *pokemon_form_trigger_condition_parseFromJSON(cJSON *pokemon_form_trigger_conditionJSON);

cJSON *pokemon_form_trigger_condition_convertToJSON(pokemon_form_trigger_condition_t *pokemon_form_trigger_condition);

#endif /* _pokemon_form_trigger_condition_H_ */

