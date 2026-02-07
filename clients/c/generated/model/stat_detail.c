#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "stat_detail.h"



static stat_detail_t *stat_detail_create_internal(
    int id,
    char *name,
    int game_index,
    int is_battle_only,
    stat_detail_affecting_moves_t *affecting_moves,
    stat_detail_affecting_natures_t *affecting_natures,
    list_t *characteristics,
    move_damage_class_summary_t *move_damage_class,
    list_t *names
    ) {
    stat_detail_t *stat_detail_local_var = malloc(sizeof(stat_detail_t));
    if (!stat_detail_local_var) {
        return NULL;
    }
    stat_detail_local_var->id = id;
    stat_detail_local_var->name = name;
    stat_detail_local_var->game_index = game_index;
    stat_detail_local_var->is_battle_only = is_battle_only;
    stat_detail_local_var->affecting_moves = affecting_moves;
    stat_detail_local_var->affecting_natures = affecting_natures;
    stat_detail_local_var->characteristics = characteristics;
    stat_detail_local_var->move_damage_class = move_damage_class;
    stat_detail_local_var->names = names;

    stat_detail_local_var->_library_owned = 1;
    return stat_detail_local_var;
}

__attribute__((deprecated)) stat_detail_t *stat_detail_create(
    int id,
    char *name,
    int game_index,
    int is_battle_only,
    stat_detail_affecting_moves_t *affecting_moves,
    stat_detail_affecting_natures_t *affecting_natures,
    list_t *characteristics,
    move_damage_class_summary_t *move_damage_class,
    list_t *names
    ) {
    return stat_detail_create_internal (
        id,
        name,
        game_index,
        is_battle_only,
        affecting_moves,
        affecting_natures,
        characteristics,
        move_damage_class,
        names
        );
}

void stat_detail_free(stat_detail_t *stat_detail) {
    if(NULL == stat_detail){
        return ;
    }
    if(stat_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "stat_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (stat_detail->name) {
        free(stat_detail->name);
        stat_detail->name = NULL;
    }
    if (stat_detail->affecting_moves) {
        stat_detail_affecting_moves_free(stat_detail->affecting_moves);
        stat_detail->affecting_moves = NULL;
    }
    if (stat_detail->affecting_natures) {
        stat_detail_affecting_natures_free(stat_detail->affecting_natures);
        stat_detail->affecting_natures = NULL;
    }
    if (stat_detail->characteristics) {
        list_ForEach(listEntry, stat_detail->characteristics) {
            characteristic_summary_free(listEntry->data);
        }
        list_freeList(stat_detail->characteristics);
        stat_detail->characteristics = NULL;
    }
    if (stat_detail->move_damage_class) {
        move_damage_class_summary_free(stat_detail->move_damage_class);
        stat_detail->move_damage_class = NULL;
    }
    if (stat_detail->names) {
        list_ForEach(listEntry, stat_detail->names) {
            stat_name_free(listEntry->data);
        }
        list_freeList(stat_detail->names);
        stat_detail->names = NULL;
    }
    free(stat_detail);
}

cJSON *stat_detail_convertToJSON(stat_detail_t *stat_detail) {
    cJSON *item = cJSON_CreateObject();

    // stat_detail->id
    if (!stat_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", stat_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // stat_detail->name
    if (!stat_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", stat_detail->name) == NULL) {
    goto fail; //String
    }


    // stat_detail->game_index
    if (!stat_detail->game_index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "game_index", stat_detail->game_index) == NULL) {
    goto fail; //Numeric
    }


    // stat_detail->is_battle_only
    if(stat_detail->is_battle_only) {
    if(cJSON_AddBoolToObject(item, "is_battle_only", stat_detail->is_battle_only) == NULL) {
    goto fail; //Bool
    }
    }


    // stat_detail->affecting_moves
    if (!stat_detail->affecting_moves) {
        goto fail;
    }
    cJSON *affecting_moves_local_JSON = stat_detail_affecting_moves_convertToJSON(stat_detail->affecting_moves);
    if(affecting_moves_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "affecting_moves", affecting_moves_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // stat_detail->affecting_natures
    if (!stat_detail->affecting_natures) {
        goto fail;
    }
    cJSON *affecting_natures_local_JSON = stat_detail_affecting_natures_convertToJSON(stat_detail->affecting_natures);
    if(affecting_natures_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "affecting_natures", affecting_natures_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // stat_detail->characteristics
    if (!stat_detail->characteristics) {
        goto fail;
    }
    cJSON *characteristics = cJSON_AddArrayToObject(item, "characteristics");
    if(characteristics == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *characteristicsListEntry;
    if (stat_detail->characteristics) {
    list_ForEach(characteristicsListEntry, stat_detail->characteristics) {
    cJSON *itemLocal = characteristic_summary_convertToJSON(characteristicsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(characteristics, itemLocal);
    }
    }


    // stat_detail->move_damage_class
    if (!stat_detail->move_damage_class) {
        goto fail;
    }
    cJSON *move_damage_class_local_JSON = move_damage_class_summary_convertToJSON(stat_detail->move_damage_class);
    if(move_damage_class_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "move_damage_class", move_damage_class_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // stat_detail->names
    if (!stat_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (stat_detail->names) {
    list_ForEach(namesListEntry, stat_detail->names) {
    cJSON *itemLocal = stat_name_convertToJSON(namesListEntry->data);
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

stat_detail_t *stat_detail_parseFromJSON(cJSON *stat_detailJSON){

    stat_detail_t *stat_detail_local_var = NULL;

    // define the local variable for stat_detail->affecting_moves
    stat_detail_affecting_moves_t *affecting_moves_local_nonprim = NULL;

    // define the local variable for stat_detail->affecting_natures
    stat_detail_affecting_natures_t *affecting_natures_local_nonprim = NULL;

    // define the local list for stat_detail->characteristics
    list_t *characteristicsList = NULL;

    // define the local variable for stat_detail->move_damage_class
    move_damage_class_summary_t *move_damage_class_local_nonprim = NULL;

    // define the local list for stat_detail->names
    list_t *namesList = NULL;

    // stat_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(stat_detailJSON, "id");
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

    // stat_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(stat_detailJSON, "name");
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

    // stat_detail->game_index
    cJSON *game_index = cJSON_GetObjectItemCaseSensitive(stat_detailJSON, "game_index");
    if (cJSON_IsNull(game_index)) {
        game_index = NULL;
    }
    if (!game_index) {
        goto end;
    }

    
    if(!cJSON_IsNumber(game_index))
    {
    goto end; //Numeric
    }

    // stat_detail->is_battle_only
    cJSON *is_battle_only = cJSON_GetObjectItemCaseSensitive(stat_detailJSON, "is_battle_only");
    if (cJSON_IsNull(is_battle_only)) {
        is_battle_only = NULL;
    }
    if (is_battle_only) { 
    if(!cJSON_IsBool(is_battle_only))
    {
    goto end; //Bool
    }
    }

    // stat_detail->affecting_moves
    cJSON *affecting_moves = cJSON_GetObjectItemCaseSensitive(stat_detailJSON, "affecting_moves");
    if (cJSON_IsNull(affecting_moves)) {
        affecting_moves = NULL;
    }
    if (!affecting_moves) {
        goto end;
    }

    
    affecting_moves_local_nonprim = stat_detail_affecting_moves_parseFromJSON(affecting_moves); //nonprimitive

    // stat_detail->affecting_natures
    cJSON *affecting_natures = cJSON_GetObjectItemCaseSensitive(stat_detailJSON, "affecting_natures");
    if (cJSON_IsNull(affecting_natures)) {
        affecting_natures = NULL;
    }
    if (!affecting_natures) {
        goto end;
    }

    
    affecting_natures_local_nonprim = stat_detail_affecting_natures_parseFromJSON(affecting_natures); //nonprimitive

    // stat_detail->characteristics
    cJSON *characteristics = cJSON_GetObjectItemCaseSensitive(stat_detailJSON, "characteristics");
    if (cJSON_IsNull(characteristics)) {
        characteristics = NULL;
    }
    if (!characteristics) {
        goto end;
    }

    
    cJSON *characteristics_local_nonprimitive = NULL;
    if(!cJSON_IsArray(characteristics)){
        goto end; //nonprimitive container
    }

    characteristicsList = list_createList();

    cJSON_ArrayForEach(characteristics_local_nonprimitive,characteristics )
    {
        if(!cJSON_IsObject(characteristics_local_nonprimitive)){
            goto end;
        }
        characteristic_summary_t *characteristicsItem = characteristic_summary_parseFromJSON(characteristics_local_nonprimitive);

        list_addElement(characteristicsList, characteristicsItem);
    }

    // stat_detail->move_damage_class
    cJSON *move_damage_class = cJSON_GetObjectItemCaseSensitive(stat_detailJSON, "move_damage_class");
    if (cJSON_IsNull(move_damage_class)) {
        move_damage_class = NULL;
    }
    if (!move_damage_class) {
        goto end;
    }

    
    move_damage_class_local_nonprim = move_damage_class_summary_parseFromJSON(move_damage_class); //nonprimitive

    // stat_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(stat_detailJSON, "names");
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
        stat_name_t *namesItem = stat_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }


    stat_detail_local_var = stat_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        game_index->valuedouble,
        is_battle_only ? is_battle_only->valueint : 0,
        affecting_moves_local_nonprim,
        affecting_natures_local_nonprim,
        characteristicsList,
        move_damage_class_local_nonprim,
        namesList
        );

    return stat_detail_local_var;
end:
    if (affecting_moves_local_nonprim) {
        stat_detail_affecting_moves_free(affecting_moves_local_nonprim);
        affecting_moves_local_nonprim = NULL;
    }
    if (affecting_natures_local_nonprim) {
        stat_detail_affecting_natures_free(affecting_natures_local_nonprim);
        affecting_natures_local_nonprim = NULL;
    }
    if (characteristicsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, characteristicsList) {
            characteristic_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(characteristicsList);
        characteristicsList = NULL;
    }
    if (move_damage_class_local_nonprim) {
        move_damage_class_summary_free(move_damage_class_local_nonprim);
        move_damage_class_local_nonprim = NULL;
    }
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            stat_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    return NULL;

}
