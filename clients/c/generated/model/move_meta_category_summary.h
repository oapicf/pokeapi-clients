/*
 * move_meta_category_summary.h
 *
 * 
 */

#ifndef _move_meta_category_summary_H_
#define _move_meta_category_summary_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct move_meta_category_summary_t move_meta_category_summary_t;




typedef struct move_meta_category_summary_t {
    char *name; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} move_meta_category_summary_t;

__attribute__((deprecated)) move_meta_category_summary_t *move_meta_category_summary_create(
    char *name,
    char *url
);

void move_meta_category_summary_free(move_meta_category_summary_t *move_meta_category_summary);

move_meta_category_summary_t *move_meta_category_summary_parseFromJSON(cJSON *move_meta_category_summaryJSON);

cJSON *move_meta_category_summary_convertToJSON(move_meta_category_summary_t *move_meta_category_summary);

#endif /* _move_meta_category_summary_H_ */

