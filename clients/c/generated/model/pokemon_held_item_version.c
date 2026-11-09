#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_held_item_version.h"



static pokemon_held_item_version_t *pokemon_held_item_version_create_internal(
    int *rarity,
    version_summary_t *version
    ) {
    pokemon_held_item_version_t *pokemon_held_item_version_local_var = malloc(sizeof(pokemon_held_item_version_t));
    if (!pokemon_held_item_version_local_var) {
        return NULL;
    }
    memset(pokemon_held_item_version_local_var, 0, sizeof(pokemon_held_item_version_t));
    pokemon_held_item_version_local_var->_library_owned = 1;
    pokemon_held_item_version_local_var->rarity = rarity;
    pokemon_held_item_version_local_var->version = version;
    return pokemon_held_item_version_local_var;
}

__attribute__((deprecated)) pokemon_held_item_version_t *pokemon_held_item_version_create(
    int *rarity,
    version_summary_t *version
    ) {
    int *rarity_copy = NULL;
    if (rarity) {
        rarity_copy = malloc(sizeof(int));
        if (rarity_copy) *rarity_copy = *rarity;
    }
    pokemon_held_item_version_t *result = pokemon_held_item_version_create_internal (
        rarity_copy,
        version
        );
    if (!result) {
        free(rarity_copy);
    }
    return result;
}

void pokemon_held_item_version_free(pokemon_held_item_version_t *pokemon_held_item_version) {
    if(NULL == pokemon_held_item_version){
        return ;
    }
    if(pokemon_held_item_version->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_held_item_version_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_held_item_version->rarity) {
        free(pokemon_held_item_version->rarity);
        pokemon_held_item_version->rarity = NULL;
    }
    if (pokemon_held_item_version->version) {
        version_summary_free(pokemon_held_item_version->version);
        pokemon_held_item_version->version = NULL;
    }
    free(pokemon_held_item_version);
}

cJSON *pokemon_held_item_version_convertToJSON(pokemon_held_item_version_t *pokemon_held_item_version) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_held_item_version->rarity
    if (!pokemon_held_item_version->rarity) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "rarity", *pokemon_held_item_version->rarity) == NULL) {
    goto fail; //Numeric
    }


    // pokemon_held_item_version->version
    if (!pokemon_held_item_version->version) {
        goto fail;
    }
    cJSON *version_local_JSON = version_summary_convertToJSON(pokemon_held_item_version->version);
    if(version_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "version", version_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_held_item_version_t *pokemon_held_item_version_parseFromJSON(cJSON *pokemon_held_item_versionJSON){

    pokemon_held_item_version_t *pokemon_held_item_version_local_var = NULL;

    // define the local variable for pokemon_held_item_version->rarity
    int *rarity_local_var = NULL;

    // define the local variable for pokemon_held_item_version->version
    version_summary_t *version_local_nonprim = NULL;

    // pokemon_held_item_version->rarity
    cJSON *rarity = cJSON_GetObjectItemCaseSensitive(pokemon_held_item_versionJSON, "rarity");
    if (cJSON_IsNull(rarity)) {
        rarity = NULL;
    }
    if (!rarity) {
        goto end;
    }

    
    if(!cJSON_IsNumber(rarity))
    {
    goto end; //Numeric
    }
    rarity_local_var = malloc(sizeof(int));
    if(!rarity_local_var)
    {
        goto end;
    }
    *rarity_local_var = rarity->valuedouble;

    // pokemon_held_item_version->version
    cJSON *version = cJSON_GetObjectItemCaseSensitive(pokemon_held_item_versionJSON, "version");
    if (cJSON_IsNull(version)) {
        version = NULL;
    }
    if (!version) {
        goto end;
    }

    
    version_local_nonprim = version_summary_parseFromJSON(version); //nonprimitive



    pokemon_held_item_version_local_var = pokemon_held_item_version_create_internal (
        rarity_local_var,
        version_local_nonprim
        );

    if (!pokemon_held_item_version_local_var) {
        goto end;
    }

    return pokemon_held_item_version_local_var;
end:
    if (rarity_local_var) {
        free(rarity_local_var);
        rarity_local_var = NULL;
    }
    if (version_local_nonprim) {
        version_summary_free(version_local_nonprim);
        version_local_nonprim = NULL;
    }
    return NULL;

}
