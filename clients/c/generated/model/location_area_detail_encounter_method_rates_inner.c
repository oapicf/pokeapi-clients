#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "location_area_detail_encounter_method_rates_inner.h"



static location_area_detail_encounter_method_rates_inner_t *location_area_detail_encounter_method_rates_inner_create_internal(
    ability_detail_pokemon_inner_pokemon_t *encounter_method,
    list_t *version_details
    ) {
    location_area_detail_encounter_method_rates_inner_t *location_area_detail_encounter_method_rates_inner_local_var = malloc(sizeof(location_area_detail_encounter_method_rates_inner_t));
    if (!location_area_detail_encounter_method_rates_inner_local_var) {
        return NULL;
    }
    location_area_detail_encounter_method_rates_inner_local_var->encounter_method = encounter_method;
    location_area_detail_encounter_method_rates_inner_local_var->version_details = version_details;

    location_area_detail_encounter_method_rates_inner_local_var->_library_owned = 1;
    return location_area_detail_encounter_method_rates_inner_local_var;
}

__attribute__((deprecated)) location_area_detail_encounter_method_rates_inner_t *location_area_detail_encounter_method_rates_inner_create(
    ability_detail_pokemon_inner_pokemon_t *encounter_method,
    list_t *version_details
    ) {
    return location_area_detail_encounter_method_rates_inner_create_internal (
        encounter_method,
        version_details
        );
}

void location_area_detail_encounter_method_rates_inner_free(location_area_detail_encounter_method_rates_inner_t *location_area_detail_encounter_method_rates_inner) {
    if(NULL == location_area_detail_encounter_method_rates_inner){
        return ;
    }
    if(location_area_detail_encounter_method_rates_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "location_area_detail_encounter_method_rates_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (location_area_detail_encounter_method_rates_inner->encounter_method) {
        ability_detail_pokemon_inner_pokemon_free(location_area_detail_encounter_method_rates_inner->encounter_method);
        location_area_detail_encounter_method_rates_inner->encounter_method = NULL;
    }
    if (location_area_detail_encounter_method_rates_inner->version_details) {
        list_ForEach(listEntry, location_area_detail_encounter_method_rates_inner->version_details) {
            location_area_detail_encounter_method_rates_inner_version_details_inner_free(listEntry->data);
        }
        list_freeList(location_area_detail_encounter_method_rates_inner->version_details);
        location_area_detail_encounter_method_rates_inner->version_details = NULL;
    }
    free(location_area_detail_encounter_method_rates_inner);
}

cJSON *location_area_detail_encounter_method_rates_inner_convertToJSON(location_area_detail_encounter_method_rates_inner_t *location_area_detail_encounter_method_rates_inner) {
    cJSON *item = cJSON_CreateObject();

    // location_area_detail_encounter_method_rates_inner->encounter_method
    if (!location_area_detail_encounter_method_rates_inner->encounter_method) {
        goto fail;
    }
    cJSON *encounter_method_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(location_area_detail_encounter_method_rates_inner->encounter_method);
    if(encounter_method_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "encounter_method", encounter_method_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // location_area_detail_encounter_method_rates_inner->version_details
    if (!location_area_detail_encounter_method_rates_inner->version_details) {
        goto fail;
    }
    cJSON *version_details = cJSON_AddArrayToObject(item, "version_details");
    if(version_details == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *version_detailsListEntry;
    if (location_area_detail_encounter_method_rates_inner->version_details) {
    list_ForEach(version_detailsListEntry, location_area_detail_encounter_method_rates_inner->version_details) {
    cJSON *itemLocal = location_area_detail_encounter_method_rates_inner_version_details_inner_convertToJSON(version_detailsListEntry->data);
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

location_area_detail_encounter_method_rates_inner_t *location_area_detail_encounter_method_rates_inner_parseFromJSON(cJSON *location_area_detail_encounter_method_rates_innerJSON){

    location_area_detail_encounter_method_rates_inner_t *location_area_detail_encounter_method_rates_inner_local_var = NULL;

    // define the local variable for location_area_detail_encounter_method_rates_inner->encounter_method
    ability_detail_pokemon_inner_pokemon_t *encounter_method_local_nonprim = NULL;

    // define the local list for location_area_detail_encounter_method_rates_inner->version_details
    list_t *version_detailsList = NULL;

    // location_area_detail_encounter_method_rates_inner->encounter_method
    cJSON *encounter_method = cJSON_GetObjectItemCaseSensitive(location_area_detail_encounter_method_rates_innerJSON, "encounter_method");
    if (cJSON_IsNull(encounter_method)) {
        encounter_method = NULL;
    }
    if (!encounter_method) {
        goto end;
    }

    
    encounter_method_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(encounter_method); //nonprimitive

    // location_area_detail_encounter_method_rates_inner->version_details
    cJSON *version_details = cJSON_GetObjectItemCaseSensitive(location_area_detail_encounter_method_rates_innerJSON, "version_details");
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
        location_area_detail_encounter_method_rates_inner_version_details_inner_t *version_detailsItem = location_area_detail_encounter_method_rates_inner_version_details_inner_parseFromJSON(version_details_local_nonprimitive);

        list_addElement(version_detailsList, version_detailsItem);
    }


    location_area_detail_encounter_method_rates_inner_local_var = location_area_detail_encounter_method_rates_inner_create_internal (
        encounter_method_local_nonprim,
        version_detailsList
        );

    return location_area_detail_encounter_method_rates_inner_local_var;
end:
    if (encounter_method_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(encounter_method_local_nonprim);
        encounter_method_local_nonprim = NULL;
    }
    if (version_detailsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, version_detailsList) {
            location_area_detail_encounter_method_rates_inner_version_details_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(version_detailsList);
        version_detailsList = NULL;
    }
    return NULL;

}
