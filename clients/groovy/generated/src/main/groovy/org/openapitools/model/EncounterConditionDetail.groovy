package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.EncounterConditionName;
import org.openapitools.model.EncounterConditionValueSummary;

@Canonical
class EncounterConditionDetail {
    
    Integer id
    
    String name
    
    List<EncounterConditionValueSummary> values = new ArrayList<>()
    
    List<EncounterConditionName> names = new ArrayList<>()
}
