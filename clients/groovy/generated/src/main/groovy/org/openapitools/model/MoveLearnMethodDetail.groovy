package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.MoveLearnMethodDescription;
import org.openapitools.model.MoveLearnMethodName;

@Canonical
class MoveLearnMethodDetail {
    
    Integer id
    
    String name
    
    List<MoveLearnMethodName> names = new ArrayList<>()
    
    List<MoveLearnMethodDescription> descriptions = new ArrayList<>()
    
    List<AbilityDetailPokemonInnerPokemon> versionGroups = new ArrayList<>()
}
