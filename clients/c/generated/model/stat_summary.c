#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "stat_summary.h"



static stat_summary_t *stat_summary_create_internal(
    char *name,
    char *url
    ) {
    stat_summary_t *stat_summary_local_var = malloc(sizeof(stat_summary_t));
    if (!stat_summary_local_var) {
        return NULL;
    }
    memset(stat_summary_local_var, 0, sizeof(stat_summary_t));
    stat_summary_local_var->_library_owned = 1;
    stat_summary_local_var->name = name;
    stat_summary_local_var->url = url;
    return stat_summary_local_var;
}

__attribute__((deprecated)) stat_summary_t *stat_summary_create(
    char *name,
    char *url
    ) {
    stat_summary_t *result = stat_summary_create_internal (
        name,
        url
        );
    if (!result) {
    }
    return result;
}

void stat_summary_free(stat_summary_t *stat_summary) {
    if(NULL == stat_summary){
        return ;
    }
    if(stat_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "stat_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (stat_summary->name) {
        free(stat_summary->name);
        stat_summary->name = NULL;
    }
    if (stat_summary->url) {
        free(stat_summary->url);
        stat_summary->url = NULL;
    }
    free(stat_summary);
}

cJSON *stat_summary_convertToJSON(stat_summary_t *stat_summary) {
    cJSON *item = cJSON_CreateObject();

    // stat_summary->name
    if (!stat_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", stat_summary->name) == NULL) {
    goto fail; //String
    }


    // stat_summary->url
    if (!stat_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", stat_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

stat_summary_t *stat_summary_parseFromJSON(cJSON *stat_summaryJSON){

    stat_summary_t *stat_summary_local_var = NULL;

    char *name_local_str = NULL;

    char *url_local_str = NULL;

    // stat_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(stat_summaryJSON, "name");
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

    // stat_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(stat_summaryJSON, "url");
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

    stat_summary_local_var = stat_summary_create_internal (
        name_local_str,
        url_local_str
        );

    if (!stat_summary_local_var) {
        goto end;
    }

    return stat_summary_local_var;
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
