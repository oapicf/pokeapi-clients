#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pal_park_area_summary.h"



static pal_park_area_summary_t *pal_park_area_summary_create_internal(
    char *name,
    char *url
    ) {
    pal_park_area_summary_t *pal_park_area_summary_local_var = malloc(sizeof(pal_park_area_summary_t));
    if (!pal_park_area_summary_local_var) {
        return NULL;
    }
    pal_park_area_summary_local_var->name = name;
    pal_park_area_summary_local_var->url = url;

    pal_park_area_summary_local_var->_library_owned = 1;
    return pal_park_area_summary_local_var;
}

__attribute__((deprecated)) pal_park_area_summary_t *pal_park_area_summary_create(
    char *name,
    char *url
    ) {
    return pal_park_area_summary_create_internal (
        name,
        url
        );
}

void pal_park_area_summary_free(pal_park_area_summary_t *pal_park_area_summary) {
    if(NULL == pal_park_area_summary){
        return ;
    }
    if(pal_park_area_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pal_park_area_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pal_park_area_summary->name) {
        free(pal_park_area_summary->name);
        pal_park_area_summary->name = NULL;
    }
    if (pal_park_area_summary->url) {
        free(pal_park_area_summary->url);
        pal_park_area_summary->url = NULL;
    }
    free(pal_park_area_summary);
}

cJSON *pal_park_area_summary_convertToJSON(pal_park_area_summary_t *pal_park_area_summary) {
    cJSON *item = cJSON_CreateObject();

    // pal_park_area_summary->name
    if (!pal_park_area_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", pal_park_area_summary->name) == NULL) {
    goto fail; //String
    }


    // pal_park_area_summary->url
    if (!pal_park_area_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", pal_park_area_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pal_park_area_summary_t *pal_park_area_summary_parseFromJSON(cJSON *pal_park_area_summaryJSON){

    pal_park_area_summary_t *pal_park_area_summary_local_var = NULL;

    // pal_park_area_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(pal_park_area_summaryJSON, "name");
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

    // pal_park_area_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(pal_park_area_summaryJSON, "url");
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


    pal_park_area_summary_local_var = pal_park_area_summary_create_internal (
        strdup(name->valuestring),
        strdup(url->valuestring)
        );

    return pal_park_area_summary_local_var;
end:
    return NULL;

}
