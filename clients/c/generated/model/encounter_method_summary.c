#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "encounter_method_summary.h"



static encounter_method_summary_t *encounter_method_summary_create_internal(
    char *name,
    char *url
    ) {
    encounter_method_summary_t *encounter_method_summary_local_var = malloc(sizeof(encounter_method_summary_t));
    if (!encounter_method_summary_local_var) {
        return NULL;
    }
    encounter_method_summary_local_var->name = name;
    encounter_method_summary_local_var->url = url;

    encounter_method_summary_local_var->_library_owned = 1;
    return encounter_method_summary_local_var;
}

__attribute__((deprecated)) encounter_method_summary_t *encounter_method_summary_create(
    char *name,
    char *url
    ) {
    return encounter_method_summary_create_internal (
        name,
        url
        );
}

void encounter_method_summary_free(encounter_method_summary_t *encounter_method_summary) {
    if(NULL == encounter_method_summary){
        return ;
    }
    if(encounter_method_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "encounter_method_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (encounter_method_summary->name) {
        free(encounter_method_summary->name);
        encounter_method_summary->name = NULL;
    }
    if (encounter_method_summary->url) {
        free(encounter_method_summary->url);
        encounter_method_summary->url = NULL;
    }
    free(encounter_method_summary);
}

cJSON *encounter_method_summary_convertToJSON(encounter_method_summary_t *encounter_method_summary) {
    cJSON *item = cJSON_CreateObject();

    // encounter_method_summary->name
    if (!encounter_method_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", encounter_method_summary->name) == NULL) {
    goto fail; //String
    }


    // encounter_method_summary->url
    if (!encounter_method_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", encounter_method_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

encounter_method_summary_t *encounter_method_summary_parseFromJSON(cJSON *encounter_method_summaryJSON){

    encounter_method_summary_t *encounter_method_summary_local_var = NULL;

    // encounter_method_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(encounter_method_summaryJSON, "name");
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

    // encounter_method_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(encounter_method_summaryJSON, "url");
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


    encounter_method_summary_local_var = encounter_method_summary_create_internal (
        strdup(name->valuestring),
        strdup(url->valuestring)
        );

    return encounter_method_summary_local_var;
end:
    return NULL;

}
