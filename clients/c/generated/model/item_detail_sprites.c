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
    item_detail_sprites_local_var->_default = _default;

    item_detail_sprites_local_var->_library_owned = 1;
    return item_detail_sprites_local_var;
}

__attribute__((deprecated)) item_detail_sprites_t *item_detail_sprites_create(
    char *_default
    ) {
    return item_detail_sprites_create_internal (
        _default
        );
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


    item_detail_sprites_local_var = item_detail_sprites_create_internal (
        strdup(_default->valuestring)
        );

    return item_detail_sprites_local_var;
end:
    return NULL;

}
