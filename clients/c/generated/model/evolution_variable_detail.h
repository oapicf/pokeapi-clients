/*
 * evolution_variable_detail.h
 *
 * 
 */

#ifndef _evolution_variable_detail_H_
#define _evolution_variable_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct evolution_variable_detail_t evolution_variable_detail_t;

#include "evolution_variable_description.h"
#include "evolution_variable_name.h"
#include "version_group_summary.h"



typedef struct evolution_variable_detail_t {
    int *id; //numeric
    char *name; // string
    char *symbol; // string
    char *data_type; // string
    char *source; // string
    struct version_group_summary_t *version_group; //model
    list_t *names; //nonprimitive container
    list_t *descriptions; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} evolution_variable_detail_t;

__attribute__((deprecated)) evolution_variable_detail_t *evolution_variable_detail_create(
    int *id,
    char *name,
    char *symbol,
    char *data_type,
    char *source,
    version_group_summary_t *version_group,
    list_t *names,
    list_t *descriptions
);

void evolution_variable_detail_free(evolution_variable_detail_t *evolution_variable_detail);

evolution_variable_detail_t *evolution_variable_detail_parseFromJSON(cJSON *evolution_variable_detailJSON);

cJSON *evolution_variable_detail_convertToJSON(evolution_variable_detail_t *evolution_variable_detail);

#endif /* _evolution_variable_detail_H_ */

