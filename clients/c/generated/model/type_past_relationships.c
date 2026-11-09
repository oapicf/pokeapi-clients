#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "type_past_relationships.h"



static type_past_relationships_t *type_past_relationships_create_internal(
    generation_summary_t *generation,
    type_relationships_t *damage_relations
    ) {
    type_past_relationships_t *type_past_relationships_local_var = malloc(sizeof(type_past_relationships_t));
    if (!type_past_relationships_local_var) {
        return NULL;
    }
    memset(type_past_relationships_local_var, 0, sizeof(type_past_relationships_t));
    type_past_relationships_local_var->_library_owned = 1;
    type_past_relationships_local_var->generation = generation;
    type_past_relationships_local_var->damage_relations = damage_relations;
    return type_past_relationships_local_var;
}

__attribute__((deprecated)) type_past_relationships_t *type_past_relationships_create(
    generation_summary_t *generation,
    type_relationships_t *damage_relations
    ) {
    type_past_relationships_t *result = type_past_relationships_create_internal (
        generation,
        damage_relations
        );
    if (!result) {
    }
    return result;
}

void type_past_relationships_free(type_past_relationships_t *type_past_relationships) {
    if(NULL == type_past_relationships){
        return ;
    }
    if(type_past_relationships->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "type_past_relationships_free");
        return ;
    }
    listEntry_t *listEntry;
    if (type_past_relationships->generation) {
        generation_summary_free(type_past_relationships->generation);
        type_past_relationships->generation = NULL;
    }
    if (type_past_relationships->damage_relations) {
        type_relationships_free(type_past_relationships->damage_relations);
        type_past_relationships->damage_relations = NULL;
    }
    free(type_past_relationships);
}

cJSON *type_past_relationships_convertToJSON(type_past_relationships_t *type_past_relationships) {
    cJSON *item = cJSON_CreateObject();

    // type_past_relationships->generation
    if (!type_past_relationships->generation) {
        goto fail;
    }
    cJSON *generation_local_JSON = generation_summary_convertToJSON(type_past_relationships->generation);
    if(generation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "generation", generation_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // type_past_relationships->damage_relations
    if (!type_past_relationships->damage_relations) {
        goto fail;
    }
    cJSON *damage_relations_local_JSON = type_relationships_convertToJSON(type_past_relationships->damage_relations);
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

type_past_relationships_t *type_past_relationships_parseFromJSON(cJSON *type_past_relationshipsJSON){

    type_past_relationships_t *type_past_relationships_local_var = NULL;

    // define the local variable for type_past_relationships->generation
    generation_summary_t *generation_local_nonprim = NULL;

    // define the local variable for type_past_relationships->damage_relations
    type_relationships_t *damage_relations_local_nonprim = NULL;

    // type_past_relationships->generation
    cJSON *generation = cJSON_GetObjectItemCaseSensitive(type_past_relationshipsJSON, "generation");
    if (cJSON_IsNull(generation)) {
        generation = NULL;
    }
    if (!generation) {
        goto end;
    }

    
    generation_local_nonprim = generation_summary_parseFromJSON(generation); //nonprimitive

    // type_past_relationships->damage_relations
    cJSON *damage_relations = cJSON_GetObjectItemCaseSensitive(type_past_relationshipsJSON, "damage_relations");
    if (cJSON_IsNull(damage_relations)) {
        damage_relations = NULL;
    }
    if (!damage_relations) {
        goto end;
    }

    
    damage_relations_local_nonprim = type_relationships_parseFromJSON(damage_relations); //nonprimitive



    type_past_relationships_local_var = type_past_relationships_create_internal (
        generation_local_nonprim,
        damage_relations_local_nonprim
        );

    if (!type_past_relationships_local_var) {
        goto end;
    }

    return type_past_relationships_local_var;
end:
    if (generation_local_nonprim) {
        generation_summary_free(generation_local_nonprim);
        generation_local_nonprim = NULL;
    }
    if (damage_relations_local_nonprim) {
        type_relationships_free(damage_relations_local_nonprim);
        damage_relations_local_nonprim = NULL;
    }
    return NULL;

}
