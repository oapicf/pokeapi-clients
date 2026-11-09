#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_stat_change.h"



static move_stat_change_t *move_stat_change_create_internal(
    int *change,
    move_summary_t *move
    ) {
    move_stat_change_t *move_stat_change_local_var = malloc(sizeof(move_stat_change_t));
    if (!move_stat_change_local_var) {
        return NULL;
    }
    memset(move_stat_change_local_var, 0, sizeof(move_stat_change_t));
    move_stat_change_local_var->_library_owned = 1;
    move_stat_change_local_var->change = change;
    move_stat_change_local_var->move = move;
    return move_stat_change_local_var;
}

__attribute__((deprecated)) move_stat_change_t *move_stat_change_create(
    int *change,
    move_summary_t *move
    ) {
    int *change_copy = NULL;
    if (change) {
        change_copy = malloc(sizeof(int));
        if (change_copy) *change_copy = *change;
    }
    move_stat_change_t *result = move_stat_change_create_internal (
        change_copy,
        move
        );
    if (!result) {
        free(change_copy);
    }
    return result;
}

void move_stat_change_free(move_stat_change_t *move_stat_change) {
    if(NULL == move_stat_change){
        return ;
    }
    if(move_stat_change->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_stat_change_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_stat_change->change) {
        free(move_stat_change->change);
        move_stat_change->change = NULL;
    }
    if (move_stat_change->move) {
        move_summary_free(move_stat_change->move);
        move_stat_change->move = NULL;
    }
    free(move_stat_change);
}

cJSON *move_stat_change_convertToJSON(move_stat_change_t *move_stat_change) {
    cJSON *item = cJSON_CreateObject();

    // move_stat_change->change
    if (!move_stat_change->change) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "change", *move_stat_change->change) == NULL) {
    goto fail; //Numeric
    }


    // move_stat_change->move
    if (!move_stat_change->move) {
        goto fail;
    }
    cJSON *move_local_JSON = move_summary_convertToJSON(move_stat_change->move);
    if(move_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "move", move_local_JSON);
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

move_stat_change_t *move_stat_change_parseFromJSON(cJSON *move_stat_changeJSON){

    move_stat_change_t *move_stat_change_local_var = NULL;

    // define the local variable for move_stat_change->change
    int *change_local_var = NULL;

    // define the local variable for move_stat_change->move
    move_summary_t *move_local_nonprim = NULL;

    // move_stat_change->change
    cJSON *change = cJSON_GetObjectItemCaseSensitive(move_stat_changeJSON, "change");
    if (cJSON_IsNull(change)) {
        change = NULL;
    }
    if (!change) {
        goto end;
    }

    
    if(!cJSON_IsNumber(change))
    {
    goto end; //Numeric
    }
    change_local_var = malloc(sizeof(int));
    if(!change_local_var)
    {
        goto end;
    }
    *change_local_var = change->valuedouble;

    // move_stat_change->move
    cJSON *move = cJSON_GetObjectItemCaseSensitive(move_stat_changeJSON, "move");
    if (cJSON_IsNull(move)) {
        move = NULL;
    }
    if (!move) {
        goto end;
    }

    
    move_local_nonprim = move_summary_parseFromJSON(move); //nonprimitive



    move_stat_change_local_var = move_stat_change_create_internal (
        change_local_var,
        move_local_nonprim
        );

    if (!move_stat_change_local_var) {
        goto end;
    }

    return move_stat_change_local_var;
end:
    if (change_local_var) {
        free(change_local_var);
        change_local_var = NULL;
    }
    if (move_local_nonprim) {
        move_summary_free(move_local_nonprim);
        move_local_nonprim = NULL;
    }
    return NULL;

}
