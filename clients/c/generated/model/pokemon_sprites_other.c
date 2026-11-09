#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_sprites_other.h"



static pokemon_sprites_other_t *pokemon_sprites_other_create_internal(
    pokemon_sprites_other_dream_world_t *dream_world,
    pokemon_sprites_other_home_t *home,
    pokemon_sprites_other_showdown_t *showdown,
    pokemon_sprites_other_official_artwork_t *official_artwork
    ) {
    pokemon_sprites_other_t *pokemon_sprites_other_local_var = malloc(sizeof(pokemon_sprites_other_t));
    if (!pokemon_sprites_other_local_var) {
        return NULL;
    }
    memset(pokemon_sprites_other_local_var, 0, sizeof(pokemon_sprites_other_t));
    pokemon_sprites_other_local_var->_library_owned = 1;
    pokemon_sprites_other_local_var->dream_world = dream_world;
    pokemon_sprites_other_local_var->home = home;
    pokemon_sprites_other_local_var->showdown = showdown;
    pokemon_sprites_other_local_var->official_artwork = official_artwork;
    return pokemon_sprites_other_local_var;
}

__attribute__((deprecated)) pokemon_sprites_other_t *pokemon_sprites_other_create(
    pokemon_sprites_other_dream_world_t *dream_world,
    pokemon_sprites_other_home_t *home,
    pokemon_sprites_other_showdown_t *showdown,
    pokemon_sprites_other_official_artwork_t *official_artwork
    ) {
    pokemon_sprites_other_t *result = pokemon_sprites_other_create_internal (
        dream_world,
        home,
        showdown,
        official_artwork
        );
    if (!result) {
    }
    return result;
}

void pokemon_sprites_other_free(pokemon_sprites_other_t *pokemon_sprites_other) {
    if(NULL == pokemon_sprites_other){
        return ;
    }
    if(pokemon_sprites_other->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_sprites_other_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_sprites_other->dream_world) {
        pokemon_sprites_other_dream_world_free(pokemon_sprites_other->dream_world);
        pokemon_sprites_other->dream_world = NULL;
    }
    if (pokemon_sprites_other->home) {
        pokemon_sprites_other_home_free(pokemon_sprites_other->home);
        pokemon_sprites_other->home = NULL;
    }
    if (pokemon_sprites_other->showdown) {
        pokemon_sprites_other_showdown_free(pokemon_sprites_other->showdown);
        pokemon_sprites_other->showdown = NULL;
    }
    if (pokemon_sprites_other->official_artwork) {
        pokemon_sprites_other_official_artwork_free(pokemon_sprites_other->official_artwork);
        pokemon_sprites_other->official_artwork = NULL;
    }
    free(pokemon_sprites_other);
}

cJSON *pokemon_sprites_other_convertToJSON(pokemon_sprites_other_t *pokemon_sprites_other) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_sprites_other->dream_world
    if(pokemon_sprites_other->dream_world) {
    cJSON *dream_world_local_JSON = pokemon_sprites_other_dream_world_convertToJSON(pokemon_sprites_other->dream_world);
    if(dream_world_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dream_world", dream_world_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // pokemon_sprites_other->home
    if(pokemon_sprites_other->home) {
    cJSON *home_local_JSON = pokemon_sprites_other_home_convertToJSON(pokemon_sprites_other->home);
    if(home_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "home", home_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // pokemon_sprites_other->showdown
    if(pokemon_sprites_other->showdown) {
    cJSON *showdown_local_JSON = pokemon_sprites_other_showdown_convertToJSON(pokemon_sprites_other->showdown);
    if(showdown_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "showdown", showdown_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // pokemon_sprites_other->official_artwork
    if(pokemon_sprites_other->official_artwork) {
    cJSON *official_artwork_local_JSON = pokemon_sprites_other_official_artwork_convertToJSON(pokemon_sprites_other->official_artwork);
    if(official_artwork_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "official-artwork", official_artwork_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_sprites_other_t *pokemon_sprites_other_parseFromJSON(cJSON *pokemon_sprites_otherJSON){

    pokemon_sprites_other_t *pokemon_sprites_other_local_var = NULL;

    // define the local variable for pokemon_sprites_other->dream_world
    pokemon_sprites_other_dream_world_t *dream_world_local_nonprim = NULL;

    // define the local variable for pokemon_sprites_other->home
    pokemon_sprites_other_home_t *home_local_nonprim = NULL;

    // define the local variable for pokemon_sprites_other->showdown
    pokemon_sprites_other_showdown_t *showdown_local_nonprim = NULL;

    // define the local variable for pokemon_sprites_other->official_artwork
    pokemon_sprites_other_official_artwork_t *official_artwork_local_nonprim = NULL;

    // pokemon_sprites_other->dream_world
    cJSON *dream_world = cJSON_GetObjectItemCaseSensitive(pokemon_sprites_otherJSON, "dream_world");
    if (cJSON_IsNull(dream_world)) {
        dream_world = NULL;
    }
    if (dream_world) { 
    dream_world_local_nonprim = pokemon_sprites_other_dream_world_parseFromJSON(dream_world); //nonprimitive
    }

    // pokemon_sprites_other->home
    cJSON *home = cJSON_GetObjectItemCaseSensitive(pokemon_sprites_otherJSON, "home");
    if (cJSON_IsNull(home)) {
        home = NULL;
    }
    if (home) { 
    home_local_nonprim = pokemon_sprites_other_home_parseFromJSON(home); //nonprimitive
    }

    // pokemon_sprites_other->showdown
    cJSON *showdown = cJSON_GetObjectItemCaseSensitive(pokemon_sprites_otherJSON, "showdown");
    if (cJSON_IsNull(showdown)) {
        showdown = NULL;
    }
    if (showdown) { 
    showdown_local_nonprim = pokemon_sprites_other_showdown_parseFromJSON(showdown); //nonprimitive
    }

    // pokemon_sprites_other->official_artwork
    cJSON *official_artwork = cJSON_GetObjectItemCaseSensitive(pokemon_sprites_otherJSON, "official-artwork");
    if (cJSON_IsNull(official_artwork)) {
        official_artwork = NULL;
    }
    if (official_artwork) { 
    official_artwork_local_nonprim = pokemon_sprites_other_official_artwork_parseFromJSON(official_artwork); //nonprimitive
    }



    pokemon_sprites_other_local_var = pokemon_sprites_other_create_internal (
        dream_world ? dream_world_local_nonprim : NULL,
        home ? home_local_nonprim : NULL,
        showdown ? showdown_local_nonprim : NULL,
        official_artwork ? official_artwork_local_nonprim : NULL
        );

    if (!pokemon_sprites_other_local_var) {
        goto end;
    }

    return pokemon_sprites_other_local_var;
end:
    if (dream_world_local_nonprim) {
        pokemon_sprites_other_dream_world_free(dream_world_local_nonprim);
        dream_world_local_nonprim = NULL;
    }
    if (home_local_nonprim) {
        pokemon_sprites_other_home_free(home_local_nonprim);
        home_local_nonprim = NULL;
    }
    if (showdown_local_nonprim) {
        pokemon_sprites_other_showdown_free(showdown_local_nonprim);
        showdown_local_nonprim = NULL;
    }
    if (official_artwork_local_nonprim) {
        pokemon_sprites_other_official_artwork_free(official_artwork_local_nonprim);
        official_artwork_local_nonprim = NULL;
    }
    return NULL;

}
