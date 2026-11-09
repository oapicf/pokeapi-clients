/*
 * pokemon_move_version_group.h
 *
 * 
 */

#ifndef _pokemon_move_version_group_H_
#define _pokemon_move_version_group_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_move_version_group_t pokemon_move_version_group_t;

#include "move_learn_method_summary.h"
#include "version_group_summary.h"



typedef struct pokemon_move_version_group_t {
    int *level_learned_at; //numeric
    struct move_learn_method_summary_t *move_learn_method; //model
    struct version_group_summary_t *version_group; //model
    int *order; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_move_version_group_t;

__attribute__((deprecated)) pokemon_move_version_group_t *pokemon_move_version_group_create(
    int *level_learned_at,
    move_learn_method_summary_t *move_learn_method,
    version_group_summary_t *version_group,
    int *order
);

void pokemon_move_version_group_free(pokemon_move_version_group_t *pokemon_move_version_group);

pokemon_move_version_group_t *pokemon_move_version_group_parseFromJSON(cJSON *pokemon_move_version_groupJSON);

cJSON *pokemon_move_version_group_convertToJSON(pokemon_move_version_group_t *pokemon_move_version_group);

#endif /* _pokemon_move_version_group_H_ */

