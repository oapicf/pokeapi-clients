#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_evolution_known_move.h"



static pokemon_evolution_known_move_t *pokemon_evolution_known_move_create_internal(
    char *name,
    char *url
    ) {
    pokemon_evolution_known_move_t *pokemon_evolution_known_move_local_var = malloc(sizeof(pokemon_evolution_known_move_t));
    if (!pokemon_evolution_known_move_local_var) {
        return NULL;
    }
    memset(pokemon_evolution_known_move_local_var, 0, sizeof(pokemon_evolution_known_move_t));
    pokemon_evolution_known_move_local_var->_library_owned = 1;
    pokemon_evolution_known_move_local_var->name = name;
    pokemon_evolution_known_move_local_var->url = url;
    return pokemon_evolution_known_move_local_var;
}

__attribute__((deprecated)) pokemon_evolution_known_move_t *pokemon_evolution_known_move_create(
    char *name,
    char *url
    ) {
    pokemon_evolution_known_move_t *result = pokemon_evolution_known_move_create_internal (
        name,
        url
        );
    if (!result) {
    }
    return result;
}

void pokemon_evolution_known_move_free(pokemon_evolution_known_move_t *pokemon_evolution_known_move) {
    if(NULL == pokemon_evolution_known_move){
        return ;
    }
    if(pokemon_evolution_known_move->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_evolution_known_move_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_evolution_known_move->name) {
        free(pokemon_evolution_known_move->name);
        pokemon_evolution_known_move->name = NULL;
    }
    if (pokemon_evolution_known_move->url) {
        free(pokemon_evolution_known_move->url);
        pokemon_evolution_known_move->url = NULL;
    }
    free(pokemon_evolution_known_move);
}

cJSON *pokemon_evolution_known_move_convertToJSON(pokemon_evolution_known_move_t *pokemon_evolution_known_move) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_evolution_known_move->name
    if (!pokemon_evolution_known_move->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", pokemon_evolution_known_move->name) == NULL) {
    goto fail; //String
    }


    // pokemon_evolution_known_move->url
    if (!pokemon_evolution_known_move->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", pokemon_evolution_known_move->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_evolution_known_move_t *pokemon_evolution_known_move_parseFromJSON(cJSON *pokemon_evolution_known_moveJSON){

    pokemon_evolution_known_move_t *pokemon_evolution_known_move_local_var = NULL;

    char *name_local_str = NULL;

    char *url_local_str = NULL;

    // pokemon_evolution_known_move->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(pokemon_evolution_known_moveJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // pokemon_evolution_known_move->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(pokemon_evolution_known_moveJSON, "url");
    if (cJSON_IsNull(url)) {
        url = NULL;
    }
    if (!url) {
        goto end;
    }

    
    if(!cJSON_IsString(url))
    {
    goto end; //String
    }


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (url && !cJSON_IsNull(url)) url_local_str = strdup(url->valuestring);

    pokemon_evolution_known_move_local_var = pokemon_evolution_known_move_create_internal (
        name_local_str,
        url_local_str
        );

    if (!pokemon_evolution_known_move_local_var) {
        goto end;
    }

    return pokemon_evolution_known_move_local_var;
end:
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (url_local_str) {
        free(url_local_str);
        url_local_str = NULL;
    }
    return NULL;

}
