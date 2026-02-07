package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.BerryFlavorDetailBerriesInner;
import org.openapitools.model.BerryFlavorName;
import org.openapitools.model.ContestTypeSummary;

@Canonical
class BerryFlavorDetail {
    
    Integer id
    
    String name
    
    List<BerryFlavorDetailBerriesInner> berries = new ArrayList<>()
    
    ContestTypeSummary contestType
    
    List<BerryFlavorName> names = new ArrayList<>()
}
