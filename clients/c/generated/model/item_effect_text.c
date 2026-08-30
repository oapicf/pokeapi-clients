#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_effect_text.h"



static item_effect_text_t *item_effect_text_create_internal(
    char *effect,
    char *short_effect,
    language_summary_t *language
    ) {
    item_effect_text_t *item_effect_text_local_var = malloc(sizeof(item_effect_text_t));
    if (!item_effect_text_local_var) {
        return NULL;
    }
    memset(item_effect_text_local_var, 0, sizeof(item_effect_text_t));
    item_effect_text_local_var->_library_owned = 1;
    item_effect_text_local_var->effect = effect;
    item_effect_text_local_var->short_effect = short_effect;
    item_effect_text_local_var->language = language;
    return item_effect_text_local_var;
}

__attribute__((deprecated)) item_effect_text_t *item_effect_text_create(
    char *effect,
    char *short_effect,
    language_summary_t *language
    ) {
    item_effect_text_t *result = item_effect_text_create_internal (
        effect,
        short_effect,
        language
        );
    if (!result) {
    }
    return result;
}

void item_effect_text_free(item_effect_text_t *item_effect_text) {
    if(NULL == item_effect_text){
        return ;
    }
    if(item_effect_text->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_effect_text_free");
        return ;
    }
    listEntry_t *listEntry;
    if (item_effect_text->effect) {
        free(item_effect_text->effect);
        item_effect_text->effect = NULL;
    }
    if (item_effect_text->short_effect) {
        free(item_effect_text->short_effect);
        item_effect_text->short_effect = NULL;
    }
    if (item_effect_text->language) {
        language_summary_free(item_effect_text->language);
        item_effect_text->language = NULL;
    }
    free(item_effect_text);
}

cJSON *item_effect_text_convertToJSON(item_effect_text_t *item_effect_text) {
    cJSON *item = cJSON_CreateObject();

    // item_effect_text->effect
    if (!item_effect_text->effect) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "effect", item_effect_text->effect) == NULL) {
    goto fail; //String
    }


    // item_effect_text->short_effect
    if (!item_effect_text->short_effect) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "short_effect", item_effect_text->short_effect) == NULL) {
    goto fail; //String
    }


    // item_effect_text->language
    if (!item_effect_text->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(item_effect_text->language);
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

item_effect_text_t *item_effect_text_parseFromJSON(cJSON *item_effect_textJSON){

    item_effect_text_t *item_effect_text_local_var = NULL;

    char *effect_local_str = NULL;

    char *short_effect_local_str = NULL;

    // define the local variable for item_effect_text->language
    language_summary_t *language_local_nonprim = NULL;

    // item_effect_text->effect
    cJSON *effect = cJSON_GetObjectItemCaseSensitive(item_effect_textJSON, "effect");
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

    // item_effect_text->short_effect
    cJSON *short_effect = cJSON_GetObjectItemCaseSensitive(item_effect_textJSON, "short_effect");
    if (cJSON_IsNull(short_effect)) {
        short_effect = NULL;
    }
    if (!short_effect) {
        goto end;
    }

    
    if(!cJSON_IsString(short_effect))
    {
    goto end; //String
    }

    // item_effect_text->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(item_effect_textJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    if (effect && !cJSON_IsNull(effect)) effect_local_str = strdup(effect->valuestring);
    if (short_effect && !cJSON_IsNull(short_effect)) short_effect_local_str = strdup(short_effect->valuestring);

    item_effect_text_local_var = item_effect_text_create_internal (
        effect_local_str,
        short_effect_local_str,
        language_local_nonprim
        );

    if (!item_effect_text_local_var) {
        goto end;
    }

    return item_effect_text_local_var;
end:
    if (effect_local_str) {
        free(effect_local_str);
        effect_local_str = NULL;
    }
    if (short_effect_local_str) {
        free(short_effect_local_str);
        short_effect_local_str = NULL;
    }
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
