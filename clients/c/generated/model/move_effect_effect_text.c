#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_effect_effect_text.h"



static move_effect_effect_text_t *move_effect_effect_text_create_internal(
    char *effect,
    char *short_effect,
    language_summary_t *language
    ) {
    move_effect_effect_text_t *move_effect_effect_text_local_var = malloc(sizeof(move_effect_effect_text_t));
    if (!move_effect_effect_text_local_var) {
        return NULL;
    }
    memset(move_effect_effect_text_local_var, 0, sizeof(move_effect_effect_text_t));
    move_effect_effect_text_local_var->_library_owned = 1;
    move_effect_effect_text_local_var->effect = effect;
    move_effect_effect_text_local_var->short_effect = short_effect;
    move_effect_effect_text_local_var->language = language;
    return move_effect_effect_text_local_var;
}

__attribute__((deprecated)) move_effect_effect_text_t *move_effect_effect_text_create(
    char *effect,
    char *short_effect,
    language_summary_t *language
    ) {
    move_effect_effect_text_t *result = move_effect_effect_text_create_internal (
        effect,
        short_effect,
        language
        );
    if (!result) {
    }
    return result;
}

void move_effect_effect_text_free(move_effect_effect_text_t *move_effect_effect_text) {
    if(NULL == move_effect_effect_text){
        return ;
    }
    if(move_effect_effect_text->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_effect_effect_text_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_effect_effect_text->effect) {
        free(move_effect_effect_text->effect);
        move_effect_effect_text->effect = NULL;
    }
    if (move_effect_effect_text->short_effect) {
        free(move_effect_effect_text->short_effect);
        move_effect_effect_text->short_effect = NULL;
    }
    if (move_effect_effect_text->language) {
        language_summary_free(move_effect_effect_text->language);
        move_effect_effect_text->language = NULL;
    }
    free(move_effect_effect_text);
}

cJSON *move_effect_effect_text_convertToJSON(move_effect_effect_text_t *move_effect_effect_text) {
    cJSON *item = cJSON_CreateObject();

    // move_effect_effect_text->effect
    if (!move_effect_effect_text->effect) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "effect", move_effect_effect_text->effect) == NULL) {
    goto fail; //String
    }


    // move_effect_effect_text->short_effect
    if (!move_effect_effect_text->short_effect) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "short_effect", move_effect_effect_text->short_effect) == NULL) {
    goto fail; //String
    }


    // move_effect_effect_text->language
    if (!move_effect_effect_text->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(move_effect_effect_text->language);
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

move_effect_effect_text_t *move_effect_effect_text_parseFromJSON(cJSON *move_effect_effect_textJSON){

    move_effect_effect_text_t *move_effect_effect_text_local_var = NULL;

    char *effect_local_str = NULL;

    char *short_effect_local_str = NULL;

    // define the local variable for move_effect_effect_text->language
    language_summary_t *language_local_nonprim = NULL;

    // move_effect_effect_text->effect
    cJSON *effect = cJSON_GetObjectItemCaseSensitive(move_effect_effect_textJSON, "effect");
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

    // move_effect_effect_text->short_effect
    cJSON *short_effect = cJSON_GetObjectItemCaseSensitive(move_effect_effect_textJSON, "short_effect");
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

    // move_effect_effect_text->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(move_effect_effect_textJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    if (effect && !cJSON_IsNull(effect)) effect_local_str = strdup(effect->valuestring);
    if (short_effect && !cJSON_IsNull(short_effect)) short_effect_local_str = strdup(short_effect->valuestring);

    move_effect_effect_text_local_var = move_effect_effect_text_create_internal (
        effect_local_str,
        short_effect_local_str,
        language_local_nonprim
        );

    if (!move_effect_effect_text_local_var) {
        goto end;
    }

    return move_effect_effect_text_local_var;
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
