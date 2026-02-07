#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokeathlon_stat_detail.h"



static pokeathlon_stat_detail_t *pokeathlon_stat_detail_create_internal(
    int id,
    char *name,
    pokeathlon_stat_detail_affecting_natures_t *affecting_natures,
    list_t *names
    ) {
    pokeathlon_stat_detail_t *pokeathlon_stat_detail_local_var = malloc(sizeof(pokeathlon_stat_detail_t));
    if (!pokeathlon_stat_detail_local_var) {
        return NULL;
    }
    pokeathlon_stat_detail_local_var->id = id;
    pokeathlon_stat_detail_local_var->name = name;
    pokeathlon_stat_detail_local_var->affecting_natures = affecting_natures;
    pokeathlon_stat_detail_local_var->names = names;

    pokeathlon_stat_detail_local_var->_library_owned = 1;
    return pokeathlon_stat_detail_local_var;
}

__attribute__((deprecated)) pokeathlon_stat_detail_t *pokeathlon_stat_detail_create(
    int id,
    char *name,
    pokeathlon_stat_detail_affecting_natures_t *affecting_natures,
    list_t *names
    ) {
    return pokeathlon_stat_detail_create_internal (
        id,
        name,
        affecting_natures,
        names
        );
}

void pokeathlon_stat_detail_free(pokeathlon_stat_detail_t *pokeathlon_stat_detail) {
    if(NULL == pokeathlon_stat_detail){
        return ;
    }
    if(pokeathlon_stat_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokeathlon_stat_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokeathlon_stat_detail->name) {
        free(pokeathlon_stat_detail->name);
        pokeathlon_stat_detail->name = NULL;
    }
    if (pokeathlon_stat_detail->affecting_natures) {
        pokeathlon_stat_detail_affecting_natures_free(pokeathlon_stat_detail->affecting_natures);
        pokeathlon_stat_detail->affecting_natures = NULL;
    }
    if (pokeathlon_stat_detail->names) {
        list_ForEach(listEntry, pokeathlon_stat_detail->names) {
            pokeathlon_stat_name_free(listEntry->data);
        }
        list_freeList(pokeathlon_stat_detail->names);
        pokeathlon_stat_detail->names = NULL;
    }
    free(pokeathlon_stat_detail);
}

cJSON *pokeathlon_stat_detail_convertToJSON(pokeathlon_stat_detail_t *pokeathlon_stat_detail) {
    cJSON *item = cJSON_CreateObject();

    // pokeathlon_stat_detail->id
    if (!pokeathlon_stat_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", pokeathlon_stat_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // pokeathlon_stat_detail->name
    if (!pokeathlon_stat_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", pokeathlon_stat_detail->name) == NULL) {
    goto fail; //String
    }


    // pokeathlon_stat_detail->affecting_natures
    if (!pokeathlon_stat_detail->affecting_natures) {
        goto fail;
    }
    cJSON *affecting_natures_local_JSON = pokeathlon_stat_detail_affecting_natures_convertToJSON(pokeathlon_stat_detail->affecting_natures);
    if(affecting_natures_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "affecting_natures", affecting_natures_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // pokeathlon_stat_detail->names
    if (!pokeathlon_stat_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (pokeathlon_stat_detail->names) {
    list_ForEach(namesListEntry, pokeathlon_stat_detail->names) {
    cJSON *itemLocal = pokeathlon_stat_name_convertToJSON(namesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(names, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokeathlon_stat_detail_t *pokeathlon_stat_detail_parseFromJSON(cJSON *pokeathlon_stat_detailJSON){

    pokeathlon_stat_detail_t *pokeathlon_stat_detail_local_var = NULL;

    // define the local variable for pokeathlon_stat_detail->affecting_natures
    pokeathlon_stat_detail_affecting_natures_t *affecting_natures_local_nonprim = NULL;

    // define the local list for pokeathlon_stat_detail->names
    list_t *namesList = NULL;

    // pokeathlon_stat_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(pokeathlon_stat_detailJSON, "id");
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

    // pokeathlon_stat_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(pokeathlon_stat_detailJSON, "name");
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

    // pokeathlon_stat_detail->affecting_natures
    cJSON *affecting_natures = cJSON_GetObjectItemCaseSensitive(pokeathlon_stat_detailJSON, "affecting_natures");
    if (cJSON_IsNull(affecting_natures)) {
        affecting_natures = NULL;
    }
    if (!affecting_natures) {
        goto end;
    }

    
    affecting_natures_local_nonprim = pokeathlon_stat_detail_affecting_natures_parseFromJSON(affecting_natures); //nonprimitive

    // pokeathlon_stat_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(pokeathlon_stat_detailJSON, "names");
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
        pokeathlon_stat_name_t *namesItem = pokeathlon_stat_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }


    pokeathlon_stat_detail_local_var = pokeathlon_stat_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        affecting_natures_local_nonprim,
        namesList
        );

    return pokeathlon_stat_detail_local_var;
end:
    if (affecting_natures_local_nonprim) {
        pokeathlon_stat_detail_affecting_natures_free(affecting_natures_local_nonprim);
        affecting_natures_local_nonprim = NULL;
    }
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            pokeathlon_stat_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    return NULL;

}
