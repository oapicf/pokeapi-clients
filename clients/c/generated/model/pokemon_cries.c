#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_cries.h"



static pokemon_cries_t *pokemon_cries_create_internal(
    char *latest,
    char *legacy
    ) {
    pokemon_cries_t *pokemon_cries_local_var = malloc(sizeof(pokemon_cries_t));
    if (!pokemon_cries_local_var) {
        return NULL;
    }
    memset(pokemon_cries_local_var, 0, sizeof(pokemon_cries_t));
    pokemon_cries_local_var->_library_owned = 1;
    pokemon_cries_local_var->latest = latest;
    pokemon_cries_local_var->legacy = legacy;
    return pokemon_cries_local_var;
}

__attribute__((deprecated)) pokemon_cries_t *pokemon_cries_create(
    char *latest,
    char *legacy
    ) {
    pokemon_cries_t *result = pokemon_cries_create_internal (
        latest,
        legacy
        );
    if (!result) {
    }
    return result;
}

void pokemon_cries_free(pokemon_cries_t *pokemon_cries) {
    if(NULL == pokemon_cries){
        return ;
    }
    if(pokemon_cries->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_cries_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_cries->latest) {
        free(pokemon_cries->latest);
        pokemon_cries->latest = NULL;
    }
    if (pokemon_cries->legacy) {
        free(pokemon_cries->legacy);
        pokemon_cries->legacy = NULL;
    }
    free(pokemon_cries);
}

cJSON *pokemon_cries_convertToJSON(pokemon_cries_t *pokemon_cries) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_cries->latest
    if (!pokemon_cries->latest) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "latest", pokemon_cries->latest) == NULL) {
    goto fail; //String
    }


    // pokemon_cries->legacy
    if (!pokemon_cries->legacy) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "legacy", pokemon_cries->legacy) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_cries_t *pokemon_cries_parseFromJSON(cJSON *pokemon_criesJSON){

    pokemon_cries_t *pokemon_cries_local_var = NULL;

    char *latest_local_str = NULL;

    char *legacy_local_str = NULL;

    // pokemon_cries->latest
    cJSON *latest = cJSON_GetObjectItemCaseSensitive(pokemon_criesJSON, "latest");
    if (cJSON_IsNull(latest)) {
        latest = NULL;
    }
    if (!latest) {
        goto end;
    }

    
    if(!cJSON_IsString(latest))
    {
    goto end; //String
    }

    // pokemon_cries->legacy
    cJSON *legacy = cJSON_GetObjectItemCaseSensitive(pokemon_criesJSON, "legacy");
    if (cJSON_IsNull(legacy)) {
        legacy = NULL;
    }
    if (!legacy) {
        goto end;
    }

    
    if(!cJSON_IsString(legacy))
    {
    goto end; //String
    }


    if (latest && !cJSON_IsNull(latest)) latest_local_str = strdup(latest->valuestring);
    if (legacy && !cJSON_IsNull(legacy)) legacy_local_str = strdup(legacy->valuestring);

    pokemon_cries_local_var = pokemon_cries_create_internal (
        latest_local_str,
        legacy_local_str
        );

    if (!pokemon_cries_local_var) {
        goto end;
    }

    return pokemon_cries_local_var;
end:
    if (latest_local_str) {
        free(latest_local_str);
        latest_local_str = NULL;
    }
    if (legacy_local_str) {
        free(legacy_local_str);
        legacy_local_str = NULL;
    }
    return NULL;

}
