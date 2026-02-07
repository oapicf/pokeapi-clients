package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.LocationAreaSummary;
import org.openapitools.model.LocationGameIndex;
import org.openapitools.model.LocationName;
import org.openapitools.model.RegionSummary;

@Canonical
class LocationDetail {
    
    Integer id
    
    String name
    
    RegionSummary region
    
    List<LocationName> names = new ArrayList<>()
    
    List<LocationGameIndex> gameIndices = new ArrayList<>()
    
    List<LocationAreaSummary> areas = new ArrayList<>()
}
