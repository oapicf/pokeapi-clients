#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "generation_name.h"



static generation_name_t *generation_name_create_internal(
    char *name,
    language_summary_t *language
    ) {
    generation_name_t *generation_name_local_var = malloc(sizeof(generation_name_t));
    if (!generation_name_local_var) {
        return NULL;
    }
    memset(generation_name_local_var, 0, sizeof(generation_name_t));
    generation_name_local_var->_library_owned = 1;
    generation_name_local_var->name = name;
    generation_name_local_var->language = language;
    return generation_name_local_var;
}

__attribute__((deprecated)) generation_name_t *generation_name_create(
    char *name,
    language_summary_t *language
    ) {
    generation_name_t *result = generation_name_create_internal (
        name,
        language
        );
    if (!result) {
    }
    return result;
}

void generation_name_free(generation_name_t *generation_name) {
    if(NULL == generation_name){
        return ;
    }
    if(generation_name->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "generation_name_free");
        return ;
    }
    listEntry_t *listEntry;
    if (generation_name->name) {
        free(generation_name->name);
        generation_name->name = NULL;
    }
    if (generation_name->language) {
        language_summary_free(generation_name->language);
        generation_name->language = NULL;
    }
    free(generation_name);
}

cJSON *generation_name_convertToJSON(generation_name_t *generation_name) {
    cJSON *item = cJSON_CreateObject();

    // generation_name->name
    if (!generation_name->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", generation_name->name) == NULL) {
    goto fail; //String
    }


    // generation_name->language
    if (!generation_name->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(generation_name->language);
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

generation_name_t *generation_name_parseFromJSON(cJSON *generation_nameJSON){

    generation_name_t *generation_name_local_var = NULL;

    char *name_local_str = NULL;

    // define the local variable for generation_name->language
    language_summary_t *language_local_nonprim = NULL;

    // generation_name->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(generation_nameJSON, "name");
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

    // generation_name->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(generation_nameJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    generation_name_local_var = generation_name_create_internal (
        name_local_str,
        language_local_nonprim
        );

    if (!generation_name_local_var) {
        goto end;
    }

    return generation_name_local_var;
end:
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
