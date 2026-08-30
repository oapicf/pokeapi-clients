#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "egg_group_summary.h"



static egg_group_summary_t *egg_group_summary_create_internal(
    char *name,
    char *url
    ) {
    egg_group_summary_t *egg_group_summary_local_var = malloc(sizeof(egg_group_summary_t));
    if (!egg_group_summary_local_var) {
        return NULL;
    }
    memset(egg_group_summary_local_var, 0, sizeof(egg_group_summary_t));
    egg_group_summary_local_var->_library_owned = 1;
    egg_group_summary_local_var->name = name;
    egg_group_summary_local_var->url = url;
    return egg_group_summary_local_var;
}

__attribute__((deprecated)) egg_group_summary_t *egg_group_summary_create(
    char *name,
    char *url
    ) {
    egg_group_summary_t *result = egg_group_summary_create_internal (
        name,
        url
        );
    if (!result) {
    }
    return result;
}

void egg_group_summary_free(egg_group_summary_t *egg_group_summary) {
    if(NULL == egg_group_summary){
        return ;
    }
    if(egg_group_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "egg_group_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (egg_group_summary->name) {
        free(egg_group_summary->name);
        egg_group_summary->name = NULL;
    }
    if (egg_group_summary->url) {
        free(egg_group_summary->url);
        egg_group_summary->url = NULL;
    }
    free(egg_group_summary);
}

cJSON *egg_group_summary_convertToJSON(egg_group_summary_t *egg_group_summary) {
    cJSON *item = cJSON_CreateObject();

    // egg_group_summary->name
    if (!egg_group_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", egg_group_summary->name) == NULL) {
    goto fail; //String
    }


    // egg_group_summary->url
    if (!egg_group_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", egg_group_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

egg_group_summary_t *egg_group_summary_parseFromJSON(cJSON *egg_group_summaryJSON){

    egg_group_summary_t *egg_group_summary_local_var = NULL;

    char *name_local_str = NULL;

    char *url_local_str = NULL;

    // egg_group_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(egg_group_summaryJSON, "name");
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

    // egg_group_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(egg_group_summaryJSON, "url");
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

    egg_group_summary_local_var = egg_group_summary_create_internal (
        name_local_str,
        url_local_str
        );

    if (!egg_group_summary_local_var) {
        goto end;
    }

    return egg_group_summary_local_var;
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
