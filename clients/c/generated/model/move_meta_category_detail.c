#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_meta_category_detail.h"



static move_meta_category_detail_t *move_meta_category_detail_create_internal(
    int id,
    char *name,
    list_t *descriptions,
    list_t *moves
    ) {
    move_meta_category_detail_t *move_meta_category_detail_local_var = malloc(sizeof(move_meta_category_detail_t));
    if (!move_meta_category_detail_local_var) {
        return NULL;
    }
    move_meta_category_detail_local_var->id = id;
    move_meta_category_detail_local_var->name = name;
    move_meta_category_detail_local_var->descriptions = descriptions;
    move_meta_category_detail_local_var->moves = moves;

    move_meta_category_detail_local_var->_library_owned = 1;
    return move_meta_category_detail_local_var;
}

__attribute__((deprecated)) move_meta_category_detail_t *move_meta_category_detail_create(
    int id,
    char *name,
    list_t *descriptions,
    list_t *moves
    ) {
    return move_meta_category_detail_create_internal (
        id,
        name,
        descriptions,
        moves
        );
}

void move_meta_category_detail_free(move_meta_category_detail_t *move_meta_category_detail) {
    if(NULL == move_meta_category_detail){
        return ;
    }
    if(move_meta_category_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_meta_category_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_meta_category_detail->name) {
        free(move_meta_category_detail->name);
        move_meta_category_detail->name = NULL;
    }
    if (move_meta_category_detail->descriptions) {
        list_ForEach(listEntry, move_meta_category_detail->descriptions) {
            move_meta_category_description_free(listEntry->data);
        }
        list_freeList(move_meta_category_detail->descriptions);
        move_meta_category_detail->descriptions = NULL;
    }
    if (move_meta_category_detail->moves) {
        list_ForEach(listEntry, move_meta_category_detail->moves) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
        }
        list_freeList(move_meta_category_detail->moves);
        move_meta_category_detail->moves = NULL;
    }
    free(move_meta_category_detail);
}

cJSON *move_meta_category_detail_convertToJSON(move_meta_category_detail_t *move_meta_category_detail) {
    cJSON *item = cJSON_CreateObject();

    // move_meta_category_detail->id
    if (!move_meta_category_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", move_meta_category_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // move_meta_category_detail->name
    if (!move_meta_category_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", move_meta_category_detail->name) == NULL) {
    goto fail; //String
    }


    // move_meta_category_detail->descriptions
    if (!move_meta_category_detail->descriptions) {
        goto fail;
    }
    cJSON *descriptions = cJSON_AddArrayToObject(item, "descriptions");
    if(descriptions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *descriptionsListEntry;
    if (move_meta_category_detail->descriptions) {
    list_ForEach(descriptionsListEntry, move_meta_category_detail->descriptions) {
    cJSON *itemLocal = move_meta_category_description_convertToJSON(descriptionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(descriptions, itemLocal);
    }
    }


    // move_meta_category_detail->moves
    if (!move_meta_category_detail->moves) {
        goto fail;
    }
    cJSON *moves = cJSON_AddArrayToObject(item, "moves");
    if(moves == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *movesListEntry;
    if (move_meta_category_detail->moves) {
    list_ForEach(movesListEntry, move_meta_category_detail->moves) {
    cJSON *itemLocal = ability_detail_pokemon_inner_pokemon_convertToJSON(movesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(moves, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

move_meta_category_detail_t *move_meta_category_detail_parseFromJSON(cJSON *move_meta_category_detailJSON){

    move_meta_category_detail_t *move_meta_category_detail_local_var = NULL;

    // define the local list for move_meta_category_detail->descriptions
    list_t *descriptionsList = NULL;

    // define the local list for move_meta_category_detail->moves
    list_t *movesList = NULL;

    // move_meta_category_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(move_meta_category_detailJSON, "id");
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

    // move_meta_category_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(move_meta_category_detailJSON, "name");
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

    // move_meta_category_detail->descriptions
    cJSON *descriptions = cJSON_GetObjectItemCaseSensitive(move_meta_category_detailJSON, "descriptions");
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
        move_meta_category_description_t *descriptionsItem = move_meta_category_description_parseFromJSON(descriptions_local_nonprimitive);

        list_addElement(descriptionsList, descriptionsItem);
    }

    // move_meta_category_detail->moves
    cJSON *moves = cJSON_GetObjectItemCaseSensitive(move_meta_category_detailJSON, "moves");
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


    move_meta_category_detail_local_var = move_meta_category_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        descriptionsList,
        movesList
        );

    return move_meta_category_detail_local_var;
end:
    if (descriptionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, descriptionsList) {
            move_meta_category_description_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(descriptionsList);
        descriptionsList = NULL;
    }
    if (movesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, movesList) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(movesList);
        movesList = NULL;
    }
    return NULL;

}
