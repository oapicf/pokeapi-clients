#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_detail_effect_changes_inner_effect_entries_inner.h"



static move_detail_effect_changes_inner_effect_entries_inner_t *move_detail_effect_changes_inner_effect_entries_inner_create_internal(
    char *effect,
    ability_detail_pokemon_inner_pokemon_t *language
    ) {
    move_detail_effect_changes_inner_effect_entries_inner_t *move_detail_effect_changes_inner_effect_entries_inner_local_var = malloc(sizeof(move_detail_effect_changes_inner_effect_entries_inner_t));
    if (!move_detail_effect_changes_inner_effect_entries_inner_local_var) {
        return NULL;
    }
    memset(move_detail_effect_changes_inner_effect_entries_inner_local_var, 0, sizeof(move_detail_effect_changes_inner_effect_entries_inner_t));
    move_detail_effect_changes_inner_effect_entries_inner_local_var->_library_owned = 1;
    move_detail_effect_changes_inner_effect_entries_inner_local_var->effect = effect;
    move_detail_effect_changes_inner_effect_entries_inner_local_var->language = language;
    return move_detail_effect_changes_inner_effect_entries_inner_local_var;
}

__attribute__((deprecated)) move_detail_effect_changes_inner_effect_entries_inner_t *move_detail_effect_changes_inner_effect_entries_inner_create(
    char *effect,
    ability_detail_pokemon_inner_pokemon_t *language
    ) {
    move_detail_effect_changes_inner_effect_entries_inner_t *result = move_detail_effect_changes_inner_effect_entries_inner_create_internal (
        effect,
        language
        );
    if (!result) {
    }
    return result;
}

void move_detail_effect_changes_inner_effect_entries_inner_free(move_detail_effect_changes_inner_effect_entries_inner_t *move_detail_effect_changes_inner_effect_entries_inner) {
    if(NULL == move_detail_effect_changes_inner_effect_entries_inner){
        return ;
    }
    if(move_detail_effect_changes_inner_effect_entries_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_detail_effect_changes_inner_effect_entries_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_detail_effect_changes_inner_effect_entries_inner->effect) {
        free(move_detail_effect_changes_inner_effect_entries_inner->effect);
        move_detail_effect_changes_inner_effect_entries_inner->effect = NULL;
    }
    if (move_detail_effect_changes_inner_effect_entries_inner->language) {
        ability_detail_pokemon_inner_pokemon_free(move_detail_effect_changes_inner_effect_entries_inner->language);
        move_detail_effect_changes_inner_effect_entries_inner->language = NULL;
    }
    free(move_detail_effect_changes_inner_effect_entries_inner);
}

cJSON *move_detail_effect_changes_inner_effect_entries_inner_convertToJSON(move_detail_effect_changes_inner_effect_entries_inner_t *move_detail_effect_changes_inner_effect_entries_inner) {
    cJSON *item = cJSON_CreateObject();

    // move_detail_effect_changes_inner_effect_entries_inner->effect
    if (!move_detail_effect_changes_inner_effect_entries_inner->effect) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "effect", move_detail_effect_changes_inner_effect_entries_inner->effect) == NULL) {
    goto fail; //String
    }


    // move_detail_effect_changes_inner_effect_entries_inner->language
    if (!move_detail_effect_changes_inner_effect_entries_inner->language) {
        goto fail;
    }
    cJSON *language_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(move_detail_effect_changes_inner_effect_entries_inner->language);
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

move_detail_effect_changes_inner_effect_entries_inner_t *move_detail_effect_changes_inner_effect_entries_inner_parseFromJSON(cJSON *move_detail_effect_changes_inner_effect_entries_innerJSON){

    move_detail_effect_changes_inner_effect_entries_inner_t *move_detail_effect_changes_inner_effect_entries_inner_local_var = NULL;

    char *effect_local_str = NULL;

    // define the local variable for move_detail_effect_changes_inner_effect_entries_inner->language
    ability_detail_pokemon_inner_pokemon_t *language_local_nonprim = NULL;

    // move_detail_effect_changes_inner_effect_entries_inner->effect
    cJSON *effect = cJSON_GetObjectItemCaseSensitive(move_detail_effect_changes_inner_effect_entries_innerJSON, "effect");
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

    // move_detail_effect_changes_inner_effect_entries_inner->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(move_detail_effect_changes_inner_effect_entries_innerJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(language); //nonprimitive


    if (effect && !cJSON_IsNull(effect)) effect_local_str = strdup(effect->valuestring);

    move_detail_effect_changes_inner_effect_entries_inner_local_var = move_detail_effect_changes_inner_effect_entries_inner_create_internal (
        effect_local_str,
        language_local_nonprim
        );

    if (!move_detail_effect_changes_inner_effect_entries_inner_local_var) {
        goto end;
    }

    return move_detail_effect_changes_inner_effect_entries_inner_local_var;
end:
    if (effect_local_str) {
        free(effect_local_str);
        effect_local_str = NULL;
    }
    if (language_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
