package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.EvolutionChainDetailChain;
import org.openapitools.model.ItemSummary;

@Canonical
class EvolutionChainDetail {
    
    Integer id
    
    ItemSummary babyTriggerItem
    
    EvolutionChainDetailChain chain
}
