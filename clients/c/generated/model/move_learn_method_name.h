/*
 * move_learn_method_name.h
 *
 * 
 */

#ifndef _move_learn_method_name_H_
#define _move_learn_method_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct move_learn_method_name_t move_learn_method_name_t;

#include "language_summary.h"



typedef struct move_learn_method_name_t {
    char *name; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} move_learn_method_name_t;

__attribute__((deprecated)) move_learn_method_name_t *move_learn_method_name_create(
    char *name,
    language_summary_t *language
);

void move_learn_method_name_free(move_learn_method_name_t *move_learn_method_name);

move_learn_method_name_t *move_learn_method_name_parseFromJSON(cJSON *move_learn_method_nameJSON);

cJSON *move_learn_method_name_convertToJSON(move_learn_method_name_t *move_learn_method_name);

#endif /* _move_learn_method_name_H_ */

