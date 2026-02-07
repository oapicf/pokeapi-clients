/*
 * move_learn_method_summary.h
 *
 * 
 */

#ifndef _move_learn_method_summary_H_
#define _move_learn_method_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct move_learn_method_summary_t move_learn_method_summary_t;




typedef struct move_learn_method_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} move_learn_method_summary_t;

__attribute__((deprecated)) move_learn_method_summary_t *move_learn_method_summary_create(
    char *name,
    char *url
);

void move_learn_method_summary_free(move_learn_method_summary_t *move_learn_method_summary);

move_learn_method_summary_t *move_learn_method_summary_parseFromJSON(cJSON *move_learn_method_summaryJSON);

cJSON *move_learn_method_summary_convertToJSON(move_learn_method_summary_t *move_learn_method_summary);

#endif /* _move_learn_method_summary_H_ */

