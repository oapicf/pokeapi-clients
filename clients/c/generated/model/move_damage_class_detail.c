#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_damage_class_detail.h"



static move_damage_class_detail_t *move_damage_class_detail_create_internal(
    int id,
    char *name,
    list_t *descriptions,
    list_t *moves,
    list_t *names
    ) {
    move_damage_class_detail_t *move_damage_class_detail_local_var = malloc(sizeof(move_damage_class_detail_t));
    if (!move_damage_class_detail_local_var) {
        return NULL;
    }
    move_damage_class_detail_local_var->id = id;
    move_damage_class_detail_local_var->name = name;
    move_damage_class_detail_local_var->descriptions = descriptions;
    move_damage_class_detail_local_var->moves = moves;
    move_damage_class_detail_local_var->names = names;

    move_damage_class_detail_local_var->_library_owned = 1;
    return move_damage_class_detail_local_var;
}

__attribute__((deprecated)) move_damage_class_detail_t *move_damage_class_detail_create(
    int id,
    char *name,
    list_t *descriptions,
    list_t *moves,
    list_t *names
    ) {
    return move_damage_class_detail_create_internal (
        id,
        name,
        descriptions,
        moves,
        names
        );
}

void move_damage_class_detail_free(move_damage_class_detail_t *move_damage_class_detail) {
    if(NULL == move_damage_class_detail){
        return ;
    }
    if(move_damage_class_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_damage_class_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_damage_class_detail->name) {
        free(move_damage_class_detail->name);
        move_damage_class_detail->name = NULL;
    }
    if (move_damage_class_detail->descriptions) {
        list_ForEach(listEntry, move_damage_class_detail->descriptions) {
            move_damage_class_description_free(listEntry->data);
        }
        list_freeList(move_damage_class_detail->descriptions);
        move_damage_class_detail->descriptions = NULL;
    }
    if (move_damage_class_detail->moves) {
        list_ForEach(listEntry, move_damage_class_detail->moves) {
            move_summary_free(listEntry->data);
        }
        list_freeList(move_damage_class_detail->moves);
        move_damage_class_detail->moves = NULL;
    }
    if (move_damage_class_detail->names) {
        list_ForEach(listEntry, move_damage_class_detail->names) {
            move_damage_class_name_free(listEntry->data);
        }
        list_freeList(move_damage_class_detail->names);
        move_damage_class_detail->names = NULL;
    }
    free(move_damage_class_detail);
}

cJSON *move_damage_class_detail_convertToJSON(move_damage_class_detail_t *move_damage_class_detail) {
    cJSON *item = cJSON_CreateObject();

    // move_damage_class_detail->id
    if (!move_damage_class_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", move_damage_class_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // move_damage_class_detail->name
    if (!move_damage_class_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", move_damage_class_detail->name) == NULL) {
    goto fail; //String
    }


    // move_damage_class_detail->descriptions
    if (!move_damage_class_detail->descriptions) {
        goto fail;
    }
    cJSON *descriptions = cJSON_AddArrayToObject(item, "descriptions");
    if(descriptions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *descriptionsListEntry;
    if (move_damage_class_detail->descriptions) {
    list_ForEach(descriptionsListEntry, move_damage_class_detail->descriptions) {
    cJSON *itemLocal = move_damage_class_description_convertToJSON(descriptionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(descriptions, itemLocal);
    }
    }


    // move_damage_class_detail->moves
    if (!move_damage_class_detail->moves) {
        goto fail;
    }
    cJSON *moves = cJSON_AddArrayToObject(item, "moves");
    if(moves == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *movesListEntry;
    if (move_damage_class_detail->moves) {
    list_ForEach(movesListEntry, move_damage_class_detail->moves) {
    cJSON *itemLocal = move_summary_convertToJSON(movesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(moves, itemLocal);
    }
    }


    // move_damage_class_detail->names
    if (!move_damage_class_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (move_damage_class_detail->names) {
    list_ForEach(namesListEntry, move_damage_class_detail->names) {
    cJSON *itemLocal = move_damage_class_name_convertToJSON(namesListEntry->data);
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

move_damage_class_detail_t *move_damage_class_detail_parseFromJSON(cJSON *move_damage_class_detailJSON){

    move_damage_class_detail_t *move_damage_class_detail_local_var = NULL;

    // define the local list for move_damage_class_detail->descriptions
    list_t *descriptionsList = NULL;

    // define the local list for move_damage_class_detail->moves
    list_t *movesList = NULL;

    // define the local list for move_damage_class_detail->names
    list_t *namesList = NULL;

    // move_damage_class_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(move_damage_class_detailJSON, "id");
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

    // move_damage_class_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(move_damage_class_detailJSON, "name");
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

    // move_damage_class_detail->descriptions
    cJSON *descriptions = cJSON_GetObjectItemCaseSensitive(move_damage_class_detailJSON, "descriptions");
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
        move_damage_class_description_t *descriptionsItem = move_damage_class_description_parseFromJSON(descriptions_local_nonprimitive);

        list_addElement(descriptionsList, descriptionsItem);
    }

    // move_damage_class_detail->moves
    cJSON *moves = cJSON_GetObjectItemCaseSensitive(move_damage_class_detailJSON, "moves");
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

    // move_damage_class_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(move_damage_class_detailJSON, "names");
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
        move_damage_class_name_t *namesItem = move_damage_class_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }


    move_damage_class_detail_local_var = move_damage_class_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        descriptionsList,
        movesList,
        namesList
        );

    return move_damage_class_detail_local_var;
end:
    if (descriptionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, descriptionsList) {
            move_damage_class_description_free(listEntry->data);
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
            move_damage_class_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    return NULL;

}
