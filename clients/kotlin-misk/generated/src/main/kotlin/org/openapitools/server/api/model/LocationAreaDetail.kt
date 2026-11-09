package org.openapitools.server.api.model

import org.openapitools.server.api.model.LocationAreaEncounterRate
import org.openapitools.server.api.model.LocationAreaName
import org.openapitools.server.api.model.LocationAreaPokemonEncounter
import org.openapitools.server.api.model.LocationSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LocationAreaDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The internal id of an API resource within game data. */
    val gameIndex: kotlin.Int,
    /** A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game. */
    val encounterMethodRates: kotlin.collections.List<LocationAreaEncounterRate>,
    /** The region this location area can be found in. */
    val location: LocationSummary,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<LocationAreaName>,
    /** A list of Pokémon that can be encountered in this area along with version specific details about the encounter. */
    val pokemonEncounters: kotlin.collections.List<LocationAreaPokemonEncounter>
)
