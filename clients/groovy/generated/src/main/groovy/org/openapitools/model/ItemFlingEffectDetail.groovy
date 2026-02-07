package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ItemFlingEffectEffectText;
import org.openapitools.model.ItemSummary;

@Canonical
class ItemFlingEffectDetail {
    
    Integer id
    
    String name
    
    List<ItemFlingEffectEffectText> effectEntries = new ArrayList<>()
    
    List<ItemSummary> items = new ArrayList<>()
}
