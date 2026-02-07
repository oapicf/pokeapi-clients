#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "contest_effect_effect_text.h"



static contest_effect_effect_text_t *contest_effect_effect_text_create_internal(
    char *effect,
    language_summary_t *language
    ) {
    contest_effect_effect_text_t *contest_effect_effect_text_local_var = malloc(sizeof(contest_effect_effect_text_t));
    if (!contest_effect_effect_text_local_var) {
        return NULL;
    }
    contest_effect_effect_text_local_var->effect = effect;
    contest_effect_effect_text_local_var->language = language;

    contest_effect_effect_text_local_var->_library_owned = 1;
    return contest_effect_effect_text_local_var;
}

__attribute__((deprecated)) contest_effect_effect_text_t *contest_effect_effect_text_create(
    char *effect,
    language_summary_t *language
    ) {
    return contest_effect_effect_text_create_internal (
        effect,
        language
        );
}

void contest_effect_effect_text_free(contest_effect_effect_text_t *contest_effect_effect_text) {
    if(NULL == contest_effect_effect_text){
        return ;
    }
    if(contest_effect_effect_text->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "contest_effect_effect_text_free");
        return ;
    }
    listEntry_t *listEntry;
    if (contest_effect_effect_text->effect) {
        free(contest_effect_effect_text->effect);
        contest_effect_effect_text->effect = NULL;
    }
    if (contest_effect_effect_text->language) {
        language_summary_free(contest_effect_effect_text->language);
        contest_effect_effect_text->language = NULL;
    }
    free(contest_effect_effect_text);
}

cJSON *contest_effect_effect_text_convertToJSON(contest_effect_effect_text_t *contest_effect_effect_text) {
    cJSON *item = cJSON_CreateObject();

    // contest_effect_effect_text->effect
    if (!contest_effect_effect_text->effect) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "effect", contest_effect_effect_text->effect) == NULL) {
    goto fail; //String
    }


    // contest_effect_effect_text->language
    if (!contest_effect_effect_text->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(contest_effect_effect_text->language);
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

contest_effect_effect_text_t *contest_effect_effect_text_parseFromJSON(cJSON *contest_effect_effect_textJSON){

    contest_effect_effect_text_t *contest_effect_effect_text_local_var = NULL;

    // define the local variable for contest_effect_effect_text->language
    language_summary_t *language_local_nonprim = NULL;

    // contest_effect_effect_text->effect
    cJSON *effect = cJSON_GetObjectItemCaseSensitive(contest_effect_effect_textJSON, "effect");
    if (cJSON_IsNull(effect)) {
        effect = NULL;
    }
    if (!effect) {
        goto end;
    }

    
    if(!cJSON_IsString(effect))
    {
    goto end; //String
    }

    // contest_effect_effect_text->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(contest_effect_effect_textJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    contest_effect_effect_text_local_var = contest_effect_effect_text_create_internal (
        strdup(effect->valuestring),
        language_local_nonprim
        );

    return contest_effect_effect_text_local_var;
end:
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
