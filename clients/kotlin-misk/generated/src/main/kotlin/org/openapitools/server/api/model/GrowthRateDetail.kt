package org.openapitools.server.api.model

import org.openapitools.server.api.model.Experience
import org.openapitools.server.api.model.GrowthRateDescription
import org.openapitools.server.api.model.PokemonSpeciesSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GrowthRateDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val formula: kotlin.String,
    val descriptions: kotlin.collections.List<GrowthRateDescription>,
    val levels: kotlin.collections.List<Experience>,
    val pokemonSpecies: kotlin.collections.List<PokemonSpeciesSummary>
)
