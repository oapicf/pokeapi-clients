#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_sprites_other_showdown.h"



static pokemon_sprites_other_showdown_t *pokemon_sprites_other_showdown_create_internal(
    char *front_default,
    char *front_female,
    char *front_shiny,
    char *front_shiny_female,
    char *back_default,
    char *back_female,
    char *back_shiny,
    char *back_shiny_female
    ) {
    pokemon_sprites_other_showdown_t *pokemon_sprites_other_showdown_local_var = malloc(sizeof(pokemon_sprites_other_showdown_t));
    if (!pokemon_sprites_other_showdown_local_var) {
        return NULL;
    }
    memset(pokemon_sprites_other_showdown_local_var, 0, sizeof(pokemon_sprites_other_showdown_t));
    pokemon_sprites_other_showdown_local_var->_library_owned = 1;
    pokemon_sprites_other_showdown_local_var->front_default = front_default;
    pokemon_sprites_other_showdown_local_var->front_female = front_female;
    pokemon_sprites_other_showdown_local_var->front_shiny = front_shiny;
    pokemon_sprites_other_showdown_local_var->front_shiny_female = front_shiny_female;
    pokemon_sprites_other_showdown_local_var->back_default = back_default;
    pokemon_sprites_other_showdown_local_var->back_female = back_female;
    pokemon_sprites_other_showdown_local_var->back_shiny = back_shiny;
    pokemon_sprites_other_showdown_local_var->back_shiny_female = back_shiny_female;
    return pokemon_sprites_other_showdown_local_var;
}

__attribute__((deprecated)) pokemon_sprites_other_showdown_t *pokemon_sprites_other_showdown_create(
    char *front_default,
    char *front_female,
    char *front_shiny,
    char *front_shiny_female,
    char *back_default,
    char *back_female,
    char *back_shiny,
    char *back_shiny_female
    ) {
    pokemon_sprites_other_showdown_t *result = pokemon_sprites_other_showdown_create_internal (
        front_default,
        front_female,
        front_shiny,
        front_shiny_female,
        back_default,
        back_female,
        back_shiny,
        back_shiny_female
        );
    if (!result) {
    }
    return result;
}

void pokemon_sprites_other_showdown_free(pokemon_sprites_other_showdown_t *pokemon_sprites_other_showdown) {
    if(NULL == pokemon_sprites_other_showdown){
        return ;
    }
    if(pokemon_sprites_other_showdown->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_sprites_other_showdown_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_sprites_other_showdown->front_default) {
        free(pokemon_sprites_other_showdown->front_default);
        pokemon_sprites_other_showdown->front_default = NULL;
    }
    if (pokemon_sprites_other_showdown->front_female) {
        free(pokemon_sprites_other_showdown->front_female);
        pokemon_sprites_other_showdown->front_female = NULL;
    }
    if (pokemon_sprites_other_showdown->front_shiny) {
        free(pokemon_sprites_other_showdown->front_shiny);
        pokemon_sprites_other_showdown->front_shiny = NULL;
    }
    if (pokemon_sprites_other_showdown->front_shiny_female) {
        free(pokemon_sprites_other_showdown->front_shiny_female);
        pokemon_sprites_other_showdown->front_shiny_female = NULL;
    }
    if (pokemon_sprites_other_showdown->back_default) {
        free(pokemon_sprites_other_showdown->back_default);
        pokemon_sprites_other_showdown->back_default = NULL;
    }
    if (pokemon_sprites_other_showdown->back_female) {
        free(pokemon_sprites_other_showdown->back_female);
        pokemon_sprites_other_showdown->back_female = NULL;
    }
    if (pokemon_sprites_other_showdown->back_shiny) {
        free(pokemon_sprites_other_showdown->back_shiny);
        pokemon_sprites_other_showdown->back_shiny = NULL;
    }
    if (pokemon_sprites_other_showdown->back_shiny_female) {
        free(pokemon_sprites_other_showdown->back_shiny_female);
        pokemon_sprites_other_showdown->back_shiny_female = NULL;
    }
    free(pokemon_sprites_other_showdown);
}

cJSON *pokemon_sprites_other_showdown_convertToJSON(pokemon_sprites_other_showdown_t *pokemon_sprites_other_showdown) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_sprites_other_showdown->front_default
    if (!pokemon_sprites_other_showdown->front_default) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "front_default", pokemon_sprites_other_showdown->front_default) == NULL) {
    goto fail; //String
    }


    // pokemon_sprites_other_showdown->front_female
    if (!pokemon_sprites_other_showdown->front_female) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "front_female", pokemon_sprites_other_showdown->front_female) == NULL) {
    goto fail; //String
    }


    // pokemon_sprites_other_showdown->front_shiny
    if (!pokemon_sprites_other_showdown->front_shiny) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "front_shiny", pokemon_sprites_other_showdown->front_shiny) == NULL) {
    goto fail; //String
    }


    // pokemon_sprites_other_showdown->front_shiny_female
    if (!pokemon_sprites_other_showdown->front_shiny_female) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "front_shiny_female", pokemon_sprites_other_showdown->front_shiny_female) == NULL) {
    goto fail; //String
    }


    // pokemon_sprites_other_showdown->back_default
    if (!pokemon_sprites_other_showdown->back_default) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "back_default", pokemon_sprites_other_showdown->back_default) == NULL) {
    goto fail; //String
    }


    // pokemon_sprites_other_showdown->back_female
    if (!pokemon_sprites_other_showdown->back_female) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "back_female", pokemon_sprites_other_showdown->back_female) == NULL) {
    goto fail; //String
    }


    // pokemon_sprites_other_showdown->back_shiny
    if (!pokemon_sprites_other_showdown->back_shiny) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "back_shiny", pokemon_sprites_other_showdown->back_shiny) == NULL) {
    goto fail; //String
    }


    // pokemon_sprites_other_showdown->back_shiny_female
    if (!pokemon_sprites_other_showdown->back_shiny_female) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "back_shiny_female", pokemon_sprites_other_showdown->back_shiny_female) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_sprites_other_showdown_t *pokemon_sprites_other_showdown_parseFromJSON(cJSON *pokemon_sprites_other_showdownJSON){

    pokemon_sprites_other_showdown_t *pokemon_sprites_other_showdown_local_var = NULL;

    char *front_default_local_str = NULL;

    char *front_female_local_str = NULL;

    char *front_shiny_local_str = NULL;

    char *front_shiny_female_local_str = NULL;

    char *back_default_local_str = NULL;

    char *back_female_local_str = NULL;

    char *back_shiny_local_str = NULL;

    char *back_shiny_female_local_str = NULL;

    // pokemon_sprites_other_showdown->front_default
    cJSON *front_default = cJSON_GetObjectItemCaseSensitive(pokemon_sprites_other_showdownJSON, "front_default");
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

    // pokemon_sprites_other_showdown->front_female
    cJSON *front_female = cJSON_GetObjectItemCaseSensitive(pokemon_sprites_other_showdownJSON, "front_female");
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

    // pokemon_sprites_other_showdown->front_shiny
    cJSON *front_shiny = cJSON_GetObjectItemCaseSensitive(pokemon_sprites_other_showdownJSON, "front_shiny");
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

    // pokemon_sprites_other_showdown->front_shiny_female
    cJSON *front_shiny_female = cJSON_GetObjectItemCaseSensitive(pokemon_sprites_other_showdownJSON, "front_shiny_female");
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

    // pokemon_sprites_other_showdown->back_default
    cJSON *back_default = cJSON_GetObjectItemCaseSensitive(pokemon_sprites_other_showdownJSON, "back_default");
    if (cJSON_IsNull(back_default)) {
        back_default = NULL;
    }
    if (!back_default) {
        goto end;
    }

    
    if(!cJSON_IsString(back_default))
    {
    goto end; //String
    }

    // pokemon_sprites_other_showdown->back_female
    cJSON *back_female = cJSON_GetObjectItemCaseSensitive(pokemon_sprites_other_showdownJSON, "back_female");
    if (cJSON_IsNull(back_female)) {
        back_female = NULL;
    }
    if (!back_female) {
        goto end;
    }

    
    if(!cJSON_IsString(back_female))
    {
    goto end; //String
    }

    // pokemon_sprites_other_showdown->back_shiny
    cJSON *back_shiny = cJSON_GetObjectItemCaseSensitive(pokemon_sprites_other_showdownJSON, "back_shiny");
    if (cJSON_IsNull(back_shiny)) {
        back_shiny = NULL;
    }
    if (!back_shiny) {
        goto end;
    }

    
    if(!cJSON_IsString(back_shiny))
    {
    goto end; //String
    }

    // pokemon_sprites_other_showdown->back_shiny_female
    cJSON *back_shiny_female = cJSON_GetObjectItemCaseSensitive(pokemon_sprites_other_showdownJSON, "back_shiny_female");
    if (cJSON_IsNull(back_shiny_female)) {
        back_shiny_female = NULL;
    }
    if (!back_shiny_female) {
        goto end;
    }

    
    if(!cJSON_IsString(back_shiny_female))
    {
    goto end; //String
    }


    if (front_default && !cJSON_IsNull(front_default)) front_default_local_str = strdup(front_default->valuestring);
    if (front_female && !cJSON_IsNull(front_female)) front_female_local_str = strdup(front_female->valuestring);
    if (front_shiny && !cJSON_IsNull(front_shiny)) front_shiny_local_str = strdup(front_shiny->valuestring);
    if (front_shiny_female && !cJSON_IsNull(front_shiny_female)) front_shiny_female_local_str = strdup(front_shiny_female->valuestring);
    if (back_default && !cJSON_IsNull(back_default)) back_default_local_str = strdup(back_default->valuestring);
    if (back_female && !cJSON_IsNull(back_female)) back_female_local_str = strdup(back_female->valuestring);
    if (back_shiny && !cJSON_IsNull(back_shiny)) back_shiny_local_str = strdup(back_shiny->valuestring);
    if (back_shiny_female && !cJSON_IsNull(back_shiny_female)) back_shiny_female_local_str = strdup(back_shiny_female->valuestring);

    pokemon_sprites_other_showdown_local_var = pokemon_sprites_other_showdown_create_internal (
        front_default_local_str,
        front_female_local_str,
        front_shiny_local_str,
        front_shiny_female_local_str,
        back_default_local_str,
        back_female_local_str,
        back_shiny_local_str,
        back_shiny_female_local_str
        );

    if (!pokemon_sprites_other_showdown_local_var) {
        goto end;
    }

    return pokemon_sprites_other_showdown_local_var;
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
    if (back_default_local_str) {
        free(back_default_local_str);
        back_default_local_str = NULL;
    }
    if (back_female_local_str) {
        free(back_female_local_str);
        back_female_local_str = NULL;
    }
    if (back_shiny_local_str) {
        free(back_shiny_local_str);
        back_shiny_local_str = NULL;
    }
    if (back_shiny_female_local_str) {
        free(back_shiny_female_local_str);
        back_shiny_female_local_str = NULL;
    }
    return NULL;

}
