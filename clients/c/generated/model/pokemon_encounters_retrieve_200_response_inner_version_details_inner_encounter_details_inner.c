#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner.h"



static pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_create_internal(
    double chance,
    list_t *condition_values,
    double max_level,
    pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_t *method,
    double min_level
    ) {
    pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_local_var = malloc(sizeof(pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_t));
    if (!pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_local_var) {
        return NULL;
    }
    pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_local_var->chance = chance;
    pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_local_var->condition_values = condition_values;
    pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_local_var->max_level = max_level;
    pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_local_var->method = method;
    pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_local_var->min_level = min_level;

    pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_local_var->_library_owned = 1;
    return pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_local_var;
}

__attribute__((deprecated)) pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_create(
    double chance,
    list_t *condition_values,
    double max_level,
    pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_t *method,
    double min_level
    ) {
    return pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_create_internal (
        chance,
        condition_values,
        max_level,
        method,
        min_level
        );
}

void pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_free(pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner) {
    if(NULL == pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner){
        return ;
    }
    if(pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->condition_values) {
        list_ForEach(listEntry, pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->condition_values) {
            pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner_free(listEntry->data);
        }
        list_freeList(pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->condition_values);
        pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->condition_values = NULL;
    }
    if (pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->method) {
        pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_free(pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->method);
        pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->method = NULL;
    }
    free(pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner);
}

cJSON *pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_convertToJSON(pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->chance
    if (!pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->chance) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "chance", pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->chance) == NULL) {
    goto fail; //Numeric
    }


    // pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->condition_values
    if (!pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->condition_values) {
        goto fail;
    }
    cJSON *condition_values = cJSON_AddArrayToObject(item, "condition_values");
    if(condition_values == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *condition_valuesListEntry;
    if (pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->condition_values) {
    list_ForEach(condition_valuesListEntry, pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->condition_values) {
    cJSON *itemLocal = pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner_convertToJSON(condition_valuesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(condition_values, itemLocal);
    }
    }


    // pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->max_level
    if (!pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->max_level) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "max_level", pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->max_level) == NULL) {
    goto fail; //Numeric
    }


    // pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->method
    if (!pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->method) {
        goto fail;
    }
    cJSON *method_local_JSON = pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_convertToJSON(pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->method);
    if(method_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "method", method_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->min_level
    if (!pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->min_level) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "min_level", pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->min_level) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_parseFromJSON(cJSON *pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_innerJSON){

    pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_t *pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_local_var = NULL;

    // define the local list for pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->condition_values
    list_t *condition_valuesList = NULL;

    // define the local variable for pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->method
    pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_t *method_local_nonprim = NULL;

    // pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->chance
    cJSON *chance = cJSON_GetObjectItemCaseSensitive(pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_innerJSON, "chance");
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

    // pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->condition_values
    cJSON *condition_values = cJSON_GetObjectItemCaseSensitive(pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_innerJSON, "condition_values");
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
        pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner_t *condition_valuesItem = pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner_parseFromJSON(condition_values_local_nonprimitive);

        list_addElement(condition_valuesList, condition_valuesItem);
    }

    // pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->max_level
    cJSON *max_level = cJSON_GetObjectItemCaseSensitive(pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_innerJSON, "max_level");
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

    // pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->method
    cJSON *method = cJSON_GetObjectItemCaseSensitive(pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_innerJSON, "method");
    if (cJSON_IsNull(method)) {
        method = NULL;
    }
    if (!method) {
        goto end;
    }

    
    method_local_nonprim = pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_parseFromJSON(method); //nonprimitive

    // pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner->min_level
    cJSON *min_level = cJSON_GetObjectItemCaseSensitive(pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_innerJSON, "min_level");
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


    pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_local_var = pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_create_internal (
        chance->valuedouble,
        condition_valuesList,
        max_level->valuedouble,
        method_local_nonprim,
        min_level->valuedouble
        );

    return pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_local_var;
end:
    if (condition_valuesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, condition_valuesList) {
            pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(condition_valuesList);
        condition_valuesList = NULL;
    }
    if (method_local_nonprim) {
        pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method_free(method_local_nonprim);
        method_local_nonprim = NULL;
    }
    return NULL;

}
