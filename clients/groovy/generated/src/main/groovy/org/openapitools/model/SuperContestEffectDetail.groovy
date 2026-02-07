package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.SuperContestEffectFlavorText;

@Canonical
class SuperContestEffectDetail {
    
    Integer id
    
    Integer appeal
    
    List<SuperContestEffectFlavorText> flavorTextEntries = new ArrayList<>()
    
    List<MoveSummary> moves = new ArrayList<>()
}
