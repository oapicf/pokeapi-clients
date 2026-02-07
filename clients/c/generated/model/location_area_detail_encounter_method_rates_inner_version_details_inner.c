#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "location_area_detail_encounter_method_rates_inner_version_details_inner.h"



static location_area_detail_encounter_method_rates_inner_version_details_inner_t *location_area_detail_encounter_method_rates_inner_version_details_inner_create_internal(
    int rate,
    ability_detail_pokemon_inner_pokemon_t *version
    ) {
    location_area_detail_encounter_method_rates_inner_version_details_inner_t *location_area_detail_encounter_method_rates_inner_version_details_inner_local_var = malloc(sizeof(location_area_detail_encounter_method_rates_inner_version_details_inner_t));
    if (!location_area_detail_encounter_method_rates_inner_version_details_inner_local_var) {
        return NULL;
    }
    location_area_detail_encounter_method_rates_inner_version_details_inner_local_var->rate = rate;
    location_area_detail_encounter_method_rates_inner_version_details_inner_local_var->version = version;

    location_area_detail_encounter_method_rates_inner_version_details_inner_local_var->_library_owned = 1;
    return location_area_detail_encounter_method_rates_inner_version_details_inner_local_var;
}

__attribute__((deprecated)) location_area_detail_encounter_method_rates_inner_version_details_inner_t *location_area_detail_encounter_method_rates_inner_version_details_inner_create(
    int rate,
    ability_detail_pokemon_inner_pokemon_t *version
    ) {
    return location_area_detail_encounter_method_rates_inner_version_details_inner_create_internal (
        rate,
        version
        );
}

void location_area_detail_encounter_method_rates_inner_version_details_inner_free(location_area_detail_encounter_method_rates_inner_version_details_inner_t *location_area_detail_encounter_method_rates_inner_version_details_inner) {
    if(NULL == location_area_detail_encounter_method_rates_inner_version_details_inner){
        return ;
    }
    if(location_area_detail_encounter_method_rates_inner_version_details_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "location_area_detail_encounter_method_rates_inner_version_details_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (location_area_detail_encounter_method_rates_inner_version_details_inner->version) {
        ability_detail_pokemon_inner_pokemon_free(location_area_detail_encounter_method_rates_inner_version_details_inner->version);
        location_area_detail_encounter_method_rates_inner_version_details_inner->version = NULL;
    }
    free(location_area_detail_encounter_method_rates_inner_version_details_inner);
}

cJSON *location_area_detail_encounter_method_rates_inner_version_details_inner_convertToJSON(location_area_detail_encounter_method_rates_inner_version_details_inner_t *location_area_detail_encounter_method_rates_inner_version_details_inner) {
    cJSON *item = cJSON_CreateObject();

    // location_area_detail_encounter_method_rates_inner_version_details_inner->rate
    if (!location_area_detail_encounter_method_rates_inner_version_details_inner->rate) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "rate", location_area_detail_encounter_method_rates_inner_version_details_inner->rate) == NULL) {
    goto fail; //Numeric
    }


    // location_area_detail_encounter_method_rates_inner_version_details_inner->version
    if (!location_area_detail_encounter_method_rates_inner_version_details_inner->version) {
        goto fail;
    }
    cJSON *version_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(location_area_detail_encounter_method_rates_inner_version_details_inner->version);
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

location_area_detail_encounter_method_rates_inner_version_details_inner_t *location_area_detail_encounter_method_rates_inner_version_details_inner_parseFromJSON(cJSON *location_area_detail_encounter_method_rates_inner_version_details_innerJSON){

    location_area_detail_encounter_method_rates_inner_version_details_inner_t *location_area_detail_encounter_method_rates_inner_version_details_inner_local_var = NULL;

    // define the local variable for location_area_detail_encounter_method_rates_inner_version_details_inner->version
    ability_detail_pokemon_inner_pokemon_t *version_local_nonprim = NULL;

    // location_area_detail_encounter_method_rates_inner_version_details_inner->rate
    cJSON *rate = cJSON_GetObjectItemCaseSensitive(location_area_detail_encounter_method_rates_inner_version_details_innerJSON, "rate");
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

    // location_area_detail_encounter_method_rates_inner_version_details_inner->version
    cJSON *version = cJSON_GetObjectItemCaseSensitive(location_area_detail_encounter_method_rates_inner_version_details_innerJSON, "version");
    if (cJSON_IsNull(version)) {
        version = NULL;
    }
    if (!version) {
        goto end;
    }

    
    version_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(version); //nonprimitive


    location_area_detail_encounter_method_rates_inner_version_details_inner_local_var = location_area_detail_encounter_method_rates_inner_version_details_inner_create_internal (
        rate->valuedouble,
        version_local_nonprim
        );

    return location_area_detail_encounter_method_rates_inner_version_details_inner_local_var;
end:
    if (version_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(version_local_nonprim);
        version_local_nonprim = NULL;
    }
    return NULL;

}
