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
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* The condition this encounter condition value pertains to. */
    EncounterConditionSummary condition
    /* The name of this resource listed in different languages. */
    List<EncounterConditionValueName> names = new ArrayList<>()
}
