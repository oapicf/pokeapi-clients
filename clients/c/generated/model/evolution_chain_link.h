/*
 * evolution_chain_link.h
 *
 * 
 */

#ifndef _evolution_chain_link_H_
#define _evolution_chain_link_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct evolution_chain_link_t evolution_chain_link_t;

#include "pokemon_evolution.h"
#include "pokemon_species_summary.h"



typedef struct evolution_chain_link_t {
    int *is_baby; //boolean
    struct pokemon_species_summary_t *species; //model
    list_t *evolution_details; //nonprimitive container
    list_t *evolves_to; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} evolution_chain_link_t;

__attribute__((deprecated)) evolution_chain_link_t *evolution_chain_link_create(
    int *is_baby,
    pokemon_species_summary_t *species,
    list_t *evolution_details,
    list_t *evolves_to
);

void evolution_chain_link_free(evolution_chain_link_t *evolution_chain_link);

evolution_chain_link_t *evolution_chain_link_parseFromJSON(cJSON *evolution_chain_linkJSON);

cJSON *evolution_chain_link_convertToJSON(evolution_chain_link_t *evolution_chain_link);

#endif /* _evolution_chain_link_H_ */

