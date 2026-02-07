#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "stat_name.h"



static stat_name_t *stat_name_create_internal(
    char *name,
    language_summary_t *language
    ) {
    stat_name_t *stat_name_local_var = malloc(sizeof(stat_name_t));
    if (!stat_name_local_var) {
        return NULL;
    }
    stat_name_local_var->name = name;
    stat_name_local_var->language = language;

    stat_name_local_var->_library_owned = 1;
    return stat_name_local_var;
}

__attribute__((deprecated)) stat_name_t *stat_name_create(
    char *name,
    language_summary_t *language
    ) {
    return stat_name_create_internal (
        name,
        language
        );
}

void stat_name_free(stat_name_t *stat_name) {
    if(NULL == stat_name){
        return ;
    }
    if(stat_name->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "stat_name_free");
        return ;
    }
    listEntry_t *listEntry;
    if (stat_name->name) {
        free(stat_name->name);
        stat_name->name = NULL;
    }
    if (stat_name->language) {
        language_summary_free(stat_name->language);
        stat_name->language = NULL;
    }
    free(stat_name);
}

cJSON *stat_name_convertToJSON(stat_name_t *stat_name) {
    cJSON *item = cJSON_CreateObject();

    // stat_name->name
    if (!stat_name->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", stat_name->name) == NULL) {
    goto fail; //String
    }


    // stat_name->language
    if (!stat_name->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(stat_name->language);
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

stat_name_t *stat_name_parseFromJSON(cJSON *stat_nameJSON){

    stat_name_t *stat_name_local_var = NULL;

    // define the local variable for stat_name->language
    language_summary_t *language_local_nonprim = NULL;

    // stat_name->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(stat_nameJSON, "name");
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

    // stat_name->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(stat_nameJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    stat_name_local_var = stat_name_create_internal (
        strdup(name->valuestring),
        language_local_nonprim
        );

    return stat_name_local_var;
end:
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
