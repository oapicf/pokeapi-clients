#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_fling_effect_summary.h"



static item_fling_effect_summary_t *item_fling_effect_summary_create_internal(
    char *name,
    char *url
    ) {
    item_fling_effect_summary_t *item_fling_effect_summary_local_var = malloc(sizeof(item_fling_effect_summary_t));
    if (!item_fling_effect_summary_local_var) {
        return NULL;
    }
    item_fling_effect_summary_local_var->name = name;
    item_fling_effect_summary_local_var->url = url;

    item_fling_effect_summary_local_var->_library_owned = 1;
    return item_fling_effect_summary_local_var;
}

__attribute__((deprecated)) item_fling_effect_summary_t *item_fling_effect_summary_create(
    char *name,
    char *url
    ) {
    return item_fling_effect_summary_create_internal (
        name,
        url
        );
}

void item_fling_effect_summary_free(item_fling_effect_summary_t *item_fling_effect_summary) {
    if(NULL == item_fling_effect_summary){
        return ;
    }
    if(item_fling_effect_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_fling_effect_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (item_fling_effect_summary->name) {
        free(item_fling_effect_summary->name);
        item_fling_effect_summary->name = NULL;
    }
    if (item_fling_effect_summary->url) {
        free(item_fling_effect_summary->url);
        item_fling_effect_summary->url = NULL;
    }
    free(item_fling_effect_summary);
}

cJSON *item_fling_effect_summary_convertToJSON(item_fling_effect_summary_t *item_fling_effect_summary) {
    cJSON *item = cJSON_CreateObject();

    // item_fling_effect_summary->name
    if (!item_fling_effect_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", item_fling_effect_summary->name) == NULL) {
    goto fail; //String
    }


    // item_fling_effect_summary->url
    if (!item_fling_effect_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", item_fling_effect_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

item_fling_effect_summary_t *item_fling_effect_summary_parseFromJSON(cJSON *item_fling_effect_summaryJSON){

    item_fling_effect_summary_t *item_fling_effect_summary_local_var = NULL;

    // item_fling_effect_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(item_fling_effect_summaryJSON, "name");
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

    // item_fling_effect_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(item_fling_effect_summaryJSON, "url");
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


    item_fling_effect_summary_local_var = item_fling_effect_summary_create_internal (
        strdup(name->valuestring),
        strdup(url->valuestring)
        );

    return item_fling_effect_summary_local_var;
end:
    return NULL;

}
