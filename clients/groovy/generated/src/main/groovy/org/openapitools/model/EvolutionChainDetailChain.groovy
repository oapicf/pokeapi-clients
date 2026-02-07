package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.EvolutionChainDetailChainEvolvesToInner;

@Canonical
class EvolutionChainDetailChain {
    
    List<Object> evolutionDetails = new ArrayList<>()
    
    List<EvolutionChainDetailChainEvolvesToInner> evolvesTo = new ArrayList<>()
    
    Boolean isBaby
    
    AbilityDetailPokemonInnerPokemon species
}
