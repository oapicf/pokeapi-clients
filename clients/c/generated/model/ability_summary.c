#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ability_summary.h"



static ability_summary_t *ability_summary_create_internal(
    char *name,
    char *url
    ) {
    ability_summary_t *ability_summary_local_var = malloc(sizeof(ability_summary_t));
    if (!ability_summary_local_var) {
        return NULL;
    }
    ability_summary_local_var->name = name;
    ability_summary_local_var->url = url;

    ability_summary_local_var->_library_owned = 1;
    return ability_summary_local_var;
}

__attribute__((deprecated)) ability_summary_t *ability_summary_create(
    char *name,
    char *url
    ) {
    return ability_summary_create_internal (
        name,
        url
        );
}

void ability_summary_free(ability_summary_t *ability_summary) {
    if(NULL == ability_summary){
        return ;
    }
    if(ability_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ability_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ability_summary->name) {
        free(ability_summary->name);
        ability_summary->name = NULL;
    }
    if (ability_summary->url) {
        free(ability_summary->url);
        ability_summary->url = NULL;
    }
    free(ability_summary);
}

cJSON *ability_summary_convertToJSON(ability_summary_t *ability_summary) {
    cJSON *item = cJSON_CreateObject();

    // ability_summary->name
    if (!ability_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", ability_summary->name) == NULL) {
    goto fail; //String
    }


    // ability_summary->url
    if (!ability_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", ability_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ability_summary_t *ability_summary_parseFromJSON(cJSON *ability_summaryJSON){

    ability_summary_t *ability_summary_local_var = NULL;

    // ability_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(ability_summaryJSON, "name");
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

    // ability_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(ability_summaryJSON, "url");
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


    ability_summary_local_var = ability_summary_create_internal (
        strdup(name->valuestring),
        strdup(url->valuestring)
        );

    return ability_summary_local_var;
end:
    return NULL;

}
