#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "egg_group_name.h"



static egg_group_name_t *egg_group_name_create_internal(
    char *name,
    language_summary_t *language
    ) {
    egg_group_name_t *egg_group_name_local_var = malloc(sizeof(egg_group_name_t));
    if (!egg_group_name_local_var) {
        return NULL;
    }
    egg_group_name_local_var->name = name;
    egg_group_name_local_var->language = language;

    egg_group_name_local_var->_library_owned = 1;
    return egg_group_name_local_var;
}

__attribute__((deprecated)) egg_group_name_t *egg_group_name_create(
    char *name,
    language_summary_t *language
    ) {
    return egg_group_name_create_internal (
        name,
        language
        );
}

void egg_group_name_free(egg_group_name_t *egg_group_name) {
    if(NULL == egg_group_name){
        return ;
    }
    if(egg_group_name->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "egg_group_name_free");
        return ;
    }
    listEntry_t *listEntry;
    if (egg_group_name->name) {
        free(egg_group_name->name);
        egg_group_name->name = NULL;
    }
    if (egg_group_name->language) {
        language_summary_free(egg_group_name->language);
        egg_group_name->language = NULL;
    }
    free(egg_group_name);
}

cJSON *egg_group_name_convertToJSON(egg_group_name_t *egg_group_name) {
    cJSON *item = cJSON_CreateObject();

    // egg_group_name->name
    if (!egg_group_name->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", egg_group_name->name) == NULL) {
    goto fail; //String
    }


    // egg_group_name->language
    if (!egg_group_name->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(egg_group_name->language);
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

egg_group_name_t *egg_group_name_parseFromJSON(cJSON *egg_group_nameJSON){

    egg_group_name_t *egg_group_name_local_var = NULL;

    // define the local variable for egg_group_name->language
    language_summary_t *language_local_nonprim = NULL;

    // egg_group_name->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(egg_group_nameJSON, "name");
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

    // egg_group_name->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(egg_group_nameJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    egg_group_name_local_var = egg_group_name_create_internal (
        strdup(name->valuestring),
        language_local_nonprim
        );

    return egg_group_name_local_var;
end:
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
