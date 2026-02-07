#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "berry_detail.h"



static berry_detail_t *berry_detail_create_internal(
    int id,
    char *name,
    int growth_time,
    int max_harvest,
    int natural_gift_power,
    int size,
    int smoothness,
    int soil_dryness,
    berry_firmness_summary_t *firmness,
    list_t *flavors,
    item_summary_t *item,
    type_summary_t *natural_gift_type
    ) {
    berry_detail_t *berry_detail_local_var = malloc(sizeof(berry_detail_t));
    if (!berry_detail_local_var) {
        return NULL;
    }
    berry_detail_local_var->id = id;
    berry_detail_local_var->name = name;
    berry_detail_local_var->growth_time = growth_time;
    berry_detail_local_var->max_harvest = max_harvest;
    berry_detail_local_var->natural_gift_power = natural_gift_power;
    berry_detail_local_var->size = size;
    berry_detail_local_var->smoothness = smoothness;
    berry_detail_local_var->soil_dryness = soil_dryness;
    berry_detail_local_var->firmness = firmness;
    berry_detail_local_var->flavors = flavors;
    berry_detail_local_var->item = item;
    berry_detail_local_var->natural_gift_type = natural_gift_type;

    berry_detail_local_var->_library_owned = 1;
    return berry_detail_local_var;
}

__attribute__((deprecated)) berry_detail_t *berry_detail_create(
    int id,
    char *name,
    int growth_time,
    int max_harvest,
    int natural_gift_power,
    int size,
    int smoothness,
    int soil_dryness,
    berry_firmness_summary_t *firmness,
    list_t *flavors,
    item_summary_t *item,
    type_summary_t *natural_gift_type
    ) {
    return berry_detail_create_internal (
        id,
        name,
        growth_time,
        max_harvest,
        natural_gift_power,
        size,
        smoothness,
        soil_dryness,
        firmness,
        flavors,
        item,
        natural_gift_type
        );
}

void berry_detail_free(berry_detail_t *berry_detail) {
    if(NULL == berry_detail){
        return ;
    }
    if(berry_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "berry_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (berry_detail->name) {
        free(berry_detail->name);
        berry_detail->name = NULL;
    }
    if (berry_detail->firmness) {
        berry_firmness_summary_free(berry_detail->firmness);
        berry_detail->firmness = NULL;
    }
    if (berry_detail->flavors) {
        list_ForEach(listEntry, berry_detail->flavors) {
            berry_detail_flavors_inner_free(listEntry->data);
        }
        list_freeList(berry_detail->flavors);
        berry_detail->flavors = NULL;
    }
    if (berry_detail->item) {
        item_summary_free(berry_detail->item);
        berry_detail->item = NULL;
    }
    if (berry_detail->natural_gift_type) {
        type_summary_free(berry_detail->natural_gift_type);
        berry_detail->natural_gift_type = NULL;
    }
    free(berry_detail);
}

cJSON *berry_detail_convertToJSON(berry_detail_t *berry_detail) {
    cJSON *item = cJSON_CreateObject();

    // berry_detail->id
    if (!berry_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", berry_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // berry_detail->name
    if (!berry_detail->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", berry_detail->name) == NULL) {
    goto fail; //String
    }


    // berry_detail->growth_time
    if (!berry_detail->growth_time) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "growth_time", berry_detail->growth_time) == NULL) {
    goto fail; //Numeric
    }


    // berry_detail->max_harvest
    if (!berry_detail->max_harvest) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "max_harvest", berry_detail->max_harvest) == NULL) {
    goto fail; //Numeric
    }


    // berry_detail->natural_gift_power
    if (!berry_detail->natural_gift_power) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "natural_gift_power", berry_detail->natural_gift_power) == NULL) {
    goto fail; //Numeric
    }


    // berry_detail->size
    if (!berry_detail->size) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "size", berry_detail->size) == NULL) {
    goto fail; //Numeric
    }


    // berry_detail->smoothness
    if (!berry_detail->smoothness) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "smoothness", berry_detail->smoothness) == NULL) {
    goto fail; //Numeric
    }


    // berry_detail->soil_dryness
    if (!berry_detail->soil_dryness) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "soil_dryness", berry_detail->soil_dryness) == NULL) {
    goto fail; //Numeric
    }


    // berry_detail->firmness
    if (!berry_detail->firmness) {
        goto fail;
    }
    cJSON *firmness_local_JSON = berry_firmness_summary_convertToJSON(berry_detail->firmness);
    if(firmness_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "firmness", firmness_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // berry_detail->flavors
    if (!berry_detail->flavors) {
        goto fail;
    }
    cJSON *flavors = cJSON_AddArrayToObject(item, "flavors");
    if(flavors == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *flavorsListEntry;
    if (berry_detail->flavors) {
    list_ForEach(flavorsListEntry, berry_detail->flavors) {
    cJSON *itemLocal = berry_detail_flavors_inner_convertToJSON(flavorsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(flavors, itemLocal);
    }
    }


    // berry_detail->item
    if (!berry_detail->item) {
        goto fail;
    }
    cJSON *item_local_JSON = item_summary_convertToJSON(berry_detail->item);
    if(item_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "item", item_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // berry_detail->natural_gift_type
    if (!berry_detail->natural_gift_type) {
        goto fail;
    }
    cJSON *natural_gift_type_local_JSON = type_summary_convertToJSON(berry_detail->natural_gift_type);
    if(natural_gift_type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "natural_gift_type", natural_gift_type_local_JSON);
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

berry_detail_t *berry_detail_parseFromJSON(cJSON *berry_detailJSON){

    berry_detail_t *berry_detail_local_var = NULL;

    // define the local variable for berry_detail->firmness
    berry_firmness_summary_t *firmness_local_nonprim = NULL;

    // define the local list for berry_detail->flavors
    list_t *flavorsList = NULL;

    // define the local variable for berry_detail->item
    item_summary_t *item_local_nonprim = NULL;

    // define the local variable for berry_detail->natural_gift_type
    type_summary_t *natural_gift_type_local_nonprim = NULL;

    // berry_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(berry_detailJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // berry_detail->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(berry_detailJSON, "name");
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

    // berry_detail->growth_time
    cJSON *growth_time = cJSON_GetObjectItemCaseSensitive(berry_detailJSON, "growth_time");
    if (cJSON_IsNull(growth_time)) {
        growth_time = NULL;
    }
    if (!growth_time) {
        goto end;
    }

    
    if(!cJSON_IsNumber(growth_time))
    {
    goto end; //Numeric
    }

    // berry_detail->max_harvest
    cJSON *max_harvest = cJSON_GetObjectItemCaseSensitive(berry_detailJSON, "max_harvest");
    if (cJSON_IsNull(max_harvest)) {
        max_harvest = NULL;
    }
    if (!max_harvest) {
        goto end;
    }

    
    if(!cJSON_IsNumber(max_harvest))
    {
    goto end; //Numeric
    }

    // berry_detail->natural_gift_power
    cJSON *natural_gift_power = cJSON_GetObjectItemCaseSensitive(berry_detailJSON, "natural_gift_power");
    if (cJSON_IsNull(natural_gift_power)) {
        natural_gift_power = NULL;
    }
    if (!natural_gift_power) {
        goto end;
    }

    
    if(!cJSON_IsNumber(natural_gift_power))
    {
    goto end; //Numeric
    }

    // berry_detail->size
    cJSON *size = cJSON_GetObjectItemCaseSensitive(berry_detailJSON, "size");
    if (cJSON_IsNull(size)) {
        size = NULL;
    }
    if (!size) {
        goto end;
    }

    
    if(!cJSON_IsNumber(size))
    {
    goto end; //Numeric
    }

    // berry_detail->smoothness
    cJSON *smoothness = cJSON_GetObjectItemCaseSensitive(berry_detailJSON, "smoothness");
    if (cJSON_IsNull(smoothness)) {
        smoothness = NULL;
    }
    if (!smoothness) {
        goto end;
    }

    
    if(!cJSON_IsNumber(smoothness))
    {
    goto end; //Numeric
    }

    // berry_detail->soil_dryness
    cJSON *soil_dryness = cJSON_GetObjectItemCaseSensitive(berry_detailJSON, "soil_dryness");
    if (cJSON_IsNull(soil_dryness)) {
        soil_dryness = NULL;
    }
    if (!soil_dryness) {
        goto end;
    }

    
    if(!cJSON_IsNumber(soil_dryness))
    {
    goto end; //Numeric
    }

    // berry_detail->firmness
    cJSON *firmness = cJSON_GetObjectItemCaseSensitive(berry_detailJSON, "firmness");
    if (cJSON_IsNull(firmness)) {
        firmness = NULL;
    }
    if (!firmness) {
        goto end;
    }

    
    firmness_local_nonprim = berry_firmness_summary_parseFromJSON(firmness); //nonprimitive

    // berry_detail->flavors
    cJSON *flavors = cJSON_GetObjectItemCaseSensitive(berry_detailJSON, "flavors");
    if (cJSON_IsNull(flavors)) {
        flavors = NULL;
    }
    if (!flavors) {
        goto end;
    }

    
    cJSON *flavors_local_nonprimitive = NULL;
    if(!cJSON_IsArray(flavors)){
        goto end; //nonprimitive container
    }

    flavorsList = list_createList();

    cJSON_ArrayForEach(flavors_local_nonprimitive,flavors )
    {
        if(!cJSON_IsObject(flavors_local_nonprimitive)){
            goto end;
        }
        berry_detail_flavors_inner_t *flavorsItem = berry_detail_flavors_inner_parseFromJSON(flavors_local_nonprimitive);

        list_addElement(flavorsList, flavorsItem);
    }

    // berry_detail->item
    cJSON *item = cJSON_GetObjectItemCaseSensitive(berry_detailJSON, "item");
    if (cJSON_IsNull(item)) {
        item = NULL;
    }
    if (!item) {
        goto end;
    }

    
    item_local_nonprim = item_summary_parseFromJSON(item); //nonprimitive

    // berry_detail->natural_gift_type
    cJSON *natural_gift_type = cJSON_GetObjectItemCaseSensitive(berry_detailJSON, "natural_gift_type");
    if (cJSON_IsNull(natural_gift_type)) {
        natural_gift_type = NULL;
    }
    if (!natural_gift_type) {
        goto end;
    }

    
    natural_gift_type_local_nonprim = type_summary_parseFromJSON(natural_gift_type); //nonprimitive


    berry_detail_local_var = berry_detail_create_internal (
        id->valuedouble,
        strdup(name->valuestring),
        growth_time->valuedouble,
        max_harvest->valuedouble,
        natural_gift_power->valuedouble,
        size->valuedouble,
        smoothness->valuedouble,
        soil_dryness->valuedouble,
        firmness_local_nonprim,
        flavorsList,
        item_local_nonprim,
        natural_gift_type_local_nonprim
        );

    return berry_detail_local_var;
end:
    if (firmness_local_nonprim) {
        berry_firmness_summary_free(firmness_local_nonprim);
        firmness_local_nonprim = NULL;
    }
    if (flavorsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, flavorsList) {
            berry_detail_flavors_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(flavorsList);
        flavorsList = NULL;
    }
    if (item_local_nonprim) {
        item_summary_free(item_local_nonprim);
        item_local_nonprim = NULL;
    }
    if (natural_gift_type_local_nonprim) {
        type_summary_free(natural_gift_type_local_nonprim);
        natural_gift_type_local_nonprim = NULL;
    }
    return NULL;

}
