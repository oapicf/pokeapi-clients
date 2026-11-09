package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.TypeSummary;

@Canonical
class PaginatedTypeSummaryList {
    /* The total number of resources available from this API. */
    Integer count
    /* The URL for the next page in the list, or null if there is no next page. */
    URI next
    /* The URL for the previous page in the list, or null if there is no previous page. */
    URI previous
    /* A list of API resources on this page. */
    List<TypeSummary> results = new ArrayList<>()
}
