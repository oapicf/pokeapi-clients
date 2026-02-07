package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ItemCategorySummary;
import org.openapitools.model.ItemPocketName;

@Canonical
class ItemPocketDetail {
    
    Integer id
    
    String name
    
    List<ItemCategorySummary> categories = new ArrayList<>()
    
    List<ItemPocketName> names = new ArrayList<>()
}
