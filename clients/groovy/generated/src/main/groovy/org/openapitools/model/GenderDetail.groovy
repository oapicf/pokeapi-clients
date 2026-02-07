package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.GenderDetailPokemonSpeciesDetailsInner;

@Canonical
class GenderDetail {
    
    Integer id
    
    String name
    
    List<GenderDetailPokemonSpeciesDetailsInner> pokemonSpeciesDetails = new ArrayList<>()
    
    List<AbilityDetailPokemonInnerPokemon> requiredForEvolution = new ArrayList<>()
}
