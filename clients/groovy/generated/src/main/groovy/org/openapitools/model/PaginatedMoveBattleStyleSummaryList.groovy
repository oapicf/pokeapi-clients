package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.MoveBattleStyleSummary;

@Canonical
class PaginatedMoveBattleStyleSummaryList {
    
    Integer count
    
    URI next
    
    URI previous
    
    List<MoveBattleStyleSummary> results = new ArrayList<>()
}
