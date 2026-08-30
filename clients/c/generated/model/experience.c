#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "experience.h"



static experience_t *experience_create_internal(
    int *level,
    int *experience
    ) {
    experience_t *experience_local_var = malloc(sizeof(experience_t));
    if (!experience_local_var) {
        return NULL;
    }
    memset(experience_local_var, 0, sizeof(experience_t));
    experience_local_var->_library_owned = 1;
    experience_local_var->level = level;
    experience_local_var->experience = experience;
    return experience_local_var;
}

__attribute__((deprecated)) experience_t *experience_create(
    int *level,
    int *experience
    ) {
    int *level_copy = NULL;
    if (level) {
        level_copy = malloc(sizeof(int));
        if (level_copy) *level_copy = *level;
    }
    int *experience_copy = NULL;
    if (experience) {
        experience_copy = malloc(sizeof(int));
        if (experience_copy) *experience_copy = *experience;
    }
    experience_t *result = experience_create_internal (
        level_copy,
        experience_copy
        );
    if (!result) {
        free(level_copy);
        free(experience_copy);
    }
    return result;
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
    if (experience->level) {
        free(experience->level);
        experience->level = NULL;
    }
    if (experience->experience) {
        free(experience->experience);
        experience->experience = NULL;
    }
    free(experience);
}

cJSON *experience_convertToJSON(experience_t *experience) {
    cJSON *item = cJSON_CreateObject();

    // experience->level
    if (!experience->level) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "level", *experience->level) == NULL) {
    goto fail; //Numeric
    }


    // experience->experience
    if (!experience->experience) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "experience", *experience->experience) == NULL) {
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

    // define the local variable for experience->level
    int *level_local_var = NULL;

    // define the local variable for experience->experience
    int *experience_local_var = NULL;

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
    level_local_var = malloc(sizeof(int));
    if(!level_local_var)
    {
        goto end;
    }
    *level_local_var = level->valuedouble;

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
    experience_local_var = malloc(sizeof(int));
    if(!experience_local_var)
    {
        goto end;
    }
    *experience_local_var = experience->valuedouble;



    experience_local_var = experience_create_internal (
        level_local_var,
        experience_local_var
        );

    if (!experience_local_var) {
        goto end;
    }

    return experience_local_var;
end:
    if (level_local_var) {
        free(level_local_var);
        level_local_var = NULL;
    }
    if (experience_local_var) {
        free(experience_local_var);
        experience_local_var = NULL;
    }
    return NULL;

}
