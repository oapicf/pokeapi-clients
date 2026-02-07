#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "contest_effect_detail.h"



static contest_effect_detail_t *contest_effect_detail_create_internal(
    int id,
    int appeal,
    int jam,
    list_t *effect_entries,
    list_t *flavor_text_entries
    ) {
    contest_effect_detail_t *contest_effect_detail_local_var = malloc(sizeof(contest_effect_detail_t));
    if (!contest_effect_detail_local_var) {
        return NULL;
    }
    contest_effect_detail_local_var->id = id;
    contest_effect_detail_local_var->appeal = appeal;
    contest_effect_detail_local_var->jam = jam;
    contest_effect_detail_local_var->effect_entries = effect_entries;
    contest_effect_detail_local_var->flavor_text_entries = flavor_text_entries;

    contest_effect_detail_local_var->_library_owned = 1;
    return contest_effect_detail_local_var;
}

__attribute__((deprecated)) contest_effect_detail_t *contest_effect_detail_create(
    int id,
    int appeal,
    int jam,
    list_t *effect_entries,
    list_t *flavor_text_entries
    ) {
    return contest_effect_detail_create_internal (
        id,
        appeal,
        jam,
        effect_entries,
        flavor_text_entries
        );
}

void contest_effect_detail_free(contest_effect_detail_t *contest_effect_detail) {
    if(NULL == contest_effect_detail){
        return ;
    }
    if(contest_effect_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "contest_effect_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (contest_effect_detail->effect_entries) {
        list_ForEach(listEntry, contest_effect_detail->effect_entries) {
            contest_effect_effect_text_free(listEntry->data);
        }
        list_freeList(contest_effect_detail->effect_entries);
        contest_effect_detail->effect_entries = NULL;
    }
    if (contest_effect_detail->flavor_text_entries) {
        list_ForEach(listEntry, contest_effect_detail->flavor_text_entries) {
            contest_effect_flavor_text_free(listEntry->data);
        }
        list_freeList(contest_effect_detail->flavor_text_entries);
        contest_effect_detail->flavor_text_entries = NULL;
    }
    free(contest_effect_detail);
}

cJSON *contest_effect_detail_convertToJSON(contest_effect_detail_t *contest_effect_detail) {
    cJSON *item = cJSON_CreateObject();

    // contest_effect_detail->id
    if (!contest_effect_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", contest_effect_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // contest_effect_detail->appeal
    if (!contest_effect_detail->appeal) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "appeal", contest_effect_detail->appeal) == NULL) {
    goto fail; //Numeric
    }


    // contest_effect_detail->jam
    if (!contest_effect_detail->jam) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "jam", contest_effect_detail->jam) == NULL) {
    goto fail; //Numeric
    }


    // contest_effect_detail->effect_entries
    if (!contest_effect_detail->effect_entries) {
        goto fail;
    }
    cJSON *effect_entries = cJSON_AddArrayToObject(item, "effect_entries");
    if(effect_entries == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *effect_entriesListEntry;
    if (contest_effect_detail->effect_entries) {
    list_ForEach(effect_entriesListEntry, contest_effect_detail->effect_entries) {
    cJSON *itemLocal = contest_effect_effect_text_convertToJSON(effect_entriesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(effect_entries, itemLocal);
    }
    }


    // contest_effect_detail->flavor_text_entries
    if (!contest_effect_detail->flavor_text_entries) {
        goto fail;
    }
    cJSON *flavor_text_entries = cJSON_AddArrayToObject(item, "flavor_text_entries");
    if(flavor_text_entries == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *flavor_text_entriesListEntry;
    if (contest_effect_detail->flavor_text_entries) {
    list_ForEach(flavor_text_entriesListEntry, contest_effect_detail->flavor_text_entries) {
    cJSON *itemLocal = contest_effect_flavor_text_convertToJSON(flavor_text_entriesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(flavor_text_entries, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

contest_effect_detail_t *contest_effect_detail_parseFromJSON(cJSON *contest_effect_detailJSON){

    contest_effect_detail_t *contest_effect_detail_local_var = NULL;

    // define the local list for contest_effect_detail->effect_entries
    list_t *effect_entriesList = NULL;

    // define the local list for contest_effect_detail->flavor_text_entries
    list_t *flavor_text_entriesList = NULL;

    // contest_effect_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(contest_effect_detailJSON, "id");
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

    // contest_effect_detail->appeal
    cJSON *appeal = cJSON_GetObjectItemCaseSensitive(contest_effect_detailJSON, "appeal");
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

    // contest_effect_detail->jam
    cJSON *jam = cJSON_GetObjectItemCaseSensitive(contest_effect_detailJSON, "jam");
    if (cJSON_IsNull(jam)) {
        jam = NULL;
    }
    if (!jam) {
        goto end;
    }

    
    if(!cJSON_IsNumber(jam))
    {
    goto end; //Numeric
    }

    // contest_effect_detail->effect_entries
    cJSON *effect_entries = cJSON_GetObjectItemCaseSensitive(contest_effect_detailJSON, "effect_entries");
    if (cJSON_IsNull(effect_entries)) {
        effect_entries = NULL;
    }
    if (!effect_entries) {
        goto end;
    }

    
    cJSON *effect_entries_local_nonprimitive = NULL;
    if(!cJSON_IsArray(effect_entries)){
        goto end; //nonprimitive container
    }

    effect_entriesList = list_createList();

    cJSON_ArrayForEach(effect_entries_local_nonprimitive,effect_entries )
    {
        if(!cJSON_IsObject(effect_entries_local_nonprimitive)){
            goto end;
        }
        contest_effect_effect_text_t *effect_entriesItem = contest_effect_effect_text_parseFromJSON(effect_entries_local_nonprimitive);

        list_addElement(effect_entriesList, effect_entriesItem);
    }

    // contest_effect_detail->flavor_text_entries
    cJSON *flavor_text_entries = cJSON_GetObjectItemCaseSensitive(contest_effect_detailJSON, "flavor_text_entries");
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
        contest_effect_flavor_text_t *flavor_text_entriesItem = contest_effect_flavor_text_parseFromJSON(flavor_text_entries_local_nonprimitive);

        list_addElement(flavor_text_entriesList, flavor_text_entriesItem);
    }


    contest_effect_detail_local_var = contest_effect_detail_create_internal (
        id->valuedouble,
        appeal->valuedouble,
        jam->valuedouble,
        effect_entriesList,
        flavor_text_entriesList
        );

    return contest_effect_detail_local_var;
end:
    if (effect_entriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, effect_entriesList) {
            contest_effect_effect_text_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(effect_entriesList);
        effect_entriesList = NULL;
    }
    if (flavor_text_entriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, flavor_text_entriesList) {
            contest_effect_flavor_text_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(flavor_text_entriesList);
        flavor_text_entriesList = NULL;
    }
    return NULL;

}
