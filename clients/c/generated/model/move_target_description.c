#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_target_description.h"



static move_target_description_t *move_target_description_create_internal(
    char *description,
    language_summary_t *language
    ) {
    move_target_description_t *move_target_description_local_var = malloc(sizeof(move_target_description_t));
    if (!move_target_description_local_var) {
        return NULL;
    }
    move_target_description_local_var->description = description;
    move_target_description_local_var->language = language;

    move_target_description_local_var->_library_owned = 1;
    return move_target_description_local_var;
}

__attribute__((deprecated)) move_target_description_t *move_target_description_create(
    char *description,
    language_summary_t *language
    ) {
    return move_target_description_create_internal (
        description,
        language
        );
}

void move_target_description_free(move_target_description_t *move_target_description) {
    if(NULL == move_target_description){
        return ;
    }
    if(move_target_description->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_target_description_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_target_description->description) {
        free(move_target_description->description);
        move_target_description->description = NULL;
    }
    if (move_target_description->language) {
        language_summary_free(move_target_description->language);
        move_target_description->language = NULL;
    }
    free(move_target_description);
}

cJSON *move_target_description_convertToJSON(move_target_description_t *move_target_description) {
    cJSON *item = cJSON_CreateObject();

    // move_target_description->description
    if(move_target_description->description) {
    if(cJSON_AddStringToObject(item, "description", move_target_description->description) == NULL) {
    goto fail; //String
    }
    }


    // move_target_description->language
    if (!move_target_description->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(move_target_description->language);
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

move_target_description_t *move_target_description_parseFromJSON(cJSON *move_target_descriptionJSON){

    move_target_description_t *move_target_description_local_var = NULL;

    // define the local variable for move_target_description->language
    language_summary_t *language_local_nonprim = NULL;

    // move_target_description->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(move_target_descriptionJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // move_target_description->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(move_target_descriptionJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    move_target_description_local_var = move_target_description_create_internal (
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        language_local_nonprim
        );

    return move_target_description_local_var;
end:
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
