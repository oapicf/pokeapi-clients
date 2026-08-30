#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "super_contest_effect_summary.h"



static super_contest_effect_summary_t *super_contest_effect_summary_create_internal(
    char *url
    ) {
    super_contest_effect_summary_t *super_contest_effect_summary_local_var = malloc(sizeof(super_contest_effect_summary_t));
    if (!super_contest_effect_summary_local_var) {
        return NULL;
    }
    memset(super_contest_effect_summary_local_var, 0, sizeof(super_contest_effect_summary_t));
    super_contest_effect_summary_local_var->_library_owned = 1;
    super_contest_effect_summary_local_var->url = url;
    return super_contest_effect_summary_local_var;
}

__attribute__((deprecated)) super_contest_effect_summary_t *super_contest_effect_summary_create(
    char *url
    ) {
    super_contest_effect_summary_t *result = super_contest_effect_summary_create_internal (
        url
        );
    if (!result) {
    }
    return result;
}

void super_contest_effect_summary_free(super_contest_effect_summary_t *super_contest_effect_summary) {
    if(NULL == super_contest_effect_summary){
        return ;
    }
    if(super_contest_effect_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "super_contest_effect_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (super_contest_effect_summary->url) {
        free(super_contest_effect_summary->url);
        super_contest_effect_summary->url = NULL;
    }
    free(super_contest_effect_summary);
}

cJSON *super_contest_effect_summary_convertToJSON(super_contest_effect_summary_t *super_contest_effect_summary) {
    cJSON *item = cJSON_CreateObject();

    // super_contest_effect_summary->url
    if (!super_contest_effect_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", super_contest_effect_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

super_contest_effect_summary_t *super_contest_effect_summary_parseFromJSON(cJSON *super_contest_effect_summaryJSON){

    super_contest_effect_summary_t *super_contest_effect_summary_local_var = NULL;

    char *url_local_str = NULL;

    // super_contest_effect_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(super_contest_effect_summaryJSON, "url");
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

    super_contest_effect_summary_local_var = super_contest_effect_summary_create_internal (
        url_local_str
        );

    if (!super_contest_effect_summary_local_var) {
        goto end;
    }

    return super_contest_effect_summary_local_var;
end:
    if (url_local_str) {
        free(url_local_str);
        url_local_str = NULL;
    }
    return NULL;

}
