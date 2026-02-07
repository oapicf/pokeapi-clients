package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.Experience;
import org.openapitools.model.GrowthRateDescription;
import org.openapitools.model.PokemonSpeciesSummary;

@Canonical
class GrowthRateDetail {
    
    Integer id
    
    String name
    
    String formula
    
    List<GrowthRateDescription> descriptions = new ArrayList<>()
    
    List<Experience> levels = new ArrayList<>()
    
    List<PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>()
}
