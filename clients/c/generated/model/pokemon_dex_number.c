#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_dex_number.h"



static pokemon_dex_number_t *pokemon_dex_number_create_internal(
    int *entry_number,
    pokemon_species_summary_t *pokemon_species
    ) {
    pokemon_dex_number_t *pokemon_dex_number_local_var = malloc(sizeof(pokemon_dex_number_t));
    if (!pokemon_dex_number_local_var) {
        return NULL;
    }
    memset(pokemon_dex_number_local_var, 0, sizeof(pokemon_dex_number_t));
    pokemon_dex_number_local_var->_library_owned = 1;
    pokemon_dex_number_local_var->entry_number = entry_number;
    pokemon_dex_number_local_var->pokemon_species = pokemon_species;
    return pokemon_dex_number_local_var;
}

__attribute__((deprecated)) pokemon_dex_number_t *pokemon_dex_number_create(
    int *entry_number,
    pokemon_species_summary_t *pokemon_species
    ) {
    int *entry_number_copy = NULL;
    if (entry_number) {
        entry_number_copy = malloc(sizeof(int));
        if (entry_number_copy) *entry_number_copy = *entry_number;
    }
    pokemon_dex_number_t *result = pokemon_dex_number_create_internal (
        entry_number_copy,
        pokemon_species
        );
    if (!result) {
        free(entry_number_copy);
    }
    return result;
}

void pokemon_dex_number_free(pokemon_dex_number_t *pokemon_dex_number) {
    if(NULL == pokemon_dex_number){
        return ;
    }
    if(pokemon_dex_number->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_dex_number_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_dex_number->entry_number) {
        free(pokemon_dex_number->entry_number);
        pokemon_dex_number->entry_number = NULL;
    }
    if (pokemon_dex_number->pokemon_species) {
        pokemon_species_summary_free(pokemon_dex_number->pokemon_species);
        pokemon_dex_number->pokemon_species = NULL;
    }
    free(pokemon_dex_number);
}

cJSON *pokemon_dex_number_convertToJSON(pokemon_dex_number_t *pokemon_dex_number) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_dex_number->entry_number
    if (!pokemon_dex_number->entry_number) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "entry_number", *pokemon_dex_number->entry_number) == NULL) {
    goto fail; //Numeric
    }


    // pokemon_dex_number->pokemon_species
    if (!pokemon_dex_number->pokemon_species) {
        goto fail;
    }
    cJSON *pokemon_species_local_JSON = pokemon_species_summary_convertToJSON(pokemon_dex_number->pokemon_species);
    if(pokemon_species_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pokemon_species", pokemon_species_local_JSON);
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

pokemon_dex_number_t *pokemon_dex_number_parseFromJSON(cJSON *pokemon_dex_numberJSON){

    pokemon_dex_number_t *pokemon_dex_number_local_var = NULL;

    // define the local variable for pokemon_dex_number->entry_number
    int *entry_number_local_var = NULL;

    // define the local variable for pokemon_dex_number->pokemon_species
    pokemon_species_summary_t *pokemon_species_local_nonprim = NULL;

    // pokemon_dex_number->entry_number
    cJSON *entry_number = cJSON_GetObjectItemCaseSensitive(pokemon_dex_numberJSON, "entry_number");
    if (cJSON_IsNull(entry_number)) {
        entry_number = NULL;
    }
    if (!entry_number) {
        goto end;
    }

    
    if(!cJSON_IsNumber(entry_number))
    {
    goto end; //Numeric
    }
    entry_number_local_var = malloc(sizeof(int));
    if(!entry_number_local_var)
    {
        goto end;
    }
    *entry_number_local_var = entry_number->valuedouble;

    // pokemon_dex_number->pokemon_species
    cJSON *pokemon_species = cJSON_GetObjectItemCaseSensitive(pokemon_dex_numberJSON, "pokemon_species");
    if (cJSON_IsNull(pokemon_species)) {
        pokemon_species = NULL;
    }
    if (!pokemon_species) {
        goto end;
    }

    
    pokemon_species_local_nonprim = pokemon_species_summary_parseFromJSON(pokemon_species); //nonprimitive



    pokemon_dex_number_local_var = pokemon_dex_number_create_internal (
        entry_number_local_var,
        pokemon_species_local_nonprim
        );

    if (!pokemon_dex_number_local_var) {
        goto end;
    }

    return pokemon_dex_number_local_var;
end:
    if (entry_number_local_var) {
        free(entry_number_local_var);
        entry_number_local_var = NULL;
    }
    if (pokemon_species_local_nonprim) {
        pokemon_species_summary_free(pokemon_species_local_nonprim);
        pokemon_species_local_nonprim = NULL;
    }
    return NULL;

}
