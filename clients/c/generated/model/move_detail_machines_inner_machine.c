#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_detail_machines_inner_machine.h"



static move_detail_machines_inner_machine_t *move_detail_machines_inner_machine_create_internal(
    char *url
    ) {
    move_detail_machines_inner_machine_t *move_detail_machines_inner_machine_local_var = malloc(sizeof(move_detail_machines_inner_machine_t));
    if (!move_detail_machines_inner_machine_local_var) {
        return NULL;
    }
    move_detail_machines_inner_machine_local_var->url = url;

    move_detail_machines_inner_machine_local_var->_library_owned = 1;
    return move_detail_machines_inner_machine_local_var;
}

__attribute__((deprecated)) move_detail_machines_inner_machine_t *move_detail_machines_inner_machine_create(
    char *url
    ) {
    return move_detail_machines_inner_machine_create_internal (
        url
        );
}

void move_detail_machines_inner_machine_free(move_detail_machines_inner_machine_t *move_detail_machines_inner_machine) {
    if(NULL == move_detail_machines_inner_machine){
        return ;
    }
    if(move_detail_machines_inner_machine->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_detail_machines_inner_machine_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_detail_machines_inner_machine->url) {
        free(move_detail_machines_inner_machine->url);
        move_detail_machines_inner_machine->url = NULL;
    }
    free(move_detail_machines_inner_machine);
}

cJSON *move_detail_machines_inner_machine_convertToJSON(move_detail_machines_inner_machine_t *move_detail_machines_inner_machine) {
    cJSON *item = cJSON_CreateObject();

    // move_detail_machines_inner_machine->url
    if (!move_detail_machines_inner_machine->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", move_detail_machines_inner_machine->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

move_detail_machines_inner_machine_t *move_detail_machines_inner_machine_parseFromJSON(cJSON *move_detail_machines_inner_machineJSON){

    move_detail_machines_inner_machine_t *move_detail_machines_inner_machine_local_var = NULL;

    // move_detail_machines_inner_machine->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(move_detail_machines_inner_machineJSON, "url");
    if (cJSON_IsNull(url)) {
        url = NULL;
    }
    if (!url) {
        goto end;
    }

    
    if(!cJSON_IsString(url))
    {
    goto end; //String
    }


    move_detail_machines_inner_machine_local_var = move_detail_machines_inner_machine_create_internal (
        strdup(url->valuestring)
        );

    return move_detail_machines_inner_machine_local_var;
end:
    return NULL;

}
