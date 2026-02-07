#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_battle_style_detail.h"



static move_battle_style_detail_t *move_battle_style_detail_create_internal(
    int id,
    char *name,
    list_t *names
    ) {
    move_battle_style_detail_t *move_battle_style_detail_local_var = malloc(sizeof(move_battle_style_detail_t));
    if (!move_battle_style_detail_local_var) {
        return NULL;
    }
    move_battle_style_detail_local_var->id = id;
    move_battle_style_detail_local_var->name = name;
    move_battle_style_detail_local_var->names = names;

    move_battle_style_detail_local_var->_library_owned = 1;
    return move_battle_style_detail_local_var;
}

__attribute__((deprecated)) move_battle_style_detail_t *move_battle_style_detail_create(
    int id,
    char *name,
    list_t *names
    ) {
    return move_battle_style_detail_create_internal (
        id,
        name,
        names
        );
}

void move_battle_style_detail_free(move_battle_style_detail_t *move_battle_style_detail) {
    if(NULL == move_battle_style_detail){
        return ;
    }
    if(move_battle_style_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_battle_style_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_battle_style_detail->name) {
        free(move_battle_style_detail->name);
        move_battle_style_detail->name = NULL;
    }
    if (move_battle_style_detail->names) {
        list_ForEach(listEntry, move_battle_style_detail->names) {
            move_battle_style_name_free(listEntry->data);
        }
        list_freeList(move_battle_style_detail->names);
        move_battle_style_detail->names = NULL;
    }
    free(move_battle_style_detail);
}

cJSON *move_battle_style_detail_convertToJSON(move_battle_style_detail_t *move_battle_style_detail) {
    cJSON *item = cJSON_CreateObject();

    // move_battle_style_detail->id
    if (!move_battle_style_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", move_battle_style_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // move_battle_style_detail->name
    if (!move_battle_style_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", move_battle_style_detail->name) == NULL) {
    goto fail; //String
    }


    // move_battle_style_detail->names
    if (!move_battle_style_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (move_battle_style_detail->names) {
    list_ForEach(namesListEntry, move_battle_style_detail->names) {
    cJSON *itemLocal = move_battle_style_name_convertToJSON(namesListEntry->data);
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

move_battle_style_detail_t *move_battle_style_detail_parseFromJSON(cJSON *move_battle_style_detailJSON){

    move_battle_style_detail_t *move_battle_style_detail_local_var = NULL;

    // define the local list for move_battle_style_detail->names
    list_t *namesList = NULL;

    // move_battle_style_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(move_battle_style_detailJSON, "id");
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

    // move_battle_style_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(move_battle_style_detailJSON, "name");
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

    // move_battle_style_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(move_battle_style_detailJSON, "names");
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
        move_battle_style_name_t *namesItem = move_battle_style_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }


    move_battle_style_detail_local_var = move_battle_style_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        namesList
        );

    return move_battle_style_detail_local_var;
end:
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            move_battle_style_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    return NULL;

}
