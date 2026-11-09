#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "location_area_encounter_rate.h"



static location_area_encounter_rate_t *location_area_encounter_rate_create_internal(
    encounter_method_summary_t *encounter_method,
    list_t *version_details
    ) {
    location_area_encounter_rate_t *location_area_encounter_rate_local_var = malloc(sizeof(location_area_encounter_rate_t));
    if (!location_area_encounter_rate_local_var) {
        return NULL;
    }
    memset(location_area_encounter_rate_local_var, 0, sizeof(location_area_encounter_rate_t));
    location_area_encounter_rate_local_var->_library_owned = 1;
    location_area_encounter_rate_local_var->encounter_method = encounter_method;
    location_area_encounter_rate_local_var->version_details = version_details;
    return location_area_encounter_rate_local_var;
}

__attribute__((deprecated)) location_area_encounter_rate_t *location_area_encounter_rate_create(
    encounter_method_summary_t *encounter_method,
    list_t *version_details
    ) {
    location_area_encounter_rate_t *result = location_area_encounter_rate_create_internal (
        encounter_method,
        version_details
        );
    if (!result) {
    }
    return result;
}

void location_area_encounter_rate_free(location_area_encounter_rate_t *location_area_encounter_rate) {
    if(NULL == location_area_encounter_rate){
        return ;
    }
    if(location_area_encounter_rate->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "location_area_encounter_rate_free");
        return ;
    }
    listEntry_t *listEntry;
    if (location_area_encounter_rate->encounter_method) {
        encounter_method_summary_free(location_area_encounter_rate->encounter_method);
        location_area_encounter_rate->encounter_method = NULL;
    }
    if (location_area_encounter_rate->version_details) {
        list_ForEach(listEntry, location_area_encounter_rate->version_details) {
            location_area_encounter_version_detail_free(listEntry->data);
        }
        list_freeList(location_area_encounter_rate->version_details);
        location_area_encounter_rate->version_details = NULL;
    }
    free(location_area_encounter_rate);
}

cJSON *location_area_encounter_rate_convertToJSON(location_area_encounter_rate_t *location_area_encounter_rate) {
    cJSON *item = cJSON_CreateObject();

    // location_area_encounter_rate->encounter_method
    if (!location_area_encounter_rate->encounter_method) {
        goto fail;
    }
    cJSON *encounter_method_local_JSON = encounter_method_summary_convertToJSON(location_area_encounter_rate->encounter_method);
    if(encounter_method_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "encounter_method", encounter_method_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // location_area_encounter_rate->version_details
    if (!location_area_encounter_rate->version_details) {
        goto fail;
    }
    cJSON *version_details = cJSON_AddArrayToObject(item, "version_details");
    if(version_details == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *version_detailsListEntry;
    if (location_area_encounter_rate->version_details) {
    list_ForEach(version_detailsListEntry, location_area_encounter_rate->version_details) {
    cJSON *itemLocal = location_area_encounter_version_detail_convertToJSON(version_detailsListEntry->data);
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

location_area_encounter_rate_t *location_area_encounter_rate_parseFromJSON(cJSON *location_area_encounter_rateJSON){

    location_area_encounter_rate_t *location_area_encounter_rate_local_var = NULL;

    // define the local variable for location_area_encounter_rate->encounter_method
    encounter_method_summary_t *encounter_method_local_nonprim = NULL;

    // define the local list for location_area_encounter_rate->version_details
    list_t *version_detailsList = NULL;

    // location_area_encounter_rate->encounter_method
    cJSON *encounter_method = cJSON_GetObjectItemCaseSensitive(location_area_encounter_rateJSON, "encounter_method");
    if (cJSON_IsNull(encounter_method)) {
        encounter_method = NULL;
    }
    if (!encounter_method) {
        goto end;
    }

    
    encounter_method_local_nonprim = encounter_method_summary_parseFromJSON(encounter_method); //nonprimitive

    // location_area_encounter_rate->version_details
    cJSON *version_details = cJSON_GetObjectItemCaseSensitive(location_area_encounter_rateJSON, "version_details");
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
        location_area_encounter_version_detail_t *version_detailsItem = location_area_encounter_version_detail_parseFromJSON(version_details_local_nonprimitive);

        list_addElement(version_detailsList, version_detailsItem);
    }



    location_area_encounter_rate_local_var = location_area_encounter_rate_create_internal (
        encounter_method_local_nonprim,
        version_detailsList
        );

    if (!location_area_encounter_rate_local_var) {
        goto end;
    }

    return location_area_encounter_rate_local_var;
end:
    if (encounter_method_local_nonprim) {
        encounter_method_summary_free(encounter_method_local_nonprim);
        encounter_method_local_nonprim = NULL;
    }
    if (version_detailsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, version_detailsList) {
            location_area_encounter_version_detail_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(version_detailsList);
        version_detailsList = NULL;
    }
    return NULL;

}
