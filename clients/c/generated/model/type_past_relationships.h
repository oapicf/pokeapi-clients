/*
 * type_past_relationships.h
 *
 * 
 */

#ifndef _type_past_relationships_H_
#define _type_past_relationships_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct type_past_relationships_t type_past_relationships_t;

#include "generation_summary.h"
#include "type_relationships.h"



typedef struct type_past_relationships_t {
    struct generation_summary_t *generation; //model
    struct type_relationships_t *damage_relations; //model

    int _library_owned; // Is the library responsible for freeing this object?
} type_past_relationships_t;

__attribute__((deprecated)) type_past_relationships_t *type_past_relationships_create(
    generation_summary_t *generation,
    type_relationships_t *damage_relations
);

void type_past_relationships_free(type_past_relationships_t *type_past_relationships);

type_past_relationships_t *type_past_relationships_parseFromJSON(cJSON *type_past_relationshipsJSON);

cJSON *type_past_relationships_convertToJSON(type_past_relationships_t *type_past_relationships);

#endif /* _type_past_relationships_H_ */

