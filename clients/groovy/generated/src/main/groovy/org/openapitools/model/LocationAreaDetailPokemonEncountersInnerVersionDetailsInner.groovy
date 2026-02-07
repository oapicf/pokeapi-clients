package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails;

@Canonical
class LocationAreaDetailPokemonEncountersInnerVersionDetailsInner {
    
    AbilityDetailPokemonInnerPokemon version
    
    Integer maxChance
    
    LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails encounterDetails
}
