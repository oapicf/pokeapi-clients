#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_target_summary.h"



static move_target_summary_t *move_target_summary_create_internal(
    char *name,
    char *url
    ) {
    move_target_summary_t *move_target_summary_local_var = malloc(sizeof(move_target_summary_t));
    if (!move_target_summary_local_var) {
        return NULL;
    }
    move_target_summary_local_var->name = name;
    move_target_summary_local_var->url = url;

    move_target_summary_local_var->_library_owned = 1;
    return move_target_summary_local_var;
}

__attribute__((deprecated)) move_target_summary_t *move_target_summary_create(
    char *name,
    char *url
    ) {
    return move_target_summary_create_internal (
        name,
        url
        );
}

void move_target_summary_free(move_target_summary_t *move_target_summary) {
    if(NULL == move_target_summary){
        return ;
    }
    if(move_target_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_target_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_target_summary->name) {
        free(move_target_summary->name);
        move_target_summary->name = NULL;
    }
    if (move_target_summary->url) {
        free(move_target_summary->url);
        move_target_summary->url = NULL;
    }
    free(move_target_summary);
}

cJSON *move_target_summary_convertToJSON(move_target_summary_t *move_target_summary) {
    cJSON *item = cJSON_CreateObject();

    // move_target_summary->name
    if (!move_target_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", move_target_summary->name) == NULL) {
    goto fail; //String
    }


    // move_target_summary->url
    if (!move_target_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", move_target_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

move_target_summary_t *move_target_summary_parseFromJSON(cJSON *move_target_summaryJSON){

    move_target_summary_t *move_target_summary_local_var = NULL;

    // move_target_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(move_target_summaryJSON, "name");
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

    // move_target_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(move_target_summaryJSON, "url");
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


    move_target_summary_local_var = move_target_summary_create_internal (
        strdup(name->valuestring),
        strdup(url->valuestring)
        );

    return move_target_summary_local_var;
end:
    return NULL;

}
