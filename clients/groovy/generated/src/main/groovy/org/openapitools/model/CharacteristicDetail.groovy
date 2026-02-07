package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CharacteristicDescription;
import org.openapitools.model.StatSummary;

@Canonical
class CharacteristicDetail {
    
    Integer id
    
    Integer geneModulo
    
    List<Integer> possibleValues = new ArrayList<>()
    
    StatSummary highestStat
    
    List<CharacteristicDescription> descriptions = new ArrayList<>()
}
