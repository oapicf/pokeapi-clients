/*
 * paginated_encounter_condition_summary_list.h
 *
 * 
 */

#ifndef _paginated_encounter_condition_summary_list_H_
#define _paginated_encounter_condition_summary_list_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct paginated_encounter_condition_summary_list_t paginated_encounter_condition_summary_list_t;

#include "encounter_condition_summary.h"



typedef struct paginated_encounter_condition_summary_list_t {
    int count; //numeric
    char *next; // string
    char *previous; // string
    list_t *results; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} paginated_encounter_condition_summary_list_t;

__attribute__((deprecated)) paginated_encounter_condition_summary_list_t *paginated_encounter_condition_summary_list_create(
    int count,
    char *next,
    char *previous,
    list_t *results
);

void paginated_encounter_condition_summary_list_free(paginated_encounter_condition_summary_list_t *paginated_encounter_condition_summary_list);

paginated_encounter_condition_summary_list_t *paginated_encounter_condition_summary_list_parseFromJSON(cJSON *paginated_encounter_condition_summary_listJSON);

cJSON *paginated_encounter_condition_summary_list_convertToJSON(paginated_encounter_condition_summary_list_t *paginated_encounter_condition_summary_list);

#endif /* _paginated_encounter_condition_summary_list_H_ */

