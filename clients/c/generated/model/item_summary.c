#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_summary.h"



static item_summary_t *item_summary_create_internal(
    char *name,
    char *url
    ) {
    item_summary_t *item_summary_local_var = malloc(sizeof(item_summary_t));
    if (!item_summary_local_var) {
        return NULL;
    }
    memset(item_summary_local_var, 0, sizeof(item_summary_t));
    item_summary_local_var->_library_owned = 1;
    item_summary_local_var->name = name;
    item_summary_local_var->url = url;
    return item_summary_local_var;
}

__attribute__((deprecated)) item_summary_t *item_summary_create(
    char *name,
    char *url
    ) {
    item_summary_t *result = item_summary_create_internal (
        name,
        url
        );
    if (!result) {
    }
    return result;
}

void item_summary_free(item_summary_t *item_summary) {
    if(NULL == item_summary){
        return ;
    }
    if(item_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (item_summary->name) {
        free(item_summary->name);
        item_summary->name = NULL;
    }
    if (item_summary->url) {
        free(item_summary->url);
        item_summary->url = NULL;
    }
    free(item_summary);
}

cJSON *item_summary_convertToJSON(item_summary_t *item_summary) {
    cJSON *item = cJSON_CreateObject();

    // item_summary->name
    if (!item_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", item_summary->name) == NULL) {
    goto fail; //String
    }


    // item_summary->url
    if (!item_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", item_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

item_summary_t *item_summary_parseFromJSON(cJSON *item_summaryJSON){

    item_summary_t *item_summary_local_var = NULL;

    char *name_local_str = NULL;

    char *url_local_str = NULL;

    // item_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(item_summaryJSON, "name");
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

    // item_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(item_summaryJSON, "url");
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

    item_summary_local_var = item_summary_create_internal (
        name_local_str,
        url_local_str
        );

    if (!item_summary_local_var) {
        goto end;
    }

    return item_summary_local_var;
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
