#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_learn_method_detail.h"



static move_learn_method_detail_t *move_learn_method_detail_create_internal(
    int id,
    char *name,
    list_t *names,
    list_t *descriptions,
    list_t *version_groups
    ) {
    move_learn_method_detail_t *move_learn_method_detail_local_var = malloc(sizeof(move_learn_method_detail_t));
    if (!move_learn_method_detail_local_var) {
        return NULL;
    }
    move_learn_method_detail_local_var->id = id;
    move_learn_method_detail_local_var->name = name;
    move_learn_method_detail_local_var->names = names;
    move_learn_method_detail_local_var->descriptions = descriptions;
    move_learn_method_detail_local_var->version_groups = version_groups;

    move_learn_method_detail_local_var->_library_owned = 1;
    return move_learn_method_detail_local_var;
}

__attribute__((deprecated)) move_learn_method_detail_t *move_learn_method_detail_create(
    int id,
    char *name,
    list_t *names,
    list_t *descriptions,
    list_t *version_groups
    ) {
    return move_learn_method_detail_create_internal (
        id,
        name,
        names,
        descriptions,
        version_groups
        );
}

void move_learn_method_detail_free(move_learn_method_detail_t *move_learn_method_detail) {
    if(NULL == move_learn_method_detail){
        return ;
    }
    if(move_learn_method_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_learn_method_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_learn_method_detail->name) {
        free(move_learn_method_detail->name);
        move_learn_method_detail->name = NULL;
    }
    if (move_learn_method_detail->names) {
        list_ForEach(listEntry, move_learn_method_detail->names) {
            move_learn_method_name_free(listEntry->data);
        }
        list_freeList(move_learn_method_detail->names);
        move_learn_method_detail->names = NULL;
    }
    if (move_learn_method_detail->descriptions) {
        list_ForEach(listEntry, move_learn_method_detail->descriptions) {
            move_learn_method_description_free(listEntry->data);
        }
        list_freeList(move_learn_method_detail->descriptions);
        move_learn_method_detail->descriptions = NULL;
    }
    if (move_learn_method_detail->version_groups) {
        list_ForEach(listEntry, move_learn_method_detail->version_groups) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
        }
        list_freeList(move_learn_method_detail->version_groups);
        move_learn_method_detail->version_groups = NULL;
    }
    free(move_learn_method_detail);
}

cJSON *move_learn_method_detail_convertToJSON(move_learn_method_detail_t *move_learn_method_detail) {
    cJSON *item = cJSON_CreateObject();

    // move_learn_method_detail->id
    if (!move_learn_method_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", move_learn_method_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // move_learn_method_detail->name
    if (!move_learn_method_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", move_learn_method_detail->name) == NULL) {
    goto fail; //String
    }


    // move_learn_method_detail->names
    if (!move_learn_method_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (move_learn_method_detail->names) {
    list_ForEach(namesListEntry, move_learn_method_detail->names) {
    cJSON *itemLocal = move_learn_method_name_convertToJSON(namesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(names, itemLocal);
    }
    }


    // move_learn_method_detail->descriptions
    if (!move_learn_method_detail->descriptions) {
        goto fail;
    }
    cJSON *descriptions = cJSON_AddArrayToObject(item, "descriptions");
    if(descriptions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *descriptionsListEntry;
    if (move_learn_method_detail->descriptions) {
    list_ForEach(descriptionsListEntry, move_learn_method_detail->descriptions) {
    cJSON *itemLocal = move_learn_method_description_convertToJSON(descriptionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(descriptions, itemLocal);
    }
    }


    // move_learn_method_detail->version_groups
    if (!move_learn_method_detail->version_groups) {
        goto fail;
    }
    cJSON *version_groups = cJSON_AddArrayToObject(item, "version_groups");
    if(version_groups == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *version_groupsListEntry;
    if (move_learn_method_detail->version_groups) {
    list_ForEach(version_groupsListEntry, move_learn_method_detail->version_groups) {
    cJSON *itemLocal = ability_detail_pokemon_inner_pokemon_convertToJSON(version_groupsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(version_groups, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

move_learn_method_detail_t *move_learn_method_detail_parseFromJSON(cJSON *move_learn_method_detailJSON){

    move_learn_method_detail_t *move_learn_method_detail_local_var = NULL;

    // define the local list for move_learn_method_detail->names
    list_t *namesList = NULL;

    // define the local list for move_learn_method_detail->descriptions
    list_t *descriptionsList = NULL;

    // define the local list for move_learn_method_detail->version_groups
    list_t *version_groupsList = NULL;

    // move_learn_method_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(move_learn_method_detailJSON, "id");
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

    // move_learn_method_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(move_learn_method_detailJSON, "name");
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

    // move_learn_method_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(move_learn_method_detailJSON, "names");
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
        move_learn_method_name_t *namesItem = move_learn_method_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }

    // move_learn_method_detail->descriptions
    cJSON *descriptions = cJSON_GetObjectItemCaseSensitive(move_learn_method_detailJSON, "descriptions");
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
        move_learn_method_description_t *descriptionsItem = move_learn_method_description_parseFromJSON(descriptions_local_nonprimitive);

        list_addElement(descriptionsList, descriptionsItem);
    }

    // move_learn_method_detail->version_groups
    cJSON *version_groups = cJSON_GetObjectItemCaseSensitive(move_learn_method_detailJSON, "version_groups");
    if (cJSON_IsNull(version_groups)) {
        version_groups = NULL;
    }
    if (!version_groups) {
        goto end;
    }

    
    cJSON *version_groups_local_nonprimitive = NULL;
    if(!cJSON_IsArray(version_groups)){
        goto end; //nonprimitive container
    }

    version_groupsList = list_createList();

    cJSON_ArrayForEach(version_groups_local_nonprimitive,version_groups )
    {
        if(!cJSON_IsObject(version_groups_local_nonprimitive)){
            goto end;
        }
        ability_detail_pokemon_inner_pokemon_t *version_groupsItem = ability_detail_pokemon_inner_pokemon_parseFromJSON(version_groups_local_nonprimitive);

        list_addElement(version_groupsList, version_groupsItem);
    }


    move_learn_method_detail_local_var = move_learn_method_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        namesList,
        descriptionsList,
        version_groupsList
        );

    return move_learn_method_detail_local_var;
end:
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            move_learn_method_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    if (descriptionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, descriptionsList) {
            move_learn_method_description_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(descriptionsList);
        descriptionsList = NULL;
    }
    if (version_groupsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, version_groupsList) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(version_groupsList);
        version_groupsList = NULL;
    }
    return NULL;

}
