#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ability_effect_text.h"



static ability_effect_text_t *ability_effect_text_create_internal(
    char *effect,
    char *short_effect,
    language_summary_t *language
    ) {
    ability_effect_text_t *ability_effect_text_local_var = malloc(sizeof(ability_effect_text_t));
    if (!ability_effect_text_local_var) {
        return NULL;
    }
    memset(ability_effect_text_local_var, 0, sizeof(ability_effect_text_t));
    ability_effect_text_local_var->_library_owned = 1;
    ability_effect_text_local_var->effect = effect;
    ability_effect_text_local_var->short_effect = short_effect;
    ability_effect_text_local_var->language = language;
    return ability_effect_text_local_var;
}

__attribute__((deprecated)) ability_effect_text_t *ability_effect_text_create(
    char *effect,
    char *short_effect,
    language_summary_t *language
    ) {
    ability_effect_text_t *result = ability_effect_text_create_internal (
        effect,
        short_effect,
        language
        );
    if (!result) {
    }
    return result;
}

void ability_effect_text_free(ability_effect_text_t *ability_effect_text) {
    if(NULL == ability_effect_text){
        return ;
    }
    if(ability_effect_text->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ability_effect_text_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ability_effect_text->effect) {
        free(ability_effect_text->effect);
        ability_effect_text->effect = NULL;
    }
    if (ability_effect_text->short_effect) {
        free(ability_effect_text->short_effect);
        ability_effect_text->short_effect = NULL;
    }
    if (ability_effect_text->language) {
        language_summary_free(ability_effect_text->language);
        ability_effect_text->language = NULL;
    }
    free(ability_effect_text);
}

cJSON *ability_effect_text_convertToJSON(ability_effect_text_t *ability_effect_text) {
    cJSON *item = cJSON_CreateObject();

    // ability_effect_text->effect
    if (!ability_effect_text->effect) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "effect", ability_effect_text->effect) == NULL) {
    goto fail; //String
    }


    // ability_effect_text->short_effect
    if (!ability_effect_text->short_effect) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "short_effect", ability_effect_text->short_effect) == NULL) {
    goto fail; //String
    }


    // ability_effect_text->language
    if (!ability_effect_text->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(ability_effect_text->language);
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

ability_effect_text_t *ability_effect_text_parseFromJSON(cJSON *ability_effect_textJSON){

    ability_effect_text_t *ability_effect_text_local_var = NULL;

    char *effect_local_str = NULL;

    char *short_effect_local_str = NULL;

    // define the local variable for ability_effect_text->language
    language_summary_t *language_local_nonprim = NULL;

    // ability_effect_text->effect
    cJSON *effect = cJSON_GetObjectItemCaseSensitive(ability_effect_textJSON, "effect");
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

    // ability_effect_text->short_effect
    cJSON *short_effect = cJSON_GetObjectItemCaseSensitive(ability_effect_textJSON, "short_effect");
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

    // ability_effect_text->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(ability_effect_textJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    if (effect && !cJSON_IsNull(effect)) effect_local_str = strdup(effect->valuestring);
    if (short_effect && !cJSON_IsNull(short_effect)) short_effect_local_str = strdup(short_effect->valuestring);

    ability_effect_text_local_var = ability_effect_text_create_internal (
        effect_local_str,
        short_effect_local_str,
        language_local_nonprim
        );

    if (!ability_effect_text_local_var) {
        goto end;
    }

    return ability_effect_text_local_var;
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
