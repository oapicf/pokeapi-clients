#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_pocket_summary.h"



static item_pocket_summary_t *item_pocket_summary_create_internal(
    char *name,
    char *url
    ) {
    item_pocket_summary_t *item_pocket_summary_local_var = malloc(sizeof(item_pocket_summary_t));
    if (!item_pocket_summary_local_var) {
        return NULL;
    }
    memset(item_pocket_summary_local_var, 0, sizeof(item_pocket_summary_t));
    item_pocket_summary_local_var->_library_owned = 1;
    item_pocket_summary_local_var->name = name;
    item_pocket_summary_local_var->url = url;
    return item_pocket_summary_local_var;
}

__attribute__((deprecated)) item_pocket_summary_t *item_pocket_summary_create(
    char *name,
    char *url
    ) {
    item_pocket_summary_t *result = item_pocket_summary_create_internal (
        name,
        url
        );
    if (!result) {
    }
    return result;
}

void item_pocket_summary_free(item_pocket_summary_t *item_pocket_summary) {
    if(NULL == item_pocket_summary){
        return ;
    }
    if(item_pocket_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_pocket_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (item_pocket_summary->name) {
        free(item_pocket_summary->name);
        item_pocket_summary->name = NULL;
    }
    if (item_pocket_summary->url) {
        free(item_pocket_summary->url);
        item_pocket_summary->url = NULL;
    }
    free(item_pocket_summary);
}

cJSON *item_pocket_summary_convertToJSON(item_pocket_summary_t *item_pocket_summary) {
    cJSON *item = cJSON_CreateObject();

    // item_pocket_summary->name
    if (!item_pocket_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", item_pocket_summary->name) == NULL) {
    goto fail; //String
    }


    // item_pocket_summary->url
    if (!item_pocket_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", item_pocket_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

item_pocket_summary_t *item_pocket_summary_parseFromJSON(cJSON *item_pocket_summaryJSON){

    item_pocket_summary_t *item_pocket_summary_local_var = NULL;

    char *name_local_str = NULL;

    char *url_local_str = NULL;

    // item_pocket_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(item_pocket_summaryJSON, "name");
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

    // item_pocket_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(item_pocket_summaryJSON, "url");
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

    item_pocket_summary_local_var = item_pocket_summary_create_internal (
        name_local_str,
        url_local_str
        );

    if (!item_pocket_summary_local_var) {
        goto end;
    }

    return item_pocket_summary_local_var;
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
