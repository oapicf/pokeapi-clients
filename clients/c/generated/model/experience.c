#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "experience.h"



static experience_t *experience_create_internal(
    int level,
    int experience
    ) {
    experience_t *experience_local_var = malloc(sizeof(experience_t));
    if (!experience_local_var) {
        return NULL;
    }
    experience_local_var->level = level;
    experience_local_var->experience = experience;

    experience_local_var->_library_owned = 1;
    return experience_local_var;
}

__attribute__((deprecated)) experience_t *experience_create(
    int level,
    int experience
    ) {
    return experience_create_internal (
        level,
        experience
        );
}

void experience_free(experience_t *experience) {
    if(NULL == experience){
        return ;
    }
    if(experience->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "experience_free");
        return ;
    }
    listEntry_t *listEntry;
    free(experience);
}

cJSON *experience_convertToJSON(experience_t *experience) {
    cJSON *item = cJSON_CreateObject();

    // experience->level
    if (!experience->level) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "level", experience->level) == NULL) {
    goto fail; //Numeric
    }


    // experience->experience
    if (!experience->experience) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "experience", experience->experience) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

experience_t *experience_parseFromJSON(cJSON *experienceJSON){

    experience_t *experience_local_var = NULL;

    // experience->level
    cJSON *level = cJSON_GetObjectItemCaseSensitive(experienceJSON, "level");
    if (cJSON_IsNull(level)) {
        level = NULL;
    }
    if (!level) {
        goto end;
    }

    
    if(!cJSON_IsNumber(level))
    {
    goto end; //Numeric
    }

    // experience->experience
    cJSON *experience = cJSON_GetObjectItemCaseSensitive(experienceJSON, "experience");
    if (cJSON_IsNull(experience)) {
        experience = NULL;
    }
    if (!experience) {
        goto end;
    }

    
    if(!cJSON_IsNumber(experience))
    {
    goto end; //Numeric
    }


    experience_local_var = experience_create_internal (
        level->valuedouble,
        experience->valuedouble
        );

    return experience_local_var;
end:
    return NULL;

}
