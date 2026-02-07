#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "berry_detail_flavors_inner.h"



static berry_detail_flavors_inner_t *berry_detail_flavors_inner_create_internal(
    int potency,
    berry_detail_flavors_inner_flavor_t *flavor
    ) {
    berry_detail_flavors_inner_t *berry_detail_flavors_inner_local_var = malloc(sizeof(berry_detail_flavors_inner_t));
    if (!berry_detail_flavors_inner_local_var) {
        return NULL;
    }
    berry_detail_flavors_inner_local_var->potency = potency;
    berry_detail_flavors_inner_local_var->flavor = flavor;

    berry_detail_flavors_inner_local_var->_library_owned = 1;
    return berry_detail_flavors_inner_local_var;
}

__attribute__((deprecated)) berry_detail_flavors_inner_t *berry_detail_flavors_inner_create(
    int potency,
    berry_detail_flavors_inner_flavor_t *flavor
    ) {
    return berry_detail_flavors_inner_create_internal (
        potency,
        flavor
        );
}

void berry_detail_flavors_inner_free(berry_detail_flavors_inner_t *berry_detail_flavors_inner) {
    if(NULL == berry_detail_flavors_inner){
        return ;
    }
    if(berry_detail_flavors_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "berry_detail_flavors_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (berry_detail_flavors_inner->flavor) {
        berry_detail_flavors_inner_flavor_free(berry_detail_flavors_inner->flavor);
        berry_detail_flavors_inner->flavor = NULL;
    }
    free(berry_detail_flavors_inner);
}

cJSON *berry_detail_flavors_inner_convertToJSON(berry_detail_flavors_inner_t *berry_detail_flavors_inner) {
    cJSON *item = cJSON_CreateObject();

    // berry_detail_flavors_inner->potency
    if (!berry_detail_flavors_inner->potency) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "potency", berry_detail_flavors_inner->potency) == NULL) {
    goto fail; //Numeric
    }


    // berry_detail_flavors_inner->flavor
    if (!berry_detail_flavors_inner->flavor) {
        goto fail;
    }
    cJSON *flavor_local_JSON = berry_detail_flavors_inner_flavor_convertToJSON(berry_detail_flavors_inner->flavor);
    if(flavor_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "flavor", flavor_local_JSON);
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

berry_detail_flavors_inner_t *berry_detail_flavors_inner_parseFromJSON(cJSON *berry_detail_flavors_innerJSON){

    berry_detail_flavors_inner_t *berry_detail_flavors_inner_local_var = NULL;

    // define the local variable for berry_detail_flavors_inner->flavor
    berry_detail_flavors_inner_flavor_t *flavor_local_nonprim = NULL;

    // berry_detail_flavors_inner->potency
    cJSON *potency = cJSON_GetObjectItemCaseSensitive(berry_detail_flavors_innerJSON, "potency");
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

    // berry_detail_flavors_inner->flavor
    cJSON *flavor = cJSON_GetObjectItemCaseSensitive(berry_detail_flavors_innerJSON, "flavor");
    if (cJSON_IsNull(flavor)) {
        flavor = NULL;
    }
    if (!flavor) {
        goto end;
    }

    
    flavor_local_nonprim = berry_detail_flavors_inner_flavor_parseFromJSON(flavor); //nonprimitive


    berry_detail_flavors_inner_local_var = berry_detail_flavors_inner_create_internal (
        potency->valuedouble,
        flavor_local_nonprim
        );

    return berry_detail_flavors_inner_local_var;
end:
    if (flavor_local_nonprim) {
        berry_detail_flavors_inner_flavor_free(flavor_local_nonprim);
        flavor_local_nonprim = NULL;
    }
    return NULL;

}
