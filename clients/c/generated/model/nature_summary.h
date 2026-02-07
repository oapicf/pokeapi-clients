/*
 * nature_summary.h
 *
 * 
 */

#ifndef _nature_summary_H_
#define _nature_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct nature_summary_t nature_summary_t;




typedef struct nature_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} nature_summary_t;

__attribute__((deprecated)) nature_summary_t *nature_summary_create(
    char *name,
    char *url
);

void nature_summary_free(nature_summary_t *nature_summary);

nature_summary_t *nature_summary_parseFromJSON(cJSON *nature_summaryJSON);

cJSON *nature_summary_convertToJSON(nature_summary_t *nature_summary);

#endif /* _nature_summary_H_ */

