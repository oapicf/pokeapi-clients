package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.EvolutionTriggerName;

@Canonical
class EvolutionTriggerDetail {
    
    Integer id
    
    String name
    
    List<EvolutionTriggerName> names = new ArrayList<>()
    
    List<AbilityDetailPokemonInnerPokemon> pokemonSpecies = new ArrayList<>()
}
