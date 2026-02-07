#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "evolution_chain_detail_chain_evolves_to_inner.h"



static evolution_chain_detail_chain_evolves_to_inner_t *evolution_chain_detail_chain_evolves_to_inner_create_internal(
    list_t *evolution_details,
    int is_baby,
    ability_detail_pokemon_inner_pokemon_t *species
    ) {
    evolution_chain_detail_chain_evolves_to_inner_t *evolution_chain_detail_chain_evolves_to_inner_local_var = malloc(sizeof(evolution_chain_detail_chain_evolves_to_inner_t));
    if (!evolution_chain_detail_chain_evolves_to_inner_local_var) {
        return NULL;
    }
    evolution_chain_detail_chain_evolves_to_inner_local_var->evolution_details = evolution_details;
    evolution_chain_detail_chain_evolves_to_inner_local_var->is_baby = is_baby;
    evolution_chain_detail_chain_evolves_to_inner_local_var->species = species;

    evolution_chain_detail_chain_evolves_to_inner_local_var->_library_owned = 1;
    return evolution_chain_detail_chain_evolves_to_inner_local_var;
}

__attribute__((deprecated)) evolution_chain_detail_chain_evolves_to_inner_t *evolution_chain_detail_chain_evolves_to_inner_create(
    list_t *evolution_details,
    int is_baby,
    ability_detail_pokemon_inner_pokemon_t *species
    ) {
    return evolution_chain_detail_chain_evolves_to_inner_create_internal (
        evolution_details,
        is_baby,
        species
        );
}

void evolution_chain_detail_chain_evolves_to_inner_free(evolution_chain_detail_chain_evolves_to_inner_t *evolution_chain_detail_chain_evolves_to_inner) {
    if(NULL == evolution_chain_detail_chain_evolves_to_inner){
        return ;
    }
    if(evolution_chain_detail_chain_evolves_to_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "evolution_chain_detail_chain_evolves_to_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (evolution_chain_detail_chain_evolves_to_inner->evolution_details) {
        list_ForEach(listEntry, evolution_chain_detail_chain_evolves_to_inner->evolution_details) {
            evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_free(listEntry->data);
        }
        list_freeList(evolution_chain_detail_chain_evolves_to_inner->evolution_details);
        evolution_chain_detail_chain_evolves_to_inner->evolution_details = NULL;
    }
    if (evolution_chain_detail_chain_evolves_to_inner->species) {
        ability_detail_pokemon_inner_pokemon_free(evolution_chain_detail_chain_evolves_to_inner->species);
        evolution_chain_detail_chain_evolves_to_inner->species = NULL;
    }
    free(evolution_chain_detail_chain_evolves_to_inner);
}

cJSON *evolution_chain_detail_chain_evolves_to_inner_convertToJSON(evolution_chain_detail_chain_evolves_to_inner_t *evolution_chain_detail_chain_evolves_to_inner) {
    cJSON *item = cJSON_CreateObject();

    // evolution_chain_detail_chain_evolves_to_inner->evolution_details
    if (!evolution_chain_detail_chain_evolves_to_inner->evolution_details) {
        goto fail;
    }
    cJSON *evolution_details = cJSON_AddArrayToObject(item, "evolution_details");
    if(evolution_details == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *evolution_detailsListEntry;
    if (evolution_chain_detail_chain_evolves_to_inner->evolution_details) {
    list_ForEach(evolution_detailsListEntry, evolution_chain_detail_chain_evolves_to_inner->evolution_details) {
    cJSON *itemLocal = evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_convertToJSON(evolution_detailsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(evolution_details, itemLocal);
    }
    }


    // evolution_chain_detail_chain_evolves_to_inner->is_baby
    if (!evolution_chain_detail_chain_evolves_to_inner->is_baby) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "is_baby", evolution_chain_detail_chain_evolves_to_inner->is_baby) == NULL) {
    goto fail; //Bool
    }


    // evolution_chain_detail_chain_evolves_to_inner->species
    if (!evolution_chain_detail_chain_evolves_to_inner->species) {
        goto fail;
    }
    cJSON *species_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(evolution_chain_detail_chain_evolves_to_inner->species);
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

evolution_chain_detail_chain_evolves_to_inner_t *evolution_chain_detail_chain_evolves_to_inner_parseFromJSON(cJSON *evolution_chain_detail_chain_evolves_to_innerJSON){

    evolution_chain_detail_chain_evolves_to_inner_t *evolution_chain_detail_chain_evolves_to_inner_local_var = NULL;

    // define the local list for evolution_chain_detail_chain_evolves_to_inner->evolution_details
    list_t *evolution_detailsList = NULL;

    // define the local variable for evolution_chain_detail_chain_evolves_to_inner->species
    ability_detail_pokemon_inner_pokemon_t *species_local_nonprim = NULL;

    // evolution_chain_detail_chain_evolves_to_inner->evolution_details
    cJSON *evolution_details = cJSON_GetObjectItemCaseSensitive(evolution_chain_detail_chain_evolves_to_innerJSON, "evolution_details");
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
        evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_t *evolution_detailsItem = evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_parseFromJSON(evolution_details_local_nonprimitive);

        list_addElement(evolution_detailsList, evolution_detailsItem);
    }

    // evolution_chain_detail_chain_evolves_to_inner->is_baby
    cJSON *is_baby = cJSON_GetObjectItemCaseSensitive(evolution_chain_detail_chain_evolves_to_innerJSON, "is_baby");
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

    // evolution_chain_detail_chain_evolves_to_inner->species
    cJSON *species = cJSON_GetObjectItemCaseSensitive(evolution_chain_detail_chain_evolves_to_innerJSON, "species");
    if (cJSON_IsNull(species)) {
        species = NULL;
    }
    if (!species) {
        goto end;
    }

    
    species_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(species); //nonprimitive


    evolution_chain_detail_chain_evolves_to_inner_local_var = evolution_chain_detail_chain_evolves_to_inner_create_internal (
        evolution_detailsList,
        is_baby->valueint,
        species_local_nonprim
        );

    return evolution_chain_detail_chain_evolves_to_inner_local_var;
end:
    if (evolution_detailsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, evolution_detailsList) {
            evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(evolution_detailsList);
        evolution_detailsList = NULL;
    }
    if (species_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(species_local_nonprim);
        species_local_nonprim = NULL;
    }
    return NULL;

}
