#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "version_summary.h"



static version_summary_t *version_summary_create_internal(
    char *name,
    char *url
    ) {
    version_summary_t *version_summary_local_var = malloc(sizeof(version_summary_t));
    if (!version_summary_local_var) {
        return NULL;
    }
    memset(version_summary_local_var, 0, sizeof(version_summary_t));
    version_summary_local_var->_library_owned = 1;
    version_summary_local_var->name = name;
    version_summary_local_var->url = url;
    return version_summary_local_var;
}

__attribute__((deprecated)) version_summary_t *version_summary_create(
    char *name,
    char *url
    ) {
    version_summary_t *result = version_summary_create_internal (
        name,
        url
        );
    if (!result) {
    }
    return result;
}

void version_summary_free(version_summary_t *version_summary) {
    if(NULL == version_summary){
        return ;
    }
    if(version_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "version_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (version_summary->name) {
        free(version_summary->name);
        version_summary->name = NULL;
    }
    if (version_summary->url) {
        free(version_summary->url);
        version_summary->url = NULL;
    }
    free(version_summary);
}

cJSON *version_summary_convertToJSON(version_summary_t *version_summary) {
    cJSON *item = cJSON_CreateObject();

    // version_summary->name
    if (!version_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", version_summary->name) == NULL) {
    goto fail; //String
    }


    // version_summary->url
    if (!version_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", version_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

version_summary_t *version_summary_parseFromJSON(cJSON *version_summaryJSON){

    version_summary_t *version_summary_local_var = NULL;

    char *name_local_str = NULL;

    char *url_local_str = NULL;

    // version_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(version_summaryJSON, "name");
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

    // version_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(version_summaryJSON, "url");
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

    version_summary_local_var = version_summary_create_internal (
        name_local_str,
        url_local_str
        );

    if (!version_summary_local_var) {
        goto end;
    }

    return version_summary_local_var;
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
