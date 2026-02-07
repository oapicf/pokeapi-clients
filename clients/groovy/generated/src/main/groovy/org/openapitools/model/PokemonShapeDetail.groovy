package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.PokemonShapeDetailAwesomeNamesInner;
import org.openapitools.model.PokemonShapeDetailNamesInner;
import org.openapitools.model.PokemonSpeciesSummary;

@Canonical
class PokemonShapeDetail {
    
    Integer id
    
    String name
    
    List<PokemonShapeDetailAwesomeNamesInner> awesomeNames = new ArrayList<>()
    
    List<PokemonShapeDetailNamesInner> names = new ArrayList<>()
    
    List<PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>()
}
