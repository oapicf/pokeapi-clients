#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_detail_held_by_pokemon_inner.h"



static item_detail_held_by_pokemon_inner_t *item_detail_held_by_pokemon_inner_create_internal(
    ability_detail_pokemon_inner_pokemon_t *pokemon,
    list_t *version_details
    ) {
    item_detail_held_by_pokemon_inner_t *item_detail_held_by_pokemon_inner_local_var = malloc(sizeof(item_detail_held_by_pokemon_inner_t));
    if (!item_detail_held_by_pokemon_inner_local_var) {
        return NULL;
    }
    item_detail_held_by_pokemon_inner_local_var->pokemon = pokemon;
    item_detail_held_by_pokemon_inner_local_var->version_details = version_details;

    item_detail_held_by_pokemon_inner_local_var->_library_owned = 1;
    return item_detail_held_by_pokemon_inner_local_var;
}

__attribute__((deprecated)) item_detail_held_by_pokemon_inner_t *item_detail_held_by_pokemon_inner_create(
    ability_detail_pokemon_inner_pokemon_t *pokemon,
    list_t *version_details
    ) {
    return item_detail_held_by_pokemon_inner_create_internal (
        pokemon,
        version_details
        );
}

void item_detail_held_by_pokemon_inner_free(item_detail_held_by_pokemon_inner_t *item_detail_held_by_pokemon_inner) {
    if(NULL == item_detail_held_by_pokemon_inner){
        return ;
    }
    if(item_detail_held_by_pokemon_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_detail_held_by_pokemon_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (item_detail_held_by_pokemon_inner->pokemon) {
        ability_detail_pokemon_inner_pokemon_free(item_detail_held_by_pokemon_inner->pokemon);
        item_detail_held_by_pokemon_inner->pokemon = NULL;
    }
    if (item_detail_held_by_pokemon_inner->version_details) {
        list_ForEach(listEntry, item_detail_held_by_pokemon_inner->version_details) {
            item_detail_held_by_pokemon_inner_version_details_inner_free(listEntry->data);
        }
        list_freeList(item_detail_held_by_pokemon_inner->version_details);
        item_detail_held_by_pokemon_inner->version_details = NULL;
    }
    free(item_detail_held_by_pokemon_inner);
}

cJSON *item_detail_held_by_pokemon_inner_convertToJSON(item_detail_held_by_pokemon_inner_t *item_detail_held_by_pokemon_inner) {
    cJSON *item = cJSON_CreateObject();

    // item_detail_held_by_pokemon_inner->pokemon
    if (!item_detail_held_by_pokemon_inner->pokemon) {
        goto fail;
    }
    cJSON *pokemon_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(item_detail_held_by_pokemon_inner->pokemon);
    if(pokemon_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pokemon", pokemon_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // item_detail_held_by_pokemon_inner->version_details
    if (!item_detail_held_by_pokemon_inner->version_details) {
        goto fail;
    }
    cJSON *version_details = cJSON_AddArrayToObject(item, "version-details");
    if(version_details == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *version_detailsListEntry;
    if (item_detail_held_by_pokemon_inner->version_details) {
    list_ForEach(version_detailsListEntry, item_detail_held_by_pokemon_inner->version_details) {
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

item_detail_held_by_pokemon_inner_t *item_detail_held_by_pokemon_inner_parseFromJSON(cJSON *item_detail_held_by_pokemon_innerJSON){

    item_detail_held_by_pokemon_inner_t *item_detail_held_by_pokemon_inner_local_var = NULL;

    // define the local variable for item_detail_held_by_pokemon_inner->pokemon
    ability_detail_pokemon_inner_pokemon_t *pokemon_local_nonprim = NULL;

    // define the local list for item_detail_held_by_pokemon_inner->version_details
    list_t *version_detailsList = NULL;

    // item_detail_held_by_pokemon_inner->pokemon
    cJSON *pokemon = cJSON_GetObjectItemCaseSensitive(item_detail_held_by_pokemon_innerJSON, "pokemon");
    if (cJSON_IsNull(pokemon)) {
        pokemon = NULL;
    }
    if (!pokemon) {
        goto end;
    }

    
    pokemon_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(pokemon); //nonprimitive

    // item_detail_held_by_pokemon_inner->version_details
    cJSON *version_details = cJSON_GetObjectItemCaseSensitive(item_detail_held_by_pokemon_innerJSON, "version-details");
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


    item_detail_held_by_pokemon_inner_local_var = item_detail_held_by_pokemon_inner_create_internal (
        pokemon_local_nonprim,
        version_detailsList
        );

    return item_detail_held_by_pokemon_inner_local_var;
end:
    if (pokemon_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(pokemon_local_nonprim);
        pokemon_local_nonprim = NULL;
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
