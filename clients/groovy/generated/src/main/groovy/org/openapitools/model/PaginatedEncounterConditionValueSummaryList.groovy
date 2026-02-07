package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.EncounterConditionValueSummary;

@Canonical
class PaginatedEncounterConditionValueSummaryList {
    
    Integer count
    
    URI next
    
    URI previous
    
    List<EncounterConditionValueSummary> results = new ArrayList<>()
}
