#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "berry_flavor_name.h"



static berry_flavor_name_t *berry_flavor_name_create_internal(
    char *name,
    language_summary_t *language
    ) {
    berry_flavor_name_t *berry_flavor_name_local_var = malloc(sizeof(berry_flavor_name_t));
    if (!berry_flavor_name_local_var) {
        return NULL;
    }
    memset(berry_flavor_name_local_var, 0, sizeof(berry_flavor_name_t));
    berry_flavor_name_local_var->_library_owned = 1;
    berry_flavor_name_local_var->name = name;
    berry_flavor_name_local_var->language = language;
    return berry_flavor_name_local_var;
}

__attribute__((deprecated)) berry_flavor_name_t *berry_flavor_name_create(
    char *name,
    language_summary_t *language
    ) {
    berry_flavor_name_t *result = berry_flavor_name_create_internal (
        name,
        language
        );
    if (!result) {
    }
    return result;
}

void berry_flavor_name_free(berry_flavor_name_t *berry_flavor_name) {
    if(NULL == berry_flavor_name){
        return ;
    }
    if(berry_flavor_name->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "berry_flavor_name_free");
        return ;
    }
    listEntry_t *listEntry;
    if (berry_flavor_name->name) {
        free(berry_flavor_name->name);
        berry_flavor_name->name = NULL;
    }
    if (berry_flavor_name->language) {
        language_summary_free(berry_flavor_name->language);
        berry_flavor_name->language = NULL;
    }
    free(berry_flavor_name);
}

cJSON *berry_flavor_name_convertToJSON(berry_flavor_name_t *berry_flavor_name) {
    cJSON *item = cJSON_CreateObject();

    // berry_flavor_name->name
    if (!berry_flavor_name->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", berry_flavor_name->name) == NULL) {
    goto fail; //String
    }


    // berry_flavor_name->language
    if (!berry_flavor_name->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(berry_flavor_name->language);
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

berry_flavor_name_t *berry_flavor_name_parseFromJSON(cJSON *berry_flavor_nameJSON){

    berry_flavor_name_t *berry_flavor_name_local_var = NULL;

    char *name_local_str = NULL;

    // define the local variable for berry_flavor_name->language
    language_summary_t *language_local_nonprim = NULL;

    // berry_flavor_name->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(berry_flavor_nameJSON, "name");
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

    // berry_flavor_name->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(berry_flavor_nameJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    berry_flavor_name_local_var = berry_flavor_name_create_internal (
        name_local_str,
        language_local_nonprim
        );

    if (!berry_flavor_name_local_var) {
        goto end;
    }

    return berry_flavor_name_local_var;
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
