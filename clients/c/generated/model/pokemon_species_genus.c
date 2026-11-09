#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_species_genus.h"



static pokemon_species_genus_t *pokemon_species_genus_create_internal(
    char *genus,
    language_summary_t *language
    ) {
    pokemon_species_genus_t *pokemon_species_genus_local_var = malloc(sizeof(pokemon_species_genus_t));
    if (!pokemon_species_genus_local_var) {
        return NULL;
    }
    memset(pokemon_species_genus_local_var, 0, sizeof(pokemon_species_genus_t));
    pokemon_species_genus_local_var->_library_owned = 1;
    pokemon_species_genus_local_var->genus = genus;
    pokemon_species_genus_local_var->language = language;
    return pokemon_species_genus_local_var;
}

__attribute__((deprecated)) pokemon_species_genus_t *pokemon_species_genus_create(
    char *genus,
    language_summary_t *language
    ) {
    pokemon_species_genus_t *result = pokemon_species_genus_create_internal (
        genus,
        language
        );
    if (!result) {
    }
    return result;
}

void pokemon_species_genus_free(pokemon_species_genus_t *pokemon_species_genus) {
    if(NULL == pokemon_species_genus){
        return ;
    }
    if(pokemon_species_genus->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_species_genus_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_species_genus->genus) {
        free(pokemon_species_genus->genus);
        pokemon_species_genus->genus = NULL;
    }
    if (pokemon_species_genus->language) {
        language_summary_free(pokemon_species_genus->language);
        pokemon_species_genus->language = NULL;
    }
    free(pokemon_species_genus);
}

cJSON *pokemon_species_genus_convertToJSON(pokemon_species_genus_t *pokemon_species_genus) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_species_genus->genus
    if (!pokemon_species_genus->genus) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "genus", pokemon_species_genus->genus) == NULL) {
    goto fail; //String
    }


    // pokemon_species_genus->language
    if (!pokemon_species_genus->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(pokemon_species_genus->language);
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

pokemon_species_genus_t *pokemon_species_genus_parseFromJSON(cJSON *pokemon_species_genusJSON){

    pokemon_species_genus_t *pokemon_species_genus_local_var = NULL;

    char *genus_local_str = NULL;

    // define the local variable for pokemon_species_genus->language
    language_summary_t *language_local_nonprim = NULL;

    // pokemon_species_genus->genus
    cJSON *genus = cJSON_GetObjectItemCaseSensitive(pokemon_species_genusJSON, "genus");
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

    // pokemon_species_genus->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(pokemon_species_genusJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    if (genus && !cJSON_IsNull(genus)) genus_local_str = strdup(genus->valuestring);

    pokemon_species_genus_local_var = pokemon_species_genus_create_internal (
        genus_local_str,
        language_local_nonprim
        );

    if (!pokemon_species_genus_local_var) {
        goto end;
    }

    return pokemon_species_genus_local_var;
end:
    if (genus_local_str) {
        free(genus_local_str);
        genus_local_str = NULL;
    }
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
