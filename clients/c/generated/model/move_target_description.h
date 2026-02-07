/*
 * move_target_description.h
 *
 * 
 */

#ifndef _move_target_description_H_
#define _move_target_description_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct move_target_description_t move_target_description_t;

#include "language_summary.h"



typedef struct move_target_description_t {
    char *description; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} move_target_description_t;

__attribute__((deprecated)) move_target_description_t *move_target_description_create(
    char *description,
    language_summary_t *language
);

void move_target_description_free(move_target_description_t *move_target_description);

move_target_description_t *move_target_description_parseFromJSON(cJSON *move_target_descriptionJSON);

cJSON *move_target_description_convertToJSON(move_target_description_t *move_target_description);

#endif /* _move_target_description_H_ */

