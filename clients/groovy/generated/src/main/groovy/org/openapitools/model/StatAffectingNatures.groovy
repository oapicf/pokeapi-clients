package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.NatureSummary;

@Canonical
class StatAffectingNatures {
    /* A list of natures and how they change the referenced stat. */
    List<NatureSummary> increase = new ArrayList<>()
    /* A list of nature sand how they change the referenced stat. */
    List<NatureSummary> decrease = new ArrayList<>()
}
