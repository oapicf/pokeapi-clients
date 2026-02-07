package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.StatSummary;

@Canonical
class PokemonStat {
    
    Integer baseStat
    
    Integer effort
    
    StatSummary stat
}
