#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_detail_machines_inner.h"



static item_detail_machines_inner_t *item_detail_machines_inner_create_internal(
    char *machine,
    ability_detail_pokemon_inner_pokemon_t *version_group
    ) {
    item_detail_machines_inner_t *item_detail_machines_inner_local_var = malloc(sizeof(item_detail_machines_inner_t));
    if (!item_detail_machines_inner_local_var) {
        return NULL;
    }
    item_detail_machines_inner_local_var->machine = machine;
    item_detail_machines_inner_local_var->version_group = version_group;

    item_detail_machines_inner_local_var->_library_owned = 1;
    return item_detail_machines_inner_local_var;
}

__attribute__((deprecated)) item_detail_machines_inner_t *item_detail_machines_inner_create(
    char *machine,
    ability_detail_pokemon_inner_pokemon_t *version_group
    ) {
    return item_detail_machines_inner_create_internal (
        machine,
        version_group
        );
}

void item_detail_machines_inner_free(item_detail_machines_inner_t *item_detail_machines_inner) {
    if(NULL == item_detail_machines_inner){
        return ;
    }
    if(item_detail_machines_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_detail_machines_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (item_detail_machines_inner->machine) {
        free(item_detail_machines_inner->machine);
        item_detail_machines_inner->machine = NULL;
    }
    if (item_detail_machines_inner->version_group) {
        ability_detail_pokemon_inner_pokemon_free(item_detail_machines_inner->version_group);
        item_detail_machines_inner->version_group = NULL;
    }
    free(item_detail_machines_inner);
}

cJSON *item_detail_machines_inner_convertToJSON(item_detail_machines_inner_t *item_detail_machines_inner) {
    cJSON *item = cJSON_CreateObject();

    // item_detail_machines_inner->machine
    if (!item_detail_machines_inner->machine) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "machine", item_detail_machines_inner->machine) == NULL) {
    goto fail; //String
    }


    // item_detail_machines_inner->version_group
    if (!item_detail_machines_inner->version_group) {
        goto fail;
    }
    cJSON *version_group_local_JSON = ability_detail_pokemon_inner_pokemon_convertToJSON(item_detail_machines_inner->version_group);
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

item_detail_machines_inner_t *item_detail_machines_inner_parseFromJSON(cJSON *item_detail_machines_innerJSON){

    item_detail_machines_inner_t *item_detail_machines_inner_local_var = NULL;

    // define the local variable for item_detail_machines_inner->version_group
    ability_detail_pokemon_inner_pokemon_t *version_group_local_nonprim = NULL;

    // item_detail_machines_inner->machine
    cJSON *machine = cJSON_GetObjectItemCaseSensitive(item_detail_machines_innerJSON, "machine");
    if (cJSON_IsNull(machine)) {
        machine = NULL;
    }
    if (!machine) {
        goto end;
    }

    
    if(!cJSON_IsString(machine))
    {
    goto end; //String
    }

    // item_detail_machines_inner->version_group
    cJSON *version_group = cJSON_GetObjectItemCaseSensitive(item_detail_machines_innerJSON, "version_group");
    if (cJSON_IsNull(version_group)) {
        version_group = NULL;
    }
    if (!version_group) {
        goto end;
    }

    
    version_group_local_nonprim = ability_detail_pokemon_inner_pokemon_parseFromJSON(version_group); //nonprimitive


    item_detail_machines_inner_local_var = item_detail_machines_inner_create_internal (
        strdup(machine->valuestring),
        version_group_local_nonprim
        );

    return item_detail_machines_inner_local_var;
end:
    if (version_group_local_nonprim) {
        ability_detail_pokemon_inner_pokemon_free(version_group_local_nonprim);
        version_group_local_nonprim = NULL;
    }
    return NULL;

}
