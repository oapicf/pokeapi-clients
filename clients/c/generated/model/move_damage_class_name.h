/*
 * move_damage_class_name.h
 *
 * 
 */

#ifndef _move_damage_class_name_H_
#define _move_damage_class_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct move_damage_class_name_t move_damage_class_name_t;

#include "language_summary.h"



typedef struct move_damage_class_name_t {
    char *name; // string
    struct language_summary_t *language; //model

    int _library_owned; // Is the library responsible for freeing this object?
} move_damage_class_name_t;

__attribute__((deprecated)) move_damage_class_name_t *move_damage_class_name_create(
    char *name,
    language_summary_t *language
);

void move_damage_class_name_free(move_damage_class_name_t *move_damage_class_name);

move_damage_class_name_t *move_damage_class_name_parseFromJSON(cJSON *move_damage_class_nameJSON);

cJSON *move_damage_class_name_convertToJSON(move_damage_class_name_t *move_damage_class_name);

#endif /* _move_damage_class_name_H_ */

