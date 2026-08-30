#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_species_description.h"



static pokemon_species_description_t *pokemon_species_description_create_internal(
    char *description,
    language_summary_t *language
    ) {
    pokemon_species_description_t *pokemon_species_description_local_var = malloc(sizeof(pokemon_species_description_t));
    if (!pokemon_species_description_local_var) {
        return NULL;
    }
    memset(pokemon_species_description_local_var, 0, sizeof(pokemon_species_description_t));
    pokemon_species_description_local_var->_library_owned = 1;
    pokemon_species_description_local_var->description = description;
    pokemon_species_description_local_var->language = language;
    return pokemon_species_description_local_var;
}

__attribute__((deprecated)) pokemon_species_description_t *pokemon_species_description_create(
    char *description,
    language_summary_t *language
    ) {
    pokemon_species_description_t *result = pokemon_species_description_create_internal (
        description,
        language
        );
    if (!result) {
    }
    return result;
}

void pokemon_species_description_free(pokemon_species_description_t *pokemon_species_description) {
    if(NULL == pokemon_species_description){
        return ;
    }
    if(pokemon_species_description->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_species_description_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_species_description->description) {
        free(pokemon_species_description->description);
        pokemon_species_description->description = NULL;
    }
    if (pokemon_species_description->language) {
        language_summary_free(pokemon_species_description->language);
        pokemon_species_description->language = NULL;
    }
    free(pokemon_species_description);
}

cJSON *pokemon_species_description_convertToJSON(pokemon_species_description_t *pokemon_species_description) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_species_description->description
    if(pokemon_species_description->description) {
    if(cJSON_AddStringToObject(item, "description", pokemon_species_description->description) == NULL) {
    goto fail; //String
    }
    }


    // pokemon_species_description->language
    if (!pokemon_species_description->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(pokemon_species_description->language);
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

pokemon_species_description_t *pokemon_species_description_parseFromJSON(cJSON *pokemon_species_descriptionJSON){

    pokemon_species_description_t *pokemon_species_description_local_var = NULL;

    char *description_local_str = NULL;

    // define the local variable for pokemon_species_description->language
    language_summary_t *language_local_nonprim = NULL;

    // pokemon_species_description->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(pokemon_species_descriptionJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // pokemon_species_description->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(pokemon_species_descriptionJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive


    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);

    pokemon_species_description_local_var = pokemon_species_description_create_internal (
        description_local_str,
        language_local_nonprim
        );

    if (!pokemon_species_description_local_var) {
        goto end;
    }

    return pokemon_species_description_local_var;
end:
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    return NULL;

}
