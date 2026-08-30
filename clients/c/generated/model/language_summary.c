#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "language_summary.h"



static language_summary_t *language_summary_create_internal(
    char *name,
    char *url
    ) {
    language_summary_t *language_summary_local_var = malloc(sizeof(language_summary_t));
    if (!language_summary_local_var) {
        return NULL;
    }
    memset(language_summary_local_var, 0, sizeof(language_summary_t));
    language_summary_local_var->_library_owned = 1;
    language_summary_local_var->name = name;
    language_summary_local_var->url = url;
    return language_summary_local_var;
}

__attribute__((deprecated)) language_summary_t *language_summary_create(
    char *name,
    char *url
    ) {
    language_summary_t *result = language_summary_create_internal (
        name,
        url
        );
    if (!result) {
    }
    return result;
}

void language_summary_free(language_summary_t *language_summary) {
    if(NULL == language_summary){
        return ;
    }
    if(language_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "language_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (language_summary->name) {
        free(language_summary->name);
        language_summary->name = NULL;
    }
    if (language_summary->url) {
        free(language_summary->url);
        language_summary->url = NULL;
    }
    free(language_summary);
}

cJSON *language_summary_convertToJSON(language_summary_t *language_summary) {
    cJSON *item = cJSON_CreateObject();

    // language_summary->name
    if (!language_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", language_summary->name) == NULL) {
    goto fail; //String
    }


    // language_summary->url
    if (!language_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", language_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

language_summary_t *language_summary_parseFromJSON(cJSON *language_summaryJSON){

    language_summary_t *language_summary_local_var = NULL;

    char *name_local_str = NULL;

    char *url_local_str = NULL;

    // language_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(language_summaryJSON, "name");
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

    // language_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(language_summaryJSON, "url");
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

    language_summary_local_var = language_summary_create_internal (
        name_local_str,
        url_local_str
        );

    if (!language_summary_local_var) {
        goto end;
    }

    return language_summary_local_var;
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
