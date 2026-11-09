#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_combos.h"



static move_combos_t *move_combos_create_internal(
    move_combo_usage_t *normal,
    move_combo_usage_t *super
    ) {
    move_combos_t *move_combos_local_var = malloc(sizeof(move_combos_t));
    if (!move_combos_local_var) {
        return NULL;
    }
    memset(move_combos_local_var, 0, sizeof(move_combos_t));
    move_combos_local_var->_library_owned = 1;
    move_combos_local_var->normal = normal;
    move_combos_local_var->super = super;
    return move_combos_local_var;
}

__attribute__((deprecated)) move_combos_t *move_combos_create(
    move_combo_usage_t *normal,
    move_combo_usage_t *super
    ) {
    move_combos_t *result = move_combos_create_internal (
        normal,
        super
        );
    if (!result) {
    }
    return result;
}

void move_combos_free(move_combos_t *move_combos) {
    if(NULL == move_combos){
        return ;
    }
    if(move_combos->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_combos_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_combos->normal) {
        move_combo_usage_free(move_combos->normal);
        move_combos->normal = NULL;
    }
    if (move_combos->super) {
        move_combo_usage_free(move_combos->super);
        move_combos->super = NULL;
    }
    free(move_combos);
}

cJSON *move_combos_convertToJSON(move_combos_t *move_combos) {
    cJSON *item = cJSON_CreateObject();

    // move_combos->normal
    if (!move_combos->normal) {
        goto fail;
    }
    cJSON *normal_local_JSON = move_combo_usage_convertToJSON(move_combos->normal);
    if(normal_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "normal", normal_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // move_combos->super
    if (!move_combos->super) {
        goto fail;
    }
    cJSON *super_local_JSON = move_combo_usage_convertToJSON(move_combos->super);
    if(super_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "super", super_local_JSON);
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

move_combos_t *move_combos_parseFromJSON(cJSON *move_combosJSON){

    move_combos_t *move_combos_local_var = NULL;

    // define the local variable for move_combos->normal
    move_combo_usage_t *normal_local_nonprim = NULL;

    // define the local variable for move_combos->super
    move_combo_usage_t *super_local_nonprim = NULL;

    // move_combos->normal
    cJSON *normal = cJSON_GetObjectItemCaseSensitive(move_combosJSON, "normal");
    if (cJSON_IsNull(normal)) {
        normal = NULL;
    }
    if (!normal) {
        goto end;
    }

    
    normal_local_nonprim = move_combo_usage_parseFromJSON(normal); //nonprimitive

    // move_combos->super
    cJSON *super = cJSON_GetObjectItemCaseSensitive(move_combosJSON, "super");
    if (cJSON_IsNull(super)) {
        super = NULL;
    }
    if (!super) {
        goto end;
    }

    
    super_local_nonprim = move_combo_usage_parseFromJSON(super); //nonprimitive



    move_combos_local_var = move_combos_create_internal (
        normal_local_nonprim,
        super_local_nonprim
        );

    if (!move_combos_local_var) {
        goto end;
    }

    return move_combos_local_var;
end:
    if (normal_local_nonprim) {
        move_combo_usage_free(normal_local_nonprim);
        normal_local_nonprim = NULL;
    }
    if (super_local_nonprim) {
        move_combo_usage_free(super_local_nonprim);
        super_local_nonprim = NULL;
    }
    return NULL;

}
