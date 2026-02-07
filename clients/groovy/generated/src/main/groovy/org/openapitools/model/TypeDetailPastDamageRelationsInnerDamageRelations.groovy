package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;

@Canonical
class TypeDetailPastDamageRelationsInnerDamageRelations {
    
    List<AbilityDetailPokemonInnerPokemon> noDamageTo = new ArrayList<>()
    
    List<AbilityDetailPokemonInnerPokemon> halfDamageTo = new ArrayList<>()
    
    List<AbilityDetailPokemonInnerPokemon> doubleDamageTo = new ArrayList<>()
    
    List<AbilityDetailPokemonInnerPokemon> noDamageFrom = new ArrayList<>()
    
    List<AbilityDetailPokemonInnerPokemon> halfDamageFrom = new ArrayList<>()
    
    List<AbilityDetailPokemonInnerPokemon> doubleDamageFrom = new ArrayList<>()
}
