/*
 * egg_group_summary.h
 *
 * 
 */

#ifndef _egg_group_summary_H_
#define _egg_group_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct egg_group_summary_t egg_group_summary_t;




typedef struct egg_group_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} egg_group_summary_t;

__attribute__((deprecated)) egg_group_summary_t *egg_group_summary_create(
    char *name,
    char *url
);

void egg_group_summary_free(egg_group_summary_t *egg_group_summary);

egg_group_summary_t *egg_group_summary_parseFromJSON(cJSON *egg_group_summaryJSON);

cJSON *egg_group_summary_convertToJSON(egg_group_summary_t *egg_group_summary);

#endif /* _egg_group_summary_H_ */

