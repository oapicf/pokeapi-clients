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
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* A list of possible values for this encounter condition. */
    List<EncounterConditionValueSummary> values = new ArrayList<>()
    /* The name of this resource listed in different languages. */
    List<EncounterConditionName> names = new ArrayList<>()
}
