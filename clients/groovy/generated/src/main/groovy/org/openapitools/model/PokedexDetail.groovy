package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.PokedexDescription;
import org.openapitools.model.PokedexDetailPokemonEntriesInner;
import org.openapitools.model.PokedexName;
import org.openapitools.model.RegionSummary;

@Canonical
class PokedexDetail {
    
    Integer id
    
    String name
    
    Boolean isMainSeries
    
    List<PokedexDescription> descriptions = new ArrayList<>()
    
    List<PokedexName> names = new ArrayList<>()
    
    List<PokedexDetailPokemonEntriesInner> pokemonEntries = new ArrayList<>()
    
    RegionSummary region
    
    List<AbilityDetailPokemonInnerPokemon> versionGroups = new ArrayList<>()
}
