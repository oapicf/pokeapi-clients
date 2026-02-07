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
    language_summary_local_var->name = name;
    language_summary_local_var->url = url;

    language_summary_local_var->_library_owned = 1;
    return language_summary_local_var;
}

__attribute__((deprecated)) language_summary_t *language_summary_create(
    char *name,
    char *url
    ) {
    return language_summary_create_internal (
        name,
        url
        );
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


    language_summary_local_var = language_summary_create_internal (
        strdup(name->valuestring),
        strdup(url->valuestring)
        );

    return language_summary_local_var;
end:
    return NULL;

}
