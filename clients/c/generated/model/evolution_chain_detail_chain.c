#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "evolution_chain_detail_chain.h"



static evolution_chain_detail_chain_t *evolution_chain_detail_chain_create_internal(
    list_t *evolution_details,
    list_t *evolves_to,
    int is_baby,
    ability_detail_pokemon_inner_pokemon_t *species
    ) {
    evolution_chain_detail_chain_t *evolution_chain_detail_chain_local_var = malloc(sizeof(evolution_chain_detail_chain_t));
    if (!evolution_chain_detail_chain_local_var) {
        return NULL;
    }
    evolution_chain_detail_chain_local_var->evolution_details = evolution_details;
    evolution_chain_detail_chain_local_var->evolves_to = evolves_to;
    evolution_chain_detail_chain_local_var->is_baby = is_baby;
    evolution_chain_detail_chain_local_var->species = species;

    evolution_chain_detail_chain_local_var->_library_owned = 1;
    return evolution_chain_detail_chain_local_var;
}

__attribute__((deprecated)) evolution_chain_detail_chain_t *evolution_chain_detail_chain_create(
    list_t *evolution_details,
    list_t *evolves_to,
    int is_baby,
    ability_detail_pokemon_inner_pokemon_t *species
    ) {
    return evolution_chain_detail_chain_create_internal (
        evolution_details,
        evolves_to,
        is_baby,
        species
        );
}

void evolution_chain_detail_chain_free(evolution_chain_detail_chain_t *evolution_chain_detail_chain) {
    if(NULL == evolution_chain_detail_chain){
        return ;
    }
    if(evolution_chain_detail_chain->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "evolution_chain_detail_chain_free");
        return ;
    }
    listEntry_t *listEntry;
    if (evolution_chain_detail_chain->evolution_details) {
        list_ForEach(listEntry, evolution_chain_detail_chain->evolution_details) {
            any_type_free(listEntry->data);
        }
        list_freeList(evolution_chain_detail_chain->evolution_details);
        evolution_chain_detail_chain->evolution_details = NULL;
    }
    if (evolution_chain_detail_chain->evolves_to) {
        list_ForEach(listEntry, evolution_chain_detail_chain->evolves_to) {
            evolution_chain_detail_chain_evolves_to_inner_free(listEntry->data);
        }
        list_freeList(evolution_chain_detail_chain->evolves_to);
        evolution_chain_detail_chain->evolves_to = NULL;
    }
    if (evolution_chain_detail_chain->species) {
        ability_detail_pokemon_inner_pokemon_free(evolution_chain_detail_chain->species);
        evolution_chain_detail_chain->species = NULL;
    }
    free(evolution_chain_detail_chain);
}

cJSON *evolution_chain_detail_chain_convertToJSON(evolution_chain_detail_chain_t *evolution_chain_detail_chain) {
    cJSON *item = cJSON_CreateObject();

    // evolution_chain_detail_chain->evolution_details
    if (!evolution_chain_detail_chain->evolution_details) {
        goto fail;
    }
    cJSON *evolution_details = cJSON_AddArrayToObject(item, "evolution_details");
    if(evolution_details == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *evolution_detailsListEntry;
    if (evolution_chain_detail_chain->evolution_details) {
    list_ForEach(evolution_detailsListEntry, evolution_chain_detail_chain->evolution_details) {
    cJSON *itemLocal = any_type_convertToJSON(evolution_detailsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(evolution_details, itemLocal);
    }
    }


    // evolution_chain_detail_chain->evolves_to
    if (!evolution_chain_detail_chain->evolves_to) {
        goto fail;
    }
    cJSON *evolves_to = cJSON_AddArrayToObject(item, "evolves_to");
    if(evolves_to == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *evolves_toListEntry;
    if (evolution_chain_detail_chain->evolves_to) {
    list_ForEach(evolves_toListEntry, evolution_chain_detail_chain->evolves_to) {
    cJSON *itemLocal = evolution_chain_detail_chain_evolves_to_inner_convertToJSON(evolves_toListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(evolves_to, itemLocal);
    }
    }


    // evolution_chain_detail_chain->is_baby
    if (!evolution_chain_detail_chain->is_baby) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "is_baby", evolution_chain_detail_chain->is_baby) == NULL) {
    goto fail; //Bool
    }


    // evolution_chain_detail_chain->species
    if (!evolution_chain_detail_chain->species) {
        goto fail;
    }
    cJSON *species_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(evolution_chain_detail_chain->species);
    if(species_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "species", species_local_JSON);
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

evolution_chain_detail_chain_t *evolution_chain_detail_chain_parseFromJSON(cJSON *evolution_chain_detail_chainJSON){

    evolution_chain_detail_chain_t *evolution_chain_detail_chain_local_var = NULL;

    // define the local list for evolution_chain_detail_chain->evolution_details
    list_t *evolution_detailsList = NULL;

    // define the local list for evolution_chain_detail_chain->evolves_to
    list_t *evolves_toList = NULL;

    // define the local variable for evolution_chain_detail_chain->species
    ability_detail_pokemon_inner_pokemon_t *species_local_nonprim = NULL;

    // evolution_chain_detail_chain->evolution_details
    cJSON *evolution_details = cJSON_GetObjectItemCaseSensitive(evolution_chain_detail_chainJSON, "evolution_details");
    if (cJSON_IsNull(evolution_details)) {
        evolution_details = NULL;
    }
    if (!evolution_details) {
        goto end;
    }

    
    cJSON *evolution_details_local_nonprimitive = NULL;
    if(!cJSON_IsArray(evolution_details)){
        goto end; //nonprimitive container
    }

    evolution_detailsList = list_createList();

    cJSON_ArrayForEach(evolution_details_local_nonprimitive,evolution_details )
    {
        if(!cJSON_IsObject(evolution_details_local_nonprimitive)){
            goto end;
        }
        any_type_t *evolution_detailsItem = any_type_parseFromJSON(evolution_details_local_nonprimitive);

        list_addElement(evolution_detailsList, evolution_detailsItem);
    }

    // evolution_chain_detail_chain->evolves_to
    cJSON *evolves_to = cJSON_GetObjectItemCaseSensitive(evolution_chain_detail_chainJSON, "evolves_to");
    if (cJSON_IsNull(evolves_to)) {
        evolves_to = NULL;
    }
    if (!evolves_to) {
        goto end;
    }

    
    cJSON *evolves_to_local_nonprimitive = NULL;
    if(!cJSON_IsArray(evolves_to)){
        goto end; //nonprimitive container
    }

    evolves_toList = list_createList();

    cJSON_ArrayForEach(evolves_to_local_nonprimitive,evolves_to )
    {
        if(!cJSON_IsObject(evolves_to_local_nonprimitive)){
            goto end;
        }
        evolution_chain_detail_chain_evolves_to_inner_t *evolves_toItem = evolution_chain_detail_chain_evolves_to_inner_parseFromJSON(evolves_to_local_nonprimitive);

        list_addElement(evolves_toList, evolves_toItem);
    }

    // evolution_chain_detail_chain->is_baby
    cJSON *is_baby = cJSON_GetObjectItemCaseSensitive(evolution_chain_detail_chainJSON, "is_baby");
    if (cJSON_IsNull(is_baby)) {
        is_baby = NULL;
    }
    if (!is_baby) {
        goto end;
    }

    
    if(!cJSON_IsBool(is_baby))
    {
    goto end; //Bool
    }

    // evolution_chain_detail_chain->species
    cJSON *species = cJSON_GetObjectItemCaseSensitive(evolution_chain_detail_chainJSON, "species");
    if (cJSON_IsNull(species)) {
        species = NULL;
    }
    if (!species) {
        goto end;
    }

    
    species_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(species); //nonprimitive


    evolution_chain_detail_chain_local_var = evolution_chain_detail_chain_create_internal (
        evolution_detailsList,
        evolves_toList,
        is_baby->valueint,
        species_local_nonprim
        );

    return evolution_chain_detail_chain_local_var;
end:
    if (evolution_detailsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, evolution_detailsList) {
            any_type_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(evolution_detailsList);
        evolution_detailsList = NULL;
    }
    if (evolves_toList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, evolves_toList) {
            evolution_chain_detail_chain_evolves_to_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(evolves_toList);
        evolves_toList = NULL;
    }
    if (species_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(species_local_nonprim);
        species_local_nonprim = NULL;
    }
    return NULL;

}
