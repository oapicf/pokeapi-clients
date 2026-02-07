package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInnerLocationArea;
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner;

@Canonical
class PokemonEncountersRetrieve200ResponseInner {
    
    PokemonEncountersRetrieve200ResponseInnerLocationArea locationArea
    
    List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner> versionDetails = new ArrayList<>()
}
