#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_flavor_text.h"



static item_flavor_text_t *item_flavor_text_create_internal(
    char *text,
    version_group_summary_t *version_group,
    language_summary_t *language
    ) {
    item_flavor_text_t *item_flavor_text_local_var = malloc(sizeof(item_flavor_text_t));
    if (!item_flavor_text_local_var) {
        return NULL;
    }
    item_flavor_text_local_var->text = text;
    item_flavor_text_local_var->version_group = version_group;
    item_flavor_text_local_var->language = language;

    item_flavor_text_local_var->_library_owned = 1;
    return item_flavor_text_local_var;
}

__attribute__((deprecated)) item_flavor_text_t *item_flavor_text_create(
    char *text,
    version_group_summary_t *version_group,
    language_summary_t *language
    ) {
    return item_flavor_text_create_internal (
        text,
        version_group,
        language
        );
}

void item_flavor_text_free(item_flavor_text_t *item_flavor_text) {
    if(NULL == item_flavor_text){
        return ;
    }
    if(item_flavor_text->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_flavor_text_free");
        return ;
    }
    listEntry_t *listEntry;
    if (item_flavor_text->text) {
        free(item_flavor_text->text);
        item_flavor_text->text = NULL;
    }
    if (item_flavor_text->version_group) {
        version_group_summary_free(item_flavor_text->version_group);
        item_flavor_text->version_group = NULL;
    }
    if (item_flavor_text->language) {
        language_summary_free(item_flavor_text->language);
        item_flavor_text->language = NULL;
    }
    free(item_flavor_text);
}

cJSON *item_flavor_text_convertToJSON(item_flavor_text_t *item_flavor_text) {
    cJSON *item = cJSON_CreateObject();

    // item_flavor_text->text
    if (!item_flavor_text->text) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "text", item_flavor_text->text) == NULL) {
    goto fail; //String
    }


    // item_flavor_text->version_group
    if (!item_flavor_text->version_group) {
        goto fail;
    }
    cJSON *version_group_local_JSON = version_group_summary_convertToJSON(item_flavor_text->version_group);
    if(version_group_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "version_group", version_group_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // item_flavor_text->language
    if (!item_flavor_text->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(item_flavor_text->language);
    if(language_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "language", language_local_JSON);
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

item_flavor_text_t *item_flavor_text_parseFromJSON(cJSON *item_flavor_textJSON){

    item_flavor_text_t *item_flavor_text_local_var = NULL;

    // define the local variable for item_flavor_text->version_group
    version_group_summary_t *version_group_local_nonprim = NULL;

    // define the local variable for item_flavor_text->language
    language_summary_t *language_local_nonprim = NULL;

    // item_flavor_text->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(item_flavor_textJSON, "text");
    if (cJSON_IsNull(text)) {
        text = NULL;
    }
    if (!text) {
        goto end;
    }

    
    if(!cJSON_IsString(text))
    {
    goto end; //String
    }

    // item_flavor_text->version_group
    cJSON *version_group = cJSON_GetObjectItemCaseSensitive(item_flavor_textJSON, "version_group");
    if (cJSON_IsNull(version_group)) {
        version_group = NULL;
    }
    if (!version_group) {
        goto end;
    }

    
    version_group_local_nonprim = version_group_summary_parseFromJSON(version_group); //nonprimitive

    // item_flavor_text->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(item_flavor_textJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    item_flavor_text_local_var = item_flavor_text_create_internal (
        strdup(text->valuestring),
        version_group_local_nonprim,
        language_local_nonprim
        );

    return item_flavor_text_local_var;
end:
    if (version_group_local_nonprim) {
        version_group_summary_free(version_group_local_nonprim);
        version_group_local_nonprim = NULL;
    }
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
