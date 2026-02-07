#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "contest_effect_summary.h"



static contest_effect_summary_t *contest_effect_summary_create_internal(
    char *url
    ) {
    contest_effect_summary_t *contest_effect_summary_local_var = malloc(sizeof(contest_effect_summary_t));
    if (!contest_effect_summary_local_var) {
        return NULL;
    }
    contest_effect_summary_local_var->url = url;

    contest_effect_summary_local_var->_library_owned = 1;
    return contest_effect_summary_local_var;
}

__attribute__((deprecated)) contest_effect_summary_t *contest_effect_summary_create(
    char *url
    ) {
    return contest_effect_summary_create_internal (
        url
        );
}

void contest_effect_summary_free(contest_effect_summary_t *contest_effect_summary) {
    if(NULL == contest_effect_summary){
        return ;
    }
    if(contest_effect_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "contest_effect_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (contest_effect_summary->url) {
        free(contest_effect_summary->url);
        contest_effect_summary->url = NULL;
    }
    free(contest_effect_summary);
}

cJSON *contest_effect_summary_convertToJSON(contest_effect_summary_t *contest_effect_summary) {
    cJSON *item = cJSON_CreateObject();

    // contest_effect_summary->url
    if (!contest_effect_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", contest_effect_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

contest_effect_summary_t *contest_effect_summary_parseFromJSON(cJSON *contest_effect_summaryJSON){

    contest_effect_summary_t *contest_effect_summary_local_var = NULL;

    // contest_effect_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(contest_effect_summaryJSON, "url");
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


    contest_effect_summary_local_var = contest_effect_summary_create_internal (
        strdup(url->valuestring)
        );

    return contest_effect_summary_local_var;
end:
    return NULL;

}
