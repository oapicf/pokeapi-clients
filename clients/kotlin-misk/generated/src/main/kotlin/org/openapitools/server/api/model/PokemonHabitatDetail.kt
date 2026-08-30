package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokemonHabitatName
import org.openapitools.server.api.model.PokemonSpeciesSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonHabitatDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val names: kotlin.collections.List<PokemonHabitatName>,
    val pokemonSpecies: kotlin.collections.List<PokemonSpeciesSummary>
)
