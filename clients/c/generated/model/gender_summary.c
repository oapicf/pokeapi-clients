#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "gender_summary.h"



static gender_summary_t *gender_summary_create_internal(
    char *name,
    char *url
    ) {
    gender_summary_t *gender_summary_local_var = malloc(sizeof(gender_summary_t));
    if (!gender_summary_local_var) {
        return NULL;
    }
    gender_summary_local_var->name = name;
    gender_summary_local_var->url = url;

    gender_summary_local_var->_library_owned = 1;
    return gender_summary_local_var;
}

__attribute__((deprecated)) gender_summary_t *gender_summary_create(
    char *name,
    char *url
    ) {
    return gender_summary_create_internal (
        name,
        url
        );
}

void gender_summary_free(gender_summary_t *gender_summary) {
    if(NULL == gender_summary){
        return ;
    }
    if(gender_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "gender_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (gender_summary->name) {
        free(gender_summary->name);
        gender_summary->name = NULL;
    }
    if (gender_summary->url) {
        free(gender_summary->url);
        gender_summary->url = NULL;
    }
    free(gender_summary);
}

cJSON *gender_summary_convertToJSON(gender_summary_t *gender_summary) {
    cJSON *item = cJSON_CreateObject();

    // gender_summary->name
    if (!gender_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", gender_summary->name) == NULL) {
    goto fail; //String
    }


    // gender_summary->url
    if (!gender_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", gender_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

gender_summary_t *gender_summary_parseFromJSON(cJSON *gender_summaryJSON){

    gender_summary_t *gender_summary_local_var = NULL;

    // gender_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(gender_summaryJSON, "name");
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

    // gender_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(gender_summaryJSON, "url");
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


    gender_summary_local_var = gender_summary_create_internal (
        strdup(name->valuestring),
        strdup(url->valuestring)
        );

    return gender_summary_local_var;
end:
    return NULL;

}
