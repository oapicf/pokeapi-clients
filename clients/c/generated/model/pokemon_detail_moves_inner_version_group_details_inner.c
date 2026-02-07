#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_detail_moves_inner_version_group_details_inner.h"



static pokemon_detail_moves_inner_version_group_details_inner_t *pokemon_detail_moves_inner_version_group_details_inner_create_internal(
    int level_learned_at,
    ability_detail_pokemon_inner_pokemon_t *move_learn_method,
    ability_detail_pokemon_inner_pokemon_t *version_group
    ) {
    pokemon_detail_moves_inner_version_group_details_inner_t *pokemon_detail_moves_inner_version_group_details_inner_local_var = malloc(sizeof(pokemon_detail_moves_inner_version_group_details_inner_t));
    if (!pokemon_detail_moves_inner_version_group_details_inner_local_var) {
        return NULL;
    }
    pokemon_detail_moves_inner_version_group_details_inner_local_var->level_learned_at = level_learned_at;
    pokemon_detail_moves_inner_version_group_details_inner_local_var->move_learn_method = move_learn_method;
    pokemon_detail_moves_inner_version_group_details_inner_local_var->version_group = version_group;

    pokemon_detail_moves_inner_version_group_details_inner_local_var->_library_owned = 1;
    return pokemon_detail_moves_inner_version_group_details_inner_local_var;
}

__attribute__((deprecated)) pokemon_detail_moves_inner_version_group_details_inner_t *pokemon_detail_moves_inner_version_group_details_inner_create(
    int level_learned_at,
    ability_detail_pokemon_inner_pokemon_t *move_learn_method,
    ability_detail_pokemon_inner_pokemon_t *version_group
    ) {
    return pokemon_detail_moves_inner_version_group_details_inner_create_internal (
        level_learned_at,
        move_learn_method,
        version_group
        );
}

void pokemon_detail_moves_inner_version_group_details_inner_free(pokemon_detail_moves_inner_version_group_details_inner_t *pokemon_detail_moves_inner_version_group_details_inner) {
    if(NULL == pokemon_detail_moves_inner_version_group_details_inner){
        return ;
    }
    if(pokemon_detail_moves_inner_version_group_details_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_detail_moves_inner_version_group_details_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_detail_moves_inner_version_group_details_inner->move_learn_method) {
        ability_detail_pokemon_inner_pokemon_free(pokemon_detail_moves_inner_version_group_details_inner->move_learn_method);
        pokemon_detail_moves_inner_version_group_details_inner->move_learn_method = NULL;
    }
    if (pokemon_detail_moves_inner_version_group_details_inner->version_group) {
        ability_detail_pokemon_inner_pokemon_free(pokemon_detail_moves_inner_version_group_details_inner->version_group);
        pokemon_detail_moves_inner_version_group_details_inner->version_group = NULL;
    }
    free(pokemon_detail_moves_inner_version_group_details_inner);
}

cJSON *pokemon_detail_moves_inner_version_group_details_inner_convertToJSON(pokemon_detail_moves_inner_version_group_details_inner_t *pokemon_detail_moves_inner_version_group_details_inner) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_detail_moves_inner_version_group_details_inner->level_learned_at
    if (!pokemon_detail_moves_inner_version_group_details_inner->level_learned_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "level_learned_at", pokemon_detail_moves_inner_version_group_details_inner->level_learned_at) == NULL) {
    goto fail; //Numeric
    }


    // pokemon_detail_moves_inner_version_group_details_inner->move_learn_method
    if (!pokemon_detail_moves_inner_version_group_details_inner->move_learn_method) {
        goto fail;
    }
    cJSON *move_learn_method_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(pokemon_detail_moves_inner_version_group_details_inner->move_learn_method);
    if(move_learn_method_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "move_learn_method", move_learn_method_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_detail_moves_inner_version_group_details_inner->version_group
    if (!pokemon_detail_moves_inner_version_group_details_inner->version_group) {
        goto fail;
    }
    cJSON *version_group_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(pokemon_detail_moves_inner_version_group_details_inner->version_group);
    if(version_group_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "version_group", version_group_local_JSON);
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

pokemon_detail_moves_inner_version_group_details_inner_t *pokemon_detail_moves_inner_version_group_details_inner_parseFromJSON(cJSON *pokemon_detail_moves_inner_version_group_details_innerJSON){

    pokemon_detail_moves_inner_version_group_details_inner_t *pokemon_detail_moves_inner_version_group_details_inner_local_var = NULL;

    // define the local variable for pokemon_detail_moves_inner_version_group_details_inner->move_learn_method
    ability_detail_pokemon_inner_pokemon_t *move_learn_method_local_nonprim = NULL;

    // define the local variable for pokemon_detail_moves_inner_version_group_details_inner->version_group
    ability_detail_pokemon_inner_pokemon_t *version_group_local_nonprim = NULL;

    // pokemon_detail_moves_inner_version_group_details_inner->level_learned_at
    cJSON *level_learned_at = cJSON_GetObjectItemCaseSensitive(pokemon_detail_moves_inner_version_group_details_innerJSON, "level_learned_at");
    if (cJSON_IsNull(level_learned_at)) {
        level_learned_at = NULL;
    }
    if (!level_learned_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(level_learned_at))
    {
    goto end; //Numeric
    }

    // pokemon_detail_moves_inner_version_group_details_inner->move_learn_method
    cJSON *move_learn_method = cJSON_GetObjectItemCaseSensitive(pokemon_detail_moves_inner_version_group_details_innerJSON, "move_learn_method");
    if (cJSON_IsNull(move_learn_method)) {
        move_learn_method = NULL;
    }
    if (!move_learn_method) {
        goto end;
    }

    
    move_learn_method_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(move_learn_method); //nonprimitive

    // pokemon_detail_moves_inner_version_group_details_inner->version_group
    cJSON *version_group = cJSON_GetObjectItemCaseSensitive(pokemon_detail_moves_inner_version_group_details_innerJSON, "version_group");
    if (cJSON_IsNull(version_group)) {
        version_group = NULL;
    }
    if (!version_group) {
        goto end;
    }

    
    version_group_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(version_group); //nonprimitive


    pokemon_detail_moves_inner_version_group_details_inner_local_var = pokemon_detail_moves_inner_version_group_details_inner_create_internal (
        level_learned_at->valuedouble,
        move_learn_method_local_nonprim,
        version_group_local_nonprim
        );

    return pokemon_detail_moves_inner_version_group_details_inner_local_var;
end:
    if (move_learn_method_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(move_learn_method_local_nonprim);
        move_learn_method_local_nonprim = NULL;
    }
    if (version_group_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(version_group_local_nonprim);
        version_group_local_nonprim = NULL;
    }
    return NULL;

}
