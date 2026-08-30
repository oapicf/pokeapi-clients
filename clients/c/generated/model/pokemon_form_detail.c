#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_form_detail.h"



static pokemon_form_detail_t *pokemon_form_detail_create_internal(
    int *id,
    char *name,
    int *order,
    int *form_order,
    int *is_default,
    int *is_battle_only,
    int *is_mega,
    char *form_name,
    pokemon_summary_t *pokemon,
    pokemon_form_detail_sprites_t *sprites,
    version_group_summary_t *version_group,
    list_t *form_names,
    list_t *names,
    list_t *types
    ) {
    pokemon_form_detail_t *pokemon_form_detail_local_var = malloc(sizeof(pokemon_form_detail_t));
    if (!pokemon_form_detail_local_var) {
        return NULL;
    }
    memset(pokemon_form_detail_local_var, 0, sizeof(pokemon_form_detail_t));
    pokemon_form_detail_local_var->_library_owned = 1;
    pokemon_form_detail_local_var->id = id;
    pokemon_form_detail_local_var->name = name;
    pokemon_form_detail_local_var->order = order;
    pokemon_form_detail_local_var->form_order = form_order;
    pokemon_form_detail_local_var->is_default = is_default;
    pokemon_form_detail_local_var->is_battle_only = is_battle_only;
    pokemon_form_detail_local_var->is_mega = is_mega;
    pokemon_form_detail_local_var->form_name = form_name;
    pokemon_form_detail_local_var->pokemon = pokemon;
    pokemon_form_detail_local_var->sprites = sprites;
    pokemon_form_detail_local_var->version_group = version_group;
    pokemon_form_detail_local_var->form_names = form_names;
    pokemon_form_detail_local_var->names = names;
    pokemon_form_detail_local_var->types = types;
    return pokemon_form_detail_local_var;
}

__attribute__((deprecated)) pokemon_form_detail_t *pokemon_form_detail_create(
    int *id,
    char *name,
    int *order,
    int *form_order,
    int *is_default,
    int *is_battle_only,
    int *is_mega,
    char *form_name,
    pokemon_summary_t *pokemon,
    pokemon_form_detail_sprites_t *sprites,
    version_group_summary_t *version_group,
    list_t *form_names,
    list_t *names,
    list_t *types
    ) {
    int *id_copy = NULL;
    if (id) {
        id_copy = malloc(sizeof(int));
        if (id_copy) *id_copy = *id;
    }
    int *order_copy = NULL;
    if (order) {
        order_copy = malloc(sizeof(int));
        if (order_copy) *order_copy = *order;
    }
    int *form_order_copy = NULL;
    if (form_order) {
        form_order_copy = malloc(sizeof(int));
        if (form_order_copy) *form_order_copy = *form_order;
    }
    int *is_default_copy = NULL;
    if (is_default) {
        is_default_copy = malloc(sizeof(int));
        if (is_default_copy) *is_default_copy = *is_default;
    }
    int *is_battle_only_copy = NULL;
    if (is_battle_only) {
        is_battle_only_copy = malloc(sizeof(int));
        if (is_battle_only_copy) *is_battle_only_copy = *is_battle_only;
    }
    int *is_mega_copy = NULL;
    if (is_mega) {
        is_mega_copy = malloc(sizeof(int));
        if (is_mega_copy) *is_mega_copy = *is_mega;
    }
    pokemon_form_detail_t *result = pokemon_form_detail_create_internal (
        id_copy,
        name,
        order_copy,
        form_order_copy,
        is_default_copy,
        is_battle_only_copy,
        is_mega_copy,
        form_name,
        pokemon,
        sprites,
        version_group,
        form_names,
        names,
        types
        );
    if (!result) {
        free(id_copy);
        free(order_copy);
        free(form_order_copy);
        free(is_default_copy);
        free(is_battle_only_copy);
        free(is_mega_copy);
    }
    return result;
}

void pokemon_form_detail_free(pokemon_form_detail_t *pokemon_form_detail) {
    if(NULL == pokemon_form_detail){
        return ;
    }
    if(pokemon_form_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_form_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_form_detail->id) {
        free(pokemon_form_detail->id);
        pokemon_form_detail->id = NULL;
    }
    if (pokemon_form_detail->name) {
        free(pokemon_form_detail->name);
        pokemon_form_detail->name = NULL;
    }
    if (pokemon_form_detail->order) {
        free(pokemon_form_detail->order);
        pokemon_form_detail->order = NULL;
    }
    if (pokemon_form_detail->form_order) {
        free(pokemon_form_detail->form_order);
        pokemon_form_detail->form_order = NULL;
    }
    if (pokemon_form_detail->is_default) {
        free(pokemon_form_detail->is_default);
        pokemon_form_detail->is_default = NULL;
    }
    if (pokemon_form_detail->is_battle_only) {
        free(pokemon_form_detail->is_battle_only);
        pokemon_form_detail->is_battle_only = NULL;
    }
    if (pokemon_form_detail->is_mega) {
        free(pokemon_form_detail->is_mega);
        pokemon_form_detail->is_mega = NULL;
    }
    if (pokemon_form_detail->form_name) {
        free(pokemon_form_detail->form_name);
        pokemon_form_detail->form_name = NULL;
    }
    if (pokemon_form_detail->pokemon) {
        pokemon_summary_free(pokemon_form_detail->pokemon);
        pokemon_form_detail->pokemon = NULL;
    }
    if (pokemon_form_detail->sprites) {
        pokemon_form_detail_sprites_free(pokemon_form_detail->sprites);
        pokemon_form_detail->sprites = NULL;
    }
    if (pokemon_form_detail->version_group) {
        version_group_summary_free(pokemon_form_detail->version_group);
        pokemon_form_detail->version_group = NULL;
    }
    if (pokemon_form_detail->form_names) {
        list_ForEach(listEntry, pokemon_form_detail->form_names) {
            pokemon_form_detail_form_names_inner_free(listEntry->data);
        }
        list_freeList(pokemon_form_detail->form_names);
        pokemon_form_detail->form_names = NULL;
    }
    if (pokemon_form_detail->names) {
        list_ForEach(listEntry, pokemon_form_detail->names) {
            pokemon_form_detail_form_names_inner_free(listEntry->data);
        }
        list_freeList(pokemon_form_detail->names);
        pokemon_form_detail->names = NULL;
    }
    if (pokemon_form_detail->types) {
        list_ForEach(listEntry, pokemon_form_detail->types) {
            pokemon_detail_types_inner_free(listEntry->data);
        }
        list_freeList(pokemon_form_detail->types);
        pokemon_form_detail->types = NULL;
    }
    free(pokemon_form_detail);
}

cJSON *pokemon_form_detail_convertToJSON(pokemon_form_detail_t *pokemon_form_detail) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_form_detail->id
    if (!pokemon_form_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", *pokemon_form_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // pokemon_form_detail->name
    if (!pokemon_form_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", pokemon_form_detail->name) == NULL) {
    goto fail; //String
    }


    // pokemon_form_detail->order
    if(pokemon_form_detail->order) {
    if(cJSON_AddNumberToObject(item, "order", *pokemon_form_detail->order) == NULL) {
    goto fail; //Numeric
    }
    }


    // pokemon_form_detail->form_order
    if(pokemon_form_detail->form_order) {
    if(cJSON_AddNumberToObject(item, "form_order", *pokemon_form_detail->form_order) == NULL) {
    goto fail; //Numeric
    }
    }


    // pokemon_form_detail->is_default
    if(pokemon_form_detail->is_default) {
    if(cJSON_AddBoolToObject(item, "is_default", *pokemon_form_detail->is_default) == NULL) {
    goto fail; //Bool
    }
    }


    // pokemon_form_detail->is_battle_only
    if(pokemon_form_detail->is_battle_only) {
    if(cJSON_AddBoolToObject(item, "is_battle_only", *pokemon_form_detail->is_battle_only) == NULL) {
    goto fail; //Bool
    }
    }


    // pokemon_form_detail->is_mega
    if(pokemon_form_detail->is_mega) {
    if(cJSON_AddBoolToObject(item, "is_mega", *pokemon_form_detail->is_mega) == NULL) {
    goto fail; //Bool
    }
    }


    // pokemon_form_detail->form_name
    if (!pokemon_form_detail->form_name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "form_name", pokemon_form_detail->form_name) == NULL) {
    goto fail; //String
    }


    // pokemon_form_detail->pokemon
    if (!pokemon_form_detail->pokemon) {
        goto fail;
    }
    cJSON *pokemon_local_JSON = pokemon_summary_convertToJSON(pokemon_form_detail->pokemon);
    if(pokemon_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pokemon", pokemon_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_form_detail->sprites
    if (!pokemon_form_detail->sprites) {
        goto fail;
    }
    cJSON *sprites_local_JSON = pokemon_form_detail_sprites_convertToJSON(pokemon_form_detail->sprites);
    if(sprites_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "sprites", sprites_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }


    // pokemon_form_detail->version_group
    if (!pokemon_form_detail->version_group) {
        goto fail;
    }
    cJSON *version_group_local_JSON = version_group_summary_convertToJSON(pokemon_form_detail->version_group);
    if(version_group_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "version_group", version_group_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokemon_form_detail->form_names
    if (!pokemon_form_detail->form_names) {
        goto fail;
    }
    cJSON *form_names = cJSON_AddArrayToObject(item, "form_names");
    if(form_names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *form_namesListEntry;
    if (pokemon_form_detail->form_names) {
    list_ForEach(form_namesListEntry, pokemon_form_detail->form_names) {
    cJSON *itemLocal = pokemon_form_detail_form_names_inner_convertToJSON(form_namesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(form_names, itemLocal);
    }
    }


    // pokemon_form_detail->names
    if (!pokemon_form_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (pokemon_form_detail->names) {
    list_ForEach(namesListEntry, pokemon_form_detail->names) {
    cJSON *itemLocal = pokemon_form_detail_form_names_inner_convertToJSON(namesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(names, itemLocal);
    }
    }


    // pokemon_form_detail->types
    if (!pokemon_form_detail->types) {
        goto fail;
    }
    cJSON *types = cJSON_AddArrayToObject(item, "types");
    if(types == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *typesListEntry;
    if (pokemon_form_detail->types) {
    list_ForEach(typesListEntry, pokemon_form_detail->types) {
    cJSON *itemLocal = pokemon_detail_types_inner_convertToJSON(typesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(types, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_form_detail_t *pokemon_form_detail_parseFromJSON(cJSON *pokemon_form_detailJSON){

    pokemon_form_detail_t *pokemon_form_detail_local_var = NULL;

    // define the local variable for pokemon_form_detail->id
    int *id_local_var = NULL;

    char *name_local_str = NULL;

    // define the local variable for pokemon_form_detail->order
    int *order_local_var = NULL;

    // define the local variable for pokemon_form_detail->form_order
    int *form_order_local_var = NULL;

    // define the local variable for pokemon_form_detail->is_default
    int *is_default_local_var = NULL;

    // define the local variable for pokemon_form_detail->is_battle_only
    int *is_battle_only_local_var = NULL;

    // define the local variable for pokemon_form_detail->is_mega
    int *is_mega_local_var = NULL;

    char *form_name_local_str = NULL;

    // define the local variable for pokemon_form_detail->pokemon
    pokemon_summary_t *pokemon_local_nonprim = NULL;

    // define the local variable for pokemon_form_detail->sprites
    pokemon_form_detail_sprites_t *sprites_local_nonprim = NULL;

    // define the local variable for pokemon_form_detail->version_group
    version_group_summary_t *version_group_local_nonprim = NULL;

    // define the local list for pokemon_form_detail->form_names
    list_t *form_namesList = NULL;

    // define the local list for pokemon_form_detail->names
    list_t *namesList = NULL;

    // define the local list for pokemon_form_detail->types
    list_t *typesList = NULL;

    // pokemon_form_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(pokemon_form_detailJSON, "id");
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
    id_local_var = malloc(sizeof(int));
    if(!id_local_var)
    {
        goto end;
    }
    *id_local_var = id->valuedouble;

    // pokemon_form_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(pokemon_form_detailJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // pokemon_form_detail->order
    cJSON *order = cJSON_GetObjectItemCaseSensitive(pokemon_form_detailJSON, "order");
    if (cJSON_IsNull(order)) {
        order = NULL;
    }
    if (order) { 
    if(!cJSON_IsNumber(order))
    {
    goto end; //Numeric
    }
    order_local_var = malloc(sizeof(int));
    if(!order_local_var)
    {
        goto end;
    }
    *order_local_var = order->valuedouble;
    }

    // pokemon_form_detail->form_order
    cJSON *form_order = cJSON_GetObjectItemCaseSensitive(pokemon_form_detailJSON, "form_order");
    if (cJSON_IsNull(form_order)) {
        form_order = NULL;
    }
    if (form_order) { 
    if(!cJSON_IsNumber(form_order))
    {
    goto end; //Numeric
    }
    form_order_local_var = malloc(sizeof(int));
    if(!form_order_local_var)
    {
        goto end;
    }
    *form_order_local_var = form_order->valuedouble;
    }

    // pokemon_form_detail->is_default
    cJSON *is_default = cJSON_GetObjectItemCaseSensitive(pokemon_form_detailJSON, "is_default");
    if (cJSON_IsNull(is_default)) {
        is_default = NULL;
    }
    if (is_default) { 
    if(!cJSON_IsBool(is_default))
    {
    goto end; //Bool
    }
    is_default_local_var = malloc(sizeof(int));
    if(!is_default_local_var)
    {
        goto end;
    }
    *is_default_local_var = is_default->valueint;
    }

    // pokemon_form_detail->is_battle_only
    cJSON *is_battle_only = cJSON_GetObjectItemCaseSensitive(pokemon_form_detailJSON, "is_battle_only");
    if (cJSON_IsNull(is_battle_only)) {
        is_battle_only = NULL;
    }
    if (is_battle_only) { 
    if(!cJSON_IsBool(is_battle_only))
    {
    goto end; //Bool
    }
    is_battle_only_local_var = malloc(sizeof(int));
    if(!is_battle_only_local_var)
    {
        goto end;
    }
    *is_battle_only_local_var = is_battle_only->valueint;
    }

    // pokemon_form_detail->is_mega
    cJSON *is_mega = cJSON_GetObjectItemCaseSensitive(pokemon_form_detailJSON, "is_mega");
    if (cJSON_IsNull(is_mega)) {
        is_mega = NULL;
    }
    if (is_mega) { 
    if(!cJSON_IsBool(is_mega))
    {
    goto end; //Bool
    }
    is_mega_local_var = malloc(sizeof(int));
    if(!is_mega_local_var)
    {
        goto end;
    }
    *is_mega_local_var = is_mega->valueint;
    }

    // pokemon_form_detail->form_name
    cJSON *form_name = cJSON_GetObjectItemCaseSensitive(pokemon_form_detailJSON, "form_name");
    if (cJSON_IsNull(form_name)) {
        form_name = NULL;
    }
    if (!form_name) {
        goto end;
    }

    
    if(!cJSON_IsString(form_name))
    {
    goto end; //String
    }

    // pokemon_form_detail->pokemon
    cJSON *pokemon = cJSON_GetObjectItemCaseSensitive(pokemon_form_detailJSON, "pokemon");
    if (cJSON_IsNull(pokemon)) {
        pokemon = NULL;
    }
    if (!pokemon) {
        goto end;
    }

    
    pokemon_local_nonprim = pokemon_summary_parseFromJSON(pokemon); //nonprimitive

    // pokemon_form_detail->sprites
    cJSON *sprites = cJSON_GetObjectItemCaseSensitive(pokemon_form_detailJSON, "sprites");
    if (cJSON_IsNull(sprites)) {
        sprites = NULL;
    }
    if (!sprites) {
        goto end;
    }

    
    sprites_local_nonprim = pokemon_form_detail_sprites_parseFromJSON(sprites); //custom

    // pokemon_form_detail->version_group
    cJSON *version_group = cJSON_GetObjectItemCaseSensitive(pokemon_form_detailJSON, "version_group");
    if (cJSON_IsNull(version_group)) {
        version_group = NULL;
    }
    if (!version_group) {
        goto end;
    }

    
    version_group_local_nonprim = version_group_summary_parseFromJSON(version_group); //nonprimitive

    // pokemon_form_detail->form_names
    cJSON *form_names = cJSON_GetObjectItemCaseSensitive(pokemon_form_detailJSON, "form_names");
    if (cJSON_IsNull(form_names)) {
        form_names = NULL;
    }
    if (!form_names) {
        goto end;
    }

    
    cJSON *form_names_local_nonprimitive = NULL;
    if(!cJSON_IsArray(form_names)){
        goto end; //nonprimitive container
    }

    form_namesList = list_createList();

    cJSON_ArrayForEach(form_names_local_nonprimitive,form_names )
    {
        if(!cJSON_IsObject(form_names_local_nonprimitive)){
            goto end;
        }
        pokemon_form_detail_form_names_inner_t *form_namesItem = pokemon_form_detail_form_names_inner_parseFromJSON(form_names_local_nonprimitive);

        list_addElement(form_namesList, form_namesItem);
    }

    // pokemon_form_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(pokemon_form_detailJSON, "names");
    if (cJSON_IsNull(names)) {
        names = NULL;
    }
    if (!names) {
        goto end;
    }

    
    cJSON *names_local_nonprimitive = NULL;
    if(!cJSON_IsArray(names)){
        goto end; //nonprimitive container
    }

    namesList = list_createList();

    cJSON_ArrayForEach(names_local_nonprimitive,names )
    {
        if(!cJSON_IsObject(names_local_nonprimitive)){
            goto end;
        }
        pokemon_form_detail_form_names_inner_t *namesItem = pokemon_form_detail_form_names_inner_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }

    // pokemon_form_detail->types
    cJSON *types = cJSON_GetObjectItemCaseSensitive(pokemon_form_detailJSON, "types");
    if (cJSON_IsNull(types)) {
        types = NULL;
    }
    if (!types) {
        goto end;
    }

    
    cJSON *types_local_nonprimitive = NULL;
    if(!cJSON_IsArray(types)){
        goto end; //nonprimitive container
    }

    typesList = list_createList();

    cJSON_ArrayForEach(types_local_nonprimitive,types )
    {
        if(!cJSON_IsObject(types_local_nonprimitive)){
            goto end;
        }
        pokemon_detail_types_inner_t *typesItem = pokemon_detail_types_inner_parseFromJSON(types_local_nonprimitive);

        list_addElement(typesList, typesItem);
    }


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (form_name && !cJSON_IsNull(form_name)) form_name_local_str = strdup(form_name->valuestring);

    pokemon_form_detail_local_var = pokemon_form_detail_create_internal (
        id_local_var,
        name_local_str,
        order_local_var,
        form_order_local_var,
        is_default_local_var,
        is_battle_only_local_var,
        is_mega_local_var,
        form_name_local_str,
        pokemon_local_nonprim,
        sprites_local_nonprim,
        version_group_local_nonprim,
        form_namesList,
        namesList,
        typesList
        );

    if (!pokemon_form_detail_local_var) {
        goto end;
    }

    return pokemon_form_detail_local_var;
end:
    if (id_local_var) {
        free(id_local_var);
        id_local_var = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (order_local_var) {
        free(order_local_var);
        order_local_var = NULL;
    }
    if (form_order_local_var) {
        free(form_order_local_var);
        form_order_local_var = NULL;
    }
    if (is_default_local_var) {
        free(is_default_local_var);
        is_default_local_var = NULL;
    }
    if (is_battle_only_local_var) {
        free(is_battle_only_local_var);
        is_battle_only_local_var = NULL;
    }
    if (is_mega_local_var) {
        free(is_mega_local_var);
        is_mega_local_var = NULL;
    }
    if (form_name_local_str) {
        free(form_name_local_str);
        form_name_local_str = NULL;
    }
    if (pokemon_local_nonprim) {
        pokemon_summary_free(pokemon_local_nonprim);
        pokemon_local_nonprim = NULL;
    }
    if (sprites_local_nonprim) {
        pokemon_form_detail_sprites_free(sprites_local_nonprim);
        sprites_local_nonprim = NULL;
    }
    if (version_group_local_nonprim) {
        version_group_summary_free(version_group_local_nonprim);
        version_group_local_nonprim = NULL;
    }
    if (form_namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, form_namesList) {
            pokemon_form_detail_form_names_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(form_namesList);
        form_namesList = NULL;
    }
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            pokemon_form_detail_form_names_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    if (typesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, typesList) {
            pokemon_detail_types_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(typesList);
        typesList = NULL;
    }
    return NULL;

}
