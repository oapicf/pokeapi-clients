package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AbilityChangeEffectText;
import org.openapitools.model.VersionGroupSummary;

@Canonical
class AbilityChange {
    
    VersionGroupSummary versionGroup
    
    List<AbilityChangeEffectText> effectEntries = new ArrayList<>()
}
