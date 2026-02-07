#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_change_effect_entries_inner.h"



static move_change_effect_entries_inner_t *move_change_effect_entries_inner_create_internal(
    char *effect,
    char *short_effect,
    ability_detail_pokemon_inner_pokemon_t *language
    ) {
    move_change_effect_entries_inner_t *move_change_effect_entries_inner_local_var = malloc(sizeof(move_change_effect_entries_inner_t));
    if (!move_change_effect_entries_inner_local_var) {
        return NULL;
    }
    move_change_effect_entries_inner_local_var->effect = effect;
    move_change_effect_entries_inner_local_var->short_effect = short_effect;
    move_change_effect_entries_inner_local_var->language = language;

    move_change_effect_entries_inner_local_var->_library_owned = 1;
    return move_change_effect_entries_inner_local_var;
}

__attribute__((deprecated)) move_change_effect_entries_inner_t *move_change_effect_entries_inner_create(
    char *effect,
    char *short_effect,
    ability_detail_pokemon_inner_pokemon_t *language
    ) {
    return move_change_effect_entries_inner_create_internal (
        effect,
        short_effect,
        language
        );
}

void move_change_effect_entries_inner_free(move_change_effect_entries_inner_t *move_change_effect_entries_inner) {
    if(NULL == move_change_effect_entries_inner){
        return ;
    }
    if(move_change_effect_entries_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_change_effect_entries_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_change_effect_entries_inner->effect) {
        free(move_change_effect_entries_inner->effect);
        move_change_effect_entries_inner->effect = NULL;
    }
    if (move_change_effect_entries_inner->short_effect) {
        free(move_change_effect_entries_inner->short_effect);
        move_change_effect_entries_inner->short_effect = NULL;
    }
    if (move_change_effect_entries_inner->language) {
        ability_detail_pokemon_inner_pokemon_free(move_change_effect_entries_inner->language);
        move_change_effect_entries_inner->language = NULL;
    }
    free(move_change_effect_entries_inner);
}

cJSON *move_change_effect_entries_inner_convertToJSON(move_change_effect_entries_inner_t *move_change_effect_entries_inner) {
    cJSON *item = cJSON_CreateObject();

    // move_change_effect_entries_inner->effect
    if (!move_change_effect_entries_inner->effect) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "effect", move_change_effect_entries_inner->effect) == NULL) {
    goto fail; //String
    }


    // move_change_effect_entries_inner->short_effect
    if (!move_change_effect_entries_inner->short_effect) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "short_effect", move_change_effect_entries_inner->short_effect) == NULL) {
    goto fail; //String
    }


    // move_change_effect_entries_inner->language
    if (!move_change_effect_entries_inner->language) {
        goto fail;
    }
    cJSON *language_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(move_change_effect_entries_inner->language);
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

move_change_effect_entries_inner_t *move_change_effect_entries_inner_parseFromJSON(cJSON *move_change_effect_entries_innerJSON){

    move_change_effect_entries_inner_t *move_change_effect_entries_inner_local_var = NULL;

    // define the local variable for move_change_effect_entries_inner->language
    ability_detail_pokemon_inner_pokemon_t *language_local_nonprim = NULL;

    // move_change_effect_entries_inner->effect
    cJSON *effect = cJSON_GetObjectItemCaseSensitive(move_change_effect_entries_innerJSON, "effect");
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

    // move_change_effect_entries_inner->short_effect
    cJSON *short_effect = cJSON_GetObjectItemCaseSensitive(move_change_effect_entries_innerJSON, "short_effect");
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

    // move_change_effect_entries_inner->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(move_change_effect_entries_innerJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(language); //nonprimitive


    move_change_effect_entries_inner_local_var = move_change_effect_entries_inner_create_internal (
        strdup(effect->valuestring),
        strdup(short_effect->valuestring),
        language_local_nonprim
        );

    return move_change_effect_entries_inner_local_var;
end:
    if (language_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
