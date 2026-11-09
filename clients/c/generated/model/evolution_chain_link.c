#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "evolution_chain_link.h"



static evolution_chain_link_t *evolution_chain_link_create_internal(
    int *is_baby,
    pokemon_species_summary_t *species,
    list_t *evolution_details,
    list_t *evolves_to
    ) {
    evolution_chain_link_t *evolution_chain_link_local_var = malloc(sizeof(evolution_chain_link_t));
    if (!evolution_chain_link_local_var) {
        return NULL;
    }
    memset(evolution_chain_link_local_var, 0, sizeof(evolution_chain_link_t));
    evolution_chain_link_local_var->_library_owned = 1;
    evolution_chain_link_local_var->is_baby = is_baby;
    evolution_chain_link_local_var->species = species;
    evolution_chain_link_local_var->evolution_details = evolution_details;
    evolution_chain_link_local_var->evolves_to = evolves_to;
    return evolution_chain_link_local_var;
}

__attribute__((deprecated)) evolution_chain_link_t *evolution_chain_link_create(
    int *is_baby,
    pokemon_species_summary_t *species,
    list_t *evolution_details,
    list_t *evolves_to
    ) {
    int *is_baby_copy = NULL;
    if (is_baby) {
        is_baby_copy = malloc(sizeof(int));
        if (is_baby_copy) *is_baby_copy = *is_baby;
    }
    evolution_chain_link_t *result = evolution_chain_link_create_internal (
        is_baby_copy,
        species,
        evolution_details,
        evolves_to
        );
    if (!result) {
        free(is_baby_copy);
    }
    return result;
}

void evolution_chain_link_free(evolution_chain_link_t *evolution_chain_link) {
    if(NULL == evolution_chain_link){
        return ;
    }
    if(evolution_chain_link->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "evolution_chain_link_free");
        return ;
    }
    listEntry_t *listEntry;
    if (evolution_chain_link->is_baby) {
        free(evolution_chain_link->is_baby);
        evolution_chain_link->is_baby = NULL;
    }
    if (evolution_chain_link->species) {
        pokemon_species_summary_free(evolution_chain_link->species);
        evolution_chain_link->species = NULL;
    }
    if (evolution_chain_link->evolution_details) {
        list_ForEach(listEntry, evolution_chain_link->evolution_details) {
            pokemon_evolution_free(listEntry->data);
        }
        list_freeList(evolution_chain_link->evolution_details);
        evolution_chain_link->evolution_details = NULL;
    }
    if (evolution_chain_link->evolves_to) {
        list_ForEach(listEntry, evolution_chain_link->evolves_to) {
            evolution_chain_link_free(listEntry->data);
        }
        list_freeList(evolution_chain_link->evolves_to);
        evolution_chain_link->evolves_to = NULL;
    }
    free(evolution_chain_link);
}

cJSON *evolution_chain_link_convertToJSON(evolution_chain_link_t *evolution_chain_link) {
    cJSON *item = cJSON_CreateObject();

    // evolution_chain_link->is_baby
    if (!evolution_chain_link->is_baby) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "is_baby", *evolution_chain_link->is_baby) == NULL) {
    goto fail; //Bool
    }


    // evolution_chain_link->species
    if (!evolution_chain_link->species) {
        goto fail;
    }
    cJSON *species_local_JSON = pokemon_species_summary_convertToJSON(evolution_chain_link->species);
    if(species_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "species", species_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // evolution_chain_link->evolution_details
    if (!evolution_chain_link->evolution_details) {
        goto fail;
    }
    cJSON *evolution_details = cJSON_AddArrayToObject(item, "evolution_details");
    if(evolution_details == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *evolution_detailsListEntry;
    if (evolution_chain_link->evolution_details) {
    list_ForEach(evolution_detailsListEntry, evolution_chain_link->evolution_details) {
    cJSON *itemLocal = pokemon_evolution_convertToJSON(evolution_detailsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(evolution_details, itemLocal);
    }
    }


    // evolution_chain_link->evolves_to
    if (!evolution_chain_link->evolves_to) {
        goto fail;
    }
    cJSON *evolves_to = cJSON_AddArrayToObject(item, "evolves_to");
    if(evolves_to == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *evolves_toListEntry;
    if (evolution_chain_link->evolves_to) {
    list_ForEach(evolves_toListEntry, evolution_chain_link->evolves_to) {
    cJSON *itemLocal = evolution_chain_link_convertToJSON(evolves_toListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(evolves_to, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

evolution_chain_link_t *evolution_chain_link_parseFromJSON(cJSON *evolution_chain_linkJSON){

    evolution_chain_link_t *evolution_chain_link_local_var = NULL;

    // define the local variable for evolution_chain_link->is_baby
    int *is_baby_local_var = NULL;

    // define the local variable for evolution_chain_link->species
    pokemon_species_summary_t *species_local_nonprim = NULL;

    // define the local list for evolution_chain_link->evolution_details
    list_t *evolution_detailsList = NULL;

    // define the local list for evolution_chain_link->evolves_to
    list_t *evolves_toList = NULL;

    // evolution_chain_link->is_baby
    cJSON *is_baby = cJSON_GetObjectItemCaseSensitive(evolution_chain_linkJSON, "is_baby");
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
    is_baby_local_var = malloc(sizeof(int));
    if(!is_baby_local_var)
    {
        goto end;
    }
    *is_baby_local_var = is_baby->valueint;

    // evolution_chain_link->species
    cJSON *species = cJSON_GetObjectItemCaseSensitive(evolution_chain_linkJSON, "species");
    if (cJSON_IsNull(species)) {
        species = NULL;
    }
    if (!species) {
        goto end;
    }

    
    species_local_nonprim = pokemon_species_summary_parseFromJSON(species); //nonprimitive

    // evolution_chain_link->evolution_details
    cJSON *evolution_details = cJSON_GetObjectItemCaseSensitive(evolution_chain_linkJSON, "evolution_details");
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
        pokemon_evolution_t *evolution_detailsItem = pokemon_evolution_parseFromJSON(evolution_details_local_nonprimitive);

        list_addElement(evolution_detailsList, evolution_detailsItem);
    }

    // evolution_chain_link->evolves_to
    cJSON *evolves_to = cJSON_GetObjectItemCaseSensitive(evolution_chain_linkJSON, "evolves_to");
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
        evolution_chain_link_t *evolves_toItem = evolution_chain_link_parseFromJSON(evolves_to_local_nonprimitive);

        list_addElement(evolves_toList, evolves_toItem);
    }



    evolution_chain_link_local_var = evolution_chain_link_create_internal (
        is_baby_local_var,
        species_local_nonprim,
        evolution_detailsList,
        evolves_toList
        );

    if (!evolution_chain_link_local_var) {
        goto end;
    }

    return evolution_chain_link_local_var;
end:
    if (is_baby_local_var) {
        free(is_baby_local_var);
        is_baby_local_var = NULL;
    }
    if (species_local_nonprim) {
        pokemon_species_summary_free(species_local_nonprim);
        species_local_nonprim = NULL;
    }
    if (evolution_detailsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, evolution_detailsList) {
            pokemon_evolution_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(evolution_detailsList);
        evolution_detailsList = NULL;
    }
    if (evolves_toList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, evolves_toList) {
            evolution_chain_link_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(evolves_toList);
        evolves_toList = NULL;
    }
    return NULL;

}
