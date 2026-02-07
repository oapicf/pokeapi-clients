package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.VersionGroupSummary;
import org.openapitools.model.VersionName;

@Canonical
class VersionDetail {
    
    Integer id
    
    String name
    
    List<VersionName> names = new ArrayList<>()
    
    VersionGroupSummary versionGroup
}
