package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ItemCategorySummary;

@Canonical
class PaginatedItemCategorySummaryList {
    
    Integer count
    
    URI next
    
    URI previous
    
    List<ItemCategorySummary> results = new ArrayList<>()
}
