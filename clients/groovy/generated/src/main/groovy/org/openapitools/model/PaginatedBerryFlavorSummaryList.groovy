package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.BerryFlavorSummary;

@Canonical
class PaginatedBerryFlavorSummaryList {
    
    Integer count
    
    URI next
    
    URI previous
    
    List<BerryFlavorSummary> results = new ArrayList<>()
}
