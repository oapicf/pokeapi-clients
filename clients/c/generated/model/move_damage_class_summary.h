/*
 * move_damage_class_summary.h
 *
 * 
 */

#ifndef _move_damage_class_summary_H_
#define _move_damage_class_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct move_damage_class_summary_t move_damage_class_summary_t;




typedef struct move_damage_class_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} move_damage_class_summary_t;

__attribute__((deprecated)) move_damage_class_summary_t *move_damage_class_summary_create(
    char *name,
    char *url
);

void move_damage_class_summary_free(move_damage_class_summary_t *move_damage_class_summary);

move_damage_class_summary_t *move_damage_class_summary_parseFromJSON(cJSON *move_damage_class_summaryJSON);

cJSON *move_damage_class_summary_convertToJSON(move_damage_class_summary_t *move_damage_class_summary);

#endif /* _move_damage_class_summary_H_ */

