/*
 * model_type_name.h
 *
 * 
 */

#ifndef _ModelTypeName_H_
#define _ModelTypeName_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ModelTypeName_t ModelTypeName_t;

#include "language_summary.h"



typedef struct ModelTypeName_t {
    char *name; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} ModelTypeName_t;

__attribute__((deprecated)) ModelTypeName_t *ModelTypeName_create(
    char *name,
    language_summary_t *language
);

void ModelTypeName_free(ModelTypeName_t *ModelTypeName);

ModelTypeName_t *ModelTypeName_parseFromJSON(cJSON *ModelTypeNameJSON);

cJSON *ModelTypeName_convertToJSON(ModelTypeName_t *ModelTypeName);

#endif /* _ModelTypeName_H_ */

