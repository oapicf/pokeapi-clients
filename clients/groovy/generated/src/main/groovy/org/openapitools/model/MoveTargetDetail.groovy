package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.MoveTargetDescription;
import org.openapitools.model.MoveTargetName;

@Canonical
class MoveTargetDetail {
    
    Integer id
    
    String name
    
    List<MoveTargetDescription> descriptions = new ArrayList<>()
    
    List<MoveSummary> moves = new ArrayList<>()
    
    List<MoveTargetName> names = new ArrayList<>()
}
