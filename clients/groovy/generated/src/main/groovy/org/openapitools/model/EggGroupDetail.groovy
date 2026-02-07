package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.EggGroupDetailPokemonSpeciesInner;
import org.openapitools.model.EggGroupName;

@Canonical
class EggGroupDetail {
    
    Integer id
    
    String name
    
    List<EggGroupName> names = new ArrayList<>()
    
    List<EggGroupDetailPokemonSpeciesInner> pokemonSpecies = new ArrayList<>()
}
