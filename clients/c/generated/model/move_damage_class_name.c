#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_damage_class_name.h"



static move_damage_class_name_t *move_damage_class_name_create_internal(
    char *name,
    language_summary_t *language
    ) {
    move_damage_class_name_t *move_damage_class_name_local_var = malloc(sizeof(move_damage_class_name_t));
    if (!move_damage_class_name_local_var) {
        return NULL;
    }
    move_damage_class_name_local_var->name = name;
    move_damage_class_name_local_var->language = language;

    move_damage_class_name_local_var->_library_owned = 1;
    return move_damage_class_name_local_var;
}

__attribute__((deprecated)) move_damage_class_name_t *move_damage_class_name_create(
    char *name,
    language_summary_t *language
    ) {
    return move_damage_class_name_create_internal (
        name,
        language
        );
}

void move_damage_class_name_free(move_damage_class_name_t *move_damage_class_name) {
    if(NULL == move_damage_class_name){
        return ;
    }
    if(move_damage_class_name->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_damage_class_name_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_damage_class_name->name) {
        free(move_damage_class_name->name);
        move_damage_class_name->name = NULL;
    }
    if (move_damage_class_name->language) {
        language_summary_free(move_damage_class_name->language);
        move_damage_class_name->language = NULL;
    }
    free(move_damage_class_name);
}

cJSON *move_damage_class_name_convertToJSON(move_damage_class_name_t *move_damage_class_name) {
    cJSON *item = cJSON_CreateObject();

    // move_damage_class_name->name
    if (!move_damage_class_name->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", move_damage_class_name->name) == NULL) {
    goto fail; //String
    }


    // move_damage_class_name->language
    if (!move_damage_class_name->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(move_damage_class_name->language);
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

move_damage_class_name_t *move_damage_class_name_parseFromJSON(cJSON *move_damage_class_nameJSON){

    move_damage_class_name_t *move_damage_class_name_local_var = NULL;

    // define the local variable for move_damage_class_name->language
    language_summary_t *language_local_nonprim = NULL;

    // move_damage_class_name->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(move_damage_class_nameJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // move_damage_class_name->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(move_damage_class_nameJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    move_damage_class_name_local_var = move_damage_class_name_create_internal (
        strdup(name->valuestring),
        language_local_nonprim
        );

    return move_damage_class_name_local_var;
end:
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
