#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "machine_summary.h"



static machine_summary_t *machine_summary_create_internal(
    char *url
    ) {
    machine_summary_t *machine_summary_local_var = malloc(sizeof(machine_summary_t));
    if (!machine_summary_local_var) {
        return NULL;
    }
    machine_summary_local_var->url = url;

    machine_summary_local_var->_library_owned = 1;
    return machine_summary_local_var;
}

__attribute__((deprecated)) machine_summary_t *machine_summary_create(
    char *url
    ) {
    return machine_summary_create_internal (
        url
        );
}

void machine_summary_free(machine_summary_t *machine_summary) {
    if(NULL == machine_summary){
        return ;
    }
    if(machine_summary->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "machine_summary_free");
        return ;
    }
    listEntry_t *listEntry;
    if (machine_summary->url) {
        free(machine_summary->url);
        machine_summary->url = NULL;
    }
    free(machine_summary);
}

cJSON *machine_summary_convertToJSON(machine_summary_t *machine_summary) {
    cJSON *item = cJSON_CreateObject();

    // machine_summary->url
    if (!machine_summary->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", machine_summary->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

machine_summary_t *machine_summary_parseFromJSON(cJSON *machine_summaryJSON){

    machine_summary_t *machine_summary_local_var = NULL;

    // machine_summary->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(machine_summaryJSON, "url");
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


    machine_summary_local_var = machine_summary_create_internal (
        strdup(url->valuestring)
        );

    return machine_summary_local_var;
end:
    return NULL;

}
