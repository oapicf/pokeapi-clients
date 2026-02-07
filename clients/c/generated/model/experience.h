/*
 * experience.h
 *
 * 
 */

#ifndef _experience_H_
#define _experience_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct experience_t experience_t;




typedef struct experience_t {
    int level; //numeric
    int experience; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} experience_t;

__attribute__((deprecated)) experience_t *experience_create(
    int level,
    int experience
);

void experience_free(experience_t *experience);

experience_t *experience_parseFromJSON(cJSON *experienceJSON);

cJSON *experience_convertToJSON(experience_t *experience);

#endif /* _experience_H_ */

