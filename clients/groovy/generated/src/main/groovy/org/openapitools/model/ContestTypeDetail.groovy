package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.BerryFlavorSummary;
import org.openapitools.model.ContestTypeName;

@Canonical
class ContestTypeDetail {
    
    Integer id
    
    String name
    
    BerryFlavorSummary berryFlavor
    
    List<ContestTypeName> names = new ArrayList<>()
}
