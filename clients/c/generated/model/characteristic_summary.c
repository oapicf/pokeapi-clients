#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "characteristic_summary.h"



static characteristic_summary_t *characteristic_summary_create_internal(
    char *url
    ) {
    characteristic_summary_t *characteristic_summary_local_var = malloc(sizeof(characteristic_summary_t));
    if (!characteristic_summary_local_var) {
        return NULL;
    }
    memset(characteristic_summary_local_var, 0, sizeof(characteristic_summary_t));
    characteristic_summary_local_var->_library_owned = 1;
    characteristic_summary_local_var->url = url;
    return characteristic_summary_local_var;
}

__attribute__((deprecated)) characteristic_summary_t *characteristic_summary_create(
    char *url
    ) {
    characteristic_summary_t *result = characteristic_summary_create_internal (
        url
        );
    if (!result) {
    }
    return result;
}

void characteristic_summary_free(characteristic_summary_t *characteristic_summary) {
    if(NULL == characteristic_summary){
        return ;
    }
    if(characteristic_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "characteristic_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (characteristic_summary->url) {
        free(characteristic_summary->url);
        characteristic_summary->url = NULL;
    }
    free(characteristic_summary);
}

cJSON *characteristic_summary_convertToJSON(characteristic_summary_t *characteristic_summary) {
    cJSON *item = cJSON_CreateObject();

    // characteristic_summary->url
    if (!characteristic_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", characteristic_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

characteristic_summary_t *characteristic_summary_parseFromJSON(cJSON *characteristic_summaryJSON){

    characteristic_summary_t *characteristic_summary_local_var = NULL;

    char *url_local_str = NULL;

    // characteristic_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(characteristic_summaryJSON, "url");
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


    if (url && !cJSON_IsNull(url)) url_local_str = strdup(url->valuestring);

    characteristic_summary_local_var = characteristic_summary_create_internal (
        url_local_str
        );

    if (!characteristic_summary_local_var) {
        goto end;
    }

    return characteristic_summary_local_var;
end:
    if (url_local_str) {
        free(url_local_str);
        url_local_str = NULL;
    }
    return NULL;

}
