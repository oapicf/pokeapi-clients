#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "nature_battle_style_preference.h"



static nature_battle_style_preference_t *nature_battle_style_preference_create_internal(
    int low_hp_preference,
    int high_hp_preference,
    move_battle_style_summary_t *move_battle_style
    ) {
    nature_battle_style_preference_t *nature_battle_style_preference_local_var = malloc(sizeof(nature_battle_style_preference_t));
    if (!nature_battle_style_preference_local_var) {
        return NULL;
    }
    nature_battle_style_preference_local_var->low_hp_preference = low_hp_preference;
    nature_battle_style_preference_local_var->high_hp_preference = high_hp_preference;
    nature_battle_style_preference_local_var->move_battle_style = move_battle_style;

    nature_battle_style_preference_local_var->_library_owned = 1;
    return nature_battle_style_preference_local_var;
}

__attribute__((deprecated)) nature_battle_style_preference_t *nature_battle_style_preference_create(
    int low_hp_preference,
    int high_hp_preference,
    move_battle_style_summary_t *move_battle_style
    ) {
    return nature_battle_style_preference_create_internal (
        low_hp_preference,
        high_hp_preference,
        move_battle_style
        );
}

void nature_battle_style_preference_free(nature_battle_style_preference_t *nature_battle_style_preference) {
    if(NULL == nature_battle_style_preference){
        return ;
    }
    if(nature_battle_style_preference->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "nature_battle_style_preference_free");
        return ;
    }
    listEntry_t *listEntry;
    if (nature_battle_style_preference->move_battle_style) {
        move_battle_style_summary_free(nature_battle_style_preference->move_battle_style);
        nature_battle_style_preference->move_battle_style = NULL;
    }
    free(nature_battle_style_preference);
}

cJSON *nature_battle_style_preference_convertToJSON(nature_battle_style_preference_t *nature_battle_style_preference) {
    cJSON *item = cJSON_CreateObject();

    // nature_battle_style_preference->low_hp_preference
    if (!nature_battle_style_preference->low_hp_preference) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "low_hp_preference", nature_battle_style_preference->low_hp_preference) == NULL) {
    goto fail; //Numeric
    }


    // nature_battle_style_preference->high_hp_preference
    if (!nature_battle_style_preference->high_hp_preference) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "high_hp_preference", nature_battle_style_preference->high_hp_preference) == NULL) {
    goto fail; //Numeric
    }


    // nature_battle_style_preference->move_battle_style
    if (!nature_battle_style_preference->move_battle_style) {
        goto fail;
    }
    cJSON *move_battle_style_local_JSON = move_battle_style_summary_convertToJSON(nature_battle_style_preference->move_battle_style);
    if(move_battle_style_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "move_battle_style", move_battle_style_local_JSON);
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

nature_battle_style_preference_t *nature_battle_style_preference_parseFromJSON(cJSON *nature_battle_style_preferenceJSON){

    nature_battle_style_preference_t *nature_battle_style_preference_local_var = NULL;

    // define the local variable for nature_battle_style_preference->move_battle_style
    move_battle_style_summary_t *move_battle_style_local_nonprim = NULL;

    // nature_battle_style_preference->low_hp_preference
    cJSON *low_hp_preference = cJSON_GetObjectItemCaseSensitive(nature_battle_style_preferenceJSON, "low_hp_preference");
    if (cJSON_IsNull(low_hp_preference)) {
        low_hp_preference = NULL;
    }
    if (!low_hp_preference) {
        goto end;
    }

    
    if(!cJSON_IsNumber(low_hp_preference))
    {
    goto end; //Numeric
    }

    // nature_battle_style_preference->high_hp_preference
    cJSON *high_hp_preference = cJSON_GetObjectItemCaseSensitive(nature_battle_style_preferenceJSON, "high_hp_preference");
    if (cJSON_IsNull(high_hp_preference)) {
        high_hp_preference = NULL;
    }
    if (!high_hp_preference) {
        goto end;
    }

    
    if(!cJSON_IsNumber(high_hp_preference))
    {
    goto end; //Numeric
    }

    // nature_battle_style_preference->move_battle_style
    cJSON *move_battle_style = cJSON_GetObjectItemCaseSensitive(nature_battle_style_preferenceJSON, "move_battle_style");
    if (cJSON_IsNull(move_battle_style)) {
        move_battle_style = NULL;
    }
    if (!move_battle_style) {
        goto end;
    }

    
    move_battle_style_local_nonprim = move_battle_style_summary_parseFromJSON(move_battle_style); //nonprimitive


    nature_battle_style_preference_local_var = nature_battle_style_preference_create_internal (
        low_hp_preference->valuedouble,
        high_hp_preference->valuedouble,
        move_battle_style_local_nonprim
        );

    return nature_battle_style_preference_local_var;
end:
    if (move_battle_style_local_nonprim) {
        move_battle_style_summary_free(move_battle_style_local_nonprim);
        move_battle_style_local_nonprim = NULL;
    }
    return NULL;

}
