#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "location_area_pokemon_encounter_version.h"



static location_area_pokemon_encounter_version_t *location_area_pokemon_encounter_version_create_internal(
    version_summary_t *version,
    int *max_chance,
    list_t *encounter_details
    ) {
    location_area_pokemon_encounter_version_t *location_area_pokemon_encounter_version_local_var = malloc(sizeof(location_area_pokemon_encounter_version_t));
    if (!location_area_pokemon_encounter_version_local_var) {
        return NULL;
    }
    memset(location_area_pokemon_encounter_version_local_var, 0, sizeof(location_area_pokemon_encounter_version_t));
    location_area_pokemon_encounter_version_local_var->_library_owned = 1;
    location_area_pokemon_encounter_version_local_var->version = version;
    location_area_pokemon_encounter_version_local_var->max_chance = max_chance;
    location_area_pokemon_encounter_version_local_var->encounter_details = encounter_details;
    return location_area_pokemon_encounter_version_local_var;
}

__attribute__((deprecated)) location_area_pokemon_encounter_version_t *location_area_pokemon_encounter_version_create(
    version_summary_t *version,
    int *max_chance,
    list_t *encounter_details
    ) {
    int *max_chance_copy = NULL;
    if (max_chance) {
        max_chance_copy = malloc(sizeof(int));
        if (max_chance_copy) *max_chance_copy = *max_chance;
    }
    location_area_pokemon_encounter_version_t *result = location_area_pokemon_encounter_version_create_internal (
        version,
        max_chance_copy,
        encounter_details
        );
    if (!result) {
        free(max_chance_copy);
    }
    return result;
}

void location_area_pokemon_encounter_version_free(location_area_pokemon_encounter_version_t *location_area_pokemon_encounter_version) {
    if(NULL == location_area_pokemon_encounter_version){
        return ;
    }
    if(location_area_pokemon_encounter_version->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "location_area_pokemon_encounter_version_free");
        return ;
    }
    listEntry_t *listEntry;
    if (location_area_pokemon_encounter_version->version) {
        version_summary_free(location_area_pokemon_encounter_version->version);
        location_area_pokemon_encounter_version->version = NULL;
    }
    if (location_area_pokemon_encounter_version->max_chance) {
        free(location_area_pokemon_encounter_version->max_chance);
        location_area_pokemon_encounter_version->max_chance = NULL;
    }
    if (location_area_pokemon_encounter_version->encounter_details) {
        list_ForEach(listEntry, location_area_pokemon_encounter_version->encounter_details) {
            location_area_encounter_detail_free(listEntry->data);
        }
        list_freeList(location_area_pokemon_encounter_version->encounter_details);
        location_area_pokemon_encounter_version->encounter_details = NULL;
    }
    free(location_area_pokemon_encounter_version);
}

cJSON *location_area_pokemon_encounter_version_convertToJSON(location_area_pokemon_encounter_version_t *location_area_pokemon_encounter_version) {
    cJSON *item = cJSON_CreateObject();

    // location_area_pokemon_encounter_version->version
    if (!location_area_pokemon_encounter_version->version) {
        goto fail;
    }
    cJSON *version_local_JSON = version_summary_convertToJSON(location_area_pokemon_encounter_version->version);
    if(version_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "version", version_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // location_area_pokemon_encounter_version->max_chance
    if (!location_area_pokemon_encounter_version->max_chance) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "max_chance", *location_area_pokemon_encounter_version->max_chance) == NULL) {
    goto fail; //Numeric
    }


    // location_area_pokemon_encounter_version->encounter_details
    if (!location_area_pokemon_encounter_version->encounter_details) {
        goto fail;
    }
    cJSON *encounter_details = cJSON_AddArrayToObject(item, "encounter_details");
    if(encounter_details == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *encounter_detailsListEntry;
    if (location_area_pokemon_encounter_version->encounter_details) {
    list_ForEach(encounter_detailsListEntry, location_area_pokemon_encounter_version->encounter_details) {
    cJSON *itemLocal = location_area_encounter_detail_convertToJSON(encounter_detailsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(encounter_details, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

location_area_pokemon_encounter_version_t *location_area_pokemon_encounter_version_parseFromJSON(cJSON *location_area_pokemon_encounter_versionJSON){

    location_area_pokemon_encounter_version_t *location_area_pokemon_encounter_version_local_var = NULL;

    // define the local variable for location_area_pokemon_encounter_version->version
    version_summary_t *version_local_nonprim = NULL;

    // define the local variable for location_area_pokemon_encounter_version->max_chance
    int *max_chance_local_var = NULL;

    // define the local list for location_area_pokemon_encounter_version->encounter_details
    list_t *encounter_detailsList = NULL;

    // location_area_pokemon_encounter_version->version
    cJSON *version = cJSON_GetObjectItemCaseSensitive(location_area_pokemon_encounter_versionJSON, "version");
    if (cJSON_IsNull(version)) {
        version = NULL;
    }
    if (!version) {
        goto end;
    }

    
    version_local_nonprim = version_summary_parseFromJSON(version); //nonprimitive

    // location_area_pokemon_encounter_version->max_chance
    cJSON *max_chance = cJSON_GetObjectItemCaseSensitive(location_area_pokemon_encounter_versionJSON, "max_chance");
    if (cJSON_IsNull(max_chance)) {
        max_chance = NULL;
    }
    if (!max_chance) {
        goto end;
    }

    
    if(!cJSON_IsNumber(max_chance))
    {
    goto end; //Numeric
    }
    max_chance_local_var = malloc(sizeof(int));
    if(!max_chance_local_var)
    {
        goto end;
    }
    *max_chance_local_var = max_chance->valuedouble;

    // location_area_pokemon_encounter_version->encounter_details
    cJSON *encounter_details = cJSON_GetObjectItemCaseSensitive(location_area_pokemon_encounter_versionJSON, "encounter_details");
    if (cJSON_IsNull(encounter_details)) {
        encounter_details = NULL;
    }
    if (!encounter_details) {
        goto end;
    }

    
    cJSON *encounter_details_local_nonprimitive = NULL;
    if(!cJSON_IsArray(encounter_details)){
        goto end; //nonprimitive container
    }

    encounter_detailsList = list_createList();

    cJSON_ArrayForEach(encounter_details_local_nonprimitive,encounter_details )
    {
        if(!cJSON_IsObject(encounter_details_local_nonprimitive)){
            goto end;
        }
        location_area_encounter_detail_t *encounter_detailsItem = location_area_encounter_detail_parseFromJSON(encounter_details_local_nonprimitive);

        list_addElement(encounter_detailsList, encounter_detailsItem);
    }



    location_area_pokemon_encounter_version_local_var = location_area_pokemon_encounter_version_create_internal (
        version_local_nonprim,
        max_chance_local_var,
        encounter_detailsList
        );

    if (!location_area_pokemon_encounter_version_local_var) {
        goto end;
    }

    return location_area_pokemon_encounter_version_local_var;
end:
    if (version_local_nonprim) {
        version_summary_free(version_local_nonprim);
        version_local_nonprim = NULL;
    }
    if (max_chance_local_var) {
        free(max_chance_local_var);
        max_chance_local_var = NULL;
    }
    if (encounter_detailsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, encounter_detailsList) {
            location_area_encounter_detail_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(encounter_detailsList);
        encounter_detailsList = NULL;
    }
    return NULL;

}
