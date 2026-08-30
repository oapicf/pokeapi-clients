#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_learn_method_summary.h"



static move_learn_method_summary_t *move_learn_method_summary_create_internal(
    char *name,
    char *url
    ) {
    move_learn_method_summary_t *move_learn_method_summary_local_var = malloc(sizeof(move_learn_method_summary_t));
    if (!move_learn_method_summary_local_var) {
        return NULL;
    }
    memset(move_learn_method_summary_local_var, 0, sizeof(move_learn_method_summary_t));
    move_learn_method_summary_local_var->_library_owned = 1;
    move_learn_method_summary_local_var->name = name;
    move_learn_method_summary_local_var->url = url;
    return move_learn_method_summary_local_var;
}

__attribute__((deprecated)) move_learn_method_summary_t *move_learn_method_summary_create(
    char *name,
    char *url
    ) {
    move_learn_method_summary_t *result = move_learn_method_summary_create_internal (
        name,
        url
        );
    if (!result) {
    }
    return result;
}

void move_learn_method_summary_free(move_learn_method_summary_t *move_learn_method_summary) {
    if(NULL == move_learn_method_summary){
        return ;
    }
    if(move_learn_method_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_learn_method_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_learn_method_summary->name) {
        free(move_learn_method_summary->name);
        move_learn_method_summary->name = NULL;
    }
    if (move_learn_method_summary->url) {
        free(move_learn_method_summary->url);
        move_learn_method_summary->url = NULL;
    }
    free(move_learn_method_summary);
}

cJSON *move_learn_method_summary_convertToJSON(move_learn_method_summary_t *move_learn_method_summary) {
    cJSON *item = cJSON_CreateObject();

    // move_learn_method_summary->name
    if (!move_learn_method_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", move_learn_method_summary->name) == NULL) {
    goto fail; //String
    }


    // move_learn_method_summary->url
    if (!move_learn_method_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", move_learn_method_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

move_learn_method_summary_t *move_learn_method_summary_parseFromJSON(cJSON *move_learn_method_summaryJSON){

    move_learn_method_summary_t *move_learn_method_summary_local_var = NULL;

    char *name_local_str = NULL;

    char *url_local_str = NULL;

    // move_learn_method_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(move_learn_method_summaryJSON, "name");
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

    // move_learn_method_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(move_learn_method_summaryJSON, "url");
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

    move_learn_method_summary_local_var = move_learn_method_summary_create_internal (
        name_local_str,
        url_local_str
        );

    if (!move_learn_method_summary_local_var) {
        goto end;
    }

    return move_learn_method_summary_local_var;
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
