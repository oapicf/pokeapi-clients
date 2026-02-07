#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_detail_contest_combos.h"



static move_detail_contest_combos_t *move_detail_contest_combos_create_internal(
    move_detail_contest_combos_normal_t *normal,
    move_detail_contest_combos_normal_t *super
    ) {
    move_detail_contest_combos_t *move_detail_contest_combos_local_var = malloc(sizeof(move_detail_contest_combos_t));
    if (!move_detail_contest_combos_local_var) {
        return NULL;
    }
    move_detail_contest_combos_local_var->normal = normal;
    move_detail_contest_combos_local_var->super = super;

    move_detail_contest_combos_local_var->_library_owned = 1;
    return move_detail_contest_combos_local_var;
}

__attribute__((deprecated)) move_detail_contest_combos_t *move_detail_contest_combos_create(
    move_detail_contest_combos_normal_t *normal,
    move_detail_contest_combos_normal_t *super
    ) {
    return move_detail_contest_combos_create_internal (
        normal,
        super
        );
}

void move_detail_contest_combos_free(move_detail_contest_combos_t *move_detail_contest_combos) {
    if(NULL == move_detail_contest_combos){
        return ;
    }
    if(move_detail_contest_combos->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_detail_contest_combos_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_detail_contest_combos->normal) {
        move_detail_contest_combos_normal_free(move_detail_contest_combos->normal);
        move_detail_contest_combos->normal = NULL;
    }
    if (move_detail_contest_combos->super) {
        move_detail_contest_combos_normal_free(move_detail_contest_combos->super);
        move_detail_contest_combos->super = NULL;
    }
    free(move_detail_contest_combos);
}

cJSON *move_detail_contest_combos_convertToJSON(move_detail_contest_combos_t *move_detail_contest_combos) {
    cJSON *item = cJSON_CreateObject();

    // move_detail_contest_combos->normal
    if (!move_detail_contest_combos->normal) {
        goto fail;
    }
    cJSON *normal_local_JSON = move_detail_contest_combos_normal_convertToJSON(move_detail_contest_combos->normal);
    if(normal_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "normal", normal_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // move_detail_contest_combos->super
    if (!move_detail_contest_combos->super) {
        goto fail;
    }
    cJSON *super_local_JSON = move_detail_contest_combos_normal_convertToJSON(move_detail_contest_combos->super);
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

move_detail_contest_combos_t *move_detail_contest_combos_parseFromJSON(cJSON *move_detail_contest_combosJSON){

    move_detail_contest_combos_t *move_detail_contest_combos_local_var = NULL;

    // define the local variable for move_detail_contest_combos->normal
    move_detail_contest_combos_normal_t *normal_local_nonprim = NULL;

    // define the local variable for move_detail_contest_combos->super
    move_detail_contest_combos_normal_t *super_local_nonprim = NULL;

    // move_detail_contest_combos->normal
    cJSON *normal = cJSON_GetObjectItemCaseSensitive(move_detail_contest_combosJSON, "normal");
    if (cJSON_IsNull(normal)) {
        normal = NULL;
    }
    if (!normal) {
        goto end;
    }

    
    normal_local_nonprim = move_detail_contest_combos_normal_parseFromJSON(normal); //nonprimitive

    // move_detail_contest_combos->super
    cJSON *super = cJSON_GetObjectItemCaseSensitive(move_detail_contest_combosJSON, "super");
    if (cJSON_IsNull(super)) {
        super = NULL;
    }
    if (!super) {
        goto end;
    }

    
    super_local_nonprim = move_detail_contest_combos_normal_parseFromJSON(super); //nonprimitive


    move_detail_contest_combos_local_var = move_detail_contest_combos_create_internal (
        normal_local_nonprim,
        super_local_nonprim
        );

    return move_detail_contest_combos_local_var;
end:
    if (normal_local_nonprim) {
        move_detail_contest_combos_normal_free(normal_local_nonprim);
        normal_local_nonprim = NULL;
    }
    if (super_local_nonprim) {
        move_detail_contest_combos_normal_free(super_local_nonprim);
        super_local_nonprim = NULL;
    }
    return NULL;

}
