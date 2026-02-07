package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.PokeathlonStatDetailAffectingNatures;
import org.openapitools.model.PokeathlonStatName;

@Canonical
class PokeathlonStatDetail {
    
    Integer id
    
    String name
    
    PokeathlonStatDetailAffectingNatures affectingNatures
    
    List<PokeathlonStatName> names = new ArrayList<>()
}
