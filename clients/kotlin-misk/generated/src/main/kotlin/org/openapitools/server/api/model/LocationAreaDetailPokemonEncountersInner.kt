package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.server.api.model.LocationAreaDetailPokemonEncountersInnerVersionDetailsInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LocationAreaDetailPokemonEncountersInner(
    val pokemon: AbilityDetailPokemonInnerPokemon,
    val versionDetails: kotlin.collections.List<LocationAreaDetailPokemonEncountersInnerVersionDetailsInner>
)
