#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "location_area_encounter_version_detail.h"



static location_area_encounter_version_detail_t *location_area_encounter_version_detail_create_internal(
    int *rate,
    version_summary_t *version
    ) {
    location_area_encounter_version_detail_t *location_area_encounter_version_detail_local_var = malloc(sizeof(location_area_encounter_version_detail_t));
    if (!location_area_encounter_version_detail_local_var) {
        return NULL;
    }
    memset(location_area_encounter_version_detail_local_var, 0, sizeof(location_area_encounter_version_detail_t));
    location_area_encounter_version_detail_local_var->_library_owned = 1;
    location_area_encounter_version_detail_local_var->rate = rate;
    location_area_encounter_version_detail_local_var->version = version;
    return location_area_encounter_version_detail_local_var;
}

__attribute__((deprecated)) location_area_encounter_version_detail_t *location_area_encounter_version_detail_create(
    int *rate,
    version_summary_t *version
    ) {
    int *rate_copy = NULL;
    if (rate) {
        rate_copy = malloc(sizeof(int));
        if (rate_copy) *rate_copy = *rate;
    }
    location_area_encounter_version_detail_t *result = location_area_encounter_version_detail_create_internal (
        rate_copy,
        version
        );
    if (!result) {
        free(rate_copy);
    }
    return result;
}

void location_area_encounter_version_detail_free(location_area_encounter_version_detail_t *location_area_encounter_version_detail) {
    if(NULL == location_area_encounter_version_detail){
        return ;
    }
    if(location_area_encounter_version_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "location_area_encounter_version_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (location_area_encounter_version_detail->rate) {
        free(location_area_encounter_version_detail->rate);
        location_area_encounter_version_detail->rate = NULL;
    }
    if (location_area_encounter_version_detail->version) {
        version_summary_free(location_area_encounter_version_detail->version);
        location_area_encounter_version_detail->version = NULL;
    }
    free(location_area_encounter_version_detail);
}

cJSON *location_area_encounter_version_detail_convertToJSON(location_area_encounter_version_detail_t *location_area_encounter_version_detail) {
    cJSON *item = cJSON_CreateObject();

    // location_area_encounter_version_detail->rate
    if (!location_area_encounter_version_detail->rate) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "rate", *location_area_encounter_version_detail->rate) == NULL) {
    goto fail; //Numeric
    }


    // location_area_encounter_version_detail->version
    if (!location_area_encounter_version_detail->version) {
        goto fail;
    }
    cJSON *version_local_JSON = version_summary_convertToJSON(location_area_encounter_version_detail->version);
    if(version_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "version", version_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

location_area_encounter_version_detail_t *location_area_encounter_version_detail_parseFromJSON(cJSON *location_area_encounter_version_detailJSON){

    location_area_encounter_version_detail_t *location_area_encounter_version_detail_local_var = NULL;

    // define the local variable for location_area_encounter_version_detail->rate
    int *rate_local_var = NULL;

    // define the local variable for location_area_encounter_version_detail->version
    version_summary_t *version_local_nonprim = NULL;

    // location_area_encounter_version_detail->rate
    cJSON *rate = cJSON_GetObjectItemCaseSensitive(location_area_encounter_version_detailJSON, "rate");
    if (cJSON_IsNull(rate)) {
        rate = NULL;
    }
    if (!rate) {
        goto end;
    }

    
    if(!cJSON_IsNumber(rate))
    {
    goto end; //Numeric
    }
    rate_local_var = malloc(sizeof(int));
    if(!rate_local_var)
    {
        goto end;
    }
    *rate_local_var = rate->valuedouble;

    // location_area_encounter_version_detail->version
    cJSON *version = cJSON_GetObjectItemCaseSensitive(location_area_encounter_version_detailJSON, "version");
    if (cJSON_IsNull(version)) {
        version = NULL;
    }
    if (!version) {
        goto end;
    }

    
    version_local_nonprim = version_summary_parseFromJSON(version); //nonprimitive



    location_area_encounter_version_detail_local_var = location_area_encounter_version_detail_create_internal (
        rate_local_var,
        version_local_nonprim
        );

    if (!location_area_encounter_version_detail_local_var) {
        goto end;
    }

    return location_area_encounter_version_detail_local_var;
end:
    if (rate_local_var) {
        free(rate_local_var);
        rate_local_var = NULL;
    }
    if (version_local_nonprim) {
        version_summary_free(version_local_nonprim);
        version_local_nonprim = NULL;
    }
    return NULL;

}
