#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "type_detail_damage_relations.h"



static type_detail_damage_relations_t *type_detail_damage_relations_create_internal(
    list_t *no_damage_to,
    list_t *half_damage_to,
    list_t *double_damage_to,
    list_t *no_damage_from,
    list_t *half_damage_from,
    list_t *double_damage_from
    ) {
    type_detail_damage_relations_t *type_detail_damage_relations_local_var = malloc(sizeof(type_detail_damage_relations_t));
    if (!type_detail_damage_relations_local_var) {
        return NULL;
    }
    type_detail_damage_relations_local_var->no_damage_to = no_damage_to;
    type_detail_damage_relations_local_var->half_damage_to = half_damage_to;
    type_detail_damage_relations_local_var->double_damage_to = double_damage_to;
    type_detail_damage_relations_local_var->no_damage_from = no_damage_from;
    type_detail_damage_relations_local_var->half_damage_from = half_damage_from;
    type_detail_damage_relations_local_var->double_damage_from = double_damage_from;

    type_detail_damage_relations_local_var->_library_owned = 1;
    return type_detail_damage_relations_local_var;
}

__attribute__((deprecated)) type_detail_damage_relations_t *type_detail_damage_relations_create(
    list_t *no_damage_to,
    list_t *half_damage_to,
    list_t *double_damage_to,
    list_t *no_damage_from,
    list_t *half_damage_from,
    list_t *double_damage_from
    ) {
    return type_detail_damage_relations_create_internal (
        no_damage_to,
        half_damage_to,
        double_damage_to,
        no_damage_from,
        half_damage_from,
        double_damage_from
        );
}

void type_detail_damage_relations_free(type_detail_damage_relations_t *type_detail_damage_relations) {
    if(NULL == type_detail_damage_relations){
        return ;
    }
    if(type_detail_damage_relations->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "type_detail_damage_relations_free");
        return ;
    }
    listEntry_t *listEntry;
    if (type_detail_damage_relations->no_damage_to) {
        list_ForEach(listEntry, type_detail_damage_relations->no_damage_to) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
        }
        list_freeList(type_detail_damage_relations->no_damage_to);
        type_detail_damage_relations->no_damage_to = NULL;
    }
    if (type_detail_damage_relations->half_damage_to) {
        list_ForEach(listEntry, type_detail_damage_relations->half_damage_to) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
        }
        list_freeList(type_detail_damage_relations->half_damage_to);
        type_detail_damage_relations->half_damage_to = NULL;
    }
    if (type_detail_damage_relations->double_damage_to) {
        list_ForEach(listEntry, type_detail_damage_relations->double_damage_to) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
        }
        list_freeList(type_detail_damage_relations->double_damage_to);
        type_detail_damage_relations->double_damage_to = NULL;
    }
    if (type_detail_damage_relations->no_damage_from) {
        list_ForEach(listEntry, type_detail_damage_relations->no_damage_from) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
        }
        list_freeList(type_detail_damage_relations->no_damage_from);
        type_detail_damage_relations->no_damage_from = NULL;
    }
    if (type_detail_damage_relations->half_damage_from) {
        list_ForEach(listEntry, type_detail_damage_relations->half_damage_from) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
        }
        list_freeList(type_detail_damage_relations->half_damage_from);
        type_detail_damage_relations->half_damage_from = NULL;
    }
    if (type_detail_damage_relations->double_damage_from) {
        list_ForEach(listEntry, type_detail_damage_relations->double_damage_from) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
        }
        list_freeList(type_detail_damage_relations->double_damage_from);
        type_detail_damage_relations->double_damage_from = NULL;
    }
    free(type_detail_damage_relations);
}

cJSON *type_detail_damage_relations_convertToJSON(type_detail_damage_relations_t *type_detail_damage_relations) {
    cJSON *item = cJSON_CreateObject();

    // type_detail_damage_relations->no_damage_to
    if (!type_detail_damage_relations->no_damage_to) {
        goto fail;
    }
    cJSON *no_damage_to = cJSON_AddArrayToObject(item, "no_damage_to");
    if(no_damage_to == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *no_damage_toListEntry;
    if (type_detail_damage_relations->no_damage_to) {
    list_ForEach(no_damage_toListEntry, type_detail_damage_relations->no_damage_to) {
    cJSON *itemLocal = ability_detail_pokemon_inner_pokemon_convertToJSON(no_damage_toListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(no_damage_to, itemLocal);
    }
    }


    // type_detail_damage_relations->half_damage_to
    if (!type_detail_damage_relations->half_damage_to) {
        goto fail;
    }
    cJSON *half_damage_to = cJSON_AddArrayToObject(item, "half_damage_to");
    if(half_damage_to == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *half_damage_toListEntry;
    if (type_detail_damage_relations->half_damage_to) {
    list_ForEach(half_damage_toListEntry, type_detail_damage_relations->half_damage_to) {
    cJSON *itemLocal = ability_detail_pokemon_inner_pokemon_convertToJSON(half_damage_toListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(half_damage_to, itemLocal);
    }
    }


    // type_detail_damage_relations->double_damage_to
    if (!type_detail_damage_relations->double_damage_to) {
        goto fail;
    }
    cJSON *double_damage_to = cJSON_AddArrayToObject(item, "double_damage_to");
    if(double_damage_to == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *double_damage_toListEntry;
    if (type_detail_damage_relations->double_damage_to) {
    list_ForEach(double_damage_toListEntry, type_detail_damage_relations->double_damage_to) {
    cJSON *itemLocal = ability_detail_pokemon_inner_pokemon_convertToJSON(double_damage_toListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(double_damage_to, itemLocal);
    }
    }


    // type_detail_damage_relations->no_damage_from
    if (!type_detail_damage_relations->no_damage_from) {
        goto fail;
    }
    cJSON *no_damage_from = cJSON_AddArrayToObject(item, "no_damage_from");
    if(no_damage_from == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *no_damage_fromListEntry;
    if (type_detail_damage_relations->no_damage_from) {
    list_ForEach(no_damage_fromListEntry, type_detail_damage_relations->no_damage_from) {
    cJSON *itemLocal = ability_detail_pokemon_inner_pokemon_convertToJSON(no_damage_fromListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(no_damage_from, itemLocal);
    }
    }


    // type_detail_damage_relations->half_damage_from
    if (!type_detail_damage_relations->half_damage_from) {
        goto fail;
    }
    cJSON *half_damage_from = cJSON_AddArrayToObject(item, "half_damage_from");
    if(half_damage_from == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *half_damage_fromListEntry;
    if (type_detail_damage_relations->half_damage_from) {
    list_ForEach(half_damage_fromListEntry, type_detail_damage_relations->half_damage_from) {
    cJSON *itemLocal = ability_detail_pokemon_inner_pokemon_convertToJSON(half_damage_fromListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(half_damage_from, itemLocal);
    }
    }


    // type_detail_damage_relations->double_damage_from
    if (!type_detail_damage_relations->double_damage_from) {
        goto fail;
    }
    cJSON *double_damage_from = cJSON_AddArrayToObject(item, "double_damage_from");
    if(double_damage_from == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *double_damage_fromListEntry;
    if (type_detail_damage_relations->double_damage_from) {
    list_ForEach(double_damage_fromListEntry, type_detail_damage_relations->double_damage_from) {
    cJSON *itemLocal = ability_detail_pokemon_inner_pokemon_convertToJSON(double_damage_fromListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(double_damage_from, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

type_detail_damage_relations_t *type_detail_damage_relations_parseFromJSON(cJSON *type_detail_damage_relationsJSON){

    type_detail_damage_relations_t *type_detail_damage_relations_local_var = NULL;

    // define the local list for type_detail_damage_relations->no_damage_to
    list_t *no_damage_toList = NULL;

    // define the local list for type_detail_damage_relations->half_damage_to
    list_t *half_damage_toList = NULL;

    // define the local list for type_detail_damage_relations->double_damage_to
    list_t *double_damage_toList = NULL;

    // define the local list for type_detail_damage_relations->no_damage_from
    list_t *no_damage_fromList = NULL;

    // define the local list for type_detail_damage_relations->half_damage_from
    list_t *half_damage_fromList = NULL;

    // define the local list for type_detail_damage_relations->double_damage_from
    list_t *double_damage_fromList = NULL;

    // type_detail_damage_relations->no_damage_to
    cJSON *no_damage_to = cJSON_GetObjectItemCaseSensitive(type_detail_damage_relationsJSON, "no_damage_to");
    if (cJSON_IsNull(no_damage_to)) {
        no_damage_to = NULL;
    }
    if (!no_damage_to) {
        goto end;
    }

    
    cJSON *no_damage_to_local_nonprimitive = NULL;
    if(!cJSON_IsArray(no_damage_to)){
        goto end; //nonprimitive container
    }

    no_damage_toList = list_createList();

    cJSON_ArrayForEach(no_damage_to_local_nonprimitive,no_damage_to )
    {
        if(!cJSON_IsObject(no_damage_to_local_nonprimitive)){
            goto end;
        }
        ability_detail_pokemon_inner_pokemon_t *no_damage_toItem = ability_detail_pokemon_inner_pokemon_parseFromJSON(no_damage_to_local_nonprimitive);

        list_addElement(no_damage_toList, no_damage_toItem);
    }

    // type_detail_damage_relations->half_damage_to
    cJSON *half_damage_to = cJSON_GetObjectItemCaseSensitive(type_detail_damage_relationsJSON, "half_damage_to");
    if (cJSON_IsNull(half_damage_to)) {
        half_damage_to = NULL;
    }
    if (!half_damage_to) {
        goto end;
    }

    
    cJSON *half_damage_to_local_nonprimitive = NULL;
    if(!cJSON_IsArray(half_damage_to)){
        goto end; //nonprimitive container
    }

    half_damage_toList = list_createList();

    cJSON_ArrayForEach(half_damage_to_local_nonprimitive,half_damage_to )
    {
        if(!cJSON_IsObject(half_damage_to_local_nonprimitive)){
            goto end;
        }
        ability_detail_pokemon_inner_pokemon_t *half_damage_toItem = ability_detail_pokemon_inner_pokemon_parseFromJSON(half_damage_to_local_nonprimitive);

        list_addElement(half_damage_toList, half_damage_toItem);
    }

    // type_detail_damage_relations->double_damage_to
    cJSON *double_damage_to = cJSON_GetObjectItemCaseSensitive(type_detail_damage_relationsJSON, "double_damage_to");
    if (cJSON_IsNull(double_damage_to)) {
        double_damage_to = NULL;
    }
    if (!double_damage_to) {
        goto end;
    }

    
    cJSON *double_damage_to_local_nonprimitive = NULL;
    if(!cJSON_IsArray(double_damage_to)){
        goto end; //nonprimitive container
    }

    double_damage_toList = list_createList();

    cJSON_ArrayForEach(double_damage_to_local_nonprimitive,double_damage_to )
    {
        if(!cJSON_IsObject(double_damage_to_local_nonprimitive)){
            goto end;
        }
        ability_detail_pokemon_inner_pokemon_t *double_damage_toItem = ability_detail_pokemon_inner_pokemon_parseFromJSON(double_damage_to_local_nonprimitive);

        list_addElement(double_damage_toList, double_damage_toItem);
    }

    // type_detail_damage_relations->no_damage_from
    cJSON *no_damage_from = cJSON_GetObjectItemCaseSensitive(type_detail_damage_relationsJSON, "no_damage_from");
    if (cJSON_IsNull(no_damage_from)) {
        no_damage_from = NULL;
    }
    if (!no_damage_from) {
        goto end;
    }

    
    cJSON *no_damage_from_local_nonprimitive = NULL;
    if(!cJSON_IsArray(no_damage_from)){
        goto end; //nonprimitive container
    }

    no_damage_fromList = list_createList();

    cJSON_ArrayForEach(no_damage_from_local_nonprimitive,no_damage_from )
    {
        if(!cJSON_IsObject(no_damage_from_local_nonprimitive)){
            goto end;
        }
        ability_detail_pokemon_inner_pokemon_t *no_damage_fromItem = ability_detail_pokemon_inner_pokemon_parseFromJSON(no_damage_from_local_nonprimitive);

        list_addElement(no_damage_fromList, no_damage_fromItem);
    }

    // type_detail_damage_relations->half_damage_from
    cJSON *half_damage_from = cJSON_GetObjectItemCaseSensitive(type_detail_damage_relationsJSON, "half_damage_from");
    if (cJSON_IsNull(half_damage_from)) {
        half_damage_from = NULL;
    }
    if (!half_damage_from) {
        goto end;
    }

    
    cJSON *half_damage_from_local_nonprimitive = NULL;
    if(!cJSON_IsArray(half_damage_from)){
        goto end; //nonprimitive container
    }

    half_damage_fromList = list_createList();

    cJSON_ArrayForEach(half_damage_from_local_nonprimitive,half_damage_from )
    {
        if(!cJSON_IsObject(half_damage_from_local_nonprimitive)){
            goto end;
        }
        ability_detail_pokemon_inner_pokemon_t *half_damage_fromItem = ability_detail_pokemon_inner_pokemon_parseFromJSON(half_damage_from_local_nonprimitive);

        list_addElement(half_damage_fromList, half_damage_fromItem);
    }

    // type_detail_damage_relations->double_damage_from
    cJSON *double_damage_from = cJSON_GetObjectItemCaseSensitive(type_detail_damage_relationsJSON, "double_damage_from");
    if (cJSON_IsNull(double_damage_from)) {
        double_damage_from = NULL;
    }
    if (!double_damage_from) {
        goto end;
    }

    
    cJSON *double_damage_from_local_nonprimitive = NULL;
    if(!cJSON_IsArray(double_damage_from)){
        goto end; //nonprimitive container
    }

    double_damage_fromList = list_createList();

    cJSON_ArrayForEach(double_damage_from_local_nonprimitive,double_damage_from )
    {
        if(!cJSON_IsObject(double_damage_from_local_nonprimitive)){
            goto end;
        }
        ability_detail_pokemon_inner_pokemon_t *double_damage_fromItem = ability_detail_pokemon_inner_pokemon_parseFromJSON(double_damage_from_local_nonprimitive);

        list_addElement(double_damage_fromList, double_damage_fromItem);
    }


    type_detail_damage_relations_local_var = type_detail_damage_relations_create_internal (
        no_damage_toList,
        half_damage_toList,
        double_damage_toList,
        no_damage_fromList,
        half_damage_fromList,
        double_damage_fromList
        );

    return type_detail_damage_relations_local_var;
end:
    if (no_damage_toList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, no_damage_toList) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(no_damage_toList);
        no_damage_toList = NULL;
    }
    if (half_damage_toList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, half_damage_toList) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(half_damage_toList);
        half_damage_toList = NULL;
    }
    if (double_damage_toList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, double_damage_toList) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(double_damage_toList);
        double_damage_toList = NULL;
    }
    if (no_damage_fromList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, no_damage_fromList) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(no_damage_fromList);
        no_damage_fromList = NULL;
    }
    if (half_damage_fromList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, half_damage_fromList) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(half_damage_fromList);
        half_damage_fromList = NULL;
    }
    if (double_damage_fromList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, double_damage_fromList) {
            ability_detail_pokemon_inner_pokemon_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(double_damage_fromList);
        double_damage_fromList = NULL;
    }
    return NULL;

}
