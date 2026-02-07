#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ability_name.h"



static ability_name_t *ability_name_create_internal(
    char *name,
    language_summary_t *language
    ) {
    ability_name_t *ability_name_local_var = malloc(sizeof(ability_name_t));
    if (!ability_name_local_var) {
        return NULL;
    }
    ability_name_local_var->name = name;
    ability_name_local_var->language = language;

    ability_name_local_var->_library_owned = 1;
    return ability_name_local_var;
}

__attribute__((deprecated)) ability_name_t *ability_name_create(
    char *name,
    language_summary_t *language
    ) {
    return ability_name_create_internal (
        name,
        language
        );
}

void ability_name_free(ability_name_t *ability_name) {
    if(NULL == ability_name){
        return ;
    }
    if(ability_name->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ability_name_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ability_name->name) {
        free(ability_name->name);
        ability_name->name = NULL;
    }
    if (ability_name->language) {
        language_summary_free(ability_name->language);
        ability_name->language = NULL;
    }
    free(ability_name);
}

cJSON *ability_name_convertToJSON(ability_name_t *ability_name) {
    cJSON *item = cJSON_CreateObject();

    // ability_name->name
    if (!ability_name->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", ability_name->name) == NULL) {
    goto fail; //String
    }


    // ability_name->language
    if (!ability_name->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(ability_name->language);
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

ability_name_t *ability_name_parseFromJSON(cJSON *ability_nameJSON){

    ability_name_t *ability_name_local_var = NULL;

    // define the local variable for ability_name->language
    language_summary_t *language_local_nonprim = NULL;

    // ability_name->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(ability_nameJSON, "name");
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

    // ability_name->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(ability_nameJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    ability_name_local_var = ability_name_create_internal (
        strdup(name->valuestring),
        language_local_nonprim
        );

    return ability_name_local_var;
end:
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
