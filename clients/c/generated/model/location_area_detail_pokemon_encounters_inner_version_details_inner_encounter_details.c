#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details.h"



static location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_t *location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_create_internal(
    int min_level,
    int max_level,
    ability_detail_pokemon_inner_pokemon_t *condition_values,
    int chance,
    ability_detail_pokemon_inner_pokemon_t *method
    ) {
    location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_t *location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_local_var = malloc(sizeof(location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_t));
    if (!location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_local_var) {
        return NULL;
    }
    location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_local_var->min_level = min_level;
    location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_local_var->max_level = max_level;
    location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_local_var->condition_values = condition_values;
    location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_local_var->chance = chance;
    location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_local_var->method = method;

    location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_local_var->_library_owned = 1;
    return location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_local_var;
}

__attribute__((deprecated)) location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_t *location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_create(
    int min_level,
    int max_level,
    ability_detail_pokemon_inner_pokemon_t *condition_values,
    int chance,
    ability_detail_pokemon_inner_pokemon_t *method
    ) {
    return location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_create_internal (
        min_level,
        max_level,
        condition_values,
        chance,
        method
        );
}

void location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_free(location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_t *location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details) {
    if(NULL == location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details){
        return ;
    }
    if(location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_free");
        return ;
    }
    listEntry_t *listEntry;
    if (location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details->condition_values) {
        ability_detail_pokemon_inner_pokemon_free(location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details->condition_values);
        location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details->condition_values = NULL;
    }
    if (location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details->method) {
        ability_detail_pokemon_inner_pokemon_free(location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details->method);
        location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details->method = NULL;
    }
    free(location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details);
}

cJSON *location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_convertToJSON(location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_t *location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details) {
    cJSON *item = cJSON_CreateObject();

    // location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details->min_level
    if (!location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details->min_level) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "min_level", location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details->min_level) == NULL) {
    goto fail; //Numeric
    }


    // location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details->max_level
    if (!location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details->max_level) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "max_level", location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details->max_level) == NULL) {
    goto fail; //Numeric
    }


    // location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details->condition_values
    if(location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details->condition_values) {
    cJSON *condition_values_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details->condition_values);
    if(condition_values_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "condition_values", condition_values_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details->chance
    if (!location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details->chance) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "chance", location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details->chance) == NULL) {
    goto fail; //Numeric
    }


    // location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details->method
    if (!location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details->method) {
        goto fail;
    }
    cJSON *method_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details->method);
    if(method_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "method", method_local_JSON);
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

location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_t *location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_parseFromJSON(cJSON *location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_detailsJSON){

    location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_t *location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_local_var = NULL;

    // define the local variable for location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details->condition_values
    ability_detail_pokemon_inner_pokemon_t *condition_values_local_nonprim = NULL;

    // define the local variable for location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details->method
    ability_detail_pokemon_inner_pokemon_t *method_local_nonprim = NULL;

    // location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details->min_level
    cJSON *min_level = cJSON_GetObjectItemCaseSensitive(location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_detailsJSON, "min_level");
    if (cJSON_IsNull(min_level)) {
        min_level = NULL;
    }
    if (!min_level) {
        goto end;
    }

    
    if(!cJSON_IsNumber(min_level))
    {
    goto end; //Numeric
    }

    // location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details->max_level
    cJSON *max_level = cJSON_GetObjectItemCaseSensitive(location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_detailsJSON, "max_level");
    if (cJSON_IsNull(max_level)) {
        max_level = NULL;
    }
    if (!max_level) {
        goto end;
    }

    
    if(!cJSON_IsNumber(max_level))
    {
    goto end; //Numeric
    }

    // location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details->condition_values
    cJSON *condition_values = cJSON_GetObjectItemCaseSensitive(location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_detailsJSON, "condition_values");
    if (cJSON_IsNull(condition_values)) {
        condition_values = NULL;
    }
    if (condition_values) { 
    condition_values_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(condition_values); //nonprimitive
    }

    // location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details->chance
    cJSON *chance = cJSON_GetObjectItemCaseSensitive(location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_detailsJSON, "chance");
    if (cJSON_IsNull(chance)) {
        chance = NULL;
    }
    if (!chance) {
        goto end;
    }

    
    if(!cJSON_IsNumber(chance))
    {
    goto end; //Numeric
    }

    // location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details->method
    cJSON *method = cJSON_GetObjectItemCaseSensitive(location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_detailsJSON, "method");
    if (cJSON_IsNull(method)) {
        method = NULL;
    }
    if (!method) {
        goto end;
    }

    
    method_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(method); //nonprimitive


    location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_local_var = location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_create_internal (
        min_level->valuedouble,
        max_level->valuedouble,
        condition_values ? condition_values_local_nonprim : NULL,
        chance->valuedouble,
        method_local_nonprim
        );

    return location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details_local_var;
end:
    if (condition_values_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(condition_values_local_nonprim);
        condition_values_local_nonprim = NULL;
    }
    if (method_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(method_local_nonprim);
        method_local_nonprim = NULL;
    }
    return NULL;

}
