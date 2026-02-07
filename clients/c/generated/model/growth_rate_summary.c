#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "growth_rate_summary.h"



static growth_rate_summary_t *growth_rate_summary_create_internal(
    char *name,
    char *url
    ) {
    growth_rate_summary_t *growth_rate_summary_local_var = malloc(sizeof(growth_rate_summary_t));
    if (!growth_rate_summary_local_var) {
        return NULL;
    }
    growth_rate_summary_local_var->name = name;
    growth_rate_summary_local_var->url = url;

    growth_rate_summary_local_var->_library_owned = 1;
    return growth_rate_summary_local_var;
}

__attribute__((deprecated)) growth_rate_summary_t *growth_rate_summary_create(
    char *name,
    char *url
    ) {
    return growth_rate_summary_create_internal (
        name,
        url
        );
}

void growth_rate_summary_free(growth_rate_summary_t *growth_rate_summary) {
    if(NULL == growth_rate_summary){
        return ;
    }
    if(growth_rate_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "growth_rate_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (growth_rate_summary->name) {
        free(growth_rate_summary->name);
        growth_rate_summary->name = NULL;
    }
    if (growth_rate_summary->url) {
        free(growth_rate_summary->url);
        growth_rate_summary->url = NULL;
    }
    free(growth_rate_summary);
}

cJSON *growth_rate_summary_convertToJSON(growth_rate_summary_t *growth_rate_summary) {
    cJSON *item = cJSON_CreateObject();

    // growth_rate_summary->name
    if (!growth_rate_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", growth_rate_summary->name) == NULL) {
    goto fail; //String
    }


    // growth_rate_summary->url
    if (!growth_rate_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", growth_rate_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

growth_rate_summary_t *growth_rate_summary_parseFromJSON(cJSON *growth_rate_summaryJSON){

    growth_rate_summary_t *growth_rate_summary_local_var = NULL;

    // growth_rate_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(growth_rate_summaryJSON, "name");
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

    // growth_rate_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(growth_rate_summaryJSON, "url");
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


    growth_rate_summary_local_var = growth_rate_summary_create_internal (
        strdup(name->valuestring),
        strdup(url->valuestring)
        );

    return growth_rate_summary_local_var;
end:
    return NULL;

}
