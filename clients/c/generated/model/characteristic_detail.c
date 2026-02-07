#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "characteristic_detail.h"



static characteristic_detail_t *characteristic_detail_create_internal(
    int id,
    int gene_modulo,
    list_t *possible_values,
    stat_summary_t *highest_stat,
    list_t *descriptions
    ) {
    characteristic_detail_t *characteristic_detail_local_var = malloc(sizeof(characteristic_detail_t));
    if (!characteristic_detail_local_var) {
        return NULL;
    }
    characteristic_detail_local_var->id = id;
    characteristic_detail_local_var->gene_modulo = gene_modulo;
    characteristic_detail_local_var->possible_values = possible_values;
    characteristic_detail_local_var->highest_stat = highest_stat;
    characteristic_detail_local_var->descriptions = descriptions;

    characteristic_detail_local_var->_library_owned = 1;
    return characteristic_detail_local_var;
}

__attribute__((deprecated)) characteristic_detail_t *characteristic_detail_create(
    int id,
    int gene_modulo,
    list_t *possible_values,
    stat_summary_t *highest_stat,
    list_t *descriptions
    ) {
    return characteristic_detail_create_internal (
        id,
        gene_modulo,
        possible_values,
        highest_stat,
        descriptions
        );
}

void characteristic_detail_free(characteristic_detail_t *characteristic_detail) {
    if(NULL == characteristic_detail){
        return ;
    }
    if(characteristic_detail->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "characteristic_detail_free");
        return ;
    }
    listEntry_t *listEntry;
    if (characteristic_detail->possible_values) {
        list_ForEach(listEntry, characteristic_detail->possible_values) {
            free(listEntry->data);
        }
        list_freeList(characteristic_detail->possible_values);
        characteristic_detail->possible_values = NULL;
    }
    if (characteristic_detail->highest_stat) {
        stat_summary_free(characteristic_detail->highest_stat);
        characteristic_detail->highest_stat = NULL;
    }
    if (characteristic_detail->descriptions) {
        list_ForEach(listEntry, characteristic_detail->descriptions) {
            characteristic_description_free(listEntry->data);
        }
        list_freeList(characteristic_detail->descriptions);
        characteristic_detail->descriptions = NULL;
    }
    free(characteristic_detail);
}

cJSON *characteristic_detail_convertToJSON(characteristic_detail_t *characteristic_detail) {
    cJSON *item = cJSON_CreateObject();

    // characteristic_detail->id
    if (!characteristic_detail->id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "id", characteristic_detail->id) == NULL) {
    goto fail; //Numeric
    }


    // characteristic_detail->gene_modulo
    if (!characteristic_detail->gene_modulo) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "gene_modulo", characteristic_detail->gene_modulo) == NULL) {
    goto fail; //Numeric
    }


    // characteristic_detail->possible_values
    if (!characteristic_detail->possible_values) {
        goto fail;
    }
    cJSON *possible_values = cJSON_AddArrayToObject(item, "possible_values");
    if(possible_values == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *possible_valuesListEntry;
    list_ForEach(possible_valuesListEntry, characteristic_detail->possible_values) {
    if(cJSON_AddNumberToObject(possible_values, "", *(double *)possible_valuesListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // characteristic_detail->highest_stat
    if (!characteristic_detail->highest_stat) {
        goto fail;
    }
    cJSON *highest_stat_local_JSON = stat_summary_convertToJSON(characteristic_detail->highest_stat);
    if(highest_stat_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "highest_stat", highest_stat_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // characteristic_detail->descriptions
    if (!characteristic_detail->descriptions) {
        goto fail;
    }
    cJSON *descriptions = cJSON_AddArrayToObject(item, "descriptions");
    if(descriptions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *descriptionsListEntry;
    if (characteristic_detail->descriptions) {
    list_ForEach(descriptionsListEntry, characteristic_detail->descriptions) {
    cJSON *itemLocal = characteristic_description_convertToJSON(descriptionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(descriptions, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

characteristic_detail_t *characteristic_detail_parseFromJSON(cJSON *characteristic_detailJSON){

    characteristic_detail_t *characteristic_detail_local_var = NULL;

    // define the local list for characteristic_detail->possible_values
    list_t *possible_valuesList = NULL;

    // define the local variable for characteristic_detail->highest_stat
    stat_summary_t *highest_stat_local_nonprim = NULL;

    // define the local list for characteristic_detail->descriptions
    list_t *descriptionsList = NULL;

    // characteristic_detail->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(characteristic_detailJSON, "id");
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

    // characteristic_detail->gene_modulo
    cJSON *gene_modulo = cJSON_GetObjectItemCaseSensitive(characteristic_detailJSON, "gene_modulo");
    if (cJSON_IsNull(gene_modulo)) {
        gene_modulo = NULL;
    }
    if (!gene_modulo) {
        goto end;
    }

    
    if(!cJSON_IsNumber(gene_modulo))
    {
    goto end; //Numeric
    }

    // characteristic_detail->possible_values
    cJSON *possible_values = cJSON_GetObjectItemCaseSensitive(characteristic_detailJSON, "possible_values");
    if (cJSON_IsNull(possible_values)) {
        possible_values = NULL;
    }
    if (!possible_values) {
        goto end;
    }

    
    cJSON *possible_values_local = NULL;
    if(!cJSON_IsArray(possible_values)) {
        goto end;//primitive container
    }
    possible_valuesList = list_createList();

    cJSON_ArrayForEach(possible_values_local, possible_values)
    {
        if(!cJSON_IsNumber(possible_values_local))
        {
            goto end;
        }
        double *possible_values_local_value = calloc(1, sizeof(double));
        if(!possible_values_local_value)
        {
            goto end;
        }
        *possible_values_local_value = possible_values_local->valuedouble;
        list_addElement(possible_valuesList , possible_values_local_value);
    }

    // characteristic_detail->highest_stat
    cJSON *highest_stat = cJSON_GetObjectItemCaseSensitive(characteristic_detailJSON, "highest_stat");
    if (cJSON_IsNull(highest_stat)) {
        highest_stat = NULL;
    }
    if (!highest_stat) {
        goto end;
    }

    
    highest_stat_local_nonprim = stat_summary_parseFromJSON(highest_stat); //nonprimitive

    // characteristic_detail->descriptions
    cJSON *descriptions = cJSON_GetObjectItemCaseSensitive(characteristic_detailJSON, "descriptions");
    if (cJSON_IsNull(descriptions)) {
        descriptions = NULL;
    }
    if (!descriptions) {
        goto end;
    }

    
    cJSON *descriptions_local_nonprimitive = NULL;
    if(!cJSON_IsArray(descriptions)){
        goto end; //nonprimitive container
    }

    descriptionsList = list_createList();

    cJSON_ArrayForEach(descriptions_local_nonprimitive,descriptions )
    {
        if(!cJSON_IsObject(descriptions_local_nonprimitive)){
            goto end;
        }
        characteristic_description_t *descriptionsItem = characteristic_description_parseFromJSON(descriptions_local_nonprimitive);

        list_addElement(descriptionsList, descriptionsItem);
    }


    characteristic_detail_local_var = characteristic_detail_create_internal (
        id->valuedouble,
        gene_modulo->valuedouble,
        possible_valuesList,
        highest_stat_local_nonprim,
        descriptionsList
        );

    return characteristic_detail_local_var;
end:
    if (possible_valuesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, possible_valuesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(possible_valuesList);
        possible_valuesList = NULL;
    }
    if (highest_stat_local_nonprim) {
        stat_summary_free(highest_stat_local_nonprim);
        highest_stat_local_nonprim = NULL;
    }
    if (descriptionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, descriptionsList) {
            characteristic_description_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(descriptionsList);
        descriptionsList = NULL;
    }
    return NULL;

}
