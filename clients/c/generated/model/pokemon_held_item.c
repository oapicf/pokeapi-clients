#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_held_item.h"



static pokemon_held_item_t *pokemon_held_item_create_internal(
    pokemon_summary_t *pokemon,
    list_t *version_details
    ) {
    pokemon_held_item_t *pokemon_held_item_local_var = malloc(sizeof(pokemon_held_item_t));
    if (!pokemon_held_item_local_var) {
        return NULL;
    }
    memset(pokemon_held_item_local_var, 0, sizeof(pokemon_held_item_t));
    pokemon_held_item_local_var->_library_owned = 1;
    pokemon_held_item_local_var->pokemon = pokemon;
    pokemon_held_item_local_var->version_details = version_details;
    return pokemon_held_item_local_var;
}

__attribute__((deprecated)) pokemon_held_item_t *pokemon_held_item_create(
    pokemon_summary_t *pokemon,
    list_t *version_details
    ) {
    pokemon_held_item_t *result = pokemon_held_item_create_internal (
        pokemon,
        version_details
        );
    if (!result) {
    }
    return result;
}

void pokemon_held_item_free(pokemon_held_item_t *pokemon_held_item) {
    if(NULL == pokemon_held_item){
        return ;
    }
    if(pokemon_held_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_held_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_held_item->pokemon) {
        pokemon_summary_free(pokemon_held_item->pokemon);
        pokemon_held_item->pokemon = NULL;
    }
    if (pokemon_held_item->version_details) {
        list_ForEach(listEntry, pokemon_held_item->version_details) {
            pokemon_held_item_version_free(listEntry->data);
        }
        list_freeList(pokemon_held_item->version_details);
        pokemon_held_item->version_details = NULL;
    }
    free(pokemon_held_item);
}

cJSON *pokemon_held_item_convertToJSON(pokemon_held_item_t *pokemon_held_item) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_held_item->pokemon
    if (!pokemon_held_item->pokemon) {
        goto fail;
    }
    cJSON *pokemon_local_JSON = pokemon_summary_convertToJSON(pokemon_held_item->pokemon);
    if(pokemon_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pokemon", pokemon_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_held_item->version_details
    if (!pokemon_held_item->version_details) {
        goto fail;
    }
    cJSON *version_details = cJSON_AddArrayToObject(item, "version_details");
    if(version_details == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *version_detailsListEntry;
    if (pokemon_held_item->version_details) {
    list_ForEach(version_detailsListEntry, pokemon_held_item->version_details) {
    cJSON *itemLocal = pokemon_held_item_version_convertToJSON(version_detailsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(version_details, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_held_item_t *pokemon_held_item_parseFromJSON(cJSON *pokemon_held_itemJSON){

    pokemon_held_item_t *pokemon_held_item_local_var = NULL;

    // define the local variable for pokemon_held_item->pokemon
    pokemon_summary_t *pokemon_local_nonprim = NULL;

    // define the local list for pokemon_held_item->version_details
    list_t *version_detailsList = NULL;

    // pokemon_held_item->pokemon
    cJSON *pokemon = cJSON_GetObjectItemCaseSensitive(pokemon_held_itemJSON, "pokemon");
    if (cJSON_IsNull(pokemon)) {
        pokemon = NULL;
    }
    if (!pokemon) {
        goto end;
    }

    
    pokemon_local_nonprim = pokemon_summary_parseFromJSON(pokemon); //nonprimitive

    // pokemon_held_item->version_details
    cJSON *version_details = cJSON_GetObjectItemCaseSensitive(pokemon_held_itemJSON, "version_details");
    if (cJSON_IsNull(version_details)) {
        version_details = NULL;
    }
    if (!version_details) {
        goto end;
    }

    
    cJSON *version_details_local_nonprimitive = NULL;
    if(!cJSON_IsArray(version_details)){
        goto end; //nonprimitive container
    }

    version_detailsList = list_createList();

    cJSON_ArrayForEach(version_details_local_nonprimitive,version_details )
    {
        if(!cJSON_IsObject(version_details_local_nonprimitive)){
            goto end;
        }
        pokemon_held_item_version_t *version_detailsItem = pokemon_held_item_version_parseFromJSON(version_details_local_nonprimitive);

        list_addElement(version_detailsList, version_detailsItem);
    }



    pokemon_held_item_local_var = pokemon_held_item_create_internal (
        pokemon_local_nonprim,
        version_detailsList
        );

    if (!pokemon_held_item_local_var) {
        goto end;
    }

    return pokemon_held_item_local_var;
end:
    if (pokemon_local_nonprim) {
        pokemon_summary_free(pokemon_local_nonprim);
        pokemon_local_nonprim = NULL;
    }
    if (version_detailsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, version_detailsList) {
            pokemon_held_item_version_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(version_detailsList);
        version_detailsList = NULL;
    }
    return NULL;

}
