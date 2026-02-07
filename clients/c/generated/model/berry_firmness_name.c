#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "berry_firmness_name.h"



static berry_firmness_name_t *berry_firmness_name_create_internal(
    char *name,
    language_summary_t *language
    ) {
    berry_firmness_name_t *berry_firmness_name_local_var = malloc(sizeof(berry_firmness_name_t));
    if (!berry_firmness_name_local_var) {
        return NULL;
    }
    berry_firmness_name_local_var->name = name;
    berry_firmness_name_local_var->language = language;

    berry_firmness_name_local_var->_library_owned = 1;
    return berry_firmness_name_local_var;
}

__attribute__((deprecated)) berry_firmness_name_t *berry_firmness_name_create(
    char *name,
    language_summary_t *language
    ) {
    return berry_firmness_name_create_internal (
        name,
        language
        );
}

void berry_firmness_name_free(berry_firmness_name_t *berry_firmness_name) {
    if(NULL == berry_firmness_name){
        return ;
    }
    if(berry_firmness_name->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "berry_firmness_name_free");
        return ;
    }
    listEntry_t *listEntry;
    if (berry_firmness_name->name) {
        free(berry_firmness_name->name);
        berry_firmness_name->name = NULL;
    }
    if (berry_firmness_name->language) {
        language_summary_free(berry_firmness_name->language);
        berry_firmness_name->language = NULL;
    }
    free(berry_firmness_name);
}

cJSON *berry_firmness_name_convertToJSON(berry_firmness_name_t *berry_firmness_name) {
    cJSON *item = cJSON_CreateObject();

    // berry_firmness_name->name
    if (!berry_firmness_name->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", berry_firmness_name->name) == NULL) {
    goto fail; //String
    }


    // berry_firmness_name->language
    if (!berry_firmness_name->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(berry_firmness_name->language);
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

berry_firmness_name_t *berry_firmness_name_parseFromJSON(cJSON *berry_firmness_nameJSON){

    berry_firmness_name_t *berry_firmness_name_local_var = NULL;

    // define the local variable for berry_firmness_name->language
    language_summary_t *language_local_nonprim = NULL;

    // berry_firmness_name->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(berry_firmness_nameJSON, "name");
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

    // berry_firmness_name->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(berry_firmness_nameJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    berry_firmness_name_local_var = berry_firmness_name_create_internal (
        strdup(name->valuestring),
        language_local_nonprim
        );

    return berry_firmness_name_local_var;
end:
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
