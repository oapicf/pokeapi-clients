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
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* The region this location can be found in. */
    RegionSummary region
    /* The name of this resource listed in different languages. */
    List<LocationName> names = new ArrayList<>()
    /* A list of game indices relevent to this location by generation. */
    List<LocationGameIndex> gameIndices = new ArrayList<>()
    /* Areas that can be found within this location. */
    List<LocationAreaSummary> areas = new ArrayList<>()
}
