package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.PokemonColorName;
import org.openapitools.model.PokemonSpeciesSummary;

@Canonical
class PokemonColorDetail {
    
    Integer id
    
    String name
    
    List<PokemonColorName> names = new ArrayList<>()
    
    List<PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>()
}
