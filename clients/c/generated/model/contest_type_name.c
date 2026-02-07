#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "contest_type_name.h"



static contest_type_name_t *contest_type_name_create_internal(
    char *name,
    char *color,
    language_summary_t *language
    ) {
    contest_type_name_t *contest_type_name_local_var = malloc(sizeof(contest_type_name_t));
    if (!contest_type_name_local_var) {
        return NULL;
    }
    contest_type_name_local_var->name = name;
    contest_type_name_local_var->color = color;
    contest_type_name_local_var->language = language;

    contest_type_name_local_var->_library_owned = 1;
    return contest_type_name_local_var;
}

__attribute__((deprecated)) contest_type_name_t *contest_type_name_create(
    char *name,
    char *color,
    language_summary_t *language
    ) {
    return contest_type_name_create_internal (
        name,
        color,
        language
        );
}

void contest_type_name_free(contest_type_name_t *contest_type_name) {
    if(NULL == contest_type_name){
        return ;
    }
    if(contest_type_name->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "contest_type_name_free");
        return ;
    }
    listEntry_t *listEntry;
    if (contest_type_name->name) {
        free(contest_type_name->name);
        contest_type_name->name = NULL;
    }
    if (contest_type_name->color) {
        free(contest_type_name->color);
        contest_type_name->color = NULL;
    }
    if (contest_type_name->language) {
        language_summary_free(contest_type_name->language);
        contest_type_name->language = NULL;
    }
    free(contest_type_name);
}

cJSON *contest_type_name_convertToJSON(contest_type_name_t *contest_type_name) {
    cJSON *item = cJSON_CreateObject();

    // contest_type_name->name
    if (!contest_type_name->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", contest_type_name->name) == NULL) {
    goto fail; //String
    }


    // contest_type_name->color
    if (!contest_type_name->color) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "color", contest_type_name->color) == NULL) {
    goto fail; //String
    }


    // contest_type_name->language
    if (!contest_type_name->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(contest_type_name->language);
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

contest_type_name_t *contest_type_name_parseFromJSON(cJSON *contest_type_nameJSON){

    contest_type_name_t *contest_type_name_local_var = NULL;

    // define the local variable for contest_type_name->language
    language_summary_t *language_local_nonprim = NULL;

    // contest_type_name->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(contest_type_nameJSON, "name");
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

    // contest_type_name->color
    cJSON *color = cJSON_GetObjectItemCaseSensitive(contest_type_nameJSON, "color");
    if (cJSON_IsNull(color)) {
        color = NULL;
    }
    if (!color) {
        goto end;
    }

    
    if(!cJSON_IsString(color))
    {
    goto end; //String
    }

    // contest_type_name->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(contest_type_nameJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    contest_type_name_local_var = contest_type_name_create_internal (
        strdup(name->valuestring),
        strdup(color->valuestring),
        language_local_nonprim
        );

    return contest_type_name_local_var;
end:
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
