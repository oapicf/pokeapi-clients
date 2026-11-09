#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_encounter_version_detail_response.h"



static pokemon_encounter_version_detail_response_t *pokemon_encounter_version_detail_response_create_internal(
    version_summary_t *version,
    int *max_chance,
    list_t *encounter_details
    ) {
    pokemon_encounter_version_detail_response_t *pokemon_encounter_version_detail_response_local_var = malloc(sizeof(pokemon_encounter_version_detail_response_t));
    if (!pokemon_encounter_version_detail_response_local_var) {
        return NULL;
    }
    memset(pokemon_encounter_version_detail_response_local_var, 0, sizeof(pokemon_encounter_version_detail_response_t));
    pokemon_encounter_version_detail_response_local_var->_library_owned = 1;
    pokemon_encounter_version_detail_response_local_var->version = version;
    pokemon_encounter_version_detail_response_local_var->max_chance = max_chance;
    pokemon_encounter_version_detail_response_local_var->encounter_details = encounter_details;
    return pokemon_encounter_version_detail_response_local_var;
}

__attribute__((deprecated)) pokemon_encounter_version_detail_response_t *pokemon_encounter_version_detail_response_create(
    version_summary_t *version,
    int *max_chance,
    list_t *encounter_details
    ) {
    int *max_chance_copy = NULL;
    if (max_chance) {
        max_chance_copy = malloc(sizeof(int));
        if (max_chance_copy) *max_chance_copy = *max_chance;
    }
    pokemon_encounter_version_detail_response_t *result = pokemon_encounter_version_detail_response_create_internal (
        version,
        max_chance_copy,
        encounter_details
        );
    if (!result) {
        free(max_chance_copy);
    }
    return result;
}

void pokemon_encounter_version_detail_response_free(pokemon_encounter_version_detail_response_t *pokemon_encounter_version_detail_response) {
    if(NULL == pokemon_encounter_version_detail_response){
        return ;
    }
    if(pokemon_encounter_version_detail_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_encounter_version_detail_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_encounter_version_detail_response->version) {
        version_summary_free(pokemon_encounter_version_detail_response->version);
        pokemon_encounter_version_detail_response->version = NULL;
    }
    if (pokemon_encounter_version_detail_response->max_chance) {
        free(pokemon_encounter_version_detail_response->max_chance);
        pokemon_encounter_version_detail_response->max_chance = NULL;
    }
    if (pokemon_encounter_version_detail_response->encounter_details) {
        list_ForEach(listEntry, pokemon_encounter_version_detail_response->encounter_details) {
            pokemon_encounter_detail_response_free(listEntry->data);
        }
        list_freeList(pokemon_encounter_version_detail_response->encounter_details);
        pokemon_encounter_version_detail_response->encounter_details = NULL;
    }
    free(pokemon_encounter_version_detail_response);
}

cJSON *pokemon_encounter_version_detail_response_convertToJSON(pokemon_encounter_version_detail_response_t *pokemon_encounter_version_detail_response) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_encounter_version_detail_response->version
    if (!pokemon_encounter_version_detail_response->version) {
        goto fail;
    }
    cJSON *version_local_JSON = version_summary_convertToJSON(pokemon_encounter_version_detail_response->version);
    if(version_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "version", version_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_encounter_version_detail_response->max_chance
    if (!pokemon_encounter_version_detail_response->max_chance) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "max_chance", *pokemon_encounter_version_detail_response->max_chance) == NULL) {
    goto fail; //Numeric
    }


    // pokemon_encounter_version_detail_response->encounter_details
    if (!pokemon_encounter_version_detail_response->encounter_details) {
        goto fail;
    }
    cJSON *encounter_details = cJSON_AddArrayToObject(item, "encounter_details");
    if(encounter_details == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *encounter_detailsListEntry;
    if (pokemon_encounter_version_detail_response->encounter_details) {
    list_ForEach(encounter_detailsListEntry, pokemon_encounter_version_detail_response->encounter_details) {
    cJSON *itemLocal = pokemon_encounter_detail_response_convertToJSON(encounter_detailsListEntry->data);
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

pokemon_encounter_version_detail_response_t *pokemon_encounter_version_detail_response_parseFromJSON(cJSON *pokemon_encounter_version_detail_responseJSON){

    pokemon_encounter_version_detail_response_t *pokemon_encounter_version_detail_response_local_var = NULL;

    // define the local variable for pokemon_encounter_version_detail_response->version
    version_summary_t *version_local_nonprim = NULL;

    // define the local variable for pokemon_encounter_version_detail_response->max_chance
    int *max_chance_local_var = NULL;

    // define the local list for pokemon_encounter_version_detail_response->encounter_details
    list_t *encounter_detailsList = NULL;

    // pokemon_encounter_version_detail_response->version
    cJSON *version = cJSON_GetObjectItemCaseSensitive(pokemon_encounter_version_detail_responseJSON, "version");
    if (cJSON_IsNull(version)) {
        version = NULL;
    }
    if (!version) {
        goto end;
    }

    
    version_local_nonprim = version_summary_parseFromJSON(version); //nonprimitive

    // pokemon_encounter_version_detail_response->max_chance
    cJSON *max_chance = cJSON_GetObjectItemCaseSensitive(pokemon_encounter_version_detail_responseJSON, "max_chance");
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

    // pokemon_encounter_version_detail_response->encounter_details
    cJSON *encounter_details = cJSON_GetObjectItemCaseSensitive(pokemon_encounter_version_detail_responseJSON, "encounter_details");
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
        pokemon_encounter_detail_response_t *encounter_detailsItem = pokemon_encounter_detail_response_parseFromJSON(encounter_details_local_nonprimitive);

        list_addElement(encounter_detailsList, encounter_detailsItem);
    }



    pokemon_encounter_version_detail_response_local_var = pokemon_encounter_version_detail_response_create_internal (
        version_local_nonprim,
        max_chance_local_var,
        encounter_detailsList
        );

    if (!pokemon_encounter_version_detail_response_local_var) {
        goto end;
    }

    return pokemon_encounter_version_detail_response_local_var;
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
            pokemon_encounter_detail_response_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(encounter_detailsList);
        encounter_detailsList = NULL;
    }
    return NULL;

}
