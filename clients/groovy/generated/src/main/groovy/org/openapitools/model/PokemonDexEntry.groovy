package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PokedexSummary;

@Canonical
class PokemonDexEntry {
    
    Integer entryNumber
    
    PokedexSummary pokedex
}
