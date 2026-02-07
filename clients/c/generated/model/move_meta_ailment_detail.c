#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_meta_ailment_detail.h"



static move_meta_ailment_detail_t *move_meta_ailment_detail_create_internal(
    int id,
    char *name,
    list_t *moves,
    list_t *names
    ) {
    move_meta_ailment_detail_t *move_meta_ailment_detail_local_var = malloc(sizeof(move_meta_ailment_detail_t));
    if (!move_meta_ailment_detail_local_var) {
        return NULL;
    }
    move_meta_ailment_detail_local_var->id = id;
    move_meta_ailment_detail_local_var->name = name;
    move_meta_ailment_detail_local_var->moves = moves;
    move_meta_ailment_detail_local_var->names = names;

    move_meta_ailment_detail_local_var->_library_owned = 1;
    return move_meta_ailment_detail_local_var;
}

__attribute__((deprecated)) move_meta_ailment_detail_t *move_meta_ailment_detail_create(
    int id,
    char *name,
    list_t *moves,
    list_t *names
    ) {
    return move_meta_ailment_detail_create_internal (
        id,
        name,
        moves,
        names
        );
}

void move_meta_ailment_detail_free(move_meta_ailment_detail_t *move_meta_ailment_detail) {
    if(NULL == move_meta_ailment_detail){
        return ;
    }
    if(move_meta_ailment_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_meta_ailment_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_meta_ailment_detail->name) {
        free(move_meta_ailment_detail->name);
        move_meta_ailment_detail->name = NULL;
    }
    if (move_meta_ailment_detail->moves) {
        list_ForEach(listEntry, move_meta_ailment_detail->moves) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
        }
        list_freeList(move_meta_ailment_detail->moves);
        move_meta_ailment_detail->moves = NULL;
    }
    if (move_meta_ailment_detail->names) {
        list_ForEach(listEntry, move_meta_ailment_detail->names) {
            move_meta_ailment_name_free(listEntry->data);
        }
        list_freeList(move_meta_ailment_detail->names);
        move_meta_ailment_detail->names = NULL;
    }
    free(move_meta_ailment_detail);
}

cJSON *move_meta_ailment_detail_convertToJSON(move_meta_ailment_detail_t *move_meta_ailment_detail) {
    cJSON *item = cJSON_CreateObject();

    // move_meta_ailment_detail->id
    if (!move_meta_ailment_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", move_meta_ailment_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // move_meta_ailment_detail->name
    if (!move_meta_ailment_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", move_meta_ailment_detail->name) == NULL) {
    goto fail; //String
    }


    // move_meta_ailment_detail->moves
    if (!move_meta_ailment_detail->moves) {
        goto fail;
    }
    cJSON *moves = cJSON_AddArrayToObject(item, "moves");
    if(moves == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *movesListEntry;
    if (move_meta_ailment_detail->moves) {
    list_ForEach(movesListEntry, move_meta_ailment_detail->moves) {
    cJSON *itemLocal = ability_detail_pokemon_inner_pokemon_convertToJSON(movesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(moves, itemLocal);
    }
    }


    // move_meta_ailment_detail->names
    if (!move_meta_ailment_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (move_meta_ailment_detail->names) {
    list_ForEach(namesListEntry, move_meta_ailment_detail->names) {
    cJSON *itemLocal = move_meta_ailment_name_convertToJSON(namesListEntry->data);
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

move_meta_ailment_detail_t *move_meta_ailment_detail_parseFromJSON(cJSON *move_meta_ailment_detailJSON){

    move_meta_ailment_detail_t *move_meta_ailment_detail_local_var = NULL;

    // define the local list for move_meta_ailment_detail->moves
    list_t *movesList = NULL;

    // define the local list for move_meta_ailment_detail->names
    list_t *namesList = NULL;

    // move_meta_ailment_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(move_meta_ailment_detailJSON, "id");
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

    // move_meta_ailment_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(move_meta_ailment_detailJSON, "name");
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

    // move_meta_ailment_detail->moves
    cJSON *moves = cJSON_GetObjectItemCaseSensitive(move_meta_ailment_detailJSON, "moves");
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
        ability_detail_pokemon_inner_pokemon_t *movesItem = ability_detail_pokemon_inner_pokemon_parseFromJSON(moves_local_nonprimitive);

        list_addElement(movesList, movesItem);
    }

    // move_meta_ailment_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(move_meta_ailment_detailJSON, "names");
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
        move_meta_ailment_name_t *namesItem = move_meta_ailment_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }


    move_meta_ailment_detail_local_var = move_meta_ailment_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        movesList,
        namesList
        );

    return move_meta_ailment_detail_local_var;
end:
    if (movesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, movesList) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(movesList);
        movesList = NULL;
    }
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            move_meta_ailment_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    return NULL;

}
