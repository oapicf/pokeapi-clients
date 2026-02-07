#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "type_detail_sprites_value_value.h"



static type_detail_sprites_value_value_t *type_detail_sprites_value_value_create_internal(
    char *name_icon
    ) {
    type_detail_sprites_value_value_t *type_detail_sprites_value_value_local_var = malloc(sizeof(type_detail_sprites_value_value_t));
    if (!type_detail_sprites_value_value_local_var) {
        return NULL;
    }
    type_detail_sprites_value_value_local_var->name_icon = name_icon;

    type_detail_sprites_value_value_local_var->_library_owned = 1;
    return type_detail_sprites_value_value_local_var;
}

__attribute__((deprecated)) type_detail_sprites_value_value_t *type_detail_sprites_value_value_create(
    char *name_icon
    ) {
    return type_detail_sprites_value_value_create_internal (
        name_icon
        );
}

void type_detail_sprites_value_value_free(type_detail_sprites_value_value_t *type_detail_sprites_value_value) {
    if(NULL == type_detail_sprites_value_value){
        return ;
    }
    if(type_detail_sprites_value_value->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "type_detail_sprites_value_value_free");
        return ;
    }
    listEntry_t *listEntry;
    if (type_detail_sprites_value_value->name_icon) {
        free(type_detail_sprites_value_value->name_icon);
        type_detail_sprites_value_value->name_icon = NULL;
    }
    free(type_detail_sprites_value_value);
}

cJSON *type_detail_sprites_value_value_convertToJSON(type_detail_sprites_value_value_t *type_detail_sprites_value_value) {
    cJSON *item = cJSON_CreateObject();

    // type_detail_sprites_value_value->name_icon
    if(type_detail_sprites_value_value->name_icon) {
    if(cJSON_AddStringToObject(item, "name-icon", type_detail_sprites_value_value->name_icon) == NULL) {
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

type_detail_sprites_value_value_t *type_detail_sprites_value_value_parseFromJSON(cJSON *type_detail_sprites_value_valueJSON){

    type_detail_sprites_value_value_t *type_detail_sprites_value_value_local_var = NULL;

    // type_detail_sprites_value_value->name_icon
    cJSON *name_icon = cJSON_GetObjectItemCaseSensitive(type_detail_sprites_value_valueJSON, "name-icon");
    if (cJSON_IsNull(name_icon)) {
        name_icon = NULL;
    }
    if (name_icon) { 
    if(!cJSON_IsString(name_icon) && !cJSON_IsNull(name_icon))
    {
    goto end; //String
    }
    }


    type_detail_sprites_value_value_local_var = type_detail_sprites_value_value_create_internal (
        name_icon && !cJSON_IsNull(name_icon) ? strdup(name_icon->valuestring) : NULL
        );

    return type_detail_sprites_value_value_local_var;
end:
    return NULL;

}
