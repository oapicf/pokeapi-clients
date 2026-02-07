#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_meta_category_summary.h"



static move_meta_category_summary_t *move_meta_category_summary_create_internal(
    char *name,
    char *url
    ) {
    move_meta_category_summary_t *move_meta_category_summary_local_var = malloc(sizeof(move_meta_category_summary_t));
    if (!move_meta_category_summary_local_var) {
        return NULL;
    }
    move_meta_category_summary_local_var->name = name;
    move_meta_category_summary_local_var->url = url;

    move_meta_category_summary_local_var->_library_owned = 1;
    return move_meta_category_summary_local_var;
}

__attribute__((deprecated)) move_meta_category_summary_t *move_meta_category_summary_create(
    char *name,
    char *url
    ) {
    return move_meta_category_summary_create_internal (
        name,
        url
        );
}

void move_meta_category_summary_free(move_meta_category_summary_t *move_meta_category_summary) {
    if(NULL == move_meta_category_summary){
        return ;
    }
    if(move_meta_category_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_meta_category_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_meta_category_summary->name) {
        free(move_meta_category_summary->name);
        move_meta_category_summary->name = NULL;
    }
    if (move_meta_category_summary->url) {
        free(move_meta_category_summary->url);
        move_meta_category_summary->url = NULL;
    }
    free(move_meta_category_summary);
}

cJSON *move_meta_category_summary_convertToJSON(move_meta_category_summary_t *move_meta_category_summary) {
    cJSON *item = cJSON_CreateObject();

    // move_meta_category_summary->name
    if (!move_meta_category_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", move_meta_category_summary->name) == NULL) {
    goto fail; //String
    }


    // move_meta_category_summary->url
    if (!move_meta_category_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", move_meta_category_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

move_meta_category_summary_t *move_meta_category_summary_parseFromJSON(cJSON *move_meta_category_summaryJSON){

    move_meta_category_summary_t *move_meta_category_summary_local_var = NULL;

    // move_meta_category_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(move_meta_category_summaryJSON, "name");
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

    // move_meta_category_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(move_meta_category_summaryJSON, "url");
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


    move_meta_category_summary_local_var = move_meta_category_summary_create_internal (
        strdup(name->valuestring),
        strdup(url->valuestring)
        );

    return move_meta_category_summary_local_var;
end:
    return NULL;

}
