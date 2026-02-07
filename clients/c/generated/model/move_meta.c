#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "move_meta.h"



static move_meta_t *move_meta_create_internal(
    move_meta_ailment_summary_t *ailment,
    move_meta_category_summary_t *category,
    int min_hits,
    int max_hits,
    int min_turns,
    int max_turns,
    int drain,
    int healing,
    int crit_rate,
    int ailment_chance,
    int flinch_chance,
    int stat_chance
    ) {
    move_meta_t *move_meta_local_var = malloc(sizeof(move_meta_t));
    if (!move_meta_local_var) {
        return NULL;
    }
    move_meta_local_var->ailment = ailment;
    move_meta_local_var->category = category;
    move_meta_local_var->min_hits = min_hits;
    move_meta_local_var->max_hits = max_hits;
    move_meta_local_var->min_turns = min_turns;
    move_meta_local_var->max_turns = max_turns;
    move_meta_local_var->drain = drain;
    move_meta_local_var->healing = healing;
    move_meta_local_var->crit_rate = crit_rate;
    move_meta_local_var->ailment_chance = ailment_chance;
    move_meta_local_var->flinch_chance = flinch_chance;
    move_meta_local_var->stat_chance = stat_chance;

    move_meta_local_var->_library_owned = 1;
    return move_meta_local_var;
}

__attribute__((deprecated)) move_meta_t *move_meta_create(
    move_meta_ailment_summary_t *ailment,
    move_meta_category_summary_t *category,
    int min_hits,
    int max_hits,
    int min_turns,
    int max_turns,
    int drain,
    int healing,
    int crit_rate,
    int ailment_chance,
    int flinch_chance,
    int stat_chance
    ) {
    return move_meta_create_internal (
        ailment,
        category,
        min_hits,
        max_hits,
        min_turns,
        max_turns,
        drain,
        healing,
        crit_rate,
        ailment_chance,
        flinch_chance,
        stat_chance
        );
}

void move_meta_free(move_meta_t *move_meta) {
    if(NULL == move_meta){
        return ;
    }
    if(move_meta->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "move_meta_free");
        return ;
    }
    listEntry_t *listEntry;
    if (move_meta->ailment) {
        move_meta_ailment_summary_free(move_meta->ailment);
        move_meta->ailment = NULL;
    }
    if (move_meta->category) {
        move_meta_category_summary_free(move_meta->category);
        move_meta->category = NULL;
    }
    free(move_meta);
}

cJSON *move_meta_convertToJSON(move_meta_t *move_meta) {
    cJSON *item = cJSON_CreateObject();

    // move_meta->ailment
    if (!move_meta->ailment) {
        goto fail;
    }
    cJSON *ailment_local_JSON = move_meta_ailment_summary_convertToJSON(move_meta->ailment);
    if(ailment_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ailment", ailment_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // move_meta->category
    if (!move_meta->category) {
        goto fail;
    }
    cJSON *category_local_JSON = move_meta_category_summary_convertToJSON(move_meta->category);
    if(category_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "category", category_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // move_meta->min_hits
    if(move_meta->min_hits) {
    if(cJSON_AddNumberToObject(item, "min_hits", move_meta->min_hits) == NULL) {
    goto fail; //Numeric
    }
    }


    // move_meta->max_hits
    if(move_meta->max_hits) {
    if(cJSON_AddNumberToObject(item, "max_hits", move_meta->max_hits) == NULL) {
    goto fail; //Numeric
    }
    }


    // move_meta->min_turns
    if(move_meta->min_turns) {
    if(cJSON_AddNumberToObject(item, "min_turns", move_meta->min_turns) == NULL) {
    goto fail; //Numeric
    }
    }


    // move_meta->max_turns
    if(move_meta->max_turns) {
    if(cJSON_AddNumberToObject(item, "max_turns", move_meta->max_turns) == NULL) {
    goto fail; //Numeric
    }
    }


    // move_meta->drain
    if(move_meta->drain) {
    if(cJSON_AddNumberToObject(item, "drain", move_meta->drain) == NULL) {
    goto fail; //Numeric
    }
    }


    // move_meta->healing
    if(move_meta->healing) {
    if(cJSON_AddNumberToObject(item, "healing", move_meta->healing) == NULL) {
    goto fail; //Numeric
    }
    }


    // move_meta->crit_rate
    if(move_meta->crit_rate) {
    if(cJSON_AddNumberToObject(item, "crit_rate", move_meta->crit_rate) == NULL) {
    goto fail; //Numeric
    }
    }


    // move_meta->ailment_chance
    if(move_meta->ailment_chance) {
    if(cJSON_AddNumberToObject(item, "ailment_chance", move_meta->ailment_chance) == NULL) {
    goto fail; //Numeric
    }
    }


    // move_meta->flinch_chance
    if(move_meta->flinch_chance) {
    if(cJSON_AddNumberToObject(item, "flinch_chance", move_meta->flinch_chance) == NULL) {
    goto fail; //Numeric
    }
    }


    // move_meta->stat_chance
    if(move_meta->stat_chance) {
    if(cJSON_AddNumberToObject(item, "stat_chance", move_meta->stat_chance) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

move_meta_t *move_meta_parseFromJSON(cJSON *move_metaJSON){

    move_meta_t *move_meta_local_var = NULL;

    // define the local variable for move_meta->ailment
    move_meta_ailment_summary_t *ailment_local_nonprim = NULL;

    // define the local variable for move_meta->category
    move_meta_category_summary_t *category_local_nonprim = NULL;

    // move_meta->ailment
    cJSON *ailment = cJSON_GetObjectItemCaseSensitive(move_metaJSON, "ailment");
    if (cJSON_IsNull(ailment)) {
        ailment = NULL;
    }
    if (!ailment) {
        goto end;
    }

    
    ailment_local_nonprim = move_meta_ailment_summary_parseFromJSON(ailment); //nonprimitive

    // move_meta->category
    cJSON *category = cJSON_GetObjectItemCaseSensitive(move_metaJSON, "category");
    if (cJSON_IsNull(category)) {
        category = NULL;
    }
    if (!category) {
        goto end;
    }

    
    category_local_nonprim = move_meta_category_summary_parseFromJSON(category); //nonprimitive

    // move_meta->min_hits
    cJSON *min_hits = cJSON_GetObjectItemCaseSensitive(move_metaJSON, "min_hits");
    if (cJSON_IsNull(min_hits)) {
        min_hits = NULL;
    }
    if (min_hits) { 
    if(!cJSON_IsNumber(min_hits))
    {
    goto end; //Numeric
    }
    }

    // move_meta->max_hits
    cJSON *max_hits = cJSON_GetObjectItemCaseSensitive(move_metaJSON, "max_hits");
    if (cJSON_IsNull(max_hits)) {
        max_hits = NULL;
    }
    if (max_hits) { 
    if(!cJSON_IsNumber(max_hits))
    {
    goto end; //Numeric
    }
    }

    // move_meta->min_turns
    cJSON *min_turns = cJSON_GetObjectItemCaseSensitive(move_metaJSON, "min_turns");
    if (cJSON_IsNull(min_turns)) {
        min_turns = NULL;
    }
    if (min_turns) { 
    if(!cJSON_IsNumber(min_turns))
    {
    goto end; //Numeric
    }
    }

    // move_meta->max_turns
    cJSON *max_turns = cJSON_GetObjectItemCaseSensitive(move_metaJSON, "max_turns");
    if (cJSON_IsNull(max_turns)) {
        max_turns = NULL;
    }
    if (max_turns) { 
    if(!cJSON_IsNumber(max_turns))
    {
    goto end; //Numeric
    }
    }

    // move_meta->drain
    cJSON *drain = cJSON_GetObjectItemCaseSensitive(move_metaJSON, "drain");
    if (cJSON_IsNull(drain)) {
        drain = NULL;
    }
    if (drain) { 
    if(!cJSON_IsNumber(drain))
    {
    goto end; //Numeric
    }
    }

    // move_meta->healing
    cJSON *healing = cJSON_GetObjectItemCaseSensitive(move_metaJSON, "healing");
    if (cJSON_IsNull(healing)) {
        healing = NULL;
    }
    if (healing) { 
    if(!cJSON_IsNumber(healing))
    {
    goto end; //Numeric
    }
    }

    // move_meta->crit_rate
    cJSON *crit_rate = cJSON_GetObjectItemCaseSensitive(move_metaJSON, "crit_rate");
    if (cJSON_IsNull(crit_rate)) {
        crit_rate = NULL;
    }
    if (crit_rate) { 
    if(!cJSON_IsNumber(crit_rate))
    {
    goto end; //Numeric
    }
    }

    // move_meta->ailment_chance
    cJSON *ailment_chance = cJSON_GetObjectItemCaseSensitive(move_metaJSON, "ailment_chance");
    if (cJSON_IsNull(ailment_chance)) {
        ailment_chance = NULL;
    }
    if (ailment_chance) { 
    if(!cJSON_IsNumber(ailment_chance))
    {
    goto end; //Numeric
    }
    }

    // move_meta->flinch_chance
    cJSON *flinch_chance = cJSON_GetObjectItemCaseSensitive(move_metaJSON, "flinch_chance");
    if (cJSON_IsNull(flinch_chance)) {
        flinch_chance = NULL;
    }
    if (flinch_chance) { 
    if(!cJSON_IsNumber(flinch_chance))
    {
    goto end; //Numeric
    }
    }

    // move_meta->stat_chance
    cJSON *stat_chance = cJSON_GetObjectItemCaseSensitive(move_metaJSON, "stat_chance");
    if (cJSON_IsNull(stat_chance)) {
        stat_chance = NULL;
    }
    if (stat_chance) { 
    if(!cJSON_IsNumber(stat_chance))
    {
    goto end; //Numeric
    }
    }


    move_meta_local_var = move_meta_create_internal (
        ailment_local_nonprim,
        category_local_nonprim,
        min_hits ? min_hits->valuedouble : 0,
        max_hits ? max_hits->valuedouble : 0,
        min_turns ? min_turns->valuedouble : 0,
        max_turns ? max_turns->valuedouble : 0,
        drain ? drain->valuedouble : 0,
        healing ? healing->valuedouble : 0,
        crit_rate ? crit_rate->valuedouble : 0,
        ailment_chance ? ailment_chance->valuedouble : 0,
        flinch_chance ? flinch_chance->valuedouble : 0,
        stat_chance ? stat_chance->valuedouble : 0
        );

    return move_meta_local_var;
end:
    if (ailment_local_nonprim) {
        move_meta_ailment_summary_free(ailment_local_nonprim);
        ailment_local_nonprim = NULL;
    }
    if (category_local_nonprim) {
        move_meta_category_summary_free(category_local_nonprim);
        category_local_nonprim = NULL;
    }
    return NULL;

}
