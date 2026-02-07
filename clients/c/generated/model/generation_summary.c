#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "generation_summary.h"



static generation_summary_t *generation_summary_create_internal(
    char *name,
    char *url
    ) {
    generation_summary_t *generation_summary_local_var = malloc(sizeof(generation_summary_t));
    if (!generation_summary_local_var) {
        return NULL;
    }
    generation_summary_local_var->name = name;
    generation_summary_local_var->url = url;

    generation_summary_local_var->_library_owned = 1;
    return generation_summary_local_var;
}

__attribute__((deprecated)) generation_summary_t *generation_summary_create(
    char *name,
    char *url
    ) {
    return generation_summary_create_internal (
        name,
        url
        );
}

void generation_summary_free(generation_summary_t *generation_summary) {
    if(NULL == generation_summary){
        return ;
    }
    if(generation_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "generation_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (generation_summary->name) {
        free(generation_summary->name);
        generation_summary->name = NULL;
    }
    if (generation_summary->url) {
        free(generation_summary->url);
        generation_summary->url = NULL;
    }
    free(generation_summary);
}

cJSON *generation_summary_convertToJSON(generation_summary_t *generation_summary) {
    cJSON *item = cJSON_CreateObject();

    // generation_summary->name
    if (!generation_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", generation_summary->name) == NULL) {
    goto fail; //String
    }


    // generation_summary->url
    if (!generation_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", generation_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

generation_summary_t *generation_summary_parseFromJSON(cJSON *generation_summaryJSON){

    generation_summary_t *generation_summary_local_var = NULL;

    // generation_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(generation_summaryJSON, "name");
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

    // generation_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(generation_summaryJSON, "url");
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


    generation_summary_local_var = generation_summary_create_internal (
        strdup(name->valuestring),
        strdup(url->valuestring)
        );

    return generation_summary_local_var;
end:
    return NULL;

}
