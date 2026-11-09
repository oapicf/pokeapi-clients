package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.LocationAreaEncounterRate;
import org.openapitools.model.LocationAreaName;
import org.openapitools.model.LocationAreaPokemonEncounter;
import org.openapitools.model.LocationSummary;

@Canonical
class LocationAreaDetail {
    /* The identifier for this resource. */
    Integer id
    /* The name for this resource. */
    String name
    /* The internal id of an API resource within game data. */
    Integer gameIndex
    /* A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game. */
    List<LocationAreaEncounterRate> encounterMethodRates = new ArrayList<>()
    /* The region this location area can be found in. */
    LocationSummary location
    /* The name of this resource listed in different languages. */
    List<LocationAreaName> names = new ArrayList<>()
    /* A list of Pokémon that can be encountered in this area along with version specific details about the encounter. */
    List<LocationAreaPokemonEncounter> pokemonEncounters = new ArrayList<>()
}
