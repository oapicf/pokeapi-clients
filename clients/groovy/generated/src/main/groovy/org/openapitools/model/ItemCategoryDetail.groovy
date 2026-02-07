package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ItemCategoryName;
import org.openapitools.model.ItemPocketSummary;
import org.openapitools.model.ItemSummary;

@Canonical
class ItemCategoryDetail {
    
    Integer id
    
    String name
    
    List<ItemSummary> items = new ArrayList<>()
    
    List<ItemCategoryName> names = new ArrayList<>()
    
    ItemPocketSummary pocket
}
