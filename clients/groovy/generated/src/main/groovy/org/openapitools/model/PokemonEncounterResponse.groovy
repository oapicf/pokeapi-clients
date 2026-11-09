package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.LocationAreaSummary;
import org.openapitools.model.PokemonEncounterVersionDetailResponse;

@Canonical
class PokemonEncounterResponse {
    /* The location area the referenced Pokémon can be encountered in. */
    LocationAreaSummary locationArea
    /* A list of versions and encounters with the referenced Pokémon that might happen. */
    List<PokemonEncounterVersionDetailResponse> versionDetails = new ArrayList<>()
}
