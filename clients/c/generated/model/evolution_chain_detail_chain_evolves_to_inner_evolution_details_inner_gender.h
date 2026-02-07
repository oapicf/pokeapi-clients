/*
 * evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender.h
 *
 * 
 */

#ifndef _evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_H_
#define _evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t;




typedef struct evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t;

__attribute__((deprecated)) evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_create(
    char *name,
    char *url
);

void evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_free(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender);

evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_parseFromJSON(cJSON *evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_genderJSON);

cJSON *evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_convertToJSON(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender);

#endif /* _evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_H_ */

