#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "region_summary.h"



static region_summary_t *region_summary_create_internal(
    char *name,
    char *url
    ) {
    region_summary_t *region_summary_local_var = malloc(sizeof(region_summary_t));
    if (!region_summary_local_var) {
        return NULL;
    }
    region_summary_local_var->name = name;
    region_summary_local_var->url = url;

    region_summary_local_var->_library_owned = 1;
    return region_summary_local_var;
}

__attribute__((deprecated)) region_summary_t *region_summary_create(
    char *name,
    char *url
    ) {
    return region_summary_create_internal (
        name,
        url
        );
}

void region_summary_free(region_summary_t *region_summary) {
    if(NULL == region_summary){
        return ;
    }
    if(region_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "region_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (region_summary->name) {
        free(region_summary->name);
        region_summary->name = NULL;
    }
    if (region_summary->url) {
        free(region_summary->url);
        region_summary->url = NULL;
    }
    free(region_summary);
}

cJSON *region_summary_convertToJSON(region_summary_t *region_summary) {
    cJSON *item = cJSON_CreateObject();

    // region_summary->name
    if (!region_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", region_summary->name) == NULL) {
    goto fail; //String
    }


    // region_summary->url
    if (!region_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", region_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

region_summary_t *region_summary_parseFromJSON(cJSON *region_summaryJSON){

    region_summary_t *region_summary_local_var = NULL;

    // region_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(region_summaryJSON, "name");
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

    // region_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(region_summaryJSON, "url");
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


    region_summary_local_var = region_summary_create_internal (
        strdup(name->valuestring),
        strdup(url->valuestring)
        );

    return region_summary_local_var;
end:
    return NULL;

}
