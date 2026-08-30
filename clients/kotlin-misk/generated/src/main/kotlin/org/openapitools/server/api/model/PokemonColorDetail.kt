package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokemonColorName
import org.openapitools.server.api.model.PokemonSpeciesSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonColorDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val names: kotlin.collections.List<PokemonColorName>,
    val pokemonSpecies: kotlin.collections.List<PokemonSpeciesSummary>
)
