#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_move_version_group.h"



static pokemon_move_version_group_t *pokemon_move_version_group_create_internal(
    int *level_learned_at,
    move_learn_method_summary_t *move_learn_method,
    version_group_summary_t *version_group,
    int *order
    ) {
    pokemon_move_version_group_t *pokemon_move_version_group_local_var = malloc(sizeof(pokemon_move_version_group_t));
    if (!pokemon_move_version_group_local_var) {
        return NULL;
    }
    memset(pokemon_move_version_group_local_var, 0, sizeof(pokemon_move_version_group_t));
    pokemon_move_version_group_local_var->_library_owned = 1;
    pokemon_move_version_group_local_var->level_learned_at = level_learned_at;
    pokemon_move_version_group_local_var->move_learn_method = move_learn_method;
    pokemon_move_version_group_local_var->version_group = version_group;
    pokemon_move_version_group_local_var->order = order;
    return pokemon_move_version_group_local_var;
}

__attribute__((deprecated)) pokemon_move_version_group_t *pokemon_move_version_group_create(
    int *level_learned_at,
    move_learn_method_summary_t *move_learn_method,
    version_group_summary_t *version_group,
    int *order
    ) {
    int *level_learned_at_copy = NULL;
    if (level_learned_at) {
        level_learned_at_copy = malloc(sizeof(int));
        if (level_learned_at_copy) *level_learned_at_copy = *level_learned_at;
    }
    int *order_copy = NULL;
    if (order) {
        order_copy = malloc(sizeof(int));
        if (order_copy) *order_copy = *order;
    }
    pokemon_move_version_group_t *result = pokemon_move_version_group_create_internal (
        level_learned_at_copy,
        move_learn_method,
        version_group,
        order_copy
        );
    if (!result) {
        free(level_learned_at_copy);
        free(order_copy);
    }
    return result;
}

void pokemon_move_version_group_free(pokemon_move_version_group_t *pokemon_move_version_group) {
    if(NULL == pokemon_move_version_group){
        return ;
    }
    if(pokemon_move_version_group->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_move_version_group_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_move_version_group->level_learned_at) {
        free(pokemon_move_version_group->level_learned_at);
        pokemon_move_version_group->level_learned_at = NULL;
    }
    if (pokemon_move_version_group->move_learn_method) {
        move_learn_method_summary_free(pokemon_move_version_group->move_learn_method);
        pokemon_move_version_group->move_learn_method = NULL;
    }
    if (pokemon_move_version_group->version_group) {
        version_group_summary_free(pokemon_move_version_group->version_group);
        pokemon_move_version_group->version_group = NULL;
    }
    if (pokemon_move_version_group->order) {
        free(pokemon_move_version_group->order);
        pokemon_move_version_group->order = NULL;
    }
    free(pokemon_move_version_group);
}

cJSON *pokemon_move_version_group_convertToJSON(pokemon_move_version_group_t *pokemon_move_version_group) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_move_version_group->level_learned_at
    if (!pokemon_move_version_group->level_learned_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "level_learned_at", *pokemon_move_version_group->level_learned_at) == NULL) {
    goto fail; //Numeric
    }


    // pokemon_move_version_group->move_learn_method
    if (!pokemon_move_version_group->move_learn_method) {
        goto fail;
    }
    cJSON *move_learn_method_local_JSON = move_learn_method_summary_convertToJSON(pokemon_move_version_group->move_learn_method);
    if(move_learn_method_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "move_learn_method", move_learn_method_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_move_version_group->version_group
    if (!pokemon_move_version_group->version_group) {
        goto fail;
    }
    cJSON *version_group_local_JSON = version_group_summary_convertToJSON(pokemon_move_version_group->version_group);
    if(version_group_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "version_group", version_group_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_move_version_group->order
    if(pokemon_move_version_group->order) {
    if(cJSON_AddNumberToObject(item, "order", *pokemon_move_version_group->order) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_move_version_group_t *pokemon_move_version_group_parseFromJSON(cJSON *pokemon_move_version_groupJSON){

    pokemon_move_version_group_t *pokemon_move_version_group_local_var = NULL;

    // define the local variable for pokemon_move_version_group->level_learned_at
    int *level_learned_at_local_var = NULL;

    // define the local variable for pokemon_move_version_group->move_learn_method
    move_learn_method_summary_t *move_learn_method_local_nonprim = NULL;

    // define the local variable for pokemon_move_version_group->version_group
    version_group_summary_t *version_group_local_nonprim = NULL;

    // define the local variable for pokemon_move_version_group->order
    int *order_local_var = NULL;

    // pokemon_move_version_group->level_learned_at
    cJSON *level_learned_at = cJSON_GetObjectItemCaseSensitive(pokemon_move_version_groupJSON, "level_learned_at");
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
    level_learned_at_local_var = malloc(sizeof(int));
    if(!level_learned_at_local_var)
    {
        goto end;
    }
    *level_learned_at_local_var = level_learned_at->valuedouble;

    // pokemon_move_version_group->move_learn_method
    cJSON *move_learn_method = cJSON_GetObjectItemCaseSensitive(pokemon_move_version_groupJSON, "move_learn_method");
    if (cJSON_IsNull(move_learn_method)) {
        move_learn_method = NULL;
    }
    if (!move_learn_method) {
        goto end;
    }

    
    move_learn_method_local_nonprim = move_learn_method_summary_parseFromJSON(move_learn_method); //nonprimitive

    // pokemon_move_version_group->version_group
    cJSON *version_group = cJSON_GetObjectItemCaseSensitive(pokemon_move_version_groupJSON, "version_group");
    if (cJSON_IsNull(version_group)) {
        version_group = NULL;
    }
    if (!version_group) {
        goto end;
    }

    
    version_group_local_nonprim = version_group_summary_parseFromJSON(version_group); //nonprimitive

    // pokemon_move_version_group->order
    cJSON *order = cJSON_GetObjectItemCaseSensitive(pokemon_move_version_groupJSON, "order");
    if (cJSON_IsNull(order)) {
        order = NULL;
    }
    if (order) { 
    if(!cJSON_IsNumber(order))
    {
    goto end; //Numeric
    }
    order_local_var = malloc(sizeof(int));
    if(!order_local_var)
    {
        goto end;
    }
    *order_local_var = order->valuedouble;
    }



    pokemon_move_version_group_local_var = pokemon_move_version_group_create_internal (
        level_learned_at_local_var,
        move_learn_method_local_nonprim,
        version_group_local_nonprim,
        order_local_var
        );

    if (!pokemon_move_version_group_local_var) {
        goto end;
    }

    return pokemon_move_version_group_local_var;
end:
    if (level_learned_at_local_var) {
        free(level_learned_at_local_var);
        level_learned_at_local_var = NULL;
    }
    if (move_learn_method_local_nonprim) {
        move_learn_method_summary_free(move_learn_method_local_nonprim);
        move_learn_method_local_nonprim = NULL;
    }
    if (version_group_local_nonprim) {
        version_group_summary_free(version_group_local_nonprim);
        version_group_local_nonprim = NULL;
    }
    if (order_local_var) {
        free(order_local_var);
        order_local_var = NULL;
    }
    return NULL;

}
