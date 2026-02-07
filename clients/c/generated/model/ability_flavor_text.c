#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ability_flavor_text.h"



static ability_flavor_text_t *ability_flavor_text_create_internal(
    char *flavor_text,
    language_summary_t *language,
    version_group_summary_t *version_group
    ) {
    ability_flavor_text_t *ability_flavor_text_local_var = malloc(sizeof(ability_flavor_text_t));
    if (!ability_flavor_text_local_var) {
        return NULL;
    }
    ability_flavor_text_local_var->flavor_text = flavor_text;
    ability_flavor_text_local_var->language = language;
    ability_flavor_text_local_var->version_group = version_group;

    ability_flavor_text_local_var->_library_owned = 1;
    return ability_flavor_text_local_var;
}

__attribute__((deprecated)) ability_flavor_text_t *ability_flavor_text_create(
    char *flavor_text,
    language_summary_t *language,
    version_group_summary_t *version_group
    ) {
    return ability_flavor_text_create_internal (
        flavor_text,
        language,
        version_group
        );
}

void ability_flavor_text_free(ability_flavor_text_t *ability_flavor_text) {
    if(NULL == ability_flavor_text){
        return ;
    }
    if(ability_flavor_text->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ability_flavor_text_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ability_flavor_text->flavor_text) {
        free(ability_flavor_text->flavor_text);
        ability_flavor_text->flavor_text = NULL;
    }
    if (ability_flavor_text->language) {
        language_summary_free(ability_flavor_text->language);
        ability_flavor_text->language = NULL;
    }
    if (ability_flavor_text->version_group) {
        version_group_summary_free(ability_flavor_text->version_group);
        ability_flavor_text->version_group = NULL;
    }
    free(ability_flavor_text);
}

cJSON *ability_flavor_text_convertToJSON(ability_flavor_text_t *ability_flavor_text) {
    cJSON *item = cJSON_CreateObject();

    // ability_flavor_text->flavor_text
    if (!ability_flavor_text->flavor_text) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "flavor_text", ability_flavor_text->flavor_text) == NULL) {
    goto fail; //String
    }


    // ability_flavor_text->language
    if (!ability_flavor_text->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(ability_flavor_text->language);
    if(language_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "language", language_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // ability_flavor_text->version_group
    if (!ability_flavor_text->version_group) {
        goto fail;
    }
    cJSON *version_group_local_JSON = version_group_summary_convertToJSON(ability_flavor_text->version_group);
    if(version_group_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "version_group", version_group_local_JSON);
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

ability_flavor_text_t *ability_flavor_text_parseFromJSON(cJSON *ability_flavor_textJSON){

    ability_flavor_text_t *ability_flavor_text_local_var = NULL;

    // define the local variable for ability_flavor_text->language
    language_summary_t *language_local_nonprim = NULL;

    // define the local variable for ability_flavor_text->version_group
    version_group_summary_t *version_group_local_nonprim = NULL;

    // ability_flavor_text->flavor_text
    cJSON *flavor_text = cJSON_GetObjectItemCaseSensitive(ability_flavor_textJSON, "flavor_text");
    if (cJSON_IsNull(flavor_text)) {
        flavor_text = NULL;
    }
    if (!flavor_text) {
        goto end;
    }

    
    if(!cJSON_IsString(flavor_text))
    {
    goto end; //String
    }

    // ability_flavor_text->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(ability_flavor_textJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive

    // ability_flavor_text->version_group
    cJSON *version_group = cJSON_GetObjectItemCaseSensitive(ability_flavor_textJSON, "version_group");
    if (cJSON_IsNull(version_group)) {
        version_group = NULL;
    }
    if (!version_group) {
        goto end;
    }

    
    version_group_local_nonprim = version_group_summary_parseFromJSON(version_group); //nonprimitive


    ability_flavor_text_local_var = ability_flavor_text_create_internal (
        strdup(flavor_text->valuestring),
        language_local_nonprim,
        version_group_local_nonprim
        );

    return ability_flavor_text_local_var;
end:
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    if (version_group_local_nonprim) {
        version_group_summary_free(version_group_local_nonprim);
        version_group_local_nonprim = NULL;
    }
    return NULL;

}
