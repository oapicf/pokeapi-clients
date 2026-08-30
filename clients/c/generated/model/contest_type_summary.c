#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "contest_type_summary.h"



static contest_type_summary_t *contest_type_summary_create_internal(
    char *name,
    char *url
    ) {
    contest_type_summary_t *contest_type_summary_local_var = malloc(sizeof(contest_type_summary_t));
    if (!contest_type_summary_local_var) {
        return NULL;
    }
    memset(contest_type_summary_local_var, 0, sizeof(contest_type_summary_t));
    contest_type_summary_local_var->_library_owned = 1;
    contest_type_summary_local_var->name = name;
    contest_type_summary_local_var->url = url;
    return contest_type_summary_local_var;
}

__attribute__((deprecated)) contest_type_summary_t *contest_type_summary_create(
    char *name,
    char *url
    ) {
    contest_type_summary_t *result = contest_type_summary_create_internal (
        name,
        url
        );
    if (!result) {
    }
    return result;
}

void contest_type_summary_free(contest_type_summary_t *contest_type_summary) {
    if(NULL == contest_type_summary){
        return ;
    }
    if(contest_type_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "contest_type_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (contest_type_summary->name) {
        free(contest_type_summary->name);
        contest_type_summary->name = NULL;
    }
    if (contest_type_summary->url) {
        free(contest_type_summary->url);
        contest_type_summary->url = NULL;
    }
    free(contest_type_summary);
}

cJSON *contest_type_summary_convertToJSON(contest_type_summary_t *contest_type_summary) {
    cJSON *item = cJSON_CreateObject();

    // contest_type_summary->name
    if (!contest_type_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", contest_type_summary->name) == NULL) {
    goto fail; //String
    }


    // contest_type_summary->url
    if (!contest_type_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", contest_type_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

contest_type_summary_t *contest_type_summary_parseFromJSON(cJSON *contest_type_summaryJSON){

    contest_type_summary_t *contest_type_summary_local_var = NULL;

    char *name_local_str = NULL;

    char *url_local_str = NULL;

    // contest_type_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(contest_type_summaryJSON, "name");
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

    // contest_type_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(contest_type_summaryJSON, "url");
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

    contest_type_summary_local_var = contest_type_summary_create_internal (
        name_local_str,
        url_local_str
        );

    if (!contest_type_summary_local_var) {
        goto end;
    }

    return contest_type_summary_local_var;
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
