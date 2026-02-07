#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_flavor_text.h"



static move_flavor_text_t *move_flavor_text_create_internal(
    char *flavor_text,
    language_summary_t *language,
    version_group_summary_t *version_group
    ) {
    move_flavor_text_t *move_flavor_text_local_var = malloc(sizeof(move_flavor_text_t));
    if (!move_flavor_text_local_var) {
        return NULL;
    }
    move_flavor_text_local_var->flavor_text = flavor_text;
    move_flavor_text_local_var->language = language;
    move_flavor_text_local_var->version_group = version_group;

    move_flavor_text_local_var->_library_owned = 1;
    return move_flavor_text_local_var;
}

__attribute__((deprecated)) move_flavor_text_t *move_flavor_text_create(
    char *flavor_text,
    language_summary_t *language,
    version_group_summary_t *version_group
    ) {
    return move_flavor_text_create_internal (
        flavor_text,
        language,
        version_group
        );
}

void move_flavor_text_free(move_flavor_text_t *move_flavor_text) {
    if(NULL == move_flavor_text){
        return ;
    }
    if(move_flavor_text->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_flavor_text_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_flavor_text->flavor_text) {
        free(move_flavor_text->flavor_text);
        move_flavor_text->flavor_text = NULL;
    }
    if (move_flavor_text->language) {
        language_summary_free(move_flavor_text->language);
        move_flavor_text->language = NULL;
    }
    if (move_flavor_text->version_group) {
        version_group_summary_free(move_flavor_text->version_group);
        move_flavor_text->version_group = NULL;
    }
    free(move_flavor_text);
}

cJSON *move_flavor_text_convertToJSON(move_flavor_text_t *move_flavor_text) {
    cJSON *item = cJSON_CreateObject();

    // move_flavor_text->flavor_text
    if (!move_flavor_text->flavor_text) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "flavor_text", move_flavor_text->flavor_text) == NULL) {
    goto fail; //String
    }


    // move_flavor_text->language
    if (!move_flavor_text->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(move_flavor_text->language);
    if(language_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "language", language_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // move_flavor_text->version_group
    if (!move_flavor_text->version_group) {
        goto fail;
    }
    cJSON *version_group_local_JSON = version_group_summary_convertToJSON(move_flavor_text->version_group);
    if(version_group_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "version_group", version_group_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

move_flavor_text_t *move_flavor_text_parseFromJSON(cJSON *move_flavor_textJSON){

    move_flavor_text_t *move_flavor_text_local_var = NULL;

    // define the local variable for move_flavor_text->language
    language_summary_t *language_local_nonprim = NULL;

    // define the local variable for move_flavor_text->version_group
    version_group_summary_t *version_group_local_nonprim = NULL;

    // move_flavor_text->flavor_text
    cJSON *flavor_text = cJSON_GetObjectItemCaseSensitive(move_flavor_textJSON, "flavor_text");
    if (cJSON_IsNull(flavor_text)) {
        flavor_text = NULL;
    }
    if (!flavor_text) {
        goto end;
    }

    
    if(!cJSON_IsString(flavor_text))
    {
    goto end; //String
    }

    // move_flavor_text->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(move_flavor_textJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive

    // move_flavor_text->version_group
    cJSON *version_group = cJSON_GetObjectItemCaseSensitive(move_flavor_textJSON, "version_group");
    if (cJSON_IsNull(version_group)) {
        version_group = NULL;
    }
    if (!version_group) {
        goto end;
    }

    
    version_group_local_nonprim = version_group_summary_parseFromJSON(version_group); //nonprimitive


    move_flavor_text_local_var = move_flavor_text_create_internal (
        strdup(flavor_text->valuestring),
        language_local_nonprim,
        version_group_local_nonprim
        );

    return move_flavor_text_local_var;
end:
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    if (version_group_local_nonprim) {
        version_group_summary_free(version_group_local_nonprim);
        version_group_local_nonprim = NULL;
    }
    return NULL;

}
