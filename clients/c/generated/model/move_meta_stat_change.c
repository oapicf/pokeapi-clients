#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_meta_stat_change.h"



static move_meta_stat_change_t *move_meta_stat_change_create_internal(
    int *change,
    stat_summary_t *stat
    ) {
    move_meta_stat_change_t *move_meta_stat_change_local_var = malloc(sizeof(move_meta_stat_change_t));
    if (!move_meta_stat_change_local_var) {
        return NULL;
    }
    memset(move_meta_stat_change_local_var, 0, sizeof(move_meta_stat_change_t));
    move_meta_stat_change_local_var->_library_owned = 1;
    move_meta_stat_change_local_var->change = change;
    move_meta_stat_change_local_var->stat = stat;
    return move_meta_stat_change_local_var;
}

__attribute__((deprecated)) move_meta_stat_change_t *move_meta_stat_change_create(
    int *change,
    stat_summary_t *stat
    ) {
    int *change_copy = NULL;
    if (change) {
        change_copy = malloc(sizeof(int));
        if (change_copy) *change_copy = *change;
    }
    move_meta_stat_change_t *result = move_meta_stat_change_create_internal (
        change_copy,
        stat
        );
    if (!result) {
        free(change_copy);
    }
    return result;
}

void move_meta_stat_change_free(move_meta_stat_change_t *move_meta_stat_change) {
    if(NULL == move_meta_stat_change){
        return ;
    }
    if(move_meta_stat_change->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_meta_stat_change_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_meta_stat_change->change) {
        free(move_meta_stat_change->change);
        move_meta_stat_change->change = NULL;
    }
    if (move_meta_stat_change->stat) {
        stat_summary_free(move_meta_stat_change->stat);
        move_meta_stat_change->stat = NULL;
    }
    free(move_meta_stat_change);
}

cJSON *move_meta_stat_change_convertToJSON(move_meta_stat_change_t *move_meta_stat_change) {
    cJSON *item = cJSON_CreateObject();

    // move_meta_stat_change->change
    if (!move_meta_stat_change->change) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "change", *move_meta_stat_change->change) == NULL) {
    goto fail; //Numeric
    }


    // move_meta_stat_change->stat
    if (!move_meta_stat_change->stat) {
        goto fail;
    }
    cJSON *stat_local_JSON = stat_summary_convertToJSON(move_meta_stat_change->stat);
    if(stat_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "stat", stat_local_JSON);
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

move_meta_stat_change_t *move_meta_stat_change_parseFromJSON(cJSON *move_meta_stat_changeJSON){

    move_meta_stat_change_t *move_meta_stat_change_local_var = NULL;

    // define the local variable for move_meta_stat_change->change
    int *change_local_var = NULL;

    // define the local variable for move_meta_stat_change->stat
    stat_summary_t *stat_local_nonprim = NULL;

    // move_meta_stat_change->change
    cJSON *change = cJSON_GetObjectItemCaseSensitive(move_meta_stat_changeJSON, "change");
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

    // move_meta_stat_change->stat
    cJSON *stat = cJSON_GetObjectItemCaseSensitive(move_meta_stat_changeJSON, "stat");
    if (cJSON_IsNull(stat)) {
        stat = NULL;
    }
    if (!stat) {
        goto end;
    }

    
    stat_local_nonprim = stat_summary_parseFromJSON(stat); //nonprimitive



    move_meta_stat_change_local_var = move_meta_stat_change_create_internal (
        change_local_var,
        stat_local_nonprim
        );

    if (!move_meta_stat_change_local_var) {
        goto end;
    }

    return move_meta_stat_change_local_var;
end:
    if (change_local_var) {
        free(change_local_var);
        change_local_var = NULL;
    }
    if (stat_local_nonprim) {
        stat_summary_free(stat_local_nonprim);
        stat_local_nonprim = NULL;
    }
    return NULL;

}
