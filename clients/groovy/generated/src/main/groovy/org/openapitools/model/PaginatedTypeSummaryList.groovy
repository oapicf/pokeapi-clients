package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.TypeSummary;

@Canonical
class PaginatedTypeSummaryList {
    
    Integer count
    
    URI next
    
    URI previous
    
    List<TypeSummary> results = new ArrayList<>()
}
