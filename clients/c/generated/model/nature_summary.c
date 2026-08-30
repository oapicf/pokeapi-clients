#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "nature_summary.h"



static nature_summary_t *nature_summary_create_internal(
    char *name,
    char *url
    ) {
    nature_summary_t *nature_summary_local_var = malloc(sizeof(nature_summary_t));
    if (!nature_summary_local_var) {
        return NULL;
    }
    memset(nature_summary_local_var, 0, sizeof(nature_summary_t));
    nature_summary_local_var->_library_owned = 1;
    nature_summary_local_var->name = name;
    nature_summary_local_var->url = url;
    return nature_summary_local_var;
}

__attribute__((deprecated)) nature_summary_t *nature_summary_create(
    char *name,
    char *url
    ) {
    nature_summary_t *result = nature_summary_create_internal (
        name,
        url
        );
    if (!result) {
    }
    return result;
}

void nature_summary_free(nature_summary_t *nature_summary) {
    if(NULL == nature_summary){
        return ;
    }
    if(nature_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "nature_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (nature_summary->name) {
        free(nature_summary->name);
        nature_summary->name = NULL;
    }
    if (nature_summary->url) {
        free(nature_summary->url);
        nature_summary->url = NULL;
    }
    free(nature_summary);
}

cJSON *nature_summary_convertToJSON(nature_summary_t *nature_summary) {
    cJSON *item = cJSON_CreateObject();

    // nature_summary->name
    if (!nature_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", nature_summary->name) == NULL) {
    goto fail; //String
    }


    // nature_summary->url
    if (!nature_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", nature_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

nature_summary_t *nature_summary_parseFromJSON(cJSON *nature_summaryJSON){

    nature_summary_t *nature_summary_local_var = NULL;

    char *name_local_str = NULL;

    char *url_local_str = NULL;

    // nature_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(nature_summaryJSON, "name");
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

    // nature_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(nature_summaryJSON, "url");
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

    nature_summary_local_var = nature_summary_create_internal (
        name_local_str,
        url_local_str
        );

    if (!nature_summary_local_var) {
        goto end;
    }

    return nature_summary_local_var;
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
