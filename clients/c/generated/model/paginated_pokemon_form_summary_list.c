#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "paginated_pokemon_form_summary_list.h"



static paginated_pokemon_form_summary_list_t *paginated_pokemon_form_summary_list_create_internal(
    int *count,
    char *next,
    char *previous,
    list_t *results
    ) {
    paginated_pokemon_form_summary_list_t *paginated_pokemon_form_summary_list_local_var = malloc(sizeof(paginated_pokemon_form_summary_list_t));
    if (!paginated_pokemon_form_summary_list_local_var) {
        return NULL;
    }
    memset(paginated_pokemon_form_summary_list_local_var, 0, sizeof(paginated_pokemon_form_summary_list_t));
    paginated_pokemon_form_summary_list_local_var->_library_owned = 1;
    paginated_pokemon_form_summary_list_local_var->count = count;
    paginated_pokemon_form_summary_list_local_var->next = next;
    paginated_pokemon_form_summary_list_local_var->previous = previous;
    paginated_pokemon_form_summary_list_local_var->results = results;
    return paginated_pokemon_form_summary_list_local_var;
}

__attribute__((deprecated)) paginated_pokemon_form_summary_list_t *paginated_pokemon_form_summary_list_create(
    int *count,
    char *next,
    char *previous,
    list_t *results
    ) {
    int *count_copy = NULL;
    if (count) {
        count_copy = malloc(sizeof(int));
        if (count_copy) *count_copy = *count;
    }
    paginated_pokemon_form_summary_list_t *result = paginated_pokemon_form_summary_list_create_internal (
        count_copy,
        next,
        previous,
        results
        );
    if (!result) {
        free(count_copy);
    }
    return result;
}

void paginated_pokemon_form_summary_list_free(paginated_pokemon_form_summary_list_t *paginated_pokemon_form_summary_list) {
    if(NULL == paginated_pokemon_form_summary_list){
        return ;
    }
    if(paginated_pokemon_form_summary_list->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "paginated_pokemon_form_summary_list_free");
        return ;
    }
    listEntry_t *listEntry;
    if (paginated_pokemon_form_summary_list->count) {
        free(paginated_pokemon_form_summary_list->count);
        paginated_pokemon_form_summary_list->count = NULL;
    }
    if (paginated_pokemon_form_summary_list->next) {
        free(paginated_pokemon_form_summary_list->next);
        paginated_pokemon_form_summary_list->next = NULL;
    }
    if (paginated_pokemon_form_summary_list->previous) {
        free(paginated_pokemon_form_summary_list->previous);
        paginated_pokemon_form_summary_list->previous = NULL;
    }
    if (paginated_pokemon_form_summary_list->results) {
        list_ForEach(listEntry, paginated_pokemon_form_summary_list->results) {
            pokemon_form_summary_free(listEntry->data);
        }
        list_freeList(paginated_pokemon_form_summary_list->results);
        paginated_pokemon_form_summary_list->results = NULL;
    }
    free(paginated_pokemon_form_summary_list);
}

cJSON *paginated_pokemon_form_summary_list_convertToJSON(paginated_pokemon_form_summary_list_t *paginated_pokemon_form_summary_list) {
    cJSON *item = cJSON_CreateObject();

    // paginated_pokemon_form_summary_list->count
    if(paginated_pokemon_form_summary_list->count) {
    if(cJSON_AddNumberToObject(item, "count", *paginated_pokemon_form_summary_list->count) == NULL) {
    goto fail; //Numeric
    }
    }


    // paginated_pokemon_form_summary_list->next
    if(paginated_pokemon_form_summary_list->next) {
    if(cJSON_AddStringToObject(item, "next", paginated_pokemon_form_summary_list->next) == NULL) {
    goto fail; //String
    }
    }


    // paginated_pokemon_form_summary_list->previous
    if(paginated_pokemon_form_summary_list->previous) {
    if(cJSON_AddStringToObject(item, "previous", paginated_pokemon_form_summary_list->previous) == NULL) {
    goto fail; //String
    }
    }


    // paginated_pokemon_form_summary_list->results
    if(paginated_pokemon_form_summary_list->results) {
    cJSON *results = cJSON_AddArrayToObject(item, "results");
    if(results == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *resultsListEntry;
    if (paginated_pokemon_form_summary_list->results) {
    list_ForEach(resultsListEntry, paginated_pokemon_form_summary_list->results) {
    cJSON *itemLocal = pokemon_form_summary_convertToJSON(resultsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(results, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

paginated_pokemon_form_summary_list_t *paginated_pokemon_form_summary_list_parseFromJSON(cJSON *paginated_pokemon_form_summary_listJSON){

    paginated_pokemon_form_summary_list_t *paginated_pokemon_form_summary_list_local_var = NULL;

    // define the local variable for paginated_pokemon_form_summary_list->count
    int *count_local_var = NULL;

    char *next_local_str = NULL;

    char *previous_local_str = NULL;

    // define the local list for paginated_pokemon_form_summary_list->results
    list_t *resultsList = NULL;

    // paginated_pokemon_form_summary_list->count
    cJSON *count = cJSON_GetObjectItemCaseSensitive(paginated_pokemon_form_summary_listJSON, "count");
    if (cJSON_IsNull(count)) {
        count = NULL;
    }
    if (count) { 
    if(!cJSON_IsNumber(count))
    {
    goto end; //Numeric
    }
    count_local_var = malloc(sizeof(int));
    if(!count_local_var)
    {
        goto end;
    }
    *count_local_var = count->valuedouble;
    }

    // paginated_pokemon_form_summary_list->next
    cJSON *next = cJSON_GetObjectItemCaseSensitive(paginated_pokemon_form_summary_listJSON, "next");
    if (cJSON_IsNull(next)) {
        next = NULL;
    }
    if (next) { 
    if(!cJSON_IsString(next) && !cJSON_IsNull(next))
    {
    goto end; //String
    }
    }

    // paginated_pokemon_form_summary_list->previous
    cJSON *previous = cJSON_GetObjectItemCaseSensitive(paginated_pokemon_form_summary_listJSON, "previous");
    if (cJSON_IsNull(previous)) {
        previous = NULL;
    }
    if (previous) { 
    if(!cJSON_IsString(previous) && !cJSON_IsNull(previous))
    {
    goto end; //String
    }
    }

    // paginated_pokemon_form_summary_list->results
    cJSON *results = cJSON_GetObjectItemCaseSensitive(paginated_pokemon_form_summary_listJSON, "results");
    if (cJSON_IsNull(results)) {
        results = NULL;
    }
    if (results) { 
    cJSON *results_local_nonprimitive = NULL;
    if(!cJSON_IsArray(results)){
        goto end; //nonprimitive container
    }

    resultsList = list_createList();

    cJSON_ArrayForEach(results_local_nonprimitive,results )
    {
        if(!cJSON_IsObject(results_local_nonprimitive)){
            goto end;
        }
        pokemon_form_summary_t *resultsItem = pokemon_form_summary_parseFromJSON(results_local_nonprimitive);

        list_addElement(resultsList, resultsItem);
    }
    }


    if (next && !cJSON_IsNull(next)) next_local_str = strdup(next->valuestring);
    if (previous && !cJSON_IsNull(previous)) previous_local_str = strdup(previous->valuestring);

    paginated_pokemon_form_summary_list_local_var = paginated_pokemon_form_summary_list_create_internal (
        count_local_var,
        next_local_str,
        previous_local_str,
        results ? resultsList : NULL
        );

    if (!paginated_pokemon_form_summary_list_local_var) {
        goto end;
    }

    return paginated_pokemon_form_summary_list_local_var;
end:
    if (count_local_var) {
        free(count_local_var);
        count_local_var = NULL;
    }
    if (next_local_str) {
        free(next_local_str);
        next_local_str = NULL;
    }
    if (previous_local_str) {
        free(previous_local_str);
        previous_local_str = NULL;
    }
    if (resultsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, resultsList) {
            pokemon_form_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(resultsList);
        resultsList = NULL;
    }
    return NULL;

}
