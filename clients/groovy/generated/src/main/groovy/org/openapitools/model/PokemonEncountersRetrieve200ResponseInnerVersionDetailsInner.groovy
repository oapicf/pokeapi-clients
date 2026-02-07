package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner;
import org.openapitools.model.PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion;

@Canonical
class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner {
    
    List<PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner> encounterDetails = new ArrayList<>()
    
    BigDecimal maxChance
    
    PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion version
}
