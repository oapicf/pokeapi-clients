package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.MoveDamageClassDescription;
import org.openapitools.model.MoveDamageClassName;
import org.openapitools.model.MoveSummary;

@Canonical
class MoveDamageClassDetail {
    
    Integer id
    
    String name
    
    List<MoveDamageClassDescription> descriptions = new ArrayList<>()
    
    List<MoveSummary> moves = new ArrayList<>()
    
    List<MoveDamageClassName> names = new ArrayList<>()
}
