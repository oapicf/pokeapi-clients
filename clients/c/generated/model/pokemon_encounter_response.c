#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_encounter_response.h"



static pokemon_encounter_response_t *pokemon_encounter_response_create_internal(
    location_area_summary_t *location_area,
    list_t *version_details
    ) {
    pokemon_encounter_response_t *pokemon_encounter_response_local_var = malloc(sizeof(pokemon_encounter_response_t));
    if (!pokemon_encounter_response_local_var) {
        return NULL;
    }
    memset(pokemon_encounter_response_local_var, 0, sizeof(pokemon_encounter_response_t));
    pokemon_encounter_response_local_var->_library_owned = 1;
    pokemon_encounter_response_local_var->location_area = location_area;
    pokemon_encounter_response_local_var->version_details = version_details;
    return pokemon_encounter_response_local_var;
}

__attribute__((deprecated)) pokemon_encounter_response_t *pokemon_encounter_response_create(
    location_area_summary_t *location_area,
    list_t *version_details
    ) {
    pokemon_encounter_response_t *result = pokemon_encounter_response_create_internal (
        location_area,
        version_details
        );
    if (!result) {
    }
    return result;
}

void pokemon_encounter_response_free(pokemon_encounter_response_t *pokemon_encounter_response) {
    if(NULL == pokemon_encounter_response){
        return ;
    }
    if(pokemon_encounter_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_encounter_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_encounter_response->location_area) {
        location_area_summary_free(pokemon_encounter_response->location_area);
        pokemon_encounter_response->location_area = NULL;
    }
    if (pokemon_encounter_response->version_details) {
        list_ForEach(listEntry, pokemon_encounter_response->version_details) {
            pokemon_encounter_version_detail_response_free(listEntry->data);
        }
        list_freeList(pokemon_encounter_response->version_details);
        pokemon_encounter_response->version_details = NULL;
    }
    free(pokemon_encounter_response);
}

cJSON *pokemon_encounter_response_convertToJSON(pokemon_encounter_response_t *pokemon_encounter_response) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_encounter_response->location_area
    if (!pokemon_encounter_response->location_area) {
        goto fail;
    }
    cJSON *location_area_local_JSON = location_area_summary_convertToJSON(pokemon_encounter_response->location_area);
    if(location_area_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "location_area", location_area_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_encounter_response->version_details
    if (!pokemon_encounter_response->version_details) {
        goto fail;
    }
    cJSON *version_details = cJSON_AddArrayToObject(item, "version_details");
    if(version_details == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *version_detailsListEntry;
    if (pokemon_encounter_response->version_details) {
    list_ForEach(version_detailsListEntry, pokemon_encounter_response->version_details) {
    cJSON *itemLocal = pokemon_encounter_version_detail_response_convertToJSON(version_detailsListEntry->data);
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

pokemon_encounter_response_t *pokemon_encounter_response_parseFromJSON(cJSON *pokemon_encounter_responseJSON){

    pokemon_encounter_response_t *pokemon_encounter_response_local_var = NULL;

    // define the local variable for pokemon_encounter_response->location_area
    location_area_summary_t *location_area_local_nonprim = NULL;

    // define the local list for pokemon_encounter_response->version_details
    list_t *version_detailsList = NULL;

    // pokemon_encounter_response->location_area
    cJSON *location_area = cJSON_GetObjectItemCaseSensitive(pokemon_encounter_responseJSON, "location_area");
    if (cJSON_IsNull(location_area)) {
        location_area = NULL;
    }
    if (!location_area) {
        goto end;
    }

    
    location_area_local_nonprim = location_area_summary_parseFromJSON(location_area); //nonprimitive

    // pokemon_encounter_response->version_details
    cJSON *version_details = cJSON_GetObjectItemCaseSensitive(pokemon_encounter_responseJSON, "version_details");
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
        pokemon_encounter_version_detail_response_t *version_detailsItem = pokemon_encounter_version_detail_response_parseFromJSON(version_details_local_nonprimitive);

        list_addElement(version_detailsList, version_detailsItem);
    }



    pokemon_encounter_response_local_var = pokemon_encounter_response_create_internal (
        location_area_local_nonprim,
        version_detailsList
        );

    if (!pokemon_encounter_response_local_var) {
        goto end;
    }

    return pokemon_encounter_response_local_var;
end:
    if (location_area_local_nonprim) {
        location_area_summary_free(location_area_local_nonprim);
        location_area_local_nonprim = NULL;
    }
    if (version_detailsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, version_detailsList) {
            pokemon_encounter_version_detail_response_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(version_detailsList);
        version_detailsList = NULL;
    }
    return NULL;

}
