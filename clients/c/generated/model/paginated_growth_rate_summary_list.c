#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "paginated_growth_rate_summary_list.h"



static paginated_growth_rate_summary_list_t *paginated_growth_rate_summary_list_create_internal(
    int count,
    char *next,
    char *previous,
    list_t *results
    ) {
    paginated_growth_rate_summary_list_t *paginated_growth_rate_summary_list_local_var = malloc(sizeof(paginated_growth_rate_summary_list_t));
    if (!paginated_growth_rate_summary_list_local_var) {
        return NULL;
    }
    paginated_growth_rate_summary_list_local_var->count = count;
    paginated_growth_rate_summary_list_local_var->next = next;
    paginated_growth_rate_summary_list_local_var->previous = previous;
    paginated_growth_rate_summary_list_local_var->results = results;

    paginated_growth_rate_summary_list_local_var->_library_owned = 1;
    return paginated_growth_rate_summary_list_local_var;
}

__attribute__((deprecated)) paginated_growth_rate_summary_list_t *paginated_growth_rate_summary_list_create(
    int count,
    char *next,
    char *previous,
    list_t *results
    ) {
    return paginated_growth_rate_summary_list_create_internal (
        count,
        next,
        previous,
        results
        );
}

void paginated_growth_rate_summary_list_free(paginated_growth_rate_summary_list_t *paginated_growth_rate_summary_list) {
    if(NULL == paginated_growth_rate_summary_list){
        return ;
    }
    if(paginated_growth_rate_summary_list->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "paginated_growth_rate_summary_list_free");
        return ;
    }
    listEntry_t *listEntry;
    if (paginated_growth_rate_summary_list->next) {
        free(paginated_growth_rate_summary_list->next);
        paginated_growth_rate_summary_list->next = NULL;
    }
    if (paginated_growth_rate_summary_list->previous) {
        free(paginated_growth_rate_summary_list->previous);
        paginated_growth_rate_summary_list->previous = NULL;
    }
    if (paginated_growth_rate_summary_list->results) {
        list_ForEach(listEntry, paginated_growth_rate_summary_list->results) {
            growth_rate_summary_free(listEntry->data);
        }
        list_freeList(paginated_growth_rate_summary_list->results);
        paginated_growth_rate_summary_list->results = NULL;
    }
    free(paginated_growth_rate_summary_list);
}

cJSON *paginated_growth_rate_summary_list_convertToJSON(paginated_growth_rate_summary_list_t *paginated_growth_rate_summary_list) {
    cJSON *item = cJSON_CreateObject();

    // paginated_growth_rate_summary_list->count
    if(paginated_growth_rate_summary_list->count) {
    if(cJSON_AddNumberToObject(item, "count", paginated_growth_rate_summary_list->count) == NULL) {
    goto fail; //Numeric
    }
    }


    // paginated_growth_rate_summary_list->next
    if(paginated_growth_rate_summary_list->next) {
    if(cJSON_AddStringToObject(item, "next", paginated_growth_rate_summary_list->next) == NULL) {
    goto fail; //String
    }
    }


    // paginated_growth_rate_summary_list->previous
    if(paginated_growth_rate_summary_list->previous) {
    if(cJSON_AddStringToObject(item, "previous", paginated_growth_rate_summary_list->previous) == NULL) {
    goto fail; //String
    }
    }


    // paginated_growth_rate_summary_list->results
    if(paginated_growth_rate_summary_list->results) {
    cJSON *results = cJSON_AddArrayToObject(item, "results");
    if(results == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *resultsListEntry;
    if (paginated_growth_rate_summary_list->results) {
    list_ForEach(resultsListEntry, paginated_growth_rate_summary_list->results) {
    cJSON *itemLocal = growth_rate_summary_convertToJSON(resultsListEntry->data);
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

paginated_growth_rate_summary_list_t *paginated_growth_rate_summary_list_parseFromJSON(cJSON *paginated_growth_rate_summary_listJSON){

    paginated_growth_rate_summary_list_t *paginated_growth_rate_summary_list_local_var = NULL;

    // define the local list for paginated_growth_rate_summary_list->results
    list_t *resultsList = NULL;

    // paginated_growth_rate_summary_list->count
    cJSON *count = cJSON_GetObjectItemCaseSensitive(paginated_growth_rate_summary_listJSON, "count");
    if (cJSON_IsNull(count)) {
        count = NULL;
    }
    if (count) { 
    if(!cJSON_IsNumber(count))
    {
    goto end; //Numeric
    }
    }

    // paginated_growth_rate_summary_list->next
    cJSON *next = cJSON_GetObjectItemCaseSensitive(paginated_growth_rate_summary_listJSON, "next");
    if (cJSON_IsNull(next)) {
        next = NULL;
    }
    if (next) { 
    if(!cJSON_IsString(next) && !cJSON_IsNull(next))
    {
    goto end; //String
    }
    }

    // paginated_growth_rate_summary_list->previous
    cJSON *previous = cJSON_GetObjectItemCaseSensitive(paginated_growth_rate_summary_listJSON, "previous");
    if (cJSON_IsNull(previous)) {
        previous = NULL;
    }
    if (previous) { 
    if(!cJSON_IsString(previous) && !cJSON_IsNull(previous))
    {
    goto end; //String
    }
    }

    // paginated_growth_rate_summary_list->results
    cJSON *results = cJSON_GetObjectItemCaseSensitive(paginated_growth_rate_summary_listJSON, "results");
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
        growth_rate_summary_t *resultsItem = growth_rate_summary_parseFromJSON(results_local_nonprimitive);

        list_addElement(resultsList, resultsItem);
    }
    }


    paginated_growth_rate_summary_list_local_var = paginated_growth_rate_summary_list_create_internal (
        count ? count->valuedouble : 0,
        next && !cJSON_IsNull(next) ? strdup(next->valuestring) : NULL,
        previous && !cJSON_IsNull(previous) ? strdup(previous->valuestring) : NULL,
        results ? resultsList : NULL
        );

    return paginated_growth_rate_summary_list_local_var;
end:
    if (resultsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, resultsList) {
            growth_rate_summary_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(resultsList);
        resultsList = NULL;
    }
    return NULL;

}
