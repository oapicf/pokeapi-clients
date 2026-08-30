#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "language_detail.h"



static language_detail_t *language_detail_create_internal(
    int *id,
    char *name,
    int *official,
    char *iso639,
    char *iso3166,
    list_t *names
    ) {
    language_detail_t *language_detail_local_var = malloc(sizeof(language_detail_t));
    if (!language_detail_local_var) {
        return NULL;
    }
    memset(language_detail_local_var, 0, sizeof(language_detail_t));
    language_detail_local_var->_library_owned = 1;
    language_detail_local_var->id = id;
    language_detail_local_var->name = name;
    language_detail_local_var->official = official;
    language_detail_local_var->iso639 = iso639;
    language_detail_local_var->iso3166 = iso3166;
    language_detail_local_var->names = names;
    return language_detail_local_var;
}

__attribute__((deprecated)) language_detail_t *language_detail_create(
    int *id,
    char *name,
    int *official,
    char *iso639,
    char *iso3166,
    list_t *names
    ) {
    int *id_copy = NULL;
    if (id) {
        id_copy = malloc(sizeof(int));
        if (id_copy) *id_copy = *id;
    }
    int *official_copy = NULL;
    if (official) {
        official_copy = malloc(sizeof(int));
        if (official_copy) *official_copy = *official;
    }
    language_detail_t *result = language_detail_create_internal (
        id_copy,
        name,
        official_copy,
        iso639,
        iso3166,
        names
        );
    if (!result) {
        free(id_copy);
        free(official_copy);
    }
    return result;
}

void language_detail_free(language_detail_t *language_detail) {
    if(NULL == language_detail){
        return ;
    }
    if(language_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "language_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (language_detail->id) {
        free(language_detail->id);
        language_detail->id = NULL;
    }
    if (language_detail->name) {
        free(language_detail->name);
        language_detail->name = NULL;
    }
    if (language_detail->official) {
        free(language_detail->official);
        language_detail->official = NULL;
    }
    if (language_detail->iso639) {
        free(language_detail->iso639);
        language_detail->iso639 = NULL;
    }
    if (language_detail->iso3166) {
        free(language_detail->iso3166);
        language_detail->iso3166 = NULL;
    }
    if (language_detail->names) {
        list_ForEach(listEntry, language_detail->names) {
            language_name_free(listEntry->data);
        }
        list_freeList(language_detail->names);
        language_detail->names = NULL;
    }
    free(language_detail);
}

cJSON *language_detail_convertToJSON(language_detail_t *language_detail) {
    cJSON *item = cJSON_CreateObject();

    // language_detail->id
    if (!language_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", *language_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // language_detail->name
    if (!language_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", language_detail->name) == NULL) {
    goto fail; //String
    }


    // language_detail->official
    if(language_detail->official) {
    if(cJSON_AddBoolToObject(item, "official", *language_detail->official) == NULL) {
    goto fail; //Bool
    }
    }


    // language_detail->iso639
    if (!language_detail->iso639) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "iso639", language_detail->iso639) == NULL) {
    goto fail; //String
    }


    // language_detail->iso3166
    if (!language_detail->iso3166) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "iso3166", language_detail->iso3166) == NULL) {
    goto fail; //String
    }


    // language_detail->names
    if (!language_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (language_detail->names) {
    list_ForEach(namesListEntry, language_detail->names) {
    cJSON *itemLocal = language_name_convertToJSON(namesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(names, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

language_detail_t *language_detail_parseFromJSON(cJSON *language_detailJSON){

    language_detail_t *language_detail_local_var = NULL;

    // define the local variable for language_detail->id
    int *id_local_var = NULL;

    char *name_local_str = NULL;

    // define the local variable for language_detail->official
    int *official_local_var = NULL;

    char *iso639_local_str = NULL;

    char *iso3166_local_str = NULL;

    // define the local list for language_detail->names
    list_t *namesList = NULL;

    // language_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(language_detailJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }
    id_local_var = malloc(sizeof(int));
    if(!id_local_var)
    {
        goto end;
    }
    *id_local_var = id->valuedouble;

    // language_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(language_detailJSON, "name");
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

    // language_detail->official
    cJSON *official = cJSON_GetObjectItemCaseSensitive(language_detailJSON, "official");
    if (cJSON_IsNull(official)) {
        official = NULL;
    }
    if (official) { 
    if(!cJSON_IsBool(official))
    {
    goto end; //Bool
    }
    official_local_var = malloc(sizeof(int));
    if(!official_local_var)
    {
        goto end;
    }
    *official_local_var = official->valueint;
    }

    // language_detail->iso639
    cJSON *iso639 = cJSON_GetObjectItemCaseSensitive(language_detailJSON, "iso639");
    if (cJSON_IsNull(iso639)) {
        iso639 = NULL;
    }
    if (!iso639) {
        goto end;
    }

    
    if(!cJSON_IsString(iso639))
    {
    goto end; //String
    }

    // language_detail->iso3166
    cJSON *iso3166 = cJSON_GetObjectItemCaseSensitive(language_detailJSON, "iso3166");
    if (cJSON_IsNull(iso3166)) {
        iso3166 = NULL;
    }
    if (!iso3166) {
        goto end;
    }

    
    if(!cJSON_IsString(iso3166))
    {
    goto end; //String
    }

    // language_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(language_detailJSON, "names");
    if (cJSON_IsNull(names)) {
        names = NULL;
    }
    if (!names) {
        goto end;
    }

    
    cJSON *names_local_nonprimitive = NULL;
    if(!cJSON_IsArray(names)){
        goto end; //nonprimitive container
    }

    namesList = list_createList();

    cJSON_ArrayForEach(names_local_nonprimitive,names )
    {
        if(!cJSON_IsObject(names_local_nonprimitive)){
            goto end;
        }
        language_name_t *namesItem = language_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (iso639 && !cJSON_IsNull(iso639)) iso639_local_str = strdup(iso639->valuestring);
    if (iso3166 && !cJSON_IsNull(iso3166)) iso3166_local_str = strdup(iso3166->valuestring);

    language_detail_local_var = language_detail_create_internal (
        id_local_var,
        name_local_str,
        official_local_var,
        iso639_local_str,
        iso3166_local_str,
        namesList
        );

    if (!language_detail_local_var) {
        goto end;
    }

    return language_detail_local_var;
end:
    if (id_local_var) {
        free(id_local_var);
        id_local_var = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (official_local_var) {
        free(official_local_var);
        official_local_var = NULL;
    }
    if (iso639_local_str) {
        free(iso639_local_str);
        iso639_local_str = NULL;
    }
    if (iso3166_local_str) {
        free(iso3166_local_str);
        iso3166_local_str = NULL;
    }
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            language_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    return NULL;

}
