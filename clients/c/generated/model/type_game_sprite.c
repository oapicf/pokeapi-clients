#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "type_game_sprite.h"



static type_game_sprite_t *type_game_sprite_create_internal(
    char *name_icon,
    char *symbol_icon
    ) {
    type_game_sprite_t *type_game_sprite_local_var = malloc(sizeof(type_game_sprite_t));
    if (!type_game_sprite_local_var) {
        return NULL;
    }
    memset(type_game_sprite_local_var, 0, sizeof(type_game_sprite_t));
    type_game_sprite_local_var->_library_owned = 1;
    type_game_sprite_local_var->name_icon = name_icon;
    type_game_sprite_local_var->symbol_icon = symbol_icon;
    return type_game_sprite_local_var;
}

__attribute__((deprecated)) type_game_sprite_t *type_game_sprite_create(
    char *name_icon,
    char *symbol_icon
    ) {
    type_game_sprite_t *result = type_game_sprite_create_internal (
        name_icon,
        symbol_icon
        );
    if (!result) {
    }
    return result;
}

void type_game_sprite_free(type_game_sprite_t *type_game_sprite) {
    if(NULL == type_game_sprite){
        return ;
    }
    if(type_game_sprite->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "type_game_sprite_free");
        return ;
    }
    listEntry_t *listEntry;
    if (type_game_sprite->name_icon) {
        free(type_game_sprite->name_icon);
        type_game_sprite->name_icon = NULL;
    }
    if (type_game_sprite->symbol_icon) {
        free(type_game_sprite->symbol_icon);
        type_game_sprite->symbol_icon = NULL;
    }
    free(type_game_sprite);
}

cJSON *type_game_sprite_convertToJSON(type_game_sprite_t *type_game_sprite) {
    cJSON *item = cJSON_CreateObject();

    // type_game_sprite->name_icon
    if(type_game_sprite->name_icon) {
    if(cJSON_AddStringToObject(item, "name_icon", type_game_sprite->name_icon) == NULL) {
    goto fail; //String
    }
    }


    // type_game_sprite->symbol_icon
    if(type_game_sprite->symbol_icon) {
    if(cJSON_AddStringToObject(item, "symbol_icon", type_game_sprite->symbol_icon) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

type_game_sprite_t *type_game_sprite_parseFromJSON(cJSON *type_game_spriteJSON){

    type_game_sprite_t *type_game_sprite_local_var = NULL;

    char *name_icon_local_str = NULL;

    char *symbol_icon_local_str = NULL;

    // type_game_sprite->name_icon
    cJSON *name_icon = cJSON_GetObjectItemCaseSensitive(type_game_spriteJSON, "name_icon");
    if (cJSON_IsNull(name_icon)) {
        name_icon = NULL;
    }
    if (name_icon) { 
    if(!cJSON_IsString(name_icon) && !cJSON_IsNull(name_icon))
    {
    goto end; //String
    }
    }

    // type_game_sprite->symbol_icon
    cJSON *symbol_icon = cJSON_GetObjectItemCaseSensitive(type_game_spriteJSON, "symbol_icon");
    if (cJSON_IsNull(symbol_icon)) {
        symbol_icon = NULL;
    }
    if (symbol_icon) { 
    if(!cJSON_IsString(symbol_icon) && !cJSON_IsNull(symbol_icon))
    {
    goto end; //String
    }
    }


    if (name_icon && !cJSON_IsNull(name_icon)) name_icon_local_str = strdup(name_icon->valuestring);
    if (symbol_icon && !cJSON_IsNull(symbol_icon)) symbol_icon_local_str = strdup(symbol_icon->valuestring);

    type_game_sprite_local_var = type_game_sprite_create_internal (
        name_icon_local_str,
        symbol_icon_local_str
        );

    if (!type_game_sprite_local_var) {
        goto end;
    }

    return type_game_sprite_local_var;
end:
    if (name_icon_local_str) {
        free(name_icon_local_str);
        name_icon_local_str = NULL;
    }
    if (symbol_icon_local_str) {
        free(symbol_icon_local_str);
        symbol_icon_local_str = NULL;
    }
    return NULL;

}
