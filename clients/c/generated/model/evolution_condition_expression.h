/*
 * evolution_condition_expression.h
 *
 * 
 */

#ifndef _evolution_condition_expression_H_
#define _evolution_condition_expression_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct evolution_condition_expression_t evolution_condition_expression_t;

#include "evolution_variable_summary.h"



typedef struct evolution_condition_expression_t {
    char *expression; // string
    double *percentage_chance; //numeric
    list_t *variables; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} evolution_condition_expression_t;

__attribute__((deprecated)) evolution_condition_expression_t *evolution_condition_expression_create(
    char *expression,
    double *percentage_chance,
    list_t *variables
);

void evolution_condition_expression_free(evolution_condition_expression_t *evolution_condition_expression);

evolution_condition_expression_t *evolution_condition_expression_parseFromJSON(cJSON *evolution_condition_expressionJSON);

cJSON *evolution_condition_expression_convertToJSON(evolution_condition_expression_t *evolution_condition_expression);

#endif /* _evolution_condition_expression_H_ */

