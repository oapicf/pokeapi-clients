#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "model_type_name.h"



static ModelTypeName_t *ModelTypeName_create_internal(
    char *name,
    language_summary_t *language
    ) {
    ModelTypeName_t *ModelTypeName_local_var = malloc(sizeof(ModelTypeName_t));
    if (!ModelTypeName_local_var) {
        return NULL;
    }
    memset(ModelTypeName_local_var, 0, sizeof(ModelTypeName_t));
    ModelTypeName_local_var->_library_owned = 1;
    ModelTypeName_local_var->name = name;
    ModelTypeName_local_var->language = language;
    return ModelTypeName_local_var;
}

__attribute__((deprecated)) ModelTypeName_t *ModelTypeName_create(
    char *name,
    language_summary_t *language
    ) {
    ModelTypeName_t *result = ModelTypeName_create_internal (
        name,
        language
        );
    if (!result) {
    }
    return result;
}

void ModelTypeName_free(ModelTypeName_t *ModelTypeName) {
    if(NULL == ModelTypeName){
        return ;
    }
    if(ModelTypeName->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "ModelTypeName_free");
        return ;
    }
    listEntry_t *listEntry;
    if (ModelTypeName->name) {
        free(ModelTypeName->name);
        ModelTypeName->name = NULL;
    }
    if (ModelTypeName->language) {
        language_summary_free(ModelTypeName->language);
        ModelTypeName->language = NULL;
    }
    free(ModelTypeName);
}

cJSON *ModelTypeName_convertToJSON(ModelTypeName_t *ModelTypeName) {
    cJSON *item = cJSON_CreateObject();

    // ModelTypeName->name
    if (!ModelTypeName->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", ModelTypeName->name) == NULL) {
    goto fail; //String
    }


    // ModelTypeName->language
    if (!ModelTypeName->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(ModelTypeName->language);
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

ModelTypeName_t *ModelTypeName_parseFromJSON(cJSON *ModelTypeNameJSON){

    ModelTypeName_t *ModelTypeName_local_var = NULL;

    char *name_local_str = NULL;

    // define the local variable for ModelTypeName->language
    language_summary_t *language_local_nonprim = NULL;

    // ModelTypeName->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(ModelTypeNameJSON, "name");
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

    // ModelTypeName->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(ModelTypeNameJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);

    ModelTypeName_local_var = ModelTypeName_create_internal (
        name_local_str,
        language_local_nonprim
        );

    if (!ModelTypeName_local_var) {
        goto end;
    }

    return ModelTypeName_local_var;
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
