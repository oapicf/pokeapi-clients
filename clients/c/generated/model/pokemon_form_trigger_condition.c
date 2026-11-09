#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "pokemon_form_trigger_condition.h"



static pokemon_form_trigger_condition_t *pokemon_form_trigger_condition_create_internal(
    char *trigger,
    char *name,
    char *url,
    pokemon_form_summary_t *base_form
    ) {
    pokemon_form_trigger_condition_t *pokemon_form_trigger_condition_local_var = malloc(sizeof(pokemon_form_trigger_condition_t));
    if (!pokemon_form_trigger_condition_local_var) {
        return NULL;
    }
    memset(pokemon_form_trigger_condition_local_var, 0, sizeof(pokemon_form_trigger_condition_t));
    pokemon_form_trigger_condition_local_var->_library_owned = 1;
    pokemon_form_trigger_condition_local_var->trigger = trigger;
    pokemon_form_trigger_condition_local_var->name = name;
    pokemon_form_trigger_condition_local_var->url = url;
    pokemon_form_trigger_condition_local_var->base_form = base_form;
    return pokemon_form_trigger_condition_local_var;
}

__attribute__((deprecated)) pokemon_form_trigger_condition_t *pokemon_form_trigger_condition_create(
    char *trigger,
    char *name,
    char *url,
    pokemon_form_summary_t *base_form
    ) {
    pokemon_form_trigger_condition_t *result = pokemon_form_trigger_condition_create_internal (
        trigger,
        name,
        url,
        base_form
        );
    if (!result) {
    }
    return result;
}

void pokemon_form_trigger_condition_free(pokemon_form_trigger_condition_t *pokemon_form_trigger_condition) {
    if(NULL == pokemon_form_trigger_condition){
        return ;
    }
    if(pokemon_form_trigger_condition->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "pokemon_form_trigger_condition_free");
        return ;
    }
    listEntry_t *listEntry;
    if (pokemon_form_trigger_condition->trigger) {
        free(pokemon_form_trigger_condition->trigger);
        pokemon_form_trigger_condition->trigger = NULL;
    }
    if (pokemon_form_trigger_condition->name) {
        free(pokemon_form_trigger_condition->name);
        pokemon_form_trigger_condition->name = NULL;
    }
    if (pokemon_form_trigger_condition->url) {
        free(pokemon_form_trigger_condition->url);
        pokemon_form_trigger_condition->url = NULL;
    }
    if (pokemon_form_trigger_condition->base_form) {
        pokemon_form_summary_free(pokemon_form_trigger_condition->base_form);
        pokemon_form_trigger_condition->base_form = NULL;
    }
    free(pokemon_form_trigger_condition);
}

cJSON *pokemon_form_trigger_condition_convertToJSON(pokemon_form_trigger_condition_t *pokemon_form_trigger_condition) {
    cJSON *item = cJSON_CreateObject();

    // pokemon_form_trigger_condition->trigger
    if (!pokemon_form_trigger_condition->trigger) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "trigger", pokemon_form_trigger_condition->trigger) == NULL) {
    goto fail; //String
    }


    // pokemon_form_trigger_condition->name
    if(pokemon_form_trigger_condition->name) {
    if(cJSON_AddStringToObject(item, "name", pokemon_form_trigger_condition->name) == NULL) {
    goto fail; //String
    }
    }


    // pokemon_form_trigger_condition->url
    if(pokemon_form_trigger_condition->url) {
    if(cJSON_AddStringToObject(item, "url", pokemon_form_trigger_condition->url) == NULL) {
    goto fail; //String
    }
    }


    // pokemon_form_trigger_condition->base_form
    if(pokemon_form_trigger_condition->base_form) {
    cJSON *base_form_local_JSON = pokemon_form_summary_convertToJSON(pokemon_form_trigger_condition->base_form);
    if(base_form_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "base_form", base_form_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

pokemon_form_trigger_condition_t *pokemon_form_trigger_condition_parseFromJSON(cJSON *pokemon_form_trigger_conditionJSON){

    pokemon_form_trigger_condition_t *pokemon_form_trigger_condition_local_var = NULL;

    char *trigger_local_str = NULL;

    char *name_local_str = NULL;

    char *url_local_str = NULL;

    // define the local variable for pokemon_form_trigger_condition->base_form
    pokemon_form_summary_t *base_form_local_nonprim = NULL;

    // pokemon_form_trigger_condition->trigger
    cJSON *trigger = cJSON_GetObjectItemCaseSensitive(pokemon_form_trigger_conditionJSON, "trigger");
    if (cJSON_IsNull(trigger)) {
        trigger = NULL;
    }
    if (!trigger) {
        goto end;
    }

    
    if(!cJSON_IsString(trigger))
    {
    goto end; //String
    }

    // pokemon_form_trigger_condition->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(pokemon_form_trigger_conditionJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // pokemon_form_trigger_condition->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(pokemon_form_trigger_conditionJSON, "url");
    if (cJSON_IsNull(url)) {
        url = NULL;
    }
    if (url) { 
    if(!cJSON_IsString(url) && !cJSON_IsNull(url))
    {
    goto end; //String
    }
    }

    // pokemon_form_trigger_condition->base_form
    cJSON *base_form = cJSON_GetObjectItemCaseSensitive(pokemon_form_trigger_conditionJSON, "base_form");
    if (cJSON_IsNull(base_form)) {
        base_form = NULL;
    }
    if (base_form) { 
    base_form_local_nonprim = pokemon_form_summary_parseFromJSON(base_form); //nonprimitive
    }


    if (trigger && !cJSON_IsNull(trigger)) trigger_local_str = strdup(trigger->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (url && !cJSON_IsNull(url)) url_local_str = strdup(url->valuestring);

    pokemon_form_trigger_condition_local_var = pokemon_form_trigger_condition_create_internal (
        trigger_local_str,
        name_local_str,
        url_local_str,
        base_form ? base_form_local_nonprim : NULL
        );

    if (!pokemon_form_trigger_condition_local_var) {
        goto end;
    }

    return pokemon_form_trigger_condition_local_var;
end:
    if (trigger_local_str) {
        free(trigger_local_str);
        trigger_local_str = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (url_local_str) {
        free(url_local_str);
        url_local_str = NULL;
    }
    if (base_form_local_nonprim) {
        pokemon_form_summary_free(base_form_local_nonprim);
        base_form_local_nonprim = NULL;
    }
    return NULL;

}
