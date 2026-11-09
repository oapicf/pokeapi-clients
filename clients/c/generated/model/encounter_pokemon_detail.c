#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "encounter_pokemon_detail.h"



static encounter_pokemon_detail_t *encounter_pokemon_detail_create_internal(
    int *min_perfect_ivs,
    int *always_shiny,
    int *never_shiny,
    int *is_alpha
    ) {
    encounter_pokemon_detail_t *encounter_pokemon_detail_local_var = malloc(sizeof(encounter_pokemon_detail_t));
    if (!encounter_pokemon_detail_local_var) {
        return NULL;
    }
    memset(encounter_pokemon_detail_local_var, 0, sizeof(encounter_pokemon_detail_t));
    encounter_pokemon_detail_local_var->_library_owned = 1;
    encounter_pokemon_detail_local_var->min_perfect_ivs = min_perfect_ivs;
    encounter_pokemon_detail_local_var->always_shiny = always_shiny;
    encounter_pokemon_detail_local_var->never_shiny = never_shiny;
    encounter_pokemon_detail_local_var->is_alpha = is_alpha;
    return encounter_pokemon_detail_local_var;
}

__attribute__((deprecated)) encounter_pokemon_detail_t *encounter_pokemon_detail_create(
    int *min_perfect_ivs,
    int *always_shiny,
    int *never_shiny,
    int *is_alpha
    ) {
    int *min_perfect_ivs_copy = NULL;
    if (min_perfect_ivs) {
        min_perfect_ivs_copy = malloc(sizeof(int));
        if (min_perfect_ivs_copy) *min_perfect_ivs_copy = *min_perfect_ivs;
    }
    int *always_shiny_copy = NULL;
    if (always_shiny) {
        always_shiny_copy = malloc(sizeof(int));
        if (always_shiny_copy) *always_shiny_copy = *always_shiny;
    }
    int *never_shiny_copy = NULL;
    if (never_shiny) {
        never_shiny_copy = malloc(sizeof(int));
        if (never_shiny_copy) *never_shiny_copy = *never_shiny;
    }
    int *is_alpha_copy = NULL;
    if (is_alpha) {
        is_alpha_copy = malloc(sizeof(int));
        if (is_alpha_copy) *is_alpha_copy = *is_alpha;
    }
    encounter_pokemon_detail_t *result = encounter_pokemon_detail_create_internal (
        min_perfect_ivs_copy,
        always_shiny_copy,
        never_shiny_copy,
        is_alpha_copy
        );
    if (!result) {
        free(min_perfect_ivs_copy);
        free(always_shiny_copy);
        free(never_shiny_copy);
        free(is_alpha_copy);
    }
    return result;
}

void encounter_pokemon_detail_free(encounter_pokemon_detail_t *encounter_pokemon_detail) {
    if(NULL == encounter_pokemon_detail){
        return ;
    }
    if(encounter_pokemon_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "encounter_pokemon_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (encounter_pokemon_detail->min_perfect_ivs) {
        free(encounter_pokemon_detail->min_perfect_ivs);
        encounter_pokemon_detail->min_perfect_ivs = NULL;
    }
    if (encounter_pokemon_detail->always_shiny) {
        free(encounter_pokemon_detail->always_shiny);
        encounter_pokemon_detail->always_shiny = NULL;
    }
    if (encounter_pokemon_detail->never_shiny) {
        free(encounter_pokemon_detail->never_shiny);
        encounter_pokemon_detail->never_shiny = NULL;
    }
    if (encounter_pokemon_detail->is_alpha) {
        free(encounter_pokemon_detail->is_alpha);
        encounter_pokemon_detail->is_alpha = NULL;
    }
    free(encounter_pokemon_detail);
}

cJSON *encounter_pokemon_detail_convertToJSON(encounter_pokemon_detail_t *encounter_pokemon_detail) {
    cJSON *item = cJSON_CreateObject();

    // encounter_pokemon_detail->min_perfect_ivs
    if(encounter_pokemon_detail->min_perfect_ivs) {
    if(cJSON_AddNumberToObject(item, "min_perfect_ivs", *encounter_pokemon_detail->min_perfect_ivs) == NULL) {
    goto fail; //Numeric
    }
    }


    // encounter_pokemon_detail->always_shiny
    if(encounter_pokemon_detail->always_shiny) {
    if(cJSON_AddBoolToObject(item, "always_shiny", *encounter_pokemon_detail->always_shiny) == NULL) {
    goto fail; //Bool
    }
    }


    // encounter_pokemon_detail->never_shiny
    if(encounter_pokemon_detail->never_shiny) {
    if(cJSON_AddBoolToObject(item, "never_shiny", *encounter_pokemon_detail->never_shiny) == NULL) {
    goto fail; //Bool
    }
    }


    // encounter_pokemon_detail->is_alpha
    if(encounter_pokemon_detail->is_alpha) {
    if(cJSON_AddBoolToObject(item, "is_alpha", *encounter_pokemon_detail->is_alpha) == NULL) {
    goto fail; //Bool
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

encounter_pokemon_detail_t *encounter_pokemon_detail_parseFromJSON(cJSON *encounter_pokemon_detailJSON){

    encounter_pokemon_detail_t *encounter_pokemon_detail_local_var = NULL;

    // define the local variable for encounter_pokemon_detail->min_perfect_ivs
    int *min_perfect_ivs_local_var = NULL;

    // define the local variable for encounter_pokemon_detail->always_shiny
    int *always_shiny_local_var = NULL;

    // define the local variable for encounter_pokemon_detail->never_shiny
    int *never_shiny_local_var = NULL;

    // define the local variable for encounter_pokemon_detail->is_alpha
    int *is_alpha_local_var = NULL;

    // encounter_pokemon_detail->min_perfect_ivs
    cJSON *min_perfect_ivs = cJSON_GetObjectItemCaseSensitive(encounter_pokemon_detailJSON, "min_perfect_ivs");
    if (cJSON_IsNull(min_perfect_ivs)) {
        min_perfect_ivs = NULL;
    }
    if (min_perfect_ivs) { 
    if(!cJSON_IsNumber(min_perfect_ivs))
    {
    goto end; //Numeric
    }
    min_perfect_ivs_local_var = malloc(sizeof(int));
    if(!min_perfect_ivs_local_var)
    {
        goto end;
    }
    *min_perfect_ivs_local_var = min_perfect_ivs->valuedouble;
    }

    // encounter_pokemon_detail->always_shiny
    cJSON *always_shiny = cJSON_GetObjectItemCaseSensitive(encounter_pokemon_detailJSON, "always_shiny");
    if (cJSON_IsNull(always_shiny)) {
        always_shiny = NULL;
    }
    if (always_shiny) { 
    if(!cJSON_IsBool(always_shiny))
    {
    goto end; //Bool
    }
    always_shiny_local_var = malloc(sizeof(int));
    if(!always_shiny_local_var)
    {
        goto end;
    }
    *always_shiny_local_var = always_shiny->valueint;
    }

    // encounter_pokemon_detail->never_shiny
    cJSON *never_shiny = cJSON_GetObjectItemCaseSensitive(encounter_pokemon_detailJSON, "never_shiny");
    if (cJSON_IsNull(never_shiny)) {
        never_shiny = NULL;
    }
    if (never_shiny) { 
    if(!cJSON_IsBool(never_shiny))
    {
    goto end; //Bool
    }
    never_shiny_local_var = malloc(sizeof(int));
    if(!never_shiny_local_var)
    {
        goto end;
    }
    *never_shiny_local_var = never_shiny->valueint;
    }

    // encounter_pokemon_detail->is_alpha
    cJSON *is_alpha = cJSON_GetObjectItemCaseSensitive(encounter_pokemon_detailJSON, "is_alpha");
    if (cJSON_IsNull(is_alpha)) {
        is_alpha = NULL;
    }
    if (is_alpha) { 
    if(!cJSON_IsBool(is_alpha))
    {
    goto end; //Bool
    }
    is_alpha_local_var = malloc(sizeof(int));
    if(!is_alpha_local_var)
    {
        goto end;
    }
    *is_alpha_local_var = is_alpha->valueint;
    }



    encounter_pokemon_detail_local_var = encounter_pokemon_detail_create_internal (
        min_perfect_ivs_local_var,
        always_shiny_local_var,
        never_shiny_local_var,
        is_alpha_local_var
        );

    if (!encounter_pokemon_detail_local_var) {
        goto end;
    }

    return encounter_pokemon_detail_local_var;
end:
    if (min_perfect_ivs_local_var) {
        free(min_perfect_ivs_local_var);
        min_perfect_ivs_local_var = NULL;
    }
    if (always_shiny_local_var) {
        free(always_shiny_local_var);
        always_shiny_local_var = NULL;
    }
    if (never_shiny_local_var) {
        free(never_shiny_local_var);
        never_shiny_local_var = NULL;
    }
    if (is_alpha_local_var) {
        free(is_alpha_local_var);
        is_alpha_local_var = NULL;
    }
    return NULL;

}
