/*
 * evolution_chain_detail.h
 *
 * 
 */

#ifndef _evolution_chain_detail_H_
#define _evolution_chain_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct evolution_chain_detail_t evolution_chain_detail_t;

#include "evolution_chain_detail_chain.h"
#include "item_summary.h"



typedef struct evolution_chain_detail_t {
    int id; //numeric
    struct item_summary_t *baby_trigger_item; //model
    struct evolution_chain_detail_chain_t *chain; //model

    int _library_owned; // Is the library responsible for freeing this object?
} evolution_chain_detail_t;

__attribute__((deprecated)) evolution_chain_detail_t *evolution_chain_detail_create(
    int id,
    item_summary_t *baby_trigger_item,
    evolution_chain_detail_chain_t *chain
);

void evolution_chain_detail_free(evolution_chain_detail_t *evolution_chain_detail);

evolution_chain_detail_t *evolution_chain_detail_parseFromJSON(cJSON *evolution_chain_detailJSON);

cJSON *evolution_chain_detail_convertToJSON(evolution_chain_detail_t *evolution_chain_detail);

#endif /* _evolution_chain_detail_H_ */

