#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender.h"



static evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_create_internal(
    char *name,
    char *url
    ) {
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_local_var = malloc(sizeof(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t));
    if (!evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_local_var) {
        return NULL;
    }
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_local_var->name = name;
    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_local_var->url = url;

    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_local_var->_library_owned = 1;
    return evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_local_var;
}

__attribute__((deprecated)) evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_create(
    char *name,
    char *url
    ) {
    return evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_create_internal (
        name,
        url
        );
}

void evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_free(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender) {
    if(NULL == evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender){
        return ;
    }
    if(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_free");
        return ;
    }
    listEntry_t *listEntry;
    if (evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender->name) {
        free(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender->name);
        evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender->name = NULL;
    }
    if (evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender->url) {
        free(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender->url);
        evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender->url = NULL;
    }
    free(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender);
}

cJSON *evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_convertToJSON(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender) {
    cJSON *item = cJSON_CreateObject();

    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender->name
    if (!evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender->name) == NULL) {
    goto fail; //String
    }


    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender->url
    if (!evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_parseFromJSON(cJSON *evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_genderJSON){

    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_t *evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_local_var = NULL;

    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_genderJSON, "name");
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

    // evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_genderJSON, "url");
    if (cJSON_IsNull(url)) {
        url = NULL;
    }
    if (!url) {
        goto end;
    }

    
    if(!cJSON_IsString(url))
    {
    goto end; //String
    }


    evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_local_var = evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_create_internal (
        strdup(name->valuestring),
        strdup(url->valuestring)
        );

    return evolution_chain_detail_chain_evolves_to_inner_evolution_details_inner_gender_local_var;
end:
    return NULL;

}
