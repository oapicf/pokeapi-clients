#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_move.h"



static pokemon_move_t *pokemon_move_create_internal(
    move_summary_t *move,
    list_t *version_group_details
    ) {
    pokemon_move_t *pokemon_move_local_var = malloc(sizeof(pokemon_move_t));
    if (!pokemon_move_local_var) {
        return NULL;
    }
    memset(pokemon_move_local_var, 0, sizeof(pokemon_move_t));
    pokemon_move_local_var->_library_owned = 1;
    pokemon_move_local_var->move = move;
    pokemon_move_local_var->version_group_details = version_group_details;
    return pokemon_move_local_var;
}

__attribute__((deprecated)) pokemon_move_t *pokemon_move_create(
    move_summary_t *move,
    list_t *version_group_details
    ) {
    pokemon_move_t *result = pokemon_move_create_internal (
        move,
        version_group_details
        );
    if (!result) {
    }
    return result;
}

void pokemon_move_free(pokemon_move_t *pokemon_move) {
    if(NULL == pokemon_move){
        return ;
    }
    if(pokemon_move->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_move_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_move->move) {
        move_summary_free(pokemon_move->move);
        pokemon_move->move = NULL;
    }
    if (pokemon_move->version_group_details) {
        list_ForEach(listEntry, pokemon_move->version_group_details) {
            pokemon_move_version_group_free(listEntry->data);
        }
        list_freeList(pokemon_move->version_group_details);
        pokemon_move->version_group_details = NULL;
    }
    free(pokemon_move);
}

cJSON *pokemon_move_convertToJSON(pokemon_move_t *pokemon_move) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_move->move
    if (!pokemon_move->move) {
        goto fail;
    }
    cJSON *move_local_JSON = move_summary_convertToJSON(pokemon_move->move);
    if(move_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "move", move_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_move->version_group_details
    if (!pokemon_move->version_group_details) {
        goto fail;
    }
    cJSON *version_group_details = cJSON_AddArrayToObject(item, "version_group_details");
    if(version_group_details == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *version_group_detailsListEntry;
    if (pokemon_move->version_group_details) {
    list_ForEach(version_group_detailsListEntry, pokemon_move->version_group_details) {
    cJSON *itemLocal = pokemon_move_version_group_convertToJSON(version_group_detailsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(version_group_details, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_move_t *pokemon_move_parseFromJSON(cJSON *pokemon_moveJSON){

    pokemon_move_t *pokemon_move_local_var = NULL;

    // define the local variable for pokemon_move->move
    move_summary_t *move_local_nonprim = NULL;

    // define the local list for pokemon_move->version_group_details
    list_t *version_group_detailsList = NULL;

    // pokemon_move->move
    cJSON *move = cJSON_GetObjectItemCaseSensitive(pokemon_moveJSON, "move");
    if (cJSON_IsNull(move)) {
        move = NULL;
    }
    if (!move) {
        goto end;
    }

    
    move_local_nonprim = move_summary_parseFromJSON(move); //nonprimitive

    // pokemon_move->version_group_details
    cJSON *version_group_details = cJSON_GetObjectItemCaseSensitive(pokemon_moveJSON, "version_group_details");
    if (cJSON_IsNull(version_group_details)) {
        version_group_details = NULL;
    }
    if (!version_group_details) {
        goto end;
    }

    
    cJSON *version_group_details_local_nonprimitive = NULL;
    if(!cJSON_IsArray(version_group_details)){
        goto end; //nonprimitive container
    }

    version_group_detailsList = list_createList();

    cJSON_ArrayForEach(version_group_details_local_nonprimitive,version_group_details )
    {
        if(!cJSON_IsObject(version_group_details_local_nonprimitive)){
            goto end;
        }
        pokemon_move_version_group_t *version_group_detailsItem = pokemon_move_version_group_parseFromJSON(version_group_details_local_nonprimitive);

        list_addElement(version_group_detailsList, version_group_detailsItem);
    }



    pokemon_move_local_var = pokemon_move_create_internal (
        move_local_nonprim,
        version_group_detailsList
        );

    if (!pokemon_move_local_var) {
        goto end;
    }

    return pokemon_move_local_var;
end:
    if (move_local_nonprim) {
        move_summary_free(move_local_nonprim);
        move_local_nonprim = NULL;
    }
    if (version_group_detailsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, version_group_detailsList) {
            pokemon_move_version_group_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(version_group_detailsList);
        version_group_detailsList = NULL;
    }
    return NULL;

}
