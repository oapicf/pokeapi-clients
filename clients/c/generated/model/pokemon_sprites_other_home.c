#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_sprites_other_home.h"



static pokemon_sprites_other_home_t *pokemon_sprites_other_home_create_internal(
    char *front_default,
    char *front_female,
    char *front_shiny,
    char *front_shiny_female
    ) {
    pokemon_sprites_other_home_t *pokemon_sprites_other_home_local_var = malloc(sizeof(pokemon_sprites_other_home_t));
    if (!pokemon_sprites_other_home_local_var) {
        return NULL;
    }
    memset(pokemon_sprites_other_home_local_var, 0, sizeof(pokemon_sprites_other_home_t));
    pokemon_sprites_other_home_local_var->_library_owned = 1;
    pokemon_sprites_other_home_local_var->front_default = front_default;
    pokemon_sprites_other_home_local_var->front_female = front_female;
    pokemon_sprites_other_home_local_var->front_shiny = front_shiny;
    pokemon_sprites_other_home_local_var->front_shiny_female = front_shiny_female;
    return pokemon_sprites_other_home_local_var;
}

__attribute__((deprecated)) pokemon_sprites_other_home_t *pokemon_sprites_other_home_create(
    char *front_default,
    char *front_female,
    char *front_shiny,
    char *front_shiny_female
    ) {
    pokemon_sprites_other_home_t *result = pokemon_sprites_other_home_create_internal (
        front_default,
        front_female,
        front_shiny,
        front_shiny_female
        );
    if (!result) {
    }
    return result;
}

void pokemon_sprites_other_home_free(pokemon_sprites_other_home_t *pokemon_sprites_other_home) {
    if(NULL == pokemon_sprites_other_home){
        return ;
    }
    if(pokemon_sprites_other_home->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_sprites_other_home_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_sprites_other_home->front_default) {
        free(pokemon_sprites_other_home->front_default);
        pokemon_sprites_other_home->front_default = NULL;
    }
    if (pokemon_sprites_other_home->front_female) {
        free(pokemon_sprites_other_home->front_female);
        pokemon_sprites_other_home->front_female = NULL;
    }
    if (pokemon_sprites_other_home->front_shiny) {
        free(pokemon_sprites_other_home->front_shiny);
        pokemon_sprites_other_home->front_shiny = NULL;
    }
    if (pokemon_sprites_other_home->front_shiny_female) {
        free(pokemon_sprites_other_home->front_shiny_female);
        pokemon_sprites_other_home->front_shiny_female = NULL;
    }
    free(pokemon_sprites_other_home);
}

cJSON *pokemon_sprites_other_home_convertToJSON(pokemon_sprites_other_home_t *pokemon_sprites_other_home) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_sprites_other_home->front_default
    if (!pokemon_sprites_other_home->front_default) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "front_default", pokemon_sprites_other_home->front_default) == NULL) {
    goto fail; //String
    }


    // pokemon_sprites_other_home->front_female
    if (!pokemon_sprites_other_home->front_female) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "front_female", pokemon_sprites_other_home->front_female) == NULL) {
    goto fail; //String
    }


    // pokemon_sprites_other_home->front_shiny
    if (!pokemon_sprites_other_home->front_shiny) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "front_shiny", pokemon_sprites_other_home->front_shiny) == NULL) {
    goto fail; //String
    }


    // pokemon_sprites_other_home->front_shiny_female
    if (!pokemon_sprites_other_home->front_shiny_female) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "front_shiny_female", pokemon_sprites_other_home->front_shiny_female) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_sprites_other_home_t *pokemon_sprites_other_home_parseFromJSON(cJSON *pokemon_sprites_other_homeJSON){

    pokemon_sprites_other_home_t *pokemon_sprites_other_home_local_var = NULL;

    char *front_default_local_str = NULL;

    char *front_female_local_str = NULL;

    char *front_shiny_local_str = NULL;

    char *front_shiny_female_local_str = NULL;

    // pokemon_sprites_other_home->front_default
    cJSON *front_default = cJSON_GetObjectItemCaseSensitive(pokemon_sprites_other_homeJSON, "front_default");
    if (cJSON_IsNull(front_default)) {
        front_default = NULL;
    }
    if (!front_default) {
        goto end;
    }

    
    if(!cJSON_IsString(front_default))
    {
    goto end; //String
    }

    // pokemon_sprites_other_home->front_female
    cJSON *front_female = cJSON_GetObjectItemCaseSensitive(pokemon_sprites_other_homeJSON, "front_female");
    if (cJSON_IsNull(front_female)) {
        front_female = NULL;
    }
    if (!front_female) {
        goto end;
    }

    
    if(!cJSON_IsString(front_female))
    {
    goto end; //String
    }

    // pokemon_sprites_other_home->front_shiny
    cJSON *front_shiny = cJSON_GetObjectItemCaseSensitive(pokemon_sprites_other_homeJSON, "front_shiny");
    if (cJSON_IsNull(front_shiny)) {
        front_shiny = NULL;
    }
    if (!front_shiny) {
        goto end;
    }

    
    if(!cJSON_IsString(front_shiny))
    {
    goto end; //String
    }

    // pokemon_sprites_other_home->front_shiny_female
    cJSON *front_shiny_female = cJSON_GetObjectItemCaseSensitive(pokemon_sprites_other_homeJSON, "front_shiny_female");
    if (cJSON_IsNull(front_shiny_female)) {
        front_shiny_female = NULL;
    }
    if (!front_shiny_female) {
        goto end;
    }

    
    if(!cJSON_IsString(front_shiny_female))
    {
    goto end; //String
    }


    if (front_default && !cJSON_IsNull(front_default)) front_default_local_str = strdup(front_default->valuestring);
    if (front_female && !cJSON_IsNull(front_female)) front_female_local_str = strdup(front_female->valuestring);
    if (front_shiny && !cJSON_IsNull(front_shiny)) front_shiny_local_str = strdup(front_shiny->valuestring);
    if (front_shiny_female && !cJSON_IsNull(front_shiny_female)) front_shiny_female_local_str = strdup(front_shiny_female->valuestring);

    pokemon_sprites_other_home_local_var = pokemon_sprites_other_home_create_internal (
        front_default_local_str,
        front_female_local_str,
        front_shiny_local_str,
        front_shiny_female_local_str
        );

    if (!pokemon_sprites_other_home_local_var) {
        goto end;
    }

    return pokemon_sprites_other_home_local_var;
end:
    if (front_default_local_str) {
        free(front_default_local_str);
        front_default_local_str = NULL;
    }
    if (front_female_local_str) {
        free(front_female_local_str);
        front_female_local_str = NULL;
    }
    if (front_shiny_local_str) {
        free(front_shiny_local_str);
        front_shiny_local_str = NULL;
    }
    if (front_shiny_female_local_str) {
        free(front_shiny_female_local_str);
        front_shiny_female_local_str = NULL;
    }
    return NULL;

}
