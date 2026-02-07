package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.BerrySummary;

@Canonical
class PaginatedBerrySummaryList {
    
    Integer count
    
    URI next
    
    URI previous
    
    List<BerrySummary> results = new ArrayList<>()
}
