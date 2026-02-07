package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ContestEffectEffectText;
import org.openapitools.model.ContestEffectFlavorText;

@Canonical
class ContestEffectDetail {
    
    Integer id
    
    Integer appeal
    
    Integer jam
    
    List<ContestEffectEffectText> effectEntries = new ArrayList<>()
    
    List<ContestEffectFlavorText> flavorTextEntries = new ArrayList<>()
}
