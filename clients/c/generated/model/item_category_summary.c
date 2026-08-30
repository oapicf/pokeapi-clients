#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_category_summary.h"



static item_category_summary_t *item_category_summary_create_internal(
    char *name,
    char *url
    ) {
    item_category_summary_t *item_category_summary_local_var = malloc(sizeof(item_category_summary_t));
    if (!item_category_summary_local_var) {
        return NULL;
    }
    memset(item_category_summary_local_var, 0, sizeof(item_category_summary_t));
    item_category_summary_local_var->_library_owned = 1;
    item_category_summary_local_var->name = name;
    item_category_summary_local_var->url = url;
    return item_category_summary_local_var;
}

__attribute__((deprecated)) item_category_summary_t *item_category_summary_create(
    char *name,
    char *url
    ) {
    item_category_summary_t *result = item_category_summary_create_internal (
        name,
        url
        );
    if (!result) {
    }
    return result;
}

void item_category_summary_free(item_category_summary_t *item_category_summary) {
    if(NULL == item_category_summary){
        return ;
    }
    if(item_category_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_category_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (item_category_summary->name) {
        free(item_category_summary->name);
        item_category_summary->name = NULL;
    }
    if (item_category_summary->url) {
        free(item_category_summary->url);
        item_category_summary->url = NULL;
    }
    free(item_category_summary);
}

cJSON *item_category_summary_convertToJSON(item_category_summary_t *item_category_summary) {
    cJSON *item = cJSON_CreateObject();

    // item_category_summary->name
    if (!item_category_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", item_category_summary->name) == NULL) {
    goto fail; //String
    }


    // item_category_summary->url
    if (!item_category_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", item_category_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

item_category_summary_t *item_category_summary_parseFromJSON(cJSON *item_category_summaryJSON){

    item_category_summary_t *item_category_summary_local_var = NULL;

    char *name_local_str = NULL;

    char *url_local_str = NULL;

    // item_category_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(item_category_summaryJSON, "name");
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

    // item_category_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(item_category_summaryJSON, "url");
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

    item_category_summary_local_var = item_category_summary_create_internal (
        name_local_str,
        url_local_str
        );

    if (!item_category_summary_local_var) {
        goto end;
    }

    return item_category_summary_local_var;
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
