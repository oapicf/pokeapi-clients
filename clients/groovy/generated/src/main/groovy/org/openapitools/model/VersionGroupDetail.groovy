package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.VersionSummary;

@Canonical
class VersionGroupDetail {
    
    Integer id
    
    String name
    
    Integer order
    
    GenerationSummary generation
    
    List<AbilityDetailPokemonInnerPokemon> moveLearnMethods = new ArrayList<>()
    
    List<AbilityDetailPokemonInnerPokemon> pokedexes = new ArrayList<>()
    
    List<AbilityDetailPokemonInnerPokemon> regions = new ArrayList<>()
    
    List<VersionSummary> versions = new ArrayList<>()
}
