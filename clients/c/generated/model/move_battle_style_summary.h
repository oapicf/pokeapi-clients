/*
 * move_battle_style_summary.h
 *
 * 
 */

#ifndef _move_battle_style_summary_H_
#define _move_battle_style_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct move_battle_style_summary_t move_battle_style_summary_t;




typedef struct move_battle_style_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} move_battle_style_summary_t;

__attribute__((deprecated)) move_battle_style_summary_t *move_battle_style_summary_create(
    char *name,
    char *url
);

void move_battle_style_summary_free(move_battle_style_summary_t *move_battle_style_summary);

move_battle_style_summary_t *move_battle_style_summary_parseFromJSON(cJSON *move_battle_style_summaryJSON);

cJSON *move_battle_style_summary_convertToJSON(move_battle_style_summary_t *move_battle_style_summary);

#endif /* _move_battle_style_summary_H_ */

