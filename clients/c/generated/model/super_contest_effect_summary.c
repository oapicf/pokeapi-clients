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
    super_contest_effect_summary_local_var->url = url;

    super_contest_effect_summary_local_var->_library_owned = 1;
    return super_contest_effect_summary_local_var;
}

__attribute__((deprecated)) super_contest_effect_summary_t *super_contest_effect_summary_create(
    char *url
    ) {
    return super_contest_effect_summary_create_internal (
        url
        );
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


    super_contest_effect_summary_local_var = super_contest_effect_summary_create_internal (
        strdup(url->valuestring)
        );

    return super_contest_effect_summary_local_var;
end:
    return NULL;

}
