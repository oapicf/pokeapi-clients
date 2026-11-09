/*
 * pokemon_encounter_detail_response.h
 *
 * 
 */

#ifndef _pokemon_encounter_detail_response_H_
#define _pokemon_encounter_detail_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_encounter_detail_response_t pokemon_encounter_detail_response_t;

#include "encounter_condition_value_summary.h"
#include "encounter_method_summary.h"



typedef struct pokemon_encounter_detail_response_t {
    int *chance; //numeric
    list_t *condition_values; //nonprimitive container
    int *max_level; //numeric
    struct encounter_method_summary_t *method; //model
    int *min_level; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_encounter_detail_response_t;

__attribute__((deprecated)) pokemon_encounter_detail_response_t *pokemon_encounter_detail_response_create(
    int *chance,
    list_t *condition_values,
    int *max_level,
    encounter_method_summary_t *method,
    int *min_level
);

void pokemon_encounter_detail_response_free(pokemon_encounter_detail_response_t *pokemon_encounter_detail_response);

pokemon_encounter_detail_response_t *pokemon_encounter_detail_response_parseFromJSON(cJSON *pokemon_encounter_detail_responseJSON);

cJSON *pokemon_encounter_detail_response_convertToJSON(pokemon_encounter_detail_response_t *pokemon_encounter_detail_response);

#endif /* _pokemon_encounter_detail_response_H_ */

