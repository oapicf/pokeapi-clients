#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_detail_sprites.h"



static item_detail_sprites_t *item_detail_sprites_create_internal(
    char *_default
    ) {
    item_detail_sprites_t *item_detail_sprites_local_var = malloc(sizeof(item_detail_sprites_t));
    if (!item_detail_sprites_local_var) {
        return NULL;
    }
    memset(item_detail_sprites_local_var, 0, sizeof(item_detail_sprites_t));
    item_detail_sprites_local_var->_library_owned = 1;
    item_detail_sprites_local_var->_default = _default;
    return item_detail_sprites_local_var;
}

__attribute__((deprecated)) item_detail_sprites_t *item_detail_sprites_create(
    char *_default
    ) {
    item_detail_sprites_t *result = item_detail_sprites_create_internal (
        _default
        );
    if (!result) {
    }
    return result;
}

void item_detail_sprites_free(item_detail_sprites_t *item_detail_sprites) {
    if(NULL == item_detail_sprites){
        return ;
    }
    if(item_detail_sprites->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_detail_sprites_free");
        return ;
    }
    listEntry_t *listEntry;
    if (item_detail_sprites->_default) {
        free(item_detail_sprites->_default);
        item_detail_sprites->_default = NULL;
    }
    free(item_detail_sprites);
}

cJSON *item_detail_sprites_convertToJSON(item_detail_sprites_t *item_detail_sprites) {
    cJSON *item = cJSON_CreateObject();

    // item_detail_sprites->_default
    if (!item_detail_sprites->_default) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "default", item_detail_sprites->_default) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

item_detail_sprites_t *item_detail_sprites_parseFromJSON(cJSON *item_detail_spritesJSON){

    item_detail_sprites_t *item_detail_sprites_local_var = NULL;

    char *_default_local_str = NULL;

    // item_detail_sprites->_default
    cJSON *_default = cJSON_GetObjectItemCaseSensitive(item_detail_spritesJSON, "default");
    if (cJSON_IsNull(_default)) {
        _default = NULL;
    }
    if (!_default) {
        goto end;
    }

    
    if(!cJSON_IsString(_default))
    {
    goto end; //String
    }


    if (_default && !cJSON_IsNull(_default)) _default_local_str = strdup(_default->valuestring);

    item_detail_sprites_local_var = item_detail_sprites_create_internal (
        _default_local_str
        );

    if (!item_detail_sprites_local_var) {
        goto end;
    }

    return item_detail_sprites_local_var;
end:
    if (_default_local_str) {
        free(_default_local_str);
        _default_local_str = NULL;
    }
    return NULL;

}
