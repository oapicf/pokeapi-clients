#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_damage_class_summary.h"



static move_damage_class_summary_t *move_damage_class_summary_create_internal(
    char *name,
    char *url
    ) {
    move_damage_class_summary_t *move_damage_class_summary_local_var = malloc(sizeof(move_damage_class_summary_t));
    if (!move_damage_class_summary_local_var) {
        return NULL;
    }
    move_damage_class_summary_local_var->name = name;
    move_damage_class_summary_local_var->url = url;

    move_damage_class_summary_local_var->_library_owned = 1;
    return move_damage_class_summary_local_var;
}

__attribute__((deprecated)) move_damage_class_summary_t *move_damage_class_summary_create(
    char *name,
    char *url
    ) {
    return move_damage_class_summary_create_internal (
        name,
        url
        );
}

void move_damage_class_summary_free(move_damage_class_summary_t *move_damage_class_summary) {
    if(NULL == move_damage_class_summary){
        return ;
    }
    if(move_damage_class_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_damage_class_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_damage_class_summary->name) {
        free(move_damage_class_summary->name);
        move_damage_class_summary->name = NULL;
    }
    if (move_damage_class_summary->url) {
        free(move_damage_class_summary->url);
        move_damage_class_summary->url = NULL;
    }
    free(move_damage_class_summary);
}

cJSON *move_damage_class_summary_convertToJSON(move_damage_class_summary_t *move_damage_class_summary) {
    cJSON *item = cJSON_CreateObject();

    // move_damage_class_summary->name
    if (!move_damage_class_summary->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", move_damage_class_summary->name) == NULL) {
    goto fail; //String
    }


    // move_damage_class_summary->url
    if (!move_damage_class_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", move_damage_class_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

move_damage_class_summary_t *move_damage_class_summary_parseFromJSON(cJSON *move_damage_class_summaryJSON){

    move_damage_class_summary_t *move_damage_class_summary_local_var = NULL;

    // move_damage_class_summary->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(move_damage_class_summaryJSON, "name");
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

    // move_damage_class_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(move_damage_class_summaryJSON, "url");
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


    move_damage_class_summary_local_var = move_damage_class_summary_create_internal (
        strdup(name->valuestring),
        strdup(url->valuestring)
        );

    return move_damage_class_summary_local_var;
end:
    return NULL;

}
