#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_form_sprites.h"



static pokemon_form_sprites_t *pokemon_form_sprites_create_internal(
    char *front_default,
    char *front_shiny,
    char *front_female,
    char *front_shiny_female,
    char *back_default,
    char *back_shiny,
    char *back_female,
    char *back_shiny_female,
    pokemon_sprites_other_t *other,
    list_t* versions
    ) {
    pokemon_form_sprites_t *pokemon_form_sprites_local_var = malloc(sizeof(pokemon_form_sprites_t));
    if (!pokemon_form_sprites_local_var) {
        return NULL;
    }
    memset(pokemon_form_sprites_local_var, 0, sizeof(pokemon_form_sprites_t));
    pokemon_form_sprites_local_var->_library_owned = 1;
    pokemon_form_sprites_local_var->front_default = front_default;
    pokemon_form_sprites_local_var->front_shiny = front_shiny;
    pokemon_form_sprites_local_var->front_female = front_female;
    pokemon_form_sprites_local_var->front_shiny_female = front_shiny_female;
    pokemon_form_sprites_local_var->back_default = back_default;
    pokemon_form_sprites_local_var->back_shiny = back_shiny;
    pokemon_form_sprites_local_var->back_female = back_female;
    pokemon_form_sprites_local_var->back_shiny_female = back_shiny_female;
    pokemon_form_sprites_local_var->other = other;
    pokemon_form_sprites_local_var->versions = versions;
    return pokemon_form_sprites_local_var;
}

__attribute__((deprecated)) pokemon_form_sprites_t *pokemon_form_sprites_create(
    char *front_default,
    char *front_shiny,
    char *front_female,
    char *front_shiny_female,
    char *back_default,
    char *back_shiny,
    char *back_female,
    char *back_shiny_female,
    pokemon_sprites_other_t *other,
    list_t* versions
    ) {
    pokemon_form_sprites_t *result = pokemon_form_sprites_create_internal (
        front_default,
        front_shiny,
        front_female,
        front_shiny_female,
        back_default,
        back_shiny,
        back_female,
        back_shiny_female,
        other,
        versions
        );
    if (!result) {
    }
    return result;
}

void pokemon_form_sprites_free(pokemon_form_sprites_t *pokemon_form_sprites) {
    if(NULL == pokemon_form_sprites){
        return ;
    }
    if(pokemon_form_sprites->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_form_sprites_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_form_sprites->front_default) {
        free(pokemon_form_sprites->front_default);
        pokemon_form_sprites->front_default = NULL;
    }
    if (pokemon_form_sprites->front_shiny) {
        free(pokemon_form_sprites->front_shiny);
        pokemon_form_sprites->front_shiny = NULL;
    }
    if (pokemon_form_sprites->front_female) {
        free(pokemon_form_sprites->front_female);
        pokemon_form_sprites->front_female = NULL;
    }
    if (pokemon_form_sprites->front_shiny_female) {
        free(pokemon_form_sprites->front_shiny_female);
        pokemon_form_sprites->front_shiny_female = NULL;
    }
    if (pokemon_form_sprites->back_default) {
        free(pokemon_form_sprites->back_default);
        pokemon_form_sprites->back_default = NULL;
    }
    if (pokemon_form_sprites->back_shiny) {
        free(pokemon_form_sprites->back_shiny);
        pokemon_form_sprites->back_shiny = NULL;
    }
    if (pokemon_form_sprites->back_female) {
        free(pokemon_form_sprites->back_female);
        pokemon_form_sprites->back_female = NULL;
    }
    if (pokemon_form_sprites->back_shiny_female) {
        free(pokemon_form_sprites->back_shiny_female);
        pokemon_form_sprites->back_shiny_female = NULL;
    }
    if (pokemon_form_sprites->other) {
        pokemon_sprites_other_free(pokemon_form_sprites->other);
        pokemon_form_sprites->other = NULL;
    }
    if (pokemon_form_sprites->versions) {
        list_ForEach(listEntry, pokemon_form_sprites->versions) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(pokemon_form_sprites->versions);
        pokemon_form_sprites->versions = NULL;
    }
    free(pokemon_form_sprites);
}

cJSON *pokemon_form_sprites_convertToJSON(pokemon_form_sprites_t *pokemon_form_sprites) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_form_sprites->front_default
    if (!pokemon_form_sprites->front_default) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "front_default", pokemon_form_sprites->front_default) == NULL) {
    goto fail; //String
    }


    // pokemon_form_sprites->front_shiny
    if (!pokemon_form_sprites->front_shiny) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "front_shiny", pokemon_form_sprites->front_shiny) == NULL) {
    goto fail; //String
    }


    // pokemon_form_sprites->front_female
    if (!pokemon_form_sprites->front_female) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "front_female", pokemon_form_sprites->front_female) == NULL) {
    goto fail; //String
    }


    // pokemon_form_sprites->front_shiny_female
    if (!pokemon_form_sprites->front_shiny_female) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "front_shiny_female", pokemon_form_sprites->front_shiny_female) == NULL) {
    goto fail; //String
    }


    // pokemon_form_sprites->back_default
    if (!pokemon_form_sprites->back_default) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "back_default", pokemon_form_sprites->back_default) == NULL) {
    goto fail; //String
    }


    // pokemon_form_sprites->back_shiny
    if (!pokemon_form_sprites->back_shiny) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "back_shiny", pokemon_form_sprites->back_shiny) == NULL) {
    goto fail; //String
    }


    // pokemon_form_sprites->back_female
    if (!pokemon_form_sprites->back_female) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "back_female", pokemon_form_sprites->back_female) == NULL) {
    goto fail; //String
    }


    // pokemon_form_sprites->back_shiny_female
    if (!pokemon_form_sprites->back_shiny_female) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "back_shiny_female", pokemon_form_sprites->back_shiny_female) == NULL) {
    goto fail; //String
    }


    // pokemon_form_sprites->other
    if(pokemon_form_sprites->other) {
    cJSON *other_local_JSON = pokemon_sprites_other_convertToJSON(pokemon_form_sprites->other);
    if(other_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "other", other_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // pokemon_form_sprites->versions
    if(pokemon_form_sprites->versions) {
    cJSON *versions = cJSON_AddObjectToObject(item, "versions");
    if(versions == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = versions;
    listEntry_t *versionsListEntry;
    if (pokemon_form_sprites->versions) {
    list_ForEach(versionsListEntry, pokemon_form_sprites->versions) {
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

pokemon_form_sprites_t *pokemon_form_sprites_parseFromJSON(cJSON *pokemon_form_spritesJSON){

    pokemon_form_sprites_t *pokemon_form_sprites_local_var = NULL;

    char *front_default_local_str = NULL;

    char *front_shiny_local_str = NULL;

    char *front_female_local_str = NULL;

    char *front_shiny_female_local_str = NULL;

    char *back_default_local_str = NULL;

    char *back_shiny_local_str = NULL;

    char *back_female_local_str = NULL;

    char *back_shiny_female_local_str = NULL;

    // define the local variable for pokemon_form_sprites->other
    pokemon_sprites_other_t *other_local_nonprim = NULL;

    // define the local map for pokemon_form_sprites->versions
    list_t *versionsList = NULL;

    // pokemon_form_sprites->front_default
    cJSON *front_default = cJSON_GetObjectItemCaseSensitive(pokemon_form_spritesJSON, "front_default");
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

    // pokemon_form_sprites->front_shiny
    cJSON *front_shiny = cJSON_GetObjectItemCaseSensitive(pokemon_form_spritesJSON, "front_shiny");
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

    // pokemon_form_sprites->front_female
    cJSON *front_female = cJSON_GetObjectItemCaseSensitive(pokemon_form_spritesJSON, "front_female");
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

    // pokemon_form_sprites->front_shiny_female
    cJSON *front_shiny_female = cJSON_GetObjectItemCaseSensitive(pokemon_form_spritesJSON, "front_shiny_female");
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

    // pokemon_form_sprites->back_default
    cJSON *back_default = cJSON_GetObjectItemCaseSensitive(pokemon_form_spritesJSON, "back_default");
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

    // pokemon_form_sprites->back_shiny
    cJSON *back_shiny = cJSON_GetObjectItemCaseSensitive(pokemon_form_spritesJSON, "back_shiny");
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

    // pokemon_form_sprites->back_female
    cJSON *back_female = cJSON_GetObjectItemCaseSensitive(pokemon_form_spritesJSON, "back_female");
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

    // pokemon_form_sprites->back_shiny_female
    cJSON *back_shiny_female = cJSON_GetObjectItemCaseSensitive(pokemon_form_spritesJSON, "back_shiny_female");
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

    // pokemon_form_sprites->other
    cJSON *other = cJSON_GetObjectItemCaseSensitive(pokemon_form_spritesJSON, "other");
    if (cJSON_IsNull(other)) {
        other = NULL;
    }
    if (other) { 
    other_local_nonprim = pokemon_sprites_other_parseFromJSON(other); //nonprimitive
    }

    // pokemon_form_sprites->versions
    cJSON *versions = cJSON_GetObjectItemCaseSensitive(pokemon_form_spritesJSON, "versions");
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
    if (front_female && !cJSON_IsNull(front_female)) front_female_local_str = strdup(front_female->valuestring);
    if (front_shiny_female && !cJSON_IsNull(front_shiny_female)) front_shiny_female_local_str = strdup(front_shiny_female->valuestring);
    if (back_default && !cJSON_IsNull(back_default)) back_default_local_str = strdup(back_default->valuestring);
    if (back_shiny && !cJSON_IsNull(back_shiny)) back_shiny_local_str = strdup(back_shiny->valuestring);
    if (back_female && !cJSON_IsNull(back_female)) back_female_local_str = strdup(back_female->valuestring);
    if (back_shiny_female && !cJSON_IsNull(back_shiny_female)) back_shiny_female_local_str = strdup(back_shiny_female->valuestring);

    pokemon_form_sprites_local_var = pokemon_form_sprites_create_internal (
        front_default_local_str,
        front_shiny_local_str,
        front_female_local_str,
        front_shiny_female_local_str,
        back_default_local_str,
        back_shiny_local_str,
        back_female_local_str,
        back_shiny_female_local_str,
        other ? other_local_nonprim : NULL,
        versions ? versionsList : NULL
        );

    if (!pokemon_form_sprites_local_var) {
        goto end;
    }

    return pokemon_form_sprites_local_var;
end:
    if (front_default_local_str) {
        free(front_default_local_str);
        front_default_local_str = NULL;
    }
    if (front_shiny_local_str) {
        free(front_shiny_local_str);
        front_shiny_local_str = NULL;
    }
    if (front_female_local_str) {
        free(front_female_local_str);
        front_female_local_str = NULL;
    }
    if (front_shiny_female_local_str) {
        free(front_shiny_female_local_str);
        front_shiny_female_local_str = NULL;
    }
    if (back_default_local_str) {
        free(back_default_local_str);
        back_default_local_str = NULL;
    }
    if (back_shiny_local_str) {
        free(back_shiny_local_str);
        back_shiny_local_str = NULL;
    }
    if (back_female_local_str) {
        free(back_female_local_str);
        back_female_local_str = NULL;
    }
    if (back_shiny_female_local_str) {
        free(back_shiny_female_local_str);
        back_shiny_female_local_str = NULL;
    }
    if (other_local_nonprim) {
        pokemon_sprites_other_free(other_local_nonprim);
        other_local_nonprim = NULL;
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
