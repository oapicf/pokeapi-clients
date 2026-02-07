#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "machine_detail.h"



static machine_detail_t *machine_detail_create_internal(
    int id,
    item_summary_t *item,
    version_group_summary_t *version_group,
    move_summary_t *move
    ) {
    machine_detail_t *machine_detail_local_var = malloc(sizeof(machine_detail_t));
    if (!machine_detail_local_var) {
        return NULL;
    }
    machine_detail_local_var->id = id;
    machine_detail_local_var->item = item;
    machine_detail_local_var->version_group = version_group;
    machine_detail_local_var->move = move;

    machine_detail_local_var->_library_owned = 1;
    return machine_detail_local_var;
}

__attribute__((deprecated)) machine_detail_t *machine_detail_create(
    int id,
    item_summary_t *item,
    version_group_summary_t *version_group,
    move_summary_t *move
    ) {
    return machine_detail_create_internal (
        id,
        item,
        version_group,
        move
        );
}

void machine_detail_free(machine_detail_t *machine_detail) {
    if(NULL == machine_detail){
        return ;
    }
    if(machine_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "machine_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (machine_detail->item) {
        item_summary_free(machine_detail->item);
        machine_detail->item = NULL;
    }
    if (machine_detail->version_group) {
        version_group_summary_free(machine_detail->version_group);
        machine_detail->version_group = NULL;
    }
    if (machine_detail->move) {
        move_summary_free(machine_detail->move);
        machine_detail->move = NULL;
    }
    free(machine_detail);
}

cJSON *machine_detail_convertToJSON(machine_detail_t *machine_detail) {
    cJSON *item = cJSON_CreateObject();

    // machine_detail->id
    if (!machine_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", machine_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // machine_detail->item
    if (!machine_detail->item) {
        goto fail;
    }
    cJSON *item_local_JSON = item_summary_convertToJSON(machine_detail->item);
    if(item_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "item", item_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // machine_detail->version_group
    if (!machine_detail->version_group) {
        goto fail;
    }
    cJSON *version_group_local_JSON = version_group_summary_convertToJSON(machine_detail->version_group);
    if(version_group_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "version_group", version_group_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // machine_detail->move
    if (!machine_detail->move) {
        goto fail;
    }
    cJSON *move_local_JSON = move_summary_convertToJSON(machine_detail->move);
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

machine_detail_t *machine_detail_parseFromJSON(cJSON *machine_detailJSON){

    machine_detail_t *machine_detail_local_var = NULL;

    // define the local variable for machine_detail->item
    item_summary_t *item_local_nonprim = NULL;

    // define the local variable for machine_detail->version_group
    version_group_summary_t *version_group_local_nonprim = NULL;

    // define the local variable for machine_detail->move
    move_summary_t *move_local_nonprim = NULL;

    // machine_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(machine_detailJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // machine_detail->item
    cJSON *item = cJSON_GetObjectItemCaseSensitive(machine_detailJSON, "item");
    if (cJSON_IsNull(item)) {
        item = NULL;
    }
    if (!item) {
        goto end;
    }

    
    item_local_nonprim = item_summary_parseFromJSON(item); //nonprimitive

    // machine_detail->version_group
    cJSON *version_group = cJSON_GetObjectItemCaseSensitive(machine_detailJSON, "version_group");
    if (cJSON_IsNull(version_group)) {
        version_group = NULL;
    }
    if (!version_group) {
        goto end;
    }

    
    version_group_local_nonprim = version_group_summary_parseFromJSON(version_group); //nonprimitive

    // machine_detail->move
    cJSON *move = cJSON_GetObjectItemCaseSensitive(machine_detailJSON, "move");
    if (cJSON_IsNull(move)) {
        move = NULL;
    }
    if (!move) {
        goto end;
    }

    
    move_local_nonprim = move_summary_parseFromJSON(move); //nonprimitive


    machine_detail_local_var = machine_detail_create_internal (
        id->valuedouble,
        item_local_nonprim,
        version_group_local_nonprim,
        move_local_nonprim
        );

    return machine_detail_local_var;
end:
    if (item_local_nonprim) {
        item_summary_free(item_local_nonprim);
        item_local_nonprim = NULL;
    }
    if (version_group_local_nonprim) {
        version_group_summary_free(version_group_local_nonprim);
        version_group_local_nonprim = NULL;
    }
    if (move_local_nonprim) {
        move_summary_free(move_local_nonprim);
        move_local_nonprim = NULL;
    }
    return NULL;

}
