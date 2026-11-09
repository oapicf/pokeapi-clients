#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "evolution_variable_summary.h"



static evolution_variable_summary_t *evolution_variable_summary_create_internal(
    char *name,
    char *url
    ) {
    evolution_variable_summary_t *evolution_variable_summary_local_var = malloc(sizeof(evolution_variable_summary_t));
    if (!evolution_variable_summary_local_var) {
        return NULL;
    }
    memset(evolution_variable_summary_local_var, 0, sizeof(evolution_variable_summary_t));
    evolution_variable_summary_local_var->_library_owned = 1;
    evolution_variable_summary_local_var->name = name;
    evolution_variable_summary_local_var->url = url;
    return evolution_variable_summary_local_var;
}

__attribute__((deprecated)) evolution_variable_summary_t *evolution_variable_summary_create(
    char *name,
    char *url
    ) {
    evolution_variable_summary_t *result = evolution_variable_summary_create_internal (
        name,
        url
        );
    if (!result) {
    }
    return result;
}

void evolution_variable_summary_free(evolution_variable_summary_t *evolution_variable_summary) {
    if(NULL == evolution_variable_summary){
        return ;
    }
    if(evolution_variable_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "evolution_variable_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (evolution_variable_summary->name) {
        free(evolution_variable_summary->name);
        evolution_variable_summary->name = NULL;
    }
    if (evolution_variable_summary->url) {
        free(evolution_variable_summary->url);
        evolution_variable_summary->url = NULL;
    }
    free(evolution_variable_summary);
}

cJSON *evolution_variable_summary_convertToJSON(evolution_variable_summary_t *evolution_variable_summary) {
    cJSON *item = cJSON_CreateObject();

    // evolution_variable_summary->name
    if (!evolution_variable_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", evolution_variable_summary->name) == NULL) {
    goto fail; //String
    }


    // evolution_variable_summary->url
    if (!evolution_variable_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", evolution_variable_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

evolution_variable_summary_t *evolution_variable_summary_parseFromJSON(cJSON *evolution_variable_summaryJSON){

    evolution_variable_summary_t *evolution_variable_summary_local_var = NULL;

    char *name_local_str = NULL;

    char *url_local_str = NULL;

    // evolution_variable_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(evolution_variable_summaryJSON, "name");
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

    // evolution_variable_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(evolution_variable_summaryJSON, "url");
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

    evolution_variable_summary_local_var = evolution_variable_summary_create_internal (
        name_local_str,
        url_local_str
        );

    if (!evolution_variable_summary_local_var) {
        goto end;
    }

    return evolution_variable_summary_local_var;
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
