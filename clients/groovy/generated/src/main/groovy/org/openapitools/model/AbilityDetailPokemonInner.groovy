package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;

@Canonical
class AbilityDetailPokemonInner {
    
    Boolean isHidden
    
    Integer slot
    
    AbilityDetailPokemonInnerPokemon pokemon
}
