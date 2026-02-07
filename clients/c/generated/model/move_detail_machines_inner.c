#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_detail_machines_inner.h"



static move_detail_machines_inner_t *move_detail_machines_inner_create_internal(
    move_detail_machines_inner_machine_t *machine,
    ability_detail_pokemon_inner_pokemon_t *version_group
    ) {
    move_detail_machines_inner_t *move_detail_machines_inner_local_var = malloc(sizeof(move_detail_machines_inner_t));
    if (!move_detail_machines_inner_local_var) {
        return NULL;
    }
    move_detail_machines_inner_local_var->machine = machine;
    move_detail_machines_inner_local_var->version_group = version_group;

    move_detail_machines_inner_local_var->_library_owned = 1;
    return move_detail_machines_inner_local_var;
}

__attribute__((deprecated)) move_detail_machines_inner_t *move_detail_machines_inner_create(
    move_detail_machines_inner_machine_t *machine,
    ability_detail_pokemon_inner_pokemon_t *version_group
    ) {
    return move_detail_machines_inner_create_internal (
        machine,
        version_group
        );
}

void move_detail_machines_inner_free(move_detail_machines_inner_t *move_detail_machines_inner) {
    if(NULL == move_detail_machines_inner){
        return ;
    }
    if(move_detail_machines_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_detail_machines_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_detail_machines_inner->machine) {
        move_detail_machines_inner_machine_free(move_detail_machines_inner->machine);
        move_detail_machines_inner->machine = NULL;
    }
    if (move_detail_machines_inner->version_group) {
        ability_detail_pokemon_inner_pokemon_free(move_detail_machines_inner->version_group);
        move_detail_machines_inner->version_group = NULL;
    }
    free(move_detail_machines_inner);
}

cJSON *move_detail_machines_inner_convertToJSON(move_detail_machines_inner_t *move_detail_machines_inner) {
    cJSON *item = cJSON_CreateObject();

    // move_detail_machines_inner->machine
    if (!move_detail_machines_inner->machine) {
        goto fail;
    }
    cJSON *machine_local_JSON = move_detail_machines_inner_machine_convertToJSON(move_detail_machines_inner->machine);
    if(machine_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "machine", machine_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // move_detail_machines_inner->version_group
    if (!move_detail_machines_inner->version_group) {
        goto fail;
    }
    cJSON *version_group_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(move_detail_machines_inner->version_group);
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

move_detail_machines_inner_t *move_detail_machines_inner_parseFromJSON(cJSON *move_detail_machines_innerJSON){

    move_detail_machines_inner_t *move_detail_machines_inner_local_var = NULL;

    // define the local variable for move_detail_machines_inner->machine
    move_detail_machines_inner_machine_t *machine_local_nonprim = NULL;

    // define the local variable for move_detail_machines_inner->version_group
    ability_detail_pokemon_inner_pokemon_t *version_group_local_nonprim = NULL;

    // move_detail_machines_inner->machine
    cJSON *machine = cJSON_GetObjectItemCaseSensitive(move_detail_machines_innerJSON, "machine");
    if (cJSON_IsNull(machine)) {
        machine = NULL;
    }
    if (!machine) {
        goto end;
    }

    
    machine_local_nonprim = move_detail_machines_inner_machine_parseFromJSON(machine); //nonprimitive

    // move_detail_machines_inner->version_group
    cJSON *version_group = cJSON_GetObjectItemCaseSensitive(move_detail_machines_innerJSON, "version_group");
    if (cJSON_IsNull(version_group)) {
        version_group = NULL;
    }
    if (!version_group) {
        goto end;
    }

    
    version_group_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(version_group); //nonprimitive


    move_detail_machines_inner_local_var = move_detail_machines_inner_create_internal (
        machine_local_nonprim,
        version_group_local_nonprim
        );

    return move_detail_machines_inner_local_var;
end:
    if (machine_local_nonprim) {
        move_detail_machines_inner_machine_free(machine_local_nonprim);
        machine_local_nonprim = NULL;
    }
    if (version_group_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(version_group_local_nonprim);
        version_group_local_nonprim = NULL;
    }
    return NULL;

}
