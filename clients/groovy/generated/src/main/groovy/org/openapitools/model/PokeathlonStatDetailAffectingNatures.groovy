package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.PokeathlonStatDetailAffectingNaturesDecreaseInner;
import org.openapitools.model.PokeathlonStatDetailAffectingNaturesIncreaseInner;

@Canonical
class PokeathlonStatDetailAffectingNatures {
    
    List<PokeathlonStatDetailAffectingNaturesDecreaseInner> decrease = new ArrayList<>()
    
    List<PokeathlonStatDetailAffectingNaturesIncreaseInner> increase = new ArrayList<>()
}
