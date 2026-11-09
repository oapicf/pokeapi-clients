/*
 * pokemon_evolution_known_move.h
 *
 * 
 */

#ifndef _pokemon_evolution_known_move_H_
#define _pokemon_evolution_known_move_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pokemon_evolution_known_move_t pokemon_evolution_known_move_t;




typedef struct pokemon_evolution_known_move_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} pokemon_evolution_known_move_t;

__attribute__((deprecated)) pokemon_evolution_known_move_t *pokemon_evolution_known_move_create(
    char *name,
    char *url
);

void pokemon_evolution_known_move_free(pokemon_evolution_known_move_t *pokemon_evolution_known_move);

pokemon_evolution_known_move_t *pokemon_evolution_known_move_parseFromJSON(cJSON *pokemon_evolution_known_moveJSON);

cJSON *pokemon_evolution_known_move_convertToJSON(pokemon_evolution_known_move_t *pokemon_evolution_known_move);

#endif /* _pokemon_evolution_known_move_H_ */

