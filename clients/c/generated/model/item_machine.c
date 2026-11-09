#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_machine.h"



static item_machine_t *item_machine_create_internal(
    machine_summary_t *machine,
    version_group_summary_t *version_group
    ) {
    item_machine_t *item_machine_local_var = malloc(sizeof(item_machine_t));
    if (!item_machine_local_var) {
        return NULL;
    }
    memset(item_machine_local_var, 0, sizeof(item_machine_t));
    item_machine_local_var->_library_owned = 1;
    item_machine_local_var->machine = machine;
    item_machine_local_var->version_group = version_group;
    return item_machine_local_var;
}

__attribute__((deprecated)) item_machine_t *item_machine_create(
    machine_summary_t *machine,
    version_group_summary_t *version_group
    ) {
    item_machine_t *result = item_machine_create_internal (
        machine,
        version_group
        );
    if (!result) {
    }
    return result;
}

void item_machine_free(item_machine_t *item_machine) {
    if(NULL == item_machine){
        return ;
    }
    if(item_machine->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_machine_free");
        return ;
    }
    listEntry_t *listEntry;
    if (item_machine->machine) {
        machine_summary_free(item_machine->machine);
        item_machine->machine = NULL;
    }
    if (item_machine->version_group) {
        version_group_summary_free(item_machine->version_group);
        item_machine->version_group = NULL;
    }
    free(item_machine);
}

cJSON *item_machine_convertToJSON(item_machine_t *item_machine) {
    cJSON *item = cJSON_CreateObject();

    // item_machine->machine
    if (!item_machine->machine) {
        goto fail;
    }
    cJSON *machine_local_JSON = machine_summary_convertToJSON(item_machine->machine);
    if(machine_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "machine", machine_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // item_machine->version_group
    if (!item_machine->version_group) {
        goto fail;
    }
    cJSON *version_group_local_JSON = version_group_summary_convertToJSON(item_machine->version_group);
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

item_machine_t *item_machine_parseFromJSON(cJSON *item_machineJSON){

    item_machine_t *item_machine_local_var = NULL;

    // define the local variable for item_machine->machine
    machine_summary_t *machine_local_nonprim = NULL;

    // define the local variable for item_machine->version_group
    version_group_summary_t *version_group_local_nonprim = NULL;

    // item_machine->machine
    cJSON *machine = cJSON_GetObjectItemCaseSensitive(item_machineJSON, "machine");
    if (cJSON_IsNull(machine)) {
        machine = NULL;
    }
    if (!machine) {
        goto end;
    }

    
    machine_local_nonprim = machine_summary_parseFromJSON(machine); //nonprimitive

    // item_machine->version_group
    cJSON *version_group = cJSON_GetObjectItemCaseSensitive(item_machineJSON, "version_group");
    if (cJSON_IsNull(version_group)) {
        version_group = NULL;
    }
    if (!version_group) {
        goto end;
    }

    
    version_group_local_nonprim = version_group_summary_parseFromJSON(version_group); //nonprimitive



    item_machine_local_var = item_machine_create_internal (
        machine_local_nonprim,
        version_group_local_nonprim
        );

    if (!item_machine_local_var) {
        goto end;
    }

    return item_machine_local_var;
end:
    if (machine_local_nonprim) {
        machine_summary_free(machine_local_nonprim);
        machine_local_nonprim = NULL;
    }
    if (version_group_local_nonprim) {
        version_group_summary_free(version_group_local_nonprim);
        version_group_local_nonprim = NULL;
    }
    return NULL;

}
