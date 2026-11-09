#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_sprites_other_dream_world.h"



static pokemon_sprites_other_dream_world_t *pokemon_sprites_other_dream_world_create_internal(
    char *front_default,
    char *front_female
    ) {
    pokemon_sprites_other_dream_world_t *pokemon_sprites_other_dream_world_local_var = malloc(sizeof(pokemon_sprites_other_dream_world_t));
    if (!pokemon_sprites_other_dream_world_local_var) {
        return NULL;
    }
    memset(pokemon_sprites_other_dream_world_local_var, 0, sizeof(pokemon_sprites_other_dream_world_t));
    pokemon_sprites_other_dream_world_local_var->_library_owned = 1;
    pokemon_sprites_other_dream_world_local_var->front_default = front_default;
    pokemon_sprites_other_dream_world_local_var->front_female = front_female;
    return pokemon_sprites_other_dream_world_local_var;
}

__attribute__((deprecated)) pokemon_sprites_other_dream_world_t *pokemon_sprites_other_dream_world_create(
    char *front_default,
    char *front_female
    ) {
    pokemon_sprites_other_dream_world_t *result = pokemon_sprites_other_dream_world_create_internal (
        front_default,
        front_female
        );
    if (!result) {
    }
    return result;
}

void pokemon_sprites_other_dream_world_free(pokemon_sprites_other_dream_world_t *pokemon_sprites_other_dream_world) {
    if(NULL == pokemon_sprites_other_dream_world){
        return ;
    }
    if(pokemon_sprites_other_dream_world->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_sprites_other_dream_world_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_sprites_other_dream_world->front_default) {
        free(pokemon_sprites_other_dream_world->front_default);
        pokemon_sprites_other_dream_world->front_default = NULL;
    }
    if (pokemon_sprites_other_dream_world->front_female) {
        free(pokemon_sprites_other_dream_world->front_female);
        pokemon_sprites_other_dream_world->front_female = NULL;
    }
    free(pokemon_sprites_other_dream_world);
}

cJSON *pokemon_sprites_other_dream_world_convertToJSON(pokemon_sprites_other_dream_world_t *pokemon_sprites_other_dream_world) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_sprites_other_dream_world->front_default
    if (!pokemon_sprites_other_dream_world->front_default) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "front_default", pokemon_sprites_other_dream_world->front_default) == NULL) {
    goto fail; //String
    }


    // pokemon_sprites_other_dream_world->front_female
    if (!pokemon_sprites_other_dream_world->front_female) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "front_female", pokemon_sprites_other_dream_world->front_female) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_sprites_other_dream_world_t *pokemon_sprites_other_dream_world_parseFromJSON(cJSON *pokemon_sprites_other_dream_worldJSON){

    pokemon_sprites_other_dream_world_t *pokemon_sprites_other_dream_world_local_var = NULL;

    char *front_default_local_str = NULL;

    char *front_female_local_str = NULL;

    // pokemon_sprites_other_dream_world->front_default
    cJSON *front_default = cJSON_GetObjectItemCaseSensitive(pokemon_sprites_other_dream_worldJSON, "front_default");
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

    // pokemon_sprites_other_dream_world->front_female
    cJSON *front_female = cJSON_GetObjectItemCaseSensitive(pokemon_sprites_other_dream_worldJSON, "front_female");
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


    if (front_default && !cJSON_IsNull(front_default)) front_default_local_str = strdup(front_default->valuestring);
    if (front_female && !cJSON_IsNull(front_female)) front_female_local_str = strdup(front_female->valuestring);

    pokemon_sprites_other_dream_world_local_var = pokemon_sprites_other_dream_world_create_internal (
        front_default_local_str,
        front_female_local_str
        );

    if (!pokemon_sprites_other_dream_world_local_var) {
        goto end;
    }

    return pokemon_sprites_other_dream_world_local_var;
end:
    if (front_default_local_str) {
        free(front_default_local_str);
        front_default_local_str = NULL;
    }
    if (front_female_local_str) {
        free(front_female_local_str);
        front_female_local_str = NULL;
    }
    return NULL;

}
