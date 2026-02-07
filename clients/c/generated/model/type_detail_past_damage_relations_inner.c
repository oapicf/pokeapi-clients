#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "type_detail_past_damage_relations_inner.h"



static type_detail_past_damage_relations_inner_t *type_detail_past_damage_relations_inner_create_internal(
    ability_detail_pokemon_inner_pokemon_t *generation,
    type_detail_past_damage_relations_inner_damage_relations_t *damage_relations
    ) {
    type_detail_past_damage_relations_inner_t *type_detail_past_damage_relations_inner_local_var = malloc(sizeof(type_detail_past_damage_relations_inner_t));
    if (!type_detail_past_damage_relations_inner_local_var) {
        return NULL;
    }
    type_detail_past_damage_relations_inner_local_var->generation = generation;
    type_detail_past_damage_relations_inner_local_var->damage_relations = damage_relations;

    type_detail_past_damage_relations_inner_local_var->_library_owned = 1;
    return type_detail_past_damage_relations_inner_local_var;
}

__attribute__((deprecated)) type_detail_past_damage_relations_inner_t *type_detail_past_damage_relations_inner_create(
    ability_detail_pokemon_inner_pokemon_t *generation,
    type_detail_past_damage_relations_inner_damage_relations_t *damage_relations
    ) {
    return type_detail_past_damage_relations_inner_create_internal (
        generation,
        damage_relations
        );
}

void type_detail_past_damage_relations_inner_free(type_detail_past_damage_relations_inner_t *type_detail_past_damage_relations_inner) {
    if(NULL == type_detail_past_damage_relations_inner){
        return ;
    }
    if(type_detail_past_damage_relations_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "type_detail_past_damage_relations_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (type_detail_past_damage_relations_inner->generation) {
        ability_detail_pokemon_inner_pokemon_free(type_detail_past_damage_relations_inner->generation);
        type_detail_past_damage_relations_inner->generation = NULL;
    }
    if (type_detail_past_damage_relations_inner->damage_relations) {
        type_detail_past_damage_relations_inner_damage_relations_free(type_detail_past_damage_relations_inner->damage_relations);
        type_detail_past_damage_relations_inner->damage_relations = NULL;
    }
    free(type_detail_past_damage_relations_inner);
}

cJSON *type_detail_past_damage_relations_inner_convertToJSON(type_detail_past_damage_relations_inner_t *type_detail_past_damage_relations_inner) {
    cJSON *item = cJSON_CreateObject();

    // type_detail_past_damage_relations_inner->generation
    if (!type_detail_past_damage_relations_inner->generation) {
        goto fail;
    }
    cJSON *generation_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(type_detail_past_damage_relations_inner->generation);
    if(generation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "generation", generation_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // type_detail_past_damage_relations_inner->damage_relations
    if (!type_detail_past_damage_relations_inner->damage_relations) {
        goto fail;
    }
    cJSON *damage_relations_local_JSON = type_detail_past_damage_relations_inner_damage_relations_convertToJSON(type_detail_past_damage_relations_inner->damage_relations);
    if(damage_relations_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "damage_relations", damage_relations_local_JSON);
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

type_detail_past_damage_relations_inner_t *type_detail_past_damage_relations_inner_parseFromJSON(cJSON *type_detail_past_damage_relations_innerJSON){

    type_detail_past_damage_relations_inner_t *type_detail_past_damage_relations_inner_local_var = NULL;

    // define the local variable for type_detail_past_damage_relations_inner->generation
    ability_detail_pokemon_inner_pokemon_t *generation_local_nonprim = NULL;

    // define the local variable for type_detail_past_damage_relations_inner->damage_relations
    type_detail_past_damage_relations_inner_damage_relations_t *damage_relations_local_nonprim = NULL;

    // type_detail_past_damage_relations_inner->generation
    cJSON *generation = cJSON_GetObjectItemCaseSensitive(type_detail_past_damage_relations_innerJSON, "generation");
    if (cJSON_IsNull(generation)) {
        generation = NULL;
    }
    if (!generation) {
        goto end;
    }

    
    generation_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(generation); //nonprimitive

    // type_detail_past_damage_relations_inner->damage_relations
    cJSON *damage_relations = cJSON_GetObjectItemCaseSensitive(type_detail_past_damage_relations_innerJSON, "damage_relations");
    if (cJSON_IsNull(damage_relations)) {
        damage_relations = NULL;
    }
    if (!damage_relations) {
        goto end;
    }

    
    damage_relations_local_nonprim = type_detail_past_damage_relations_inner_damage_relations_parseFromJSON(damage_relations); //nonprimitive


    type_detail_past_damage_relations_inner_local_var = type_detail_past_damage_relations_inner_create_internal (
        generation_local_nonprim,
        damage_relations_local_nonprim
        );

    return type_detail_past_damage_relations_inner_local_var;
end:
    if (generation_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(generation_local_nonprim);
        generation_local_nonprim = NULL;
    }
    if (damage_relations_local_nonprim) {
        type_detail_past_damage_relations_inner_damage_relations_free(damage_relations_local_nonprim);
        damage_relations_local_nonprim = NULL;
    }
    return NULL;

}
