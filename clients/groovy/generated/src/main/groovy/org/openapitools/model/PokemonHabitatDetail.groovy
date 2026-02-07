package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.PokemonHabitatName;
import org.openapitools.model.PokemonSpeciesSummary;

@Canonical
class PokemonHabitatDetail {
    
    Integer id
    
    String name
    
    List<PokemonHabitatName> names = new ArrayList<>()
    
    List<PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>()
}
