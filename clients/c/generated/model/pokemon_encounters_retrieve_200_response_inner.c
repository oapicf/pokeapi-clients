#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_encounters_retrieve_200_response_inner.h"



static pokemon_encounters_retrieve_200_response_inner_t *pokemon_encounters_retrieve_200_response_inner_create_internal(
    pokemon_encounters_retrieve_200_response_inner_location_area_t *location_area,
    list_t *version_details
    ) {
    pokemon_encounters_retrieve_200_response_inner_t *pokemon_encounters_retrieve_200_response_inner_local_var = malloc(sizeof(pokemon_encounters_retrieve_200_response_inner_t));
    if (!pokemon_encounters_retrieve_200_response_inner_local_var) {
        return NULL;
    }
    pokemon_encounters_retrieve_200_response_inner_local_var->location_area = location_area;
    pokemon_encounters_retrieve_200_response_inner_local_var->version_details = version_details;

    pokemon_encounters_retrieve_200_response_inner_local_var->_library_owned = 1;
    return pokemon_encounters_retrieve_200_response_inner_local_var;
}

__attribute__((deprecated)) pokemon_encounters_retrieve_200_response_inner_t *pokemon_encounters_retrieve_200_response_inner_create(
    pokemon_encounters_retrieve_200_response_inner_location_area_t *location_area,
    list_t *version_details
    ) {
    return pokemon_encounters_retrieve_200_response_inner_create_internal (
        location_area,
        version_details
        );
}

void pokemon_encounters_retrieve_200_response_inner_free(pokemon_encounters_retrieve_200_response_inner_t *pokemon_encounters_retrieve_200_response_inner) {
    if(NULL == pokemon_encounters_retrieve_200_response_inner){
        return ;
    }
    if(pokemon_encounters_retrieve_200_response_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_encounters_retrieve_200_response_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_encounters_retrieve_200_response_inner->location_area) {
        pokemon_encounters_retrieve_200_response_inner_location_area_free(pokemon_encounters_retrieve_200_response_inner->location_area);
        pokemon_encounters_retrieve_200_response_inner->location_area = NULL;
    }
    if (pokemon_encounters_retrieve_200_response_inner->version_details) {
        list_ForEach(listEntry, pokemon_encounters_retrieve_200_response_inner->version_details) {
            pokemon_encounters_retrieve_200_response_inner_version_details_inner_free(listEntry->data);
        }
        list_freeList(pokemon_encounters_retrieve_200_response_inner->version_details);
        pokemon_encounters_retrieve_200_response_inner->version_details = NULL;
    }
    free(pokemon_encounters_retrieve_200_response_inner);
}

cJSON *pokemon_encounters_retrieve_200_response_inner_convertToJSON(pokemon_encounters_retrieve_200_response_inner_t *pokemon_encounters_retrieve_200_response_inner) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_encounters_retrieve_200_response_inner->location_area
    if (!pokemon_encounters_retrieve_200_response_inner->location_area) {
        goto fail;
    }
    cJSON *location_area_local_JSON = pokemon_encounters_retrieve_200_response_inner_location_area_convertToJSON(pokemon_encounters_retrieve_200_response_inner->location_area);
    if(location_area_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "location_area", location_area_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_encounters_retrieve_200_response_inner->version_details
    if (!pokemon_encounters_retrieve_200_response_inner->version_details) {
        goto fail;
    }
    cJSON *version_details = cJSON_AddArrayToObject(item, "version_details");
    if(version_details == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *version_detailsListEntry;
    if (pokemon_encounters_retrieve_200_response_inner->version_details) {
    list_ForEach(version_detailsListEntry, pokemon_encounters_retrieve_200_response_inner->version_details) {
    cJSON *itemLocal = pokemon_encounters_retrieve_200_response_inner_version_details_inner_convertToJSON(version_detailsListEntry->data);
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

pokemon_encounters_retrieve_200_response_inner_t *pokemon_encounters_retrieve_200_response_inner_parseFromJSON(cJSON *pokemon_encounters_retrieve_200_response_innerJSON){

    pokemon_encounters_retrieve_200_response_inner_t *pokemon_encounters_retrieve_200_response_inner_local_var = NULL;

    // define the local variable for pokemon_encounters_retrieve_200_response_inner->location_area
    pokemon_encounters_retrieve_200_response_inner_location_area_t *location_area_local_nonprim = NULL;

    // define the local list for pokemon_encounters_retrieve_200_response_inner->version_details
    list_t *version_detailsList = NULL;

    // pokemon_encounters_retrieve_200_response_inner->location_area
    cJSON *location_area = cJSON_GetObjectItemCaseSensitive(pokemon_encounters_retrieve_200_response_innerJSON, "location_area");
    if (cJSON_IsNull(location_area)) {
        location_area = NULL;
    }
    if (!location_area) {
        goto end;
    }

    
    location_area_local_nonprim = pokemon_encounters_retrieve_200_response_inner_location_area_parseFromJSON(location_area); //nonprimitive

    // pokemon_encounters_retrieve_200_response_inner->version_details
    cJSON *version_details = cJSON_GetObjectItemCaseSensitive(pokemon_encounters_retrieve_200_response_innerJSON, "version_details");
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
        pokemon_encounters_retrieve_200_response_inner_version_details_inner_t *version_detailsItem = pokemon_encounters_retrieve_200_response_inner_version_details_inner_parseFromJSON(version_details_local_nonprimitive);

        list_addElement(version_detailsList, version_detailsItem);
    }


    pokemon_encounters_retrieve_200_response_inner_local_var = pokemon_encounters_retrieve_200_response_inner_create_internal (
        location_area_local_nonprim,
        version_detailsList
        );

    return pokemon_encounters_retrieve_200_response_inner_local_var;
end:
    if (location_area_local_nonprim) {
        pokemon_encounters_retrieve_200_response_inner_location_area_free(location_area_local_nonprim);
        location_area_local_nonprim = NULL;
    }
    if (version_detailsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, version_detailsList) {
            pokemon_encounters_retrieve_200_response_inner_version_details_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(version_detailsList);
        version_detailsList = NULL;
    }
    return NULL;

}
