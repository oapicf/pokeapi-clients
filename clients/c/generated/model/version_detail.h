/*
 * version_detail.h
 *
 * Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I&#39;m not sure how to add anything other than a hyperlink
 */

#ifndef _version_detail_H_
#define _version_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct version_detail_t version_detail_t;

#include "version_group_summary.h"
#include "version_name.h"



typedef struct version_detail_t {
    int id; //numeric
    char *name; // string
    list_t *names; //nonprimitive container
    struct version_group_summary_t *version_group; //model

    int _library_owned; // Is the library responsible for freeing this object?
} version_detail_t;

__attribute__((deprecated)) version_detail_t *version_detail_create(
    int id,
    char *name,
    list_t *names,
    version_group_summary_t *version_group
);

void version_detail_free(version_detail_t *version_detail);

version_detail_t *version_detail_parseFromJSON(cJSON *version_detailJSON);

cJSON *version_detail_convertToJSON(version_detail_t *version_detail);

#endif /* _version_detail_H_ */

