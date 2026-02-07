/*
 * evolution_trigger_detail.h
 *
 * 
 */

#ifndef _evolution_trigger_detail_H_
#define _evolution_trigger_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct evolution_trigger_detail_t evolution_trigger_detail_t;

#include "ability_detail_pokemon_inner_pokemon.h"
#include "evolution_trigger_name.h"



typedef struct evolution_trigger_detail_t {
    int id; //numeric
    char *name; // string
    list_t *names; //nonprimitive container
    list_t *pokemon_species; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} evolution_trigger_detail_t;

__attribute__((deprecated)) evolution_trigger_detail_t *evolution_trigger_detail_create(
    int id,
    char *name,
    list_t *names,
    list_t *pokemon_species
);

void evolution_trigger_detail_free(evolution_trigger_detail_t *evolution_trigger_detail);

evolution_trigger_detail_t *evolution_trigger_detail_parseFromJSON(cJSON *evolution_trigger_detailJSON);

cJSON *evolution_trigger_detail_convertToJSON(evolution_trigger_detail_t *evolution_trigger_detail);

#endif /* _evolution_trigger_detail_H_ */

