package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AbilitySummary;
import org.openapitools.model.GenerationName;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.PokemonSpeciesSummary;
import org.openapitools.model.RegionSummary;
import org.openapitools.model.TypeSummary;
import org.openapitools.model.VersionGroupSummary;

@Canonical
class GenerationDetail {
    
    Integer id
    
    String name
    
    List<AbilitySummary> abilities = new ArrayList<>()
    
    RegionSummary mainRegion
    
    List<MoveSummary> moves = new ArrayList<>()
    
    List<GenerationName> names = new ArrayList<>()
    
    List<PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>()
    
    List<TypeSummary> types = new ArrayList<>()
    
    List<VersionGroupSummary> versionGroups = new ArrayList<>()
}
