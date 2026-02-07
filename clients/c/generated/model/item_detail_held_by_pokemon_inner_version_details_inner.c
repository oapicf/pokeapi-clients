#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_detail_held_by_pokemon_inner_version_details_inner.h"



static item_detail_held_by_pokemon_inner_version_details_inner_t *item_detail_held_by_pokemon_inner_version_details_inner_create_internal(
    int rarity,
    ability_detail_pokemon_inner_pokemon_t *version
    ) {
    item_detail_held_by_pokemon_inner_version_details_inner_t *item_detail_held_by_pokemon_inner_version_details_inner_local_var = malloc(sizeof(item_detail_held_by_pokemon_inner_version_details_inner_t));
    if (!item_detail_held_by_pokemon_inner_version_details_inner_local_var) {
        return NULL;
    }
    item_detail_held_by_pokemon_inner_version_details_inner_local_var->rarity = rarity;
    item_detail_held_by_pokemon_inner_version_details_inner_local_var->version = version;

    item_detail_held_by_pokemon_inner_version_details_inner_local_var->_library_owned = 1;
    return item_detail_held_by_pokemon_inner_version_details_inner_local_var;
}

__attribute__((deprecated)) item_detail_held_by_pokemon_inner_version_details_inner_t *item_detail_held_by_pokemon_inner_version_details_inner_create(
    int rarity,
    ability_detail_pokemon_inner_pokemon_t *version
    ) {
    return item_detail_held_by_pokemon_inner_version_details_inner_create_internal (
        rarity,
        version
        );
}

void item_detail_held_by_pokemon_inner_version_details_inner_free(item_detail_held_by_pokemon_inner_version_details_inner_t *item_detail_held_by_pokemon_inner_version_details_inner) {
    if(NULL == item_detail_held_by_pokemon_inner_version_details_inner){
        return ;
    }
    if(item_detail_held_by_pokemon_inner_version_details_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_detail_held_by_pokemon_inner_version_details_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (item_detail_held_by_pokemon_inner_version_details_inner->version) {
        ability_detail_pokemon_inner_pokemon_free(item_detail_held_by_pokemon_inner_version_details_inner->version);
        item_detail_held_by_pokemon_inner_version_details_inner->version = NULL;
    }
    free(item_detail_held_by_pokemon_inner_version_details_inner);
}

cJSON *item_detail_held_by_pokemon_inner_version_details_inner_convertToJSON(item_detail_held_by_pokemon_inner_version_details_inner_t *item_detail_held_by_pokemon_inner_version_details_inner) {
    cJSON *item = cJSON_CreateObject();

    // item_detail_held_by_pokemon_inner_version_details_inner->rarity
    if (!item_detail_held_by_pokemon_inner_version_details_inner->rarity) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "rarity", item_detail_held_by_pokemon_inner_version_details_inner->rarity) == NULL) {
    goto fail; //Numeric
    }


    // item_detail_held_by_pokemon_inner_version_details_inner->version
    if (!item_detail_held_by_pokemon_inner_version_details_inner->version) {
        goto fail;
    }
    cJSON *version_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(item_detail_held_by_pokemon_inner_version_details_inner->version);
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

item_detail_held_by_pokemon_inner_version_details_inner_t *item_detail_held_by_pokemon_inner_version_details_inner_parseFromJSON(cJSON *item_detail_held_by_pokemon_inner_version_details_innerJSON){

    item_detail_held_by_pokemon_inner_version_details_inner_t *item_detail_held_by_pokemon_inner_version_details_inner_local_var = NULL;

    // define the local variable for item_detail_held_by_pokemon_inner_version_details_inner->version
    ability_detail_pokemon_inner_pokemon_t *version_local_nonprim = NULL;

    // item_detail_held_by_pokemon_inner_version_details_inner->rarity
    cJSON *rarity = cJSON_GetObjectItemCaseSensitive(item_detail_held_by_pokemon_inner_version_details_innerJSON, "rarity");
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

    // item_detail_held_by_pokemon_inner_version_details_inner->version
    cJSON *version = cJSON_GetObjectItemCaseSensitive(item_detail_held_by_pokemon_inner_version_details_innerJSON, "version");
    if (cJSON_IsNull(version)) {
        version = NULL;
    }
    if (!version) {
        goto end;
    }

    
    version_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(version); //nonprimitive


    item_detail_held_by_pokemon_inner_version_details_inner_local_var = item_detail_held_by_pokemon_inner_version_details_inner_create_internal (
        rarity->valuedouble,
        version_local_nonprim
        );

    return item_detail_held_by_pokemon_inner_version_details_inner_local_var;
end:
    if (version_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(version_local_nonprim);
        version_local_nonprim = NULL;
    }
    return NULL;

}
