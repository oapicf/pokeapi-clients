#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_detail_moves_inner.h"



static pokemon_detail_moves_inner_t *pokemon_detail_moves_inner_create_internal(
    ability_detail_pokemon_inner_pokemon_t *move,
    list_t *version_group_details
    ) {
    pokemon_detail_moves_inner_t *pokemon_detail_moves_inner_local_var = malloc(sizeof(pokemon_detail_moves_inner_t));
    if (!pokemon_detail_moves_inner_local_var) {
        return NULL;
    }
    pokemon_detail_moves_inner_local_var->move = move;
    pokemon_detail_moves_inner_local_var->version_group_details = version_group_details;

    pokemon_detail_moves_inner_local_var->_library_owned = 1;
    return pokemon_detail_moves_inner_local_var;
}

__attribute__((deprecated)) pokemon_detail_moves_inner_t *pokemon_detail_moves_inner_create(
    ability_detail_pokemon_inner_pokemon_t *move,
    list_t *version_group_details
    ) {
    return pokemon_detail_moves_inner_create_internal (
        move,
        version_group_details
        );
}

void pokemon_detail_moves_inner_free(pokemon_detail_moves_inner_t *pokemon_detail_moves_inner) {
    if(NULL == pokemon_detail_moves_inner){
        return ;
    }
    if(pokemon_detail_moves_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_detail_moves_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_detail_moves_inner->move) {
        ability_detail_pokemon_inner_pokemon_free(pokemon_detail_moves_inner->move);
        pokemon_detail_moves_inner->move = NULL;
    }
    if (pokemon_detail_moves_inner->version_group_details) {
        list_ForEach(listEntry, pokemon_detail_moves_inner->version_group_details) {
            pokemon_detail_moves_inner_version_group_details_inner_free(listEntry->data);
        }
        list_freeList(pokemon_detail_moves_inner->version_group_details);
        pokemon_detail_moves_inner->version_group_details = NULL;
    }
    free(pokemon_detail_moves_inner);
}

cJSON *pokemon_detail_moves_inner_convertToJSON(pokemon_detail_moves_inner_t *pokemon_detail_moves_inner) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_detail_moves_inner->move
    if (!pokemon_detail_moves_inner->move) {
        goto fail;
    }
    cJSON *move_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(pokemon_detail_moves_inner->move);
    if(move_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "move", move_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_detail_moves_inner->version_group_details
    if (!pokemon_detail_moves_inner->version_group_details) {
        goto fail;
    }
    cJSON *version_group_details = cJSON_AddArrayToObject(item, "version_group_details");
    if(version_group_details == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *version_group_detailsListEntry;
    if (pokemon_detail_moves_inner->version_group_details) {
    list_ForEach(version_group_detailsListEntry, pokemon_detail_moves_inner->version_group_details) {
    cJSON *itemLocal = pokemon_detail_moves_inner_version_group_details_inner_convertToJSON(version_group_detailsListEntry->data);
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

pokemon_detail_moves_inner_t *pokemon_detail_moves_inner_parseFromJSON(cJSON *pokemon_detail_moves_innerJSON){

    pokemon_detail_moves_inner_t *pokemon_detail_moves_inner_local_var = NULL;

    // define the local variable for pokemon_detail_moves_inner->move
    ability_detail_pokemon_inner_pokemon_t *move_local_nonprim = NULL;

    // define the local list for pokemon_detail_moves_inner->version_group_details
    list_t *version_group_detailsList = NULL;

    // pokemon_detail_moves_inner->move
    cJSON *move = cJSON_GetObjectItemCaseSensitive(pokemon_detail_moves_innerJSON, "move");
    if (cJSON_IsNull(move)) {
        move = NULL;
    }
    if (!move) {
        goto end;
    }

    
    move_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(move); //nonprimitive

    // pokemon_detail_moves_inner->version_group_details
    cJSON *version_group_details = cJSON_GetObjectItemCaseSensitive(pokemon_detail_moves_innerJSON, "version_group_details");
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
        pokemon_detail_moves_inner_version_group_details_inner_t *version_group_detailsItem = pokemon_detail_moves_inner_version_group_details_inner_parseFromJSON(version_group_details_local_nonprimitive);

        list_addElement(version_group_detailsList, version_group_detailsItem);
    }


    pokemon_detail_moves_inner_local_var = pokemon_detail_moves_inner_create_internal (
        move_local_nonprim,
        version_group_detailsList
        );

    return pokemon_detail_moves_inner_local_var;
end:
    if (move_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(move_local_nonprim);
        move_local_nonprim = NULL;
    }
    if (version_group_detailsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, version_group_detailsList) {
            pokemon_detail_moves_inner_version_group_details_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(version_group_detailsList);
        version_group_detailsList = NULL;
    }
    return NULL;

}
