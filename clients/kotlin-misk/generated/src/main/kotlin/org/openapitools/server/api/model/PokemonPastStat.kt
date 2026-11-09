package org.openapitools.server.api.model

import org.openapitools.server.api.model.GenerationSummary
import org.openapitools.server.api.model.PokemonStat
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonPastStat(
    /** The last generation in which the referenced pokémon had the listed stats. */
    val generation: GenerationSummary,
    /** The stat the Pokémon had up to and including the listed generation. */
    val stats: kotlin.collections.List<PokemonStat>
)
