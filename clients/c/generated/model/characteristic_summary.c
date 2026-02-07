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
    characteristic_summary_local_var->url = url;

    characteristic_summary_local_var->_library_owned = 1;
    return characteristic_summary_local_var;
}

__attribute__((deprecated)) characteristic_summary_t *characteristic_summary_create(
    char *url
    ) {
    return characteristic_summary_create_internal (
        url
        );
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


    characteristic_summary_local_var = characteristic_summary_create_internal (
        strdup(url->valuestring)
        );

    return characteristic_summary_local_var;
end:
    return NULL;

}
