#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "location_area_detail.h"



static location_area_detail_t *location_area_detail_create_internal(
    int id,
    char *name,
    int game_index,
    list_t *encounter_method_rates,
    location_summary_t *location,
    list_t *names,
    list_t *pokemon_encounters
    ) {
    location_area_detail_t *location_area_detail_local_var = malloc(sizeof(location_area_detail_t));
    if (!location_area_detail_local_var) {
        return NULL;
    }
    location_area_detail_local_var->id = id;
    location_area_detail_local_var->name = name;
    location_area_detail_local_var->game_index = game_index;
    location_area_detail_local_var->encounter_method_rates = encounter_method_rates;
    location_area_detail_local_var->location = location;
    location_area_detail_local_var->names = names;
    location_area_detail_local_var->pokemon_encounters = pokemon_encounters;

    location_area_detail_local_var->_library_owned = 1;
    return location_area_detail_local_var;
}

__attribute__((deprecated)) location_area_detail_t *location_area_detail_create(
    int id,
    char *name,
    int game_index,
    list_t *encounter_method_rates,
    location_summary_t *location,
    list_t *names,
    list_t *pokemon_encounters
    ) {
    return location_area_detail_create_internal (
        id,
        name,
        game_index,
        encounter_method_rates,
        location,
        names,
        pokemon_encounters
        );
}

void location_area_detail_free(location_area_detail_t *location_area_detail) {
    if(NULL == location_area_detail){
        return ;
    }
    if(location_area_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "location_area_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (location_area_detail->name) {
        free(location_area_detail->name);
        location_area_detail->name = NULL;
    }
    if (location_area_detail->encounter_method_rates) {
        list_ForEach(listEntry, location_area_detail->encounter_method_rates) {
            location_area_detail_encounter_method_rates_inner_free(listEntry->data);
        }
        list_freeList(location_area_detail->encounter_method_rates);
        location_area_detail->encounter_method_rates = NULL;
    }
    if (location_area_detail->location) {
        location_summary_free(location_area_detail->location);
        location_area_detail->location = NULL;
    }
    if (location_area_detail->names) {
        list_ForEach(listEntry, location_area_detail->names) {
            location_area_name_free(listEntry->data);
        }
        list_freeList(location_area_detail->names);
        location_area_detail->names = NULL;
    }
    if (location_area_detail->pokemon_encounters) {
        list_ForEach(listEntry, location_area_detail->pokemon_encounters) {
            location_area_detail_pokemon_encounters_inner_free(listEntry->data);
        }
        list_freeList(location_area_detail->pokemon_encounters);
        location_area_detail->pokemon_encounters = NULL;
    }
    free(location_area_detail);
}

cJSON *location_area_detail_convertToJSON(location_area_detail_t *location_area_detail) {
    cJSON *item = cJSON_CreateObject();

    // location_area_detail->id
    if (!location_area_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", location_area_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // location_area_detail->name
    if (!location_area_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", location_area_detail->name) == NULL) {
    goto fail; //String
    }


    // location_area_detail->game_index
    if (!location_area_detail->game_index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "game_index", location_area_detail->game_index) == NULL) {
    goto fail; //Numeric
    }


    // location_area_detail->encounter_method_rates
    if (!location_area_detail->encounter_method_rates) {
        goto fail;
    }
    cJSON *encounter_method_rates = cJSON_AddArrayToObject(item, "encounter_method_rates");
    if(encounter_method_rates == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *encounter_method_ratesListEntry;
    if (location_area_detail->encounter_method_rates) {
    list_ForEach(encounter_method_ratesListEntry, location_area_detail->encounter_method_rates) {
    cJSON *itemLocal = location_area_detail_encounter_method_rates_inner_convertToJSON(encounter_method_ratesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(encounter_method_rates, itemLocal);
    }
    }


    // location_area_detail->location
    if (!location_area_detail->location) {
        goto fail;
    }
    cJSON *location_local_JSON = location_summary_convertToJSON(location_area_detail->location);
    if(location_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "location", location_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // location_area_detail->names
    if (!location_area_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (location_area_detail->names) {
    list_ForEach(namesListEntry, location_area_detail->names) {
    cJSON *itemLocal = location_area_name_convertToJSON(namesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(names, itemLocal);
    }
    }


    // location_area_detail->pokemon_encounters
    if (!location_area_detail->pokemon_encounters) {
        goto fail;
    }
    cJSON *pokemon_encounters = cJSON_AddArrayToObject(item, "pokemon_encounters");
    if(pokemon_encounters == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *pokemon_encountersListEntry;
    if (location_area_detail->pokemon_encounters) {
    list_ForEach(pokemon_encountersListEntry, location_area_detail->pokemon_encounters) {
    cJSON *itemLocal = location_area_detail_pokemon_encounters_inner_convertToJSON(pokemon_encountersListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(pokemon_encounters, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

location_area_detail_t *location_area_detail_parseFromJSON(cJSON *location_area_detailJSON){

    location_area_detail_t *location_area_detail_local_var = NULL;

    // define the local list for location_area_detail->encounter_method_rates
    list_t *encounter_method_ratesList = NULL;

    // define the local variable for location_area_detail->location
    location_summary_t *location_local_nonprim = NULL;

    // define the local list for location_area_detail->names
    list_t *namesList = NULL;

    // define the local list for location_area_detail->pokemon_encounters
    list_t *pokemon_encountersList = NULL;

    // location_area_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(location_area_detailJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // location_area_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(location_area_detailJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // location_area_detail->game_index
    cJSON *game_index = cJSON_GetObjectItemCaseSensitive(location_area_detailJSON, "game_index");
    if (cJSON_IsNull(game_index)) {
        game_index = NULL;
    }
    if (!game_index) {
        goto end;
    }

    
    if(!cJSON_IsNumber(game_index))
    {
    goto end; //Numeric
    }

    // location_area_detail->encounter_method_rates
    cJSON *encounter_method_rates = cJSON_GetObjectItemCaseSensitive(location_area_detailJSON, "encounter_method_rates");
    if (cJSON_IsNull(encounter_method_rates)) {
        encounter_method_rates = NULL;
    }
    if (!encounter_method_rates) {
        goto end;
    }

    
    cJSON *encounter_method_rates_local_nonprimitive = NULL;
    if(!cJSON_IsArray(encounter_method_rates)){
        goto end; //nonprimitive container
    }

    encounter_method_ratesList = list_createList();

    cJSON_ArrayForEach(encounter_method_rates_local_nonprimitive,encounter_method_rates )
    {
        if(!cJSON_IsObject(encounter_method_rates_local_nonprimitive)){
            goto end;
        }
        location_area_detail_encounter_method_rates_inner_t *encounter_method_ratesItem = location_area_detail_encounter_method_rates_inner_parseFromJSON(encounter_method_rates_local_nonprimitive);

        list_addElement(encounter_method_ratesList, encounter_method_ratesItem);
    }

    // location_area_detail->location
    cJSON *location = cJSON_GetObjectItemCaseSensitive(location_area_detailJSON, "location");
    if (cJSON_IsNull(location)) {
        location = NULL;
    }
    if (!location) {
        goto end;
    }

    
    location_local_nonprim = location_summary_parseFromJSON(location); //nonprimitive

    // location_area_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(location_area_detailJSON, "names");
    if (cJSON_IsNull(names)) {
        names = NULL;
    }
    if (!names) {
        goto end;
    }

    
    cJSON *names_local_nonprimitive = NULL;
    if(!cJSON_IsArray(names)){
        goto end; //nonprimitive container
    }

    namesList = list_createList();

    cJSON_ArrayForEach(names_local_nonprimitive,names )
    {
        if(!cJSON_IsObject(names_local_nonprimitive)){
            goto end;
        }
        location_area_name_t *namesItem = location_area_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }

    // location_area_detail->pokemon_encounters
    cJSON *pokemon_encounters = cJSON_GetObjectItemCaseSensitive(location_area_detailJSON, "pokemon_encounters");
    if (cJSON_IsNull(pokemon_encounters)) {
        pokemon_encounters = NULL;
    }
    if (!pokemon_encounters) {
        goto end;
    }

    
    cJSON *pokemon_encounters_local_nonprimitive = NULL;
    if(!cJSON_IsArray(pokemon_encounters)){
        goto end; //nonprimitive container
    }

    pokemon_encountersList = list_createList();

    cJSON_ArrayForEach(pokemon_encounters_local_nonprimitive,pokemon_encounters )
    {
        if(!cJSON_IsObject(pokemon_encounters_local_nonprimitive)){
            goto end;
        }
        location_area_detail_pokemon_encounters_inner_t *pokemon_encountersItem = location_area_detail_pokemon_encounters_inner_parseFromJSON(pokemon_encounters_local_nonprimitive);

        list_addElement(pokemon_encountersList, pokemon_encountersItem);
    }


    location_area_detail_local_var = location_area_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        game_index->valuedouble,
        encounter_method_ratesList,
        location_local_nonprim,
        namesList,
        pokemon_encountersList
        );

    return location_area_detail_local_var;
end:
    if (encounter_method_ratesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, encounter_method_ratesList) {
            location_area_detail_encounter_method_rates_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(encounter_method_ratesList);
        encounter_method_ratesList = NULL;
    }
    if (location_local_nonprim) {
        location_summary_free(location_local_nonprim);
        location_local_nonprim = NULL;
    }
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            location_area_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    if (pokemon_encountersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, pokemon_encountersList) {
            location_area_detail_pokemon_encounters_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(pokemon_encountersList);
        pokemon_encountersList = NULL;
    }
    return NULL;

}
