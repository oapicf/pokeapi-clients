#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_learn_method_name.h"



static move_learn_method_name_t *move_learn_method_name_create_internal(
    char *name,
    language_summary_t *language
    ) {
    move_learn_method_name_t *move_learn_method_name_local_var = malloc(sizeof(move_learn_method_name_t));
    if (!move_learn_method_name_local_var) {
        return NULL;
    }
    move_learn_method_name_local_var->name = name;
    move_learn_method_name_local_var->language = language;

    move_learn_method_name_local_var->_library_owned = 1;
    return move_learn_method_name_local_var;
}

__attribute__((deprecated)) move_learn_method_name_t *move_learn_method_name_create(
    char *name,
    language_summary_t *language
    ) {
    return move_learn_method_name_create_internal (
        name,
        language
        );
}

void move_learn_method_name_free(move_learn_method_name_t *move_learn_method_name) {
    if(NULL == move_learn_method_name){
        return ;
    }
    if(move_learn_method_name->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_learn_method_name_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_learn_method_name->name) {
        free(move_learn_method_name->name);
        move_learn_method_name->name = NULL;
    }
    if (move_learn_method_name->language) {
        language_summary_free(move_learn_method_name->language);
        move_learn_method_name->language = NULL;
    }
    free(move_learn_method_name);
}

cJSON *move_learn_method_name_convertToJSON(move_learn_method_name_t *move_learn_method_name) {
    cJSON *item = cJSON_CreateObject();

    // move_learn_method_name->name
    if (!move_learn_method_name->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", move_learn_method_name->name) == NULL) {
    goto fail; //String
    }


    // move_learn_method_name->language
    if (!move_learn_method_name->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(move_learn_method_name->language);
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

move_learn_method_name_t *move_learn_method_name_parseFromJSON(cJSON *move_learn_method_nameJSON){

    move_learn_method_name_t *move_learn_method_name_local_var = NULL;

    // define the local variable for move_learn_method_name->language
    language_summary_t *language_local_nonprim = NULL;

    // move_learn_method_name->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(move_learn_method_nameJSON, "name");
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

    // move_learn_method_name->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(move_learn_method_nameJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    move_learn_method_name_local_var = move_learn_method_name_create_internal (
        strdup(name->valuestring),
        language_local_nonprim
        );

    return move_learn_method_name_local_var;
end:
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
