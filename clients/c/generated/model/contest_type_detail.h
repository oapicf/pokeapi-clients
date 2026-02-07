/*
 * contest_type_detail.h
 *
 * 
 */

#ifndef _contest_type_detail_H_
#define _contest_type_detail_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct contest_type_detail_t contest_type_detail_t;

#include "berry_flavor_summary.h"
#include "contest_type_name.h"



typedef struct contest_type_detail_t {
    int id; //numeric
    char *name; // string
    struct berry_flavor_summary_t *berry_flavor; //model
    list_t *names; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} contest_type_detail_t;

__attribute__((deprecated)) contest_type_detail_t *contest_type_detail_create(
    int id,
    char *name,
    berry_flavor_summary_t *berry_flavor,
    list_t *names
);

void contest_type_detail_free(contest_type_detail_t *contest_type_detail);

contest_type_detail_t *contest_type_detail_parseFromJSON(cJSON *contest_type_detailJSON);

cJSON *contest_type_detail_convertToJSON(contest_type_detail_t *contest_type_detail);

#endif /* _contest_type_detail_H_ */

