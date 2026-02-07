#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_species_flavor_text.h"



static pokemon_species_flavor_text_t *pokemon_species_flavor_text_create_internal(
    char *flavor_text,
    language_summary_t *language,
    version_summary_t *version
    ) {
    pokemon_species_flavor_text_t *pokemon_species_flavor_text_local_var = malloc(sizeof(pokemon_species_flavor_text_t));
    if (!pokemon_species_flavor_text_local_var) {
        return NULL;
    }
    pokemon_species_flavor_text_local_var->flavor_text = flavor_text;
    pokemon_species_flavor_text_local_var->language = language;
    pokemon_species_flavor_text_local_var->version = version;

    pokemon_species_flavor_text_local_var->_library_owned = 1;
    return pokemon_species_flavor_text_local_var;
}

__attribute__((deprecated)) pokemon_species_flavor_text_t *pokemon_species_flavor_text_create(
    char *flavor_text,
    language_summary_t *language,
    version_summary_t *version
    ) {
    return pokemon_species_flavor_text_create_internal (
        flavor_text,
        language,
        version
        );
}

void pokemon_species_flavor_text_free(pokemon_species_flavor_text_t *pokemon_species_flavor_text) {
    if(NULL == pokemon_species_flavor_text){
        return ;
    }
    if(pokemon_species_flavor_text->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_species_flavor_text_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_species_flavor_text->flavor_text) {
        free(pokemon_species_flavor_text->flavor_text);
        pokemon_species_flavor_text->flavor_text = NULL;
    }
    if (pokemon_species_flavor_text->language) {
        language_summary_free(pokemon_species_flavor_text->language);
        pokemon_species_flavor_text->language = NULL;
    }
    if (pokemon_species_flavor_text->version) {
        version_summary_free(pokemon_species_flavor_text->version);
        pokemon_species_flavor_text->version = NULL;
    }
    free(pokemon_species_flavor_text);
}

cJSON *pokemon_species_flavor_text_convertToJSON(pokemon_species_flavor_text_t *pokemon_species_flavor_text) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_species_flavor_text->flavor_text
    if (!pokemon_species_flavor_text->flavor_text) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "flavor_text", pokemon_species_flavor_text->flavor_text) == NULL) {
    goto fail; //String
    }


    // pokemon_species_flavor_text->language
    if (!pokemon_species_flavor_text->language) {
        goto fail;
    }
    cJSON *language_local_JSON = language_summary_convertToJSON(pokemon_species_flavor_text->language);
    if(language_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "language", language_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_species_flavor_text->version
    if (!pokemon_species_flavor_text->version) {
        goto fail;
    }
    cJSON *version_local_JSON = version_summary_convertToJSON(pokemon_species_flavor_text->version);
    if(version_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "version", version_local_JSON);
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

pokemon_species_flavor_text_t *pokemon_species_flavor_text_parseFromJSON(cJSON *pokemon_species_flavor_textJSON){

    pokemon_species_flavor_text_t *pokemon_species_flavor_text_local_var = NULL;

    // define the local variable for pokemon_species_flavor_text->language
    language_summary_t *language_local_nonprim = NULL;

    // define the local variable for pokemon_species_flavor_text->version
    version_summary_t *version_local_nonprim = NULL;

    // pokemon_species_flavor_text->flavor_text
    cJSON *flavor_text = cJSON_GetObjectItemCaseSensitive(pokemon_species_flavor_textJSON, "flavor_text");
    if (cJSON_IsNull(flavor_text)) {
        flavor_text = NULL;
    }
    if (!flavor_text) {
        goto end;
    }

    
    if(!cJSON_IsString(flavor_text))
    {
    goto end; //String
    }

    // pokemon_species_flavor_text->language
    cJSON *language = cJSON_GetObjectItemCaseSensitive(pokemon_species_flavor_textJSON, "language");
    if (cJSON_IsNull(language)) {
        language = NULL;
    }
    if (!language) {
        goto end;
    }

    
    language_local_nonprim = language_summary_parseFromJSON(language); //nonprimitive

    // pokemon_species_flavor_text->version
    cJSON *version = cJSON_GetObjectItemCaseSensitive(pokemon_species_flavor_textJSON, "version");
    if (cJSON_IsNull(version)) {
        version = NULL;
    }
    if (!version) {
        goto end;
    }

    
    version_local_nonprim = version_summary_parseFromJSON(version); //nonprimitive


    pokemon_species_flavor_text_local_var = pokemon_species_flavor_text_create_internal (
        strdup(flavor_text->valuestring),
        language_local_nonprim,
        version_local_nonprim
        );

    return pokemon_species_flavor_text_local_var;
end:
    if (language_local_nonprim) {
        language_summary_free(language_local_nonprim);
        language_local_nonprim = NULL;
    }
    if (version_local_nonprim) {
        version_summary_free(version_local_nonprim);
        version_local_nonprim = NULL;
    }
    return NULL;

}
