#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "location_summary.h"



static location_summary_t *location_summary_create_internal(
    char *name,
    char *url
    ) {
    location_summary_t *location_summary_local_var = malloc(sizeof(location_summary_t));
    if (!location_summary_local_var) {
        return NULL;
    }
    location_summary_local_var->name = name;
    location_summary_local_var->url = url;

    location_summary_local_var->_library_owned = 1;
    return location_summary_local_var;
}

__attribute__((deprecated)) location_summary_t *location_summary_create(
    char *name,
    char *url
    ) {
    return location_summary_create_internal (
        name,
        url
        );
}

void location_summary_free(location_summary_t *location_summary) {
    if(NULL == location_summary){
        return ;
    }
    if(location_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "location_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (location_summary->name) {
        free(location_summary->name);
        location_summary->name = NULL;
    }
    if (location_summary->url) {
        free(location_summary->url);
        location_summary->url = NULL;
    }
    free(location_summary);
}

cJSON *location_summary_convertToJSON(location_summary_t *location_summary) {
    cJSON *item = cJSON_CreateObject();

    // location_summary->name
    if (!location_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", location_summary->name) == NULL) {
    goto fail; //String
    }


    // location_summary->url
    if (!location_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", location_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

location_summary_t *location_summary_parseFromJSON(cJSON *location_summaryJSON){

    location_summary_t *location_summary_local_var = NULL;

    // location_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(location_summaryJSON, "name");
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

    // location_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(location_summaryJSON, "url");
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


    location_summary_local_var = location_summary_create_internal (
        strdup(name->valuestring),
        strdup(url->valuestring)
        );

    return location_summary_local_var;
end:
    return NULL;

}
