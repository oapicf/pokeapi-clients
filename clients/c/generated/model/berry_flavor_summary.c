#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "berry_flavor_summary.h"



static berry_flavor_summary_t *berry_flavor_summary_create_internal(
    char *name,
    char *url
    ) {
    berry_flavor_summary_t *berry_flavor_summary_local_var = malloc(sizeof(berry_flavor_summary_t));
    if (!berry_flavor_summary_local_var) {
        return NULL;
    }
    berry_flavor_summary_local_var->name = name;
    berry_flavor_summary_local_var->url = url;

    berry_flavor_summary_local_var->_library_owned = 1;
    return berry_flavor_summary_local_var;
}

__attribute__((deprecated)) berry_flavor_summary_t *berry_flavor_summary_create(
    char *name,
    char *url
    ) {
    return berry_flavor_summary_create_internal (
        name,
        url
        );
}

void berry_flavor_summary_free(berry_flavor_summary_t *berry_flavor_summary) {
    if(NULL == berry_flavor_summary){
        return ;
    }
    if(berry_flavor_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "berry_flavor_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (berry_flavor_summary->name) {
        free(berry_flavor_summary->name);
        berry_flavor_summary->name = NULL;
    }
    if (berry_flavor_summary->url) {
        free(berry_flavor_summary->url);
        berry_flavor_summary->url = NULL;
    }
    free(berry_flavor_summary);
}

cJSON *berry_flavor_summary_convertToJSON(berry_flavor_summary_t *berry_flavor_summary) {
    cJSON *item = cJSON_CreateObject();

    // berry_flavor_summary->name
    if (!berry_flavor_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", berry_flavor_summary->name) == NULL) {
    goto fail; //String
    }


    // berry_flavor_summary->url
    if (!berry_flavor_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", berry_flavor_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

berry_flavor_summary_t *berry_flavor_summary_parseFromJSON(cJSON *berry_flavor_summaryJSON){

    berry_flavor_summary_t *berry_flavor_summary_local_var = NULL;

    // berry_flavor_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(berry_flavor_summaryJSON, "name");
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

    // berry_flavor_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(berry_flavor_summaryJSON, "url");
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


    berry_flavor_summary_local_var = berry_flavor_summary_create_internal (
        strdup(name->valuestring),
        strdup(url->valuestring)
        );

    return berry_flavor_summary_local_var;
end:
    return NULL;

}
