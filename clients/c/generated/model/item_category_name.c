#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_category_name.h"



static item_category_name_t *item_category_name_create_internal(
    char *name,
    language_summary_t *language
    ) {
    item_category_name_t *item_category_name_local_var = malloc(sizeof(item_category_name_t));
    if (!item_category_name_local_var) {
        return NULL;
    }
    memset(item_category_name_local_var, 0, sizeof(item_category_name_t));
    item_category_name_local_var->_library_owned = 1;
    item_category_name_local_var->name = name;
    item_category_name_local_var->language = language;
    return item_category_name_local_var;
}

__attribute__((deprecated)) item_category_name_t *item_category_name_create(
    char *name,
    language_summary_t *language
    ) {
    item_category_name_t *result = item_category_name_create_internal (
        name,
        language
        );
    if (!result) {
    }
    return result;
}

void item_category_name_free(item_category_name_t *item_category_name) {
    if(NULL == item_category_name){
        return ;
    }
    if(item_category_name->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_category_name_free");
        return ;
    }
    listEntry_t *listEntry;
    if (item_category_name->name) {
        free(item_category_name->name);
        item_category_name->name = NULL;
    }
    if (item_category_name->language) {
        language_summary_free(item_category_name->language);
        item_category_name->language = NULL;
    }
    free(item_category_name);
}

cJSON *item_category_name_convertToJSON(item_category_name_t *item_category_name) {
    cJSON *item = cJSON_CreateObject();

    // item_category_name->name
    if (!item_category_name->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", item_category_name->name) == NULL) {
    goto fail; //String
    }


    // item_category_name->language
    if (!item_category_name->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(item_category_name->language);
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

item_category_name_t *item_category_name_parseFromJSON(cJSON *item_category_nameJSON){

    item_category_name_t *item_category_name_local_var = NULL;

    char *name_local_str = NULL;

    // define the local variable for item_category_name->language
    language_summary_t *language_local_nonprim = NULL;

    // item_category_name->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(item_category_nameJSON, "name");
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

    // item_category_name->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(item_category_nameJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    item_category_name_local_var = item_category_name_create_internal (
        name_local_str,
        language_local_nonprim
        );

    if (!item_category_name_local_var) {
        goto end;
    }

    return item_category_name_local_var;
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
