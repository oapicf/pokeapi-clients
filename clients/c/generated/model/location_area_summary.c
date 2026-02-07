#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "location_area_summary.h"



static location_area_summary_t *location_area_summary_create_internal(
    char *name,
    char *url
    ) {
    location_area_summary_t *location_area_summary_local_var = malloc(sizeof(location_area_summary_t));
    if (!location_area_summary_local_var) {
        return NULL;
    }
    location_area_summary_local_var->name = name;
    location_area_summary_local_var->url = url;

    location_area_summary_local_var->_library_owned = 1;
    return location_area_summary_local_var;
}

__attribute__((deprecated)) location_area_summary_t *location_area_summary_create(
    char *name,
    char *url
    ) {
    return location_area_summary_create_internal (
        name,
        url
        );
}

void location_area_summary_free(location_area_summary_t *location_area_summary) {
    if(NULL == location_area_summary){
        return ;
    }
    if(location_area_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "location_area_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (location_area_summary->name) {
        free(location_area_summary->name);
        location_area_summary->name = NULL;
    }
    if (location_area_summary->url) {
        free(location_area_summary->url);
        location_area_summary->url = NULL;
    }
    free(location_area_summary);
}

cJSON *location_area_summary_convertToJSON(location_area_summary_t *location_area_summary) {
    cJSON *item = cJSON_CreateObject();

    // location_area_summary->name
    if (!location_area_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", location_area_summary->name) == NULL) {
    goto fail; //String
    }


    // location_area_summary->url
    if (!location_area_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", location_area_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

location_area_summary_t *location_area_summary_parseFromJSON(cJSON *location_area_summaryJSON){

    location_area_summary_t *location_area_summary_local_var = NULL;

    // location_area_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(location_area_summaryJSON, "name");
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

    // location_area_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(location_area_summaryJSON, "url");
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


    location_area_summary_local_var = location_area_summary_create_internal (
        strdup(name->valuestring),
        strdup(url->valuestring)
        );

    return location_area_summary_local_var;
end:
    return NULL;

}
