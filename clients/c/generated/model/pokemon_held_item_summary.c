#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_held_item_summary.h"



static pokemon_held_item_summary_t *pokemon_held_item_summary_create_internal(
    item_summary_t *item,
    list_t *version_details
    ) {
    pokemon_held_item_summary_t *pokemon_held_item_summary_local_var = malloc(sizeof(pokemon_held_item_summary_t));
    if (!pokemon_held_item_summary_local_var) {
        return NULL;
    }
    memset(pokemon_held_item_summary_local_var, 0, sizeof(pokemon_held_item_summary_t));
    pokemon_held_item_summary_local_var->_library_owned = 1;
    pokemon_held_item_summary_local_var->item = item;
    pokemon_held_item_summary_local_var->version_details = version_details;
    return pokemon_held_item_summary_local_var;
}

__attribute__((deprecated)) pokemon_held_item_summary_t *pokemon_held_item_summary_create(
    item_summary_t *item,
    list_t *version_details
    ) {
    pokemon_held_item_summary_t *result = pokemon_held_item_summary_create_internal (
        item,
        version_details
        );
    if (!result) {
    }
    return result;
}

void pokemon_held_item_summary_free(pokemon_held_item_summary_t *pokemon_held_item_summary) {
    if(NULL == pokemon_held_item_summary){
        return ;
    }
    if(pokemon_held_item_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_held_item_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_held_item_summary->item) {
        item_summary_free(pokemon_held_item_summary->item);
        pokemon_held_item_summary->item = NULL;
    }
    if (pokemon_held_item_summary->version_details) {
        list_ForEach(listEntry, pokemon_held_item_summary->version_details) {
            pokemon_held_item_version_free(listEntry->data);
        }
        list_freeList(pokemon_held_item_summary->version_details);
        pokemon_held_item_summary->version_details = NULL;
    }
    free(pokemon_held_item_summary);
}

cJSON *pokemon_held_item_summary_convertToJSON(pokemon_held_item_summary_t *pokemon_held_item_summary) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_held_item_summary->item
    if (!pokemon_held_item_summary->item) {
        goto fail;
    }
    cJSON *item_local_JSON = item_summary_convertToJSON(pokemon_held_item_summary->item);
    if(item_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "item", item_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_held_item_summary->version_details
    if (!pokemon_held_item_summary->version_details) {
        goto fail;
    }
    cJSON *version_details = cJSON_AddArrayToObject(item, "version_details");
    if(version_details == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *version_detailsListEntry;
    if (pokemon_held_item_summary->version_details) {
    list_ForEach(version_detailsListEntry, pokemon_held_item_summary->version_details) {
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

pokemon_held_item_summary_t *pokemon_held_item_summary_parseFromJSON(cJSON *pokemon_held_item_summaryJSON){

    pokemon_held_item_summary_t *pokemon_held_item_summary_local_var = NULL;

    // define the local variable for pokemon_held_item_summary->item
    item_summary_t *item_local_nonprim = NULL;

    // define the local list for pokemon_held_item_summary->version_details
    list_t *version_detailsList = NULL;

    // pokemon_held_item_summary->item
    cJSON *item = cJSON_GetObjectItemCaseSensitive(pokemon_held_item_summaryJSON, "item");
    if (cJSON_IsNull(item)) {
        item = NULL;
    }
    if (!item) {
        goto end;
    }

    
    item_local_nonprim = item_summary_parseFromJSON(item); //nonprimitive

    // pokemon_held_item_summary->version_details
    cJSON *version_details = cJSON_GetObjectItemCaseSensitive(pokemon_held_item_summaryJSON, "version_details");
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



    pokemon_held_item_summary_local_var = pokemon_held_item_summary_create_internal (
        item_local_nonprim,
        version_detailsList
        );

    if (!pokemon_held_item_summary_local_var) {
        goto end;
    }

    return pokemon_held_item_summary_local_var;
end:
    if (item_local_nonprim) {
        item_summary_free(item_local_nonprim);
        item_local_nonprim = NULL;
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
