#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "type_summary.h"



static type_summary_t *type_summary_create_internal(
    char *name,
    char *url
    ) {
    type_summary_t *type_summary_local_var = malloc(sizeof(type_summary_t));
    if (!type_summary_local_var) {
        return NULL;
    }
    memset(type_summary_local_var, 0, sizeof(type_summary_t));
    type_summary_local_var->_library_owned = 1;
    type_summary_local_var->name = name;
    type_summary_local_var->url = url;
    return type_summary_local_var;
}

__attribute__((deprecated)) type_summary_t *type_summary_create(
    char *name,
    char *url
    ) {
    type_summary_t *result = type_summary_create_internal (
        name,
        url
        );
    if (!result) {
    }
    return result;
}

void type_summary_free(type_summary_t *type_summary) {
    if(NULL == type_summary){
        return ;
    }
    if(type_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "type_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (type_summary->name) {
        free(type_summary->name);
        type_summary->name = NULL;
    }
    if (type_summary->url) {
        free(type_summary->url);
        type_summary->url = NULL;
    }
    free(type_summary);
}

cJSON *type_summary_convertToJSON(type_summary_t *type_summary) {
    cJSON *item = cJSON_CreateObject();

    // type_summary->name
    if (!type_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", type_summary->name) == NULL) {
    goto fail; //String
    }


    // type_summary->url
    if (!type_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", type_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

type_summary_t *type_summary_parseFromJSON(cJSON *type_summaryJSON){

    type_summary_t *type_summary_local_var = NULL;

    char *name_local_str = NULL;

    char *url_local_str = NULL;

    // type_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(type_summaryJSON, "name");
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

    // type_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(type_summaryJSON, "url");
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

    type_summary_local_var = type_summary_create_internal (
        name_local_str,
        url_local_str
        );

    if (!type_summary_local_var) {
        goto end;
    }

    return type_summary_local_var;
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
