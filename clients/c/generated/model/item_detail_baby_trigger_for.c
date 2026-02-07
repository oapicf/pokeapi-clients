#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "item_detail_baby_trigger_for.h"



static item_detail_baby_trigger_for_t *item_detail_baby_trigger_for_create_internal(
    char *url
    ) {
    item_detail_baby_trigger_for_t *item_detail_baby_trigger_for_local_var = malloc(sizeof(item_detail_baby_trigger_for_t));
    if (!item_detail_baby_trigger_for_local_var) {
        return NULL;
    }
    item_detail_baby_trigger_for_local_var->url = url;

    item_detail_baby_trigger_for_local_var->_library_owned = 1;
    return item_detail_baby_trigger_for_local_var;
}

__attribute__((deprecated)) item_detail_baby_trigger_for_t *item_detail_baby_trigger_for_create(
    char *url
    ) {
    return item_detail_baby_trigger_for_create_internal (
        url
        );
}

void item_detail_baby_trigger_for_free(item_detail_baby_trigger_for_t *item_detail_baby_trigger_for) {
    if(NULL == item_detail_baby_trigger_for){
        return ;
    }
    if(item_detail_baby_trigger_for->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "item_detail_baby_trigger_for_free");
        return ;
    }
    listEntry_t *listEntry;
    if (item_detail_baby_trigger_for->url) {
        free(item_detail_baby_trigger_for->url);
        item_detail_baby_trigger_for->url = NULL;
    }
    free(item_detail_baby_trigger_for);
}

cJSON *item_detail_baby_trigger_for_convertToJSON(item_detail_baby_trigger_for_t *item_detail_baby_trigger_for) {
    cJSON *item = cJSON_CreateObject();

    // item_detail_baby_trigger_for->url
    if (!item_detail_baby_trigger_for->url) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "url", item_detail_baby_trigger_for->url) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

item_detail_baby_trigger_for_t *item_detail_baby_trigger_for_parseFromJSON(cJSON *item_detail_baby_trigger_forJSON){

    item_detail_baby_trigger_for_t *item_detail_baby_trigger_for_local_var = NULL;

    // item_detail_baby_trigger_for->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(item_detail_baby_trigger_forJSON, "url");
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


    item_detail_baby_trigger_for_local_var = item_detail_baby_trigger_for_create_internal (
        strdup(url->valuestring)
        );

    return item_detail_baby_trigger_for_local_var;
end:
    return NULL;

}
