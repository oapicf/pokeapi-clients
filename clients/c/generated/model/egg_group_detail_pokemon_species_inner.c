#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "egg_group_detail_pokemon_species_inner.h"



static egg_group_detail_pokemon_species_inner_t *egg_group_detail_pokemon_species_inner_create_internal(
    char *name,
    char *url
    ) {
    egg_group_detail_pokemon_species_inner_t *egg_group_detail_pokemon_species_inner_local_var = malloc(sizeof(egg_group_detail_pokemon_species_inner_t));
    if (!egg_group_detail_pokemon_species_inner_local_var) {
        return NULL;
    }
    egg_group_detail_pokemon_species_inner_local_var->name = name;
    egg_group_detail_pokemon_species_inner_local_var->url = url;

    egg_group_detail_pokemon_species_inner_local_var->_library_owned = 1;
    return egg_group_detail_pokemon_species_inner_local_var;
}

__attribute__((deprecated)) egg_group_detail_pokemon_species_inner_t *egg_group_detail_pokemon_species_inner_create(
    char *name,
    char *url
    ) {
    return egg_group_detail_pokemon_species_inner_create_internal (
        name,
        url
        );
}

void egg_group_detail_pokemon_species_inner_free(egg_group_detail_pokemon_species_inner_t *egg_group_detail_pokemon_species_inner) {
    if(NULL == egg_group_detail_pokemon_species_inner){
        return ;
    }
    if(egg_group_detail_pokemon_species_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "egg_group_detail_pokemon_species_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (egg_group_detail_pokemon_species_inner->name) {
        free(egg_group_detail_pokemon_species_inner->name);
        egg_group_detail_pokemon_species_inner->name = NULL;
    }
    if (egg_group_detail_pokemon_species_inner->url) {
        free(egg_group_detail_pokemon_species_inner->url);
        egg_group_detail_pokemon_species_inner->url = NULL;
    }
    free(egg_group_detail_pokemon_species_inner);
}

cJSON *egg_group_detail_pokemon_species_inner_convertToJSON(egg_group_detail_pokemon_species_inner_t *egg_group_detail_pokemon_species_inner) {
    cJSON *item = cJSON_CreateObject();

    // egg_group_detail_pokemon_species_inner->name
    if(egg_group_detail_pokemon_species_inner->name) {
    if(cJSON_AddStringToObject(item, "name", egg_group_detail_pokemon_species_inner->name) == NULL) {
    goto fail; //String
    }
    }


    // egg_group_detail_pokemon_species_inner->url
    if(egg_group_detail_pokemon_species_inner->url) {
    if(cJSON_AddStringToObject(item, "url", egg_group_detail_pokemon_species_inner->url) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

egg_group_detail_pokemon_species_inner_t *egg_group_detail_pokemon_species_inner_parseFromJSON(cJSON *egg_group_detail_pokemon_species_innerJSON){

    egg_group_detail_pokemon_species_inner_t *egg_group_detail_pokemon_species_inner_local_var = NULL;

    // egg_group_detail_pokemon_species_inner->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(egg_group_detail_pokemon_species_innerJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // egg_group_detail_pokemon_species_inner->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(egg_group_detail_pokemon_species_innerJSON, "url");
    if (cJSON_IsNull(url)) {
        url = NULL;
    }
    if (url) { 
    if(!cJSON_IsString(url) && !cJSON_IsNull(url))
    {
    goto end; //String
    }
    }


    egg_group_detail_pokemon_species_inner_local_var = egg_group_detail_pokemon_species_inner_create_internal (
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        url && !cJSON_IsNull(url) ? strdup(url->valuestring) : NULL
        );

    return egg_group_detail_pokemon_species_inner_local_var;
end:
    return NULL;

}
