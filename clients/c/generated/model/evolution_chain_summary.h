/*
 * evolution_chain_summary.h
 *
 * 
 */

#ifndef _evolution_chain_summary_H_
#define _evolution_chain_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct evolution_chain_summary_t evolution_chain_summary_t;




typedef struct evolution_chain_summary_t {
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} evolution_chain_summary_t;

__attribute__((deprecated)) evolution_chain_summary_t *evolution_chain_summary_create(
    char *url
);

void evolution_chain_summary_free(evolution_chain_summary_t *evolution_chain_summary);

evolution_chain_summary_t *evolution_chain_summary_parseFromJSON(cJSON *evolution_chain_summaryJSON);

cJSON *evolution_chain_summary_convertToJSON(evolution_chain_summary_t *evolution_chain_summary);

#endif /* _evolution_chain_summary_H_ */

