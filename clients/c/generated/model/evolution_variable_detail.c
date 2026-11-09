#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "evolution_variable_detail.h"



static evolution_variable_detail_t *evolution_variable_detail_create_internal(
    int *id,
    char *name,
    char *symbol,
    char *data_type,
    char *source,
    version_group_summary_t *version_group,
    list_t *names,
    list_t *descriptions
    ) {
    evolution_variable_detail_t *evolution_variable_detail_local_var = malloc(sizeof(evolution_variable_detail_t));
    if (!evolution_variable_detail_local_var) {
        return NULL;
    }
    memset(evolution_variable_detail_local_var, 0, sizeof(evolution_variable_detail_t));
    evolution_variable_detail_local_var->_library_owned = 1;
    evolution_variable_detail_local_var->id = id;
    evolution_variable_detail_local_var->name = name;
    evolution_variable_detail_local_var->symbol = symbol;
    evolution_variable_detail_local_var->data_type = data_type;
    evolution_variable_detail_local_var->source = source;
    evolution_variable_detail_local_var->version_group = version_group;
    evolution_variable_detail_local_var->names = names;
    evolution_variable_detail_local_var->descriptions = descriptions;
    return evolution_variable_detail_local_var;
}

__attribute__((deprecated)) evolution_variable_detail_t *evolution_variable_detail_create(
    int *id,
    char *name,
    char *symbol,
    char *data_type,
    char *source,
    version_group_summary_t *version_group,
    list_t *names,
    list_t *descriptions
    ) {
    int *id_copy = NULL;
    if (id) {
        id_copy = malloc(sizeof(int));
        if (id_copy) *id_copy = *id;
    }
    evolution_variable_detail_t *result = evolution_variable_detail_create_internal (
        id_copy,
        name,
        symbol,
        data_type,
        source,
        version_group,
        names,
        descriptions
        );
    if (!result) {
        free(id_copy);
    }
    return result;
}

void evolution_variable_detail_free(evolution_variable_detail_t *evolution_variable_detail) {
    if(NULL == evolution_variable_detail){
        return ;
    }
    if(evolution_variable_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "evolution_variable_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (evolution_variable_detail->id) {
        free(evolution_variable_detail->id);
        evolution_variable_detail->id = NULL;
    }
    if (evolution_variable_detail->name) {
        free(evolution_variable_detail->name);
        evolution_variable_detail->name = NULL;
    }
    if (evolution_variable_detail->symbol) {
        free(evolution_variable_detail->symbol);
        evolution_variable_detail->symbol = NULL;
    }
    if (evolution_variable_detail->data_type) {
        free(evolution_variable_detail->data_type);
        evolution_variable_detail->data_type = NULL;
    }
    if (evolution_variable_detail->source) {
        free(evolution_variable_detail->source);
        evolution_variable_detail->source = NULL;
    }
    if (evolution_variable_detail->version_group) {
        version_group_summary_free(evolution_variable_detail->version_group);
        evolution_variable_detail->version_group = NULL;
    }
    if (evolution_variable_detail->names) {
        list_ForEach(listEntry, evolution_variable_detail->names) {
            evolution_variable_name_free(listEntry->data);
        }
        list_freeList(evolution_variable_detail->names);
        evolution_variable_detail->names = NULL;
    }
    if (evolution_variable_detail->descriptions) {
        list_ForEach(listEntry, evolution_variable_detail->descriptions) {
            evolution_variable_description_free(listEntry->data);
        }
        list_freeList(evolution_variable_detail->descriptions);
        evolution_variable_detail->descriptions = NULL;
    }
    free(evolution_variable_detail);
}

cJSON *evolution_variable_detail_convertToJSON(evolution_variable_detail_t *evolution_variable_detail) {
    cJSON *item = cJSON_CreateObject();

    // evolution_variable_detail->id
    if (!evolution_variable_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", *evolution_variable_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // evolution_variable_detail->name
    if (!evolution_variable_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", evolution_variable_detail->name) == NULL) {
    goto fail; //String
    }


    // evolution_variable_detail->symbol
    if (!evolution_variable_detail->symbol) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "symbol", evolution_variable_detail->symbol) == NULL) {
    goto fail; //String
    }


    // evolution_variable_detail->data_type
    if(evolution_variable_detail->data_type) {
    if(cJSON_AddStringToObject(item, "data_type", evolution_variable_detail->data_type) == NULL) {
    goto fail; //String
    }
    }


    // evolution_variable_detail->source
    if(evolution_variable_detail->source) {
    if(cJSON_AddStringToObject(item, "source", evolution_variable_detail->source) == NULL) {
    goto fail; //String
    }
    }


    // evolution_variable_detail->version_group
    if (!evolution_variable_detail->version_group) {
        goto fail;
    }
    cJSON *version_group_local_JSON = version_group_summary_convertToJSON(evolution_variable_detail->version_group);
    if(version_group_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "version_group", version_group_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // evolution_variable_detail->names
    if (!evolution_variable_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (evolution_variable_detail->names) {
    list_ForEach(namesListEntry, evolution_variable_detail->names) {
    cJSON *itemLocal = evolution_variable_name_convertToJSON(namesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(names, itemLocal);
    }
    }


    // evolution_variable_detail->descriptions
    if (!evolution_variable_detail->descriptions) {
        goto fail;
    }
    cJSON *descriptions = cJSON_AddArrayToObject(item, "descriptions");
    if(descriptions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *descriptionsListEntry;
    if (evolution_variable_detail->descriptions) {
    list_ForEach(descriptionsListEntry, evolution_variable_detail->descriptions) {
    cJSON *itemLocal = evolution_variable_description_convertToJSON(descriptionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(descriptions, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

evolution_variable_detail_t *evolution_variable_detail_parseFromJSON(cJSON *evolution_variable_detailJSON){

    evolution_variable_detail_t *evolution_variable_detail_local_var = NULL;

    // define the local variable for evolution_variable_detail->id
    int *id_local_var = NULL;

    char *name_local_str = NULL;

    char *symbol_local_str = NULL;

    char *data_type_local_str = NULL;

    char *source_local_str = NULL;

    // define the local variable for evolution_variable_detail->version_group
    version_group_summary_t *version_group_local_nonprim = NULL;

    // define the local list for evolution_variable_detail->names
    list_t *namesList = NULL;

    // define the local list for evolution_variable_detail->descriptions
    list_t *descriptionsList = NULL;

    // evolution_variable_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(evolution_variable_detailJSON, "id");
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

    // evolution_variable_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(evolution_variable_detailJSON, "name");
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

    // evolution_variable_detail->symbol
    cJSON *symbol = cJSON_GetObjectItemCaseSensitive(evolution_variable_detailJSON, "symbol");
    if (cJSON_IsNull(symbol)) {
        symbol = NULL;
    }
    if (!symbol) {
        goto end;
    }

    
    if(!cJSON_IsString(symbol))
    {
    goto end; //String
    }

    // evolution_variable_detail->data_type
    cJSON *data_type = cJSON_GetObjectItemCaseSensitive(evolution_variable_detailJSON, "data_type");
    if (cJSON_IsNull(data_type)) {
        data_type = NULL;
    }
    if (data_type) { 
    if(!cJSON_IsString(data_type) && !cJSON_IsNull(data_type))
    {
    goto end; //String
    }
    }

    // evolution_variable_detail->source
    cJSON *source = cJSON_GetObjectItemCaseSensitive(evolution_variable_detailJSON, "source");
    if (cJSON_IsNull(source)) {
        source = NULL;
    }
    if (source) { 
    if(!cJSON_IsString(source) && !cJSON_IsNull(source))
    {
    goto end; //String
    }
    }

    // evolution_variable_detail->version_group
    cJSON *version_group = cJSON_GetObjectItemCaseSensitive(evolution_variable_detailJSON, "version_group");
    if (cJSON_IsNull(version_group)) {
        version_group = NULL;
    }
    if (!version_group) {
        goto end;
    }

    
    version_group_local_nonprim = version_group_summary_parseFromJSON(version_group); //nonprimitive

    // evolution_variable_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(evolution_variable_detailJSON, "names");
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
        evolution_variable_name_t *namesItem = evolution_variable_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }

    // evolution_variable_detail->descriptions
    cJSON *descriptions = cJSON_GetObjectItemCaseSensitive(evolution_variable_detailJSON, "descriptions");
    if (cJSON_IsNull(descriptions)) {
        descriptions = NULL;
    }
    if (!descriptions) {
        goto end;
    }

    
    cJSON *descriptions_local_nonprimitive = NULL;
    if(!cJSON_IsArray(descriptions)){
        goto end; //nonprimitive container
    }

    descriptionsList = list_createList();

    cJSON_ArrayForEach(descriptions_local_nonprimitive,descriptions )
    {
        if(!cJSON_IsObject(descriptions_local_nonprimitive)){
            goto end;
        }
        evolution_variable_description_t *descriptionsItem = evolution_variable_description_parseFromJSON(descriptions_local_nonprimitive);

        list_addElement(descriptionsList, descriptionsItem);
    }


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (symbol && !cJSON_IsNull(symbol)) symbol_local_str = strdup(symbol->valuestring);
    if (data_type && !cJSON_IsNull(data_type)) data_type_local_str = strdup(data_type->valuestring);
    if (source && !cJSON_IsNull(source)) source_local_str = strdup(source->valuestring);

    evolution_variable_detail_local_var = evolution_variable_detail_create_internal (
        id_local_var,
        name_local_str,
        symbol_local_str,
        data_type_local_str,
        source_local_str,
        version_group_local_nonprim,
        namesList,
        descriptionsList
        );

    if (!evolution_variable_detail_local_var) {
        goto end;
    }

    return evolution_variable_detail_local_var;
end:
    if (id_local_var) {
        free(id_local_var);
        id_local_var = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (symbol_local_str) {
        free(symbol_local_str);
        symbol_local_str = NULL;
    }
    if (data_type_local_str) {
        free(data_type_local_str);
        data_type_local_str = NULL;
    }
    if (source_local_str) {
        free(source_local_str);
        source_local_str = NULL;
    }
    if (version_group_local_nonprim) {
        version_group_summary_free(version_group_local_nonprim);
        version_group_local_nonprim = NULL;
    }
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            evolution_variable_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    if (descriptionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, descriptionsList) {
            evolution_variable_description_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(descriptionsList);
        descriptionsList = NULL;
    }
    return NULL;

}
