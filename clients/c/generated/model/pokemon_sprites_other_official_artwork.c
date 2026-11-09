#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_sprites_other_official_artwork.h"



static pokemon_sprites_other_official_artwork_t *pokemon_sprites_other_official_artwork_create_internal(
    char *front_default,
    char *front_shiny,
    list_t* versions
    ) {
    pokemon_sprites_other_official_artwork_t *pokemon_sprites_other_official_artwork_local_var = malloc(sizeof(pokemon_sprites_other_official_artwork_t));
    if (!pokemon_sprites_other_official_artwork_local_var) {
        return NULL;
    }
    memset(pokemon_sprites_other_official_artwork_local_var, 0, sizeof(pokemon_sprites_other_official_artwork_t));
    pokemon_sprites_other_official_artwork_local_var->_library_owned = 1;
    pokemon_sprites_other_official_artwork_local_var->front_default = front_default;
    pokemon_sprites_other_official_artwork_local_var->front_shiny = front_shiny;
    pokemon_sprites_other_official_artwork_local_var->versions = versions;
    return pokemon_sprites_other_official_artwork_local_var;
}

__attribute__((deprecated)) pokemon_sprites_other_official_artwork_t *pokemon_sprites_other_official_artwork_create(
    char *front_default,
    char *front_shiny,
    list_t* versions
    ) {
    pokemon_sprites_other_official_artwork_t *result = pokemon_sprites_other_official_artwork_create_internal (
        front_default,
        front_shiny,
        versions
        );
    if (!result) {
    }
    return result;
}

void pokemon_sprites_other_official_artwork_free(pokemon_sprites_other_official_artwork_t *pokemon_sprites_other_official_artwork) {
    if(NULL == pokemon_sprites_other_official_artwork){
        return ;
    }
    if(pokemon_sprites_other_official_artwork->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_sprites_other_official_artwork_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_sprites_other_official_artwork->front_default) {
        free(pokemon_sprites_other_official_artwork->front_default);
        pokemon_sprites_other_official_artwork->front_default = NULL;
    }
    if (pokemon_sprites_other_official_artwork->front_shiny) {
        free(pokemon_sprites_other_official_artwork->front_shiny);
        pokemon_sprites_other_official_artwork->front_shiny = NULL;
    }
    if (pokemon_sprites_other_official_artwork->versions) {
        list_ForEach(listEntry, pokemon_sprites_other_official_artwork->versions) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(pokemon_sprites_other_official_artwork->versions);
        pokemon_sprites_other_official_artwork->versions = NULL;
    }
    free(pokemon_sprites_other_official_artwork);
}

cJSON *pokemon_sprites_other_official_artwork_convertToJSON(pokemon_sprites_other_official_artwork_t *pokemon_sprites_other_official_artwork) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_sprites_other_official_artwork->front_default
    if (!pokemon_sprites_other_official_artwork->front_default) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "front_default", pokemon_sprites_other_official_artwork->front_default) == NULL) {
    goto fail; //String
    }


    // pokemon_sprites_other_official_artwork->front_shiny
    if (!pokemon_sprites_other_official_artwork->front_shiny) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "front_shiny", pokemon_sprites_other_official_artwork->front_shiny) == NULL) {
    goto fail; //String
    }


    // pokemon_sprites_other_official_artwork->versions
    if(pokemon_sprites_other_official_artwork->versions) {
    cJSON *versions = cJSON_AddObjectToObject(item, "versions");
    if(versions == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = versions;
    listEntry_t *versionsListEntry;
    if (pokemon_sprites_other_official_artwork->versions) {
    list_ForEach(versionsListEntry, pokemon_sprites_other_official_artwork->versions) {
        keyValuePair_t *localKeyValue = versionsListEntry->data;
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_sprites_other_official_artwork_t *pokemon_sprites_other_official_artwork_parseFromJSON(cJSON *pokemon_sprites_other_official_artworkJSON){

    pokemon_sprites_other_official_artwork_t *pokemon_sprites_other_official_artwork_local_var = NULL;

    char *front_default_local_str = NULL;

    char *front_shiny_local_str = NULL;

    // define the local map for pokemon_sprites_other_official_artwork->versions
    list_t *versionsList = NULL;

    // pokemon_sprites_other_official_artwork->front_default
    cJSON *front_default = cJSON_GetObjectItemCaseSensitive(pokemon_sprites_other_official_artworkJSON, "front_default");
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

    // pokemon_sprites_other_official_artwork->front_shiny
    cJSON *front_shiny = cJSON_GetObjectItemCaseSensitive(pokemon_sprites_other_official_artworkJSON, "front_shiny");
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

    // pokemon_sprites_other_official_artwork->versions
    cJSON *versions = cJSON_GetObjectItemCaseSensitive(pokemon_sprites_other_official_artworkJSON, "versions");
    if (cJSON_IsNull(versions)) {
        versions = NULL;
    }
    if (versions) { 
    cJSON *versions_local_map = NULL;
    if(!cJSON_IsObject(versions) && !cJSON_IsNull(versions))
    {
        goto end;//primitive map container
    }
    if(cJSON_IsObject(versions))
    {
        versionsList = list_createList();
        keyValuePair_t *localMapKeyPair;
        cJSON_ArrayForEach(versions_local_map, versions)
        {
            cJSON *localMapObject = versions_local_map;
            list_addElement(versionsList , localMapKeyPair);
        }
    }
    }


    if (front_default && !cJSON_IsNull(front_default)) front_default_local_str = strdup(front_default->valuestring);
    if (front_shiny && !cJSON_IsNull(front_shiny)) front_shiny_local_str = strdup(front_shiny->valuestring);

    pokemon_sprites_other_official_artwork_local_var = pokemon_sprites_other_official_artwork_create_internal (
        front_default_local_str,
        front_shiny_local_str,
        versions ? versionsList : NULL
        );

    if (!pokemon_sprites_other_official_artwork_local_var) {
        goto end;
    }

    return pokemon_sprites_other_official_artwork_local_var;
end:
    if (front_default_local_str) {
        free(front_default_local_str);
        front_default_local_str = NULL;
    }
    if (front_shiny_local_str) {
        free(front_shiny_local_str);
        front_shiny_local_str = NULL;
    }
    if (versionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, versionsList) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free(localKeyValue->key);
            localKeyValue->key = NULL;
            keyValuePair_free(localKeyValue);
            localKeyValue = NULL;
        }
        list_freeList(versionsList);
        versionsList = NULL;
    }
    return NULL;

}
