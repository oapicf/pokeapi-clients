#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "encounter_condition_value_summary.h"



static encounter_condition_value_summary_t *encounter_condition_value_summary_create_internal(
    char *name,
    char *url
    ) {
    encounter_condition_value_summary_t *encounter_condition_value_summary_local_var = malloc(sizeof(encounter_condition_value_summary_t));
    if (!encounter_condition_value_summary_local_var) {
        return NULL;
    }
    encounter_condition_value_summary_local_var->name = name;
    encounter_condition_value_summary_local_var->url = url;

    encounter_condition_value_summary_local_var->_library_owned = 1;
    return encounter_condition_value_summary_local_var;
}

__attribute__((deprecated)) encounter_condition_value_summary_t *encounter_condition_value_summary_create(
    char *name,
    char *url
    ) {
    return encounter_condition_value_summary_create_internal (
        name,
        url
        );
}

void encounter_condition_value_summary_free(encounter_condition_value_summary_t *encounter_condition_value_summary) {
    if(NULL == encounter_condition_value_summary){
        return ;
    }
    if(encounter_condition_value_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "encounter_condition_value_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (encounter_condition_value_summary->name) {
        free(encounter_condition_value_summary->name);
        encounter_condition_value_summary->name = NULL;
    }
    if (encounter_condition_value_summary->url) {
        free(encounter_condition_value_summary->url);
        encounter_condition_value_summary->url = NULL;
    }
    free(encounter_condition_value_summary);
}

cJSON *encounter_condition_value_summary_convertToJSON(encounter_condition_value_summary_t *encounter_condition_value_summary) {
    cJSON *item = cJSON_CreateObject();

    // encounter_condition_value_summary->name
    if (!encounter_condition_value_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", encounter_condition_value_summary->name) == NULL) {
    goto fail; //String
    }


    // encounter_condition_value_summary->url
    if (!encounter_condition_value_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", encounter_condition_value_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

encounter_condition_value_summary_t *encounter_condition_value_summary_parseFromJSON(cJSON *encounter_condition_value_summaryJSON){

    encounter_condition_value_summary_t *encounter_condition_value_summary_local_var = NULL;

    // encounter_condition_value_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(encounter_condition_value_summaryJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // encounter_condition_value_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(encounter_condition_value_summaryJSON, "url");
    if (cJSON_IsNull(url)) {
        url = NULL;
    }
    if (!url) {
        goto end;
    }

    
    if(!cJSON_IsString(url))
    {
    goto end; //String
    }


    encounter_condition_value_summary_local_var = encounter_condition_value_summary_create_internal (
        strdup(name->valuestring),
        strdup(url->valuestring)
        );

    return encounter_condition_value_summary_local_var;
end:
    return NULL;

}
