package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.StatDetailAffectingMovesIncreaseInner;

@Canonical
class StatDetailAffectingMoves {
    
    List<StatDetailAffectingMovesIncreaseInner> increase = new ArrayList<>()
    
    List<StatDetailAffectingMovesIncreaseInner> decrease = new ArrayList<>()
}
