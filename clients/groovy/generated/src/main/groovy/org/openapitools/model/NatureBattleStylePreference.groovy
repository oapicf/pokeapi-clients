package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MoveBattleStyleSummary;

@Canonical
class NatureBattleStylePreference {
    
    Integer lowHpPreference
    
    Integer highHpPreference
    
    MoveBattleStyleSummary moveBattleStyle
}
