#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "berry_summary.h"



static berry_summary_t *berry_summary_create_internal(
    char *name,
    char *url
    ) {
    berry_summary_t *berry_summary_local_var = malloc(sizeof(berry_summary_t));
    if (!berry_summary_local_var) {
        return NULL;
    }
    memset(berry_summary_local_var, 0, sizeof(berry_summary_t));
    berry_summary_local_var->_library_owned = 1;
    berry_summary_local_var->name = name;
    berry_summary_local_var->url = url;
    return berry_summary_local_var;
}

__attribute__((deprecated)) berry_summary_t *berry_summary_create(
    char *name,
    char *url
    ) {
    berry_summary_t *result = berry_summary_create_internal (
        name,
        url
        );
    if (!result) {
    }
    return result;
}

void berry_summary_free(berry_summary_t *berry_summary) {
    if(NULL == berry_summary){
        return ;
    }
    if(berry_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "berry_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (berry_summary->name) {
        free(berry_summary->name);
        berry_summary->name = NULL;
    }
    if (berry_summary->url) {
        free(berry_summary->url);
        berry_summary->url = NULL;
    }
    free(berry_summary);
}

cJSON *berry_summary_convertToJSON(berry_summary_t *berry_summary) {
    cJSON *item = cJSON_CreateObject();

    // berry_summary->name
    if (!berry_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", berry_summary->name) == NULL) {
    goto fail; //String
    }


    // berry_summary->url
    if (!berry_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", berry_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

berry_summary_t *berry_summary_parseFromJSON(cJSON *berry_summaryJSON){

    berry_summary_t *berry_summary_local_var = NULL;

    char *name_local_str = NULL;

    char *url_local_str = NULL;

    // berry_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(berry_summaryJSON, "name");
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

    // berry_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(berry_summaryJSON, "url");
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


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (url && !cJSON_IsNull(url)) url_local_str = strdup(url->valuestring);

    berry_summary_local_var = berry_summary_create_internal (
        name_local_str,
        url_local_str
        );

    if (!berry_summary_local_var) {
        goto end;
    }

    return berry_summary_local_var;
end:
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (url_local_str) {
        free(url_local_str);
        url_local_str = NULL;
    }
    return NULL;

}
