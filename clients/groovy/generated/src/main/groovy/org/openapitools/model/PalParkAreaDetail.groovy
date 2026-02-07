package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.PalParkAreaDetailPokemonEncountersInner;
import org.openapitools.model.PalParkAreaName;

@Canonical
class PalParkAreaDetail {
    
    Integer id
    
    String name
    
    List<PalParkAreaName> names = new ArrayList<>()
    
    List<PalParkAreaDetailPokemonEncountersInner> pokemonEncounters = new ArrayList<>()
}
