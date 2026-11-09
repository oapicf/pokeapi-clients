#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "location_area_encounter_detail.h"



static location_area_encounter_detail_t *location_area_encounter_detail_create_internal(
    int *min_level,
    int *max_level,
    int *chance,
    encounter_method_summary_t *method,
    list_t *condition_values,
    encounter_pokemon_detail_t *pokemon_details
    ) {
    location_area_encounter_detail_t *location_area_encounter_detail_local_var = malloc(sizeof(location_area_encounter_detail_t));
    if (!location_area_encounter_detail_local_var) {
        return NULL;
    }
    memset(location_area_encounter_detail_local_var, 0, sizeof(location_area_encounter_detail_t));
    location_area_encounter_detail_local_var->_library_owned = 1;
    location_area_encounter_detail_local_var->min_level = min_level;
    location_area_encounter_detail_local_var->max_level = max_level;
    location_area_encounter_detail_local_var->chance = chance;
    location_area_encounter_detail_local_var->method = method;
    location_area_encounter_detail_local_var->condition_values = condition_values;
    location_area_encounter_detail_local_var->pokemon_details = pokemon_details;
    return location_area_encounter_detail_local_var;
}

__attribute__((deprecated)) location_area_encounter_detail_t *location_area_encounter_detail_create(
    int *min_level,
    int *max_level,
    int *chance,
    encounter_method_summary_t *method,
    list_t *condition_values,
    encounter_pokemon_detail_t *pokemon_details
    ) {
    int *min_level_copy = NULL;
    if (min_level) {
        min_level_copy = malloc(sizeof(int));
        if (min_level_copy) *min_level_copy = *min_level;
    }
    int *max_level_copy = NULL;
    if (max_level) {
        max_level_copy = malloc(sizeof(int));
        if (max_level_copy) *max_level_copy = *max_level;
    }
    int *chance_copy = NULL;
    if (chance) {
        chance_copy = malloc(sizeof(int));
        if (chance_copy) *chance_copy = *chance;
    }
    location_area_encounter_detail_t *result = location_area_encounter_detail_create_internal (
        min_level_copy,
        max_level_copy,
        chance_copy,
        method,
        condition_values,
        pokemon_details
        );
    if (!result) {
        free(min_level_copy);
        free(max_level_copy);
        free(chance_copy);
    }
    return result;
}

void location_area_encounter_detail_free(location_area_encounter_detail_t *location_area_encounter_detail) {
    if(NULL == location_area_encounter_detail){
        return ;
    }
    if(location_area_encounter_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "location_area_encounter_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (location_area_encounter_detail->min_level) {
        free(location_area_encounter_detail->min_level);
        location_area_encounter_detail->min_level = NULL;
    }
    if (location_area_encounter_detail->max_level) {
        free(location_area_encounter_detail->max_level);
        location_area_encounter_detail->max_level = NULL;
    }
    if (location_area_encounter_detail->chance) {
        free(location_area_encounter_detail->chance);
        location_area_encounter_detail->chance = NULL;
    }
    if (location_area_encounter_detail->method) {
        encounter_method_summary_free(location_area_encounter_detail->method);
        location_area_encounter_detail->method = NULL;
    }
    if (location_area_encounter_detail->condition_values) {
        list_ForEach(listEntry, location_area_encounter_detail->condition_values) {
            encounter_condition_value_summary_free(listEntry->data);
        }
        list_freeList(location_area_encounter_detail->condition_values);
        location_area_encounter_detail->condition_values = NULL;
    }
    if (location_area_encounter_detail->pokemon_details) {
        encounter_pokemon_detail_free(location_area_encounter_detail->pokemon_details);
        location_area_encounter_detail->pokemon_details = NULL;
    }
    free(location_area_encounter_detail);
}

cJSON *location_area_encounter_detail_convertToJSON(location_area_encounter_detail_t *location_area_encounter_detail) {
    cJSON *item = cJSON_CreateObject();

    // location_area_encounter_detail->min_level
    if (!location_area_encounter_detail->min_level) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "min_level", *location_area_encounter_detail->min_level) == NULL) {
    goto fail; //Numeric
    }


    // location_area_encounter_detail->max_level
    if (!location_area_encounter_detail->max_level) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "max_level", *location_area_encounter_detail->max_level) == NULL) {
    goto fail; //Numeric
    }


    // location_area_encounter_detail->chance
    if(location_area_encounter_detail->chance) {
    if(cJSON_AddNumberToObject(item, "chance", *location_area_encounter_detail->chance) == NULL) {
    goto fail; //Numeric
    }
    }


    // location_area_encounter_detail->method
    if(location_area_encounter_detail->method) {
    cJSON *method_local_JSON = encounter_method_summary_convertToJSON(location_area_encounter_detail->method);
    if(method_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "method", method_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // location_area_encounter_detail->condition_values
    if (!location_area_encounter_detail->condition_values) {
        goto fail;
    }
    cJSON *condition_values = cJSON_AddArrayToObject(item, "condition_values");
    if(condition_values == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *condition_valuesListEntry;
    if (location_area_encounter_detail->condition_values) {
    list_ForEach(condition_valuesListEntry, location_area_encounter_detail->condition_values) {
    cJSON *itemLocal = encounter_condition_value_summary_convertToJSON(condition_valuesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(condition_values, itemLocal);
    }
    }


    // location_area_encounter_detail->pokemon_details
    if (!location_area_encounter_detail->pokemon_details) {
        goto fail;
    }
    cJSON *pokemon_details_local_JSON = encounter_pokemon_detail_convertToJSON(location_area_encounter_detail->pokemon_details);
    if(pokemon_details_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pokemon_details", pokemon_details_local_JSON);
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

location_area_encounter_detail_t *location_area_encounter_detail_parseFromJSON(cJSON *location_area_encounter_detailJSON){

    location_area_encounter_detail_t *location_area_encounter_detail_local_var = NULL;

    // define the local variable for location_area_encounter_detail->min_level
    int *min_level_local_var = NULL;

    // define the local variable for location_area_encounter_detail->max_level
    int *max_level_local_var = NULL;

    // define the local variable for location_area_encounter_detail->chance
    int *chance_local_var = NULL;

    // define the local variable for location_area_encounter_detail->method
    encounter_method_summary_t *method_local_nonprim = NULL;

    // define the local list for location_area_encounter_detail->condition_values
    list_t *condition_valuesList = NULL;

    // define the local variable for location_area_encounter_detail->pokemon_details
    encounter_pokemon_detail_t *pokemon_details_local_nonprim = NULL;

    // location_area_encounter_detail->min_level
    cJSON *min_level = cJSON_GetObjectItemCaseSensitive(location_area_encounter_detailJSON, "min_level");
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
    min_level_local_var = malloc(sizeof(int));
    if(!min_level_local_var)
    {
        goto end;
    }
    *min_level_local_var = min_level->valuedouble;

    // location_area_encounter_detail->max_level
    cJSON *max_level = cJSON_GetObjectItemCaseSensitive(location_area_encounter_detailJSON, "max_level");
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
    max_level_local_var = malloc(sizeof(int));
    if(!max_level_local_var)
    {
        goto end;
    }
    *max_level_local_var = max_level->valuedouble;

    // location_area_encounter_detail->chance
    cJSON *chance = cJSON_GetObjectItemCaseSensitive(location_area_encounter_detailJSON, "chance");
    if (cJSON_IsNull(chance)) {
        chance = NULL;
    }
    if (chance) { 
    if(!cJSON_IsNumber(chance))
    {
    goto end; //Numeric
    }
    chance_local_var = malloc(sizeof(int));
    if(!chance_local_var)
    {
        goto end;
    }
    *chance_local_var = chance->valuedouble;
    }

    // location_area_encounter_detail->method
    cJSON *method = cJSON_GetObjectItemCaseSensitive(location_area_encounter_detailJSON, "method");
    if (cJSON_IsNull(method)) {
        method = NULL;
    }
    if (method) { 
    method_local_nonprim = encounter_method_summary_parseFromJSON(method); //nonprimitive
    }

    // location_area_encounter_detail->condition_values
    cJSON *condition_values = cJSON_GetObjectItemCaseSensitive(location_area_encounter_detailJSON, "condition_values");
    if (cJSON_IsNull(condition_values)) {
        condition_values = NULL;
    }
    if (!condition_values) {
        goto end;
    }

    
    cJSON *condition_values_local_nonprimitive = NULL;
    if(!cJSON_IsArray(condition_values)){
        goto end; //nonprimitive container
    }

    condition_valuesList = list_createList();

    cJSON_ArrayForEach(condition_values_local_nonprimitive,condition_values )
    {
        if(!cJSON_IsObject(condition_values_local_nonprimitive)){
            goto end;
        }
        encounter_condition_value_summary_t *condition_valuesItem = encounter_condition_value_summary_parseFromJSON(condition_values_local_nonprimitive);

        list_addElement(condition_valuesList, condition_valuesItem);
    }

    // location_area_encounter_detail->pokemon_details
    cJSON *pokemon_details = cJSON_GetObjectItemCaseSensitive(location_area_encounter_detailJSON, "pokemon_details");
    if (cJSON_IsNull(pokemon_details)) {
        pokemon_details = NULL;
    }
    if (!pokemon_details) {
        goto end;
    }

    
    pokemon_details_local_nonprim = encounter_pokemon_detail_parseFromJSON(pokemon_details); //nonprimitive



    location_area_encounter_detail_local_var = location_area_encounter_detail_create_internal (
        min_level_local_var,
        max_level_local_var,
        chance_local_var,
        method ? method_local_nonprim : NULL,
        condition_valuesList,
        pokemon_details_local_nonprim
        );

    if (!location_area_encounter_detail_local_var) {
        goto end;
    }

    return location_area_encounter_detail_local_var;
end:
    if (min_level_local_var) {
        free(min_level_local_var);
        min_level_local_var = NULL;
    }
    if (max_level_local_var) {
        free(max_level_local_var);
        max_level_local_var = NULL;
    }
    if (chance_local_var) {
        free(chance_local_var);
        chance_local_var = NULL;
    }
    if (method_local_nonprim) {
        encounter_method_summary_free(method_local_nonprim);
        method_local_nonprim = NULL;
    }
    if (condition_valuesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, condition_valuesList) {
            encounter_condition_value_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(condition_valuesList);
        condition_valuesList = NULL;
    }
    if (pokemon_details_local_nonprim) {
        encounter_pokemon_detail_free(pokemon_details_local_nonprim);
        pokemon_details_local_nonprim = NULL;
    }
    return NULL;

}
