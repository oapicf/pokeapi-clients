package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LanguageSummary;
import org.openapitools.model.VersionGroupSummary;

@Canonical
class MoveFlavorText {
    
    String flavorText
    
    LanguageSummary language
    
    VersionGroupSummary versionGroup
}
