package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.EncounterConditionSummary;
import org.openapitools.model.EncounterConditionValueName;

@Canonical
class EncounterConditionValueDetail {
    
    Integer id
    
    String name
    
    EncounterConditionSummary condition
    
    List<EncounterConditionValueName> names = new ArrayList<>()
}
