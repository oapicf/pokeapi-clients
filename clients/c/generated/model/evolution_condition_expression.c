#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "evolution_condition_expression.h"



static evolution_condition_expression_t *evolution_condition_expression_create_internal(
    char *expression,
    double *percentage_chance,
    list_t *variables
    ) {
    evolution_condition_expression_t *evolution_condition_expression_local_var = malloc(sizeof(evolution_condition_expression_t));
    if (!evolution_condition_expression_local_var) {
        return NULL;
    }
    memset(evolution_condition_expression_local_var, 0, sizeof(evolution_condition_expression_t));
    evolution_condition_expression_local_var->_library_owned = 1;
    evolution_condition_expression_local_var->expression = expression;
    evolution_condition_expression_local_var->percentage_chance = percentage_chance;
    evolution_condition_expression_local_var->variables = variables;
    return evolution_condition_expression_local_var;
}

__attribute__((deprecated)) evolution_condition_expression_t *evolution_condition_expression_create(
    char *expression,
    double *percentage_chance,
    list_t *variables
    ) {
    double *percentage_chance_copy = NULL;
    if (percentage_chance) {
        percentage_chance_copy = malloc(sizeof(double));
        if (percentage_chance_copy) *percentage_chance_copy = *percentage_chance;
    }
    evolution_condition_expression_t *result = evolution_condition_expression_create_internal (
        expression,
        percentage_chance_copy,
        variables
        );
    if (!result) {
        free(percentage_chance_copy);
    }
    return result;
}

void evolution_condition_expression_free(evolution_condition_expression_t *evolution_condition_expression) {
    if(NULL == evolution_condition_expression){
        return ;
    }
    if(evolution_condition_expression->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "evolution_condition_expression_free");
        return ;
    }
    listEntry_t *listEntry;
    if (evolution_condition_expression->expression) {
        free(evolution_condition_expression->expression);
        evolution_condition_expression->expression = NULL;
    }
    if (evolution_condition_expression->percentage_chance) {
        free(evolution_condition_expression->percentage_chance);
        evolution_condition_expression->percentage_chance = NULL;
    }
    if (evolution_condition_expression->variables) {
        list_ForEach(listEntry, evolution_condition_expression->variables) {
            evolution_variable_summary_free(listEntry->data);
        }
        list_freeList(evolution_condition_expression->variables);
        evolution_condition_expression->variables = NULL;
    }
    free(evolution_condition_expression);
}

cJSON *evolution_condition_expression_convertToJSON(evolution_condition_expression_t *evolution_condition_expression) {
    cJSON *item = cJSON_CreateObject();

    // evolution_condition_expression->expression
    if (!evolution_condition_expression->expression) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "expression", evolution_condition_expression->expression) == NULL) {
    goto fail; //String
    }


    // evolution_condition_expression->percentage_chance
    if (!evolution_condition_expression->percentage_chance) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "percentage_chance", *evolution_condition_expression->percentage_chance) == NULL) {
    goto fail; //Numeric
    }


    // evolution_condition_expression->variables
    if (!evolution_condition_expression->variables) {
        goto fail;
    }
    cJSON *variables = cJSON_AddArrayToObject(item, "variables");
    if(variables == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *variablesListEntry;
    if (evolution_condition_expression->variables) {
    list_ForEach(variablesListEntry, evolution_condition_expression->variables) {
    cJSON *itemLocal = evolution_variable_summary_convertToJSON(variablesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(variables, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

evolution_condition_expression_t *evolution_condition_expression_parseFromJSON(cJSON *evolution_condition_expressionJSON){

    evolution_condition_expression_t *evolution_condition_expression_local_var = NULL;

    char *expression_local_str = NULL;

    // define the local variable for evolution_condition_expression->percentage_chance
    double *percentage_chance_local_var = NULL;

    // define the local list for evolution_condition_expression->variables
    list_t *variablesList = NULL;

    // evolution_condition_expression->expression
    cJSON *expression = cJSON_GetObjectItemCaseSensitive(evolution_condition_expressionJSON, "expression");
    if (cJSON_IsNull(expression)) {
        expression = NULL;
    }
    if (!expression) {
        goto end;
    }

    
    if(!cJSON_IsString(expression))
    {
    goto end; //String
    }

    // evolution_condition_expression->percentage_chance
    cJSON *percentage_chance = cJSON_GetObjectItemCaseSensitive(evolution_condition_expressionJSON, "percentage_chance");
    if (cJSON_IsNull(percentage_chance)) {
        percentage_chance = NULL;
    }
    if (!percentage_chance) {
        goto end;
    }

    
    if(!cJSON_IsNumber(percentage_chance))
    {
    goto end; //Numeric
    }
    percentage_chance_local_var = malloc(sizeof(double));
    if(!percentage_chance_local_var)
    {
        goto end;
    }
    *percentage_chance_local_var = percentage_chance->valuedouble;

    // evolution_condition_expression->variables
    cJSON *variables = cJSON_GetObjectItemCaseSensitive(evolution_condition_expressionJSON, "variables");
    if (cJSON_IsNull(variables)) {
        variables = NULL;
    }
    if (!variables) {
        goto end;
    }

    
    cJSON *variables_local_nonprimitive = NULL;
    if(!cJSON_IsArray(variables)){
        goto end; //nonprimitive container
    }

    variablesList = list_createList();

    cJSON_ArrayForEach(variables_local_nonprimitive,variables )
    {
        if(!cJSON_IsObject(variables_local_nonprimitive)){
            goto end;
        }
        evolution_variable_summary_t *variablesItem = evolution_variable_summary_parseFromJSON(variables_local_nonprimitive);

        list_addElement(variablesList, variablesItem);
    }


    if (expression && !cJSON_IsNull(expression)) expression_local_str = strdup(expression->valuestring);

    evolution_condition_expression_local_var = evolution_condition_expression_create_internal (
        expression_local_str,
        percentage_chance_local_var,
        variablesList
        );

    if (!evolution_condition_expression_local_var) {
        goto end;
    }

    return evolution_condition_expression_local_var;
end:
    if (expression_local_str) {
        free(expression_local_str);
        expression_local_str = NULL;
    }
    if (percentage_chance_local_var) {
        free(percentage_chance_local_var);
        percentage_chance_local_var = NULL;
    }
    if (variablesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, variablesList) {
            evolution_variable_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(variablesList);
        variablesList = NULL;
    }
    return NULL;

}
