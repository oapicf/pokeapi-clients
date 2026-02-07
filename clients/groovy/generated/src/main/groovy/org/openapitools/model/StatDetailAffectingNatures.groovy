package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;

@Canonical
class StatDetailAffectingNatures {
    
    List<AbilityDetailPokemonInnerPokemon> increase = new ArrayList<>()
    
    List<AbilityDetailPokemonInnerPokemon> decrease = new ArrayList<>()
}
