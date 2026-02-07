package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.LocationAreaDetailEncounterMethodRatesInner;
import org.openapitools.model.LocationAreaDetailPokemonEncountersInner;
import org.openapitools.model.LocationAreaName;
import org.openapitools.model.LocationSummary;

@Canonical
class LocationAreaDetail {
    
    Integer id
    
    String name
    
    Integer gameIndex
    
    List<LocationAreaDetailEncounterMethodRatesInner> encounterMethodRates = new ArrayList<>()
    
    LocationSummary location
    
    List<LocationAreaName> names = new ArrayList<>()
    
    List<LocationAreaDetailPokemonEncountersInner> pokemonEncounters = new ArrayList<>()
}
