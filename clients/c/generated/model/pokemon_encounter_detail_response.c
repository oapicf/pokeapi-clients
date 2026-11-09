#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_encounter_detail_response.h"



static pokemon_encounter_detail_response_t *pokemon_encounter_detail_response_create_internal(
    int *chance,
    list_t *condition_values,
    int *max_level,
    encounter_method_summary_t *method,
    int *min_level
    ) {
    pokemon_encounter_detail_response_t *pokemon_encounter_detail_response_local_var = malloc(sizeof(pokemon_encounter_detail_response_t));
    if (!pokemon_encounter_detail_response_local_var) {
        return NULL;
    }
    memset(pokemon_encounter_detail_response_local_var, 0, sizeof(pokemon_encounter_detail_response_t));
    pokemon_encounter_detail_response_local_var->_library_owned = 1;
    pokemon_encounter_detail_response_local_var->chance = chance;
    pokemon_encounter_detail_response_local_var->condition_values = condition_values;
    pokemon_encounter_detail_response_local_var->max_level = max_level;
    pokemon_encounter_detail_response_local_var->method = method;
    pokemon_encounter_detail_response_local_var->min_level = min_level;
    return pokemon_encounter_detail_response_local_var;
}

__attribute__((deprecated)) pokemon_encounter_detail_response_t *pokemon_encounter_detail_response_create(
    int *chance,
    list_t *condition_values,
    int *max_level,
    encounter_method_summary_t *method,
    int *min_level
    ) {
    int *chance_copy = NULL;
    if (chance) {
        chance_copy = malloc(sizeof(int));
        if (chance_copy) *chance_copy = *chance;
    }
    int *max_level_copy = NULL;
    if (max_level) {
        max_level_copy = malloc(sizeof(int));
        if (max_level_copy) *max_level_copy = *max_level;
    }
    int *min_level_copy = NULL;
    if (min_level) {
        min_level_copy = malloc(sizeof(int));
        if (min_level_copy) *min_level_copy = *min_level;
    }
    pokemon_encounter_detail_response_t *result = pokemon_encounter_detail_response_create_internal (
        chance_copy,
        condition_values,
        max_level_copy,
        method,
        min_level_copy
        );
    if (!result) {
        free(chance_copy);
        free(max_level_copy);
        free(min_level_copy);
    }
    return result;
}

void pokemon_encounter_detail_response_free(pokemon_encounter_detail_response_t *pokemon_encounter_detail_response) {
    if(NULL == pokemon_encounter_detail_response){
        return ;
    }
    if(pokemon_encounter_detail_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_encounter_detail_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_encounter_detail_response->chance) {
        free(pokemon_encounter_detail_response->chance);
        pokemon_encounter_detail_response->chance = NULL;
    }
    if (pokemon_encounter_detail_response->condition_values) {
        list_ForEach(listEntry, pokemon_encounter_detail_response->condition_values) {
            encounter_condition_value_summary_free(listEntry->data);
        }
        list_freeList(pokemon_encounter_detail_response->condition_values);
        pokemon_encounter_detail_response->condition_values = NULL;
    }
    if (pokemon_encounter_detail_response->max_level) {
        free(pokemon_encounter_detail_response->max_level);
        pokemon_encounter_detail_response->max_level = NULL;
    }
    if (pokemon_encounter_detail_response->method) {
        encounter_method_summary_free(pokemon_encounter_detail_response->method);
        pokemon_encounter_detail_response->method = NULL;
    }
    if (pokemon_encounter_detail_response->min_level) {
        free(pokemon_encounter_detail_response->min_level);
        pokemon_encounter_detail_response->min_level = NULL;
    }
    free(pokemon_encounter_detail_response);
}

cJSON *pokemon_encounter_detail_response_convertToJSON(pokemon_encounter_detail_response_t *pokemon_encounter_detail_response) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_encounter_detail_response->chance
    if (!pokemon_encounter_detail_response->chance) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "chance", *pokemon_encounter_detail_response->chance) == NULL) {
    goto fail; //Numeric
    }


    // pokemon_encounter_detail_response->condition_values
    if (!pokemon_encounter_detail_response->condition_values) {
        goto fail;
    }
    cJSON *condition_values = cJSON_AddArrayToObject(item, "condition_values");
    if(condition_values == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *condition_valuesListEntry;
    if (pokemon_encounter_detail_response->condition_values) {
    list_ForEach(condition_valuesListEntry, pokemon_encounter_detail_response->condition_values) {
    cJSON *itemLocal = encounter_condition_value_summary_convertToJSON(condition_valuesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(condition_values, itemLocal);
    }
    }


    // pokemon_encounter_detail_response->max_level
    if (!pokemon_encounter_detail_response->max_level) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "max_level", *pokemon_encounter_detail_response->max_level) == NULL) {
    goto fail; //Numeric
    }


    // pokemon_encounter_detail_response->method
    if (!pokemon_encounter_detail_response->method) {
        goto fail;
    }
    cJSON *method_local_JSON = encounter_method_summary_convertToJSON(pokemon_encounter_detail_response->method);
    if(method_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "method", method_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_encounter_detail_response->min_level
    if (!pokemon_encounter_detail_response->min_level) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "min_level", *pokemon_encounter_detail_response->min_level) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_encounter_detail_response_t *pokemon_encounter_detail_response_parseFromJSON(cJSON *pokemon_encounter_detail_responseJSON){

    pokemon_encounter_detail_response_t *pokemon_encounter_detail_response_local_var = NULL;

    // define the local variable for pokemon_encounter_detail_response->chance
    int *chance_local_var = NULL;

    // define the local list for pokemon_encounter_detail_response->condition_values
    list_t *condition_valuesList = NULL;

    // define the local variable for pokemon_encounter_detail_response->max_level
    int *max_level_local_var = NULL;

    // define the local variable for pokemon_encounter_detail_response->method
    encounter_method_summary_t *method_local_nonprim = NULL;

    // define the local variable for pokemon_encounter_detail_response->min_level
    int *min_level_local_var = NULL;

    // pokemon_encounter_detail_response->chance
    cJSON *chance = cJSON_GetObjectItemCaseSensitive(pokemon_encounter_detail_responseJSON, "chance");
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
    chance_local_var = malloc(sizeof(int));
    if(!chance_local_var)
    {
        goto end;
    }
    *chance_local_var = chance->valuedouble;

    // pokemon_encounter_detail_response->condition_values
    cJSON *condition_values = cJSON_GetObjectItemCaseSensitive(pokemon_encounter_detail_responseJSON, "condition_values");
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

    // pokemon_encounter_detail_response->max_level
    cJSON *max_level = cJSON_GetObjectItemCaseSensitive(pokemon_encounter_detail_responseJSON, "max_level");
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

    // pokemon_encounter_detail_response->method
    cJSON *method = cJSON_GetObjectItemCaseSensitive(pokemon_encounter_detail_responseJSON, "method");
    if (cJSON_IsNull(method)) {
        method = NULL;
    }
    if (!method) {
        goto end;
    }

    
    method_local_nonprim = encounter_method_summary_parseFromJSON(method); //nonprimitive

    // pokemon_encounter_detail_response->min_level
    cJSON *min_level = cJSON_GetObjectItemCaseSensitive(pokemon_encounter_detail_responseJSON, "min_level");
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



    pokemon_encounter_detail_response_local_var = pokemon_encounter_detail_response_create_internal (
        chance_local_var,
        condition_valuesList,
        max_level_local_var,
        method_local_nonprim,
        min_level_local_var
        );

    if (!pokemon_encounter_detail_response_local_var) {
        goto end;
    }

    return pokemon_encounter_detail_response_local_var;
end:
    if (chance_local_var) {
        free(chance_local_var);
        chance_local_var = NULL;
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
    if (max_level_local_var) {
        free(max_level_local_var);
        max_level_local_var = NULL;
    }
    if (method_local_nonprim) {
        encounter_method_summary_free(method_local_nonprim);
        method_local_nonprim = NULL;
    }
    if (min_level_local_var) {
        free(min_level_local_var);
        min_level_local_var = NULL;
    }
    return NULL;

}
