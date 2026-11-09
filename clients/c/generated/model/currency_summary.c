#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "currency_summary.h"



static currency_summary_t *currency_summary_create_internal(
    char *name,
    char *url
    ) {
    currency_summary_t *currency_summary_local_var = malloc(sizeof(currency_summary_t));
    if (!currency_summary_local_var) {
        return NULL;
    }
    memset(currency_summary_local_var, 0, sizeof(currency_summary_t));
    currency_summary_local_var->_library_owned = 1;
    currency_summary_local_var->name = name;
    currency_summary_local_var->url = url;
    return currency_summary_local_var;
}

__attribute__((deprecated)) currency_summary_t *currency_summary_create(
    char *name,
    char *url
    ) {
    currency_summary_t *result = currency_summary_create_internal (
        name,
        url
        );
    if (!result) {
    }
    return result;
}

void currency_summary_free(currency_summary_t *currency_summary) {
    if(NULL == currency_summary){
        return ;
    }
    if(currency_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "currency_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (currency_summary->name) {
        free(currency_summary->name);
        currency_summary->name = NULL;
    }
    if (currency_summary->url) {
        free(currency_summary->url);
        currency_summary->url = NULL;
    }
    free(currency_summary);
}

cJSON *currency_summary_convertToJSON(currency_summary_t *currency_summary) {
    cJSON *item = cJSON_CreateObject();

    // currency_summary->name
    if (!currency_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", currency_summary->name) == NULL) {
    goto fail; //String
    }


    // currency_summary->url
    if (!currency_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", currency_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

currency_summary_t *currency_summary_parseFromJSON(cJSON *currency_summaryJSON){

    currency_summary_t *currency_summary_local_var = NULL;

    char *name_local_str = NULL;

    char *url_local_str = NULL;

    // currency_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(currency_summaryJSON, "name");
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

    // currency_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(currency_summaryJSON, "url");
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

    currency_summary_local_var = currency_summary_create_internal (
        name_local_str,
        url_local_str
        );

    if (!currency_summary_local_var) {
        goto end;
    }

    return currency_summary_local_var;
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
