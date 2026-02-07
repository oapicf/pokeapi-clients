#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_fling_effect_effect_text.h"



static item_fling_effect_effect_text_t *item_fling_effect_effect_text_create_internal(
    char *effect,
    language_summary_t *language
    ) {
    item_fling_effect_effect_text_t *item_fling_effect_effect_text_local_var = malloc(sizeof(item_fling_effect_effect_text_t));
    if (!item_fling_effect_effect_text_local_var) {
        return NULL;
    }
    item_fling_effect_effect_text_local_var->effect = effect;
    item_fling_effect_effect_text_local_var->language = language;

    item_fling_effect_effect_text_local_var->_library_owned = 1;
    return item_fling_effect_effect_text_local_var;
}

__attribute__((deprecated)) item_fling_effect_effect_text_t *item_fling_effect_effect_text_create(
    char *effect,
    language_summary_t *language
    ) {
    return item_fling_effect_effect_text_create_internal (
        effect,
        language
        );
}

void item_fling_effect_effect_text_free(item_fling_effect_effect_text_t *item_fling_effect_effect_text) {
    if(NULL == item_fling_effect_effect_text){
        return ;
    }
    if(item_fling_effect_effect_text->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_fling_effect_effect_text_free");
        return ;
    }
    listEntry_t *listEntry;
    if (item_fling_effect_effect_text->effect) {
        free(item_fling_effect_effect_text->effect);
        item_fling_effect_effect_text->effect = NULL;
    }
    if (item_fling_effect_effect_text->language) {
        language_summary_free(item_fling_effect_effect_text->language);
        item_fling_effect_effect_text->language = NULL;
    }
    free(item_fling_effect_effect_text);
}

cJSON *item_fling_effect_effect_text_convertToJSON(item_fling_effect_effect_text_t *item_fling_effect_effect_text) {
    cJSON *item = cJSON_CreateObject();

    // item_fling_effect_effect_text->effect
    if (!item_fling_effect_effect_text->effect) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "effect", item_fling_effect_effect_text->effect) == NULL) {
    goto fail; //String
    }


    // item_fling_effect_effect_text->language
    if (!item_fling_effect_effect_text->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(item_fling_effect_effect_text->language);
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

item_fling_effect_effect_text_t *item_fling_effect_effect_text_parseFromJSON(cJSON *item_fling_effect_effect_textJSON){

    item_fling_effect_effect_text_t *item_fling_effect_effect_text_local_var = NULL;

    // define the local variable for item_fling_effect_effect_text->language
    language_summary_t *language_local_nonprim = NULL;

    // item_fling_effect_effect_text->effect
    cJSON *effect = cJSON_GetObjectItemCaseSensitive(item_fling_effect_effect_textJSON, "effect");
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

    // item_fling_effect_effect_text->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(item_fling_effect_effect_textJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    item_fling_effect_effect_text_local_var = item_fling_effect_effect_text_create_internal (
        strdup(effect->valuestring),
        language_local_nonprim
        );

    return item_fling_effect_effect_text_local_var;
end:
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
