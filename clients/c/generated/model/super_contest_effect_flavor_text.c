#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "super_contest_effect_flavor_text.h"



static super_contest_effect_flavor_text_t *super_contest_effect_flavor_text_create_internal(
    char *flavor_text,
    language_summary_t *language
    ) {
    super_contest_effect_flavor_text_t *super_contest_effect_flavor_text_local_var = malloc(sizeof(super_contest_effect_flavor_text_t));
    if (!super_contest_effect_flavor_text_local_var) {
        return NULL;
    }
    super_contest_effect_flavor_text_local_var->flavor_text = flavor_text;
    super_contest_effect_flavor_text_local_var->language = language;

    super_contest_effect_flavor_text_local_var->_library_owned = 1;
    return super_contest_effect_flavor_text_local_var;
}

__attribute__((deprecated)) super_contest_effect_flavor_text_t *super_contest_effect_flavor_text_create(
    char *flavor_text,
    language_summary_t *language
    ) {
    return super_contest_effect_flavor_text_create_internal (
        flavor_text,
        language
        );
}

void super_contest_effect_flavor_text_free(super_contest_effect_flavor_text_t *super_contest_effect_flavor_text) {
    if(NULL == super_contest_effect_flavor_text){
        return ;
    }
    if(super_contest_effect_flavor_text->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "super_contest_effect_flavor_text_free");
        return ;
    }
    listEntry_t *listEntry;
    if (super_contest_effect_flavor_text->flavor_text) {
        free(super_contest_effect_flavor_text->flavor_text);
        super_contest_effect_flavor_text->flavor_text = NULL;
    }
    if (super_contest_effect_flavor_text->language) {
        language_summary_free(super_contest_effect_flavor_text->language);
        super_contest_effect_flavor_text->language = NULL;
    }
    free(super_contest_effect_flavor_text);
}

cJSON *super_contest_effect_flavor_text_convertToJSON(super_contest_effect_flavor_text_t *super_contest_effect_flavor_text) {
    cJSON *item = cJSON_CreateObject();

    // super_contest_effect_flavor_text->flavor_text
    if (!super_contest_effect_flavor_text->flavor_text) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "flavor_text", super_contest_effect_flavor_text->flavor_text) == NULL) {
    goto fail; //String
    }


    // super_contest_effect_flavor_text->language
    if (!super_contest_effect_flavor_text->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(super_contest_effect_flavor_text->language);
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

super_contest_effect_flavor_text_t *super_contest_effect_flavor_text_parseFromJSON(cJSON *super_contest_effect_flavor_textJSON){

    super_contest_effect_flavor_text_t *super_contest_effect_flavor_text_local_var = NULL;

    // define the local variable for super_contest_effect_flavor_text->language
    language_summary_t *language_local_nonprim = NULL;

    // super_contest_effect_flavor_text->flavor_text
    cJSON *flavor_text = cJSON_GetObjectItemCaseSensitive(super_contest_effect_flavor_textJSON, "flavor_text");
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

    // super_contest_effect_flavor_text->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(super_contest_effect_flavor_textJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    super_contest_effect_flavor_text_local_var = super_contest_effect_flavor_text_create_internal (
        strdup(flavor_text->valuestring),
        language_local_nonprim
        );

    return super_contest_effect_flavor_text_local_var;
end:
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
