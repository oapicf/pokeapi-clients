#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "nature_detail.h"



static nature_detail_t *nature_detail_create_internal(
    int id,
    char *name,
    stat_summary_t *decreased_stat,
    stat_summary_t *increased_stat,
    berry_flavor_summary_t *likes_flavor,
    berry_flavor_summary_t *hates_flavor,
    list_t *berries,
    list_t *pokeathlon_stat_changes,
    list_t *move_battle_style_preferences,
    list_t *names
    ) {
    nature_detail_t *nature_detail_local_var = malloc(sizeof(nature_detail_t));
    if (!nature_detail_local_var) {
        return NULL;
    }
    nature_detail_local_var->id = id;
    nature_detail_local_var->name = name;
    nature_detail_local_var->decreased_stat = decreased_stat;
    nature_detail_local_var->increased_stat = increased_stat;
    nature_detail_local_var->likes_flavor = likes_flavor;
    nature_detail_local_var->hates_flavor = hates_flavor;
    nature_detail_local_var->berries = berries;
    nature_detail_local_var->pokeathlon_stat_changes = pokeathlon_stat_changes;
    nature_detail_local_var->move_battle_style_preferences = move_battle_style_preferences;
    nature_detail_local_var->names = names;

    nature_detail_local_var->_library_owned = 1;
    return nature_detail_local_var;
}

__attribute__((deprecated)) nature_detail_t *nature_detail_create(
    int id,
    char *name,
    stat_summary_t *decreased_stat,
    stat_summary_t *increased_stat,
    berry_flavor_summary_t *likes_flavor,
    berry_flavor_summary_t *hates_flavor,
    list_t *berries,
    list_t *pokeathlon_stat_changes,
    list_t *move_battle_style_preferences,
    list_t *names
    ) {
    return nature_detail_create_internal (
        id,
        name,
        decreased_stat,
        increased_stat,
        likes_flavor,
        hates_flavor,
        berries,
        pokeathlon_stat_changes,
        move_battle_style_preferences,
        names
        );
}

void nature_detail_free(nature_detail_t *nature_detail) {
    if(NULL == nature_detail){
        return ;
    }
    if(nature_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "nature_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (nature_detail->name) {
        free(nature_detail->name);
        nature_detail->name = NULL;
    }
    if (nature_detail->decreased_stat) {
        stat_summary_free(nature_detail->decreased_stat);
        nature_detail->decreased_stat = NULL;
    }
    if (nature_detail->increased_stat) {
        stat_summary_free(nature_detail->increased_stat);
        nature_detail->increased_stat = NULL;
    }
    if (nature_detail->likes_flavor) {
        berry_flavor_summary_free(nature_detail->likes_flavor);
        nature_detail->likes_flavor = NULL;
    }
    if (nature_detail->hates_flavor) {
        berry_flavor_summary_free(nature_detail->hates_flavor);
        nature_detail->hates_flavor = NULL;
    }
    if (nature_detail->berries) {
        list_ForEach(listEntry, nature_detail->berries) {
            berry_summary_free(listEntry->data);
        }
        list_freeList(nature_detail->berries);
        nature_detail->berries = NULL;
    }
    if (nature_detail->pokeathlon_stat_changes) {
        list_ForEach(listEntry, nature_detail->pokeathlon_stat_changes) {
            nature_detail_pokeathlon_stat_changes_inner_free(listEntry->data);
        }
        list_freeList(nature_detail->pokeathlon_stat_changes);
        nature_detail->pokeathlon_stat_changes = NULL;
    }
    if (nature_detail->move_battle_style_preferences) {
        list_ForEach(listEntry, nature_detail->move_battle_style_preferences) {
            nature_battle_style_preference_free(listEntry->data);
        }
        list_freeList(nature_detail->move_battle_style_preferences);
        nature_detail->move_battle_style_preferences = NULL;
    }
    if (nature_detail->names) {
        list_ForEach(listEntry, nature_detail->names) {
            nature_name_free(listEntry->data);
        }
        list_freeList(nature_detail->names);
        nature_detail->names = NULL;
    }
    free(nature_detail);
}

cJSON *nature_detail_convertToJSON(nature_detail_t *nature_detail) {
    cJSON *item = cJSON_CreateObject();

    // nature_detail->id
    if (!nature_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", nature_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // nature_detail->name
    if (!nature_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", nature_detail->name) == NULL) {
    goto fail; //String
    }


    // nature_detail->decreased_stat
    if (!nature_detail->decreased_stat) {
        goto fail;
    }
    cJSON *decreased_stat_local_JSON = stat_summary_convertToJSON(nature_detail->decreased_stat);
    if(decreased_stat_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "decreased_stat", decreased_stat_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // nature_detail->increased_stat
    if (!nature_detail->increased_stat) {
        goto fail;
    }
    cJSON *increased_stat_local_JSON = stat_summary_convertToJSON(nature_detail->increased_stat);
    if(increased_stat_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "increased_stat", increased_stat_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // nature_detail->likes_flavor
    if (!nature_detail->likes_flavor) {
        goto fail;
    }
    cJSON *likes_flavor_local_JSON = berry_flavor_summary_convertToJSON(nature_detail->likes_flavor);
    if(likes_flavor_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "likes_flavor", likes_flavor_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // nature_detail->hates_flavor
    if (!nature_detail->hates_flavor) {
        goto fail;
    }
    cJSON *hates_flavor_local_JSON = berry_flavor_summary_convertToJSON(nature_detail->hates_flavor);
    if(hates_flavor_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "hates_flavor", hates_flavor_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // nature_detail->berries
    if (!nature_detail->berries) {
        goto fail;
    }
    cJSON *berries = cJSON_AddArrayToObject(item, "berries");
    if(berries == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *berriesListEntry;
    if (nature_detail->berries) {
    list_ForEach(berriesListEntry, nature_detail->berries) {
    cJSON *itemLocal = berry_summary_convertToJSON(berriesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(berries, itemLocal);
    }
    }


    // nature_detail->pokeathlon_stat_changes
    if (!nature_detail->pokeathlon_stat_changes) {
        goto fail;
    }
    cJSON *pokeathlon_stat_changes = cJSON_AddArrayToObject(item, "pokeathlon_stat_changes");
    if(pokeathlon_stat_changes == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *pokeathlon_stat_changesListEntry;
    if (nature_detail->pokeathlon_stat_changes) {
    list_ForEach(pokeathlon_stat_changesListEntry, nature_detail->pokeathlon_stat_changes) {
    cJSON *itemLocal = nature_detail_pokeathlon_stat_changes_inner_convertToJSON(pokeathlon_stat_changesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(pokeathlon_stat_changes, itemLocal);
    }
    }


    // nature_detail->move_battle_style_preferences
    if (!nature_detail->move_battle_style_preferences) {
        goto fail;
    }
    cJSON *move_battle_style_preferences = cJSON_AddArrayToObject(item, "move_battle_style_preferences");
    if(move_battle_style_preferences == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *move_battle_style_preferencesListEntry;
    if (nature_detail->move_battle_style_preferences) {
    list_ForEach(move_battle_style_preferencesListEntry, nature_detail->move_battle_style_preferences) {
    cJSON *itemLocal = nature_battle_style_preference_convertToJSON(move_battle_style_preferencesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(move_battle_style_preferences, itemLocal);
    }
    }


    // nature_detail->names
    if (!nature_detail->names) {
        goto fail;
    }
    cJSON *names = cJSON_AddArrayToObject(item, "names");
    if(names == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *namesListEntry;
    if (nature_detail->names) {
    list_ForEach(namesListEntry, nature_detail->names) {
    cJSON *itemLocal = nature_name_convertToJSON(namesListEntry->data);
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

nature_detail_t *nature_detail_parseFromJSON(cJSON *nature_detailJSON){

    nature_detail_t *nature_detail_local_var = NULL;

    // define the local variable for nature_detail->decreased_stat
    stat_summary_t *decreased_stat_local_nonprim = NULL;

    // define the local variable for nature_detail->increased_stat
    stat_summary_t *increased_stat_local_nonprim = NULL;

    // define the local variable for nature_detail->likes_flavor
    berry_flavor_summary_t *likes_flavor_local_nonprim = NULL;

    // define the local variable for nature_detail->hates_flavor
    berry_flavor_summary_t *hates_flavor_local_nonprim = NULL;

    // define the local list for nature_detail->berries
    list_t *berriesList = NULL;

    // define the local list for nature_detail->pokeathlon_stat_changes
    list_t *pokeathlon_stat_changesList = NULL;

    // define the local list for nature_detail->move_battle_style_preferences
    list_t *move_battle_style_preferencesList = NULL;

    // define the local list for nature_detail->names
    list_t *namesList = NULL;

    // nature_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(nature_detailJSON, "id");
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

    // nature_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(nature_detailJSON, "name");
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

    // nature_detail->decreased_stat
    cJSON *decreased_stat = cJSON_GetObjectItemCaseSensitive(nature_detailJSON, "decreased_stat");
    if (cJSON_IsNull(decreased_stat)) {
        decreased_stat = NULL;
    }
    if (!decreased_stat) {
        goto end;
    }

    
    decreased_stat_local_nonprim = stat_summary_parseFromJSON(decreased_stat); //nonprimitive

    // nature_detail->increased_stat
    cJSON *increased_stat = cJSON_GetObjectItemCaseSensitive(nature_detailJSON, "increased_stat");
    if (cJSON_IsNull(increased_stat)) {
        increased_stat = NULL;
    }
    if (!increased_stat) {
        goto end;
    }

    
    increased_stat_local_nonprim = stat_summary_parseFromJSON(increased_stat); //nonprimitive

    // nature_detail->likes_flavor
    cJSON *likes_flavor = cJSON_GetObjectItemCaseSensitive(nature_detailJSON, "likes_flavor");
    if (cJSON_IsNull(likes_flavor)) {
        likes_flavor = NULL;
    }
    if (!likes_flavor) {
        goto end;
    }

    
    likes_flavor_local_nonprim = berry_flavor_summary_parseFromJSON(likes_flavor); //nonprimitive

    // nature_detail->hates_flavor
    cJSON *hates_flavor = cJSON_GetObjectItemCaseSensitive(nature_detailJSON, "hates_flavor");
    if (cJSON_IsNull(hates_flavor)) {
        hates_flavor = NULL;
    }
    if (!hates_flavor) {
        goto end;
    }

    
    hates_flavor_local_nonprim = berry_flavor_summary_parseFromJSON(hates_flavor); //nonprimitive

    // nature_detail->berries
    cJSON *berries = cJSON_GetObjectItemCaseSensitive(nature_detailJSON, "berries");
    if (cJSON_IsNull(berries)) {
        berries = NULL;
    }
    if (!berries) {
        goto end;
    }

    
    cJSON *berries_local_nonprimitive = NULL;
    if(!cJSON_IsArray(berries)){
        goto end; //nonprimitive container
    }

    berriesList = list_createList();

    cJSON_ArrayForEach(berries_local_nonprimitive,berries )
    {
        if(!cJSON_IsObject(berries_local_nonprimitive)){
            goto end;
        }
        berry_summary_t *berriesItem = berry_summary_parseFromJSON(berries_local_nonprimitive);

        list_addElement(berriesList, berriesItem);
    }

    // nature_detail->pokeathlon_stat_changes
    cJSON *pokeathlon_stat_changes = cJSON_GetObjectItemCaseSensitive(nature_detailJSON, "pokeathlon_stat_changes");
    if (cJSON_IsNull(pokeathlon_stat_changes)) {
        pokeathlon_stat_changes = NULL;
    }
    if (!pokeathlon_stat_changes) {
        goto end;
    }

    
    cJSON *pokeathlon_stat_changes_local_nonprimitive = NULL;
    if(!cJSON_IsArray(pokeathlon_stat_changes)){
        goto end; //nonprimitive container
    }

    pokeathlon_stat_changesList = list_createList();

    cJSON_ArrayForEach(pokeathlon_stat_changes_local_nonprimitive,pokeathlon_stat_changes )
    {
        if(!cJSON_IsObject(pokeathlon_stat_changes_local_nonprimitive)){
            goto end;
        }
        nature_detail_pokeathlon_stat_changes_inner_t *pokeathlon_stat_changesItem = nature_detail_pokeathlon_stat_changes_inner_parseFromJSON(pokeathlon_stat_changes_local_nonprimitive);

        list_addElement(pokeathlon_stat_changesList, pokeathlon_stat_changesItem);
    }

    // nature_detail->move_battle_style_preferences
    cJSON *move_battle_style_preferences = cJSON_GetObjectItemCaseSensitive(nature_detailJSON, "move_battle_style_preferences");
    if (cJSON_IsNull(move_battle_style_preferences)) {
        move_battle_style_preferences = NULL;
    }
    if (!move_battle_style_preferences) {
        goto end;
    }

    
    cJSON *move_battle_style_preferences_local_nonprimitive = NULL;
    if(!cJSON_IsArray(move_battle_style_preferences)){
        goto end; //nonprimitive container
    }

    move_battle_style_preferencesList = list_createList();

    cJSON_ArrayForEach(move_battle_style_preferences_local_nonprimitive,move_battle_style_preferences )
    {
        if(!cJSON_IsObject(move_battle_style_preferences_local_nonprimitive)){
            goto end;
        }
        nature_battle_style_preference_t *move_battle_style_preferencesItem = nature_battle_style_preference_parseFromJSON(move_battle_style_preferences_local_nonprimitive);

        list_addElement(move_battle_style_preferencesList, move_battle_style_preferencesItem);
    }

    // nature_detail->names
    cJSON *names = cJSON_GetObjectItemCaseSensitive(nature_detailJSON, "names");
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
        nature_name_t *namesItem = nature_name_parseFromJSON(names_local_nonprimitive);

        list_addElement(namesList, namesItem);
    }


    nature_detail_local_var = nature_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        decreased_stat_local_nonprim,
        increased_stat_local_nonprim,
        likes_flavor_local_nonprim,
        hates_flavor_local_nonprim,
        berriesList,
        pokeathlon_stat_changesList,
        move_battle_style_preferencesList,
        namesList
        );

    return nature_detail_local_var;
end:
    if (decreased_stat_local_nonprim) {
        stat_summary_free(decreased_stat_local_nonprim);
        decreased_stat_local_nonprim = NULL;
    }
    if (increased_stat_local_nonprim) {
        stat_summary_free(increased_stat_local_nonprim);
        increased_stat_local_nonprim = NULL;
    }
    if (likes_flavor_local_nonprim) {
        berry_flavor_summary_free(likes_flavor_local_nonprim);
        likes_flavor_local_nonprim = NULL;
    }
    if (hates_flavor_local_nonprim) {
        berry_flavor_summary_free(hates_flavor_local_nonprim);
        hates_flavor_local_nonprim = NULL;
    }
    if (berriesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, berriesList) {
            berry_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(berriesList);
        berriesList = NULL;
    }
    if (pokeathlon_stat_changesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, pokeathlon_stat_changesList) {
            nature_detail_pokeathlon_stat_changes_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(pokeathlon_stat_changesList);
        pokeathlon_stat_changesList = NULL;
    }
    if (move_battle_style_preferencesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, move_battle_style_preferencesList) {
            nature_battle_style_preference_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(move_battle_style_preferencesList);
        move_battle_style_preferencesList = NULL;
    }
    if (namesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, namesList) {
            nature_name_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(namesList);
        namesList = NULL;
    }
    return NULL;

}
