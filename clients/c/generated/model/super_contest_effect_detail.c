#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "super_contest_effect_detail.h"



static super_contest_effect_detail_t *super_contest_effect_detail_create_internal(
    int id,
    int appeal,
    list_t *flavor_text_entries,
    list_t *moves
    ) {
    super_contest_effect_detail_t *super_contest_effect_detail_local_var = malloc(sizeof(super_contest_effect_detail_t));
    if (!super_contest_effect_detail_local_var) {
        return NULL;
    }
    super_contest_effect_detail_local_var->id = id;
    super_contest_effect_detail_local_var->appeal = appeal;
    super_contest_effect_detail_local_var->flavor_text_entries = flavor_text_entries;
    super_contest_effect_detail_local_var->moves = moves;

    super_contest_effect_detail_local_var->_library_owned = 1;
    return super_contest_effect_detail_local_var;
}

__attribute__((deprecated)) super_contest_effect_detail_t *super_contest_effect_detail_create(
    int id,
    int appeal,
    list_t *flavor_text_entries,
    list_t *moves
    ) {
    return super_contest_effect_detail_create_internal (
        id,
        appeal,
        flavor_text_entries,
        moves
        );
}

void super_contest_effect_detail_free(super_contest_effect_detail_t *super_contest_effect_detail) {
    if(NULL == super_contest_effect_detail){
        return ;
    }
    if(super_contest_effect_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "super_contest_effect_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (super_contest_effect_detail->flavor_text_entries) {
        list_ForEach(listEntry, super_contest_effect_detail->flavor_text_entries) {
            super_contest_effect_flavor_text_free(listEntry->data);
        }
        list_freeList(super_contest_effect_detail->flavor_text_entries);
        super_contest_effect_detail->flavor_text_entries = NULL;
    }
    if (super_contest_effect_detail->moves) {
        list_ForEach(listEntry, super_contest_effect_detail->moves) {
            move_summary_free(listEntry->data);
        }
        list_freeList(super_contest_effect_detail->moves);
        super_contest_effect_detail->moves = NULL;
    }
    free(super_contest_effect_detail);
}

cJSON *super_contest_effect_detail_convertToJSON(super_contest_effect_detail_t *super_contest_effect_detail) {
    cJSON *item = cJSON_CreateObject();

    // super_contest_effect_detail->id
    if (!super_contest_effect_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", super_contest_effect_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // super_contest_effect_detail->appeal
    if (!super_contest_effect_detail->appeal) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "appeal", super_contest_effect_detail->appeal) == NULL) {
    goto fail; //Numeric
    }


    // super_contest_effect_detail->flavor_text_entries
    if (!super_contest_effect_detail->flavor_text_entries) {
        goto fail;
    }
    cJSON *flavor_text_entries = cJSON_AddArrayToObject(item, "flavor_text_entries");
    if(flavor_text_entries == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *flavor_text_entriesListEntry;
    if (super_contest_effect_detail->flavor_text_entries) {
    list_ForEach(flavor_text_entriesListEntry, super_contest_effect_detail->flavor_text_entries) {
    cJSON *itemLocal = super_contest_effect_flavor_text_convertToJSON(flavor_text_entriesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(flavor_text_entries, itemLocal);
    }
    }


    // super_contest_effect_detail->moves
    if (!super_contest_effect_detail->moves) {
        goto fail;
    }
    cJSON *moves = cJSON_AddArrayToObject(item, "moves");
    if(moves == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *movesListEntry;
    if (super_contest_effect_detail->moves) {
    list_ForEach(movesListEntry, super_contest_effect_detail->moves) {
    cJSON *itemLocal = move_summary_convertToJSON(movesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(moves, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

super_contest_effect_detail_t *super_contest_effect_detail_parseFromJSON(cJSON *super_contest_effect_detailJSON){

    super_contest_effect_detail_t *super_contest_effect_detail_local_var = NULL;

    // define the local list for super_contest_effect_detail->flavor_text_entries
    list_t *flavor_text_entriesList = NULL;

    // define the local list for super_contest_effect_detail->moves
    list_t *movesList = NULL;

    // super_contest_effect_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(super_contest_effect_detailJSON, "id");
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

    // super_contest_effect_detail->appeal
    cJSON *appeal = cJSON_GetObjectItemCaseSensitive(super_contest_effect_detailJSON, "appeal");
    if (cJSON_IsNull(appeal)) {
        appeal = NULL;
    }
    if (!appeal) {
        goto end;
    }

    
    if(!cJSON_IsNumber(appeal))
    {
    goto end; //Numeric
    }

    // super_contest_effect_detail->flavor_text_entries
    cJSON *flavor_text_entries = cJSON_GetObjectItemCaseSensitive(super_contest_effect_detailJSON, "flavor_text_entries");
    if (cJSON_IsNull(flavor_text_entries)) {
        flavor_text_entries = NULL;
    }
    if (!flavor_text_entries) {
        goto end;
    }

    
    cJSON *flavor_text_entries_local_nonprimitive = NULL;
    if(!cJSON_IsArray(flavor_text_entries)){
        goto end; //nonprimitive container
    }

    flavor_text_entriesList = list_createList();

    cJSON_ArrayForEach(flavor_text_entries_local_nonprimitive,flavor_text_entries )
    {
        if(!cJSON_IsObject(flavor_text_entries_local_nonprimitive)){
            goto end;
        }
        super_contest_effect_flavor_text_t *flavor_text_entriesItem = super_contest_effect_flavor_text_parseFromJSON(flavor_text_entries_local_nonprimitive);

        list_addElement(flavor_text_entriesList, flavor_text_entriesItem);
    }

    // super_contest_effect_detail->moves
    cJSON *moves = cJSON_GetObjectItemCaseSensitive(super_contest_effect_detailJSON, "moves");
    if (cJSON_IsNull(moves)) {
        moves = NULL;
    }
    if (!moves) {
        goto end;
    }

    
    cJSON *moves_local_nonprimitive = NULL;
    if(!cJSON_IsArray(moves)){
        goto end; //nonprimitive container
    }

    movesList = list_createList();

    cJSON_ArrayForEach(moves_local_nonprimitive,moves )
    {
        if(!cJSON_IsObject(moves_local_nonprimitive)){
            goto end;
        }
        move_summary_t *movesItem = move_summary_parseFromJSON(moves_local_nonprimitive);

        list_addElement(movesList, movesItem);
    }


    super_contest_effect_detail_local_var = super_contest_effect_detail_create_internal (
        id->valuedouble,
        appeal->valuedouble,
        flavor_text_entriesList,
        movesList
        );

    return super_contest_effect_detail_local_var;
end:
    if (flavor_text_entriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, flavor_text_entriesList) {
            super_contest_effect_flavor_text_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(flavor_text_entriesList);
        flavor_text_entriesList = NULL;
    }
    if (movesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, movesList) {
            move_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(movesList);
        movesList = NULL;
    }
    return NULL;

}
