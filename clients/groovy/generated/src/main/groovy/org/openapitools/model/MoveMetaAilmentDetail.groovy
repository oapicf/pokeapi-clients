package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.MoveMetaAilmentName;

@Canonical
class MoveMetaAilmentDetail {
    
    Integer id
    
    String name
    
    List<AbilityDetailPokemonInnerPokemon> moves = new ArrayList<>()
    
    List<MoveMetaAilmentName> names = new ArrayList<>()
}
