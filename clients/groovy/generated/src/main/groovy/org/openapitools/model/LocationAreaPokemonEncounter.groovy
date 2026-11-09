package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.LocationAreaPokemonEncounterVersion;
import org.openapitools.model.PokemonSummary;

@Canonical
class LocationAreaPokemonEncounter {
    /* The Pokémon being encountered. */
    PokemonSummary pokemon
    /* A list of versions and encounters with Pokémon that might happen in the referenced location area. */
    List<LocationAreaPokemonEncounterVersion> versionDetails = new ArrayList<>()
}
