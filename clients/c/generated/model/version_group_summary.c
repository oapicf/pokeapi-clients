#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "version_group_summary.h"



static version_group_summary_t *version_group_summary_create_internal(
    char *name,
    char *url
    ) {
    version_group_summary_t *version_group_summary_local_var = malloc(sizeof(version_group_summary_t));
    if (!version_group_summary_local_var) {
        return NULL;
    }
    version_group_summary_local_var->name = name;
    version_group_summary_local_var->url = url;

    version_group_summary_local_var->_library_owned = 1;
    return version_group_summary_local_var;
}

__attribute__((deprecated)) version_group_summary_t *version_group_summary_create(
    char *name,
    char *url
    ) {
    return version_group_summary_create_internal (
        name,
        url
        );
}

void version_group_summary_free(version_group_summary_t *version_group_summary) {
    if(NULL == version_group_summary){
        return ;
    }
    if(version_group_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "version_group_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (version_group_summary->name) {
        free(version_group_summary->name);
        version_group_summary->name = NULL;
    }
    if (version_group_summary->url) {
        free(version_group_summary->url);
        version_group_summary->url = NULL;
    }
    free(version_group_summary);
}

cJSON *version_group_summary_convertToJSON(version_group_summary_t *version_group_summary) {
    cJSON *item = cJSON_CreateObject();

    // version_group_summary->name
    if (!version_group_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", version_group_summary->name) == NULL) {
    goto fail; //String
    }


    // version_group_summary->url
    if (!version_group_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", version_group_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

version_group_summary_t *version_group_summary_parseFromJSON(cJSON *version_group_summaryJSON){

    version_group_summary_t *version_group_summary_local_var = NULL;

    // version_group_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(version_group_summaryJSON, "name");
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

    // version_group_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(version_group_summaryJSON, "url");
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


    version_group_summary_local_var = version_group_summary_create_internal (
        strdup(name->valuestring),
        strdup(url->valuestring)
        );

    return version_group_summary_local_var;
end:
    return NULL;

}
