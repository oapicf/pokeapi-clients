package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.MoveMetaCategoryDescription;

@Canonical
class MoveMetaCategoryDetail {
    
    Integer id
    
    String name
    
    List<MoveMetaCategoryDescription> descriptions = new ArrayList<>()
    
    List<AbilityDetailPokemonInnerPokemon> moves = new ArrayList<>()
}
