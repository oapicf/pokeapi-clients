#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "berry_flavor_detail_berries_inner.h"



static berry_flavor_detail_berries_inner_t *berry_flavor_detail_berries_inner_create_internal(
    int potency,
    berry_flavor_detail_berries_inner_berry_t *berry
    ) {
    berry_flavor_detail_berries_inner_t *berry_flavor_detail_berries_inner_local_var = malloc(sizeof(berry_flavor_detail_berries_inner_t));
    if (!berry_flavor_detail_berries_inner_local_var) {
        return NULL;
    }
    berry_flavor_detail_berries_inner_local_var->potency = potency;
    berry_flavor_detail_berries_inner_local_var->berry = berry;

    berry_flavor_detail_berries_inner_local_var->_library_owned = 1;
    return berry_flavor_detail_berries_inner_local_var;
}

__attribute__((deprecated)) berry_flavor_detail_berries_inner_t *berry_flavor_detail_berries_inner_create(
    int potency,
    berry_flavor_detail_berries_inner_berry_t *berry
    ) {
    return berry_flavor_detail_berries_inner_create_internal (
        potency,
        berry
        );
}

void berry_flavor_detail_berries_inner_free(berry_flavor_detail_berries_inner_t *berry_flavor_detail_berries_inner) {
    if(NULL == berry_flavor_detail_berries_inner){
        return ;
    }
    if(berry_flavor_detail_berries_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "berry_flavor_detail_berries_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (berry_flavor_detail_berries_inner->berry) {
        berry_flavor_detail_berries_inner_berry_free(berry_flavor_detail_berries_inner->berry);
        berry_flavor_detail_berries_inner->berry = NULL;
    }
    free(berry_flavor_detail_berries_inner);
}

cJSON *berry_flavor_detail_berries_inner_convertToJSON(berry_flavor_detail_berries_inner_t *berry_flavor_detail_berries_inner) {
    cJSON *item = cJSON_CreateObject();

    // berry_flavor_detail_berries_inner->potency
    if (!berry_flavor_detail_berries_inner->potency) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "potency", berry_flavor_detail_berries_inner->potency) == NULL) {
    goto fail; //Numeric
    }


    // berry_flavor_detail_berries_inner->berry
    if (!berry_flavor_detail_berries_inner->berry) {
        goto fail;
    }
    cJSON *berry_local_JSON = berry_flavor_detail_berries_inner_berry_convertToJSON(berry_flavor_detail_berries_inner->berry);
    if(berry_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "berry", berry_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

berry_flavor_detail_berries_inner_t *berry_flavor_detail_berries_inner_parseFromJSON(cJSON *berry_flavor_detail_berries_innerJSON){

    berry_flavor_detail_berries_inner_t *berry_flavor_detail_berries_inner_local_var = NULL;

    // define the local variable for berry_flavor_detail_berries_inner->berry
    berry_flavor_detail_berries_inner_berry_t *berry_local_nonprim = NULL;

    // berry_flavor_detail_berries_inner->potency
    cJSON *potency = cJSON_GetObjectItemCaseSensitive(berry_flavor_detail_berries_innerJSON, "potency");
    if (cJSON_IsNull(potency)) {
        potency = NULL;
    }
    if (!potency) {
        goto end;
    }

    
    if(!cJSON_IsNumber(potency))
    {
    goto end; //Numeric
    }

    // berry_flavor_detail_berries_inner->berry
    cJSON *berry = cJSON_GetObjectItemCaseSensitive(berry_flavor_detail_berries_innerJSON, "berry");
    if (cJSON_IsNull(berry)) {
        berry = NULL;
    }
    if (!berry) {
        goto end;
    }

    
    berry_local_nonprim = berry_flavor_detail_berries_inner_berry_parseFromJSON(berry); //nonprimitive


    berry_flavor_detail_berries_inner_local_var = berry_flavor_detail_berries_inner_create_internal (
        potency->valuedouble,
        berry_local_nonprim
        );

    return berry_flavor_detail_berries_inner_local_var;
end:
    if (berry_local_nonprim) {
        berry_flavor_detail_berries_inner_berry_free(berry_local_nonprim);
        berry_local_nonprim = NULL;
    }
    return NULL;

}
