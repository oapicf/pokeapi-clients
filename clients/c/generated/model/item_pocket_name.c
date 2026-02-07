#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_pocket_name.h"



static item_pocket_name_t *item_pocket_name_create_internal(
    char *name,
    language_summary_t *language
    ) {
    item_pocket_name_t *item_pocket_name_local_var = malloc(sizeof(item_pocket_name_t));
    if (!item_pocket_name_local_var) {
        return NULL;
    }
    item_pocket_name_local_var->name = name;
    item_pocket_name_local_var->language = language;

    item_pocket_name_local_var->_library_owned = 1;
    return item_pocket_name_local_var;
}

__attribute__((deprecated)) item_pocket_name_t *item_pocket_name_create(
    char *name,
    language_summary_t *language
    ) {
    return item_pocket_name_create_internal (
        name,
        language
        );
}

void item_pocket_name_free(item_pocket_name_t *item_pocket_name) {
    if(NULL == item_pocket_name){
        return ;
    }
    if(item_pocket_name->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_pocket_name_free");
        return ;
    }
    listEntry_t *listEntry;
    if (item_pocket_name->name) {
        free(item_pocket_name->name);
        item_pocket_name->name = NULL;
    }
    if (item_pocket_name->language) {
        language_summary_free(item_pocket_name->language);
        item_pocket_name->language = NULL;
    }
    free(item_pocket_name);
}

cJSON *item_pocket_name_convertToJSON(item_pocket_name_t *item_pocket_name) {
    cJSON *item = cJSON_CreateObject();

    // item_pocket_name->name
    if (!item_pocket_name->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", item_pocket_name->name) == NULL) {
    goto fail; //String
    }


    // item_pocket_name->language
    if (!item_pocket_name->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(item_pocket_name->language);
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

item_pocket_name_t *item_pocket_name_parseFromJSON(cJSON *item_pocket_nameJSON){

    item_pocket_name_t *item_pocket_name_local_var = NULL;

    // define the local variable for item_pocket_name->language
    language_summary_t *language_local_nonprim = NULL;

    // item_pocket_name->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(item_pocket_nameJSON, "name");
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

    // item_pocket_name->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(item_pocket_nameJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    item_pocket_name_local_var = item_pocket_name_create_internal (
        strdup(name->valuestring),
        language_local_nonprim
        );

    return item_pocket_name_local_var;
end:
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
