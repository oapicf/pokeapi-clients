#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_detail_held_items.h"



static pokemon_detail_held_items_t *pokemon_detail_held_items_create_internal(
    ability_detail_pokemon_inner_pokemon_t *item,
    list_t *version_details
    ) {
    pokemon_detail_held_items_t *pokemon_detail_held_items_local_var = malloc(sizeof(pokemon_detail_held_items_t));
    if (!pokemon_detail_held_items_local_var) {
        return NULL;
    }
    pokemon_detail_held_items_local_var->item = item;
    pokemon_detail_held_items_local_var->version_details = version_details;

    pokemon_detail_held_items_local_var->_library_owned = 1;
    return pokemon_detail_held_items_local_var;
}

__attribute__((deprecated)) pokemon_detail_held_items_t *pokemon_detail_held_items_create(
    ability_detail_pokemon_inner_pokemon_t *item,
    list_t *version_details
    ) {
    return pokemon_detail_held_items_create_internal (
        item,
        version_details
        );
}

void pokemon_detail_held_items_free(pokemon_detail_held_items_t *pokemon_detail_held_items) {
    if(NULL == pokemon_detail_held_items){
        return ;
    }
    if(pokemon_detail_held_items->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_detail_held_items_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_detail_held_items->item) {
        ability_detail_pokemon_inner_pokemon_free(pokemon_detail_held_items->item);
        pokemon_detail_held_items->item = NULL;
    }
    if (pokemon_detail_held_items->version_details) {
        list_ForEach(listEntry, pokemon_detail_held_items->version_details) {
            item_detail_held_by_pokemon_inner_version_details_inner_free(listEntry->data);
        }
        list_freeList(pokemon_detail_held_items->version_details);
        pokemon_detail_held_items->version_details = NULL;
    }
    free(pokemon_detail_held_items);
}

cJSON *pokemon_detail_held_items_convertToJSON(pokemon_detail_held_items_t *pokemon_detail_held_items) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_detail_held_items->item
    if (!pokemon_detail_held_items->item) {
        goto fail;
    }
    cJSON *item_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(pokemon_detail_held_items->item);
    if(item_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "item", item_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_detail_held_items->version_details
    if (!pokemon_detail_held_items->version_details) {
        goto fail;
    }
    cJSON *version_details = cJSON_AddArrayToObject(item, "version_details");
    if(version_details == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *version_detailsListEntry;
    if (pokemon_detail_held_items->version_details) {
    list_ForEach(version_detailsListEntry, pokemon_detail_held_items->version_details) {
    cJSON *itemLocal = item_detail_held_by_pokemon_inner_version_details_inner_convertToJSON(version_detailsListEntry->data);
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

pokemon_detail_held_items_t *pokemon_detail_held_items_parseFromJSON(cJSON *pokemon_detail_held_itemsJSON){

    pokemon_detail_held_items_t *pokemon_detail_held_items_local_var = NULL;

    // define the local variable for pokemon_detail_held_items->item
    ability_detail_pokemon_inner_pokemon_t *item_local_nonprim = NULL;

    // define the local list for pokemon_detail_held_items->version_details
    list_t *version_detailsList = NULL;

    // pokemon_detail_held_items->item
    cJSON *item = cJSON_GetObjectItemCaseSensitive(pokemon_detail_held_itemsJSON, "item");
    if (cJSON_IsNull(item)) {
        item = NULL;
    }
    if (!item) {
        goto end;
    }

    
    item_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(item); //nonprimitive

    // pokemon_detail_held_items->version_details
    cJSON *version_details = cJSON_GetObjectItemCaseSensitive(pokemon_detail_held_itemsJSON, "version_details");
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
        item_detail_held_by_pokemon_inner_version_details_inner_t *version_detailsItem = item_detail_held_by_pokemon_inner_version_details_inner_parseFromJSON(version_details_local_nonprimitive);

        list_addElement(version_detailsList, version_detailsItem);
    }


    pokemon_detail_held_items_local_var = pokemon_detail_held_items_create_internal (
        item_local_nonprim,
        version_detailsList
        );

    return pokemon_detail_held_items_local_var;
end:
    if (item_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(item_local_nonprim);
        item_local_nonprim = NULL;
    }
    if (version_detailsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, version_detailsList) {
            item_detail_held_by_pokemon_inner_version_details_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(version_detailsList);
        version_detailsList = NULL;
    }
    return NULL;

}
