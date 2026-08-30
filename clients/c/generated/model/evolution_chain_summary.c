#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "evolution_chain_summary.h"



static evolution_chain_summary_t *evolution_chain_summary_create_internal(
    char *url
    ) {
    evolution_chain_summary_t *evolution_chain_summary_local_var = malloc(sizeof(evolution_chain_summary_t));
    if (!evolution_chain_summary_local_var) {
        return NULL;
    }
    memset(evolution_chain_summary_local_var, 0, sizeof(evolution_chain_summary_t));
    evolution_chain_summary_local_var->_library_owned = 1;
    evolution_chain_summary_local_var->url = url;
    return evolution_chain_summary_local_var;
}

__attribute__((deprecated)) evolution_chain_summary_t *evolution_chain_summary_create(
    char *url
    ) {
    evolution_chain_summary_t *result = evolution_chain_summary_create_internal (
        url
        );
    if (!result) {
    }
    return result;
}

void evolution_chain_summary_free(evolution_chain_summary_t *evolution_chain_summary) {
    if(NULL == evolution_chain_summary){
        return ;
    }
    if(evolution_chain_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "evolution_chain_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (evolution_chain_summary->url) {
        free(evolution_chain_summary->url);
        evolution_chain_summary->url = NULL;
    }
    free(evolution_chain_summary);
}

cJSON *evolution_chain_summary_convertToJSON(evolution_chain_summary_t *evolution_chain_summary) {
    cJSON *item = cJSON_CreateObject();

    // evolution_chain_summary->url
    if (!evolution_chain_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", evolution_chain_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

evolution_chain_summary_t *evolution_chain_summary_parseFromJSON(cJSON *evolution_chain_summaryJSON){

    evolution_chain_summary_t *evolution_chain_summary_local_var = NULL;

    char *url_local_str = NULL;

    // evolution_chain_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(evolution_chain_summaryJSON, "url");
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

    evolution_chain_summary_local_var = evolution_chain_summary_create_internal (
        url_local_str
        );

    if (!evolution_chain_summary_local_var) {
        goto end;
    }

    return evolution_chain_summary_local_var;
end:
    if (url_local_str) {
        free(url_local_str);
        url_local_str = NULL;
    }
    return NULL;

}
