package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.BerryDetailFlavorsInner;
import org.openapitools.model.BerryFirmnessSummary;
import org.openapitools.model.ItemSummary;
import org.openapitools.model.TypeSummary;

@Canonical
class BerryDetail {
    
    Integer id
    
    String name
    
    Integer growthTime
    
    Integer maxHarvest
    
    Integer naturalGiftPower
    
    Integer size
    
    Integer smoothness
    
    Integer soilDryness
    
    BerryFirmnessSummary firmness
    
    List<BerryDetailFlavorsInner> flavors = new ArrayList<>()
    
    ItemSummary item
    
    TypeSummary naturalGiftType
}
