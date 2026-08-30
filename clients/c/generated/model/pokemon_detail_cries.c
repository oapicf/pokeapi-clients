#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_detail_cries.h"



static pokemon_detail_cries_t *pokemon_detail_cries_create_internal(
    char *latest,
    char *legacy
    ) {
    pokemon_detail_cries_t *pokemon_detail_cries_local_var = malloc(sizeof(pokemon_detail_cries_t));
    if (!pokemon_detail_cries_local_var) {
        return NULL;
    }
    memset(pokemon_detail_cries_local_var, 0, sizeof(pokemon_detail_cries_t));
    pokemon_detail_cries_local_var->_library_owned = 1;
    pokemon_detail_cries_local_var->latest = latest;
    pokemon_detail_cries_local_var->legacy = legacy;
    return pokemon_detail_cries_local_var;
}

__attribute__((deprecated)) pokemon_detail_cries_t *pokemon_detail_cries_create(
    char *latest,
    char *legacy
    ) {
    pokemon_detail_cries_t *result = pokemon_detail_cries_create_internal (
        latest,
        legacy
        );
    if (!result) {
    }
    return result;
}

void pokemon_detail_cries_free(pokemon_detail_cries_t *pokemon_detail_cries) {
    if(NULL == pokemon_detail_cries){
        return ;
    }
    if(pokemon_detail_cries->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_detail_cries_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_detail_cries->latest) {
        free(pokemon_detail_cries->latest);
        pokemon_detail_cries->latest = NULL;
    }
    if (pokemon_detail_cries->legacy) {
        free(pokemon_detail_cries->legacy);
        pokemon_detail_cries->legacy = NULL;
    }
    free(pokemon_detail_cries);
}

cJSON *pokemon_detail_cries_convertToJSON(pokemon_detail_cries_t *pokemon_detail_cries) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_detail_cries->latest
    if (!pokemon_detail_cries->latest) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "latest", pokemon_detail_cries->latest) == NULL) {
    goto fail; //String
    }


    // pokemon_detail_cries->legacy
    if (!pokemon_detail_cries->legacy) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "legacy", pokemon_detail_cries->legacy) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_detail_cries_t *pokemon_detail_cries_parseFromJSON(cJSON *pokemon_detail_criesJSON){

    pokemon_detail_cries_t *pokemon_detail_cries_local_var = NULL;

    char *latest_local_str = NULL;

    char *legacy_local_str = NULL;

    // pokemon_detail_cries->latest
    cJSON *latest = cJSON_GetObjectItemCaseSensitive(pokemon_detail_criesJSON, "latest");
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

    // pokemon_detail_cries->legacy
    cJSON *legacy = cJSON_GetObjectItemCaseSensitive(pokemon_detail_criesJSON, "legacy");
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

    pokemon_detail_cries_local_var = pokemon_detail_cries_create_internal (
        latest_local_str,
        legacy_local_str
        );

    if (!pokemon_detail_cries_local_var) {
        goto end;
    }

    return pokemon_detail_cries_local_var;
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
