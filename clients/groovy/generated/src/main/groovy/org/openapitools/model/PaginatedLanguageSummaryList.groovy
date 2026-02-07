package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.LanguageSummary;

@Canonical
class PaginatedLanguageSummaryList {
    
    Integer count
    
    URI next
    
    URI previous
    
    List<LanguageSummary> results = new ArrayList<>()
}
