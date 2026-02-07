package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender;

@Canonical
class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner {
    
    EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender gender
    
    EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender heldItem
    
    EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender item
    
    Object knownMove = null
    
    Object knownMoveType = null
    
    EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender location
    
    Integer minAffection
    
    Integer minBeauty
    
    Integer minHappiness
    
    Integer minLevel
    
    Boolean needsOverworldRain
    
    String partySpecies
    
    String partyType
    
    String relativePhysicalStats
    
    String timeOfDay
    
    String tradeSpecies
    
    AbilityDetailPokemonInnerPokemon trigger
    
    Boolean turnUpsideDown
}
