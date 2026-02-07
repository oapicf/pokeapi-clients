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
    item_category_summary_local_var->name = name;
    item_category_summary_local_var->url = url;

    item_category_summary_local_var->_library_owned = 1;
    return item_category_summary_local_var;
}

__attribute__((deprecated)) item_category_summary_t *item_category_summary_create(
    char *name,
    char *url
    ) {
    return item_category_summary_create_internal (
        name,
        url
        );
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


    item_category_summary_local_var = item_category_summary_create_internal (
        strdup(name->valuestring),
        strdup(url->valuestring)
        );

    return item_category_summary_local_var;
end:
    return NULL;

}
