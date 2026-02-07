package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.LocationSummary;
import org.openapitools.model.PokedexSummary;
import org.openapitools.model.RegionName;

@Canonical
class RegionDetail {
    
    Integer id
    
    String name
    
    List<LocationSummary> locations = new ArrayList<>()
    
    GenerationSummary mainGeneration
    
    List<RegionName> names = new ArrayList<>()
    
    List<PokedexSummary> pokedexes = new ArrayList<>()
    
    List<AbilityDetailPokemonInnerPokemon> versionGroups = new ArrayList<>()
}
