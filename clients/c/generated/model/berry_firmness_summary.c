#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "berry_firmness_summary.h"



static berry_firmness_summary_t *berry_firmness_summary_create_internal(
    char *name,
    char *url
    ) {
    berry_firmness_summary_t *berry_firmness_summary_local_var = malloc(sizeof(berry_firmness_summary_t));
    if (!berry_firmness_summary_local_var) {
        return NULL;
    }
    berry_firmness_summary_local_var->name = name;
    berry_firmness_summary_local_var->url = url;

    berry_firmness_summary_local_var->_library_owned = 1;
    return berry_firmness_summary_local_var;
}

__attribute__((deprecated)) berry_firmness_summary_t *berry_firmness_summary_create(
    char *name,
    char *url
    ) {
    return berry_firmness_summary_create_internal (
        name,
        url
        );
}

void berry_firmness_summary_free(berry_firmness_summary_t *berry_firmness_summary) {
    if(NULL == berry_firmness_summary){
        return ;
    }
    if(berry_firmness_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "berry_firmness_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (berry_firmness_summary->name) {
        free(berry_firmness_summary->name);
        berry_firmness_summary->name = NULL;
    }
    if (berry_firmness_summary->url) {
        free(berry_firmness_summary->url);
        berry_firmness_summary->url = NULL;
    }
    free(berry_firmness_summary);
}

cJSON *berry_firmness_summary_convertToJSON(berry_firmness_summary_t *berry_firmness_summary) {
    cJSON *item = cJSON_CreateObject();

    // berry_firmness_summary->name
    if (!berry_firmness_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", berry_firmness_summary->name) == NULL) {
    goto fail; //String
    }


    // berry_firmness_summary->url
    if (!berry_firmness_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", berry_firmness_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

berry_firmness_summary_t *berry_firmness_summary_parseFromJSON(cJSON *berry_firmness_summaryJSON){

    berry_firmness_summary_t *berry_firmness_summary_local_var = NULL;

    // berry_firmness_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(berry_firmness_summaryJSON, "name");
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

    // berry_firmness_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(berry_firmness_summaryJSON, "url");
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


    berry_firmness_summary_local_var = berry_firmness_summary_create_internal (
        strdup(name->valuestring),
        strdup(url->valuestring)
        );

    return berry_firmness_summary_local_var;
end:
    return NULL;

}
