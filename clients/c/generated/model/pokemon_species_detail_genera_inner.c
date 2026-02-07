#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_species_detail_genera_inner.h"



static pokemon_species_detail_genera_inner_t *pokemon_species_detail_genera_inner_create_internal(
    char *genus,
    ability_detail_pokemon_inner_pokemon_t *language
    ) {
    pokemon_species_detail_genera_inner_t *pokemon_species_detail_genera_inner_local_var = malloc(sizeof(pokemon_species_detail_genera_inner_t));
    if (!pokemon_species_detail_genera_inner_local_var) {
        return NULL;
    }
    pokemon_species_detail_genera_inner_local_var->genus = genus;
    pokemon_species_detail_genera_inner_local_var->language = language;

    pokemon_species_detail_genera_inner_local_var->_library_owned = 1;
    return pokemon_species_detail_genera_inner_local_var;
}

__attribute__((deprecated)) pokemon_species_detail_genera_inner_t *pokemon_species_detail_genera_inner_create(
    char *genus,
    ability_detail_pokemon_inner_pokemon_t *language
    ) {
    return pokemon_species_detail_genera_inner_create_internal (
        genus,
        language
        );
}

void pokemon_species_detail_genera_inner_free(pokemon_species_detail_genera_inner_t *pokemon_species_detail_genera_inner) {
    if(NULL == pokemon_species_detail_genera_inner){
        return ;
    }
    if(pokemon_species_detail_genera_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_species_detail_genera_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_species_detail_genera_inner->genus) {
        free(pokemon_species_detail_genera_inner->genus);
        pokemon_species_detail_genera_inner->genus = NULL;
    }
    if (pokemon_species_detail_genera_inner->language) {
        ability_detail_pokemon_inner_pokemon_free(pokemon_species_detail_genera_inner->language);
        pokemon_species_detail_genera_inner->language = NULL;
    }
    free(pokemon_species_detail_genera_inner);
}

cJSON *pokemon_species_detail_genera_inner_convertToJSON(pokemon_species_detail_genera_inner_t *pokemon_species_detail_genera_inner) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_species_detail_genera_inner->genus
    if (!pokemon_species_detail_genera_inner->genus) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "genus", pokemon_species_detail_genera_inner->genus) == NULL) {
    goto fail; //String
    }


    // pokemon_species_detail_genera_inner->language
    if (!pokemon_species_detail_genera_inner->language) {
        goto fail;
    }
    cJSON *language_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(pokemon_species_detail_genera_inner->language);
    if(language_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "language", language_local_JSON);
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

pokemon_species_detail_genera_inner_t *pokemon_species_detail_genera_inner_parseFromJSON(cJSON *pokemon_species_detail_genera_innerJSON){

    pokemon_species_detail_genera_inner_t *pokemon_species_detail_genera_inner_local_var = NULL;

    // define the local variable for pokemon_species_detail_genera_inner->language
    ability_detail_pokemon_inner_pokemon_t *language_local_nonprim = NULL;

    // pokemon_species_detail_genera_inner->genus
    cJSON *genus = cJSON_GetObjectItemCaseSensitive(pokemon_species_detail_genera_innerJSON, "genus");
    if (cJSON_IsNull(genus)) {
        genus = NULL;
    }
    if (!genus) {
        goto end;
    }

    
    if(!cJSON_IsString(genus))
    {
    goto end; //String
    }

    // pokemon_species_detail_genera_inner->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(pokemon_species_detail_genera_innerJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(language); //nonprimitive


    pokemon_species_detail_genera_inner_local_var = pokemon_species_detail_genera_inner_create_internal (
        strdup(genus->valuestring),
        language_local_nonprim
        );

    return pokemon_species_detail_genera_inner_local_var;
end:
    if (language_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
