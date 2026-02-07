#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_dex_entry.h"



static pokemon_dex_entry_t *pokemon_dex_entry_create_internal(
    int entry_number,
    pokedex_summary_t *pokedex
    ) {
    pokemon_dex_entry_t *pokemon_dex_entry_local_var = malloc(sizeof(pokemon_dex_entry_t));
    if (!pokemon_dex_entry_local_var) {
        return NULL;
    }
    pokemon_dex_entry_local_var->entry_number = entry_number;
    pokemon_dex_entry_local_var->pokedex = pokedex;

    pokemon_dex_entry_local_var->_library_owned = 1;
    return pokemon_dex_entry_local_var;
}

__attribute__((deprecated)) pokemon_dex_entry_t *pokemon_dex_entry_create(
    int entry_number,
    pokedex_summary_t *pokedex
    ) {
    return pokemon_dex_entry_create_internal (
        entry_number,
        pokedex
        );
}

void pokemon_dex_entry_free(pokemon_dex_entry_t *pokemon_dex_entry) {
    if(NULL == pokemon_dex_entry){
        return ;
    }
    if(pokemon_dex_entry->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_dex_entry_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_dex_entry->pokedex) {
        pokedex_summary_free(pokemon_dex_entry->pokedex);
        pokemon_dex_entry->pokedex = NULL;
    }
    free(pokemon_dex_entry);
}

cJSON *pokemon_dex_entry_convertToJSON(pokemon_dex_entry_t *pokemon_dex_entry) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_dex_entry->entry_number
    if (!pokemon_dex_entry->entry_number) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "entry_number", pokemon_dex_entry->entry_number) == NULL) {
    goto fail; //Numeric
    }


    // pokemon_dex_entry->pokedex
    if (!pokemon_dex_entry->pokedex) {
        goto fail;
    }
    cJSON *pokedex_local_JSON = pokedex_summary_convertToJSON(pokemon_dex_entry->pokedex);
    if(pokedex_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pokedex", pokedex_local_JSON);
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

pokemon_dex_entry_t *pokemon_dex_entry_parseFromJSON(cJSON *pokemon_dex_entryJSON){

    pokemon_dex_entry_t *pokemon_dex_entry_local_var = NULL;

    // define the local variable for pokemon_dex_entry->pokedex
    pokedex_summary_t *pokedex_local_nonprim = NULL;

    // pokemon_dex_entry->entry_number
    cJSON *entry_number = cJSON_GetObjectItemCaseSensitive(pokemon_dex_entryJSON, "entry_number");
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

    // pokemon_dex_entry->pokedex
    cJSON *pokedex = cJSON_GetObjectItemCaseSensitive(pokemon_dex_entryJSON, "pokedex");
    if (cJSON_IsNull(pokedex)) {
        pokedex = NULL;
    }
    if (!pokedex) {
        goto end;
    }

    
    pokedex_local_nonprim = pokedex_summary_parseFromJSON(pokedex); //nonprimitive


    pokemon_dex_entry_local_var = pokemon_dex_entry_create_internal (
        entry_number->valuedouble,
        pokedex_local_nonprim
        );

    return pokemon_dex_entry_local_var;
end:
    if (pokedex_local_nonprim) {
        pokedex_summary_free(pokedex_local_nonprim);
        pokedex_local_nonprim = NULL;
    }
    return NULL;

}
