package org.openapitools.server.api.model

import org.openapitools.server.api.model.LocationAreaPokemonEncounterVersion
import org.openapitools.server.api.model.PokemonSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LocationAreaPokemonEncounter(
    /** The Pokémon being encountered. */
    val pokemon: PokemonSummary,
    /** A list of versions and encounters with Pokémon that might happen in the referenced location area. */
    val versionDetails: kotlin.collections.List<LocationAreaPokemonEncounterVersion>
)
