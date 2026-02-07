package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.PokemonDetailAbilitiesInner;

@Canonical
class PokemonDetailPastAbilitiesInner {
    
    List<PokemonDetailAbilitiesInner> abilities = new ArrayList<>()
    
    AbilityDetailPokemonInnerPokemon generation
}
