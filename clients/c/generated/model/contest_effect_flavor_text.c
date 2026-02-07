#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "contest_effect_flavor_text.h"



static contest_effect_flavor_text_t *contest_effect_flavor_text_create_internal(
    char *flavor_text,
    language_summary_t *language
    ) {
    contest_effect_flavor_text_t *contest_effect_flavor_text_local_var = malloc(sizeof(contest_effect_flavor_text_t));
    if (!contest_effect_flavor_text_local_var) {
        return NULL;
    }
    contest_effect_flavor_text_local_var->flavor_text = flavor_text;
    contest_effect_flavor_text_local_var->language = language;

    contest_effect_flavor_text_local_var->_library_owned = 1;
    return contest_effect_flavor_text_local_var;
}

__attribute__((deprecated)) contest_effect_flavor_text_t *contest_effect_flavor_text_create(
    char *flavor_text,
    language_summary_t *language
    ) {
    return contest_effect_flavor_text_create_internal (
        flavor_text,
        language
        );
}

void contest_effect_flavor_text_free(contest_effect_flavor_text_t *contest_effect_flavor_text) {
    if(NULL == contest_effect_flavor_text){
        return ;
    }
    if(contest_effect_flavor_text->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "contest_effect_flavor_text_free");
        return ;
    }
    listEntry_t *listEntry;
    if (contest_effect_flavor_text->flavor_text) {
        free(contest_effect_flavor_text->flavor_text);
        contest_effect_flavor_text->flavor_text = NULL;
    }
    if (contest_effect_flavor_text->language) {
        language_summary_free(contest_effect_flavor_text->language);
        contest_effect_flavor_text->language = NULL;
    }
    free(contest_effect_flavor_text);
}

cJSON *contest_effect_flavor_text_convertToJSON(contest_effect_flavor_text_t *contest_effect_flavor_text) {
    cJSON *item = cJSON_CreateObject();

    // contest_effect_flavor_text->flavor_text
    if (!contest_effect_flavor_text->flavor_text) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "flavor_text", contest_effect_flavor_text->flavor_text) == NULL) {
    goto fail; //String
    }


    // contest_effect_flavor_text->language
    if (!contest_effect_flavor_text->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(contest_effect_flavor_text->language);
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

contest_effect_flavor_text_t *contest_effect_flavor_text_parseFromJSON(cJSON *contest_effect_flavor_textJSON){

    contest_effect_flavor_text_t *contest_effect_flavor_text_local_var = NULL;

    // define the local variable for contest_effect_flavor_text->language
    language_summary_t *language_local_nonprim = NULL;

    // contest_effect_flavor_text->flavor_text
    cJSON *flavor_text = cJSON_GetObjectItemCaseSensitive(contest_effect_flavor_textJSON, "flavor_text");
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

    // contest_effect_flavor_text->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(contest_effect_flavor_textJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    contest_effect_flavor_text_local_var = contest_effect_flavor_text_create_internal (
        strdup(flavor_text->valuestring),
        language_local_nonprim
        );

    return contest_effect_flavor_text_local_var;
end:
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
