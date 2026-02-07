#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_target_detail.h"



static move_target_detail_t *move_target_detail_create_internal(
    int id,
    char *name,
    list_t *descriptions,
    list_t *moves,
    list_t *names
    ) {
    move_target_detail_t *move_target_detail_local_var = malloc(sizeof(move_target_detail_t));
    if (!move_target_detail_local_var) {
        return NULL;
    }
    move_target_detail_local_var->id = id;
    move_target_detail_local_var->name = name;
    move_target_detail_local_var->descriptions = descriptions;
    move_target_detail_local_var->moves = moves;
    move_target_detail_local_var->names = names;

    move_target_detail_local_var->_library_owned = 1;
    return move_target_detail_local_var;
}

__attribute__((deprecated)) move_target_detail_t *move_target_detail_create(
    int id,
    char *name,
    list_t *descriptions,
    list_t *moves,
    list_t *names
    ) {
    return move_target_detail_create_internal (
        id,
        name,
        descriptions,
        moves,
        names
        );
}

void move_target_detail_free(move_target_detail_t *move_target_detail) {
    if(NULL == move_target_detail){
        return ;
    }
    if(move_target_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_target_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_target_detail->name) {
        free(move_target_detail->name);
        move_target_detail->name = NULL;
    }
    if (move_target_detail->descriptions) {
        list_ForEach(listEntry, move_target_detail->descriptions) {
            move_target_description_free(listEntry->data);
        }
        list_freeList(move_target_detail->descriptions);
        move_target_detail->descriptions = NULL;
    }
    if (move_target_detail->moves) {
        list_ForEach(listEntry, move_target_detail->moves) {
            move_summary_free(listEntry->data);
        }
        list_freeList(move_target_detail->moves);
        move_target_detail->moves = NULL;
    }
    if (move_target_detail->names) {
        list_ForEach(listEntry, move_target_detail->names) {
            move_target_name_free(listEntry->data);
        }
        list_freeList(move_target_detail->names);
        move_target_detail->names = NULL;
    }
    free(move_target_detail);
}

cJSON *move_target_detail_convertToJSON(move_target_detail_t *move_target_detail) {
    cJSON *item = cJSON_CreateObject();

    // move_target_detail->id
    if (!move_target_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", move_target_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // move_target_detail->name
    if (!move_target_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", move_target_detail->name) == NULL) {
    goto fail; //String
    }


    // move_target_detail->descriptions
    if (!move_target_detail->descriptions) {
        goto fail;
    }
    cJSON *descriptions = cJSON_AddArrayToObject(item, "descriptions");
    if(descriptions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *descriptionsListEntry;
    if (move_target_detail->descriptions) {
    list_ForEach(descriptionsListEntry, move_target_detail->descriptions) {
    cJSON *itemLocal = move_target_description_convertToJSON(descriptionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(descriptions, itemLocal);
    }
    }


    // move_target_detail->moves
    if (!move_target_detail->moves) {
        goto fail;
    }
    cJSON *moves = cJSON_AddArrayToObject(item, "moves");
    if(moves == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *movesListEntry;
    if (move_target_detail->moves) {
    list_ForEach(movesListEntry, move_target_detail->moves) {
    cJSON *itemLocal = move_summary_convertToJSON(movesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(moves, itemLocal);
    }
    }


    // move_target_detail->names
    if (!move_target_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (move_target_detail->names) {
    list_ForEach(namesListEntry, move_target_detail->names) {
    cJSON *itemLocal = move_target_name_convertToJSON(namesListEntry->data);
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

move_target_detail_t *move_target_detail_parseFromJSON(cJSON *move_target_detailJSON){

    move_target_detail_t *move_target_detail_local_var = NULL;

    // define the local list for move_target_detail->descriptions
    list_t *descriptionsList = NULL;

    // define the local list for move_target_detail->moves
    list_t *movesList = NULL;

    // define the local list for move_target_detail->names
    list_t *namesList = NULL;

    // move_target_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(move_target_detailJSON, "id");
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

    // move_target_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(move_target_detailJSON, "name");
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

    // move_target_detail->descriptions
    cJSON *descriptions = cJSON_GetObjectItemCaseSensitive(move_target_detailJSON, "descriptions");
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
        move_target_description_t *descriptionsItem = move_target_description_parseFromJSON(descriptions_local_nonprimitive);

        list_addElement(descriptionsList, descriptionsItem);
    }

    // move_target_detail->moves
    cJSON *moves = cJSON_GetObjectItemCaseSensitive(move_target_detailJSON, "moves");
    if (cJSON_IsNull(moves)) {
        moves = NULL;
    }
    if (!moves) {
        goto end;
    }

    
    cJSON *moves_local_nonprimitive = NULL;
    if(!cJSON_IsArray(moves)){
        goto end; //nonprimitive container
    }

    movesList = list_createList();

    cJSON_ArrayForEach(moves_local_nonprimitive,moves )
    {
        if(!cJSON_IsObject(moves_local_nonprimitive)){
            goto end;
        }
        move_summary_t *movesItem = move_summary_parseFromJSON(moves_local_nonprimitive);

        list_addElement(movesList, movesItem);
    }

    // move_target_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(move_target_detailJSON, "names");
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
        move_target_name_t *namesItem = move_target_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }


    move_target_detail_local_var = move_target_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        descriptionsList,
        movesList,
        namesList
        );

    return move_target_detail_local_var;
end:
    if (descriptionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, descriptionsList) {
            move_target_description_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(descriptionsList);
        descriptionsList = NULL;
    }
    if (movesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, movesList) {
            move_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(movesList);
        movesList = NULL;
    }
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            move_target_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    return NULL;

}
