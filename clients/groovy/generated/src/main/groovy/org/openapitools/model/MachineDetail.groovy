package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ItemSummary;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.VersionGroupSummary;

@Canonical
class MachineDetail {
    
    Integer id
    
    ItemSummary item
    
    VersionGroupSummary versionGroup
    
    MoveSummary move
}
